/* 7ff70c805430 FUN_7ff70c805430 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint * FUN_7ff70c805430(int *param_1,uint param_2,undefined8 param_3)

{
  int *piVar1;
  code *pcVar2;
  ulonglong uVar3;
  int iVar4;
  uint *puVar5;
  short sVar6;
  ulonglong uVar7;
  longlong lVar8;
  longlong lVar9;
  uint *puVar10;
  int iVar11;
  ulonglong uVar12;
  longlong lVar13;
  longlong lVar14;
  int iVar15;
  undefined1 auStack_68 [40];
  ulonglong uStack_40;
  
  uStack_40 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_68;
  puVar5 = *(uint **)(param_1 + 2);
  iVar11 = *param_1;
  uVar12 = (ulonglong)iVar11;
  puVar10 = puVar5;
  uVar7 = uVar12;
  while (uVar3 = uVar7, uVar3 != 0) {
    uVar7 = uVar3 >> 1;
    if (puVar10[uVar7 * 4] < param_2) {
      puVar10 = puVar10 + uVar7 * 4 + 4;
      uVar7 = ~uVar7 + uVar3;
    }
  }
  if ((puVar10 == puVar5 + uVar12 * 4) || (*puVar10 != param_2)) {
    lVar9 = (longlong)puVar10 - (longlong)puVar5;
    if (iVar11 == param_1[1]) {
      if (iVar11 == 0) {
        iVar4 = 8;
      }
      else {
        iVar4 = iVar11 / 2 + iVar11;
      }
      iVar15 = iVar11 + 1;
      if (iVar11 + 1 < iVar4) {
        iVar15 = iVar4;
      }
      puVar5 = (uint *)(*_DAT_7ff70cbe9460)((longlong)iVar15 << 4,_DAT_7ff70cc1a3d0);
      lVar14 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar8 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar8 * 8) == *piVar1) {
          sVar6 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar8 * 8) + 1;
        }
        else {
          iVar11 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar11;
          lVar8 = (longlong)iVar11;
          *(int *)(lVar14 + 0x2874 + lVar8 * 8) = *piVar1;
          *(undefined4 *)(lVar14 + 0x2878 + lVar8 * 8) = 0;
          sVar6 = 1;
        }
        *(short *)(lVar14 + 0x2878 + lVar8 * 8) = sVar6;
        *(int *)(lVar14 + 0x2868) = *(int *)(lVar14 + 0x2868) + 1;
      }
      if (*(longlong *)(param_1 + 2) != 0) {
        FUN_7ff70cb12b60(puVar5,*(longlong *)(param_1 + 2),(longlong)*param_1 << 4);
        lVar8 = _DAT_7ff70cc1a3c0;
        lVar14 = *(longlong *)(param_1 + 2);
        if ((lVar14 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar13 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar13 * 8) == *piVar1) {
            sVar6 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar13 * 8) + 1;
          }
          else {
            iVar11 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar11;
            lVar13 = (longlong)iVar11;
            *(int *)(lVar8 + 0x2874 + lVar13 * 8) = *piVar1;
            *(undefined4 *)(lVar8 + 0x2878 + lVar13 * 8) = 0;
            sVar6 = 1;
          }
          *(short *)(lVar8 + 0x287a + lVar13 * 8) = sVar6;
          *(int *)(lVar8 + 0x286c) = *(int *)(lVar8 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar14,_DAT_7ff70cc1a3d0);
      }
      *(uint **)(param_1 + 2) = puVar5;
      param_1[1] = iVar15;
      uVar12 = (ulonglong)*param_1;
    }
    lVar14 = uVar12 - (lVar9 >> 4);
    if (lVar14 != 0 && lVar9 >> 4 <= (longlong)uVar12) {
      FUN_7ff70cb12b70((longlong)puVar5 + lVar9 + 0x10,(longlong)puVar5 + lVar9,lVar14 * 0x10);
      puVar5 = *(uint **)(param_1 + 2);
    }
    *(uint *)((longlong)puVar5 + lVar9) = param_2;
    *(undefined8 *)((longlong)puVar5 + lVar9 + 8) = param_3;
    *param_1 = *param_1 + 1;
    puVar10 = (uint *)(lVar9 + *(longlong *)(param_1 + 2));
  }
  if (_DAT_7ff70cbebd80 != (uStack_40 ^ (ulonglong)auStack_68)) {
    FUN_7ff70caa97e0(uStack_40 ^ (ulonglong)auStack_68);
    pcVar2 = (code *)swi(3);
    puVar5 = (uint *)(*pcVar2)();
    return puVar5;
  }
  return puVar10 + 2;
}


