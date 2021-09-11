(ns exercises.cars-assemble)


;; Exercism is not accepting this as an answer, even though the test goes through without errors
;; There's probably some checking being made on the background that is holding the solution from passing
;; but either way, it delivers the desirable output.

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (cond (= speed 0) 0
        (and (>= speed 1) (<= speed 4)) (* speed 221)
        (and (>= speed 5) (<= speed 8)) (* 0.9 (* speed 221))
        (= speed 9) (* 0.8 (* speed 221))
        :else (* 0.77 (* speed 221))))

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (let [x (production-rate speed)]
    (int (Math/floor (/ x 60)))))
