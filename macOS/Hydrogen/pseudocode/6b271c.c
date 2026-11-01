
void FUN_006b271c(undefined8 param_1)

{
  undefined4 *in_x9;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined4 *unaff_x21;
  undefined8 unaff_x22;
  
  do {
    unaff_x21 = unaff_x21 + -1;
    in_x9 = in_x9 + -1;
    *in_x9 = *unaff_x21;
  } while (unaff_x21 != unaff_x20);
  *(undefined4 **)(unaff_x19 + 0x40) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x48) = unaff_x22;
  *(undefined8 *)(unaff_x19 + 0x50) = param_1;
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined8 *)(unaff_x19 + 0x48) = unaff_x22;
  return;
}

