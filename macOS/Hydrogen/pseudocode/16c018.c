
void FUN_0016c018(void)

{
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x22;
  long lVar1;
  long unaff_x24;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  
  if (unaff_x24 != 0) {
    lVar1 = 0;
    do {
      if (unaff_x20 == 0) break;
      func_0x0045cd08(&uStack0000000000000018,unaff_x21);
      lVar1 = lVar1 + 1;
      unaff_x21 = unaff_x21 + 0x18;
      unaff_x22[1] = in_stack_00000020;
      *unaff_x22 = uStack0000000000000018;
      unaff_x22[2] = in_stack_00000028;
      unaff_x20 = unaff_x20 + -0x18;
      unaff_x22 = unaff_x22 + 3;
    } while (unaff_x24 != lVar1);
  }
  unaff_x19[1] = in_stack_00000008;
  *unaff_x19 = in_stack_00000000;
  unaff_x19[2] = unaff_x24;
  return;
}

