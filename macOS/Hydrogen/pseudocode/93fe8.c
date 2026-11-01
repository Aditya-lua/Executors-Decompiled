
void FUN_00093fe8(long param_1)

{
  long lVar1;
  ulong in_x9;
  long in_x10;
  long in_x11;
  long in_x12;
  ulong in_x13;
  ulong in_x14;
  ulong in_x15;
  long in_x16;
  ulong uVar2;
  long unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  long unaff_x23;
  undefined8 unaff_x24;
  long unaff_x25;
  long unaff_x26;
  
  do {
    in_x16 = in_x16 + -1;
    if (in_x16 == 0) {
      *(ulong *)(in_x12 + in_x11 * 8) = in_x14;
      in_x11 = in_x11 + 1;
      in_x13 = in_x13 + 8;
      if (in_x11 == unaff_x23) {
        in_x10 = in_x10 + 1;
        in_x9 = in_x9 + 0x80;
        if (in_x10 == unaff_x26) {
          lVar1 = *(long *)(unaff_x19 + unaff_x25 * 8 + -8);
          *(undefined8 *)(lVar1 + (ulong)((int)unaff_x23 - 1) * 8) = unaff_x24;
          *(undefined8 *)(lVar1 + (ulong)((int)unaff_x23 - 2) * 8) = 0;
          return;
        }
        in_x11 = 0;
        in_x12 = *(long *)(unaff_x19 + in_x10 * 8);
        in_x13 = in_x9;
      }
      in_x14 = 0;
      in_x15 = in_x13;
      in_x16 = param_1;
    }
    if (in_x15 < unaff_x21) {
      in_x14 = (ulong)*(byte *)(unaff_x20 + in_x15) | in_x14 << 8;
      in_x15 = in_x15 + 1;
    }
    else {
      uVar2 = in_x14 << 8;
      in_x14 = in_x14 << 8 | 0x80;
      if (unaff_x21 != in_x15) {
        in_x14 = uVar2;
      }
      in_x15 = in_x15 + 1;
    }
  } while( true );
}

