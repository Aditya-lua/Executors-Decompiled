
void FUN_000ef774(void)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  int iVar5;
  int iVar6;
  long lVar7;
  long lVar8;
  undefined8 *puVar9;
  long lVar10;
  long *plVar11;
  long *plVar12;
  long unaff_x19;
  int *unaff_x20;
  int unaff_w22;
  undefined8 uVar13;
  int unaff_w23;
  long lVar14;
  int unaff_w24;
  long lVar15;
  long lVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  long lVar19;
  
  iVar6 = unaff_x20[5];
  uVar1 = unaff_x20[4] + unaff_w23;
  if (iVar6 < (int)uVar1) {
    iVar2 = iVar6;
    if (iVar6 < 0) {
      iVar2 = iVar6 + 1;
    }
    uVar4 = 8;
    if (iVar6 != 0) {
      uVar4 = iVar6 + (iVar2 >> 1);
    }
    if ((int)uVar4 <= (int)uVar1) {
      uVar4 = uVar1;
    }
    lVar8 = func_0x000b810c(-(ulong)(uVar4 >> 0x1f) & 0xfffffffe00000000 | (ulong)uVar4 << 1);
    if (*(long *)(unaff_x20 + 6) != 0) {
      _memcpy(lVar8,*(long *)(unaff_x20 + 6),(long)unaff_x20[4] << 1);
      func_0x000b83d4(*(undefined8 *)(unaff_x20 + 6));
    }
    *(long *)(unaff_x20 + 6) = lVar8;
    unaff_x20[4] = uVar1;
    unaff_x20[5] = uVar4;
    unaff_w24 = *unaff_x20;
    lVar8 = lVar8 + (long)(int)uVar1 * 2 + (long)unaff_w23 * -2;
    if (*(int *)(unaff_x19 + 4) < 2) goto LAB_000ef7f0;
LAB_000efa20:
    lVar15 = 0;
    lVar19 = *(long *)(unaff_x20 + 2) + (long)unaff_w24 * 0x38 + (long)unaff_w22 * -0x38;
    lVar10 = 1;
    do {
      lVar16 = *(long *)(unaff_x19 + 0x10);
      lVar14 = lVar16 + lVar15;
      if (*(int *)(lVar14 + 0x20) != 0) {
        lVar7 = (long)*(int *)(lVar14 + 0x20) * 0x38;
        _memcpy(lVar19,*(undefined8 *)(lVar14 + 0x28),lVar7);
        lVar19 = lVar19 + lVar7;
      }
      if (*(int *)(lVar14 + 0x30) != 0) {
        lVar14 = (long)*(int *)(lVar14 + 0x30) * 2;
        _memcpy(lVar8,*(undefined8 *)(lVar16 + lVar15 + 0x38),lVar14);
        lVar8 = lVar8 + lVar14;
      }
      lVar10 = lVar10 + 1;
      lVar15 = lVar15 + 0x20;
    } while (lVar10 < *(int *)(unaff_x19 + 4));
    unaff_w24 = *unaff_x20;
    *(long *)(unaff_x20 + 0x14) = lVar8;
  }
  else {
    unaff_x20[4] = uVar1;
    lVar8 = *(long *)(unaff_x20 + 6) + (long)(int)uVar1 * 2 + (long)unaff_w23 * -2;
    if (1 < *(int *)(unaff_x19 + 4)) goto LAB_000efa20;
LAB_000ef7f0:
    *(long *)(unaff_x20 + 0x14) = lVar8;
  }
  if (unaff_w24 != 0) {
    lVar8 = *(long *)(unaff_x20 + 2);
    lVar10 = (long)unaff_w24 + -1;
    if (*(long *)(lVar8 + lVar10 * 0x38 + 0x28) == 0) goto LAB_000efb90;
  }
  uVar18 = *(undefined8 *)(unaff_x20 + 0x24);
  uVar17 = *(undefined8 *)(unaff_x20 + 0x22);
  uVar13 = *(undefined8 *)(unaff_x20 + 0x26);
  iVar6 = unaff_x20[0x28];
  iVar2 = unaff_x20[4];
  if (unaff_w24 == unaff_x20[1]) {
    iVar3 = unaff_w24;
    if (unaff_w24 < 0) {
      iVar3 = unaff_w24 + 1;
    }
    iVar5 = 8;
    if (unaff_w24 != 0) {
      iVar5 = unaff_w24 + (iVar3 >> 1);
    }
    if (iVar5 <= unaff_w24 + 1) {
      iVar5 = unaff_w24 + 1;
    }
    lVar8 = func_0x000b810c((long)iVar5 * 0x38);
    if (*(long *)(unaff_x20 + 2) != 0) {
      _memcpy(lVar8,*(long *)(unaff_x20 + 2),(long)*unaff_x20 * 0x38);
      func_0x000b83d4(*(undefined8 *)(unaff_x20 + 2));
    }
    *(long *)(unaff_x20 + 2) = lVar8;
    unaff_x20[1] = iVar5;
    unaff_w24 = *unaff_x20;
  }
  else {
    lVar8 = *(long *)(unaff_x20 + 2);
  }
  puVar9 = (undefined8 *)(lVar8 + (long)unaff_w24 * 0x38);
  puVar9[1] = uVar18;
  *puVar9 = uVar17;
  puVar9[2] = uVar13;
  *(int *)(puVar9 + 3) = iVar6;
  *(int *)((long)puVar9 + 0x1c) = iVar2;
  puVar9[5] = 0;
  puVar9[6] = 0;
  puVar9[4] = 0;
  lVar10 = (long)*unaff_x20;
  unaff_w24 = *unaff_x20 + 1;
  *unaff_x20 = unaff_w24;
  lVar8 = *(long *)(unaff_x20 + 2);
