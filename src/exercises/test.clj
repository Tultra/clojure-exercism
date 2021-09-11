(ns exercises.test)

(->> (int \0)
     (- (int \1))
     (- 8)
     (* 8))

(do (def x "hello world")
    (def y (concat x ", Thiago"))
    (println y)
    y)
