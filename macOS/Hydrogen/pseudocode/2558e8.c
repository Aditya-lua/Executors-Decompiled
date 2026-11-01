
undefined1  [16] FUN_002558e8(ulong param_1,undefined8 param_2)

{
  code *pcVar1;
  int iVar2;
  long lVar3;
  long *unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  undefined1 auVar4 [16];
  ulong in_stack_00000008;
  
  if ((param_1 & 1) == 0) {
    iVar2 = func_0x002db704(param_2);
    if (iVar2 == 1) {
      if (in_stack_00000008 < unaff_x20) {
        unaff_x20 = in_stack_00000008;
        if (in_stack_00000008 == 0) {
          unaff_x21 = 1;
          func_0x00187bd4();
        }
        else {
          unaff_x21 = func_0x00187bd8();
          if (unaff_x21 == 0) {
            func_0x007a1f00(1,in_stack_00000008,&UNK_009ca868);
                    /* WARNING: Does not return */
            pcVar1 = (code *)SoftwareBreakpoint(1,0x255a14);
            (*pcVar1)();
          }
        }
      }
      func_0x002d8d08(param_2);
      func_0x0027c9dc();
      lVar3 = *unaff_x19;
      goto joined_r0x0025598c;
    }
    func_0x002d8d08(param_2);
  }
  if (unaff_x20 != 0) {
    func_0x00187bd4();
  }
  func_0x0027c9dc();
  unaff_x21 = 0;
  lVar3 = *unaff_x19;
  unaff_x20 = unaff_x22;
joined_r0x0025598c:
  if ((lVar3 != -0x8000000000000000) && (lVar3 != 0)) {
    func_0x00187bd4(unaff_x19[1],lVar3,1);
  }
  auVar4._8_8_ = unaff_x20;
  auVar4._0_8_ = unaff_x21;
  return auVar4;
}

