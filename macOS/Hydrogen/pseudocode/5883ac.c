
void FUN_005883ac(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  
  func_0x005882f4();
  unaff_x21[1] = in_stack_00000048;
  *unaff_x21 = uStack0000000000000040;
  unaff_x21[3] = in_stack_00000058;
  unaff_x21[2] = in_stack_00000050;
  unaff_x21[5] = in_stack_00000068;
  unaff_x21[4] = in_stack_00000060;
  unaff_x21[7] = in_stack_00000078;
  unaff_x21[6] = in_stack_00000070;
  puVar2 = (undefined8 *)func_0x00187bd0(0x40,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x40);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x588880);
    (*pcVar1)();
  }
  func_0x005882f4(&uStack0000000000000040,*(undefined8 *)(unaff_x20 + 0x10));
  puVar2[1] = in_stack_00000048;
  *puVar2 = uStack0000000000000040;
  puVar2[3] = in_stack_00000058;
  puVar2[2] = in_stack_00000050;
  puVar2[5] = in_stack_00000068;
  puVar2[4] = in_stack_00000060;
  puVar2[7] = in_stack_00000078;
  puVar2[6] = in_stack_00000070;
  unaff_x19[2] = puVar2;
  *unaff_x19 = 7;
  unaff_x19[1] = unaff_x21;
  return;
}

