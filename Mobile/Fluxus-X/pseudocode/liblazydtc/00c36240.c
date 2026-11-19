/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c36240
 */

EVP_PKEY * EVP_PKEY_new_mac_key(int type,ENGINE *e,uchar *key,int keylen)

{
  EVP_PKEY *pEVar1;
  
  pEVar1 = EVP_PKEY_new_mac_key(type,e,key,keylen);
  return pEVar1;
}

