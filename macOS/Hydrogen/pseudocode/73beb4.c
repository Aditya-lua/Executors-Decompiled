
undefined8 FUN_0073beb4(long param_1)

{
  undefined8 uVar1;
  long *unaff_x19;
  undefined4 unaff_w25;
  undefined1 uStack0000000000000038;
  
  uVar1 = func_0x0073bc5c(*(undefined2 *)(param_1 + 0x3a),&uStack0000000000000038);
  if ((int)uVar1 == 0) {
    uVar1 = (**(code **)(*unaff_x19 + 0x10))();
  }
  func_0x0072a74c(&uStack0000000000000038);
  *(undefined4 *)(unaff_x19 + 1) = unaff_w25;
  return uVar1;
}

