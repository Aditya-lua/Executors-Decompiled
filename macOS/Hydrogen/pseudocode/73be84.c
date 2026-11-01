
undefined8 FUN_0073be84(void)

{
  undefined8 uVar1;
  int in_w8;
  long *unaff_x19;
  undefined4 *unaff_x21;
  int unaff_w22;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000038;
  
  if (in_w8 == unaff_w22) {
    func_0x0072a784(&uStack0000000000000038,"\x01",1,0);
    func_0x0072a74c(&uStack0000000000000008);
    uVar1 = func_0x0073bc5c(*(undefined2 *)(*unaff_x19 + 0x3a),&uStack0000000000000038);
    if ((int)uVar1 == 0) {
      uVar1 = (**(code **)(*unaff_x19 + 0x10))();
    }
    func_0x0072a74c(&uStack0000000000000038);
    *(undefined4 *)(unaff_x19 + 1) = 0x11;
  }
  else {
    *unaff_x21 = 2;
    *(undefined4 *)(unaff_x19 + 1) = 0;
    uVar1 = 0x43;
  }
  return uVar1;
}

