/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3dbf0
 */

EVP_PKEY_CTX * EVP_PKEY_CTX_new_id(int id,ENGINE *e)

{
  EVP_PKEY_CTX *pEVar1;
  
  pEVar1 = EVP_PKEY_CTX_new_id(id,e);
  return pEVar1;
}

