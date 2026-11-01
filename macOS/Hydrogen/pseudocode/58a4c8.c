
void FUN_0058a4c8(void)

{
  code *pcVar1;
  long lVar2;
  undefined1 *unaff_x19;
  undefined8 *unaff_x20;
  long *unaff_x21;
  undefined8 unaff_x22;
  long unaff_x29;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000040;
  long in_stack_00000048;
  undefined1 uStack0000000000000050;
  
  lVar2 = func_0x00187bd0();
  if (lVar2 == 0) {
    func_0x007a1f00(1);
  }
  else {
    _memcpy(lVar2);
    *(undefined8 *)(unaff_x29 + -0x80) = unaff_x22;
    *(long *)(unaff_x29 + -0x78) = lVar2;
    *(undefined8 *)(unaff_x29 + -0x70) = unaff_x22;
    lVar2 = unaff_x20[3];
    if (lVar2 != 0) {
      unaff_x20[3] = 1;
      uStack0000000000000018 = unaff_x20[2] + 0x40;
      in_stack_00000020 = unaff_x20[2] + lVar2 * 0x40;
      func_0x0055af64(unaff_x29 + -0x68,&uStack0000000000000018,&UNK_009f09e0);
      func_0x005ce9d0(&uStack0000000000000018,&uStack0000000000000050,unaff_x29 + -0x80,
                      unaff_x29 + -0x68);
      func_0x005876a4();
      *unaff_x20 = 3;
      unaff_x21[1] = in_stack_00000020;
      *unaff_x21 = uStack0000000000000018;
      unaff_x21[3] = lVar2;
      unaff_x21[2] = (long)unaff_x21;
      unaff_x21[5] = in_stack_00000040;
      unaff_x21[4] = 0;
      unaff_x21[6] = in_stack_00000048;
      *unaff_x19 = 1;
      return;
    }
    func_0x007a28bc(1,0,&UNK_009edf90);
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x58a720);
  (*pcVar1)();
}

