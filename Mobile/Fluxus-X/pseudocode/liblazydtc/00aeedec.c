/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeedec
 */

int UI_method_set_reader(UI_METHOD *method,reader *reader)

{
  if (method == (UI_METHOD *)0x0) {
    return -1;
  }
  *(reader **)(method + 0x20) = reader;
  return 0;
}

