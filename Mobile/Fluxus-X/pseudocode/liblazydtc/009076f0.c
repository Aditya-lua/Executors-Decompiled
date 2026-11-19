/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009076f0
 */

void FUN_009076f0(undefined8 param_1,long param_2)

{
  long lVar1;
  long *plVar2;
  long local_58;
  undefined8 local_50;
  long local_48;
  undefined8 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  plVar2 = *(long **)(param_2 + 0x248);
  if (plVar2 != (long *)0x0) {
    local_48 = 0;
    local_40 = 0;
    (**(code **)(*plVar2 + 0x70))(plVar2,param_1,4,0,&local_48);
    if ((local_48 != 0) || ((int)local_40 != 0)) {
      FUN_00931c7c(param_1,5,local_48,local_40);
    }
    local_58 = 0;
    local_50 = 0;
    (**(code **)(*plVar2 + 0x70))(plVar2,param_1,5,0,&local_58);
    if ((local_58 != 0) || ((int)local_50 != 0)) {
      FUN_00931c7c(param_1,6,local_58,local_50);
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

