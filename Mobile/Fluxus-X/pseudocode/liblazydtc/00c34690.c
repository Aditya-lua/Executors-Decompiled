/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c34690
 */

int EVP_PKEY_derive(EVP_PKEY_CTX *ctx,uchar *key,size_t *keylen)

{
  int iVar1;
  
  iVar1 = EVP_PKEY_derive(ctx,key,keylen);
  return iVar1;
}

