
void FUN_004bd170(undefined8 param_1)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  
  puVar2 = (undefined8 *)func_0x00187bd0(param_1,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x40);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4bd5e0);
    (*pcVar1)();
  }
  func_0x004bd098(&uStack0000000000000050,*(undefined8 *)(unaff_x20 + 0x10));
  puVar2[1] = in_stack_00000058;
  *puVar2 = uStack0000000000000050;
  puVar2[3] = in_stack_00000068;
  puVar2[2] = in_stack_00000060;
  puVar2[5] = in_stack_00000078;
  puVar2[4] = in_stack_00000070;
  puVar2[7] = in_stack_00000088;
  puVar2[6] = in_stack_00000080;
  unaff_x19[2] = puVar2;
  *unaff_x19 = 7;
  unaff_x19[1] = unaff_x21;
  return;
}

