/* 7ff70c80eb30 FUN_7ff70c80eb30 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c80eb30(undefined8 param_1)

{
  int *piVar1;
  longlong lVar2;
  longlong lVar3;
  longlong lVar4;
  short sVar5;
  int iVar6;
  longlong lVar7;
  
  lVar2 = _DAT_7ff70cc1a3c0;
  lVar4 = (*_DAT_7ff70cbe9460)(0x2a00,_DAT_7ff70cc1a3d0);
  lVar3 = _DAT_7ff70cc1a3c0;
  if (_DAT_7ff70cc1a3c0 != 0) {
    piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
    lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
    if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
      sVar5 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar7 * 8) + 1;
    }
    else {
      iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
      *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
      lVar7 = (longlong)iVar6;
      *(int *)(lVar3 + 0x2874 + lVar7 * 8) = *piVar1;
      *(undefined4 *)(lVar3 + 0x2878 + lVar7 * 8) = 0;
      sVar5 = 1;
    }
    *(short *)(lVar3 + 0x2878 + lVar7 * 8) = sVar5;
    *(int *)(lVar3 + 0x2868) = *(int *)(lVar3 + 0x2868) + 1;
  }
  FUN_7ff70c80ec10(lVar4,param_1);
  _DAT_7ff70cc1a3c0 = lVar4;
  FUN_7ff70c810020();
  if (lVar2 != 0) {
    _DAT_7ff70cc1a3c0 = lVar2;
  }
  return lVar4;
}


