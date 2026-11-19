/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5afbc
 */

int EVP_CipherUpdate(EVP_CIPHER_CTX *ctx,uchar *out,int *outl,uchar *in,int inl)

{
  int iVar1;
  
  if (ctx->encrypt == 0) {
    iVar1 = EVP_DecryptUpdate(ctx,out,outl,in,inl);
    return iVar1;
  }
  iVar1 = EVP_EncryptUpdate(ctx,out,outl,in,inl);
  return iVar1;
}

