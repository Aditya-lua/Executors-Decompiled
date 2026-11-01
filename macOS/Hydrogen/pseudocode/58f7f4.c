
void FUN_0058f7f4(void)

{
  long lVar1;
  ulong uVar2;
  long in_x9;
  ulong in_stack_00000048;
  undefined8 uStack0000000000000080;
  long *in_stack_00000088;
  undefined8 uStack0000000000000098;
  long in_stack_000000f8;
  undefined8 in_stack_00000100;
  long in_stack_00000110;
  
  if (in_x9 != 0) {
    uVar2 = in_x9 * 4 + 0xbU & 0xfffffffffffffff8;
    lVar1 = in_x9 + uVar2 + 9;
    if (lVar1 != 0) {
      func_0x00187bd4(in_stack_00000110 - uVar2,lVar1,8);
    }
  }
  if (in_stack_000000f8 != 0) {
    func_0x00187bd4(in_stack_00000100,in_stack_000000f8 << 2,4);
  }
  if ((in_stack_00000048 < 3) && (uStack0000000000000080 != 2)) {
    func_0x005ec378(&uStack0000000000000080,&uStack0000000000000098);
    lVar1 = uStack0000000000000080;
    if ((uStack0000000000000080 != 2) &&
       (func_0x005ec3ac(&uStack0000000000000080,uStack0000000000000098), lVar1 != 0)) {
      lVar1 = *in_stack_00000088;
      *in_stack_00000088 = lVar1 + -1;
      LORelease();
      if (lVar1 == 1) {
        DataMemoryBarrier(2,1);
        func_0x005e80f0((ulong)&uStack0000000000000080 | 8);
      }
    }
  }
  return;
}

