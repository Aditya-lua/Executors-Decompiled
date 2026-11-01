
void FUN_0027b1f4(void)

{
  byte *unaff_x19;
  undefined1 *unaff_x20;
  undefined1 unaff_w21;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  if ((*unaff_x19 & 1) == 0) {
    unaff_w21 = 0;
    in_stack_00000018 = *(undefined8 *)(unaff_x19 + 9);
    in_stack_00000010 = *(undefined8 *)(unaff_x19 + 1);
  }
  *unaff_x20 = unaff_w21;
  *(undefined8 *)(unaff_x20 + 9) = in_stack_00000018;
  *(undefined8 *)(unaff_x20 + 1) = in_stack_00000010;
  return;
}

