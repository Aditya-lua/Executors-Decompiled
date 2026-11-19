/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bea88
 */

bool SSL_SESSION_is_resumable(long param_1)

{
  if (*(int *)(param_1 + 0x2b0) != 0) {
    return false;
  }
  if (*(long *)(param_1 + 0x250) == 0) {
    return *(long *)(param_1 + 0x340) != 0;
  }
  return true;
}

