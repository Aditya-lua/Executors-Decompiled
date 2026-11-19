/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7f838
 */

int HMAC_Init(HMAC_CTX *ctx,void *key,int len,EVP_MD *md)

{
  int iVar1;
  
  if ((key != (void *)0x0) && (md != (EVP_MD *)0x0)) {
    HMAC_CTX_reset(ctx);
  }
  iVar1 = HMAC_Init_ex(ctx,key,len,md,(ENGINE *)0x0);
  return iVar1;
}

