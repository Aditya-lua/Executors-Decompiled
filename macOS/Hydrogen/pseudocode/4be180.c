
undefined8 FUN_004be180(undefined1 param_1 [16],undefined1 param_2 [16])

{
  code *pcVar1;
  undefined4 *puVar2;
  undefined4 unaff_w19;
  long unaff_x23;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000060;
  undefined4 *in_stack_00000068;
  undefined8 in_stack_00000070;
  
  *(long *)(unaff_x23 + 0x28) = param_1._8_8_;
  *(long *)(unaff_x23 + 0x20) = param_1._0_8_;
  *(long *)(unaff_x23 + 0x38) = param_2._8_8_;
  *(long *)(unaff_x23 + 0x30) = param_2._0_8_;
  puVar2 = (undefined4 *)func_0x00187bd0(0x28,8);
  if (puVar2 == (undefined4 *)0x0) {
    func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4be2ac);
    (*pcVar1)();
  }
  *puVar2 = unaff_w19;
  *(undefined8 *)(puVar2 + 2) = 0;
  *(undefined8 *)(puVar2 + 4) = 8;
  *(undefined8 *)(puVar2 + 6) = 0;
  *(undefined1 *)(puVar2 + 8) = 0;
  in_stack_00000060 = 1;
  in_stack_00000070 = 1;
  in_stack_00000068 = puVar2;
  func_0x00584c34(&uStack0000000000000040);
  func_0x004ce364(&uStack0000000000000040);
  if (uStack0000000000000040 != 0) {
    func_0x00187bd4(in_stack_00000048,uStack0000000000000040 * 0x28,8);
  }
  func_0x004bea24();
  if (in_stack_00000008 != 0) {
    func_0x00187bd4(in_stack_00000010,in_stack_00000008 << 2,4);
  }
  return 1;
}

