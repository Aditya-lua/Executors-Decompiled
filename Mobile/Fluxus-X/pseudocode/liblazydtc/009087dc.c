/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009087dc
 */

void FUN_009087dc(long param_1,int param_2,undefined8 *param_3)

{
  long lVar1;
  int iVar2;
  long lVar3;
  undefined4 extraout_w1;
  undefined4 extraout_var;
  undefined8 uVar4;
  undefined8 local_48;
  undefined8 uStack_40;
  long local_38;
  
  lVar3 = tpidr_el0;
  local_38 = *(long *)(lVar3 + 0x28);
  if (param_3 == (undefined8 *)0x0) {
    local_48 = FUN_00941cb8();
    param_3 = &local_48;
    uStack_40 = CONCAT44(extraout_var,extraout_w1);
  }
  uVar4 = *param_3;
  lVar1 = *(long *)(param_1 + 0x20) + (long)param_2 * 0x10;
  *(undefined8 *)(lVar1 + 0x260) = param_3[1];
  *(undefined8 *)(lVar1 + 600) = uVar4;
  iVar2 = 2000;
  if (*(int *)(param_1 + 0x2f0) != 0) {
    iVar2 = *(int *)(param_1 + 0x2f0);
  }
  *(int *)(*(long *)(param_1 + 0x20) + 0x278) = iVar2;
  if (*(long *)(lVar3 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

