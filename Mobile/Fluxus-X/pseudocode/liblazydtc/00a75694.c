/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a75694
 */

EVP_PKEY_CTX * EVP_PKEY_CTX_new(EVP_PKEY *pkey,ENGINE *e)

{
  EVP_PKEY_CTX *pEVar1;
  
  pEVar1 = (EVP_PKEY_CTX *)FUN_00a74f50(0,pkey,e,0,0,0xffffffff);
  return pEVar1;
}

