/* 7ff70c7b6530 FUN_7ff70c7b6530 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7b6530(int *param_1,uint *param_2)

{
  undefined8 *puVar1;
  bool bVar2;
  code *pcVar3;
  uint *puVar4;
  int *piVar5;
  int iVar6;
  int iVar7;
  uint uVar8;
  longlong lVar9;
  undefined8 uVar10;
  longlong lVar11;
  longlong lVar12;
  int iVar13;
  uint uVar14;
  longlong lVar15;
  uint uVar16;
  ulonglong uVar17;
  longlong lVar18;
  longlong lVar19;
  uint uVar20;
  uint uVar21;
  uint *puVar22;
  uint *puVar23;
  int iVar24;
  undefined1 auStack_98 [32];
  uint *puStack_78;
  int *piStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  uint uStack_58;
  uint uStack_54;
  uint uStack_50;
  uint uStack_4c;
  ulonglong uStack_48;
  
  uStack_48 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_98;
  if (param_1[1] < 2) goto LAB_7ff70c7b6d03;
  puStack_78 = param_2;
  if ((longlong)*param_1 == 0) goto LAB_7ff70c7b66fc;
  uVar10 = *(undefined8 *)(param_2 + 2);
  puVar1 = (undefined8 *)(*(longlong *)(param_1 + 4) + (longlong)*param_1 * 0x20);
  *puVar1 = *(undefined8 *)param_2;
  puVar1[1] = uVar10;
  uVar10 = *(undefined8 *)(param_2 + 6);
  puVar1 = (undefined8 *)(*(longlong *)(param_1 + 4) + 0x10 + (longlong)*param_1 * 0x20);
  *puVar1 = *(undefined8 *)(param_2 + 4);
  puVar1[1] = uVar10;
  *param_1 = 0;
  uVar10 = (*(undefined8 **)(param_1 + 4))[1];
  *(undefined8 *)param_2 = **(undefined8 **)(param_1 + 4);
  *(undefined8 *)(param_2 + 2) = uVar10;
  lVar15 = *(longlong *)(param_1 + 4);
  uVar20 = *(uint *)(lVar15 + 0x14);
  uVar14 = *(uint *)(lVar15 + 0x18);
  uVar16 = *(uint *)(lVar15 + 0x1c);
  param_2[4] = *(uint *)(lVar15 + 0x10);
  param_2[5] = uVar20;
  param_2[6] = uVar14;
  param_2[7] = uVar16;
  uVar20 = param_2[4];
  *(longlong *)(param_2 + 0x12) = (longlong)(int)uVar20 * 2 + *(longlong *)(param_2 + 6);
  uVar14 = *param_2;
  lVar15 = (longlong)(int)uVar14;
  if (lVar15 == 0) {
LAB_7ff70c7b66a6:
    uStack_68 = *(undefined8 *)(param_2 + 0x18);
    uStack_60 = *(undefined8 *)(param_2 + 0x1a);
    uStack_58 = param_2[0x1c];
    uStack_54 = param_2[0x1d];
    uStack_50 = param_2[0x1e];
    uStack_4c = param_2[0x1f];
    uVar16 = param_2[0x20];
    if (uVar14 == param_2[1]) {
      if (uVar14 == 0) {
        uVar8 = 8;
      }
      else {
        uVar8 = (int)uVar14 / 2 + uVar14;
      }
      uVar21 = uVar14 + 1;
      if ((int)(uVar14 + 1) < (int)uVar8) {
        uVar21 = uVar8;
      }
      lVar9 = FUN_7ff70c802100((longlong)(int)uVar21 * 0x48);
      puVar22 = puStack_78;
      if (*(longlong *)(puStack_78 + 2) != 0) {
        FUN_7ff70cb12b60(lVar9);
        FUN_7ff70c802510(*(undefined8 *)(puVar22 + 2));
      }
      *(longlong *)(puVar22 + 2) = lVar9;
      puVar22[1] = uVar21;
      uVar14 = *puVar22;
    }
    else {
      lVar9 = *(longlong *)(param_2 + 2);
      puVar22 = param_2;
    }
    lVar15 = (longlong)(int)uVar14;
LAB_7ff70c7b6776:
    puVar1 = (undefined8 *)(lVar9 + 0x10 + lVar15 * 0x48);
    *puVar1 = CONCAT44(uStack_54,uStack_58);
    puVar1[1] = CONCAT44(uStack_4c,uStack_50);
    puVar1 = (undefined8 *)(lVar9 + lVar15 * 0x48);
    *puVar1 = uStack_68;
    puVar1[1] = uStack_60;
    *(uint *)(lVar9 + 0x20 + lVar15 * 0x48) = uVar16;
    *(uint *)(lVar9 + 0x24 + lVar15 * 0x48) = uVar20;
    puVar1 = (undefined8 *)(lVar9 + 0x28 + lVar15 * 0x48);
    *puVar1 = 0;
    puVar1[1] = 0;
    puVar1 = (undefined8 *)(lVar9 + 0x38 + lVar15 * 0x48);
    *puVar1 = 0;
    puVar1[1] = 0;
    uVar20 = *puVar22 + 1;
    *puVar22 = uVar20;
  }
  else {
    lVar9 = *(longlong *)(param_2 + 2);
    lVar12 = lVar9 + lVar15 * 0x48;
    if ((uint *)(lVar12 + -0x48) == (uint *)0x0) goto LAB_7ff70c7b66a6;
    if (*(int *)(lVar12 + -0x20) != 0) {
      iVar6 = FUN_7ff70cb12b50();
      puVar22 = puStack_78;
      if (iVar6 == 0) goto LAB_7ff70c7b66fc;
      uStack_68 = *(undefined8 *)(param_2 + 0x18);
      uStack_60 = *(undefined8 *)(param_2 + 0x1a);
      uStack_58 = puStack_78[0x1c];
      uStack_54 = puStack_78[0x1d];
      uStack_50 = puStack_78[0x1e];
      uStack_4c = puStack_78[0x1f];
      uVar16 = puStack_78[0x20];
      if (uVar14 == puStack_78[1]) {
        iVar6 = 1;
        if (1 < (int)uVar14 / 2) {
          iVar6 = (int)uVar14 / 2;
        }
        lVar9 = FUN_7ff70c802100((longlong)(int)(iVar6 + uVar14) * 0x48);
        if (*(longlong *)(puVar22 + 2) != 0) {
          FUN_7ff70cb12b60(lVar9);
          FUN_7ff70c802510(*(undefined8 *)(puVar22 + 2));
        }
        *(longlong *)(puVar22 + 2) = lVar9;
        puVar22[1] = iVar6 + uVar14;
        lVar15 = (longlong)(int)*puVar22;
      }
      goto LAB_7ff70c7b6776;
    }
    *(uint *)(lVar12 + -0x28) = param_2[0x20];
    uVar20 = param_2[0x18];
    uVar14 = param_2[0x19];
    uVar16 = param_2[0x1a];
    uVar8 = param_2[0x1b];
    uVar10 = *(undefined8 *)(param_2 + 0x1e);
    *(undefined8 *)(lVar12 + -0x38) = *(undefined8 *)(param_2 + 0x1c);
    *(undefined8 *)(lVar12 + -0x30) = uVar10;
    *(uint *)(lVar12 + -0x48) = uVar20;
    *(uint *)(lVar12 + -0x44) = uVar14;
    *(uint *)(lVar12 + -0x40) = uVar16;
    *(uint *)(lVar12 + -0x3c) = uVar8;
LAB_7ff70c7b66fc:
    uVar20 = *puStack_78;
    puVar22 = puStack_78;
  }
  if (0 < (int)uVar20) {
    uVar14 = uVar20;
    do {
      uVar20 = uVar14;
      if ((*(int *)(*(longlong *)(puVar22 + 2) + -0x20 + (ulonglong)uVar14 * 0x48) != 0) ||
         (*(longlong *)(*(longlong *)(puVar22 + 2) + (ulonglong)uVar14 * 0x48 + -0x18) != 0)) break;
      uVar20 = uVar14 - 1;
      *puVar22 = uVar20;
      bVar2 = 0 < (int)uVar14;
      uVar14 = uVar20;
    } while (uVar20 != 0 && bVar2);
  }
  iVar6 = 0;
  piStack_70 = param_1;
  if (param_1[1] < 1) {
LAB_7ff70c7b695e:
    iVar24 = 0;
    uVar14 = puVar22[1];
    if ((int)uVar14 < (int)uVar20) {
LAB_7ff70c7b697b:
      if (uVar14 == 0) {
        uVar14 = 8;
      }
      else {
        uVar14 = (int)uVar14 / 2 + uVar14;
      }
      if ((int)uVar14 <= (int)uVar20) {
        uVar14 = uVar20;
      }
      uVar10 = FUN_7ff70c802100((longlong)(int)uVar14 * 0x48);
      if (*(longlong *)(puVar22 + 2) != 0) {
        FUN_7ff70cb12b60(uVar10,*(longlong *)(puVar22 + 2),(longlong)(int)*puVar22 * 0x48);
        FUN_7ff70c802510(*(undefined8 *)(puVar22 + 2));
      }
      *(undefined8 *)(puVar22 + 2) = uVar10;
      puVar22[1] = uVar14;
    }
  }
  else {
    if ((int)uVar20 < 1) {
LAB_7ff70c7b6818:
      lVar15 = 0;
      iVar13 = 0;
    }
    else {
      lVar12 = (ulonglong)uVar20 * 0x48 + *(longlong *)(puVar22 + 2);
      lVar15 = lVar12 + -0x48;
      if (lVar15 == 0) goto LAB_7ff70c7b6818;
      iVar13 = *(int *)(lVar12 + -0x20) + *(int *)(lVar12 + -0x24);
    }
    if (param_1[1] == 1) goto LAB_7ff70c7b695e;
    iVar24 = 0;
    lVar12 = 1;
    iVar6 = 0;
    do {
      puVar23 = (uint *)(*(longlong *)(piStack_70 + 4) + lVar12 * 0x20);
      uVar20 = *(uint *)(*(longlong *)(piStack_70 + 4) + lVar12 * 0x20);
      uVar17 = (ulonglong)(int)uVar20;
      if ((longlong)uVar17 < 1) {
LAB_7ff70c7b6840:
        uVar14 = puVar23[4];
      }
      else {
        if ((*(int *)(*(longlong *)(puVar23 + 2) + -0x20 + uVar17 * 0x48) == 0) &&
           (*(longlong *)(*(longlong *)(puVar23 + 2) + uVar17 * 0x48 + -0x18) == 0)) {
          uVar20 = uVar20 - 1;
          uVar17 = (ulonglong)uVar20;
          *puVar23 = uVar20;
          if (uVar20 == 0) goto LAB_7ff70c7b68d0;
LAB_7ff70c7b6894:
          if (lVar15 == 0) goto LAB_7ff70c7b68d0;
          lVar9 = *(longlong *)(puVar23 + 2);
          iVar7 = FUN_7ff70cb12b50(lVar15);
          puVar22 = puStack_78;
          if (((iVar7 == 0) && (*(longlong *)(lVar15 + 0x30) == 0)) &&
             (*(longlong *)(lVar9 + 0x30) == 0)) {
            *(int *)(lVar15 + 0x28) = *(int *)(lVar15 + 0x28) + *(int *)(lVar9 + 0x28);
            iVar13 = iVar13 + *(int *)(lVar9 + 0x28);
            FUN_7ff70cb12b70();
            uVar20 = *puVar23 - 1;
            uVar17 = (ulonglong)uVar20;
            *puVar23 = uVar20;
            puVar22 = puStack_78;
            goto joined_r0x7ff70c7b68d2;
          }
        }
        else {
          if (uVar20 != 0) goto LAB_7ff70c7b6894;
LAB_7ff70c7b68d0:
          uVar20 = (uint)uVar17;
joined_r0x7ff70c7b68d2:
          if ((int)uVar20 < 1) goto LAB_7ff70c7b6840;
        }
        lVar9 = *(longlong *)(puVar23 + 2);
        uVar20 = (uint)uVar17;
        lVar15 = lVar9 + (uVar17 & 0xffffffff) * 0x48 + -0x48;
        uVar14 = puVar23[4];
        lVar18 = 0;
        lVar19 = 0;
        do {
          *(int *)(lVar9 + 0x24 + lVar18) = iVar13;
          lVar9 = *(longlong *)(puVar23 + 2);
          iVar13 = iVar13 + *(int *)(lVar9 + 0x28 + lVar18);
          lVar19 = lVar19 + 1;
          lVar18 = lVar18 + 0x48;
        } while (lVar19 < (int)*puVar23);
      }
      iVar6 = iVar6 + uVar14;
      iVar24 = iVar24 + uVar20;
      lVar12 = lVar12 + 1;
    } while (lVar12 < piStack_70[1]);
    uVar20 = *puVar22 + iVar24;
    uVar14 = puVar22[1];
    if ((int)uVar14 < (int)uVar20) goto LAB_7ff70c7b697b;
  }
  piVar5 = piStack_70;
  *puVar22 = uVar20;
  lVar15 = (longlong)(int)puVar22[4] + (longlong)iVar6;
  uVar14 = puVar22[5];
  uVar16 = (uint)lVar15;
  if ((int)uVar14 < (int)uVar16) {
    if (uVar14 == 0) {
      uVar14 = 8;
    }
    else {
      uVar14 = (int)uVar14 / 2 + uVar14;
    }
    if ((int)uVar14 <= (int)uVar16) {
      uVar14 = uVar16;
    }
    lVar12 = FUN_7ff70c802100((longlong)(int)uVar14 * 2);
    if (*(longlong *)(puVar22 + 6) != 0) {
      FUN_7ff70cb12b60(lVar12,*(longlong *)(puVar22 + 6),(longlong)(int)puVar22[4] * 2);
      FUN_7ff70c802510(*(undefined8 *)(puVar22 + 6));
    }
    *(longlong *)(puVar22 + 6) = lVar12;
    puVar22[5] = uVar14;
    uVar20 = *puVar22;
  }
  else {
    lVar12 = *(longlong *)(puVar22 + 6);
  }
  puVar22[4] = uVar16;
  lVar15 = lVar12 + lVar15 * 2 + (longlong)iVar6 * -2;
  if (1 < piVar5[1]) {
    lVar12 = (longlong)(int)uVar20 * 0x48 + *(longlong *)(puVar22 + 2) + (longlong)iVar24 * -0x48;
    lVar9 = 1;
    lVar18 = 0x38;
    do {
      lVar19 = *(longlong *)(piVar5 + 4);
      lVar11 = (longlong)*(int *)(lVar19 + -0x18 + lVar18);
      if (lVar11 != 0) {
        lVar11 = lVar11 * 0x48;
        FUN_7ff70cb12b60(lVar12,*(undefined8 *)(lVar19 + -0x10 + lVar18),lVar11);
        lVar12 = lVar12 + lVar11;
      }
      lVar11 = (longlong)*(int *)(lVar19 + -8 + lVar18);
      if (lVar11 != 0) {
        FUN_7ff70cb12b60(lVar15,*(undefined8 *)(lVar19 + lVar18),lVar11 * 2);
        lVar15 = lVar15 + lVar11 * 2;
      }
      lVar9 = lVar9 + 1;
      lVar18 = lVar18 + 0x20;
    } while (lVar9 < piVar5[1]);
    uVar20 = *puStack_78;
    puVar22 = puStack_78;
  }
  *(longlong *)(puVar22 + 0x12) = lVar15;
  if (uVar20 == 0) {
LAB_7ff70c7b6b21:
    uStack_68 = *(undefined8 *)(puVar22 + 0x18);
    uStack_60 = *(undefined8 *)(puVar22 + 0x1a);
    uStack_58 = puVar22[0x1c];
    uStack_54 = puVar22[0x1d];
    uStack_50 = puVar22[0x1e];
    uStack_4c = puVar22[0x1f];
    uVar14 = puVar22[4];
    uVar16 = puVar22[0x20];
    if (uVar20 == puVar22[1]) {
      if (uVar20 == 0) {
        uVar8 = 8;
      }
      else {
        uVar8 = (int)uVar20 / 2 + uVar20;
      }
      uVar21 = uVar20 + 1;
      if ((int)(uVar20 + 1) < (int)uVar8) {
        uVar21 = uVar8;
      }
      lVar15 = FUN_7ff70c802100((longlong)(int)uVar21 * 0x48);
      if (*(longlong *)(puVar22 + 2) != 0) {
        FUN_7ff70cb12b60(lVar15,*(longlong *)(puVar22 + 2),(longlong)(int)*puVar22 * 0x48);
        FUN_7ff70c802510(*(undefined8 *)(puVar22 + 2));
      }
      *(longlong *)(puVar22 + 2) = lVar15;
      puVar22[1] = uVar21;
      uVar20 = *puVar22;
    }
    else {
      lVar15 = *(longlong *)(puVar22 + 2);
    }
    lVar12 = (longlong)(int)uVar20;
    puVar1 = (undefined8 *)(lVar15 + 0x10 + lVar12 * 0x48);
    *puVar1 = CONCAT44(uStack_54,uStack_58);
    puVar1[1] = CONCAT44(uStack_4c,uStack_50);
    puVar1 = (undefined8 *)(lVar15 + lVar12 * 0x48);
    *puVar1 = uStack_68;
    puVar1[1] = uStack_60;
    *(uint *)(lVar15 + 0x20 + lVar12 * 0x48) = uVar16;
    *(uint *)(lVar15 + 0x24 + lVar12 * 0x48) = uVar14;
    puVar1 = (undefined8 *)(lVar15 + 0x28 + lVar12 * 0x48);
    *puVar1 = 0;
    puVar1[1] = 0;
    puVar1 = (undefined8 *)(lVar15 + 0x38 + lVar12 * 0x48);
    *puVar1 = 0;
    puVar1[1] = 0;
    lVar12 = (longlong)(int)*puVar22 + 1;
    uVar20 = (uint)lVar12;
    *puVar22 = uVar20;
    lVar15 = *(longlong *)(puVar22 + 2);
  }
  else {
    lVar15 = *(longlong *)(puVar22 + 2);
    lVar12 = (longlong)(int)uVar20;
    if (*(longlong *)(lVar15 + -0x18 + lVar12 * 0x48) != 0) goto LAB_7ff70c7b6b21;
  }
  lVar9 = lVar15 + lVar12 * 0x48;
  puVar23 = puVar22 + 0x18;
  if (*(int *)(lVar15 + -0x20 + lVar12 * 0x48) == 0) {
    *(uint *)(lVar9 + -0x28) = puVar22[0x20];
    uVar20 = *puVar23;
    uVar14 = puVar22[0x19];
    uVar16 = puVar22[0x1a];
    uVar8 = puVar22[0x1b];
    uVar10 = *(undefined8 *)(puVar22 + 0x1e);
    *(undefined8 *)(lVar9 + -0x38) = *(undefined8 *)(puVar22 + 0x1c);
    *(undefined8 *)(lVar9 + -0x30) = uVar10;
    *(uint *)(lVar9 + -0x48) = uVar20;
    *(uint *)(lVar9 + -0x44) = uVar14;
    *(uint *)(lVar9 + -0x40) = uVar16;
    *(uint *)(lVar9 + -0x3c) = uVar8;
  }
  else {
    iVar6 = FUN_7ff70cb12b50((uint *)(lVar9 + -0x48),puVar23,0x24);
    puVar4 = puStack_78;
    if (iVar6 != 0) {
      uStack_68 = *(undefined8 *)puVar23;
      uStack_60 = *(undefined8 *)(puVar22 + 0x1a);
      uStack_58 = puStack_78[0x1c];
      uStack_54 = puStack_78[0x1d];
      uStack_50 = puStack_78[0x1e];
      uStack_4c = puStack_78[0x1f];
      uVar14 = puStack_78[4];
      uVar16 = puStack_78[0x20];
      if (uVar20 == puStack_78[1]) {
        if (uVar20 == 0) {
          uVar8 = 8;
        }
        else {
          uVar8 = (int)uVar20 / 2 + uVar20;
        }
        uVar21 = uVar20 + 1;
        if ((int)(uVar20 + 1) < (int)uVar8) {
          uVar21 = uVar8;
        }
        lVar15 = FUN_7ff70c802100((longlong)(int)uVar21 * 0x48);
        if (*(longlong *)(puVar4 + 2) != 0) {
          FUN_7ff70cb12b60(lVar15,*(longlong *)(puVar4 + 2),(longlong)(int)*puVar4 * 0x48);
          FUN_7ff70c802510(*(undefined8 *)(puVar4 + 2));
        }
        *(longlong *)(puVar4 + 2) = lVar15;
        puVar4[1] = uVar21;
        lVar12 = (longlong)(int)*puVar4;
      }
      puVar1 = (undefined8 *)(lVar15 + 0x10 + lVar12 * 0x48);
      *puVar1 = CONCAT44(uStack_54,uStack_58);
      puVar1[1] = CONCAT44(uStack_4c,uStack_50);
      puVar1 = (undefined8 *)(lVar15 + lVar12 * 0x48);
      *puVar1 = uStack_68;
      puVar1[1] = uStack_60;
      *(uint *)(lVar15 + 0x20 + lVar12 * 0x48) = uVar16;
      *(uint *)(lVar15 + 0x24 + lVar12 * 0x48) = uVar14;
      puVar1 = (undefined8 *)(lVar15 + 0x28 + lVar12 * 0x48);
      *puVar1 = 0;
      puVar1[1] = 0;
      puVar1 = (undefined8 *)(lVar15 + 0x38 + lVar12 * 0x48);
      *puVar1 = 0;
      puVar1[1] = 0;
      *puVar4 = *puVar4 + 1;
    }
  }
  piVar5[1] = 1;
LAB_7ff70c7b6d03:
  if (_DAT_7ff70cbebd80 == (uStack_48 ^ (ulonglong)auStack_98)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_48 ^ (ulonglong)auStack_98);
  pcVar3 = (code *)swi(3);
  (*pcVar3)();
  return;
}


