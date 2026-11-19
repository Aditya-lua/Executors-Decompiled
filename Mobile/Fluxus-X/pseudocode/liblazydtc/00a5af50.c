/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5af50
 */

int EVP_CipherInit(EVP_CIPHER_CTX *ctx,EVP_CIPHER *cipher,uchar *key,uchar *iv,int enc)

{
  int iVar1;
  
  if (cipher != (EVP_CIPHER *)0x0) {
    EVP_CIPHER_CTX_reset(ctx);
  }
  iVar1 = FUN_00a5a64c(ctx,cipher,0,key,iv,enc,0);
  return iVar1;
}

