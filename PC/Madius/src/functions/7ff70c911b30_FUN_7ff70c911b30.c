/* 7ff70c911b30 FUN_7ff70c911b30 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c911b30(void)

{
  int *piVar1;
  undefined8 *puVar2;
  undefined4 *puVar3;
  int iVar4;
  longlong lVar5;
  int *piVar6;
  code *pcVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  undefined4 uVar14;
  undefined8 uVar15;
  int iVar16;
  int iVar17;
  longlong lVar18;
  ulonglong uVar19;
  int *piVar20;
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
  
  uVar19 = _DAT_7ff70cbebd80 ^ (ulonglong)&stack0xffffffffffffffd8;
  lVar22 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  lVar5 = *(longlong *)(lVar22 + 0x1c8);
  if (*(int *)(lVar5 + 0x10) == 1) {
    if (_DAT_7ff70cbebd80 == (uVar19 ^ (ulonglong)&stack0xffffffffffffffd8)) {
      return;
    }
LAB_7ff70c911be6:
    FUN_7ff70caa97e0(uVar19 ^ (ulonglong)&stack0xffffffffffffffd8);
    pcVar7 = (code *)swi(3);
    (*pcVar7)();
    return;
  }
  uVar15 = *(undefined8 *)(lVar22 + 0x268);
  *(undefined8 *)(lVar5 + 0x3c) = *(undefined8 *)(lVar22 + 0x260);
  *(undefined8 *)(lVar5 + 0x44) = uVar15;
  uVar8 = *(undefined4 *)(lVar5 + 0x2c);
  uVar9 = *(undefined4 *)(lVar5 + 0x30);
  uVar10 = *(undefined4 *)(lVar5 + 0x34);
  uVar11 = *(undefined4 *)(lVar5 + 0x38);
  uVar12 = *(undefined4 *)(lVar5 + 0x30);
  uVar13 = *(undefined4 *)(lVar5 + 0x34);
  uVar14 = *(undefined4 *)(lVar5 + 0x38);
  *(undefined4 *)(lVar22 + 0x260) = *(undefined4 *)(lVar5 + 0x2c);
  *(undefined4 *)(lVar22 + 0x264) = uVar12;
  *(undefined4 *)(lVar22 + 0x268) = uVar13;
  *(undefined4 *)(lVar22 + 0x26c) = uVar14;
  lVar18 = *(longlong *)(lVar22 + 0x2c8);
  *(undefined4 *)(lVar18 + 0x60) = uVar8;
  *(undefined4 *)(lVar18 + 100) = uVar9;
  *(undefined4 *)(lVar18 + 0x68) = uVar10;
  *(undefined4 *)(lVar18 + 0x6c) = uVar11;
  puVar3 = (undefined4 *)
           (*(longlong *)(*(longlong *)(lVar22 + 0x2c8) + 0xa8) + -0x10 +
           (longlong)*(int *)(*(longlong *)(lVar22 + 0x2c8) + 0xa0) * 0x10);
  *puVar3 = uVar8;
  puVar3[1] = uVar9;
  puVar3[2] = uVar10;
  puVar3[3] = uVar11;
  piVar6 = *(int **)(lVar22 + 0x2c8);
  if (_DAT_7ff70cbebd80 != (uVar19 ^ (ulonglong)&stack0xffffffffffffffd8)) goto LAB_7ff70c911be6;
  piVar20 = (int *)(lVar5 + 0x70);
  uStack_38 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  if (*piVar20 == 0) goto LAB_7ff70c7c6973;
  uVar15 = *(undefined8 *)(piVar6 + 2);
  puVar2 = (undefined8 *)(*(longlong *)(lVar5 + 0x80) + (longlong)*piVar20 * 0x20);
  *puVar2 = *(undefined8 *)piVar6;
  puVar2[1] = uVar15;
  uVar15 = *(undefined8 *)(piVar6 + 6);
  puVar2 = (undefined8 *)(*(longlong *)(lVar5 + 0x80) + 0x10 + (longlong)*piVar20 * 0x20);
  *puVar2 = *(undefined8 *)(piVar6 + 4);
  puVar2[1] = uVar15;
  *piVar20 = 0;
  uVar15 = (*(undefined8 **)(lVar5 + 0x80))[1];
  *(undefined8 *)piVar6 = **(undefined8 **)(lVar5 + 0x80);
  *(undefined8 *)(piVar6 + 2) = uVar15;
  lVar22 = *(longlong *)(lVar5 + 0x80);
  iVar4 = *(int *)(lVar22 + 0x14);
  iVar21 = *(int *)(lVar22 + 0x18);
  iVar16 = *(int *)(lVar22 + 0x1c);
  piVar6[4] = *(int *)(lVar22 + 0x10);
  piVar6[5] = iVar4;
  piVar6[6] = iVar21;
  piVar6[7] = iVar16;
  iVar4 = piVar6[4];
  *(longlong *)(piVar6 + 0x12) = (longlong)iVar4 * 2 + *(longlong *)(piVar6 + 6);
  iVar21 = *piVar6;
  lVar22 = (longlong)iVar21;
  if (lVar22 == 0) {
LAB_7ff70c7c689d:
    uStack_58 = *(undefined8 *)(piVar6 + 0x18);
    uStack_50 = *(undefined8 *)(piVar6 + 0x1a);
    iStack_48 = piVar6[0x1c];
    iStack_44 = piVar6[0x1d];
    iStack_40 = piVar6[0x1e];
    iStack_3c = piVar6[0x1f];
    iVar16 = piVar6[0x20];
    if (iVar21 == piVar6[1]) {
      if (iVar21 == 0) {
        iVar17 = 8;
      }
      else {
        iVar17 = iVar21 / 2 + iVar21;
      }
      iVar23 = iVar21 + 1;
      if (iVar21 + 1 < iVar17) {
        iVar23 = iVar17;
      }
      lVar18 = FUN_7ff70c802100((longlong)iVar23 * 0x48);
      if (*(longlong *)(piVar6 + 2) != 0) {
        FUN_7ff70cb12b60(lVar18,*(longlong *)(piVar6 + 2),(longlong)*piVar6 * 0x48);
        FUN_7ff70c802510(*(undefined8 *)(piVar6 + 2));
      }
      *(longlong *)(piVar6 + 2) = lVar18;
      piVar6[1] = iVar23;
      iVar21 = *piVar6;
    }
    else {
      lVar18 = *(longlong *)(piVar6 + 2);
    }
    lVar22 = (longlong)iVar21;
  }
  else {
    lVar18 = *(longlong *)(piVar6 + 2);
    lVar5 = lVar18 + lVar22 * 0x48;
    piVar20 = (int *)(lVar5 + -0x48);
    if (piVar20 == (int *)0x0) goto LAB_7ff70c7c689d;
    piVar1 = piVar6 + 0x18;
    if (*(int *)(lVar5 + -0x20) == 0) {
      *(int *)(lVar5 + -0x28) = piVar6[0x20];
      iVar4 = *piVar1;
      iVar21 = piVar6[0x19];
      iVar16 = piVar6[0x1a];
      iVar17 = piVar6[0x1b];
      uVar15 = *(undefined8 *)(piVar6 + 0x1e);
      *(undefined8 *)(lVar5 + -0x38) = *(undefined8 *)(piVar6 + 0x1c);
      *(undefined8 *)(lVar5 + -0x30) = uVar15;
      *piVar20 = iVar4;
      *(int *)(lVar5 + -0x44) = iVar21;
      *(int *)(lVar5 + -0x40) = iVar16;
      *(int *)(lVar5 + -0x3c) = iVar17;
      goto LAB_7ff70c7c6973;
    }
    iVar16 = FUN_7ff70cb12b50(piVar20,piVar1,0x24);
    if (iVar16 == 0) goto LAB_7ff70c7c6973;
    uStack_58 = *(undefined8 *)piVar1;
    uStack_50 = *(undefined8 *)(piVar6 + 0x1a);
    iStack_48 = piVar6[0x1c];
    iStack_44 = piVar6[0x1d];
    iStack_40 = piVar6[0x1e];
    iStack_3c = piVar6[0x1f];
    iVar16 = piVar6[0x20];
    if (iVar21 == piVar6[1]) {
      iVar17 = 1;
      if (1 < iVar21 / 2) {
        iVar17 = iVar21 / 2;
      }
      lVar18 = FUN_7ff70c802100((longlong)(iVar17 + iVar21) * 0x48);
      if (*(longlong *)(piVar6 + 2) != 0) {
        FUN_7ff70cb12b60(lVar18,*(longlong *)(piVar6 + 2),(longlong)*piVar6 * 0x48);
        FUN_7ff70c802510(*(undefined8 *)(piVar6 + 2));
      }
      *(longlong *)(piVar6 + 2) = lVar18;
      piVar6[1] = iVar17 + iVar21;
      lVar22 = (longlong)*piVar6;
    }
  }
  puVar2 = (undefined8 *)(lVar18 + 0x10 + lVar22 * 0x48);
  *puVar2 = CONCAT44(iStack_44,iStack_48);
  puVar2[1] = CONCAT44(iStack_3c,iStack_40);
  puVar2 = (undefined8 *)(lVar18 + lVar22 * 0x48);
  *puVar2 = uStack_58;
  puVar2[1] = uStack_50;
  *(int *)(lVar18 + 0x20 + lVar22 * 0x48) = iVar16;
  *(int *)(lVar18 + 0x24 + lVar22 * 0x48) = iVar4;
  puVar2 = (undefined8 *)(lVar18 + 0x28 + lVar22 * 0x48);
  *puVar2 = 0;
  puVar2[1] = 0;
  puVar2 = (undefined8 *)(lVar18 + 0x38 + lVar22 * 0x48);
  *puVar2 = 0;
  puVar2[1] = 0;
  *piVar6 = *piVar6 + 1;
LAB_7ff70c7c6973:
  if (_DAT_7ff70cbebd80 != (uStack_38 ^ (ulonglong)auStack_78)) {
    FUN_7ff70caa97e0(uStack_38 ^ (ulonglong)auStack_78);
    pcVar7 = (code *)swi(3);
    (*pcVar7)();
    return;
  }
  return;
}


