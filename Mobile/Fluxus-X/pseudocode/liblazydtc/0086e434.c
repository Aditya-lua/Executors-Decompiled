/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086e434
 */

void FUN_0086e434(long param_1,ulong param_2,undefined8 param_3,uint param_4)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  ulong uVar5;
  uint local_58 [8];
  long local_38;
  
  lVar3 = tpidr_el0;
  param_2 = param_2 & 0xff;
  local_38 = *(long *)(lVar3 + 0x28);
  if ((param_4 & 1) == 0) {
    FUN_00853d20(local_58,param_1 + 0x70);
    if (local_58[0] == param_2) {
      FUN_00858f2c(param_1);
      goto LAB_0086e4c8;
    }
  }
  else {
    uVar1 = *(uint *)(param_1 + 0x90);
    iVar2 = *(int *)(param_1 + 0xb8);
    while( true ) {
      uVar5 = (ulong)uVar1;
      if ((iVar2 != *(int *)(param_1 + 0x94)) || (uVar5 == param_2)) break;
      if (*(int *)(*(long *)(param_1 + 0x1e8) + uVar5 * 4) != 0) goto LAB_0086e4d8;
      FUN_00858f2c(param_1);
      uVar1 = *(uint *)(param_1 + 0x90);
    }
    if (uVar5 == param_2) {
LAB_0086e4c8:
      FUN_00858f2c(param_1);
      uVar4 = 1;
      goto LAB_0086e4dc;
    }
  }
LAB_0086e4d8:
  uVar4 = 0;
LAB_0086e4dc:
  if (*(long *)(lVar3 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

