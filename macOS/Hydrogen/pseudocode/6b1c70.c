
int FUN_006b1c70(undefined8 param_1)

{
  undefined4 *in_x9;
  long in_x10;
  long in_x11;
  undefined4 *in_x12;
  long unaff_x19;
  undefined8 unaff_x21;
  undefined4 *unaff_x22;
  short unaff_w23;
  
  if (in_x10 != in_x11) {
    do {
      in_x12 = in_x12 + -1;
      in_x9 = in_x9 + -1;
      *in_x9 = *in_x12;
    } while (in_x12 != unaff_x22);
  }
  *(undefined4 **)(unaff_x19 + 0x70) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x78) = unaff_x21;
  *(undefined8 *)(unaff_x19 + 0x80) = param_1;
  if (unaff_x22 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined8 *)(unaff_x19 + 0x78) = unaff_x21;
  return (int)unaff_w23;
}

