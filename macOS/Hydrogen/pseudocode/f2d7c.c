
void FUN_000f2d7c(ulong param_1)

{
  int iVar1;
  uint uVar2;
  int iVar3;
  long lVar4;
  int iVar5;
  int *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x22;
  int unaff_w23;
  undefined8 *unaff_x24;
  int unaff_w26;
  uint unaff_w27;
  ulong unaff_x28;
  float fVar6;
  float fVar7;
  float fVar8;
  float fVar9;
  float unaff_s8;
  float unaff_s9;
  float unaff_s10;
  undefined8 unaff_d11;
  undefined8 unaff_d12;
  undefined8 unaff_d13;
  undefined8 in_stack_00000010;
  
  do {
    lVar4 = func_0x000b810c(param_1);
    if (*(long *)(unaff_x21 + 0x80) != 0) {
      _memcpy(lVar4,*(long *)(unaff_x21 + 0x80),(long)*(int *)(unaff_x21 + 0x78) << 3);
      func_0x000b83d4(*(undefined8 *)(unaff_x21 + 0x80));
    }
    *(long *)(unaff_x21 + 0x80) = lVar4;
    *(int *)(unaff_x21 + 0x7c) = (int)unaff_x28;
    iVar5 = *(int *)(unaff_x21 + 0x78);
    while( true ) {
      fVar9 = unaff_s9 * (float)(unaff_w26 + 1);
      fVar6 = unaff_s8 - fVar9;
      fVar8 = fVar6 * fVar6 * fVar6;
      fVar7 = fVar9 * fVar6 * fVar6 * unaff_s10;
      fVar6 = fVar9 * fVar9 * fVar6 * unaff_s10;
      fVar9 = fVar9 * fVar9 * fVar9;
      *(ulong *)(lVar4 + (long)iVar5 * 8) =
           CONCAT44((float)((ulong)unaff_d13 >> 0x20) * fVar7 +
                    (float)((ulong)in_stack_00000010 >> 0x20) * fVar8 +
                    (float)((ulong)unaff_d12 >> 0x20) * fVar6 +
                    (float)((ulong)unaff_d11 >> 0x20) * fVar9,
                    (float)unaff_d13 * fVar7 + (float)in_stack_00000010 * fVar8 +
                    (float)unaff_d12 * fVar6 + (float)unaff_d11 * fVar9);
      iVar3 = *unaff_x19;
      iVar5 = iVar3 + 1;
      *unaff_x19 = iVar5;
      unaff_w26 = unaff_w26 + 1;
      if (unaff_w23 == unaff_w26) {
        return;
      }
      unaff_d13 = *unaff_x24;
      unaff_d12 = *unaff_x22;
      unaff_d11 = *unaff_x20;
      if (iVar5 == *(int *)(unaff_x21 + 0x7c)) break;
      lVar4 = *(long *)(unaff_x21 + 0x80);
    }
    iVar1 = iVar5;
    if (iVar5 < 0) {
      iVar1 = iVar3 + 2;
    }
    uVar2 = unaff_w27;
    if (iVar5 != 0) {
      uVar2 = iVar5 + (iVar1 >> 1);
    }
    if ((int)uVar2 <= (int)(iVar3 + 2U)) {
      uVar2 = iVar3 + 2U;
    }
    unaff_x28 = (ulong)uVar2;
    param_1 = -(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | unaff_x28 << 3;
  } while( true );
}

