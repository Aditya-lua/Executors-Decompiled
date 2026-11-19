/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008760e4
 */

void FUN_008760e4(long param_1,undefined4 param_2,undefined1 param_3,undefined4 param_4,
                 undefined4 param_5)

{
  long lVar1;
  undefined4 local_38;
  undefined1 local_34;
  undefined4 local_30;
  undefined4 uStack_2c;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_38 = param_2;
  local_34 = param_3;
  local_30 = param_4;
  uStack_2c = param_5;
  FUN_0087613c(param_1 + 0x1d8,&local_38);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

