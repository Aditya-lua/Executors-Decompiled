/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b24e0
 */

uint SSL_is_dtls(long param_1)

{
  return *(uint *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1;
}

