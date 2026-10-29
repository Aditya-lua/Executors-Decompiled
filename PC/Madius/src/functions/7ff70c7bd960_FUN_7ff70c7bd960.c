/* 7ff70c7bd960 FUN_7ff70c7bd960 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7bd960(int *param_1,undefined8 *param_2,undefined8 *param_3,uint param_4,
                     float param_5,uint param_6)

{
  undefined8 *puVar1;
  undefined4 *puVar2;
  int *piVar3;
  int iVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined8 uVar9;
  code *pcVar10;
  longlong lVar11;
  longlong lVar12;
  int iVar13;
  int iVar14;
  int iVar15;
  int iVar16;
  short sVar17;
  undefined1 auStack_98 [32];
  uint uStack_78;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  ulonglong uStack_48;
  
  uStack_48 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_98;
  if (0xffffff < param_4) {
    if (_DAT_7ff70cb1ba70 <= param_5 && (param_6 & 0x1f0) != 0x100) {
      uStack_78 = param_6;
      FUN_7ff70c7bc820(param_1);
      FUN_7ff70c7b9fb0(param_1,*(undefined8 *)(param_1 + 0x16),param_1[0x14],param_4);
      param_1[0x14] = 0;
    }
    else {
      if ((param_1[0xd] - 0xfffcU < 0xffff0000) && ((*(byte *)(param_1 + 0xc) & 8) != 0)) {
        iVar4 = param_1[8];
        param_1[0x20] = iVar4;
        param_1[0xd] = 0;
        lVar12 = *(longlong *)(param_1 + 2);
        iVar16 = *param_1;
        lVar11 = (longlong)iVar16;
        if (*(int *)(lVar12 + -0x20 + lVar11 * 0x48) == 0) {
          *(int *)(lVar12 + lVar11 * 0x48 + -0x28) = iVar4;
        }
        else {
          uStack_68 = *(undefined8 *)(param_1 + 0x18);
          uStack_60 = *(undefined8 *)(param_1 + 0x1a);
          uStack_58 = *(undefined8 *)(param_1 + 0x1c);
          uStack_50 = *(undefined8 *)(param_1 + 0x1e);
          iVar14 = param_1[4];
          if (iVar16 == param_1[1]) {
            if (iVar16 == 0) {
              iVar13 = 8;
            }
            else {
              iVar13 = iVar16 / 2 + iVar16;
            }
            iVar15 = iVar16 + 1;
            if (iVar16 + 1 < iVar13) {
              iVar15 = iVar13;
            }
            lVar12 = FUN_7ff70c802100((longlong)iVar15 * 0x48);
            if (*(longlong *)(param_1 + 2) != 0) {
              FUN_7ff70cb12b60(lVar12,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x48);
              FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
            }
            *(longlong *)(param_1 + 2) = lVar12;
            param_1[1] = iVar15;
            lVar11 = (longlong)*param_1;
          }
          puVar2 = (undefined4 *)(lVar12 + 0x10 + lVar11 * 0x48);
          *puVar2 = (undefined4)uStack_58;
          puVar2[1] = uStack_58._4_4_;
          puVar2[2] = (undefined4)uStack_50;
          puVar2[3] = uStack_50._4_4_;
          puVar1 = (undefined8 *)(lVar12 + lVar11 * 0x48);
          *puVar1 = uStack_68;
          puVar1[1] = uStack_60;
          *(int *)(lVar12 + 0x20 + lVar11 * 0x48) = iVar4;
          *(int *)(lVar12 + 0x24 + lVar11 * 0x48) = iVar14;
          puVar1 = (undefined8 *)(lVar12 + 0x28 + lVar11 * 0x48);
          *puVar1 = 0;
          puVar1[1] = 0;
          puVar1 = (undefined8 *)(lVar12 + 0x38 + lVar11 * 0x48);
          *puVar1 = 0;
          puVar1[1] = 0;
          *param_1 = *param_1 + 1;
        }
      }
      piVar3 = (int *)(*(longlong *)(param_1 + 2) + -0x20 + (longlong)*param_1 * 0x48);
      *piVar3 = *piVar3 + 6;
      iVar4 = param_1[8];
      iVar14 = iVar4 + 4;
      iVar16 = param_1[9];
      if (iVar16 < iVar14) {
        if (iVar16 == 0) {
          iVar16 = 8;
        }
        else {
          iVar16 = iVar16 / 2 + iVar16;
        }
        if (iVar16 <= iVar14) {
          iVar16 = iVar14;
        }
        lVar12 = FUN_7ff70c802100((longlong)iVar16 * 0x14);
        if (*(longlong *)(param_1 + 10) != 0) {
          FUN_7ff70cb12b60(lVar12,*(longlong *)(param_1 + 10),(longlong)param_1[8] * 0x14);
          FUN_7ff70c802510(*(undefined8 *)(param_1 + 10));
        }
        *(longlong *)(param_1 + 10) = lVar12;
        param_1[9] = iVar16;
      }
      else {
        lVar12 = *(longlong *)(param_1 + 10);
      }
      param_1[8] = iVar14;
      *(longlong *)(param_1 + 0x10) = lVar12 + (longlong)iVar4 * 0x14;
      iVar4 = param_1[4];
      iVar14 = iVar4 + 6;
      iVar16 = param_1[5];
      if (iVar16 < iVar14) {
        if (iVar16 == 0) {
          iVar16 = 8;
        }
        else {
          iVar16 = iVar16 / 2 + iVar16;
        }
        if (iVar16 <= iVar14) {
          iVar16 = iVar14;
        }
        lVar12 = FUN_7ff70c802100((longlong)iVar16 * 2);
        if (*(longlong *)(param_1 + 6) != 0) {
          FUN_7ff70cb12b60(lVar12,*(longlong *)(param_1 + 6),(longlong)param_1[4] * 2);
          FUN_7ff70c802510(*(undefined8 *)(param_1 + 6));
        }
        *(longlong *)(param_1 + 6) = lVar12;
        param_1[5] = iVar16;
      }
      else {
        lVar12 = *(longlong *)(param_1 + 6);
      }
      param_1[4] = iVar14;
      *(longlong *)(param_1 + 0x12) = lVar12 + (longlong)iVar4 * 2;
      uVar5 = *(undefined4 *)param_2;
      uVar6 = *(undefined4 *)((longlong)param_2 + 4);
      uVar7 = *(undefined4 *)param_3;
      uVar8 = *(undefined4 *)((longlong)param_3 + 4);
      uVar9 = **(undefined8 **)(param_1 + 0xe);
      sVar17 = (short)param_1[0xd];
      *(short *)(lVar12 + (longlong)iVar4 * 2) = sVar17;
      *(short *)(*(longlong *)(param_1 + 0x12) + 2) = sVar17 + 1;
      *(short *)(*(longlong *)(param_1 + 0x12) + 4) = sVar17 + 2;
      *(short *)(*(longlong *)(param_1 + 0x12) + 6) = sVar17;
      *(short *)(*(longlong *)(param_1 + 0x12) + 8) = sVar17 + 2;
      *(short *)(*(longlong *)(param_1 + 0x12) + 10) = sVar17 + 3;
      **(undefined8 **)(param_1 + 0x10) = *param_2;
      *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 8) = uVar9;
      *(uint *)(*(longlong *)(param_1 + 0x10) + 0x10) = param_4;
      lVar12 = *(longlong *)(param_1 + 0x10);
      *(undefined4 *)(lVar12 + 0x14) = uVar7;
      *(undefined4 *)(lVar12 + 0x18) = uVar6;
      *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x1c) = uVar9;
      *(uint *)(*(longlong *)(param_1 + 0x10) + 0x24) = param_4;
      *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x28) = *param_3;
      *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x30) = uVar9;
      *(uint *)(*(longlong *)(param_1 + 0x10) + 0x38) = param_4;
      lVar12 = *(longlong *)(param_1 + 0x10);
      *(undefined4 *)(lVar12 + 0x3c) = uVar5;
      *(undefined4 *)(lVar12 + 0x40) = uVar8;
      *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x44) = uVar9;
      *(uint *)(*(longlong *)(param_1 + 0x10) + 0x4c) = param_4;
      param_1[0xd] = param_1[0xd] + 4;
      lVar12 = *(longlong *)(param_1 + 0x12) + _UNK_7ff70cb1ba48;
      *(longlong *)(param_1 + 0x10) = *(longlong *)(param_1 + 0x10) + _DAT_7ff70cb1ba40;
      *(longlong *)(param_1 + 0x12) = lVar12;
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_48 ^ (ulonglong)auStack_98)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_48 ^ (ulonglong)auStack_98);
  pcVar10 = (code *)swi(3);
  (*pcVar10)();
  return;
}


