/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6f198
 */

long EVP_PKEY_get0_description(long param_1)

{
  long lVar1;
  
  if ((((*(long *)(param_1 + 0x20) != 0) || (lVar1 = 0, *(long *)(param_1 + 0x68) != 0)) &&
      ((*(long *)(param_1 + 0x60) == 0 ||
       (lVar1 = *(long *)(*(long *)(param_1 + 0x60) + 0x10), lVar1 == 0)))) &&
     (lVar1 = 0, *(long *)(param_1 + 8) != 0)) {
    lVar1 = *(long *)(*(long *)(param_1 + 8) + 0x18);
  }
  return lVar1;
}

