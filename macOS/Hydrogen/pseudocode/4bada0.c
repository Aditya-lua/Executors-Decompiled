
void FUN_004bada0(long *param_1)

{
  long lVar1;
  undefined1 uStack0000000000000010;
  
  lVar1 = *param_1;
  *param_1 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x005e80f0((ulong)&uStack0000000000000010 | 8);
  }
  return;
}

