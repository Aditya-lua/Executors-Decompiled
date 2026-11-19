/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092a898
 */

void curl_mvsprintf(undefined1 *param_1,undefined8 param_2,undefined8 *param_3)

{
  long lVar1;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_40;
  undefined8 uStack_38;
  undefined1 *local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  uStack_38 = param_3[3];
  local_40 = param_3[2];
  uStack_48 = param_3[1];
  local_50 = *param_3;
  local_30 = param_1;
  FUN_00929028(&local_30,&LAB_0092a704,param_2,&local_50);
  *local_30 = 0;
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

