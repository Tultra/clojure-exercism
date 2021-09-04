(ns exercises.bob-response-test

(:require [clojure.test :refer [deftest is]]
            exercises.bob-response))

(deftest responds-to-something
  (is (= "Whatever." (exercises.bob-response/response-for "Tom-ay-to, tom-aaaah-to."))))
(deftest responds-to-shouts
  (is (= "Whoa, chill out!" (exercises.bob-response/response-for "WATCH OUT!"))))
(deftest responds-to-shouting-gibberish
  (is (= "Whoa, chill out!" (exercises.bob-response/response-for "FCECDFCAAB"))))
(deftest responds-to-questions
  (is (= "Sure."
         (exercises.bob-response/response-for "Does this cryogenic chamber make me look fat?"))))
(deftest responds-to-numeric-question
  (is (= "Sure." (exercises.bob-response/response-for "You are, what, like 15?"))))
(deftest responds-to-gibberish-question
  (is (= "Sure." (exercises.bob-response/response-for "fffbbcbeab?"))))
(deftest responds-to-forceful-talking
  (is (= "Whatever." (exercises.bob-response/response-for "Let's go make out behind the gym!"))))
(deftest responds-to-acronyms
  (is (= "Whatever."
         (exercises.bob-response/response-for "It's OK if you don't want to go to the DMV."))))
(deftest responds-to-forceful-questions
  (is (= "Calm down, I know what I'm doing!"
         (exercises.bob-response/response-for "WHAT THE HELL WERE YOU THINKING?"))))
(deftest responds-to-shouting-numbers
  (is (= "Whoa, chill out!" (exercises.bob-response/response-for "1, 2, 3 GO!"))))
(deftest responds-to-no-letters
  (is (= "Whatever." (exercises.bob-response/response-for "1, 2, 3"))))
(deftest responds-to-question-with-no-letters
  (is (= "Sure." (exercises.bob-response/response-for "4?"))))
(deftest responds-to-shouting-with-special-characters
  (is (= "Whoa, chill out!"
         (exercises.bob-response/response-for "ZOMG THE %^*@#$(*^ ZOMBIES ARE COMING!!11!!1!"))))
(deftest responds-to-shouting-with-no-exclamation-mark
  (is (= "Whoa, chill out!" (exercises.bob-response/response-for "I HATE THE DMV"))))
(deftest responds-to-statement-containing-question-mark
  (is (= "Whatever." (exercises.bob-response/response-for "Ending with ? means a question."))))
(deftest responds-to-non-letters-with-question
  (is (= "Sure." (exercises.bob-response/response-for ":) ?"))))
(deftest responds-to-prattling-on
  (is (= "Sure." (exercises.bob-response/response-for "Wait! Hang on. Are you going to be OK?"))))
(deftest responds-to-silence
  (is (= "Fine. Be that way!" (exercises.bob-response/response-for ""))))
(deftest responds-to-prolonged-silence
  (is (= "Fine. Be that way!" (exercises.bob-response/response-for "    "))))
(deftest responds-to-alternate-silence
  (is (= "Fine. Be that way!" (exercises.bob-response/response-for "\t\t\t\t\t\t\t\t\t\t"))))
(deftest responds-to-multiple-line-question
  (is (= "Whatever."
         (exercises.bob-response/response-for "\nDoes this cryogenic chamber make me look fat?\nNo."))))
(deftest responds-to-starting-with-whitespace
  (is (= "Whatever." (exercises.bob-response/response-for "         hmmmmmmm..."))))
(deftest responds-to-ending-with-whitespace
  (is (= "Sure." (exercises.bob-response/response-for "Okay if like my  spacebar  quite a bit?   "))))
(deftest responds-to-other-whitespace
  (is (= "Fine. Be that way!" (exercises.bob-response/response-for "\n\r \t"))))
(deftest responds-to-non-question-ending-with-whitespace
  (is (= "Whatever."
         (exercises.bob-response/response-for "This is a statement ending with whitespace      "))))
