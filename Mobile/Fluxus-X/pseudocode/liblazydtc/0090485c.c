/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090485c
 */

void FUN_0090485c(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  undefined4 uVar1;
  long lVar2;
  int iVar3;
  undefined4 uVar4;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_40;
  undefined8 uStack_38;
  long local_28;
  
  lVar2 = tpidr_el0;
  local_28 = *(long *)(lVar2 + 0x28);
  uStack_38 = param_3[3];
  local_40 = param_3[2];
  uStack_48 = param_3[1];
  local_50 = *param_3;
  iVar3 = FUN_0092a3d4(param_1,param_2,&local_50);
  uVar4 = 100;
  if (iVar3 != 2) {
    uVar4 = 0x1b;
  }
  uVar1 = 0;
  if (iVar3 != 0) {
    uVar1 = uVar4;
  }
  if (*(long *)(lVar2 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar1);
  }
  return;
}

