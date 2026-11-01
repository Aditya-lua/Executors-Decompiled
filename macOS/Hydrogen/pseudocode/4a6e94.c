
void FUN_004a6e94(undefined8 param_1,undefined1 param_2 [16])

{
  code *pcVar1;
  undefined8 *unaff_x19;
  long unaff_x23;
  long unaff_x29;
  undefined8 uStack00000000000000a0;
  undefined1 uStack00000000000000c0;
  undefined8 uStack00000000000000d8;
  undefined8 uStack00000000000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined1 uStack0000000000000150;
  
  uStack00000000000000a0 = param_2._0_8_;
  *(long *)(unaff_x23 + 0x98) = param_2._8_8_;
  *(undefined8 *)(unaff_x23 + 0x90) = uStack00000000000000a0;
  uStack00000000000000d8 = param_1;
  func_0x004ad8b8(&uStack00000000000000e0,&uStack00000000000000c0);
  if (uStack00000000000000e0 != 0) {
    *(undefined8 *)(unaff_x29 + -0xb8) = in_stack_000000e8;
    *(long *)(unaff_x29 + -0xc0) = uStack00000000000000e0;
    *(undefined8 *)(unaff_x29 + -0xa8) = in_stack_000000f8;
    *(undefined8 *)(unaff_x29 + -0xb0) = in_stack_000000f0;
    func_0x007a2810(&UNK_008a04ac,99,unaff_x29 + -0xc0,&UNK_009e3ad8,&UNK_009e3928);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4a6f20);
    (*pcVar1)();
  }
  unaff_x19[1] = 1;
  unaff_x19[2] = in_stack_000000e8;
  *unaff_x19 = 2;
  func_0x004a8a78(&uStack0000000000000150);
  return;
}

