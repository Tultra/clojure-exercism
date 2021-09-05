(ns exercises.nucleotide-count)

(defn count-of-nucleotide-in-strand [nucleotide strand]
  (let [nucleotide (str nucleotide)]
    (cond (not (.contains "AGCT" nucleotide)) (throw (Exception. "invalid letter"))
          (= 0 (count strand)) 0
          :else (reduce +(map #(if (= nucleotide (str %)) 1 0) strand))))
)

(defn nucleotide-counts [strand]
  (let [nucleotides (distinct(concat "AGCT" strand))
        freq nil]
       (apply merge (map #(assoc freq % (count-of-nucleotide-in-strand % strand)) nucleotides))))
    ;; (for [l nucleotides]
    ;;   (assoc freq (str l) (count-of-nucleotide-in-strand (str l) strand)))))

;; (count-of-nucleotide-in-strand "GAAAATAC")

(nucleotide-counts "AAAAGGGTT")

;; (distinct "GAAAATAC")

;; (distinct (concat "AGCT" "AAGGGGGGTTTTXXXX"))
