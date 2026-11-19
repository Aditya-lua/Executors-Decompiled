/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089c2cc
 */

void FUN_0089c2cc(long param_1,undefined8 param_2,long param_3,undefined8 param_4,undefined1 param_5
                 ,undefined1 param_6,undefined8 param_7,undefined8 *param_8,undefined8 param_9,
                 undefined8 param_10,undefined8 param_11,undefined8 param_12)

{
  long lVar1;
  undefined8 *local_108;
  undefined **local_100;
  long lStack_f8;
  undefined8 local_f0;
  long lStack_e8;
  undefined8 local_e0;
  undefined1 local_d8;
  undefined1 local_d7;
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined8 local_c0;
  undefined8 local_b8;
  undefined8 local_b0;
  undefined1 local_a8;
  void *local_a0;
  void *local_98;
  long local_90;
  undefined8 uStack_88;
  void *local_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  void *local_68;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined1 local_50;
  undefined8 local_48;
  undefined8 uStack_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_100 = &PTR_FUN_00c4be10;
  uStack_c8 = param_9;
  local_90 = 0;
  uStack_88 = param_10;
  local_a8 = *(long *)(param_1 + 0x28) == 0 && *(long *)(param_3 + 0x28) == 0;
  local_a0 = (void *)0x0;
  local_98 = (void *)0x0;
  local_b0 = 0;
  local_c0 = 0;
  local_b8 = 0;
  uStack_78 = 0;
  local_80 = (void *)0x0;
  local_68 = (void *)0x0;
  uStack_70 = 0;
  uStack_58 = 0;
  local_60 = 0;
  local_50 = 0x40;
  local_48 = param_11;
  uStack_40 = param_12;
                    /* try { // try from 0089c36c to 0089c377 has its CatchHandler @ 0089c404 */
  lStack_f8 = param_1;
  local_f0 = param_2;
  lStack_e8 = param_3;
  local_e0 = param_4;
  local_d8 = param_5;
  local_d7 = param_6;
  local_d0 = param_7;
  (**(code **)*param_8)(param_8,&local_100);
  local_100 = &PTR_FUN_00c4be10;
  if (local_80 != (void *)0x0) {
    operator_delete(local_80);
    local_80 = (void *)0x0;
    operator_delete(local_68);
    uStack_78 = 0;
    uStack_70 = 0;
    local_68 = (void *)0x0;
    operator_delete((void *)0x0);
    local_60 = 0;
    local_50 = 0x40;
  }
  operator_delete(local_68);
  if (local_a0 != (void *)0x0) {
    local_98 = local_a0;
    operator_delete(local_a0,local_90 - (long)local_a0);
  }
  local_108 = &local_c0;
  FUN_0089cf40(&local_108);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

