/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c36890
 */

EVP_CIPHER * ENGINE_get_cipher(ENGINE *e,int nid)

{
  EVP_CIPHER *pEVar1;
  
  pEVar1 = ENGINE_get_cipher(e,nid);
  return pEVar1;
}

