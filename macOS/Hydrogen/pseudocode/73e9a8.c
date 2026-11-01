
undefined8 FUN_0073e9a8(undefined8 param_1)

{
  undefined8 uVar1;
  byte in_w9;
  byte *in_x10;
  uint in_w11;
  undefined8 uStack0000000000000000;
  undefined8 in_stack_00000018;
  
  do {
    if (in_w11 == 0x3a) {
      *in_x10 = in_w9;
    }
    else if (in_w11 == 0) {
      uStack0000000000000000 = param_1;
      uVar1 = func_0x0073eae4();
      if ((int)uVar1 == 0) {
        func_0x00783e98();
      }
      else {
        func_0x0073c9e4();
      }
      (*pcRam0000000000a2b5f0)(0);
      (*pcRam0000000000a2b5f0)(in_stack_00000018);
      return uVar1;
    }
    in_x10 = in_x10 + 1;
    in_w11 = (uint)*in_x10;
  } while( true );
}

