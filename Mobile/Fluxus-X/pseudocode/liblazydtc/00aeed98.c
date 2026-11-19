/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeed98
 */

int UI_method_set_opener(UI_METHOD *method,opener *opener)

{
  if (method == (UI_METHOD *)0x0) {
    return -1;
  }
  *(opener **)(method + 8) = opener;
  return 0;
}

