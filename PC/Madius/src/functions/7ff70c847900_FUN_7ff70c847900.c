/* 7ff70c847900 FUN_7ff70c847900 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c847900(int param_1,int param_2)

{
  uint uVar1;
  longlong lVar2;
  code *pcVar3;
  uint uVar4;
  uint uVar5;
  longlong lVar6;
  ulonglong uVar7;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  if (*(char *)(_DAT_7ff70cc1a3c0 + 0xb2e + (longlong)param_1) == '\x01') {
    uVar1 = param_1 + 0x290;
    uVar7 = (ulonglong)uVar1;
    if (0x9a < param_1 + 0x90U) {
      lVar6 = CONCAT71((int7)(int3)((uint)param_1 >> 8),1);
      if (POPCOUNT(uVar1) != 1) goto LAB_7ff70c84795b;
      uVar4 = 0;
      for (uVar5 = uVar1; (uVar5 & 1) == 0; uVar5 = uVar5 >> 1 | 0x80000000) {
        uVar4 = uVar4 + 1;
      }
      if ((uVar4 & 0x1c) != 0xc) goto LAB_7ff70c84795b;
    }
    if ((((*(char *)(_DAT_7ff70cc1a3c0 + 0x1dd4) != '\x01') || (0x77 < param_1 + 0x90U)) ||
        (param_2 == 0)) || (param_2 == *(int *)(_DAT_7ff70cc1a3c0 + 0x14b4))) {
      if (POPCOUNT(uVar1) == 1 && (uVar1 & 0xf000) != 0) {
        uVar4 = 0;
        for (uVar5 = uVar1; (uVar5 & 1) == 0; uVar5 = uVar5 >> 1 | 0x80000000) {
          uVar4 = uVar4 + 1;
        }
        uVar7 = (ulonglong)uVar1;
        if ((uVar4 & 0x1c) == 0xc) {
          uVar7 = (ulonglong)(uVar4 + 0x28b);
        }
      }
      lVar6 = uVar7 * 3;
      lVar2 = _DAT_7ff70cc1a3c0 + uVar7 * 0xc;
      if (param_2 == 0) {
        lVar6 = CONCAT71((int7)((ulonglong)lVar6 >> 8),*(char *)(lVar2 + -0x2c4) == '\0');
      }
      else if ((*(int *)(lVar2 + -0x2cc) == param_2) ||
              ((lVar6 = 0, *(int *)(lVar2 + -0x2cc) == -1 && (*(char *)(lVar2 + -0x2c4) == '\0'))))
      {
        lVar6 = CONCAT71((int7)((ulonglong)lVar6 >> 8),1);
      }
      goto LAB_7ff70c84795b;
    }
  }
  lVar6 = 0;
LAB_7ff70c84795b:
  if (_DAT_7ff70cbebd80 != (uStack_8 ^ (ulonglong)auStack_28)) {
    FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
    pcVar3 = (code *)swi(3);
    lVar6 = (*pcVar3)();
    return lVar6;
  }
  return lVar6;
}


