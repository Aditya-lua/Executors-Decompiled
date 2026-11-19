/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a756b0
 */

EVP_PKEY_CTX * EVP_PKEY_CTX_new_id(int id,ENGINE *e)

{
  EVP_PKEY_CTX *pEVar1;
  
  pEVar1 = (EVP_PKEY_CTX *)FUN_00a74f50(0,0,e,0,0,id);
  return pEVar1;
}

