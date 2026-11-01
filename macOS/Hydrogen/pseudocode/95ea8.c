
undefined8 FUN_00095ea8(void)

{
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  long unaff_x28;
  
  _free();
  if ((int)unaff_x22 == 0) {
    *(undefined8 *)(unaff_x21 + 0x30) = unaff_x20;
    unaff_x22 = 0;
    if (unaff_x19 != (undefined8 *)0x0) {
      *unaff_x19 = *(undefined8 *)(unaff_x21 + 0x20);
    }
  }
  else {
    _free();
    if (*(long *)(unaff_x28 + 0x10) != unaff_x28) {
      func_0x00095fb8();
    }
  }
  return unaff_x22;
}

