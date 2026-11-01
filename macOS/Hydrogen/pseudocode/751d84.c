
undefined8 FUN_00751d84(undefined8 param_1)

{
  undefined8 uVar1;
  long lVar2;
  undefined8 uVar3;
  ulong uVar4;
  long unaff_x19;
  long unaff_x20;
  uint unaff_w22;
  long unaff_x25;
  undefined8 *unaff_x27;
  long unaff_x29;
  undefined8 uStack0000000000000098;
  
  uStack0000000000000098 = param_1;
  if (((*(ulong *)(unaff_x20 + 0x398) & 9) == 1) && (lVar2 = func_0x00782efc(), lVar2 == 0)) {
    func_0x00752938();
  }
  uVar1 = uStack0000000000000098;
  uVar3 = func_0x00740a18(unaff_x29 + -0x80," HTTP/%s\r\n%s%s%s%s%s%s%s%s%s%s%s%s");
  (*(code *)*unaff_x27)
            (*(undefined8 *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19));
  *(undefined8 *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19) = 0;
  (*(code *)*unaff_x27)(*(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19));
  *(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19) = 0;
  (*(code *)*unaff_x27)(uVar1);
  if ((int)uVar3 == 0) {
    uVar4 = func_0x007315f4();
    if (((unaff_w22 < 0x14) && ((uVar4 & 1) == 0)) && (*(char *)(unaff_x25 + 0x926) == '\x03')) {
      func_0x00740678(unaff_x29 + -0x80);
      return 1;
    }
    uVar3 = func_0x007548a4();
    if (((((int)uVar3 == 0) &&
         ((*(uint *)(*(long *)(unaff_x20 + 0x3a0) + 0x94) >> 0x1e == 0 ||
          (uVar3 = func_0x0078bbf0(), (int)uVar3 == 0)))) &&
        (uVar3 = func_0x00753e4c(), (int)uVar3 == 0)) &&
       ((uVar3 = func_0x007538a4(), (int)uVar3 == 0 && (uVar3 = func_0x00754c00(), (int)uVar3 == 0))
       )) {
      uVar3 = func_0x00771554();
      func_0x00740678(unaff_x29 + -0x80);
      if ((0x13 < unaff_w22) && ((int)uVar3 == 0)) {
        if ((**(uint **)(unaff_x29 + -0x90) >> 0xf & 1) == 0) {
          return 0;
        }
        **(uint **)(unaff_x29 + -0x90) = **(uint **)(unaff_x29 + -0x90) & 0xffff7fff;
        return 0;
      }
      goto code_r0x0075178c;
    }
  }
  func_0x00740678(unaff_x29 + -0x80);
code_r0x0075178c:
  if ((int)uVar3 == 100) {
    func_0x0073c9e4();
  }
  return uVar3;
}

