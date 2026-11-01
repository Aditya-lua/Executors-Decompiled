
void FUN_000f2794(undefined1 param_1 [16],undefined1 param_2 [16],float param_3)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  int iVar4;
  int in_w8;
  int iVar5;
  uint uVar6;
  long unaff_x19;
  undefined8 *unaff_x20;
  int iVar7;
  float fVar8;
  float fVar9;
  undefined8 uVar10;
  float unaff_s8;
  float unaff_s9;
  float unaff_s10;
  
  uVar6 = in_w8 + 2;
  if (-2 < in_w8) {
    uVar6 = in_w8 + 1;
  }
  uVar6 = uVar6 & 0xfffffffe;
  if (0x1ff < (int)uVar6) {
    uVar6 = 0x200;
  }
  if ((int)uVar6 < 5) {
    uVar6 = 4;
  }
  iVar5 = (int)((unaff_s10 * (float)(int)uVar6) / 6.2831855);
  if (iVar5 <= (int)(6.2831855 / unaff_s10)) {
    iVar5 = (int)(6.2831855 / unaff_s10);
  }
  iVar4 = *(int *)(unaff_x19 + 0x78);
  uVar10 = 0x3f000000;
  if (0.5 <= param_3) {
    uVar6 = iVar5 + iVar4 + 1;
    if (*(int *)(unaff_x19 + 0x7c) < (int)uVar6) {
      uVar3 = func_0x000b810c(-(ulong)(uVar6 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar6 << 3);
      if (*(long *)(unaff_x19 + 0x80) != 0) {
        _memcpy(uVar3,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
        func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
      }
      *(undefined8 *)(unaff_x19 + 0x80) = uVar3;
      *(uint *)(unaff_x19 + 0x7c) = uVar6;
    }
    if (-1 < iVar5) {
      iVar7 = 0;
      iVar4 = *(int *)(unaff_x19 + 0x78);
      do {
        fVar9 = (float)uVar10;
        fVar8 = (float)___sincosf_stret(unaff_s9 +
                                        (unaff_s8 - unaff_s9) * ((float)iVar7 / (float)iVar5));
        uVar3 = *unaff_x20;
        if (iVar4 == *(int *)(unaff_x19 + 0x7c)) {
          iVar1 = iVar4;
          if (iVar4 < 0) {
            iVar1 = iVar4 + 1;
          }
          uVar6 = 8;
          if (iVar4 != 0) {
            uVar6 = iVar4 + (iVar1 >> 1);
          }
          if ((int)uVar6 <= (int)(iVar4 + 1U)) {
            uVar6 = iVar4 + 1U;
          }
          lVar2 = func_0x000b810c(-(ulong)(uVar6 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar6 << 3);
          if (*(long *)(unaff_x19 + 0x80) != 0) {
            _memcpy(lVar2,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
            func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
          }
          *(long *)(unaff_x19 + 0x80) = lVar2;
          *(uint *)(unaff_x19 + 0x7c) = uVar6;
          iVar4 = *(int *)(unaff_x19 + 0x78);
        }
        else {
          lVar2 = *(long *)(unaff_x19 + 0x80);
        }
        uVar10 = CONCAT44(fVar8,fVar9);
        *(ulong *)(lVar2 + (long)iVar4 * 8) =
             CONCAT44((float)((ulong)uVar3 >> 0x20) + param_3 * fVar8,(float)uVar3 + param_3 * fVar9
                     );
        iVar4 = *(int *)(unaff_x19 + 0x78) + 1;
        *(int *)(unaff_x19 + 0x78) = iVar4;
        iVar7 = iVar7 + 1;
      } while (iVar5 + 1 != iVar7);
    }
  }
  else {
    if (iVar4 == *(int *)(unaff_x19 + 0x7c)) {
      iVar5 = iVar4;
      if (iVar4 < 0) {
        iVar5 = iVar4 + 1;
      }
      uVar6 = 8;
      if (iVar4 != 0) {
        uVar6 = iVar4 + (iVar5 >> 1);
      }
      if ((int)uVar6 <= (int)(iVar4 + 1U)) {
        uVar6 = iVar4 + 1U;
      }
      lVar2 = func_0x000b810c(-(ulong)(uVar6 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar6 << 3);
      if (*(long *)(unaff_x19 + 0x80) != 0) {
        _memcpy(lVar2,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
        func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
      }
      *(long *)(unaff_x19 + 0x80) = lVar2;
      *(uint *)(unaff_x19 + 0x7c) = uVar6;
      iVar4 = *(int *)(unaff_x19 + 0x78);
    }
    else {
      lVar2 = *(long *)(unaff_x19 + 0x80);
    }
    *(undefined8 *)(lVar2 + (long)iVar4 * 8) = *unaff_x20;
    *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  }
  return;
}

