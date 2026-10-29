/* 7ff70c7fffc0 FUN_7ff70c7fffc0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c7fffc0(longlong param_1,uint param_2)

{
  code *pcVar1;
  uint uVar2;
  uint uVar3;
  longlong lVar4;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  if (POPCOUNT(param_2) == 1 && (param_2 & 0xf000) != 0) {
    uVar2 = 0;
    for (uVar3 = param_2; (uVar3 & 1) == 0; uVar3 = uVar3 >> 1 | 0x80000000) {
      uVar2 = uVar2 + 1;
    }
    if ((uVar2 & 0x1c) == 0xc) {
      param_2 = uVar2 + 0x28b;
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return (longlong)(int)param_2 * 0x10 + param_1 + -0x1efc;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar1 = (code *)swi(3);
  lVar4 = (*pcVar1)();
  return lVar4;
}


