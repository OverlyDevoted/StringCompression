# Sourcery Academy for Full-stack BONUS

## Task

The goal is to create a method that compress a string by reducing sequences of repeating characters into the character
followed by the number of times it repeats consecutively.

**Task**: In your own words, describe the key parts of your solution and the reasoning behind your approach. You can use
comments in your code to explain your thought process.

**Input**: The input string will contain only lowercase letters. It might be empty.

**Output** :

    "aaabb" → "a3b2"
    "abc" → "a1b1c1"
    "" → ""

**Optionally**: Add decompressing method, which reconstructs the original string.

**Input**: string will contain characters followed by a number indicating how many times the character repeats
consecutively.

**Output**:

    "a3b2" → "aaabb"
    "a1b1c1" → "abc"
    "" → ""

## Result

Project was built with plain Java using `JDK 23.0.2`.

The problem in this task is a classic string handling problem that teaches compression on a basic level.

The task basically asks to implement [run-length encoding](https://en.wikipedia.org/wiki/Run-length_encoding) algorithm. Traditionally the occurrences may be postfixed or prefixed and in this case the task asked to postfix the occurrences. And also the algorithm for decompressing was implemented.

## Compress algorithm analysis

The time for the implemented algorithm is `O(n)`. Time complexity is linear because the algorithm iterates through each symbol in a given string.

While space complexity is more elaborate. In **worst-case** scenarios (`O(n)`) the input will look something like this: `"abcde...z"` because the algorithm will have to allocate the same amount of memory as `n` of characters in a string. Average-case will average out to `O(n)` as some inputs may compress more or less. **Best-case** is when the whole passed string is the same symbol, it means the whole string will get compressed and the amount of appended digits to result may vary it averages out to `O(1)` - constant space complexity. 

## Decompress

The time complexity is the same as compressing algorithm. While space is quite the opposite for different inputs. The more compressed - the more spaces is needed. For the best case the space complexity will be O(n), average too, but worst `O(2^n)`. So the input for the worst case input would look something like this. E.g.: `"a9"`, `"a99"`, `"a999"` and so on. `n = 1` would generate 9 symbols, `n = 2` - 99, `n = 3` - 999 and so on. This means that the space complexity with worst case scenarios grows exponentially

## Solution rationale

Check for comments in code for a more detailed explanation. The task was done without looking up existing algorithms. It
was my own solution to the problem. The problem could've been solved with streams but I did not like the algorithms I was coming up with as they seemed less legible and readable, so I opted for a little more readable approach.