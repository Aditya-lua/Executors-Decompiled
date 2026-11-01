
undefined4 FUN_004bfa24(undefined8 param_1)

{
  code *pcVar1;
  long in_x9;
  long in_x10;
  long unaff_x20;
  long unaff_x29;
  undefined1 uStack0000000000000028;
  undefined8 uStack0000000000000038;
  long lStack0000000000000040;
  undefined8 uStack0000000000000050;
  undefined4 uStack0000000000000058;
  undefined4 uStack000000000000005c;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  
  lStack0000000000000040 = in_x9 + in_x10 * 4;
  uStack0000000000000038 = param_1;
  func_0x004dc4b0(&uStack0000000000000050,&uStack0000000000000028);
  if (uStack0000000000000050 != 3) {
    *(undefined8 *)(unaff_x20 + 0x78) = in_stack_00000078;
    *(undefined8 *)(unaff_x20 + 0x70) = in_stack_00000070;
    *(undefined8 *)(unaff_x20 + 0x88) = in_stack_00000088;
    *(undefined8 *)(unaff_x20 + 0x80) = in_stack_00000080;
    *(undefined8 *)(unaff_x20 + 0x98) = *(undefined8 *)(unaff_x20 + 0x48);
    *(undefined8 *)(unaff_x20 + 0x90) = *(undefined8 *)(unaff_x20 + 0x40);
    *(ulong *)(unaff_x20 + 0x58) = CONCAT44(uStack000000000000005c,uStack0000000000000058);
    *(long *)(unaff_x20 + 0x50) = uStack0000000000000050;
    *(undefined8 *)(unaff_x20 + 0x68) = in_stack_00000068;
    *(undefined8 *)(unaff_x20 + 0x60) = in_stack_00000060;
    func_0x007a2810(&UNK_008a2019,0x2b,unaff_x29 + -0x70,&UNK_009e5968,&UNK_009e6138);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4bfaa8);
    (*pcVar1)();
  }
  return uStack0000000000000058;
}

