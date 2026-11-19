/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009da244
 */

bool SSL_in_before(long param_1)

{
  if (*(int *)(param_1 + 0x5c) == 0) {
    return *(int *)(param_1 + 0x48) == 0;
  }
  return false;
}

