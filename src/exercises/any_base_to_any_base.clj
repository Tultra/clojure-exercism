(ns exercises.any-base-to-any-base)

(defn deci-to-any-base [base deci]
  (when (not= (int deci) 0)
    ;; lazy-seq adiciona elementos (cons) a uma sequencia até o fim da recursão
    (lazy-seq
     (cons (int (mod deci base))
           (deci-to-any-base base (Math/floor (/ deci base)))))))

(defn to-deci [base coll]
  (int (reduce + (map-indexed #(* %2 (Math/pow base %1) ) coll))))

(defn neg-values? [a coll b]
  (if (or (<= a 1)
          (<= b 1)
          (some #(< % 0) coll))
          true
          nil))

(defn conform-to-base? [a coll]
  (if (and (some #(>= % a) coll)
           (not-empty coll))
    true
    nil))

(defn convert [a coll b] ;; <- arglist goes here
  ;; your code goes here
  (if (or (neg-values? a coll b)
          (conform-to-base? a coll))
  nil
  (let [x (to-deci a (reverse coll))
    y (if (> x 0) (deci-to-any-base b x) 0)]
    (if (not= 0 y) (reverse y) 
      (if (empty? coll) '() '(0))))))

