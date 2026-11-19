/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a67940
 */

int EVP_DigestSignInit(EVP_MD_CTX *ctx,EVP_PKEY_CTX **pctx,EVP_MD *type,ENGINE *e,EVP_PKEY *pkey)

{
  int iVar1;
  
  iVar1 = FUN_00a67138((int)ctx,pctx,type,0,0,0,e,pkey,0,0);
  return iVar1;
}

