/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5a214
 */

int EVP_DecodeFinal(EVP_ENCODE_CTX *ctx,uchar *out,int *outl)

{
  int iVar1;
  
  *outl = 0;
  if (ctx->num != 0) {
    iVar1 = FUN_00a5a080(ctx,out,ctx->enc_data);
    if (iVar1 < 0) {
      return -1;
    }
    ctx->num = 0;
    *outl = iVar1;
  }
  return 1;
}

