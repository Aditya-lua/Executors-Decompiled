/* 7ff70c846a60 FUN_7ff70c846a60 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c846a60(uint param_1)

{
  code *pcVar1;
  uint uVar2;
  uint uVar3;
  undefined8 uVar4;
  int iVar5;
  bool bVar6;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  bVar6 = (param_1 & 0xf000) != 0;
  iVar5 = POPCOUNT(param_1);
  uVar3 = param_1;
  if (iVar5 == 1 && bVar6) {
    uVar2 = 0;
    for (; (uVar3 & 1) == 0; uVar3 = uVar3 >> 1 | 0x80000000) {
      uVar2 = uVar2 + 1;
    }
    uVar3 = uVar2 + 0x28b;
    if ((uVar2 & 0x1c) != 0xc) {
      uVar3 = param_1;
    }
  }
  if (*(char *)(_DAT_7ff70cc1a3c0 + -0x1efc + (longlong)(int)uVar3 * 0x10) != '\x01') {
    uVar4 = 0;
    goto LAB_7ff70c846b03;
  }
  if (0x9a < param_1 - 0x200) {
    uVar4 = CONCAT71((uint7)(uint3)(param_1 - 0x200 >> 8),1);
    if (iVar5 != 1) goto LAB_7ff70c846b03;
    uVar3 = 0;
    for (uVar2 = param_1; (uVar2 & 1) == 0; uVar2 = uVar2 >> 1 | 0x80000000) {
      uVar3 = uVar3 + 1;
    }
    if ((uVar3 & 0x1c) != 0xc) goto LAB_7ff70c846b03;
  }
  uVar3 = param_1;
  if (iVar5 == 1 && bVar6) {
    uVar2 = 0;
    for (; (uVar3 & 1) == 0; uVar3 = uVar3 >> 1 | 0x80000000) {
      uVar2 = uVar2 + 1;
    }
    uVar3 = uVar2 + 0x28b;
    if ((uVar2 & 0x1c) != 0xc) {
      uVar3 = param_1;
    }
  }
  uVar4 = CONCAT71((int7)((ulonglong)((longlong)(int)uVar3 * 3) >> 8),
                   *(char *)(_DAT_7ff70cc1a3c0 + -0x2c4 + (longlong)(int)uVar3 * 0xc) == '\0');
LAB_7ff70c846b03:
  if (_DAT_7ff70cbebd80 != (uStack_8 ^ (ulonglong)auStack_28)) {
    FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
    pcVar1 = (code *)swi(3);
    uVar4 = (*pcVar1)();
    return uVar4;
  }
  return uVar4;
}


