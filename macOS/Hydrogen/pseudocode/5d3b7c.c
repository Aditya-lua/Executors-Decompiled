
void FUN_005d3b7c(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 extraout_x10;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x22;
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
    pcVar1 = (code *)SoftwareBreakpoint(1,0x5d3c40);
    (*pcVar1)();
  }
  func_0x005d36b4(&uStack0000000000000040,*(undefined8 *)(unaff_x20 + 0x28));
  puVar2[1] = in_stack_00000048;
  *puVar2 = uStack0000000000000040;
  puVar2[3] = in_stack_00000058;
  puVar2[2] = in_stack_00000050;
  puVar2[5] = in_stack_00000068;
  puVar2[4] = in_stack_00000060;
  puVar2[7] = in_stack_00000078;
  puVar2[6] = in_stack_00000070;
  func_0x0059ec7c(&uStack0000000000000040,unaff_x20 + 0x10,&UNK_009f2dd0);
  unaff_x19[3] = in_stack_00000048;
  unaff_x19[2] = uStack0000000000000040;
  unaff_x19[4] = in_stack_00000050;
  unaff_x19[5] = puVar2;
  unaff_x19[6] = extraout_x10;
  unaff_x19[7] = unaff_x22;
  *unaff_x19 = 0xb;
  unaff_x19[1] = 0x8000000000000001;
  return;
}

