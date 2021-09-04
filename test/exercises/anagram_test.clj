(ns exercises.anagram-test
  (:require [clojure.test :refer [deftest is]]
            exercises.anagram))

(deftest no-matches
  (is (= []
         (exercises.anagram/anagrams-for "diaper" ["hello" "world" "zombies" "pants"]))))
(deftest detect-simple-exercises.anagram
  (is (= ["tan"] (exercises.anagram/anagrams-for "ant" ["tan" "stand" "at"]))))
(deftest does-not-confuse-different-duplicates
  (is (= [] (exercises.anagram/anagrams-for "galea" ["eagle"]))))
(deftest eliminate-exercises.anagram-subsets
  (is (= [] (exercises.anagram/anagrams-for "good" ["dog" "goody"]))))
(deftest detect-exercises.anagram
  (is (= ["inlets"]
         (let [coll ["enlists" "google" "inlets" "banana"]]
           (exercises.anagram/anagrams-for "listen" coll)))))
(deftest multiple-exercises.anagrams
  (is (= ["gallery" "regally" "largely"]
         (let [coll ["gallery" "ballerina" "regally"
                     "clergy"  "largely"   "leading"]]
           (exercises.anagram/anagrams-for "allergy" coll)))))
(deftest case-insensitive-exercises.anagrams
  (is (= ["Carthorse"]
         (let [coll ["cashregister" "Carthorse" "radishes"]]
           (exercises.anagram/anagrams-for "Orchestra" coll)))))
(deftest word-is-not-own-exercises.anagram
  (is (= [] (exercises.anagram/anagrams-for "banana" ["banana"]))))
(deftest capital-word-is-not-own-exercises.anagram
  (is (= [] (exercises.anagram/anagrams-for "BANANA" ["banana"]))))
