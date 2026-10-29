/* 7ff70c804a30 FUN_7ff70c804a30 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c804a30(int *param_1,uint param_2,ulonglong param_3)

{
  code *pcVar1;
  ulonglong uVar2;
  uint *puVar3;
  uint *puVar4;
  ulonglong uVar5;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  puVar3 = *(uint **)(param_1 + 2);
  puVar4 = puVar3 + (longlong)*param_1 * 4;
  uVar5 = (longlong)*param_1;
  while (uVar2 = uVar5, uVar2 != 0) {
    uVar5 = uVar2 >> 1;
    if (puVar3[uVar5 * 4] < param_2) {
      puVar3 = puVar3 + uVar5 * 4 + 4;
      uVar5 = ~uVar5 + uVar2;
    }
  }
  if ((puVar3 != puVar4) && (*puVar3 == param_2)) {
    param_3 = (ulonglong)puVar3[2];
  }
  if (_DAT_7ff70cbebd80 != (uStack_8 ^ (ulonglong)auStack_28)) {
    FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
    pcVar1 = (code *)swi(3);
    uVar5 = (*pcVar1)();
    return uVar5;
  }
  return param_3 & 0xffffffff;
}


