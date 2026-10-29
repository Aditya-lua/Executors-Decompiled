/* 7ff70c847830 FUN_7ff70c847830 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c847830(int param_1)

{
  uint uVar1;
  code *pcVar2;
  uint uVar3;
  uint uVar4;
  int7 iVar6;
  undefined8 uVar5;
  ulonglong uVar7;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  if (*(char *)(_DAT_7ff70cc1a3c0 + 0xb2e + (longlong)param_1) != '\x01') {
    uVar5 = 0;
    goto LAB_7ff70c8478b5;
  }
  uVar1 = param_1 + 0x290;
  uVar7 = (ulonglong)uVar1;
  iVar6 = (int7)(int3)((uint)param_1 >> 8);
  uVar5 = CONCAT71(iVar6,POPCOUNT(uVar1) == 1);
  if (0x9a < param_1 + 0x90U) {
    uVar5 = CONCAT71(iVar6,1);
    if (POPCOUNT(uVar1) != 1) goto LAB_7ff70c8478b5;
    uVar3 = 0;
    for (uVar4 = uVar1; (uVar4 & 1) == 0; uVar4 = uVar4 >> 1 | 0x80000000) {
      uVar3 = uVar3 + 1;
    }
    uVar5 = CONCAT71(iVar6,1);
    if ((uVar3 & 0x1c) != 0xc) goto LAB_7ff70c8478b5;
  }
  if (((uVar1 & 0xf000) != 0 & (byte)uVar5) == 1) {
    uVar3 = 0;
    for (uVar4 = uVar1; (uVar4 & 1) == 0; uVar4 = uVar4 >> 1 | 0x80000000) {
      uVar3 = uVar3 + 1;
    }
    uVar7 = (ulonglong)uVar1;
    if ((uVar3 & 0x1c) == 0xc) {
      uVar7 = (ulonglong)(uVar3 + 0x28b);
    }
  }
  uVar5 = CONCAT71((int7)(uVar7 * 3 >> 8),
                   *(char *)(_DAT_7ff70cc1a3c0 + -0x2c4 + uVar7 * 0xc) == '\0');
LAB_7ff70c8478b5:
  if (_DAT_7ff70cbebd80 != (uStack_8 ^ (ulonglong)auStack_28)) {
    FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
    pcVar2 = (code *)swi(3);
    uVar5 = (*pcVar2)();
    return uVar5;
  }
  return uVar5;
}


