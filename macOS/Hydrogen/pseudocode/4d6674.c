
void thunk_FUN_004d667c(void)

{
  long *plVar1;
  long lVar2;
  ulong unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  
  func_0x005e32c0(&uStack0000000000000010);
  do {
    if (unaff_x22 == 0) {
      lVar2 = 0;
      goto LAB_004d66ac;
    }
    plVar1 = (long *)(unaff_x23 + unaff_x22);
    unaff_x22 = unaff_x22 - 0x20;
  } while (*plVar1 == -0x8000000000000000);
  lVar2 = (unaff_x22 >> 5 & 0xffffffff) + 1;
LAB_004d66ac:
  func_0x005e32c0(&uStack0000000000000030,lVar2);
  if ((unaff_x21 & 1) != 0) {
    func_0x004d6438();
  }
  if (uStack0000000000000030 != 0) {
    func_0x00187bd4(in_stack_00000038,uStack0000000000000030 << 2,4);
  }
  if (uStack0000000000000010 != 0) {
    func_0x00187bd4(in_stack_00000018,uStack0000000000000010 << 2,4);
  }
  return;
}

