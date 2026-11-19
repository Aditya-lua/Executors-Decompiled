/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088df20
 */

ulong FUN_0088df20(long param_1,long param_2)

{
  int iVar1;
  ulong uVar2;
  ulong uVar3;
  ulong *puVar4;
  
  iVar1 = *(int *)(param_2 + 8);
  while ((param_2 == 0 || (iVar1 != DAT_00d1b010))) {
    if ((iVar1 != DAT_00d1afc0) && (iVar1 != DAT_00d1b0b0)) {
      return 0xffffffff;
    }
    param_2 = *(long *)(param_2 + 0x20);
    iVar1 = *(int *)(param_2 + 8);
  }
  if (*(long *)(param_1 + 200) == 0) {
    return 0xffffffff;
  }
  uVar2 = *(ulong *)(param_2 + 0x20);
  uVar3 = ((ulong)(uint)((int)uVar2 << 3) + 8 ^ uVar2 >> 0x20) * -0x622015f714c7d297;
  uVar3 = (uVar2 >> 0x20 ^ uVar3 >> 0x2f ^ uVar3) * -0x622015f714c7d297;
  uVar3 = (uVar3 ^ uVar3 >> 0x2f) * -0x6b622cb0470b6a63 >> ((ulong)*(byte *)(param_1 + 0xd0) & 0x3f)
  ;
  if ((*(ulong *)(*(long *)(param_1 + 0xb8) + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) == 0) {
    return 0xffffffff;
  }
  do {
    puVar4 = (ulong *)(*(long *)(param_1 + 0xa0) + uVar3 * 0x18);
    if (*puVar4 == uVar2) {
      if (*(char *)((long)puVar4 + 9) == '\x01') {
        return (ulong)(byte)puVar4[1];
      }
      return 0xffffffff;
    }
    uVar3 = uVar3 + 1 & *(long *)(param_1 + 0xc0) - 1U;
  } while ((*(ulong *)(*(long *)(param_1 + 0xb8) + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0);
  return 0xffffffff;
}

