/* 7ff70c8704b0 FUN_7ff70c8704b0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8704b0(longlong param_1,uint param_2)

{
  int *piVar1;
  undefined8 *puVar2;
  undefined4 *puVar3;
  uint *puVar4;
  code *pcVar5;
  float fVar6;
  float fVar7;
  longlong lVar8;
  ulonglong uVar9;
  undefined4 *puVar10;
  short sVar11;
  uint uVar12;
  longlong lVar13;
  ulonglong uVar14;
  int iVar15;
  longlong lVar16;
  float fVar17;
  float fVar18;
  undefined1 auStack_d8 [32];
  undefined4 uStack_b8;
  undefined4 uStack_b0;
  undefined8 uStack_a8;
  undefined4 uStack_a0;
  undefined4 uStack_9c;
  undefined4 uStack_98;
  undefined4 uStack_94;
  undefined4 uStack_90;
  undefined4 uStack_8c;
  undefined4 uStack_88;
  undefined4 uStack_84;
  undefined4 uStack_80;
  undefined4 uStack_7c;
  undefined4 uStack_78;
  undefined4 uStack_74;
  undefined4 uStack_70;
  undefined4 uStack_6c;
  undefined8 uStack_68;
  undefined8 uStack_60;
  float fStack_58;
  float fStack_54;
  float fStack_50;
  float fStack_4c;
  ulonglong uStack_40;
  
  uStack_40 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_d8;
  if (0xffffff < param_2) {
    lVar8 = **(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88);
    fVar6 = *(float *)(lVar8 + 8);
    fVar7 = *(float *)(lVar8 + 0xc);
    fVar17 = (float)*(undefined8 *)(lVar8 + 0x10) + fVar6;
    fVar18 = (float)((ulonglong)*(undefined8 *)(lVar8 + 0x10) >> 0x20) + fVar7;
    puVar4 = *(uint **)(*(longlong *)(param_1 + 0x3c0) + 0x2c8);
    fStack_58 = fVar6;
    fStack_54 = fVar7;
    fStack_50 = fVar17;
    fStack_4c = fVar18;
    if (*puVar4 == 0) {
      FUN_7ff70c7b7240(puVar4);
    }
    uStack_a8 = CONCAT44(fVar18 + _UNK_7ff70cb1bb64,fVar17 + _DAT_7ff70cb1bb60);
    uStack_60 = CONCAT44(fVar7 + _UNK_7ff70cb1d554,fVar6 + _DAT_7ff70cb1d550);
    FUN_7ff70c7b7c50(puVar4,&uStack_60,&uStack_a8,0);
    uStack_b0 = 0;
    uStack_b8 = 0;
    FUN_7ff70c7bd960(puVar4,&fStack_58,&fStack_50,param_2);
    puVar10 = *(undefined4 **)(puVar4 + 2);
    lVar8 = (longlong)(int)*puVar4;
    uStack_68 = *(undefined8 *)(puVar10 + lVar8 * 0x12 + -2);
    puVar2 = (undefined8 *)(puVar10 + lVar8 * 0x12 + -0x12);
    uStack_a8 = *puVar2;
    uStack_a0 = *(undefined4 *)(puVar2 + 1);
    uStack_9c = *(undefined4 *)((longlong)puVar2 + 0xc);
    puVar3 = puVar10 + lVar8 * 0x12 + -0xe;
    uStack_98 = *puVar3;
    uStack_94 = puVar3[1];
    uStack_90 = puVar3[2];
    uStack_8c = puVar3[3];
    puVar3 = puVar10 + lVar8 * 0x12 + -10;
    uStack_88 = *puVar3;
    uStack_84 = puVar3[1];
    uStack_80 = puVar3[2];
    uStack_7c = puVar3[3];
    puVar3 = puVar10 + lVar8 * 0x12 + -6;
    uStack_78 = *puVar3;
    uStack_74 = puVar3[1];
    uStack_70 = puVar3[2];
    uStack_6c = puVar3[3];
    uVar9 = lVar8 - 1;
    uVar12 = (uint)uVar9;
    *puVar4 = uVar12;
    if (uVar12 == 0) {
      if (puVar4[1] == 0) {
        puVar10 = (undefined4 *)(*_DAT_7ff70cbe9460)(0x240,_DAT_7ff70cc1a3d0);
        lVar8 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar13 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar13 * 8) == *piVar1) {
            sVar11 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar13 * 8) + 1;
          }
          else {
            iVar15 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar15;
            lVar13 = (longlong)iVar15;
            *(int *)(lVar8 + 0x2874 + lVar13 * 8) = *piVar1;
            *(undefined4 *)(lVar8 + 0x2878 + lVar13 * 8) = 0;
            sVar11 = 1;
          }
          *(short *)(lVar8 + 0x2878 + lVar13 * 8) = sVar11;
          *(int *)(lVar8 + 0x2868) = *(int *)(lVar8 + 0x2868) + 1;
        }
        if (*(longlong *)(puVar4 + 2) != 0) {
          FUN_7ff70cb12b60(puVar10,*(longlong *)(puVar4 + 2),(longlong)(int)*puVar4 * 0x48);
          lVar13 = _DAT_7ff70cc1a3c0;
          lVar8 = *(longlong *)(puVar4 + 2);
          if ((lVar8 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar16 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar16 * 8) == *piVar1) {
              sVar11 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar16 * 8) + 1;
            }
            else {
              iVar15 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar15;
              lVar16 = (longlong)iVar15;
              *(int *)(lVar13 + 0x2874 + lVar16 * 8) = *piVar1;
              *(undefined4 *)(lVar13 + 0x2878 + lVar16 * 8) = 0;
              sVar11 = 1;
            }
            *(short *)(lVar13 + 0x287a + lVar16 * 8) = sVar11;
            *(int *)(lVar13 + 0x286c) = *(int *)(lVar13 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar8,_DAT_7ff70cc1a3d0);
        }
        *(undefined4 **)(puVar4 + 2) = puVar10;
        puVar4[1] = 8;
        lVar8 = (longlong)(int)*puVar4;
      }
      else {
        lVar8 = 0;
      }
      puVar10 = puVar10 + lVar8 * 0x12;
    }
    else {
      if (uVar12 == puVar4[1]) {
        uVar12 = (int)(((uint)(uVar9 >> 0x1f) & 1) + uVar12) >> 1;
        uVar14 = 1;
        if (1 < (int)uVar12) {
          uVar14 = (ulonglong)uVar12;
        }
        puVar10 = (undefined4 *)(*_DAT_7ff70cbe9460)((uVar14 + uVar9) * 0x48,_DAT_7ff70cc1a3d0);
        lVar8 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar13 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar13 * 8) == *piVar1) {
            sVar11 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar13 * 8) + 1;
          }
          else {
            iVar15 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar15;
            lVar13 = (longlong)iVar15;
            *(int *)(lVar8 + 0x2874 + lVar13 * 8) = *piVar1;
            *(undefined4 *)(lVar8 + 0x2878 + lVar13 * 8) = 0;
            sVar11 = 1;
          }
          *(short *)(lVar8 + 0x2878 + lVar13 * 8) = sVar11;
          *(int *)(lVar8 + 0x2868) = *(int *)(lVar8 + 0x2868) + 1;
        }
        if (*(longlong *)(puVar4 + 2) != 0) {
          FUN_7ff70cb12b60(puVar10,*(longlong *)(puVar4 + 2),(longlong)(int)*puVar4 * 0x48);
          lVar13 = _DAT_7ff70cc1a3c0;
          lVar8 = *(longlong *)(puVar4 + 2);
          if ((lVar8 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar16 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar16 * 8) == *piVar1) {
              sVar11 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar16 * 8) + 1;
            }
            else {
              iVar15 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar15;
              lVar16 = (longlong)iVar15;
              *(int *)(lVar13 + 0x2874 + lVar16 * 8) = *piVar1;
              *(undefined4 *)(lVar13 + 0x2878 + lVar16 * 8) = 0;
              sVar11 = 1;
            }
            *(short *)(lVar13 + 0x287a + lVar16 * 8) = sVar11;
            *(int *)(lVar13 + 0x286c) = *(int *)(lVar13 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar8,_DAT_7ff70cc1a3d0);
        }
        *(undefined4 **)(puVar4 + 2) = puVar10;
        puVar4[1] = (uint)(uVar14 + uVar9);
        uVar9 = (ulonglong)*puVar4;
      }
      if (0 < (int)uVar9) {
        FUN_7ff70cb12b70(puVar10 + 0x12,puVar10,(uVar9 & 0xffffffff) * 0x48);
        puVar10 = *(undefined4 **)(puVar4 + 2);
      }
    }
    *(undefined8 *)(puVar10 + 0x10) = uStack_68;
    puVar10[0xc] = uStack_78;
    puVar10[0xd] = uStack_74;
    puVar10[0xe] = uStack_70;
    puVar10[0xf] = uStack_6c;
    puVar10[8] = uStack_88;
    puVar10[9] = uStack_84;
    puVar10[10] = uStack_80;
    puVar10[0xb] = uStack_7c;
    puVar10[4] = uStack_98;
    puVar10[5] = uStack_94;
    puVar10[6] = uStack_90;
    puVar10[7] = uStack_8c;
    *puVar10 = (undefined4)uStack_a8;
    puVar10[1] = uStack_a8._4_4_;
    puVar10[2] = uStack_a0;
    puVar10[3] = uStack_9c;
    *puVar4 = *puVar4 + 1;
    FUN_7ff70c7b7240(puVar4);
    FUN_7ff70c7b8130(puVar4);
  }
  if (_DAT_7ff70cbebd80 == (uStack_40 ^ (ulonglong)auStack_d8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_40 ^ (ulonglong)auStack_d8);
  pcVar5 = (code *)swi(3);
  (*pcVar5)();
  return;
}


