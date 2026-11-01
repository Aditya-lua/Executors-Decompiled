
long FUN_0067b294(void)

{
  uint in_w8;
  long in_x9;
  ulong *in_x10;
  ulong in_x11;
  int in_w12;
  ulong in_x13;
  ulong in_x14;
  long unaff_x19;
  long unaff_x20;
  ulong *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  int unaff_w25;
  long unaff_x26;
  
  do {
    unaff_x21[5] = in_x14 ^ in_x13;
    if (unaff_x26 != 6) {
      unaff_x21[6] = unaff_x21[6] ^ in_x10[6];
    }
    do {
      in_w12 = in_w12 + -1;
      in_x11 = in_x11 - 1;
      if (in_w12 < 1) {
        if ((in_w8 & 0x3f) != 0) {
          unaff_x21[unaff_x22 + -1] =
               unaff_x21[unaff_x22 + -1] & (-1L << (in_w8 & 0x3f) ^ 0xffffffffffffffffU);
        }
        if (*(ulong **)(unaff_x19 + 0xb8) != unaff_x21) {
          _memcpy();
        }
        if (unaff_x21 != (ulong *)0x0) {
          if (unaff_w25 != 0) {
            do {
              *(undefined8 *)((long)unaff_x21 + unaff_x20 + -8) = 0;
              unaff_x20 = unaff_x20 + -8;
            } while (unaff_x20 != 0);
          }
          func_0x00611644();
        }
        return unaff_x19 + 0xa0;
      }
    } while ((((*(ulong *)(unaff_x23 + 0x10) <= in_x11 >> 6) ||
              ((*(ulong *)(in_x9 + (in_x11 >> 6) * 8) >> (in_x11 & 0x3f) & 1) == 0)) ||
             (*unaff_x21 = *unaff_x21 ^ *in_x10, unaff_x26 == 1)) ||
            (((unaff_x21[1] = unaff_x21[1] ^ in_x10[1], unaff_x26 == 2 ||
              (unaff_x21[2] = unaff_x21[2] ^ in_x10[2], unaff_x26 == 3)) ||
             ((unaff_x21[3] = unaff_x21[3] ^ in_x10[3], unaff_x26 == 4 ||
              (unaff_x21[4] = unaff_x21[4] ^ in_x10[4], unaff_x26 == 5))))));
    in_x13 = in_x10[5];
    in_x14 = unaff_x21[5];
  } while( true );
}

