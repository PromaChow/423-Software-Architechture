# Software Engineering Structure Analysis Assignment (LLM vs Human Code)

## Overview

This assignment evaluates how large language models (LLMs) affect software structure compared to real-world, pre-LLM software systems.

Each student must complete analysing 2 Github projects, selecting **one task from each of the five categories** below.

For each task, you will compare:
- A real GitHub repository (human-evolved pre-LLM code)
- An LLM-generated reconstruction of the same system

The focus is on **software structure**, not just functional correctness.

---

# Common Requirements (Applies to All Tasks)

## GitHub Repository Selection Rules

For every task, select **2 GitHub repositories** that satisfy all conditions below:

### 1. Language Requirement
- Python, Java, or TypeScript only

### 2. Size Requirement
- At least 10,000 lines of code OR
- At least 500 commits

### 3. History Requirement
- First commit before 2020
- At least 2 years of active development

### 4. Structure Requirement
Must contain at least two of the following folders:
- `controller`
- `service`
- `model`
- `repository`
- `src`
- `core`
- `utils`

### 5. System Type Requirement
Must be a real software system:
- Web backend
- API system
- Multi-module application
- Framework-based project (e.g., Django, Spring, Express)

### Not Allowed
- Toy projects (TODO apps, calculators)
- Single-file projects
- Tutorial/demo repositories
- Notebook-only projects

---

# TASK 1: Architecture Structure Preservation

## Objective
Evaluate whether LLMs preserve system-level architecture when reconstructing software.

## Steps
1. Select a repository with layered architecture (controller/service/repository).
2. Extract a pre-LLM version of the system.
3. Use an LLM to reconstruct the system from a functional description.
4. Compare architecture between original and LLM version.

## What to Analyze
- Do architectural layers still exist?
- Are responsibilities properly separated?
- Are modules mixed or cleanly structured?

## Metrics
- Layer Preservation Score
- Module Separation Index
- Cross-layer Violation Count

---

# TASK 2: Design Pattern Preservation

## Objective
Evaluate whether LLMs preserve object-oriented design patterns.

## Steps
1. Select a repository that uses at least two design patterns.
2. Identify patterns in the original system.
3. Reconstruct the system using an LLM.
4. Check whether patterns are preserved.

## Design Patterns to Look For
- Factory
- Strategy
- Observer
- Singleton
- Decorator

## Metrics
- Pattern Preservation Rate
- Pattern Collapse Rate
- Abstraction Loss Score

---

# TASK 3: SOLID Principles Compliance

## Objective
Evaluate whether LLM-generated code follows SOLID principles.

## Steps
1. Select a multi-class system.
2. Analyze SOLID compliance in original code.
3. Generate equivalent system using an LLM.
4. Compare violations.

## Metrics
- SOLID Violation Count
- Dependency Inversion Score
- Responsibility Entanglement Index

---

# TASK 4: Code Smell Structure Analysis

## Objective
Evaluate whether LLMs introduce or remove structural code smells.

## Steps
1. Select a medium/large system.
2. Identify code smells in original system.
3. Reconstruct system using LLM.
4. Compare smell distribution.

## Metrics
- Code Smell Density
- God Module Ratio
- Duplication Spread Index

---

# TASK 5: Dependency Structure Analysis

## Objective
Analyze how LLMs change system dependency structure.

## Steps
1. Extract dependency graph from original system.
2. Reconstruct system using LLM.
3. Build dependency graph for LLM output.
4. Compare both graphs.

## Metrics
- Graph Edit Distance
- Cycle Count
- Centralization Shift Score

---

# Final Submission Requirements

For each task, submit:

- Selected GitHub repositories (links)
- Pre-LLM system snapshot
- LLM prompt used
- LLM-generated code
- Analysis report
- Metric calculations
- Final comparison summary

---

# Expected Learning Outcome

After completing this assignment, students will understand:

- How real-world software systems are structurally organized
- How design principles degrade or change under LLM generation
- Differences between functional correctness and architectural correctness
- Why software architecture is harder to preserve than code functionality

---

# Scoring Rubric

**Total: 10 marks**

