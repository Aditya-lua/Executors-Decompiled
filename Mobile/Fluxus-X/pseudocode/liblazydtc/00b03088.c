/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b03088
 */

undefined8 X509_get0_subject_key_id(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = ossl_x509v3_cache_extensions();
  if (iVar1 == 0) {
    uVar2 = 0;
  }
  else {
    uVar2 = *(undefined8 *)(param_1 + 0xf8);
  }
  return uVar2;
}

