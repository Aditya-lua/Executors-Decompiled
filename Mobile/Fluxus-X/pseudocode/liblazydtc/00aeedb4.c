/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeedb4
 */

int UI_method_set_writer(UI_METHOD *method,writer *writer)

{
  if (method == (UI_METHOD *)0x0) {
    return -1;
  }
  *(writer **)(method + 0x10) = writer;
  return 0;
}

