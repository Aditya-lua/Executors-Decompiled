/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092a910
 */

void curl_mvprintf(undefined8 param_1,undefined8 *param_2)

{
  long lVar1;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_40;
  undefined8 uStack_38;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  uStack_38 = param_2[3];
  local_40 = param_2[2];
  uStack_48 = param_2[1];
  local_50 = *param_2;
  FUN_00929028(mprotect,FUN_0092a7d4,param_1,&local_50);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

