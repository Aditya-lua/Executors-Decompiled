/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5c990
 */

int EVP_CIPHER_CTX_rand_key(EVP_CIPHER_CTX *ctx,uchar *key)

{
  int iVar1;
  uint uVar2;
  undefined8 uVar3;
  
  if ((*(byte *)((long)&ctx->cipher->flags + 1) >> 1 & 1) != 0) {
    iVar1 = EVP_CIPHER_CTX_ctrl(ctx,6,0,key);
    return iVar1;
  }
  if (ctx->cipher == (EVP_CIPHER *)0x0) {
    uVar3 = 0;
  }
  else {
    EVP_CIPHER_get0_provider();
    uVar3 = ossl_provider_libctx();
  }
  iVar1 = EVP_CIPHER_CTX_get_key_length(ctx);
  if (iVar1 < 1) {
    uVar2 = 0;
  }
  else {
    iVar1 = RAND_priv_bytes_ex(uVar3,key,(long)iVar1,0);
    uVar2 = (uint)(0 < iVar1);
  }
  return uVar2;
}

