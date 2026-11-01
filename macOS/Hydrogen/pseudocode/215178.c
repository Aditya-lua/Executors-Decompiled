
void FUN_00215178(void)

{
  uint uVar1;
  long lVar2;
  long unaff_x19;
  int unaff_w23;
  long in_stack_00000028;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined1 uStack0000000000000050;
  undefined1 uStack0000000000000088;
  undefined8 uStack00000000000000a0;
  byte in_stack_000000e0;
  long in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 uStack0000000000000100;
  undefined1 uStack0000000000000110;
  long in_stack_000002d0;
  undefined8 in_stack_000002d8;
  long in_stack_000002f0;
  undefined8 in_stack_000002f8;
  long *in_stack_00000308;
  undefined8 in_stack_00000310;
  undefined8 in_stack_00000318;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x00187bd4();
  if (in_stack_000002f0 != -0x7fffffffffffffff) {
    if (unaff_w23 != 0) {
      lVar2 = *in_stack_00000308;
      *in_stack_00000308 = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        DataMemoryBarrier(2,1);
        func_0x001f9f8c(auStack_7ffffffe + 0x80000306);
      }
      func_0x0020a1a4(in_stack_00000310,in_stack_00000318);
    }
    if (((in_stack_00000028 == -0x7fffffffffffffff) && (in_stack_000002f0 != -0x8000000000000000))
       && (in_stack_000002f0 != 0)) {
      func_0x00187bd4(in_stack_000002f8,in_stack_000002f0,1);
    }
  }
  if (in_stack_000002d0 != 0) {
    func_0x00187bd4(in_stack_000002d8,in_stack_000002d0,1);
  }
  func_0x00240a1c(auStack_7ffffffe + 0x8000023e);
  lVar2 = *uStack0000000000000100;
  *uStack0000000000000100 = lVar2 + -1;
  LORelease();
  if (lVar2 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9b44(&uStack0000000000000100);
  }
  if ((((in_stack_000000e0 & 1) == 0) && (in_stack_000000e8 != -0x8000000000000000)) &&
     (in_stack_000000e8 != 0)) {
    func_0x00187bd4(in_stack_000000f0,in_stack_000000e8,1);
  }
  func_0x0020848c(&uStack0000000000000050);
  func_0x00209ea8(&uStack0000000000000110);
  uVar1 = 0;
  if (uStack00000000000000a0 != unaff_x19) {
    uVar1 = in_stack_00000040._4_4_;
  }
  if ((uVar1 & 1) != 0) {
    func_0x00208e34(&uStack00000000000000a0);
  }
  func_0x00207f98(&uStack0000000000000088);
  func_0x002087e4();
  func_0x00187bd4(in_stack_00000048,0x1a8,8);
  __Unwind_Resume();
  func_0x007a2668();
  return;
}

