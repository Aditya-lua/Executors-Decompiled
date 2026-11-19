/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c8ef8
 */

long SSL_get_srp_g(long param_1)

{
  if (*(long *)(param_1 + 0xc00) == 0) {
    return *(long *)(*(long *)(param_1 + 0x9a8) + 0x348);
  }
  return *(long *)(param_1 + 0xc00);
}

