/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00875d18
 */

void FUN_00875d18(long param_1,undefined4 param_2)

{
  long lVar1;
  undefined4 local_2c;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_2c = param_2;
  FUN_0087593c(param_1 + 0x30,&local_2c);
  FUN_00875bc8(param_1 + 0x48,param_1 + 0x1a0);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

