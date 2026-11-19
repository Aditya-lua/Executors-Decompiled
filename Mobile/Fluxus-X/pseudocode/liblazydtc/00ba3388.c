/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba3388
 */

undefined8 FUN_00ba3388(uint param_1,long *param_2)

{
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  long lVar4;
  long lVar5;
  
  if (param_1 + 0xc0000000 < 0x3fff0000) {
    uVar2 = param_1 >> 0x19 & 0x1f;
    if (0x15 < uVar2) {
      return 0xffffff74;
    }
    uVar1 = param_1 & 0x1ffffff;
    if ((uint)(0x10 << (ulong)uVar2) <= uVar1) {
      return 0xffffff74;
    }
    lVar5 = (&DAT_00d26028)[uVar2];
    if (lVar5 == 0) {
      return 0xffffff74;
    }
    lVar4 = lVar5 + (ulong)uVar1 * 0x38;
    if (lVar4 == 0) {
      return 0xffffff74;
    }
    if (*(int *)(lVar5 + (ulong)uVar1 * 0x38 + 0x18) != 2) {
      return 0xffffff74;
    }
    if (*(uint *)(lVar5 + (ulong)uVar1 * 0x38 + 0x14) != param_1) {
      return 0xffffff74;
    }
  }
  else {
    if (0x3ffffffe < param_1 - 1) {
      if (param_1 >> 0x1e == 0) {
        return 0xffffff78;
      }
      if ((int)param_1 < 0) {
        return 0xffffff78;
      }
    }
    uVar3 = 0;
    lVar4 = DAT_00d260d8;
    while ((*(int *)(lVar4 + 0x18) != 2 || (*(uint *)(lVar4 + 0x14) != param_1))) {
      uVar3 = uVar3 + 1;
      lVar4 = lVar4 + 0x38;
      if (0x1f < uVar3) {
        return 0xffffff74;
      }
    }
  }
  if (*(int *)(lVar4 + 0x18) != 2) {
    return 0xffffff69;
  }
  if (*(long *)(lVar4 + 0x20) == -1) {
    return 0xffffff69;
  }
  *(long *)(lVar4 + 0x20) = *(long *)(lVar4 + 0x20) + 1;
  *param_2 = lVar4;
  return 0;
}

