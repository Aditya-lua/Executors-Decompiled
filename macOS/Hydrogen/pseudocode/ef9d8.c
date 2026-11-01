
void FUN_000ef9d8(void)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  long lVar7;
  undefined8 *puVar8;
  long *plVar9;
  long *plVar10;
  long unaff_x19;
  int *unaff_x20;
  undefined8 unaff_x21;
  long lVar11;
  int unaff_w22;
  undefined8 uVar12;
  int unaff_w23;
  long lVar13;
  int unaff_w24;
  long lVar14;
  int unaff_w25;
  long lVar15;
  long lVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  long lVar19;
  
  _memcpy();
  func_0x000b83d4(*(undefined8 *)(unaff_x20 + 2));
  *(undefined8 *)(unaff_x20 + 2) = unaff_x21;
  *unaff_x20 = unaff_w24;
  unaff_x20[1] = unaff_w25;
  iVar5 = unaff_x20[5];
  uVar1 = unaff_x20[4] + unaff_w23;
  if (iVar5 < (int)uVar1) {
    iVar6 = iVar5;
    if (iVar5 < 0) {
      iVar6 = iVar5 + 1;
    }
    uVar3 = 8;
    if (iVar5 != 0) {
      uVar3 = iVar5 + (iVar6 >> 1);
    }
    if ((int)uVar3 <= (int)uVar1) {
      uVar3 = uVar1;
    }
    lVar11 = func_0x000b810c(-(ulong)(uVar3 >> 0x1f) & 0xfffffffe00000000 | (ulong)uVar3 << 1);
    if (*(long *)(unaff_x20 + 6) != 0) {
      _memcpy(lVar11,*(long *)(unaff_x20 + 6),(long)unaff_x20[4] << 1);
      func_0x000b83d4(*(undefined8 *)(unaff_x20 + 6));
    }
    *(long *)(unaff_x20 + 6) = lVar11;
    unaff_x20[4] = uVar1;
    unaff_x20[5] = uVar3;
    unaff_w24 = *unaff_x20;
    lVar11 = lVar11 + (long)(int)uVar1 * 2 + (long)unaff_w23 * -2;
    if (*(int *)(unaff_x19 + 4) < 2) goto LAB_000ef7f0;
code_r0x000efa20:
    lVar15 = 0;
    lVar19 = *(long *)(unaff_x20 + 2) + (long)unaff_w24 * 0x38 + (long)unaff_w22 * -0x38;
    lVar14 = 1;
    do {
      lVar16 = *(long *)(unaff_x19 + 0x10);
      lVar13 = lVar16 + lVar15;
      if (*(int *)(lVar13 + 0x20) != 0) {
        lVar7 = (long)*(int *)(lVar13 + 0x20) * 0x38;
        _memcpy(lVar19,*(undefined8 *)(lVar13 + 0x28),lVar7);
        lVar19 = lVar19 + lVar7;
      }
      if (*(int *)(lVar13 + 0x30) != 0) {
        lVar13 = (long)*(int *)(lVar13 + 0x30) * 2;
        _memcpy(lVar11,*(undefined8 *)(lVar16 + lVar15 + 0x38),lVar13);
        lVar11 = lVar11 + lVar13;
      }
      lVar14 = lVar14 + 1;
      lVar15 = lVar15 + 0x20;
    } while (lVar14 < *(int *)(unaff_x19 + 4));
    unaff_w24 = *unaff_x20;
    *(long *)(unaff_x20 + 0x14) = lVar11;
  }
  else {
    unaff_x20[4] = uVar1;
    lVar11 = *(long *)(unaff_x20 + 6) + (long)(int)uVar1 * 2 + (long)unaff_w23 * -2;
    if (1 < *(int *)(unaff_x19 + 4)) goto code_r0x000efa20;
LAB_000ef7f0:
    *(long *)(unaff_x20 + 0x14) = lVar11;
  }
  if (unaff_w24 != 0) {
    lVar11 = *(long *)(unaff_x20 + 2);
    lVar14 = (long)unaff_w24 + -1;
    if (*(long *)(lVar11 + lVar14 * 0x38 + 0x28) == 0) goto LAB_000efb90;
  }
  uVar18 = *(undefined8 *)(unaff_x20 + 0x24);
  uVar17 = *(undefined8 *)(unaff_x20 + 0x22);
  uVar12 = *(undefined8 *)(unaff_x20 + 0x26);
  iVar5 = unaff_x20[0x28];
  iVar6 = unaff_x20[4];
  if (unaff_w24 == unaff_x20[1]) {
    iVar2 = unaff_w24;
    if (unaff_w24 < 0) {
      iVar2 = unaff_w24 + 1;
    }
    iVar4 = 8;
    if (unaff_w24 != 0) {
      iVar4 = unaff_w24 + (iVar2 >> 1);
    }
    if (iVar4 <= unaff_w24 + 1) {
      iVar4 = unaff_w24 + 1;
    }
    lVar11 = func_0x000b810c((long)iVar4 * 0x38);
    if (*(long *)(unaff_x20 + 2) != 0) {
      _memcpy(lVar11,*(long *)(unaff_x20 + 2),(long)*unaff_x20 * 0x38);
      func_0x000b83d4(*(undefined8 *)(unaff_x20 + 2));
    }
    *(long *)(unaff_x20 + 2) = lVar11;
    unaff_x20[1] = iVar4;
    unaff_w24 = *unaff_x20;
  }
  else {
    lVar11 = *(long *)(unaff_x20 + 2);
  }
  puVar8 = (undefined8 *)(lVar11 + (long)unaff_w24 * 0x38);
  puVar8[1] = uVar18;
  *puVar8 = uVar17;
  puVar8[2] = uVar12;
  *(int *)(puVar8 + 3) = iVar5;
  *(int *)((long)puVar8 + 0x1c) = iVar6;
  puVar8[5] = 0;
  puVar8[6] = 0;
  puVar8[4] = 0;
  lVar14 = (long)*unaff_x20;
  unaff_w24 = *unaff_x20 + 1;
  *unaff_x20 = unaff_w24;
  lVar11 = *(long *)(unaff_x20 + 2);
