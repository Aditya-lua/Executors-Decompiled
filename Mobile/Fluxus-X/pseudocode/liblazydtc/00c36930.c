/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c36930
 */

int HMAC_Init_ex(HMAC_CTX *ctx,void *key,int len,EVP_MD *md,ENGINE *impl)

{
  int iVar1;
  
  iVar1 = HMAC_Init_ex(ctx,key,len,md,impl);
  return iVar1;
}

