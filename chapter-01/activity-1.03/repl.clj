(defn meditate
  "Measure the calmess level with and"
  [s calmess-level]
  (println "Clojure Meditate v2.0")
  (if (< calmess-level 5)
    (str (clojure.string/upper-case s) ", I TELL YA!")
    (if (and (>= calmess-level 5) (<= calmess-level 9))
      (clojure.string/capitalize s)
      (if (= calmess-level 10)
        (clojure.string/reverse s)))))

(defn meditate
  "Measure the calmess level no and"
  [s calmess-level]
  (println "Clojure Meditate v2.0")
  (if (< calmess-level 5)
    (str (clojure.string/upper-case s) ", I TELL YA!")
    (if (<= 5 calmess-level 9)
      (clojure.string/capitalize s)
      (if (= calmess-level 10)
        (clojure.string/reverse s)))))

(defn meditate
  "Measure the calmess level with cond"
  [s calmess-level]
  (println "Clojure Meditate v2.0")
  (cond
    (< calmess-level 5) (str (clojure.string/upper-case s) ", I TELL YA!")
    (<= 5 calmess-level 9) (clojure.string/capitalize s)
    (= calmess-level 10)(clojure.string/reverse s)))
