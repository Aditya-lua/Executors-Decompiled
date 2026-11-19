/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c368b0
 */

EVP_MD * ENGINE_get_digest(ENGINE *e,int nid)

{
  EVP_MD *pEVar1;
  
  pEVar1 = ENGINE_get_digest(e,nid);
  return pEVar1;
}

