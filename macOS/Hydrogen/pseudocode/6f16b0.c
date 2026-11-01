
long FUN_006f16b0(ulong param_1)

{
  ulong in_x9;
  long in_x10;
  undefined4 *in_x11;
  long in_x12;
  long in_x13;
  long unaff_x19;
  long unaff_x20;
  
  while( true ) {
    *in_x11 = 0;
    in_x11[4] = 0;
    in_x13 = in_x13 + -4;
    if (in_x13 == 0) break;
    in_x11[8] = 0;
    in_x11[0xc] = 0;
    in_x11 = in_x11 + 0x10;
  }
  if (in_x10 != in_x12) {
    do {
      *(undefined4 *)(in_x9 + 0xc) = 0;
      in_x9 = in_x9 + 0x10;
    } while (in_x9 < param_1);
  }
  if (*(char *)(unaff_x20 + 0x21) == '\x01') {
    (*pcRam0000000000a40208)();
  }
  return (long)*(int *)(unaff_x19 + 0x4c) * 0x28 +
         (long)(int)(*(uint *)(unaff_x19 + 0x48) ^ (uint)(uint *)(unaff_x19 + 0x48)) * 0x10 + 0x80;
}

