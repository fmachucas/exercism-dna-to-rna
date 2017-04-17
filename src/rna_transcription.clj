(ns rna-transcription)

(defn dna-to-rna [nucleotide]
   (cond
    (= nucleotide \C) \G
    (= nucleotide \G) \C
    (= nucleotide \A) \U
    (= nucleotide \T) \A
    :else (throw (AssertionError. "error happened"))))
(defn to-rna [dna]
  (apply str (map dna-to-rna dna)))
