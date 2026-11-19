/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeeed4
 */

int UI_get_input_flags(UI_STRING *uis)

{
  return *(int *)(uis + 0x10);
}

