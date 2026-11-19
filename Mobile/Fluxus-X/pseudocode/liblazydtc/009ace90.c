/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ace90
 */

long SSL_get0_CA_list(long param_1)

{
  if (*(long *)(param_1 + 0x9d0) == 0) {
    return *(long *)(*(long *)(param_1 + 0x9a8) + 0x128);
  }
  return *(long *)(param_1 + 0x9d0);
}

