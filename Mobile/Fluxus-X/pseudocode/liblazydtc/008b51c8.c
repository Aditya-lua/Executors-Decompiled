/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b51c8
 */

undefined8 FUN_008b51c8(long param_1,long param_2,long param_3,ulong param_4)

{
  long lVar1;
  int iVar2;
  
  if ((*(long *)(*(long *)(param_1 + 0x60) + 0x718) == 0) || (*(char *)(param_3 + 6) != '\0')) {
    return 0;
  }
  iVar2 = *(int *)(*(long *)(param_3 + 0x18) + 0xcc);
  lVar1 = *(long *)(*(long *)(param_2 + 0x18) + 0xc0) + (param_4 & 0xffffffff) * 0x10;
  if (*(int *)(lVar1 + 8) == 0) {
    *(int *)(lVar1 + 8) = iVar2;
  }
  else if (*(int *)(lVar1 + 8) != iVar2) {
    return 0;
  }
  iVar2 = *(int *)(lVar1 + 0xc) + 1;
  *(int *)(lVar1 + 0xc) = iVar2;
  if (iVar2 < DAT_00d1f470) {
    return 1;
  }
  (**(code **)(*(long *)(param_1 + 0x60) + 0x718))();
  return 0;
}

