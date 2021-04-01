(ns )

(def base-co2 382)
(def base-year 2006)

(defn co2-estimate
"Estimate the CO2 level"
[year]
(let [year-diff (- year base-year)]
(+ base-co2 (* 2 year-diff))))

(co2-estimate 2050)
