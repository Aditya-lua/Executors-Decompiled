/* 7ff70c83cc20 FUN_7ff70c83cc20 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c83cc20(longlong param_1,longlong param_2,char param_3)

{
  code *pcVar1;
  longlong lVar2;
  longlong lVar3;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  if (param_1 == 0) {
    lVar2 = CONCAT71((int7)(uStack_8 >> 8),param_2 == 0);
  }
  else {
    lVar2 = param_1;
    if (param_3 == '\0') {
      do {
        lVar3 = lVar2;
        lVar2 = *(longlong *)(lVar3 + 0x3c0);
      } while (lVar3 != lVar2);
    }
    else {
      do {
        lVar3 = lVar2;
        lVar2 = *(longlong *)(*(longlong *)(lVar3 + 0x3c0) + 0x3c8);
      } while (lVar3 != lVar2);
    }
    if (lVar3 == param_2) {
      lVar2 = CONCAT71((int7)((ulonglong)lVar2 >> 8),1);
    }
    else {
      do {
        lVar2 = CONCAT71((int7)((ulonglong)lVar2 >> 8),param_1 == param_2);
        if ((param_1 == param_2) || (param_1 == lVar3)) break;
        param_1 = *(longlong *)(param_1 + 0x3b0);
      } while (param_1 != 0);
    }
  }
  if (_DAT_7ff70cbebd80 != (uStack_8 ^ (ulonglong)auStack_28)) {
    FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
    pcVar1 = (code *)swi(3);
    lVar2 = (*pcVar1)();
    return lVar2;
  }
  return lVar2;
}


