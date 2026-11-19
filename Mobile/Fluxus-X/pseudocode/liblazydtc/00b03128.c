/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b03128
 */

undefined8 X509_get0_authority_serial(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = ossl_x509v3_cache_extensions();
  if ((iVar1 == 0) || (*(long *)(param_1 + 0x100) == 0)) {
    uVar2 = 0;
  }
  else {
    uVar2 = *(undefined8 *)(*(long *)(param_1 + 0x100) + 0x10);
  }
  return uVar2;
}

