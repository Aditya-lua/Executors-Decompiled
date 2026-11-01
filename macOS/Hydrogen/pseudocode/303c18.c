
undefined8 FUN_00303c18(undefined8 param_1)

{
  bool in_ZR;
  undefined8 in_x9;
  long unaff_x19;
  
  if (!in_ZR) {
    in_x9 = 0;
  }
  *(undefined8 *)(unaff_x19 + 0xf8) = param_1;
  *(undefined8 *)(unaff_x19 + 0x100) = in_x9;
  return 1;
}

