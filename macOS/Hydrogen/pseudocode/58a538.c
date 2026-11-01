
void FUN_0058a538(void)

{
  code *pcVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  undefined1 *unaff_x19;
  long unaff_x20;
  ulong *unaff_x21;
  ulong unaff_x22;
  undefined8 unaff_x23;
  long unaff_x29;
  undefined8 uStack0000000000000018;
  ulong in_stack_00000020;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  undefined1 uStack0000000000000050;
  
  lVar2 = func_0x00187bd0();
  if (lVar2 == 0) {
    func_0x007a1f00(1);
  }
  else {
    _memcpy(lVar2);
    *(undefined8 *)(unaff_x29 + -0x80) = unaff_x23;
    *(long *)(unaff_x29 + -0x78) = lVar2;
    *(undefined8 *)(unaff_x29 + -0x70) = unaff_x23;
    uVar3 = *(ulong *)(unaff_x20 + 0x20);
    if (uVar3 != 0) {
      *(undefined8 *)(unaff_x20 + 0x20) = 1;
      uStack0000000000000018 = *(long *)(unaff_x20 + 0x18) + 0x40;
      in_stack_00000020 = *(long *)(unaff_x20 + 0x18) + uVar3 * 0x40;
      func_0x0055af64(unaff_x29 + -0x68,&uStack0000000000000018,&UNK_009f09e0);
      func_0x005ce9d0(&uStack0000000000000018,&uStack0000000000000050,unaff_x29 + -0x80,
                      unaff_x29 + -0x68);
      uVar4 = *unaff_x21 ^ 0x8000000000000000;
      if (1 < uVar4) {
        uVar4 = 2;
      }
      if (uVar4 != 0) {
        if (uVar4 == 1) {
          func_0x00587bf4();
        }
        else {
          func_0x00587d08();
        }
      }
      unaff_x21[1] = in_stack_00000020;
      *unaff_x21 = uStack0000000000000018;
      unaff_x21[3] = uVar3;
      unaff_x21[2] = unaff_x22;
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

