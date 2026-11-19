/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a201f4
 */

bool ossl_dsa_is_foreign(long param_1)

{
  DSA_METHOD *pDVar1;
  DSA_METHOD *pDVar2;
  
  if (*(long *)(param_1 + 0xa8) == 0) {
    pDVar1 = (DSA_METHOD *)DSA_get_method();
    pDVar2 = DSA_OpenSSL();
    return pDVar1 != pDVar2;
  }
  return true;
}

