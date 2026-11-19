/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a59e2c
 */

int EVP_DecodeUpdate(EVP_ENCODE_CTX *ctx,uchar *out,int *outl,uchar *in,int inl)

{
  undefined *puVar1;
  byte bVar2;
  byte bVar3;
  bool bVar4;
  uint uVar5;
  int iVar6;
  uint uVar7;
  uint uVar8;
  int iVar9;
  int iVar10;
  long lVar11;
  
  uVar8 = ctx->num;
  if ((int)uVar8 < 1) {
    iVar10 = 0;
  }
  else {
    iVar10 = 0;
    if (((ctx->enc_data[(long)(int)uVar8 + -1] == '=') && (iVar10 = 1, 1 < (int)uVar8)) &&
       (iVar10 = 1, ctx->enc_data[(long)(int)uVar8 + -2] == '=')) {
      iVar10 = 2;
    }
  }
  if (inl == 0) {
    uVar7 = 0;
    iVar9 = 0;
    goto LAB_00a5a058;
  }
  puVar1 = &DAT_00766154;
  if ((ctx->expect_nl & 2) != 0) {
    puVar1 = &DAT_007660d4;
  }
  if (inl < 1) {
    iVar9 = 0;
    bVar4 = false;
    if (0 < (int)uVar8) goto LAB_00a59fc8;
LAB_00a5a030:
    uVar7 = 0;
    uVar5 = uVar8;
    if (bVar4) goto LAB_00a5a058;
  }
  else {
    lVar11 = 0;
    iVar9 = 0;
    do {
      bVar3 = in[lVar11];
      if (((char)bVar3 < '\0') || (bVar2 = puVar1[bVar3], bVar2 == 0xff)) {
LAB_00a59f98:
        uVar7 = 0xffffffff;
        goto LAB_00a5a058;
      }
      if (bVar3 != 0x3d) {
        if (((iVar10 < 1) || ((bVar2 | 0x13) == 0xf3)) && (iVar10 < 3)) goto LAB_00a59f08;
        goto LAB_00a59f98;
      }
      iVar10 = iVar10 + 1;
      if (2 < iVar10) goto LAB_00a59f98;
LAB_00a59f08:
      if (bVar2 == 0xf2) {
        bVar4 = true;
        goto LAB_00a5a024;
      }
      uVar7 = uVar8;
      if ((bVar2 | 0x13) != 0xf3) {
        if (0x3f < (int)uVar8) goto LAB_00a59f98;
        uVar7 = uVar8 + 1;
        ctx->enc_data[(int)uVar8] = bVar3;
      }
      uVar8 = uVar7;
      if (uVar7 == 0x40) {
        iVar6 = FUN_00a5a080(ctx,out,ctx->enc_data);
        if ((iVar6 < 0) || (iVar6 < iVar10)) goto LAB_00a5a054;
        uVar8 = 0;
        iVar9 = (iVar6 - iVar10) + iVar9;
        out = out + (iVar6 - iVar10);
      }
      lVar11 = lVar11 + 1;
    } while ((int)lVar11 < inl);
    bVar4 = false;
LAB_00a5a024:
    if ((int)uVar8 < 1) goto LAB_00a5a030;
LAB_00a59fc8:
    if ((uVar8 & 3) == 0) {
      iVar6 = FUN_00a5a080(ctx,out,ctx->enc_data);
      if ((iVar6 < 0) || (iVar6 < iVar10)) {
LAB_00a5a054:
        uVar7 = 0xffffffff;
        uVar8 = 0;
        goto LAB_00a5a058;
      }
      uVar8 = 0;
      iVar9 = (iVar9 - iVar10) + iVar6;
      uVar7 = 0;
      uVar5 = 0;
      if (bVar4) goto LAB_00a5a058;
    }
    else {
      uVar5 = uVar8;
      if (bVar4) {
        uVar7 = 0xffffffff;
        goto LAB_00a5a058;
      }
    }
  }
  uVar8 = uVar5;
  uVar7 = (uint)(iVar10 == 0 || uVar8 != 0);
LAB_00a5a058:
  *outl = iVar9;
  ctx->num = uVar8;
  return uVar7;
}

