/* 7ff70c90c460 FUN_7ff70c90c460 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c90c460(void)

{
  int *piVar1;
  undefined8 *puVar2;
  undefined4 *puVar3;
  int iVar4;
  longlong lVar5;
  uint *puVar6;
  int *piVar7;
  code *pcVar8;
  undefined4 uVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  undefined4 uVar14;
  undefined4 uVar15;
  undefined8 uVar16;
  int iVar17;
  int iVar18;
  longlong lVar19;
  ulonglong uVar20;
  int *piVar21;
  uint uVar22;
  int iVar23;
  longlong lVar24;
  int iVar25;
  undefined1 auStack_78 [32];
  undefined8 uStack_58;
  undefined8 uStack_50;
  int iStack_48;
  int iStack_44;
  int iStack_40;
  int iStack_3c;
  ulonglong uStack_38;
  
  uVar20 = _DAT_7ff70cbebd80 ^ (ulonglong)&stack0xffffffffffffffd8;
  lVar24 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  lVar5 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x2278);
  uVar9 = *(undefined4 *)(lVar5 + 0x170);
  uVar10 = *(undefined4 *)(lVar5 + 0x174);
  uVar11 = *(undefined4 *)(lVar5 + 0x178);
  uVar12 = *(undefined4 *)(lVar5 + 0x17c);
  uVar13 = *(undefined4 *)(lVar5 + 0x174);
  uVar14 = *(undefined4 *)(lVar5 + 0x178);
  uVar15 = *(undefined4 *)(lVar5 + 0x17c);
  *(undefined4 *)(lVar24 + 0x260) = *(undefined4 *)(lVar5 + 0x170);
  *(undefined4 *)(lVar24 + 0x264) = uVar13;
  *(undefined4 *)(lVar24 + 0x268) = uVar14;
  *(undefined4 *)(lVar24 + 0x26c) = uVar15;
  lVar19 = *(longlong *)(lVar24 + 0x2c8);
  *(undefined4 *)(lVar19 + 0x60) = uVar9;
  *(undefined4 *)(lVar19 + 100) = uVar10;
  *(undefined4 *)(lVar19 + 0x68) = uVar11;
  *(undefined4 *)(lVar19 + 0x6c) = uVar12;
  puVar3 = (undefined4 *)
           (*(longlong *)(*(longlong *)(lVar24 + 0x2c8) + 0xa8) + -0x10 +
           (longlong)*(int *)(*(longlong *)(lVar24 + 0x2c8) + 0xa0) * 0x10);
  *puVar3 = uVar9;
  puVar3[1] = uVar10;
  puVar3[2] = uVar11;
  puVar3[3] = uVar12;
  puVar6 = *(uint **)(lVar5 + 0x1a0);
  uVar22 = (uint)*(ushort *)
                  (*(longlong *)(lVar5 + 0x18) + 0x60 + (longlong)*(int *)(lVar5 + 0x74) * 0x74);
  piVar7 = *(int **)(lVar24 + 0x2c8);
  if (_DAT_7ff70cbebd80 != (uVar20 ^ (ulonglong)&stack0xffffffffffffffd8)) {
    FUN_7ff70caa97e0(uVar20 ^ (ulonglong)&stack0xffffffffffffffd8);
    pcVar8 = (code *)swi(3);
    (*pcVar8)();
    return;
  }
  uStack_38 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  if (*puVar6 == uVar22) goto LAB_7ff70c7c6973;
  uVar16 = *(undefined8 *)(piVar7 + 2);
  puVar2 = (undefined8 *)(*(longlong *)(puVar6 + 4) + (longlong)(int)*puVar6 * 0x20);
  *puVar2 = *(undefined8 *)piVar7;
  puVar2[1] = uVar16;
  uVar16 = *(undefined8 *)(piVar7 + 6);
  puVar2 = (undefined8 *)(*(longlong *)(puVar6 + 4) + 0x10 + (longlong)(int)*puVar6 * 0x20);
  *puVar2 = *(undefined8 *)(piVar7 + 4);
  puVar2[1] = uVar16;
  *puVar6 = uVar22;
  puVar2 = (undefined8 *)(*(longlong *)(puVar6 + 4) + (longlong)(int)uVar22 * 0x20);
  uVar16 = puVar2[1];
  *(undefined8 *)piVar7 = *puVar2;
  *(undefined8 *)(piVar7 + 2) = uVar16;
  piVar21 = (int *)(*(longlong *)(puVar6 + 4) + 0x10 + (longlong)(int)uVar22 * 0x20);
  iVar4 = piVar21[1];
  iVar23 = piVar21[2];
  iVar17 = piVar21[3];
  piVar7[4] = *piVar21;
  piVar7[5] = iVar4;
  piVar7[6] = iVar23;
  piVar7[7] = iVar17;
  iVar4 = piVar7[4];
  *(longlong *)(piVar7 + 0x12) = (longlong)iVar4 * 2 + *(longlong *)(piVar7 + 6);
  iVar23 = *piVar7;
  lVar24 = (longlong)iVar23;
  if (lVar24 == 0) {
LAB_7ff70c7c689d:
    uStack_58 = *(undefined8 *)(piVar7 + 0x18);
    uStack_50 = *(undefined8 *)(piVar7 + 0x1a);
    iStack_48 = piVar7[0x1c];
    iStack_44 = piVar7[0x1d];
    iStack_40 = piVar7[0x1e];
    iStack_3c = piVar7[0x1f];
    iVar17 = piVar7[0x20];
    if (iVar23 == piVar7[1]) {
      if (iVar23 == 0) {
        iVar18 = 8;
      }
      else {
        iVar18 = iVar23 / 2 + iVar23;
      }
      iVar25 = iVar23 + 1;
      if (iVar23 + 1 < iVar18) {
        iVar25 = iVar18;
      }
      lVar19 = FUN_7ff70c802100((longlong)iVar25 * 0x48);
      if (*(longlong *)(piVar7 + 2) != 0) {
        FUN_7ff70cb12b60(lVar19,*(longlong *)(piVar7 + 2),(longlong)*piVar7 * 0x48);
        FUN_7ff70c802510(*(undefined8 *)(piVar7 + 2));
      }
      *(longlong *)(piVar7 + 2) = lVar19;
      piVar7[1] = iVar25;
      iVar23 = *piVar7;
    }
    else {
      lVar19 = *(longlong *)(piVar7 + 2);
    }
    lVar24 = (longlong)iVar23;
  }
  else {
    lVar19 = *(longlong *)(piVar7 + 2);
    lVar5 = lVar19 + lVar24 * 0x48;
    piVar21 = (int *)(lVar5 + -0x48);
    if (piVar21 == (int *)0x0) goto LAB_7ff70c7c689d;
    piVar1 = piVar7 + 0x18;
    if (*(int *)(lVar5 + -0x20) == 0) {
      *(int *)(lVar5 + -0x28) = piVar7[0x20];
      iVar4 = *piVar1;
      iVar23 = piVar7[0x19];
      iVar17 = piVar7[0x1a];
      iVar18 = piVar7[0x1b];
      uVar16 = *(undefined8 *)(piVar7 + 0x1e);
      *(undefined8 *)(lVar5 + -0x38) = *(undefined8 *)(piVar7 + 0x1c);
      *(undefined8 *)(lVar5 + -0x30) = uVar16;
      *piVar21 = iVar4;
      *(int *)(lVar5 + -0x44) = iVar23;
      *(int *)(lVar5 + -0x40) = iVar17;
      *(int *)(lVar5 + -0x3c) = iVar18;
      goto LAB_7ff70c7c6973;
    }
    iVar17 = FUN_7ff70cb12b50(piVar21,piVar1,0x24);
    if (iVar17 == 0) goto LAB_7ff70c7c6973;
    uStack_58 = *(undefined8 *)piVar1;
    uStack_50 = *(undefined8 *)(piVar7 + 0x1a);
    iStack_48 = piVar7[0x1c];
    iStack_44 = piVar7[0x1d];
    iStack_40 = piVar7[0x1e];
    iStack_3c = piVar7[0x1f];
    iVar17 = piVar7[0x20];
    if (iVar23 == piVar7[1]) {
      iVar18 = 1;
      if (1 < iVar23 / 2) {
        iVar18 = iVar23 / 2;
      }
      lVar19 = FUN_7ff70c802100((longlong)(iVar18 + iVar23) * 0x48);
      if (*(longlong *)(piVar7 + 2) != 0) {
        FUN_7ff70cb12b60(lVar19,*(longlong *)(piVar7 + 2),(longlong)*piVar7 * 0x48);
        FUN_7ff70c802510(*(undefined8 *)(piVar7 + 2));
      }
      *(longlong *)(piVar7 + 2) = lVar19;
      piVar7[1] = iVar18 + iVar23;
      lVar24 = (longlong)*piVar7;
    }
  }
  puVar2 = (undefined8 *)(lVar19 + 0x10 + lVar24 * 0x48);
  *puVar2 = CONCAT44(iStack_44,iStack_48);
  puVar2[1] = CONCAT44(iStack_3c,iStack_40);
  puVar2 = (undefined8 *)(lVar19 + lVar24 * 0x48);
  *puVar2 = uStack_58;
  puVar2[1] = uStack_50;
  *(int *)(lVar19 + 0x20 + lVar24 * 0x48) = iVar17;
  *(int *)(lVar19 + 0x24 + lVar24 * 0x48) = iVar4;
  puVar2 = (undefined8 *)(lVar19 + 0x28 + lVar24 * 0x48);
  *puVar2 = 0;
  puVar2[1] = 0;
  puVar2 = (undefined8 *)(lVar19 + 0x38 + lVar24 * 0x48);
  *puVar2 = 0;
  puVar2[1] = 0;
  *piVar7 = *piVar7 + 1;
LAB_7ff70c7c6973:
  if (_DAT_7ff70cbebd80 != (uStack_38 ^ (ulonglong)auStack_78)) {
    FUN_7ff70caa97e0(uStack_38 ^ (ulonglong)auStack_78);
    pcVar8 = (code *)swi(3);
    (*pcVar8)();
    return;
  }
  return;
}


