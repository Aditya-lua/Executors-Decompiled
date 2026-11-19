/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aee790
 */

void * UI_get0_user_data(UI *ui)

{
  return *(void **)(ui + 0x10);
}