| # | Component | Marks |
|---|-----------|-------|
| 1 | Repository Selection & Justification | 1 |
| 2 | Pre-LLM System Snapshot & Task Analysis | 2 |
| 3 | LLM Prompt Design & Iterative Refinement | 2 |
| 4 | LLM-Generated Code Quality | 1 |
| 5 | Metric Calculation & Accuracy | 2 |
| 6 | Comparative Analysis & Reflection | 2 |
| **Total** | | **10** |

---

## 1. Repository Selection & Justification (1 mark)

| Score | Descriptor |
|-------|------------|
| 1.0 | Both repositories satisfy all 5 rules (language, size, history, structure, system type); selection justified with evidence (commit count, LOC, folder listing) |
| 0.5 | Both repositories selected but one or more rules weakly satisfied; justification present but lacks evidence |
| 0 | Repositories do not meet requirements, or no justification provided |

---

## 2. Pre-LLM System Snapshot & Task Analysis (2 marks)

| Score | Descriptor |
|-------|------------|
| 2.0 | Snapshot clearly extracted from a pre-2020 commit; task-relevant structures (layers / patterns / smells / dependencies) correctly identified and documented with evidence |
| 1.0 | Snapshot present but not verifiably pre-LLM era, or task analysis is superficial with missing evidence |
| 0 | No snapshot provided, or analysis does not relate to the chosen task |

---

## 3. LLM Prompt Design & Iterative Refinement (2 marks)

> **This component is weighted double to reward deliberate prompt engineering.**

| Score | Descriptor |
|-------|------------|
| 2.0 | At least **3 prompt iterations** submitted; each iteration shows a clear reason for the change (e.g., missing layer, wrong pattern, poor separation); final prompt produces structurally meaningful output; refinement log or commentary included |
| 1.5 | At least **2 prompt iterations** with partial reasoning; improvement between versions is visible but not fully explained |
| 1.0 | Only 2 prompts submitted with minimal difference or explanation; refinement appears superficial |
| 0.5 | Only 1 prompt submitted with a brief note that it was revised |
| 0 | Single prompt only; no evidence of any iterative refinement |

> **What counts as a valid iteration:**
> - Changing the level of architectural detail in the prompt
> - Adding or removing constraints (e.g., "use a Factory pattern", "separate service from controller")
> - Switching from a high-level description to a component-by-component instruction
> - Responding to a structural flaw observed in the previous output

---

## 4. LLM-Generated Code Quality (1 mark)

| Score | Descriptor |
|-------|------------|
| 1.0 | Generated code is complete, runnable, and structurally non-trivial (multiple files/classes, not a single-file dump) |
| 0.5 | Code is partially complete or has minor structural issues (e.g., all logic in one file despite prompting for layers) |
| 0 | Code is a skeleton, pseudo-code only, or does not correspond to the chosen task |

---

## 5. Metric Calculation & Accuracy (2 marks)

| Score | Descriptor |
|-------|------------|
| 2.0 | All task-required metrics computed correctly for both $H$ and $L$; formulas applied as defined in the Appendix; values are supported by evidence (code counts, graph screenshots, tool output) |
| 1.0 | Most metrics computed but one contains a formula error or unsupported value; evidence partially provided |
| 0 | Metrics are missing, incorrectly applied, or consist of estimates with no supporting evidence |

---

## 6. Comparative Analysis & Reflection (2 marks)

| Score | Descriptor |
|-------|------------|
| 2.0 | Comparison directly interprets metric differences between $H$ and $L$; identifies at least one structural insight specific to the chosen task (e.g., why a pattern collapsed, which layer was lost, where coupling increased); reflection acknowledges limitations |
| 1.0 | Comparison present but stays at surface level (e.g., "LLM score is lower"); no structural insight or reflection |
| 0 | No meaningful comparison; report restates the steps without analysis |

---

# Appendix: Metric Definitions and Formulas

Let:

- $H$ = human (original) system  
- $L$ = LLM-generated system  
- $M$ = set of modules/classes  
- $E$ = dependency edges  
- $P$ = design patterns in original system  
- $S$ = code smells  
- $L_{set}$ = architectural layers  

---

## A1. Layer Preservation Score (LPS)

$$
\text{LPS} = \frac{|L_{set}(H) \cap L_{set}(L)|}{|L_{set}(H)|}
$$

**Meaning:** Measures how many architectural layers from the human system are preserved in the LLM system.

---

## A2. Module Separation Index (MSI)

