# Deterministic Finite Automaton (DFA) Simulator in Java
## Overview
This Java program serves as a Deterministic Finite Automaton (DFA) simulator, allowing users to define and test DFAs. DFAs are mathematical models of computation commonly used to recognize regular languages. This program provides a flexible framework for users to specify the DFA's characteristics, such as the number of states, input alphabets, transition table, initial state, and final states. Users can then input strings to check whether the DFA accepts or rejects them.

## Features
- User-Defined DFA: Specify the DFA's properties, including the number of states, input alphabets, transition table, initial state, and final states.

- String Evaluation: Test input strings to determine whether the DFA accepts or rejects them based on the specified rules.

- Customizable Input: The program prompts users to input their DFA specifications in a structured manner, making it easy to define different DFAs.

## Input DFA Specifications:
- Follow the prompts to input the number of states, input alphabets, transition table, initial state, and final states.

## Test Strings:
- After defining the DFA, input strings to test whether the DFA accepts or rejects them.

## View Results:
- The program will display whether each input string is accepted or rejected by the DFA and will also show the transition path.

## Example
Suppose we want to create a DFA that recognizes strings over the alphabet {0, 1} where the number of 0s is even. Here's how we would define the DFA:

- Number of states: 2

- Input alphabets: {0, 1}

- Transition table:
- ![image](https://github.com/vaibhavbidkar123/Deterministic-Finite-Automata/assets/142525417/ed8dd4fe-2a99-4733-b5e9-dbc50d29eaae)
- Initial state: q0
- Final state: q0

After defining this DFA, we can test it with strings like "0011" (accepted) or "010101" (rejected).
