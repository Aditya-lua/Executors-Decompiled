
void thunk_FUN_00128d48(void)

{
  undefined4 *puVar1;
  float *pfVar2;
  int iVar3;
  long lVar4;
  int in_w8;
  int iVar5;
  uint uVar6;
  long lVar7;
  long unaff_x19;
  float *unaff_x20;
  long unaff_x22;
  long unaff_x23;
  float fVar8;
  float unaff_s8;
  float unaff_s9;
  undefined4 unaff_s10;
  float fVar9;
  float unaff_s11;
  float fStack0000000000000008;
  float fStack000000000000000c;
  
  puVar1 = (undefined4 *)(unaff_x22 + (long)in_w8 * 8);
  *puVar1 = unaff_s10;
  puVar1[1] = unaff_s9;
  *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  fStack0000000000000008 = unaff_s8 + *unaff_x20;
  fVar9 = unaff_s11 + unaff_s8;
  fStack000000000000000c = fVar9;
  func_0x000f23c0();
  fStack0000000000000008 = unaff_x20[2] - unaff_s8;
  fStack000000000000000c = fVar9;
  func_0x000f23c0();
  fVar8 = unaff_x20[2];
  iVar5 = *(int *)(unaff_x19 + 0x78);
  if (iVar5 == *(int *)(unaff_x19 + 0x7c)) {
    iVar3 = iVar5;
    if (iVar5 < 0) {
      iVar3 = iVar5 + 1;
    }
    uVar6 = 8;
    if (iVar5 != 0) {
      uVar6 = iVar5 + (iVar3 >> 1);
    }
    if ((int)uVar6 <= (int)(iVar5 + 1U)) {
      uVar6 = iVar5 + 1U;
    }
    lVar4 = func_0x000b810c(-(ulong)(uVar6 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar6 << 3);
    if (*(long *)(unaff_x19 + 0x80) != 0) {
      _memcpy(lVar4,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
      func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
    }
    *(long *)(unaff_x19 + 0x80) = lVar4;
    *(uint *)(unaff_x19 + 0x7c) = uVar6;
    iVar5 = *(int *)(unaff_x19 + 0x78);
  }
  else {
    lVar4 = *(long *)(unaff_x19 + 0x80);
  }
  pfVar2 = (float *)(lVar4 + (long)iVar5 * 8);
  *pfVar2 = fVar8;
  pfVar2[1] = unaff_s9;
  *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  func_0x000f1888();
  *(undefined4 *)(unaff_x19 + 0x78) = 0;
  if (0.0 < *(float *)(&UNK_00003974 + unaff_x23)) {
    fVar8 = *unaff_x20;
    if (*(int *)(unaff_x19 + 0x7c) == 0) {
      lVar4 = func_0x000b810c(0x40);
      if (*(long *)(unaff_x19 + 0x80) != 0) {
        _memcpy(lVar4,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
        func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
      }
      *(long *)(unaff_x19 + 0x80) = lVar4;
      *(undefined4 *)(unaff_x19 + 0x7c) = 8;
      lVar7 = (long)*(int *)(unaff_x19 + 0x78);
    }
    else {
      lVar7 = 0;
      lVar4 = *(long *)(unaff_x19 + 0x80);
    }
    pfVar2 = (float *)(lVar4 + lVar7 * 8);
    *pfVar2 = fVar8 + 0.5;
    pfVar2[1] = unaff_s9;
    *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
    fStack0000000000000008 = unaff_s8 + *unaff_x20 + 0.5;
    fStack000000000000000c = fVar9 + 0.5;
    func_0x000f23c0();
    fStack0000000000000008 = (unaff_x20[2] - unaff_s8) + -0.5;
    fStack000000000000000c = fVar9 + 0.5;
    func_0x000f23c0();
    fVar8 = unaff_x20[2];
    iVar5 = *(int *)(unaff_x19 + 0x78);
    if (iVar5 == *(int *)(unaff_x19 + 0x7c)) {
      if (iVar5 == 0) {
        uVar6 = 8;
      }
      else {
        iVar3 = iVar5;
        if (iVar5 < 0) {
          iVar3 = iVar5 + 1;
        }
        uVar6 = iVar5 + (iVar3 >> 1);
      }
      if ((int)uVar6 <= (int)(iVar5 + 1U)) {
        uVar6 = iVar5 + 1U;
      }
      lVar4 = func_0x000b810c(-(ulong)(uVar6 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar6 << 3);
      if (*(long *)(unaff_x19 + 0x80) != 0) {
        _memcpy(lVar4,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
        func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
      }
      *(long *)(unaff_x19 + 0x80) = lVar4;
      *(uint *)(unaff_x19 + 0x7c) = uVar6;
      iVar5 = *(int *)(unaff_x19 + 0x78);
    }
    else {
      lVar4 = *(long *)(unaff_x19 + 0x80);
    }
    pfVar2 = (float *)(lVar4 + (long)iVar5 * 8);
    *pfVar2 = fVar8 + -0.5;
    pfVar2[1] = unaff_s9;
    *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
    func_0x000bba44(0x3f800000,5);
    func_0x000f0ff4(*(undefined4 *)(&UNK_00003974 + unaff_x23));
    *(undefined4 *)(unaff_x19 + 0x78) = 0;
  }
  return;
}

