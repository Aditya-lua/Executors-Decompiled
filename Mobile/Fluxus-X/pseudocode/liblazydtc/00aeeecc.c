/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeeecc
 */

UI_string_types UI_get_string_type(UI_STRING *uis)

{
  return *(UI_string_types *)uis;
}

