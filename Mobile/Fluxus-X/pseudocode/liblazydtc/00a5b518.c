/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5b518
 */

int EVP_CipherFinal_ex(EVP_CIPHER_CTX *ctx,uchar *outm,int *outl)

{
  int iVar1;
  
  if (ctx->encrypt == 0) {
    iVar1 = EVP_DecryptFinal_ex(ctx,outm,outl);
    return iVar1;
  }
  iVar1 = EVP_EncryptFinal_ex(ctx,outm,outl);
  return iVar1;
}

