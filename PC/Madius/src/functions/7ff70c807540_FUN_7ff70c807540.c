/* 7ff70c807540 FUN_7ff70c807540 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c807540(int *param_1,undefined8 param_2,undefined8 param_3)

{
  int *piVar1;
  code *pcVar2;
  undefined8 uVar3;
  int iVar4;
  ulonglong *puVar5;
  longlong lVar6;
  short sVar7;
  int iVar8;
  longlong lVar9;
  longlong lVar10;
  int iVar11;
  longlong lVar12;
  int iVar13;
  int iVar14;
  int iVar15;
  undefined1 auStack_88 [32];
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  ulonglong uStack_48;
  
  uStack_48 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_88;
  uStack_58 = param_3;
  uStack_50 = param_3;
  puVar5 = (ulonglong *)FUN_7ff70ca421b0();
  uStack_68 = 0;
  lVar6 = 0;
  uStack_60 = param_3;
  iVar4 = func_0x7ff70da52bd8(*puVar5 | 1,0,0,param_2);
  iVar15 = -1;
  if (-1 < lVar6) {
    iVar15 = iVar4;
  }
  if (lVar6 < 1) {
    if (_DAT_7ff70cbebd80 == (uStack_48 ^ (ulonglong)auStack_88)) {
      return;
    }
    FUN_7ff70caa97e0(uStack_48 ^ (ulonglong)auStack_88);
    pcVar2 = (code *)swi(3);
    (*pcVar2)();
    return;
  }
  iVar4 = param_1[1];
  iVar14 = *param_1 + (uint)(*param_1 == 0);
  iVar11 = iVar14 + iVar15;
  if (iVar11 < iVar4) {
LAB_7ff70c80767e:
    if (iVar11 <= iVar4) {
      lVar6 = *(longlong *)(param_1 + 2);
      goto LAB_7ff70c8077c9;
    }
    if (iVar4 == 0) {
      iVar13 = 8;
    }
    else {
      iVar13 = iVar4 / 2 + iVar4;
    }
    if (iVar13 <= iVar11) {
      iVar13 = iVar11;
    }
    lVar6 = (*_DAT_7ff70cbe9460)((longlong)iVar13,_DAT_7ff70cc1a3d0);
    if (_DAT_7ff70cc1a3c0 != 0) {
      iVar4 = *(int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar9 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar9 * 8) == iVar4) goto LAB_7ff70c8076e8;
LAB_7ff70c807618:
      lVar12 = _DAT_7ff70cc1a3c0;
      lVar10 = _DAT_7ff70cc1a3c0 + 0x2874;
      iVar8 = ((int)lVar9 + 1) % 6;
      *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar8;
      lVar9 = (longlong)iVar8;
      lVar10 = lVar10 + lVar9 * 8;
      *(int *)(lVar12 + 0x2874 + lVar9 * 8) = iVar4;
      *(undefined4 *)(lVar12 + 0x2878 + lVar9 * 8) = 0;
      if (iVar13 == -1) goto LAB_7ff70c80766f;
LAB_7ff70c8076fd:
      *(short *)(lVar10 + 4) = *(short *)(lVar10 + 4) + 1;
      *(int *)(lVar12 + 0x2868) = *(int *)(lVar12 + 0x2868) + 1;
    }
  }
  else {
    iVar13 = iVar4 * 2;
    if (iVar4 * 2 < iVar11) {
      iVar13 = iVar11;
    }
    if (iVar13 <= iVar4) goto LAB_7ff70c80767e;
    lVar6 = (*_DAT_7ff70cbe9460)((longlong)iVar13,_DAT_7ff70cc1a3d0);
    if (_DAT_7ff70cc1a3c0 != 0) {
      iVar4 = *(int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar9 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar9 * 8) != iVar4) goto LAB_7ff70c807618;
LAB_7ff70c8076e8:
      lVar10 = _DAT_7ff70cc1a3c0 + lVar9 * 8 + 0x2874;
      lVar12 = _DAT_7ff70cc1a3c0;
      if (iVar13 != -1) goto LAB_7ff70c8076fd;
LAB_7ff70c80766f:
      *(short *)(lVar10 + 6) = *(short *)(lVar10 + 6) + 1;
      *(int *)(lVar12 + 0x286c) = *(int *)(lVar12 + 0x286c) + 1;
    }
  }
  if (*(longlong *)(param_1 + 2) != 0) {
    FUN_7ff70cb12b60(lVar6,*(longlong *)(param_1 + 2),(longlong)*param_1);
    lVar10 = _DAT_7ff70cc1a3c0;
    lVar9 = *(longlong *)(param_1 + 2);
    if ((lVar9 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar12 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar12 * 8) == *piVar1) {
        sVar7 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar12 * 8) + 1;
      }
      else {
        iVar4 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar4;
        lVar12 = (longlong)iVar4;
        *(int *)(lVar10 + 0x2874 + lVar12 * 8) = *piVar1;
        *(undefined4 *)(lVar10 + 0x2878 + lVar12 * 8) = 0;
        sVar7 = 1;
      }
      *(short *)(lVar10 + 0x287a + lVar12 * 8) = sVar7;
      *(int *)(lVar10 + 0x286c) = *(int *)(lVar10 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar9,_DAT_7ff70cc1a3d0);
  }
  *(longlong *)(param_1 + 2) = lVar6;
  param_1[1] = iVar13;
LAB_7ff70c8077c9:
  uVar3 = uStack_58;
  *param_1 = iVar11;
  puVar5 = (ulonglong *)FUN_7ff70ca421b0();
  uStack_60 = uVar3;
  uStack_68 = 0;
  func_0x7ff70da733fb(*puVar5 | 1,lVar6 + iVar14 + -1,iVar15 + 1,param_2);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}


