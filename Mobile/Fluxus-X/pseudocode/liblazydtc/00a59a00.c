/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a59a00
 */

void EVP_EncodeUpdate(EVP_ENCODE_CTX *ctx,uchar *out,int *outl,uchar *in,int inl)

{
  uchar *puVar1;
  int iVar2;
  long lVar3;
  size_t __n;
  ulong uVar4;
  
  *outl = 0;
  if (inl < 1) {
    return;
  }
  iVar2 = ctx->length;
  if (0x50 < iVar2) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: ctx->length <= (int)sizeof(ctx->enc_data)","crypto/evp/encode.c",
                0xab);
  }
  lVar3 = (long)ctx->num;
  __n = iVar2 - lVar3;
  if (inl < (int)__n) {
    memcpy(ctx->enc_data + lVar3,in,(long)inl);
    ctx->num = ctx->num + inl;
    return;
  }
  if (ctx->num == 0) {
    uVar4 = 0;
  }
  else {
    memcpy(ctx->enc_data + lVar3,in,__n);
    in = in + __n;
    inl = inl - (int)__n;
    iVar2 = FUN_00a59bb8(ctx,out,ctx->enc_data,ctx->length);
    uVar4 = (ulong)iVar2;
    puVar1 = out + uVar4;
    ctx->num = 0;
    out = puVar1;
    if ((ctx->expect_nl & 1) == 0) {
      out = puVar1 + 1;
      *puVar1 = '\n';
      uVar4 = uVar4 + 1;
    }
    *out = '\0';
    iVar2 = ctx->length;
    if (uVar4 >> 0x1f != 0) goto LAB_00a59b54;
  }
  if (iVar2 <= inl) {
    do {
      iVar2 = FUN_00a59bb8(ctx,out,in);
      puVar1 = out + iVar2;
      in = in + ctx->length;
      inl = inl - ctx->length;
      uVar4 = uVar4 + (long)iVar2;
      out = puVar1;
      if ((ctx->expect_nl & 1) == 0) {
        out = puVar1 + 1;
        *puVar1 = '\n';
        uVar4 = uVar4 + 1;
      }
      *out = '\0';
    } while ((uVar4 >> 0x1f == 0) && (ctx->length <= inl));
  }
LAB_00a59b54:
  if (uVar4 >> 0x1f == 0) {
    if (inl != 0) {
      memcpy(ctx->enc_data,in,(long)inl);
    }
    ctx->num = inl;
    *outl = (int)uVar4;
  }
  else {
    *outl = 0;
  }
  return;
}

