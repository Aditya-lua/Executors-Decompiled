/* 7ff70c848280 FUN_7ff70c848280 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c848280(uint param_1,undefined4 param_2,uint param_3)

{
  code *pcVar1;
  uint uVar2;
  uint uVar3;
  longlong lVar4;
  longlong lVar5;
  byte bVar6;
  byte bVar7;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  lVar4 = _DAT_7ff70cc1a3c0;
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  if (POPCOUNT(param_1) == 1 && (param_1 & 0xf000) != 0) {
    uVar2 = 0;
    for (uVar3 = param_1; (uVar3 & 1) == 0; uVar3 = uVar3 >> 1 | 0x80000000) {
      uVar2 = uVar2 + 1;
    }
    if ((uVar2 & 0x1c) == 0xc) {
      param_1 = uVar2 + 0x28b;
    }
  }
  lVar5 = (longlong)(int)param_1;
  *(undefined4 *)(_DAT_7ff70cc1a3c0 + -0x2c8 + lVar5 * 0xc) = param_2;
  *(undefined4 *)(lVar4 + -0x2cc + lVar5 * 0xc) = param_2;
  bVar6 = (byte)(param_3 >> 0x15) & 1;
  *(byte *)(lVar4 + -0x2c3 + lVar5 * 0xc) = bVar6;
  bVar7 = 1;
  if ((param_3 & 0x100000) == 0) {
    bVar7 = bVar6;
  }
  *(byte *)(lVar4 + -0x2c4 + lVar5 * 0xc) = bVar7;
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


