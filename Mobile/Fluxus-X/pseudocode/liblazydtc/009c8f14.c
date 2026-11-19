/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c8f14
 */

long SSL_get_srp_N(long param_1)

{
  if (*(long *)(param_1 + 0xbf8) == 0) {
    return *(long *)(*(long *)(param_1 + 0x9a8) + 0x340);
  }
  return *(long *)(param_1 + 0xbf8);
}

