/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3bd60
 */

EVP_PKEY_METHOD * ENGINE_get_pkey_meth(ENGINE *e,int nid)

{
  EVP_PKEY_METHOD *pEVar1;
  
  pEVar1 = ENGINE_get_pkey_meth(e,nid);
  return pEVar1;
}

