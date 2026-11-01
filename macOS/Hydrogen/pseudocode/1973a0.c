
void FUN_001973a0(void)

{
  long lVar1;
  long lVar2;
  undefined1 uStack0000000000000030;
  long in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  
  lVar1 = in_stack_00000040;
  for (lVar2 = in_stack_00000048; lVar2 != 0; lVar2 = lVar2 + -1) {
    func_0x0019fb28(lVar1);
    func_0x0019e6a4(lVar1 + 8);
    lVar1 = lVar1 + 0x10;
  }
  if (in_stack_00000038 != 0) {
    func_0x00187bd4(in_stack_00000040,in_stack_00000038 << 4,8);
  }
  func_0x0019fb28(&uStack0000000000000030);
  return;
}

