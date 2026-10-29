/* 7ff70c81b700 FUN_7ff70c81b700 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c81b700(int param_1,ulonglong param_2)

{
  uint uVar1;
  code *pcVar2;
  undefined7 uVar4;
  longlong lVar3;
  longlong lVar5;
  bool bVar6;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  uVar1 = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1f50);
  if ((param_2 & 0x400) == 0) {
    if ((param_2 & 0x800) == 0) {
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x1f60) < (int)uVar1) {
        lVar3 = CONCAT71((int7)((ulonglong)*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f58) >> 8),
                         *(int *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f58) +
                                 (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1f60) * 0x38) == param_1);
        goto LAB_7ff70c81b79e;
      }
    }
    else if (0 < (int)uVar1) {
      lVar5 = 0;
      lVar3 = _DAT_7ff70cc1a3c0;
      do {
        bVar6 = *(int *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f58) + lVar5) == param_1;
        lVar3 = CONCAT71((int7)((ulonglong)lVar3 >> 8),bVar6);
        if (bVar6) break;
        bVar6 = (ulonglong)uVar1 * 0x38 + -0x38 != lVar5;
        lVar5 = lVar5 + 0x38;
      } while (bVar6);
      goto LAB_7ff70c81b79e;
    }
    lVar3 = 0;
  }
  else {
    uVar4 = (undefined7)((ulonglong)_DAT_7ff70cc1a3c0 >> 8);
    if ((param_2 & 0x800) == 0) {
      lVar3 = CONCAT71(uVar4,*(int *)(_DAT_7ff70cc1a3c0 + 0x1f60) < (int)uVar1);
    }
    else {
      lVar3 = CONCAT71(uVar4,0 < (int)uVar1);
    }
  }
LAB_7ff70c81b79e:
  if (_DAT_7ff70cbebd80 != (uStack_8 ^ (ulonglong)auStack_28)) {
    FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
    pcVar2 = (code *)swi(3);
    lVar3 = (*pcVar2)();
    return lVar3;
  }
  return lVar3;
}


