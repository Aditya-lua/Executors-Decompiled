/* 7ff70c846b50 FUN_7ff70c846b50 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c846b50(uint param_1,int param_2)

{
  longlong lVar1;
  code *pcVar2;
  uint uVar3;
  uint uVar4;
  longlong lVar5;
  int iVar6;
  bool bVar7;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  bVar7 = (param_1 & 0xf000) != 0;
  iVar6 = POPCOUNT(param_1);
  uVar4 = param_1;
  if (iVar6 == 1 && bVar7) {
    uVar3 = 0;
    for (; (uVar4 & 1) == 0; uVar4 = uVar4 >> 1 | 0x80000000) {
      uVar3 = uVar3 + 1;
    }
    uVar4 = uVar3 + 0x28b;
    if ((uVar3 & 0x1c) != 0xc) {
      uVar4 = param_1;
    }
  }
  if (*(char *)(_DAT_7ff70cc1a3c0 + -0x1efc + (longlong)(int)uVar4 * 0x10) == '\x01') {
    if (0x9a < param_1 - 0x200) {
      lVar5 = CONCAT71((int7)((ulonglong)((longlong)(int)uVar4 * 0x10) >> 8),1);
      if (iVar6 != 1) goto LAB_7ff70c846be2;
      uVar4 = 0;
      for (uVar3 = param_1; (uVar3 & 1) == 0; uVar3 = uVar3 >> 1 | 0x80000000) {
        uVar4 = uVar4 + 1;
      }
      if ((uVar4 & 0x1c) != 0xc) goto LAB_7ff70c846be2;
    }
    if ((((*(char *)(_DAT_7ff70cc1a3c0 + 0x1dd4) != '\x01') || (0x77 < param_1 - 0x200)) ||
        (param_2 == 0)) || (param_2 == *(int *)(_DAT_7ff70cc1a3c0 + 0x14b4))) {
      uVar4 = param_1;
      if (iVar6 == 1 && bVar7) {
        uVar3 = 0;
        for (; (uVar4 & 1) == 0; uVar4 = uVar4 >> 1 | 0x80000000) {
          uVar3 = uVar3 + 1;
        }
        uVar4 = uVar3 + 0x28b;
        if ((uVar3 & 0x1c) != 0xc) {
          uVar4 = param_1;
        }
      }
      lVar5 = (longlong)(int)uVar4 * 3;
      lVar1 = _DAT_7ff70cc1a3c0 + (longlong)(int)uVar4 * 0xc;
      if (param_2 == 0) {
        lVar5 = CONCAT71((int7)((ulonglong)lVar5 >> 8),*(char *)(lVar1 + -0x2c4) == '\0');
      }
      else if ((*(int *)(lVar1 + -0x2cc) == param_2) ||
              ((lVar5 = 0, *(int *)(lVar1 + -0x2cc) == -1 && (*(char *)(lVar1 + -0x2c4) == '\0'))))
      {
        lVar5 = CONCAT71((int7)((ulonglong)lVar5 >> 8),1);
      }
      goto LAB_7ff70c846be2;
    }
  }
  lVar5 = 0;
LAB_7ff70c846be2:
  if (_DAT_7ff70cbebd80 != (uStack_8 ^ (ulonglong)auStack_28)) {
    FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
    pcVar2 = (code *)swi(3);
    lVar5 = (*pcVar2)();
    return lVar5;
  }
  return lVar5;
}


