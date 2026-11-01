
void FUN_005800e4(void)

{
  code *pcVar1;
  ulong uVar2;
  ulong uVar3;
  undefined1 *unaff_x19;
  long unaff_x20;
  ulong *unaff_x21;
  ulong unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  long unaff_x29;
  undefined8 uStack0000000000000018;
  ulong in_stack_00000020;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  undefined1 uStack0000000000000050;
  
  _memcpy();
  *(undefined8 *)(unaff_x29 + -0x80) = unaff_x23;
  *(undefined8 *)(unaff_x29 + -0x78) = unaff_x24;
  *(undefined8 *)(unaff_x29 + -0x70) = unaff_x23;
  uVar2 = *(ulong *)(unaff_x20 + 0x20);
  if (uVar2 == 0) {
    func_0x007a28bc(1,0,&UNK_009edf90);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x5801e4);
    (*pcVar1)();
  }
  *(undefined8 *)(unaff_x20 + 0x20) = 1;
  uStack0000000000000018 = *(long *)(unaff_x20 + 0x18) + 0x40;
  in_stack_00000020 = *(long *)(unaff_x20 + 0x18) + uVar2 * 0x40;
  func_0x0055af64(unaff_x29 + -0x68,&uStack0000000000000018,&UNK_009f02e0);
  func_0x005ce9d0(&uStack0000000000000018,&uStack0000000000000050,unaff_x29 + -0x80,
                  unaff_x29 + -0x68);
  uVar3 = *unaff_x21 ^ 0x8000000000000000;
  if (1 < uVar3) {
    uVar3 = 2;
  }
  if (uVar3 != 0) {
    if (uVar3 == 1) {
      func_0x0057d2dc();
    }
    else {
      func_0x0057d54c();
    }
  }
  unaff_x21[1] = in_stack_00000020;
  *unaff_x21 = uStack0000000000000018;
  unaff_x21[3] = uVar2;
  unaff_x21[2] = unaff_x22;
  unaff_x21[5] = in_stack_00000040;
  unaff_x21[4] = 0;
  unaff_x21[6] = in_stack_00000048;
  *unaff_x19 = 1;
  return;
}

