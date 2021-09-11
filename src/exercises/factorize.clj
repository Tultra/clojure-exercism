(ns exercises.factorize)

;; NOT AN EXERCISM EXERCISE

(defn factors
  ;; factorizes an integer n
  ;; loop algorithm can be improved. large numbers take a long time to factorize.
  ([n]
   (let [denom (for [x (range 2 (+ n 1))
                     :when (= (mod n x) 0)]
                 x)
         x ((vec denom) 0)
         factors-list []]
     (cond (= x n) (conj factors-list x)
           :else (factors (/ n x) (conj factors-list x)))))

  ([n factors-list]
   (let [denom (for [x (range 2 (+ n 1))
                     :when (= (mod n x) 0)]
                 x)
         x ((vec denom) 0)]

     (cond (= x n) (conj factors-list x)
           :else (factors (/ n x) (conj factors-list x))))))

;; ((vec (for [x (range 8) :when (and (prime? x) (= (mod 8 x) 0) (> x 1))] x)) 0)
;; (factors 244294211)
;; (type [2 2])
;; (type (conj (vec (for [x (range 8) :when (and (prime? x) (= (mod 8 x) 0) (> x 1))] x)) 2))
;; (conj 2 [2 4])
