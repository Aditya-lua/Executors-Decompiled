/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a59cc4
 */

void EVP_EncodeFinal(EVP_ENCODE_CTX *ctx,uchar *out,int *outl)

{
  uint uVar1;
  uint uVar2;
  
  if (ctx->num == 0) {
    uVar2 = 0;
  }
  else {
    uVar1 = FUN_00a59bb8(ctx,out,ctx->enc_data);
    uVar2 = uVar1;
    if ((ctx->expect_nl & 1) == 0) {
      uVar2 = uVar1 + 1;
      out[uVar1] = '\n';
    }
    out[uVar2] = '\0';
    ctx->num = 0;
  }
  *outl = uVar2;
  return;
}

