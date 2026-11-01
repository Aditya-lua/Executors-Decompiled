
undefined8 FUN_00723f18(undefined8 *param_1)

{
  undefined8 uVar1;
  undefined8 unaff_x20;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  undefined8 *puStack0000000000000020;
  undefined8 uStack0000000000000028;
  
  *param_1 = unaff_x20;
  uStack0000000000000028 = 1;
  puStack0000000000000020 = param_1;
  func_0x0070aa74(&uStack0000000000000008);
  uVar1 = func_0x0071b400();
  if (in_stack_00000018._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000008);
    return uVar1;
  }
  return uVar1;
}

