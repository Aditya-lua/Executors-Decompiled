/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae8258
 */

int FUN_00ae8258(uchar *param_1,byte *param_2)

{
  long lVar1;
  uint uVar2;
  int iVar3;
  size_t sVar4;
  EVP_ENCODE_CTX *ctx;
  int inl;
  ulong uVar5;
  int local_38;
  int iStack_34;
  
  local_38 = 0;
  iStack_34 = 0;
  while ((*param_2 < 0x21 && ((1L << ((ulong)*param_2 & 0x3f) & 0x100000600U) != 0))) {
    param_2 = param_2 + 1;
  }
  sVar4 = strlen((char *)param_2);
  if (sVar4 >> 0x1f != 0) {
    return -1;
  }
  uVar2 = -(int)sVar4;
  uVar5 = (ulong)uVar2 & 3;
  if (0x9c4 < (uVar5 + sVar4 >> 2) * 3) {
    return -1;
  }
  ctx = (EVP_ENCODE_CTX *)EVP_ENCODE_CTX_new();
  if (ctx == (EVP_ENCODE_CTX *)0x0) {
    return -1;
  }
  if (uVar5 != 3) {
    EVP_DecodeInit(ctx);
    evp_encode_ctx_set_flags(ctx,2);
    inl = (int)uVar5;
    if ((((uVar2 & 3) == 0) ||
        (iVar3 = EVP_DecodeUpdate(ctx,param_1,&iStack_34,"00",inl), -1 < iVar3)) &&
       (iVar3 = EVP_DecodeUpdate(ctx,param_1,&local_38,param_2,(int)sVar4), -1 < iVar3)) {
      lVar1 = (long)iStack_34;
      iStack_34 = (int)(lVar1 + local_38);
      EVP_DecodeFinal(ctx,param_1 + lVar1 + local_38,&local_38);
      lVar1 = (long)iStack_34;
      iStack_34 = (int)(lVar1 + local_38);
      if ((uVar2 & 3) == 0) goto LAB_00ae83a8;
      iVar3 = iStack_34 - inl;
      if (iVar3 != 0 && inl <= iStack_34) {
        memmove(param_1,param_1 + uVar5,(lVar1 + local_38) - uVar5);
        iStack_34 = iVar3;
        goto LAB_00ae83a8;
      }
    }
  }
  iStack_34 = -1;
LAB_00ae83a8:
  EVP_ENCODE_CTX_free(ctx);
  return iStack_34;
}

