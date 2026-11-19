/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeee08
 */

int UI_method_set_closer(UI_METHOD *method,closer *closer)

{
  if (method == (UI_METHOD *)0x0) {
    return -1;
  }
  *(closer **)(method + 0x28) = closer;
  return 0;
}

