(def memory-db (atom {}))

(defn read-db [] @memory-db)

(defn write-db [new-db] (reset! memory-db new-db))

(defn create-table
  "Create table
  {:table-1 {:data [] :indexes {}} :table-2 {:data [] :indexes {}}"
  [table-name]
  (let [db (read-db)]
    (write-db (assoc db table-name {:data [] :indexes {}}))))

(defn drop-table
  [table-name]
  (let [db (read-db)]
    (write-db (dissoc db table-name))))

(defn insert
  "Insert"
  [table-name record id-key]
  (let [db (read-db)
        new-db (update-in db [table-name :data] conj record)
        index (- (count (get-in new-db [table-name :data])) 1)]
    (write-db
     (update-in new-db [table-name :indexes id-key] assoc (id-key record) index))))
