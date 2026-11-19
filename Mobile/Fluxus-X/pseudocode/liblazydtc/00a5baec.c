/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5baec
 */

int EVP_EncryptInit(EVP_CIPHER_CTX *ctx,EVP_CIPHER *cipher,uchar *key,uchar *iv)

{
  int iVar1;
  
  if (cipher != (EVP_CIPHER *)0x0) {
    EVP_CIPHER_CTX_reset(ctx);
  }
  iVar1 = FUN_00a5a64c(ctx,cipher,0,key,iv,1,0);
  return iVar1;
}

