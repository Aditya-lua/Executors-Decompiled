
void FUN_001dc994(void)

{
  long unaff_x19;
  long lVar1;
  long unaff_x27;
  long *unaff_x28;
  long *in_stack_00000048;
  undefined8 *in_stack_00000050;
  undefined1 uStack00000000000001c0;
  
  func_0x001d5248(&uStack00000000000001c0);
  func_0x001d5f88();
  func_0x001d4e60();
  lVar1 = unaff_x19 + 1;
  while (lVar1 = lVar1 + -1, lVar1 != 0) {
    func_0x001a09ec();
  }
  if (*in_stack_00000048 != 0) {
    func_0x00187bd4();
  }
  if (unaff_x27 != 0) {
    if ((code *)*in_stack_00000050 != (code *)0x0) {
      (*(code *)*in_stack_00000050)();
    }
    if (in_stack_00000050[1] != 0) {
      func_0x00187bd4();
    }
  }
  if (*unaff_x28 != 0) {
    func_0x00187bd4(unaff_x28[1],*unaff_x28,1);
  }
  return;
}

