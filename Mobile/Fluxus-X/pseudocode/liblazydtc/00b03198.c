/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b03198
 */

undefined8 X509_get_proxy_pathlen(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = ossl_x509v3_cache_extensions();
  if ((iVar1 == 0) || ((*(byte *)(param_1 + 0xe9) >> 2 & 1) == 0)) {
    uVar2 = 0xffffffffffffffff;
  }
  else {
    uVar2 = *(undefined8 *)(param_1 + 0xe0);
  }
  return uVar2;
}

