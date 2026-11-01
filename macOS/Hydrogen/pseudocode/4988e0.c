
void FUN_004988e0(long param_1)

{
  long lVar1;
  long in_x9;
  undefined8 *unaff_x19;
  long unaff_x25;
  ulong unaff_x27;
  undefined8 uStack0000000000000020;
  long *in_stack_00000028;
  undefined8 uStack0000000000000038;
  undefined1 uStack0000000000000088;
  
  param_1 = in_x9 - param_1;
  do {
    lVar1 = *(long *)*unaff_x19;
    *(long *)*unaff_x19 = lVar1 + -1;
    LORelease();
    if (lVar1 == 1) {
      func_0x005d2b20(unaff_x19);
    }
    unaff_x19 = unaff_x19 + 2;
    param_1 = param_1 + 1;
  } while (param_1 != 1);
  if (*(long *)(unaff_x25 + 0x50) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x25 + 0x58),*(long *)(unaff_x25 + 0x50) << 4,8);
  }
  func_0x00493bd8(&uStack0000000000000088);
  if ((unaff_x27 < 3) && (uStack0000000000000020 != 2)) {
    func_0x005ec378(&uStack0000000000000020,&uStack0000000000000038);
    lVar1 = uStack0000000000000020;
    if ((uStack0000000000000020 != 2) &&
       (func_0x005ec3ac(&uStack0000000000000020,uStack0000000000000038), lVar1 != 0)) {
      lVar1 = *in_stack_00000028;
      *in_stack_00000028 = lVar1 + -1;
      LORelease();
      if (lVar1 == 1) {
        DataMemoryBarrier(2,1);
        func_0x005e80f0((ulong)&uStack0000000000000020 | 8);
      }
    }
  }
  return;
}

