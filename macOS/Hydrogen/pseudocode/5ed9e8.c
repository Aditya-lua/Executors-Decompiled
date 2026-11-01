
void FUN_005ed9e8(void)

{
  long unaff_x20;
  long unaff_x21;
  long *plVar1;
  
  if (unaff_x21 != 0) {
    plVar1 = (long *)(unaff_x20 + 0x10);
    do {
      if (plVar1[-1] != 0) {
        (**(code **)(*plVar1 + 0x18))(plVar1[-1],plVar1[-2]);
      }
      plVar1 = plVar1 + 3;
      unaff_x21 = unaff_x21 + -1;
    } while (unaff_x21 != 0);
  }
  func_0x004653b0();
  func_0x00465628();
  return;
}

