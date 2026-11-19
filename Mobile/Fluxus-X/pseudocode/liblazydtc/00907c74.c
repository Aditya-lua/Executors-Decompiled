/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00907c74
 */

void FUN_00907c74(long *param_1,undefined8 param_2)

{
  long lVar1;
  int iVar2;
  undefined4 local_2c;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  if (param_1 == (long *)0x0) {
    local_2c = 0xffffffff;
  }
  else {
    iVar2 = (**(code **)(*param_1 + 0x70))(param_1,param_2,3,0,&local_2c);
    if (iVar2 != 0) {
      local_2c = 0xffffffff;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_2c);
  }
  return;
}

