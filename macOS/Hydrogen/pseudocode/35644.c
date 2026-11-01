
void FUN_00035644(void)

{
  long unaff_x20;
  long unaff_x21;
  long unaff_x29;
  
  do {
    if (*(long *)(unaff_x21 + -0x28) != 0) {
      *(long *)(unaff_x21 + -0x20) = *(long *)(unaff_x21 + -0x28);
      __ZdlPv();
    }
    if (*(long *)(unaff_x21 + -0x40) != 0) {
      *(long *)(unaff_x21 + -0x38) = *(long *)(unaff_x21 + -0x40);
      __ZdlPv();
    }
    unaff_x21 = unaff_x21 + -0x60;
  } while (unaff_x21 != unaff_x20);
  *(long *)(unaff_x29 + -0x70) = unaff_x20;
  __ZdlPv(*(undefined8 *)(unaff_x29 + -0x78));
  return;
}

