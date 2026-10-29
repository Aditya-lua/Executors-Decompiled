/* 7ff70c802200 FUN_7ff70c802200 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c802200(undefined8 param_1,longlong param_2)

{
  int *piVar1;
  short sVar2;
  code *pcVar3;
  longlong lVar4;
  undefined8 uVar5;
  int iVar6;
  longlong lVar7;
  longlong lVar8;
  undefined1 auStack_38 [32];
  ulonglong uStack_18;
  
  uStack_18 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  uVar5 = (*_DAT_7ff70cbe9460)(param_2,_DAT_7ff70cc1a3d0);
  lVar4 = _DAT_7ff70cc1a3c0;
  if (_DAT_7ff70cc1a3c0 != 0) {
    piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
    sVar2 = *(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
    if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + (longlong)sVar2 * 8) == *piVar1) {
      lVar7 = _DAT_7ff70cc1a3c0 + (longlong)sVar2 * 8 + 0x2874;
    }
    else {
      lVar7 = _DAT_7ff70cc1a3c0 + 0x2874;
      iVar6 = (sVar2 + 1) % 6;
      *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
      lVar8 = (longlong)iVar6;
      lVar7 = lVar7 + lVar8 * 8;
      *(int *)(lVar4 + 0x2874 + lVar8 * 8) = *piVar1;
      *(undefined4 *)(lVar4 + 0x2878 + lVar8 * 8) = 0;
    }
    if (param_2 == -1) {
      *(short *)(lVar7 + 6) = *(short *)(lVar7 + 6) + 1;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    else {
      *(short *)(lVar7 + 4) = *(short *)(lVar7 + 4) + 1;
      *(int *)(lVar4 + 0x2868) = *(int *)(lVar4 + 0x2868) + 1;
    }
  }
  if (_DAT_7ff70cbebd80 != (uStack_18 ^ (ulonglong)auStack_38)) {
    FUN_7ff70caa97e0(uStack_18 ^ (ulonglong)auStack_38);
    pcVar3 = (code *)swi(3);
    (*pcVar3)();
    return;
  }
  FUN_7ff70cb12b60(uVar5,param_1,param_2);
  return;
}


