/* 7ff70c83c390 FUN_7ff70c83c390 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c83c390(uint param_1,char param_2)

{
  int *piVar1;
  longlong lVar2;
  code *pcVar3;
  uint uVar4;
  longlong lVar5;
  longlong lVar6;
  short sVar7;
  int iVar8;
  longlong lVar9;
  int iVar10;
  int iVar11;
  longlong lVar12;
  undefined1 auStack_48 [32];
  ulonglong uStack_28;
  
  lVar5 = _DAT_7ff70cc1a3c0;
  uStack_28 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  uVar4 = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1de0) | param_1;
  if (param_2 == '\0') {
    uVar4 = ~param_1 & *(uint *)(_DAT_7ff70cc1a3c0 + 0x1de0);
  }
  iVar11 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f30);
  *(uint *)(_DAT_7ff70cc1a3c0 + 0x1de0) = uVar4;
  if (iVar11 == *(int *)(lVar5 + 0x1f34)) {
    if (iVar11 == 0) {
      iVar8 = 8;
    }
    else {
      iVar8 = iVar11 / 2 + iVar11;
    }
    iVar10 = iVar11 + 1;
    if (iVar11 + 1 < iVar8) {
      iVar10 = iVar8;
    }
    lVar6 = (*_DAT_7ff70cbe9460)((longlong)iVar10 << 2,_DAT_7ff70cc1a3d0);
    lVar2 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar9 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar9 * 8) == *piVar1) {
        sVar7 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar9 * 8) + 1;
      }
      else {
        iVar11 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar11;
        lVar9 = (longlong)iVar11;
        *(int *)(lVar2 + 0x2874 + lVar9 * 8) = *piVar1;
        *(undefined4 *)(lVar2 + 0x2878 + lVar9 * 8) = 0;
        sVar7 = 1;
      }
      *(short *)(lVar2 + 0x2878 + lVar9 * 8) = sVar7;
      *(int *)(lVar2 + 0x2868) = *(int *)(lVar2 + 0x2868) + 1;
    }
    if (*(longlong *)(lVar5 + 0x1f38) != 0) {
      FUN_7ff70cb12b60(lVar6,*(longlong *)(lVar5 + 0x1f38),(longlong)*(int *)(lVar5 + 0x1f30) << 2);
      lVar9 = _DAT_7ff70cc1a3c0;
      lVar2 = *(longlong *)(lVar5 + 0x1f38);
      if ((lVar2 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar12 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar12 * 8) == *piVar1) {
          sVar7 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar12 * 8) + 1;
        }
        else {
          iVar11 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar11;
          lVar12 = (longlong)iVar11;
          *(int *)(lVar9 + 0x2874 + lVar12 * 8) = *piVar1;
          *(undefined4 *)(lVar9 + 0x2878 + lVar12 * 8) = 0;
          sVar7 = 1;
        }
        *(short *)(lVar9 + 0x287a + lVar12 * 8) = sVar7;
        *(int *)(lVar9 + 0x286c) = *(int *)(lVar9 + 0x286c) + 1;
      }
      (*_DAT_7ff70cbe9468)(lVar2,_DAT_7ff70cc1a3d0);
    }
    *(longlong *)(lVar5 + 0x1f38) = lVar6;
    *(int *)(lVar5 + 0x1f34) = iVar10;
    iVar11 = *(int *)(lVar5 + 0x1f30);
  }
  else {
    lVar6 = *(longlong *)(lVar5 + 0x1f38);
  }
  *(uint *)(lVar6 + (longlong)iVar11 * 4) = uVar4;
  *(int *)(lVar5 + 0x1f30) = *(int *)(lVar5 + 0x1f30) + 1;
  if (_DAT_7ff70cbebd80 == (uStack_28 ^ (ulonglong)auStack_48)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_28 ^ (ulonglong)auStack_48);
  pcVar3 = (code *)swi(3);
  (*pcVar3)();
  return;
}


