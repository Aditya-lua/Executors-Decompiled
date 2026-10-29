/* 7ff70c810bb0 FUN_7ff70c810bb0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c810bb0(longlong param_1)

{
  int *piVar1;
  code *pcVar2;
  longlong lVar3;
  short sVar4;
  int iVar5;
  longlong lVar6;
  undefined1 auStack_38 [32];
  ulonglong uStack_18;
  
  lVar3 = _DAT_7ff70cc1a3c0;
  uStack_18 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  if (param_1 == 0) {
    param_1 = _DAT_7ff70cc1a3c0;
  }
  _DAT_7ff70cc1a3c0 = param_1;
  FUN_7ff70c810ce0();
  _DAT_7ff70cc1a3c0 = 0;
  if (lVar3 != param_1) {
    _DAT_7ff70cc1a3c0 = lVar3;
  }
  if (param_1 == 0) {
    if (_DAT_7ff70cbebd80 == (uStack_18 ^ (ulonglong)auStack_38)) {
      return;
    }
  }
  else {
    FUN_7ff70c873b00(param_1);
    lVar3 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar6 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar6 * 8) == *piVar1) {
        sVar4 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar6 * 8) + 1;
      }
      else {
        iVar5 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar5;
        lVar6 = (longlong)iVar5;
        *(int *)(lVar3 + 0x2874 + lVar6 * 8) = *piVar1;
        *(undefined4 *)(lVar3 + 0x2878 + lVar6 * 8) = 0;
        sVar4 = 1;
      }
      *(short *)(lVar3 + 0x287a + lVar6 * 8) = sVar4;
      *(int *)(lVar3 + 0x286c) = *(int *)(lVar3 + 0x286c) + 1;
    }
    if (_DAT_7ff70cbebd80 == (uStack_18 ^ (ulonglong)auStack_38)) {
                    /* WARNING: Could not recover jumptable at 0x7ff70c810cce. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*_DAT_7ff70cbe9468)(param_1,_DAT_7ff70cc1a3d0);
      return;
    }
  }
  FUN_7ff70caa97e0(uStack_18 ^ (ulonglong)auStack_38);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


