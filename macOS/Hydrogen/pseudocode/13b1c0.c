
void FUN_0013b1c0(void)

{
  long unaff_x19;
  long *unaff_x20;
  long *plVar2;
  long *plVar1;
  long *unaff_x21;
  long *unaff_x22;
  long in_stack_00000010;
  long *in_stack_00000020;
  undefined1 uStack0000000000000038;
  undefined8 in_stack_00000040;
  
  do {
    if (unaff_x20[-1] != 0) {
      *unaff_x20 = unaff_x20[-1];
      __ZdlPv();
      *unaff_x20 = 0;
      unaff_x20[1] = 0;
    }
    *unaff_x20 = unaff_x20[3];
    unaff_x20[-1] = unaff_x20[2];
    unaff_x20[1] = unaff_x20[4];
    unaff_x20[3] = 0;
    unaff_x20[4] = 0;
    unaff_x20[2] = 0;
    unaff_x21 = unaff_x21 + 3;
    plVar1 = unaff_x20 + 5;
    unaff_x20 = unaff_x20 + 3;
  } while (plVar1 != unaff_x22);
  if (*(long **)(unaff_x19 + 0x10) != unaff_x21) {
    plVar1 = *(long **)(unaff_x19 + 0x10);
    do {
      plVar2 = plVar1 + -3;
      if (*plVar2 != 0) {
        plVar1[-2] = *plVar2;
        __ZdlPv();
      }
      plVar1 = plVar2;
    } while (plVar2 != unaff_x21);
  }
  *(long **)(unaff_x19 + 0x10) = unaff_x21;
  *(undefined1 *)(unaff_x19 + 0x5d) = 1;
  while (in_stack_00000020 != (long *)0x0) {
    in_stack_00000020 = (long *)*in_stack_00000020;
    __ZdlPv();
  }
  if (in_stack_00000010 != 0) {
    __ZdlPv();
  }
  func_0x0014a65c(&uStack0000000000000038,in_stack_00000040);
  return;
}

