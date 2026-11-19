/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab3d24
 */

int EVP_VerifyFinal(EVP_MD_CTX *ctx,uchar *sigbuf,uint siglen,EVP_PKEY *pkey)

{
  int iVar1;
  
  iVar1 = EVP_VerifyFinal_ex((int)ctx,sigbuf,siglen,pkey,0,0);
  return iVar1;
}

