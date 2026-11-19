/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009da220
 */

bool SSL_is_init_finished(long param_1)

{
  if (*(int *)(param_1 + 100) == 0) {
    return *(int *)(param_1 + 0x5c) == 1;
  }
  return false;
}

