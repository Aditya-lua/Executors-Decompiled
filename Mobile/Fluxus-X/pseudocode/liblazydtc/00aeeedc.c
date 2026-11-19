/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeeedc
 */

char * UI_get0_output_string(UI_STRING *uis)

{
  return *(char **)(uis + 8);
}

