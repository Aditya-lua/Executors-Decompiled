
void FUN_00523d48(void)

{
  undefined8 uVar1;
  undefined8 *in_x9;
  long in_x10;
  undefined8 *in_x11;
  undefined8 unaff_x20;
  undefined8 *unaff_x24;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  
  do {
    uVar1 = *in_x11;
    in_x9[-1] = in_x11[-1];
    *in_x9 = uVar1;
    in_x9 = in_x9 + 2;
    in_x11 = in_x11 + 2;
    in_x10 = in_x10 + -1;
  } while (in_x10 != 0);
  *unaff_x24 = in_stack_00000028;
  unaff_x24[1] = in_stack_00000030;
  unaff_x24[2] = unaff_x20;
  return;
}

