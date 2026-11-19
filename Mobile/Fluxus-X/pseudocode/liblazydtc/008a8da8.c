/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a8da8
 */

void FUN_008a8da8(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  long lVar1;
  undefined **local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined1 *local_68;
  ulong local_60;
  undefined1 auStack_58 [32];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_90 = &PTR_LAB_00c4c6f0;
  uStack_78 = 0;
  local_60 = 0x400000000;
  local_70 = 0;
  uStack_88 = param_1;
  local_80 = param_2;
  local_68 = auStack_58;
                    /* try { // try from 008a8df8 to 008a8e03 has its CatchHandler @ 008a8e48 */
  (**(code **)*param_3)(param_3,&local_90);
  local_90 = &PTR_LAB_00c4c6f0;
  if ((int)local_60 != 0) {
    local_60 = local_60 & 0xffffffff00000000;
  }
  if (local_68 != auStack_58) {
    operator_delete(local_68);
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

