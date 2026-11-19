/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00857b2c
 */

void FUN_00857b2c(undefined8 *param_1,long param_2,long param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  uint uVar4;
  undefined1 auStack_530 [156];
  int local_494;
  undefined8 local_440;
  undefined8 uStack_438;
  undefined8 local_430;
  undefined8 local_428;
  undefined8 uStack_420;
  undefined8 local_418;
  undefined8 local_360;
  undefined8 uStack_358;
  undefined8 local_350;
  undefined8 local_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined1 local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  FUN_008583f0(auStack_530,param_2,param_3,param_4,param_5,param_6);
                    /* try { // try from 00857b80 to 00857b87 has its CatchHandler @ 00857c68 */
  uVar3 = FUN_00857d50(auStack_530);
  uVar2 = local_430;
  if (param_3 == 0) {
    uVar4 = 0;
  }
  else {
    uVar4 = (uint)(*(char *)(param_2 + param_3 + -1) != '\n');
  }
  *param_1 = uVar3;
  param_1[1] = (ulong)(uVar4 + local_494);
  param_1[3] = uStack_420;
  param_1[2] = local_428;
  param_1[4] = local_418;
  param_1[6] = uStack_358;
  param_1[5] = local_360;
  param_1[7] = local_350;
  param_1[9] = uStack_438;
  param_1[8] = local_440;
  param_1[0xe] = local_68;
  param_1[0xd] = uStack_70;
  param_1[0xc] = local_78;
  *(undefined1 *)(param_1 + 0x11) = local_50;
  local_418 = 0;
  uStack_420 = 0;
  local_428 = 0;
  uStack_358 = 0;
  local_360 = 0;
  local_430 = 0;
  uStack_438 = 0;
  local_440 = 0;
  param_1[10] = uVar2;
  param_1[0xb] = local_80;
  uStack_70 = 0;
  local_78 = 0;
  local_68 = 0;
  param_1[0x10] = uStack_58;
  param_1[0xf] = local_60;
  local_350 = 0;
  local_80 = 0;
  uStack_58 = 0;
  local_60 = 0;
  local_50 = 0x40;
  FUN_00857f44(auStack_530);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