LAB_000efb90:
  plVar10 = (long *)(lVar11 + lVar14 * 0x38);
  plVar9 = (long *)(unaff_x20 + 0x22);
  if ((int)plVar10[4] == 0) {
    lVar14 = *(long *)(unaff_x20 + 0x24);
    lVar11 = *plVar9;
    uVar12 = *(undefined8 *)(unaff_x20 + 0x25);
    *(undefined8 *)((long)plVar10 + 0x14) = *(undefined8 *)(unaff_x20 + 0x27);
    *(undefined8 *)((long)plVar10 + 0xc) = uVar12;
    plVar10[1] = lVar14;
    *plVar10 = lVar11;
  }
  else if (((*plVar10 != *plVar9 || plVar10[1] != *(long *)(unaff_x20 + 0x24)) ||
           plVar10[2] != *(long *)(unaff_x20 + 0x26)) || (int)plVar10[3] != unaff_x20[0x28]) {
    lVar19 = *(long *)(unaff_x20 + 0x24);
    lVar15 = *plVar9;
    lVar14 = *(long *)(unaff_x20 + 0x26);
    iVar5 = unaff_x20[0x28];
    iVar6 = unaff_x20[4];
    if (unaff_w24 == unaff_x20[1]) {
      iVar2 = unaff_w24;
      if (unaff_w24 < 0) {
        iVar2 = unaff_w24 + 1;
      }
      iVar4 = 8;
      if (unaff_w24 != 0) {
        iVar4 = unaff_w24 + (iVar2 >> 1);
      }
      if (iVar4 <= unaff_w24 + 1) {
        iVar4 = unaff_w24 + 1;
      }
      lVar11 = func_0x000b810c((long)iVar4 * 0x38);
      if (*(long *)(unaff_x20 + 2) != 0) {
        _memcpy(lVar11,*(long *)(unaff_x20 + 2),(long)*unaff_x20 * 0x38);
        func_0x000b83d4(*(undefined8 *)(unaff_x20 + 2));
      }
      *(long *)(unaff_x20 + 2) = lVar11;
      unaff_x20[1] = iVar4;
      unaff_w24 = *unaff_x20;
    }
    plVar9 = (long *)(lVar11 + (long)unaff_w24 * 0x38);
    plVar9[1] = lVar19;
    *plVar9 = lVar15;
    plVar9[2] = lVar14;
    *(int *)(plVar9 + 3) = iVar5;
    *(int *)((long)plVar9 + 0x1c) = iVar6;
    plVar9[5] = 0;
    plVar9[6] = 0;
    plVar9[4] = 0;
    *unaff_x20 = *unaff_x20 + 1;
  }
  *(undefined4 *)(unaff_x19 + 4) = 1;
  return;
}

