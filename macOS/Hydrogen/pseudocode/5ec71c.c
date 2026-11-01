
void FUN_005ec71c(void)

{
  long unaff_x29;
  undefined1 uStack0000000000000018;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  long in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  
  func_0x00469960();
  *(BADSPACEBASE **)(unaff_x29 + -0x10) = register0x00000008;
  *(undefined **)(unaff_x29 + -8) = &DAT_005e7d38;
  uStack0000000000000030 = &UNK_007fc120;
  in_stack_00000038 = 1;
  in_stack_00000048 = 1;
  in_stack_00000050 = 0;
  in_stack_00000040 = unaff_x29 + -0x10;
  func_0x004656a8(&uStack0000000000000018,&uStack0000000000000030,&UNK_009f4160);
  func_0x004658b0();
  return;
}

