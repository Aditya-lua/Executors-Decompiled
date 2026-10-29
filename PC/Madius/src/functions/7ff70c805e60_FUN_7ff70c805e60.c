/* 7ff70c805e60 FUN_7ff70c805e60 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c805e60(int *param_1,uint param_2,undefined8 param_3)

{
  int *piVar1;
  code *pcVar2;
  ulonglong uVar3;
  int iVar4;
  uint *puVar5;
  short sVar6;
  ulonglong uVar7;
  longlong lVar8;
  int iVar9;
  int iVar10;
  ulonglong uVar11;
  longlong lVar12;
  longlong lVar13;
  uint *puVar14;
  longlong lVar15;
  undefined1 auStack_68 [40];
  ulonglong uStack_40;
  
  uStack_40 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_68;
  puVar5 = *(uint **)(param_1 + 2);
  iVar10 = *param_1;
  uVar11 = (ulonglong)iVar10;
  puVar14 = puVar5;
  uVar7 = uVar11;
  while (uVar3 = uVar7, uVar3 != 0) {
    uVar7 = uVar3 >> 1;
    if (puVar14[uVar7 * 4] < param_2) {
      puVar14 = puVar14 + uVar7 * 4 + 4;
      uVar7 = ~uVar7 + uVar3;
    }
  }
  if ((puVar14 == puVar5 + uVar11 * 4) || (*puVar14 != param_2)) {
    lVar15 = (longlong)puVar14 - (longlong)puVar5;
    if (iVar10 == param_1[1]) {
      if (iVar10 == 0) {
        iVar4 = 8;
      }
      else {
        iVar4 = iVar10 / 2 + iVar10;
      }
      iVar9 = iVar10 + 1;
      if (iVar10 + 1 < iVar4) {
        iVar9 = iVar4;
      }
      puVar5 = (uint *)(*_DAT_7ff70cbe9460)((longlong)iVar9 << 4,_DAT_7ff70cc1a3d0);
      lVar13 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar8 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar8 * 8) == *piVar1) {
          sVar6 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar8 * 8) + 1;
        }
        else {
          iVar10 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar10;
          lVar8 = (longlong)iVar10;
          *(int *)(lVar13 + 0x2874 + lVar8 * 8) = *piVar1;
          *(undefined4 *)(lVar13 + 0x2878 + lVar8 * 8) = 0;
          sVar6 = 1;
        }
        *(short *)(lVar13 + 0x2878 + lVar8 * 8) = sVar6;
        *(int *)(lVar13 + 0x2868) = *(int *)(lVar13 + 0x2868) + 1;
      }
      if (*(longlong *)(param_1 + 2) != 0) {
        FUN_7ff70cb12b60(puVar5,*(longlong *)(param_1 + 2),(longlong)*param_1 << 4);
        lVar8 = _DAT_7ff70cc1a3c0;
        lVar13 = *(longlong *)(param_1 + 2);
        if ((lVar13 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar12 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar12 * 8) == *piVar1) {
            sVar6 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar12 * 8) + 1;
          }
          else {
            iVar10 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar10;
            lVar12 = (longlong)iVar10;
            *(int *)(lVar8 + 0x2874 + lVar12 * 8) = *piVar1;
            *(undefined4 *)(lVar8 + 0x2878 + lVar12 * 8) = 0;
            sVar6 = 1;
          }
          *(short *)(lVar8 + 0x287a + lVar12 * 8) = sVar6;
          *(int *)(lVar8 + 0x286c) = *(int *)(lVar8 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar13,_DAT_7ff70cc1a3d0);
      }
      *(uint **)(param_1 + 2) = puVar5;
      param_1[1] = iVar9;
      uVar11 = (ulonglong)*param_1;
    }
    lVar13 = uVar11 - (lVar15 >> 4);
    if (lVar13 != 0 && lVar15 >> 4 <= (longlong)uVar11) {
      FUN_7ff70cb12b70((longlong)puVar5 + lVar15 + 0x10,(longlong)puVar5 + lVar15,lVar13 * 0x10);
      puVar5 = *(uint **)(param_1 + 2);
    }
    *(uint *)((longlong)puVar5 + lVar15) = param_2;
    *(undefined8 *)((longlong)puVar5 + lVar15 + 8) = param_3;
    *param_1 = *param_1 + 1;
  }
  else {
    *(undefined8 *)(puVar14 + 2) = param_3;
  }
  if (_DAT_7ff70cbebd80 != (uStack_40 ^ (ulonglong)auStack_68)) {
    FUN_7ff70caa97e0(uStack_40 ^ (ulonglong)auStack_68);
    pcVar2 = (code *)swi(3);
    (*pcVar2)();
    return;
  }
  return;
}


