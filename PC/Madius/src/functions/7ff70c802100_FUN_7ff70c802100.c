/* 7ff70c802100 FUN_7ff70c802100 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c802100(longlong param_1)

{
  int *piVar1;
  short sVar2;
  code *pcVar3;
  longlong lVar4;
  int iVar5;
  longlong lVar6;
  longlong lVar7;
  undefined1 auStack_38 [40];
  ulonglong uStack_10;
  
  uStack_10 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  (*_DAT_7ff70cbe9460)(param_1,_DAT_7ff70cc1a3d0);
  lVar4 = _DAT_7ff70cc1a3c0;
  if (_DAT_7ff70cc1a3c0 != 0) {
    piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
    sVar2 = *(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
    if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + (longlong)sVar2 * 8) == *piVar1) {
      lVar6 = _DAT_7ff70cc1a3c0 + (longlong)sVar2 * 8 + 0x2874;
    }
    else {
      lVar6 = _DAT_7ff70cc1a3c0 + 0x2874;
      iVar5 = (sVar2 + 1) % 6;
      *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar5;
      lVar7 = (longlong)iVar5;
      lVar6 = lVar6 + lVar7 * 8;
      *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
      *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
    }
    if (param_1 == -1) {
      *(short *)(lVar6 + 6) = *(short *)(lVar6 + 6) + 1;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    else {
      *(short *)(lVar6 + 4) = *(short *)(lVar6 + 4) + 1;
      *(int *)(lVar4 + 0x2868) = *(int *)(lVar4 + 0x2868) + 1;
    }
  }
  if (_DAT_7ff70cbebd80 != (uStack_10 ^ (ulonglong)auStack_38)) {
    FUN_7ff70caa97e0(uStack_10 ^ (ulonglong)auStack_38);
    pcVar3 = (code *)swi(3);
    (*pcVar3)();
    return;
  }
  return;
}


