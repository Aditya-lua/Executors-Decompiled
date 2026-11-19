/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086e3b4
 */

undefined8 FUN_0086e3b4(long param_1,int param_2)

{
  long lVar1;
  int local_58 [8];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  FUN_00859330();
  FUN_00853d20(local_58,param_1 + 0x70);
  if (local_58[0] == param_2) {
    FUN_00858f2c(param_1);
    FUN_00858f2c(param_1);
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}

