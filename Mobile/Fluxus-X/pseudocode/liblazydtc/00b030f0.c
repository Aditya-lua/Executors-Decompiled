/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b030f0
 */

undefined8 X509_get0_authority_issuer(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = ossl_x509v3_cache_extensions();
  if ((iVar1 == 0) || (*(long *)(param_1 + 0x100) == 0)) {
    uVar2 = 0;
  }
  else {
    uVar2 = *(undefined8 *)(*(long *)(param_1 + 0x100) + 8);
  }
  return uVar2;
}

