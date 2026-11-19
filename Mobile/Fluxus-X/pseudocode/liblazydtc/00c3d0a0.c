/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3d0a0
 */

EVP_PKEY * EVP_PKCS82PKEY(PKCS8_PRIV_KEY_INFO *p8)

{
  EVP_PKEY *pEVar1;
  
  pEVar1 = EVP_PKCS82PKEY(p8);
  return pEVar1;
}

