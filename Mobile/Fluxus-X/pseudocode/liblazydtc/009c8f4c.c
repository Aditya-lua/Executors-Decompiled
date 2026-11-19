/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c8f4c
 */

long SSL_get_srp_userinfo(long param_1)

{
  if (*(long *)(param_1 + 0xc38) == 0) {
    return *(long *)(*(long *)(param_1 + 0x9a8) + 0x380);
  }
  return *(long *)(param_1 + 0xc38);
}

