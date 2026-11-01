
undefined8 FUN_001b607c(long param_1)

{
  long in_x9;
  long in_x10;
  long in_x11;
  long *in_x12;
  long in_x13;
  uint in_w14;
  
  do {
    in_x12 = in_x12 + 4;
    in_x11 = in_x11 + -0x20;
    if (in_x13 != in_x10 && in_w14 != 5) {
      return 1;
    }
    while (in_x11 == 0) {
      if (param_1 + 0x30 == in_x9) {
        return 0;
      }
      in_x12 = *(long **)(param_1 + 0x38);
      in_x11 = *(long *)(param_1 + 0x40) << 5;
      param_1 = param_1 + 0x30;
    }
    in_x13 = *in_x12;
    in_w14 = (uint)*(ushort *)(in_x12 + 3);
  } while( true );
}