LAB_000efb90:
  plVar12 = (long *)(lVar8 + lVar10 * 0x38);
  plVar11 = (long *)(unaff_x20 + 0x22);
  if ((int)plVar12[4] == 0) {
    lVar10 = *(long *)(unaff_x20 + 0x24);
    lVar8 = *plVar11;
    uVar13 = *(undefined8 *)(unaff_x20 + 0x25);
    *(undefined8 *)((long)plVar12 + 0x14) = *(undefined8 *)(unaff_x20 + 0x27);
    *(undefined8 *)((long)plVar12 + 0xc) = uVar13;
    plVar12[1] = lVar10;
    *plVar12 = lVar8;
  }
  else if (((*plVar12 != *plVar11 || plVar12[1] != *(long *)(unaff_x20 + 0x24)) ||
           plVar12[2] != *(long *)(unaff_x20 + 0x26)) || (int)plVar12[3] != unaff_x20[0x28]) {
    lVar19 = *(long *)(unaff_x20 + 0x24);
    lVar15 = *plVar11;
    lVar10 = *(long *)(unaff_x20 + 0x26);
    iVar6 = unaff_x20[0x28];
    iVar2 = unaff_x20[4];
    if (unaff_w24 == unaff_x20[1]) {
      iVar3 = unaff_w24;
      if (unaff_w24 < 0) {
        iVar3 = unaff_w24 + 1;
      }
      iVar5 = 8;
      if (unaff_w24 != 0) {
        iVar5 = unaff_w24 + (iVar3 >> 1);
      }
      if (iVar5 <= unaff_w24 + 1) {
        iVar5 = unaff_w24 + 1;
      }
      lVar8 = func_0x000b810c((long)iVar5 * 0x38);
      if (*(long *)(unaff_x20 + 2) != 0) {
        _memcpy(lVar8,*(long *)(unaff_x20 + 2),(long)*unaff_x20 * 0x38);
        func_0x000b83d4(*(undefined8 *)(unaff_x20 + 2));
      }
      *(long *)(unaff_x20 + 2) = lVar8;
      unaff_x20[1] = iVar5;
      unaff_w24 = *unaff_x20;
    }
    plVar11 = (long *)(lVar8 + (long)unaff_w24 * 0x38);
    plVar11[1] = lVar19;
    *plVar11 = lVar15;
    plVar11[2] = lVar10;
    *(int *)(plVar11 + 3) = iVar6;
    *(int *)((long)plVar11 + 0x1c) = iVar2;
    plVar11[5] = 0;
    plVar11[6] = 0;
    plVar11[4] = 0;
    *unaff_x20 = *unaff_x20 + 1;
  }
  *(undefined4 *)(unaff_x19 + 4) = 1;
  return;
}

