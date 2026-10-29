/* 7ff70c7e9290 FUN_7ff70c7e9290 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7e9290(longlong param_1,longlong param_2)

{
  longlong *plVar1;
  code *pcVar2;
  longlong lVar3;
  longlong *plVar4;
  undefined1 auStack_38 [40];
  ulonglong uStack_10;
  
  uStack_10 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  plVar1 = *(longlong **)(param_1 + 0x2a8);
  lVar3 = (longlong)*(int *)(param_1 + 0x2a0);
  plVar4 = plVar1;
  if (0 < lVar3) {
    do {
      if (*plVar4 == param_2) break;
      plVar4 = plVar4 + 1;
    } while (plVar4 < plVar1 + lVar3);
  }
  if (plVar4 < plVar1 + lVar3) {
    FUN_7ff70cb12b70(plVar4,plVar4 + 1,
                     (((ulonglong)~((longlong)plVar4 - (longlong)plVar1) >> 3) + lVar3) * 8);
    *(int *)(param_1 + 0x2a0) = *(int *)(param_1 + 0x2a0) + -1;
  }
  if (_DAT_7ff70cbebd80 != (uStack_10 ^ (ulonglong)auStack_38)) {
    FUN_7ff70caa97e0(uStack_10 ^ (ulonglong)auStack_38);
    pcVar2 = (code *)swi(3);
    (*pcVar2)();
    return;
  }
  return;
}


