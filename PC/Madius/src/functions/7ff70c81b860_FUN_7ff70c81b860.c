/* 7ff70c81b860 FUN_7ff70c81b860 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c81b860(longlong param_1,longlong param_2)

{
  longlong lVar1;
  code *pcVar2;
  uint uVar3;
  uint uVar4;
  ulonglong uVar5;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  uVar3 = *(uint *)(param_1 + 0x14) >> 0x19 & 1;
  uVar4 = *(uint *)(param_2 + 0x14) >> 0x19 & 1;
  if (uVar3 == uVar4) {
    uVar5 = (ulonglong)*(uint *)(_DAT_7ff70cc1a3c0 + 0x13e0);
    do {
      if ((int)uVar5 < 1) break;
      lVar1 = *(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13e8) + -8 + uVar5 * 8);
      if (lVar1 == param_1) {
        uVar5 = CONCAT71((int7)((ulonglong)_DAT_7ff70cc1a3c0 >> 8),1);
        goto LAB_7ff70c81b8c9;
      }
      uVar5 = uVar5 - 1;
    } while (lVar1 != param_2);
    uVar5 = 0;
  }
  else {
    uVar5 = (ulonglong)(uVar4 < uVar3);
  }
LAB_7ff70c81b8c9:
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return uVar5;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar2 = (code *)swi(3);
  uVar5 = (*pcVar2)();
  return uVar5;
}


