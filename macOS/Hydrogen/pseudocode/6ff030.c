
undefined8 FUN_006ff030(ulong param_1)

{
  int iVar1;
  int in_w11;
  long unaff_x20;
  int unaff_w21;
  
joined_r0x006ff034:
  do {
    iVar1 = in_w11;
    if ((-2 < unaff_w21) || ((int)param_1 == 0)) {
      if (iVar1 == 0) {
        func_0x006e3870();
        return 1;
      }
      func_0x006e383c();
      return 1;
    }
    param_1 = param_1 & 0xffffffff;
    do {
      unaff_w21 = iVar1;
      if (param_1 < 2) {
        param_1 = 0;
        in_w11 = iVar1 + 1;
        goto joined_r0x006ff034;
      }
      param_1 = param_1 - 1;
    } while ((*(byte *)(unaff_x20 + (param_1 & 0xffffffff)) & 0xc0) == 0x80);
    in_w11 = iVar1 + 1;
  } while( true );
}

