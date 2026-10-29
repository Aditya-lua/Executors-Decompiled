/* 7ff70c90c600 FUN_7ff70c90c600 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c90c600(void)

{
  int *piVar1;
  undefined8 *puVar2;
  undefined4 *puVar3;
  int iVar4;
  longlong lVar5;
  longlong lVar6;
  uint *puVar7;
  int *piVar8;
  code *pcVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  undefined4 uVar14;
  undefined4 uVar15;
  undefined4 uVar16;
  undefined8 uVar17;
  int iVar18;
  int iVar19;
  longlong lVar20;
  ulonglong uVar21;
  int *piVar22;
  longlong lVar23;
  uint uVar24;
  int iVar25;
  longlong lVar26;
  int iVar27;
  undefined1 auStack_78 [32];
  undefined8 uStack_58;
  undefined8 uStack_50;
  int iStack_48;
  int iStack_44;
  int iStack_40;
  int iStack_3c;
  ulonglong uStack_38;
  
  uVar21 = _DAT_7ff70cbebd80 ^ (ulonglong)&stack0xffffffffffffffd8;
  lVar26 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x2278);
  if (((*(byte *)(lVar26 + 6) & 0x10) != 0) || ((longlong)*(int *)(lVar26 + 0x74) == -1)) {
    if (_DAT_7ff70cbebd80 == (uVar21 ^ (ulonglong)&stack0xffffffffffffffd8)) {
      return;
    }
LAB_7ff70c90c6cc:
    FUN_7ff70caa97e0(uVar21 ^ (ulonglong)&stack0xffffffffffffffd8);
    pcVar9 = (code *)swi(3);
    (*pcVar9)();
    return;
  }
  lVar5 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  lVar20 = *(longlong *)(lVar26 + 0x18);
  lVar23 = (longlong)*(int *)(lVar26 + 0x74) * 0x74;
  puVar3 = (undefined4 *)(lVar20 + 0x24 + lVar23);
  uVar10 = *puVar3;
  uVar11 = puVar3[1];
  uVar12 = puVar3[2];
  uVar13 = puVar3[3];
  puVar3 = (undefined4 *)(lVar20 + 0x24 + lVar23);
  uVar14 = puVar3[1];
  uVar15 = puVar3[2];
  uVar16 = puVar3[3];
  *(undefined4 *)(lVar5 + 0x260) = *puVar3;
  *(undefined4 *)(lVar5 + 0x264) = uVar14;
  *(undefined4 *)(lVar5 + 0x268) = uVar15;
  *(undefined4 *)(lVar5 + 0x26c) = uVar16;
  lVar6 = *(longlong *)(lVar5 + 0x2c8);
  *(undefined4 *)(lVar6 + 0x60) = uVar10;
  *(undefined4 *)(lVar6 + 100) = uVar11;
  *(undefined4 *)(lVar6 + 0x68) = uVar12;
  *(undefined4 *)(lVar6 + 0x6c) = uVar13;
  puVar3 = (undefined4 *)
           (*(longlong *)(*(longlong *)(lVar5 + 0x2c8) + 0xa8) + -0x10 +
           (longlong)*(int *)(*(longlong *)(lVar5 + 0x2c8) + 0xa0) * 0x10);
  *puVar3 = uVar10;
  puVar3[1] = uVar11;
  puVar3[2] = uVar12;
  puVar3[3] = uVar13;
  puVar7 = *(uint **)(lVar26 + 0x1a0);
  uVar24 = (uint)*(ushort *)(lVar20 + 0x60 + lVar23);
  piVar8 = *(int **)(lVar5 + 0x2c8);
  if (_DAT_7ff70cbebd80 != (uVar21 ^ (ulonglong)&stack0xffffffffffffffd8)) goto LAB_7ff70c90c6cc;
  uStack_38 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  if (*puVar7 == uVar24) goto LAB_7ff70c7c6973;
  uVar17 = *(undefined8 *)(piVar8 + 2);
  puVar2 = (undefined8 *)(*(longlong *)(puVar7 + 4) + (longlong)(int)*puVar7 * 0x20);
  *puVar2 = *(undefined8 *)piVar8;
  puVar2[1] = uVar17;
  uVar17 = *(undefined8 *)(piVar8 + 6);
  puVar2 = (undefined8 *)(*(longlong *)(puVar7 + 4) + 0x10 + (longlong)(int)*puVar7 * 0x20);
  *puVar2 = *(undefined8 *)(piVar8 + 4);
  puVar2[1] = uVar17;
  *puVar7 = uVar24;
  puVar2 = (undefined8 *)(*(longlong *)(puVar7 + 4) + (longlong)(int)uVar24 * 0x20);
  uVar17 = puVar2[1];
  *(undefined8 *)piVar8 = *puVar2;
  *(undefined8 *)(piVar8 + 2) = uVar17;
  piVar22 = (int *)(*(longlong *)(puVar7 + 4) + 0x10 + (longlong)(int)uVar24 * 0x20);
  iVar4 = piVar22[1];
  iVar25 = piVar22[2];
  iVar18 = piVar22[3];
  piVar8[4] = *piVar22;
  piVar8[5] = iVar4;
  piVar8[6] = iVar25;
  piVar8[7] = iVar18;
  iVar4 = piVar8[4];
  *(longlong *)(piVar8 + 0x12) = (longlong)iVar4 * 2 + *(longlong *)(piVar8 + 6);
  iVar25 = *piVar8;
  lVar26 = (longlong)iVar25;
  if (lVar26 == 0) {
LAB_7ff70c7c689d:
    uStack_58 = *(undefined8 *)(piVar8 + 0x18);
    uStack_50 = *(undefined8 *)(piVar8 + 0x1a);
    iStack_48 = piVar8[0x1c];
    iStack_44 = piVar8[0x1d];
    iStack_40 = piVar8[0x1e];
    iStack_3c = piVar8[0x1f];
    iVar18 = piVar8[0x20];
    if (iVar25 == piVar8[1]) {
      if (iVar25 == 0) {
        iVar19 = 8;
      }
      else {
        iVar19 = iVar25 / 2 + iVar25;
      }
      iVar27 = iVar25 + 1;
      if (iVar25 + 1 < iVar19) {
        iVar27 = iVar19;
      }
      lVar20 = FUN_7ff70c802100((longlong)iVar27 * 0x48);
      if (*(longlong *)(piVar8 + 2) != 0) {
        FUN_7ff70cb12b60(lVar20,*(longlong *)(piVar8 + 2),(longlong)*piVar8 * 0x48);
        FUN_7ff70c802510(*(undefined8 *)(piVar8 + 2));
      }
      *(longlong *)(piVar8 + 2) = lVar20;
      piVar8[1] = iVar27;
      iVar25 = *piVar8;
    }
    else {
      lVar20 = *(longlong *)(piVar8 + 2);
    }
    lVar26 = (longlong)iVar25;
  }
  else {
    lVar20 = *(longlong *)(piVar8 + 2);
    lVar5 = lVar20 + lVar26 * 0x48;
    piVar22 = (int *)(lVar5 + -0x48);
    if (piVar22 == (int *)0x0) goto LAB_7ff70c7c689d;
    piVar1 = piVar8 + 0x18;
    if (*(int *)(lVar5 + -0x20) == 0) {
      *(int *)(lVar5 + -0x28) = piVar8[0x20];
      iVar4 = *piVar1;
      iVar25 = piVar8[0x19];
      iVar18 = piVar8[0x1a];
      iVar19 = piVar8[0x1b];
      uVar17 = *(undefined8 *)(piVar8 + 0x1e);
      *(undefined8 *)(lVar5 + -0x38) = *(undefined8 *)(piVar8 + 0x1c);
      *(undefined8 *)(lVar5 + -0x30) = uVar17;
      *piVar22 = iVar4;
      *(int *)(lVar5 + -0x44) = iVar25;
      *(int *)(lVar5 + -0x40) = iVar18;
      *(int *)(lVar5 + -0x3c) = iVar19;
      goto LAB_7ff70c7c6973;
    }
    iVar18 = FUN_7ff70cb12b50(piVar22,piVar1,0x24);
    if (iVar18 == 0) goto LAB_7ff70c7c6973;
    uStack_58 = *(undefined8 *)piVar1;
    uStack_50 = *(undefined8 *)(piVar8 + 0x1a);
    iStack_48 = piVar8[0x1c];
    iStack_44 = piVar8[0x1d];
    iStack_40 = piVar8[0x1e];
    iStack_3c = piVar8[0x1f];
    iVar18 = piVar8[0x20];
    if (iVar25 == piVar8[1]) {
      iVar19 = 1;
      if (1 < iVar25 / 2) {
        iVar19 = iVar25 / 2;
      }
      lVar20 = FUN_7ff70c802100((longlong)(iVar19 + iVar25) * 0x48);
      if (*(longlong *)(piVar8 + 2) != 0) {
        FUN_7ff70cb12b60(lVar20,*(longlong *)(piVar8 + 2),(longlong)*piVar8 * 0x48);
        FUN_7ff70c802510(*(undefined8 *)(piVar8 + 2));
      }
      *(longlong *)(piVar8 + 2) = lVar20;
      piVar8[1] = iVar19 + iVar25;
      lVar26 = (longlong)*piVar8;
    }
  }
  puVar2 = (undefined8 *)(lVar20 + 0x10 + lVar26 * 0x48);
  *puVar2 = CONCAT44(iStack_44,iStack_48);
  puVar2[1] = CONCAT44(iStack_3c,iStack_40);
  puVar2 = (undefined8 *)(lVar20 + lVar26 * 0x48);
  *puVar2 = uStack_58;
  puVar2[1] = uStack_50;
  *(int *)(lVar20 + 0x20 + lVar26 * 0x48) = iVar18;
  *(int *)(lVar20 + 0x24 + lVar26 * 0x48) = iVar4;
  puVar2 = (undefined8 *)(lVar20 + 0x28 + lVar26 * 0x48);
  *puVar2 = 0;
  puVar2[1] = 0;
  puVar2 = (undefined8 *)(lVar20 + 0x38 + lVar26 * 0x48);
  *puVar2 = 0;
  puVar2[1] = 0;
  *piVar8 = *piVar8 + 1;
LAB_7ff70c7c6973:
  if (_DAT_7ff70cbebd80 != (uStack_38 ^ (ulonglong)auStack_78)) {
    FUN_7ff70caa97e0(uStack_38 ^ (ulonglong)auStack_78);
    pcVar9 = (code *)swi(3);
    (*pcVar9)();
    return;
  }
  return;
}


