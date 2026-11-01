
bool thunk_FUN_00112070(void)

{
  byte bVar1;
  byte *pbVar2;
  long lVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  byte *pbVar7;
  long unaff_x20;
  long unaff_x21;
  int unaff_w22;
  uint unaff_w23;
  byte *unaff_x25;
  long lVar8;
  long *unaff_x26;
  undefined1 *unaff_x28;
  float fVar9;
  ulong uVar10;
  float fVar11;
  undefined4 uVar12;
  float unaff_s10;
  undefined4 in_stack_00000008;
  
  lVar8 = *unaff_x26;
  if ((unaff_w23 >> 5 & 1) == 0) {
    lVar8 = lVar8 + (long)*(float *)(unaff_x28 + 3);
    uVar12 = 0;
    fVar11 = 0.0;
    goto joined_r0x001121cc;
  }
  fVar11 = 1.0;
  if (unaff_w22 == 8) {
    bVar1 = *unaff_x25;
    if (bVar1 != 0) {
      do {
        if ((bVar1 == 0x25) && (unaff_x25[1] != 0x25)) goto LAB_001120dc;
        if (bVar1 == 0x25) {
          unaff_x25 = unaff_x25 + 1;
        }
        unaff_x25 = unaff_x25 + 1;
        bVar1 = *unaff_x25;
      } while (bVar1 != 0);
    }
    uVar5 = 3;
    goto code_r0x00112160;
  }
  goto LAB_00112164;
LAB_001120dc:
  do {
    pbVar2 = unaff_x25;
    unaff_x25 = pbVar2 + 1;
    bVar1 = *unaff_x25;
    uVar4 = (uint)bVar1;
  } while (bVar1 - 0x30 < 10);
  if (bVar1 == 0x2e) {
    pbVar7 = pbVar2 + 2;
    bVar1 = *pbVar7;
    if (bVar1 == 0x2d) {
      pbVar7 = pbVar2 + 3;
    }
    pbVar2 = pbVar7;
    if (*pbVar7 == 0x2b) {
      pbVar2 = pbVar7 + 1;
    }
    uVar4 = (uint)*pbVar2;
    if (*pbVar2 - 0x30 < 10) {
      uVar6 = 0;
      lVar3 = (ulong)(bVar1 == 0x2d) + (ulong)(*pbVar7 == 0x2b) + 2;
      do {
        uVar6 = (uVar4 + uVar6 * 10) - 0x30;
        uVar4 = (uint)unaff_x25[lVar3];
        lVar3 = lVar3 + 1;
      } while (uVar4 - 0x30 < 10);
    }
    else {
      uVar6 = 0;
    }
    uVar5 = -uVar6;
    if (bVar1 != 0x2d) {
      uVar5 = uVar6;
    }
    uVar6 = 3;
    if (uVar5 < 100) {
      uVar6 = uVar5;
    }
  }
  else {
    uVar6 = 0x7fffffff;
  }
  uVar5 = 0xffffffff;
  if ((uVar4 != 0x45) && (uVar4 != 0x65)) {
    if (uVar4 == 0x67) {
      uVar5 = uVar6;
      if (uVar6 == 0x7fffffff) goto code_r0x001123d0;
    }
    else if ((uVar4 == 0x47) && (uVar6 == 0x7fffffff)) {
code_r0x001123d0:
      uVar5 = 0xffffffff;
    }
    else {
      uVar5 = 3;
      if (uVar6 != 0x7fffffff) {
        uVar5 = uVar6;
      }
    }
  }
code_r0x00112160:
  fVar11 = (float)(int)uVar5;
LAB_00112164:
  uVar10 = _powf(0x3dcccccd,fVar11);
  uVar12 = (undefined4)uVar10;
  fVar11 = (float)func_0x0012a6a4(uVar10,0,in_stack_00000008,lVar8);
  lVar8 = func_0x0012a88c(fVar11 + *(float *)(unaff_x28 + 3),uVar10 & 0xffffffff,0,in_stack_00000008
                         );
joined_r0x001121cc:
  if ((unaff_w22 == 8) && ((unaff_w23 >> 6 & 1) == 0)) {
    lVar8 = func_0x0012aac4();
  }
  *unaff_x28 = 0;
  if ((unaff_w23 >> 5 & 1) == 0) {
    lVar3 = *unaff_x26;
    *(float *)(unaff_x28 + 3) = *(float *)(unaff_x28 + 3) - (float)(lVar8 - lVar3);
  }
  else {
    fVar9 = (float)func_0x0012a6a4(uVar12,0,in_stack_00000008,lVar8);
    *(float *)(unaff_x28 + 3) = *(float *)(unaff_x28 + 3) - (fVar9 - fVar11);
    lVar3 = *unaff_x26;
  }
  if ((unaff_x21 < unaff_x20) && (lVar3 != lVar8)) {
    if ((lVar8 < unaff_x21) || (((unaff_w22 != 8 && (lVar3 < lVar8)) && (unaff_s10 < 0.0)))) {
      lVar8 = unaff_x21;
    }
    if ((unaff_x20 < lVar8) || (((unaff_w22 != 8 && (lVar8 < lVar3)) && (0.0 < unaff_s10)))) {
      lVar8 = unaff_x20;
    }
  }
  if (lVar3 != lVar8) {
    *unaff_x26 = lVar8;
  }
  return lVar3 != lVar8;
}

