/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b03018
 */

ulong X509_get_key_usage(long param_1)

{
  ulong uVar1;
  
  uVar1 = ossl_x509v3_cache_extensions();
  if ((int)uVar1 != 0) {
    if ((*(byte *)(param_1 + 0xe8) >> 1 & 1) == 0) {
      uVar1 = 0xffffffff;
    }
    else {
      uVar1 = (ulong)*(uint *)(param_1 + 0xec);
    }
  }
  return uVar1;
}

