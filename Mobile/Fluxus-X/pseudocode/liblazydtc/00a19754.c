/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a19754
 */

bool ossl_dh_is_foreign(long param_1)

{
  DH_METHOD *pDVar1;
  DH_METHOD *pDVar2;
  
  if (*(long *)(param_1 + 0xa8) == 0) {
    pDVar1 = (DH_METHOD *)ossl_dh_get_method();
    pDVar2 = DH_OpenSSL();
    return pDVar1 != pDVar2;
  }
  return true;
}

