/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3c170
 */

int EVP_DigestSignInit(EVP_MD_CTX *ctx,EVP_PKEY_CTX **pctx,EVP_MD *type,ENGINE *e,EVP_PKEY *pkey)

{
  int iVar1;
  
  iVar1 = EVP_DigestSignInit(ctx,pctx,type,e,pkey);
  return iVar1;
}

