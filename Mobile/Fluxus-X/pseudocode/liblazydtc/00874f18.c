/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00874f18
 */

void FUN_00874f18(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  undefined4 local_78 [2];
  undefined8 local_70;
  undefined8 local_68;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_30 = 0;
  uStack_38 = 0;
  uStack_40 = 0;
  local_50 = 2;
  local_78[0] = 2;
  local_60 = 0;
  uStack_58 = 0;
  local_68 = 0;
  local_70 = param_1;
  uStack_48 = param_1;
  FUN_00874b84(param_2,local_78,&local_50);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

