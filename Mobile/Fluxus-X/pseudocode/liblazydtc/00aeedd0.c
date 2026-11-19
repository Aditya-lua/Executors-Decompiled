/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeedd0
 */

int UI_method_set_flusher(UI_METHOD *method,flusher *flusher)

{
  if (method == (UI_METHOD *)0x0) {
    return -1;
  }
  *(flusher **)(method + 0x18) = flusher;
  return 0;
}

