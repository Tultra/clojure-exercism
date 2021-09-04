(ns exercises.complex-nums)

(defn real [[a b]] ;; <- arglist goes here
  ;; your code goes here
  a
  )

(defn imaginary [[a b]] ;; <- arglist goes here
  ;; your code goes here
  b
)

(defn abs [[a b]] ;; <- arglist goes here
  ;; your code goes here
  (Math/sqrt (+ (* a a) (* b b)))
)

(defn conjugate [[a b]] ;; <- arglist goes here
  ;; your code goes here
  [a (- 0 b)]
)

(defn add [[a b] [c d]] ;; <- arglist goes here
  ;; your code goes here
  [(+ a c) (+ b d)]
)

(defn sub [[a b] [c d]] ;; <- arglist goes here
  ;; your code goes here
  [(- a c) (- b d)]
)

(defn mul [[a b] [c d]] ;; <- arglist goes here
  ;; your code goes here
  [(-(* a c)(* b d)) (+ (* b c) (* a d))]
)

(defn div [[a b] [c d]] ;; <- arglist goes here
  ;; your code goes here
  (let [divisor (+ (Math/pow c 2) (Math/pow d 2))
        r (/ (+ (* a c) (* b d)) divisor)
        i (/ (- (* b c) (* a d)) divisor)]
    [r i]))

(div [1 2] [3 4])
