/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00934dd0
 */

int FUN_00934dd0(long param_1,undefined4 param_2,undefined8 param_3,undefined8 param_4)

{
  byte bVar1;
  int iVar2;
  long *plVar3;
  
  plVar3 = *(long **)(param_1 + 0x130);
  if (plVar3 == (long *)0x0) {
    iVar2 = FUN_00934ec4(param_1);
    if (iVar2 != 0) {
      return iVar2;
    }
    plVar3 = *(long **)(param_1 + 0x130);
    if (plVar3 == (long *)0x0) {
      iVar2 = 0x17;
      bVar1 = *(byte *)(param_1 + 0xa85);
      goto joined_r0x00934e74;
    }
  }
  iVar2 = (**(code **)(*plVar3 + 0x18))(param_1,plVar3,param_2,param_3,param_4);
  bVar1 = *(byte *)(param_1 + 0xa85);
joined_r0x00934e74:
  if (((bVar1 >> 4 & 1) != 0) &&
     (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
      (0 < DAT_00cc46b0)))) {
    FUN_009050ec(param_1,"client_write(type=%x, len=%zu) -> %d",param_2,param_4,iVar2);
  }
  return iVar2;
}

