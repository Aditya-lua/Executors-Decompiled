/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3d6d0
 */

EVP_PKEY_CTX * EVP_PKEY_CTX_new(EVP_PKEY *pkey,ENGINE *e)

{
  EVP_PKEY_CTX *pEVar1;
  
  pEVar1 = EVP_PKEY_CTX_new(pkey,e);
  return pEVar1;
}

