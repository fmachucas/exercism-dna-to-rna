(ns rna-transcription-test
  (:require [expectations :refer :all]
            [expectations.clojure.test :refer [defexpect]]
            rna-transcription))

(defexpect transcribes-cytosine-to-guanine
  (expect "G" (rna-transcription/to-rna "C")))

(defexpect transcribes-guanine-to-cytosine
  (expect "C" (rna-transcription/to-rna "G")))

(defexpect transcribes-adenine-to-uracil
  (expect "U" (rna-transcription/to-rna "A")))

(defexpect it-transcribes-thymine-to-adenine
  (expect "A" (rna-transcription/to-rna "T")))

(defexpect it-transcribes-all-nucleotides
  (expect "UGCACCAGAAUU" (rna-transcription/to-rna "ACGTGGTCTTAA")))

(defexpect it-validates-dna-strands
  (expect AssertionError (rna-transcription/to-rna "XCGFGGTDTTAA")))
