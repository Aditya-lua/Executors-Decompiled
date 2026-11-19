/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b03160
 */

undefined8 X509_get_pathlen(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = ossl_x509v3_cache_extensions();
  if ((iVar1 == 0) || ((*(byte *)(param_1 + 0xe8) & 1) == 0)) {
    uVar2 = 0xffffffffffffffff;
  }
  else {
    uVar2 = *(undefined8 *)(param_1 + 0xd8);
  }
  return uVar2;
}

