
void FUN_0068b020(void)

{
  undefined8 in_x9;
  long unaff_x19;
  long unaff_x21;
  undefined8 unaff_x23;
  undefined8 *unaff_x24;
  
  *(undefined8 **)(unaff_x19 + 0x10) = unaff_x24;
  *(undefined8 *)(unaff_x19 + 0x18) = in_x9;
  if (unaff_x21 != 0) {
    __ZdlPv();
    unaff_x24 = *(undefined8 **)(unaff_x19 + 0x10);
  }
  *unaff_x24 = unaff_x23;
  *(long *)(unaff_x19 + 0x10) = *(long *)(unaff_x19 + 0x10) + 8;
  return;
}

