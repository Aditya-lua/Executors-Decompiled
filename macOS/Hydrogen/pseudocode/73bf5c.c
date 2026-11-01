
undefined8 FUN_0073bf5c(void)

{
  undefined8 uVar1;
  long *unaff_x19;
  undefined4 *unaff_x21;
  undefined4 unaff_w25;
  long unaff_x26;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000038;
  
  uVar1 = func_0x0078e024(&uStack0000000000000008,*(undefined8 *)(unaff_x26 + 0x1e0),
                          *(undefined8 *)(unaff_x26 + 0x1e8),&uStack0000000000000038);
  func_0x0072a74c(&uStack0000000000000008);
  if ((int)uVar1 == 0) {
    uVar1 = func_0x0073bc5c(*(undefined2 *)(*unaff_x19 + 0x3a),&uStack0000000000000038);
    if ((int)uVar1 == 0) {
      uVar1 = (**(code **)(*unaff_x19 + 0x10))();
    }
  }
  else if ((int)uVar1 == 0x3d) {
    uVar1 = (**(code **)(*unaff_x19 + 0x18))();
    unaff_w25 = 0x10;
  }
  else {
    unaff_w25 = 0;
    *unaff_x21 = 2;
  }
  func_0x0072a74c(&uStack0000000000000038);
  *(undefined4 *)(unaff_x19 + 1) = unaff_w25;
  return uVar1;
}

