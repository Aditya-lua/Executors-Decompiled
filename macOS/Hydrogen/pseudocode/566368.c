
void FUN_00566368(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  
  puVar2 = (undefined8 *)func_0x00187bd0(0x40,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x40);
    func_0x007a05dc();
    func_0x007a1f18(8,0x40);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x5665cc);
    (*pcVar1)();
  }
  func_0x00566040(&uStack0000000000000040,*(undefined8 *)(unaff_x20 + 0x20));
  puVar2[1] = in_stack_00000048;
  *puVar2 = uStack0000000000000040;
  puVar2[3] = in_stack_00000058;
  puVar2[2] = in_stack_00000050;
  puVar2[5] = in_stack_00000068;
  puVar2[4] = in_stack_00000060;
  puVar2[7] = in_stack_00000078;
  puVar2[6] = in_stack_00000070;
  func_0x00557498(&uStack0000000000000040,unaff_x20 + 8,&UNK_009ee548);
  unaff_x19[2] = in_stack_00000048;
  unaff_x19[1] = uStack0000000000000040;
  unaff_x19[3] = in_stack_00000050;
  unaff_x19[4] = puVar2;
  *unaff_x19 = 2;
  return;
}