$$
\text{MSI} = 1 - \frac{\displaystyle\sum_{i \neq j} d(i,j)}{|M| \cdot (|M| - 1)}
$$

Where $d(i,j) = 1$ if module $i$ depends on module $j$, else $0$.

**Meaning:** Higher MSI = better separation of modules. Lower MSI = more coupling between modules.

---

## A3. Cross-Layer Violation Count (CLV)

$$
\text{CLV} = \sum_{(i,j) \in E} \mathbf{1}[\text{dependency } i \to j \text{ violates architecture rules}]
$$

**Meaning:** Counts how many dependencies break architectural layering rules.

---

## A4. Pattern Preservation Rate (PPR)

$$
\text{PPR} = \frac{|P(H) \cap P(L)|}{|P(H)|}
$$

Where $P(H)$ = set of design patterns in the human system, $P(L)$ = set in the LLM system.

**Meaning:** Fraction of design patterns preserved after LLM reconstruction.

---

## A5. Pattern Collapse Rate (PCR)

$$
\text{PCR} = \frac{|P_{\text{collapsed}}|}{|P(H)|}
$$

Where $P_{\text{collapsed}}$ = patterns replaced by simpler constructs (e.g., if-else logic).

**Meaning:** Measures how often design patterns collapse into procedural code.

---

## A6. Abstraction Loss Score (ALS)

$$
\text{ALS} = \frac{A(H) - A(L)}{A(H)}
$$

Where $A(H)$ = number of interfaces + abstract classes in the human system, $A(L)$ = same in the LLM system.

**Meaning:** Measures the reduction in abstraction level.

---

## A7. SOLID Violation Count (SVC)

$$
\text{SVC} = \text{SRV} + \text{OCPV} + \text{LSPV} + \text{ISPV} + \text{DIPV}
$$

Where each term counts violations of a single SOLID principle:

| Term | Principle |
|------|-----------|
| SRV | Single Responsibility |
| OCPV | Open/Closed |
| LSPV | Liskov Substitution |
| ISPV | Interface Segregation |
| DIPV | Dependency Inversion |

**Meaning:** Total number of SOLID principle violations.

---

## A8. Dependency Inversion Score (DIS)

$$
\text{DIS} = \frac{D_a}{D_a + D_c}
$$

Where $D_a$ = dependencies on abstractions, $D_c$ = dependencies on concrete implementations.

**Meaning:** Measures how well abstraction is used. Closer to $1$ = better design.

---

## A9. Responsibility Entanglement Index (REI)

$$
\text{REI} = \frac{1}{|M|} \sum_{m \in M} R(m)
$$

Where $R(m)$ = number of responsibilities in module $m$.

**Meaning:** Higher value = more mixed responsibilities per module.

---

## A10. Code Smell Density (CSD)

$$
\text{CSD} = \frac{|S|}{|M|}
$$

Where $S$ = total number of detected code smells, $M$ = number of modules.

**Meaning:** Average number of code smells per module.

---

## A11. God Module Ratio (GMR)

$$
\text{GMR} = \frac{|M_g|}{|M|}
$$

Where $M_g$ = modules exceeding the complexity threshold.

**Meaning:** Fraction of overly complex "god" modules.

---

## A12. Duplication Spread Index (DSI)

$$
\text{DSI} = \frac{\displaystyle\sum_{i \in M} D_i}{|M|}
$$

Where $D_i$ = number of duplicated logic instances in module $i$.

**Meaning:** Measures how widely code duplication is spread.

---

## A13. Graph Edit Distance (GED)

$$
\text{GED}(H, L) = \min \text{ number of edits to transform } G_H \text{ into } G_L
$$

Edits include: node insertion/removal, edge insertion/removal.

**Meaning:** Measures structural difference between dependency graphs.

---

## A14. Cycle Count (CC)

$$
\text{CC} = \text{number of cycles in } G_L
$$

**Meaning:** Counts cyclic dependencies introduced in the LLM system.

---

## A15. Centralization Shift Score (CSS)

$$
\text{CSS} = C_{\max}(G_L) - C_{\max}(G_H)
$$

Where $C_{\max}(G)$ = maximum node centrality in graph $G$.

**Meaning:**
- $\text{CSS} > 0$ → LLM makes the system more centralized  
- $\text{CSS} < 0$ → LLM makes the system more distributed
