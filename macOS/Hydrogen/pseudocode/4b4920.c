
void FUN_004b4920(void)

{
  long lVar1;
  long unaff_x19;
  undefined1 uStack0000000000000010;
  long *in_stack_00000018;
  
  func_0x005ec3ac();
  if (unaff_x19 != 0) {
    lVar1 = *in_stack_00000018;
    *in_stack_00000018 = lVar1 + -1;
    LORelease();
    if (lVar1 == 1) {
      DataMemoryBarrier(2,1);
      func_0x005e80f0((ulong)&uStack0000000000000010 | 8);
    }
  }
  return;
}

