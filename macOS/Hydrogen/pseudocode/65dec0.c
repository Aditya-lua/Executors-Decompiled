
undefined8 FUN_0065dec0(undefined8 param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  long *unaff_x20;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  undefined8 uStack0000000000000020;
  long lStack0000000000000030;
  
  lStack0000000000000030 = param_2[2];
  param_2[1] = 0;
  param_2[2] = 0;
  *param_2 = 0;
  uStack0000000000000020 = param_1;
  uVar1 = (**(code **)(*unaff_x20 + 0x10))();
  if (lStack0000000000000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  if (in_stack_00000018 < 0) {
    __ZdlPv(in_stack_00000008);
    return uVar1;
  }
  return uVar1;
}

