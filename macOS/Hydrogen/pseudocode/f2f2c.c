
void FUN_000f2f2c(void)

{
  float *pfVar1;
  int iVar2;
  uint uVar3;
  long lVar4;
  int iVar5;
  int *unaff_x19;
  int unaff_w20;
  int unaff_w21;
  float fVar6;
  float fVar7;
  float fVar8;
  float unaff_s8;
  float unaff_s10;
  float unaff_s11;
  float unaff_s12;
  float unaff_s13;
  float unaff_s14;
  float unaff_s15;
  float fVar9;
  float fVar10;
  float fVar11;
  float in_s20;
  float fStack0000000000000008;
  float fStack000000000000000c;
  
  while( true ) {
    unaff_w20 = unaff_w20 + 1;
    func_0x000f2e0c();
    fVar6 = fStack000000000000000c - unaff_s14;
    fVar7 = fStack0000000000000008 - unaff_s15;
    fVar11 = -((unaff_s12 - fStack0000000000000008) * fVar6);
    fVar8 = fVar11 + fVar7 * (unaff_s13 - fStack000000000000000c);
    fVar9 = -((unaff_s11 - fStack0000000000000008) * fVar6);
    fVar10 = fVar9 + fVar7 * (unaff_s10 - fStack000000000000000c);
    if (fVar8 < 0.0) {
      fVar8 = -((unaff_s13 - fStack000000000000000c) * fVar7) - fVar11;
    }
    if (fVar10 < 0.0) {
      fVar10 = -((unaff_s10 - fStack000000000000000c) * fVar7) - fVar9;
    }
    if ((fVar8 + fVar10) * (fVar8 + fVar10) < (fVar7 * fVar7 + fVar6 * fVar6) * in_s20) break;
    if (unaff_w21 == unaff_w20) {
      return;
    }
    fVar10 = unaff_s14 + unaff_s13;
    fVar8 = unaff_s15 + unaff_s12;
    fVar6 = (unaff_s13 + unaff_s10) * unaff_s8;
    fVar7 = (unaff_s12 + unaff_s11) * unaff_s8;
    unaff_s10 = (unaff_s10 + fStack000000000000000c) * unaff_s8;
    unaff_s11 = (unaff_s11 + fStack0000000000000008) * unaff_s8;
    unaff_s13 = (fVar6 + unaff_s10) * unaff_s8;
    unaff_s12 = (fVar7 + unaff_s11) * unaff_s8;
    unaff_s14 = ((fVar10 * unaff_s8 + fVar6) * unaff_s8 + unaff_s13) * unaff_s8;
    unaff_s15 = ((fVar8 * unaff_s8 + fVar7) * unaff_s8 + unaff_s12) * unaff_s8;
  }
  iVar5 = *unaff_x19;
  if (iVar5 == unaff_x19[1]) {
    iVar2 = iVar5;
    if (iVar5 < 0) {
      iVar2 = iVar5 + 1;
    }
    uVar3 = 8;
    if (iVar5 != 0) {
      uVar3 = iVar5 + (iVar2 >> 1);
    }
    if ((int)uVar3 <= (int)(iVar5 + 1U)) {
      uVar3 = iVar5 + 1U;
    }
    lVar4 = func_0x000b810c(-(ulong)(uVar3 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar3 << 3);
    if (*(long *)(unaff_x19 + 2) != 0) {
      _memcpy(lVar4,*(long *)(unaff_x19 + 2),(long)*unaff_x19 << 3);
      func_0x000b83d4(*(undefined8 *)(unaff_x19 + 2));
    }
    *(long *)(unaff_x19 + 2) = lVar4;
    unaff_x19[1] = uVar3;
    iVar5 = *unaff_x19;
  }
  else {
    lVar4 = *(long *)(unaff_x19 + 2);
  }
  pfVar1 = (float *)(lVar4 + (long)iVar5 * 8);
  *pfVar1 = fStack000000000000000c;
  pfVar1[1] = fStack0000000000000008;
  *unaff_x19 = *unaff_x19 + 1;
  return;
}

