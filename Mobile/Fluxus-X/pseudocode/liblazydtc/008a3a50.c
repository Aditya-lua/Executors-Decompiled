/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a3a50
 */

void FUN_008a3a50(long param_1,long param_2,long param_3)

{
  long lVar1;
  uint *puVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  
  if (param_2 == 0) {
    return;
  }
  if (*(int *)(param_2 + 8) != DAT_00d1b010) {
    return;
  }
  if (*(long *)(param_1 + 0x38) == 0) {
    return;
  }
  uVar4 = *(ulong *)(param_2 + 0x20);
  uVar5 = ((ulong)(uint)((int)uVar4 << 3) + 8 ^ uVar4 >> 0x20) * -0x622015f714c7d297;
  uVar5 = (uVar4 >> 0x20 ^ uVar5 >> 0x2f ^ uVar5) * -0x622015f714c7d297;
  uVar5 = (uVar5 ^ uVar5 >> 0x2f) * -0x6b622cb0470b6a63 >> ((ulong)*(byte *)(param_1 + 0x40) & 0x3f)
  ;
  if ((*(ulong *)(*(long *)(param_1 + 0x28) + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) == 0) {
    return;
  }
  while (*(ulong *)(*(long *)(param_1 + 0x10) + uVar5 * 0x10) != uVar4) {
    uVar5 = uVar5 + 1 & *(long *)(param_1 + 0x30) - 1U;
    if ((*(ulong *)(*(long *)(param_1 + 0x28) + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) == 0) {
      return;
    }
  }
  lVar1 = *(long *)(param_1 + 0x10) + uVar5 * 0x10;
  if ((param_3 == 0) || (*(int *)(param_3 + 8) != DAT_00d1aff0)) {
    if (param_3 == 0) {
      return;
    }
    if (*(int *)(param_3 + 8) != *(int *)(param_2 + 8)) {
      return;
    }
    if (*(long *)(param_1 + 0xa8) == 0) {
      return;
    }
    uVar4 = *(ulong *)(param_3 + 0x20);
    uVar5 = ((ulong)(uint)((int)uVar4 << 3) + 8 ^ uVar4 >> 0x20) * -0x622015f714c7d297;
    uVar5 = (uVar4 >> 0x20 ^ uVar5 >> 0x2f ^ uVar5) * -0x622015f714c7d297;
    uVar5 = (uVar5 ^ uVar5 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0xb0) & 0x3f);
    if ((*(ulong *)(*(long *)(param_1 + 0x98) + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) == 0) {
      return;
    }
    lVar6 = *(long *)(param_1 + 0x80);
    while (*(ulong *)(lVar6 + uVar5 * 0x10) != uVar4) {
      uVar5 = uVar5 + 1 & *(long *)(param_1 + 0xa0) - 1U;
      if ((*(ulong *)(*(long *)(param_1 + 0x98) + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) == 0) {
        return;
      }
    }
    puVar2 = (uint *)FUN_00891928(*(undefined8 *)(param_1 + 8),lVar1 + 8);
    if (*puVar2 != 0) {
      return;
    }
    uVar3 = *(uint *)(lVar6 + uVar5 * 0x10 + 8);
  }
  else {
    puVar2 = (uint *)FUN_00891928(*(undefined8 *)(param_1 + 8),lVar1 + 8);
    uVar3 = *puVar2 + 1;
    if (*(double *)(param_3 + 0x20) != (double)uVar3) {
      return;
    }
  }
  *puVar2 = uVar3;
  return;
}

