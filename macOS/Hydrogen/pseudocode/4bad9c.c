
void FUN_004bad9c(void)

{
  long lVar1;
  undefined1 uStack0000000000000010;
  long *in_stack_00000018;
  
  lVar1 = *in_stack_00000018;
  *in_stack_00000018 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x005e80f0((ulong)&uStack0000000000000010 | 8);
  }
  return;
}

