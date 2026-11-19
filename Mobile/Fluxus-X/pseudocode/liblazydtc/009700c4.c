/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009700c4
 */

void FUN_009700c4(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  undefined1 local_2c [4];
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_2c[0] = 0;
  FUN_00970c2c(param_1,param_2,0,local_2c);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

