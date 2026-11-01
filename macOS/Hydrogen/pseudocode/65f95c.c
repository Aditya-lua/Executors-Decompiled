
undefined8 FUN_0065f95c(long param_1,undefined8 param_2,undefined8 *param_3)

{
  undefined8 uVar1;
  long *unaff_x20;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  undefined8 uStack0000000000000020;
  long lStack0000000000000030;
  
  param_3[1] = 0;
  param_3[2] = 0;
  *param_3 = 0;
  uStack0000000000000020 = param_2;
  lStack0000000000000030 = param_1;
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

