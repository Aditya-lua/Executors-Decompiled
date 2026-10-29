# Function-source index

`analysis/function_source_index.csv` maps every one of the 19,822 Mach-O
function starts to its extent, source-lift tier, imports, strings, call counts,
and any evidence-backed semantic name.

| Lift result | Functions |
|---|---:|
| Structured C-like | 19,636 |
| Instruction-faithful fallback | 186 |
| Missing | 0 |

Generated names are never represented as original symbols.  The address is the
canonical identity, and the CSV makes each inference auditable against the
assembly and machine-derived indexes.
