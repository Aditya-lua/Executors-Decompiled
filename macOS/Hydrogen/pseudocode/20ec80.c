
void FUN_0020ec80(long param_1)

{
  code *pcVar1;
  long in_x9;
  undefined8 *unaff_x19;
  long in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined1 uStack0000000000000078;
  ulong in_stack_000000b8;
  
  if (in_x9 <= param_1) {
    if (0x40 < in_stack_000000b8) {
      func_0x007a28b0(in_stack_000000b8,0x40,&UNK_009c9cd0);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x20ed08);
      (*pcVar1)();
    }
    func_0x001b2f70();
  }
  unaff_x19[1] = in_stack_00000068;
  *unaff_x19 = in_stack_00000060;
  unaff_x19[2] = in_stack_00000070;
  func_0x00240a1c(&uStack0000000000000078);
  if (in_stack_00000000 != 0) {
    func_0x00187bd4(in_stack_00000008,in_stack_00000000,1);
  }
  return;
}

