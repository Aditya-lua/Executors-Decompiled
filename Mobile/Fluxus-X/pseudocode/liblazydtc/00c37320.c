/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c37320
 */

int EVP_PKEY_decrypt(EVP_PKEY_CTX *ctx,uchar *out,size_t *outlen,uchar *in,size_t inlen)

{
  int iVar1;
  
  iVar1 = EVP_PKEY_decrypt(ctx,out,outlen,in,inlen);
  return iVar1;
}

