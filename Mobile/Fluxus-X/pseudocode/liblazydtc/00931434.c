/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00931434
 */

void FUN_00931434(time_t param_1,tm *param_2)

{
  long lVar1;
  tm *ptVar2;
  undefined4 uVar3;
  time_t local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_30 = param_1;
  ptVar2 = gmtime_r(&local_30,param_2);
  uVar3 = 0x2b;
  if (ptVar2 != (tm *)0x0) {
    uVar3 = 0;
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

