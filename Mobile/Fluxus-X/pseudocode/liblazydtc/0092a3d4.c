/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092a3d4
 */

void FUN_0092a3d4(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  long lVar1;
  char cVar2;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_38;
  char local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_30 = '\0';
  uStack_48 = param_3[3];
  local_50 = param_3[2];
  uStack_58 = param_3[1];
  local_60 = *param_3;
  local_38 = param_1;
  FUN_00929028(&local_38,&LAB_0092a464,param_2,&local_60);
  if (local_30 == '\0') {
    cVar2 = '\0';
  }
  else {
    FUN_00904534(local_38);
    cVar2 = local_30;
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(cVar2);
  }
  return;
}

