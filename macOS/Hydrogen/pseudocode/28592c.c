
undefined * FUN_0028592c(undefined *param_1)

{
  long unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  uint *unaff_x24;
  ulong unaff_x25;
  undefined4 uStack0000000000000028;
  long in_stack_00000038;
  
  do {
    unaff_x25 = unaff_x25 - unaff_x22;
    while( true ) {
      if (unaff_x25 == 0) {
        uStack0000000000000028 = 0;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000038) {
          return param_1;
        }
        ___stack_chk_fail();
        return &UNK_009cdd88;
      }
      uStack0000000000000028 = 0;
      unaff_x22 = unaff_x25;
      if (unaff_x23 <= unaff_x25) {
        unaff_x22 = unaff_x23;
      }
      if (0xbf < unaff_x22 && (*unaff_x24 & 1) != 0) break;
      param_1 = (undefined *)func_0x00374260(unaff_x20,unaff_x21,unaff_x22);
      unaff_x21 = unaff_x21 + unaff_x22;
      unaff_x20 = unaff_x20 + unaff_x22;
      unaff_x25 = unaff_x25 - unaff_x22;
    }
    param_1 = (undefined *)func_0x003745e0();
    unaff_x21 = unaff_x21 + unaff_x22;
    unaff_x20 = unaff_x20 + unaff_x22;
  } while( true );
}

