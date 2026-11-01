
void FUN_000f2a1c(undefined1 param_1 [16],float param_2)

{
  int iVar1;
  uint uVar2;
  long lVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  int unaff_w21;
  int iVar4;
  undefined8 unaff_x22;
  undefined4 unaff_w23;
  int iVar5;
  float fVar6;
  float fVar7;
  float fVar8;
  undefined8 uVar9;
  float unaff_s9;
  float unaff_s10;
  float unaff_s11;
  undefined8 uVar10;
  undefined8 in_stack_00000018;
  
  _memcpy();
  func_0x000b83d4(*(undefined8 *)(unaff_x20 + 0x80));
  *(undefined8 *)(unaff_x20 + 0x80) = unaff_x22;
  *(undefined4 *)(unaff_x20 + 0x7c) = unaff_w23;
  fVar6 = (float)___sincosf_stret();
  iVar4 = 0;
  iVar5 = *(int *)(unaff_x20 + 0x78);
  uVar10 = NEON_rev64(CONCAT44(param_2,fVar6),4);
  do {
    fVar8 = in_stack_00000018._4_4_;
    fVar7 = (float)___sincosf_stret(in_stack_00000018._4_4_ +
                                    (unaff_s11 - in_stack_00000018._4_4_) *
                                    ((float)iVar4 / (float)unaff_w21));
    uVar9 = *unaff_x19;
    if (iVar5 == *(int *)(unaff_x20 + 0x7c)) {
      iVar1 = iVar5;
      if (iVar5 < 0) {
        iVar1 = iVar5 + 1;
      }
      uVar2 = 8;
      if (iVar5 != 0) {
        uVar2 = iVar5 + (iVar1 >> 1);
      }
      if ((int)uVar2 <= (int)(iVar5 + 1U)) {
        uVar2 = iVar5 + 1U;
      }
      lVar3 = func_0x000b810c(-(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar2 << 3);
      if (*(long *)(unaff_x20 + 0x80) != 0) {
        _memcpy(lVar3,*(long *)(unaff_x20 + 0x80),(long)*(int *)(unaff_x20 + 0x78) << 3);
        func_0x000b83d4(*(undefined8 *)(unaff_x20 + 0x80));
      }
      *(long *)(unaff_x20 + 0x80) = lVar3;
      *(uint *)(unaff_x20 + 0x7c) = uVar2;
      iVar5 = *(int *)(unaff_x20 + 0x78);
    }
    else {
      lVar3 = *(long *)(unaff_x20 + 0x80);
    }
    *(ulong *)(lVar3 + (long)iVar5 * 8) =
         CONCAT44(param_2 * fVar7 * unaff_s9 + (float)((ulong)uVar10 >> 0x20) * fVar8 * unaff_s10 +
                  (float)((ulong)uVar9 >> 0x20),
                  fVar6 * -(fVar7 * unaff_s9) + (float)uVar10 * fVar8 * unaff_s10 + (float)uVar9);
    iVar5 = *(int *)(unaff_x20 + 0x78) + 1;
    *(int *)(unaff_x20 + 0x78) = iVar5;
    iVar4 = iVar4 + 1;
  } while (unaff_w21 + 1 != iVar4);
  return;
}

