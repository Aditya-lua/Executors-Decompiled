/* 7ff70c911c00 FUN_7ff70c911c00 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c911c00(void)

{
  int *piVar1;
  undefined8 *puVar2;
  undefined4 *puVar3;
  longlong lVar4;
  int *piVar5;
  code *pcVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  undefined8 uVar14;
  int iVar15;
  int iVar16;
  longlong lVar17;
  ulonglong uVar18;
  int *piVar19;
  int iVar20;
  int iVar21;
  longlong lVar22;
  int iVar23;
  undefined1 auStack_78 [32];
  undefined8 uStack_58;
  undefined8 uStack_50;
  int iStack_48;
  int iStack_44;
  int iStack_40;
  int iStack_3c;
  ulonglong uStack_38;
  
  uVar18 = _DAT_7ff70cbebd80 ^ (ulonglong)&stack0xffffffffffffffd8;
  lVar22 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  lVar4 = *(longlong *)(lVar22 + 0x1c8);
  if (*(int *)(lVar4 + 0x10) == 1) {
    if (_DAT_7ff70cbebd80 == (uVar18 ^ (ulonglong)&stack0xffffffffffffffd8)) {
      return;
    }
LAB_7ff70c911caf:
    FUN_7ff70caa97e0(uVar18 ^ (ulonglong)&stack0xffffffffffffffd8);
    pcVar6 = (code *)swi(3);
    (*pcVar6)();
    return;
  }
  uVar7 = *(undefined4 *)(lVar4 + 0x3c);
  uVar8 = *(undefined4 *)(lVar4 + 0x40);
  uVar9 = *(undefined4 *)(lVar4 + 0x44);
  uVar10 = *(undefined4 *)(lVar4 + 0x48);
  uVar11 = *(undefined4 *)(lVar4 + 0x40);
  uVar12 = *(undefined4 *)(lVar4 + 0x44);
  uVar13 = *(undefined4 *)(lVar4 + 0x48);
  *(undefined4 *)(lVar22 + 0x260) = *(undefined4 *)(lVar4 + 0x3c);
  *(undefined4 *)(lVar22 + 0x264) = uVar11;
  *(undefined4 *)(lVar22 + 0x268) = uVar12;
  *(undefined4 *)(lVar22 + 0x26c) = uVar13;
  lVar17 = *(longlong *)(lVar22 + 0x2c8);
  *(undefined4 *)(lVar17 + 0x60) = uVar7;
  *(undefined4 *)(lVar17 + 100) = uVar8;
  *(undefined4 *)(lVar17 + 0x68) = uVar9;
  *(undefined4 *)(lVar17 + 0x6c) = uVar10;
  puVar3 = (undefined4 *)
           (*(longlong *)(*(longlong *)(lVar22 + 0x2c8) + 0xa8) + -0x10 +
           (longlong)*(int *)(*(longlong *)(lVar22 + 0x2c8) + 0xa0) * 0x10);
  *puVar3 = uVar7;
  puVar3[1] = uVar8;
  puVar3[2] = uVar9;
  puVar3[3] = uVar10;
  piVar5 = *(int **)(lVar22 + 0x2c8);
  if (_DAT_7ff70cbebd80 != (uVar18 ^ (ulonglong)&stack0xffffffffffffffd8)) goto LAB_7ff70c911caf;
  piVar19 = (int *)(lVar4 + 0x70);
  iVar20 = *(int *)(lVar4 + 0xc) + 1;
  uStack_38 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  if (*piVar19 == iVar20) goto LAB_7ff70c7c6973;
  uVar14 = *(undefined8 *)(piVar5 + 2);
  puVar2 = (undefined8 *)(*(longlong *)(lVar4 + 0x80) + (longlong)*piVar19 * 0x20);
  *puVar2 = *(undefined8 *)piVar5;
  puVar2[1] = uVar14;
  uVar14 = *(undefined8 *)(piVar5 + 6);
  puVar2 = (undefined8 *)(*(longlong *)(lVar4 + 0x80) + 0x10 + (longlong)*piVar19 * 0x20);
  *puVar2 = *(undefined8 *)(piVar5 + 4);
  puVar2[1] = uVar14;
  *piVar19 = iVar20;
  puVar2 = (undefined8 *)(*(longlong *)(lVar4 + 0x80) + (longlong)iVar20 * 0x20);
  uVar14 = puVar2[1];
  *(undefined8 *)piVar5 = *puVar2;
  *(undefined8 *)(piVar5 + 2) = uVar14;
  piVar19 = (int *)(*(longlong *)(lVar4 + 0x80) + 0x10 + (longlong)iVar20 * 0x20);
  iVar20 = piVar19[1];
  iVar21 = piVar19[2];
  iVar15 = piVar19[3];
  piVar5[4] = *piVar19;
  piVar5[5] = iVar20;
  piVar5[6] = iVar21;
  piVar5[7] = iVar15;
  iVar20 = piVar5[4];
  *(longlong *)(piVar5 + 0x12) = (longlong)iVar20 * 2 + *(longlong *)(piVar5 + 6);
  iVar21 = *piVar5;
  lVar22 = (longlong)iVar21;
  if (lVar22 == 0) {
LAB_7ff70c7c689d:
    uStack_58 = *(undefined8 *)(piVar5 + 0x18);
    uStack_50 = *(undefined8 *)(piVar5 + 0x1a);
    iStack_48 = piVar5[0x1c];
    iStack_44 = piVar5[0x1d];
    iStack_40 = piVar5[0x1e];
    iStack_3c = piVar5[0x1f];
    iVar15 = piVar5[0x20];
    if (iVar21 == piVar5[1]) {
      if (iVar21 == 0) {
        iVar16 = 8;
      }
      else {
        iVar16 = iVar21 / 2 + iVar21;
      }
      iVar23 = iVar21 + 1;
      if (iVar21 + 1 < iVar16) {
        iVar23 = iVar16;
      }
      lVar17 = FUN_7ff70c802100((longlong)iVar23 * 0x48);
      if (*(longlong *)(piVar5 + 2) != 0) {
        FUN_7ff70cb12b60(lVar17,*(longlong *)(piVar5 + 2),(longlong)*piVar5 * 0x48);
        FUN_7ff70c802510(*(undefined8 *)(piVar5 + 2));
      }
      *(longlong *)(piVar5 + 2) = lVar17;
      piVar5[1] = iVar23;
      iVar21 = *piVar5;
    }
    else {
      lVar17 = *(longlong *)(piVar5 + 2);
    }
    lVar22 = (longlong)iVar21;
  }
  else {
    lVar17 = *(longlong *)(piVar5 + 2);
    lVar4 = lVar17 + lVar22 * 0x48;
    piVar19 = (int *)(lVar4 + -0x48);
    if (piVar19 == (int *)0x0) goto LAB_7ff70c7c689d;
    piVar1 = piVar5 + 0x18;
    if (*(int *)(lVar4 + -0x20) == 0) {
      *(int *)(lVar4 + -0x28) = piVar5[0x20];
      iVar20 = *piVar1;
      iVar21 = piVar5[0x19];
      iVar15 = piVar5[0x1a];
      iVar16 = piVar5[0x1b];
      uVar14 = *(undefined8 *)(piVar5 + 0x1e);
      *(undefined8 *)(lVar4 + -0x38) = *(undefined8 *)(piVar5 + 0x1c);
      *(undefined8 *)(lVar4 + -0x30) = uVar14;
      *piVar19 = iVar20;
      *(int *)(lVar4 + -0x44) = iVar21;
      *(int *)(lVar4 + -0x40) = iVar15;
      *(int *)(lVar4 + -0x3c) = iVar16;
      goto LAB_7ff70c7c6973;
    }
    iVar15 = FUN_7ff70cb12b50(piVar19,piVar1,0x24);
    if (iVar15 == 0) goto LAB_7ff70c7c6973;
    uStack_58 = *(undefined8 *)piVar1;
    uStack_50 = *(undefined8 *)(piVar5 + 0x1a);
    iStack_48 = piVar5[0x1c];
    iStack_44 = piVar5[0x1d];
    iStack_40 = piVar5[0x1e];
    iStack_3c = piVar5[0x1f];
    iVar15 = piVar5[0x20];
    if (iVar21 == piVar5[1]) {
      iVar16 = 1;
      if (1 < iVar21 / 2) {
        iVar16 = iVar21 / 2;
      }
      lVar17 = FUN_7ff70c802100((longlong)(iVar16 + iVar21) * 0x48);
      if (*(longlong *)(piVar5 + 2) != 0) {
        FUN_7ff70cb12b60(lVar17,*(longlong *)(piVar5 + 2),(longlong)*piVar5 * 0x48);
        FUN_7ff70c802510(*(undefined8 *)(piVar5 + 2));
      }
      *(longlong *)(piVar5 + 2) = lVar17;
      piVar5[1] = iVar16 + iVar21;
      lVar22 = (longlong)*piVar5;
    }
  }
  puVar2 = (undefined8 *)(lVar17 + 0x10 + lVar22 * 0x48);
  *puVar2 = CONCAT44(iStack_44,iStack_48);
  puVar2[1] = CONCAT44(iStack_3c,iStack_40);
  puVar2 = (undefined8 *)(lVar17 + lVar22 * 0x48);
  *puVar2 = uStack_58;
  puVar2[1] = uStack_50;
  *(int *)(lVar17 + 0x20 + lVar22 * 0x48) = iVar15;
  *(int *)(lVar17 + 0x24 + lVar22 * 0x48) = iVar20;
  puVar2 = (undefined8 *)(lVar17 + 0x28 + lVar22 * 0x48);
  *puVar2 = 0;
  puVar2[1] = 0;
  puVar2 = (undefined8 *)(lVar17 + 0x38 + lVar22 * 0x48);
  *puVar2 = 0;
  puVar2[1] = 0;
  *piVar5 = *piVar5 + 1;
LAB_7ff70c7c6973:
  if (_DAT_7ff70cbebd80 != (uStack_38 ^ (ulonglong)auStack_78)) {
    FUN_7ff70caa97e0(uStack_38 ^ (ulonglong)auStack_78);
    pcVar6 = (code *)swi(3);
    (*pcVar6)();
    return;
  }
  return;
}


