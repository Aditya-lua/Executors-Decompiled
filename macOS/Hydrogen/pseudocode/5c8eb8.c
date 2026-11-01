
void FUN_005c8eb8(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  
  puVar2 = (undefined8 *)func_0x00187bd0(0x30,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x30);
    func_0x007a1f18(8,0x60);
    func_0x007a23bc(&UNK_009f27f8);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x5c9104);
    (*pcVar1)();
  }
  func_0x005c8e40(&uStack0000000000000050,*(undefined8 *)(unaff_x20 + 8));
  puVar2[1] = in_stack_00000058;
  *puVar2 = uStack0000000000000050;
  puVar2[3] = in_stack_00000068;
  puVar2[2] = in_stack_00000060;
  puVar2[5] = in_stack_00000078;
  puVar2[4] = in_stack_00000070;
  unaff_x19[1] = puVar2;
  *unaff_x19 = 0x8000000000000007;
  return;
}

