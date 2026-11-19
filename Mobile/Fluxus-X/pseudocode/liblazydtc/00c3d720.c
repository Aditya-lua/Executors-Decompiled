/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3d720
 */

int EVP_PKEY_verify(EVP_PKEY_CTX *ctx,uchar *sig,size_t siglen,uchar *tbs,size_t tbslen)

{
  int iVar1;
  
  iVar1 = EVP_PKEY_verify(ctx,sig,siglen,tbs,tbslen);
  return iVar1;
}

