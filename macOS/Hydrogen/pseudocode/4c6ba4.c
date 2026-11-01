
undefined8 FUN_004c6ba4(ulong param_1)

{
  code *pcVar1;
  long unaff_x19;
  ulong unaff_x20;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  
  if (7 < unaff_x20) {
    unaff_x20 = (param_1 >> 3) * 7;
  }
  *(ulong *)(unaff_x19 + 0xa0) = unaff_x20;
  *(undefined8 *)(unaff_x19 + 0xa8) = 0;
  if (*(int *)(unaff_x19 + 0x78) != 1) {
    func_0x007a23bc(&UNK_009e67c8);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4c7878);
    (*pcVar1)();
  }
  func_0x004d661c(unaff_x19 + 0x18,1,*(undefined4 *)(unaff_x19 + 0x7c),unaff_x19 + 0x90);
  if (in_stack_00000018 != 0) {
    func_0x00187bd4(in_stack_00000020,in_stack_00000018 << 2,4);
  }
  return 1;
}

