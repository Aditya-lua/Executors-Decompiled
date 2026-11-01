
undefined8 FUN_00687e4c(undefined8 param_1,byte *param_2)

{
  uint in_w8;
  uint in_w9;
  byte *unaff_x19;
  long unaff_x22;
  
  while( true ) {
    if (in_w8 != in_w9) {
      return 2;
    }
    unaff_x19 = unaff_x19 + 1;
    param_2 = param_2 + 1;
    unaff_x22 = unaff_x22 + -1;
    if (unaff_x22 == 0) break;
    in_w8 = (uint)*unaff_x19;
    in_w9 = (uint)*param_2;
  }
  return 1;
}

