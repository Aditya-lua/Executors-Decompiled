/* 7ff70c846c80 FUN_7ff70c846c80 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c846c80(uint param_1,int param_2)

{
  longlong lVar1;
  code *pcVar2;
  uint uVar3;
  longlong lVar4;
  uint uVar5;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  if (0x9a < param_1 - 0x200) {
    lVar4 = CONCAT71((int7)(uStack_8 >> 8),1);
    if (POPCOUNT(param_1) != 1) goto LAB_7ff70c846d69;
    uVar5 = 0;
    for (uVar3 = param_1; (uVar3 & 1) == 0; uVar3 = uVar3 >> 1 | 0x80000000) {
      uVar5 = uVar5 + 1;
    }
    if ((uVar5 & 0x1c) != 0xc) goto LAB_7ff70c846d69;
  }
  if ((((*(char *)(_DAT_7ff70cc1a3c0 + 0x1dd4) == '\x01') && (param_1 - 0x200 < 0x78)) &&
      (param_2 != 0)) && (param_2 != *(int *)(_DAT_7ff70cc1a3c0 + 0x14b4))) {
    lVar4 = 0;
  }
  else {
    uVar5 = param_1;
    if (POPCOUNT(param_1) == 1 && (param_1 & 0xf000) != 0) {
      uVar3 = 0;
      for (; (uVar5 & 1) == 0; uVar5 = uVar5 >> 1 | 0x80000000) {
        uVar3 = uVar3 + 1;
      }
      uVar5 = uVar3 + 0x28b;
      if ((uVar3 & 0x1c) != 0xc) {
        uVar5 = param_1;
      }
    }
    lVar1 = _DAT_7ff70cc1a3c0 + (longlong)(int)uVar5 * 0xc;
    if (param_2 == 0) {
      lVar4 = CONCAT71((int7)((ulonglong)_DAT_7ff70cc1a3c0 >> 8),*(char *)(lVar1 + -0x2c4) == '\0');
    }
    else {
      lVar4 = _DAT_7ff70cc1a3c0;
      if ((*(int *)(lVar1 + -0x2cc) == param_2) ||
         ((lVar4 = 0, *(int *)(lVar1 + -0x2cc) == -1 && (*(char *)(lVar1 + -0x2c4) == '\0')))) {
        lVar4 = CONCAT71((int7)((ulonglong)lVar4 >> 8),1);
      }
    }
  }
LAB_7ff70c846d69:
  if (_DAT_7ff70cbebd80 != (uStack_8 ^ (ulonglong)auStack_28)) {
    FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
    pcVar2 = (code *)swi(3);
    lVar4 = (*pcVar2)();
    return lVar4;
  }
  return lVar4;
}


