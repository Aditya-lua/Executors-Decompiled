
void FUN_0029c858(long param_1)

{
  undefined1 in_ZR;
  ulong in_x9;
  ulong *in_x12;
  byte *unaff_x20;
  long unaff_x21;
  
  while (!(bool)in_ZR) {
    in_x9 = (ulong)*unaff_x20 | in_x9 << 8;
    unaff_x21 = unaff_x21 + -1;
    unaff_x20 = unaff_x20 + 1;
    in_ZR = unaff_x21 == 0;
  }
  *in_x12 = in_x9;
  if ((param_1 - 1U & 0x1fffffffffffffff) != 0) {
    _bzero(in_x12 + 1);
  }
  return;
}

