
void FUN_006b2720(undefined8 param_1)

{
  undefined4 *in_x9;
  undefined4 in_w10;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined4 *unaff_x21;
  undefined8 unaff_x22;
  
  while( true ) {
    in_x9 = in_x9 + -1;
    *in_x9 = in_w10;
    if (unaff_x21 == unaff_x20) break;
    unaff_x21 = unaff_x21 + -1;
    in_w10 = *unaff_x21;
  }
  *(undefined4 **)(unaff_x19 + 0x40) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x48) = unaff_x22;
  *(undefined8 *)(unaff_x19 + 0x50) = param_1;
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined8 *)(unaff_x19 + 0x48) = unaff_x22;
  return;
}

