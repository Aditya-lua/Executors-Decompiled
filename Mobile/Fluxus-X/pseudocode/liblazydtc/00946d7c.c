/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00946d7c
 */

void FUN_00946d7c(long param_1,long param_2,int param_3)

{
  bool bVar1;
  uint uVar2;
  undefined8 *puVar3;
  
  bVar1 = (*(ulong *)(param_1 + 0xa82) & 0x10000000) != 0;
  if ((param_3 == 1) && (((uint)*(ulong *)(param_1 + 0xa82) >> 0x1c & 1) != 0)) {
    if ((param_1 != 0 && bVar1) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"Connected 2nd connection to %s port %u",param_2 + 0x164,
                   *(undefined4 *)(param_2 + 0x1c0));
      return;
    }
  }
  else if ((param_1 != 0 && bVar1) &&
          ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
    uVar2 = (uint)*(ulong *)(param_2 + 0x3a0);
    if ((uVar2 >> 1 & 1) == 0) {
      if ((*(ulong *)(param_2 + 0x3a0) & 1) == 0) {
        if ((uVar2 >> 9 & 1) == 0) {
          puVar3 = (undefined8 *)(param_2 + 0x58);
        }
        else {
          puVar3 = (undefined8 *)(param_2 + 0x88);
        }
      }
      else {
        puVar3 = (undefined8 *)(param_2 + 0xe0);
      }
    }
    else {
      puVar3 = (undefined8 *)(param_2 + 0xa8);
    }
    FUN_00904c98(param_1,"Connected to %s (%s) port %u",*puVar3,param_2 + 0x100,
                 *(undefined4 *)(param_2 + 0x15c));
    return;
  }
  return;
}

