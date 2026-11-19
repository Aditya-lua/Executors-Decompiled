/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae8568
 */

undefined8 FUN_00ae8568(uchar *param_1,uchar *param_2,int param_3)

{
  int iVar1;
  int inl;
  int extraout_w0;
  int extraout_w0_00;
  EVP_ENCODE_CTX *ctx;
  long lVar2;
  size_t __n;
  uchar local_4c [4];
  int local_48 [2];
  
  ctx = (EVP_ENCODE_CTX *)EVP_ENCODE_CTX_new();
  local_48[0] = 0;
  local_48[1] = 0;
  local_4c[0] = '\0';
  local_4c[1] = '\0';
  if (ctx == (EVP_ENCODE_CTX *)0x0) {
    return 0;
  }
  EVP_EncodeInit(ctx);
  evp_encode_ctx_set_flags(ctx,3);
  iVar1 = param_3 % 3;
  inl = 3 - iVar1;
  if (iVar1 == 0) {
    lVar2 = 0;
  }
  else {
    EVP_EncodeUpdate(ctx,param_1,local_48 + 1,local_4c,inl);
    if (extraout_w0 == 0) goto LAB_00ae8678;
    lVar2 = (long)local_48[1];
  }
  EVP_EncodeUpdate(ctx,param_1 + lVar2,local_48,param_2,param_3);
  if (extraout_w0_00 != 0) {
    lVar2 = (long)local_48[1];
    local_48[1] = (int)(lVar2 + local_48[0]);
    EVP_EncodeFinal(ctx,param_1 + lVar2 + local_48[0],local_48);
    lVar2 = (long)local_48[1];
    local_48[1] = (int)(lVar2 + local_48[0]);
    if (iVar1 != 0) {
      __n = (lVar2 + local_48[0]) - (long)inl;
      memmove(param_1,param_1 + inl,__n);
      param_1[__n] = '\0';
    }
    EVP_ENCODE_CTX_free(ctx);
    return 1;
  }
LAB_00ae8678:
  EVP_ENCODE_CTX_free(ctx);
  return 0;
}

