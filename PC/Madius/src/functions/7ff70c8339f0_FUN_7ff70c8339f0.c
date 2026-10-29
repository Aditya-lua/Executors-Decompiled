/* 7ff70c8339f0 FUN_7ff70c8339f0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8339f0(int *param_1,longlong param_2)

{
  int *piVar1;
  longlong lVar2;
  code *pcVar3;
  uint uVar4;
  longlong lVar5;
  short sVar6;
  uint uVar7;
  longlong lVar8;
  ulonglong uVar9;
  ulonglong *puVar10;
  ulonglong unaff_RBP;
  int iVar11;
  longlong lVar12;
  ulonglong uVar13;
  ulonglong uStack_60;
  undefined1 auStack_58 [40];
  ulonglong uStack_30;
  
  puVar10 = (ulonglong *)auStack_58;
  uStack_30 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_58;
  iVar11 = *param_1;
  if (iVar11 == param_1[1]) {
    if (iVar11 == 0) {
      uVar7 = 8;
    }
    else {
      uVar7 = iVar11 / 2 + iVar11;
    }
    uVar4 = iVar11 + 1U;
    if ((int)(iVar11 + 1U) < (int)uVar7) {
      uVar4 = uVar7;
    }
    unaff_RBP = (ulonglong)uVar4;
    uStack_60 = 0x7ff70c833a51;
    lVar5 = (*_DAT_7ff70cbe9460)((longlong)(int)uVar4 << 3,_DAT_7ff70cc1a3d0);
    lVar2 = _DAT_7ff70cc1a3c0;
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
        *(int *)(lVar2 + 0x2874 + lVar8 * 8) = *piVar1;
        *(undefined4 *)(lVar2 + 0x2878 + lVar8 * 8) = 0;
        sVar6 = 1;
      }
      *(short *)(lVar2 + 0x2878 + lVar8 * 8) = sVar6;
      *(int *)(lVar2 + 0x2868) = *(int *)(lVar2 + 0x2868) + 1;
    }
    if (*(longlong *)(param_1 + 2) != 0) {
      uStack_60 = 0x7ff70c833af0;
      FUN_7ff70cb12b60(lVar5,*(longlong *)(param_1 + 2),(longlong)*param_1 << 3);
      lVar8 = _DAT_7ff70cc1a3c0;
      lVar2 = *(longlong *)(param_1 + 2);
      if ((lVar2 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar12 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar12 * 8) == *piVar1) {
          sVar6 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar12 * 8) + 1;
        }
        else {
          iVar11 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar11;
          lVar12 = (longlong)iVar11;
          *(int *)(lVar8 + 0x2874 + lVar12 * 8) = *piVar1;
          *(undefined4 *)(lVar8 + 0x2878 + lVar12 * 8) = 0;
          sVar6 = 1;
        }
        *(short *)(lVar8 + 0x287a + lVar12 * 8) = sVar6;
        *(int *)(lVar8 + 0x286c) = *(int *)(lVar8 + 0x286c) + 1;
      }
      uStack_60 = 0x7ff70c833b92;
      (*_DAT_7ff70cbe9468)(lVar2,_DAT_7ff70cc1a3d0);
    }
    *(longlong *)(param_1 + 2) = lVar5;
    param_1[1] = uVar4;
    iVar11 = *param_1;
  }
  else {
    lVar5 = *(longlong *)(param_1 + 2);
  }
  *(longlong *)(lVar5 + (longlong)iVar11 * 8) = param_2;
  *param_1 = *param_1 + 1;
  if (*(char *)(param_2 + 0xcc) == '\x01') {
    iVar11 = *(int *)(param_2 + 0x1b0);
    uVar9 = (ulonglong)iVar11;
    puVar10 = (ulonglong *)auStack_58;
    if (1 < uVar9) {
      puVar10 = &uStack_60;
      uStack_60 = unaff_RBP;
      func_0x7ff70d737b97(*(undefined8 *)(param_2 + 0x1b8),uVar9,8,&UNK_7ff70c870420);
    }
    if (0 < iVar11) {
      uVar13 = 0;
      do {
        if (*(char *)(*(longlong *)(*(longlong *)(param_2 + 0x1b8) + uVar13 * 8) + 0xcc) == '\x01')
        {
          *(undefined8 *)((longlong)puVar10 + -8) = 0x7ff70c833c04;
          FUN_7ff70c8339f0(param_1);
        }
        uVar13 = uVar13 + 1;
      } while (uVar9 != uVar13);
    }
  }
  if (_DAT_7ff70cbebd80 == (*(ulonglong *)((longlong)puVar10 + 0x28) ^ (ulonglong)puVar10)) {
    return;
  }
  *(undefined8 *)((longlong)puVar10 + -8) = 0x7ff70c833c32;
  FUN_7ff70caa97e0(*(ulonglong *)((longlong)puVar10 + 0x28) ^ (ulonglong)puVar10);
  pcVar3 = (code *)swi(3);
  (*pcVar3)();
  return;
}


