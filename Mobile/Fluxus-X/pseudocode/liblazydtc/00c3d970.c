/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3d970
 */

int EVP_PKEY_set1_DSA(EVP_PKEY *pkey,dsa_st *key)

{
  int iVar1;
  
  iVar1 = EVP_PKEY_set1_DSA(pkey,key);
  return iVar1;
}

