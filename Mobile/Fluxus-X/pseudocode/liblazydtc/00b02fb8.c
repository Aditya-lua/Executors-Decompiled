/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b02fb8
 */

undefined8 ossl_x509_signing_allowed(long param_1,long param_2)

{
  if ((*(byte *)(param_2 + 0xe9) >> 2 & 1) == 0) {
    if (((*(uint *)(param_1 + 0xe8) >> 1 & 1) != 0) && ((*(byte *)(param_1 + 0xec) >> 2 & 1) == 0))
    {
      return 0x20;
    }
  }
  else if (((*(uint *)(param_1 + 0xe8) >> 1 & 1) != 0) && (-1 < *(char *)(param_1 + 0xec))) {
    return 0x27;
  }
  return 0;
}

