/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00928f98
 */

void curl_mvsnprintf(undefined1 *param_1,long param_2,undefined8 param_3,undefined8 *param_4)

{
  long lVar1;
  ulong uVar2;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined1 *local_40;
  long lStack_38;
  long local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  lStack_38 = 0;
  uStack_48 = param_4[3];
  local_50 = param_4[2];
  uStack_58 = param_4[1];
  local_60 = *param_4;
  local_40 = param_1;
  local_30 = param_2;
  uVar2 = FUN_00929028(&local_40,&LAB_0092a2d0,param_3,&local_60);
  if (local_30 != 0) {
    if (local_30 == lStack_38) {
      local_40[-1] = 0;
      uVar2 = (ulong)((int)uVar2 - 1);
    }
    else {
      *local_40 = 0;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

