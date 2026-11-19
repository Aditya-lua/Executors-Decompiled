/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3dbc0
 */

int EVP_VerifyFinal(EVP_MD_CTX *ctx,uchar *sigbuf,uint siglen,EVP_PKEY *pkey)

{
  int iVar1;
  
  iVar1 = EVP_VerifyFinal(ctx,sigbuf,siglen,pkey);
  return iVar1;
}

