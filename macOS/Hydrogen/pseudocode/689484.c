
void FUN_00689484(long param_1)

{
  long lVar1;
  bool in_ZR;
  long lVar2;
  ulong uVar3;
  long in_x9;
  long *in_x10;
  long in_x11;
  long in_x12;
  long in_x13;
  long in_x14;
  long *in_x15;
  ulong in_x16;
  long unaff_x19;
  
  if (in_ZR) {
    lVar2 = 0;
    if (param_1 == 0) {
      return;
    }
  }
  else {
    lVar2 = *in_x15 + (in_x16 & 0x3ff) * 4;
    if (param_1 == lVar2) {
      return;
    }
  }
  lVar2 = ((lVar2 - *in_x15 >> 2) + ((long)in_x15 - (long)in_x10) * 0x80) - (param_1 - *in_x10 >> 2)
  ;
  if (0 < lVar2) {
    lVar1 = 0;
    if (in_x11 != in_x13) {
      lVar1 = in_x14 * 0x80 + -1;
    }
    lVar2 = in_x9 - lVar2;
    *(long *)(unaff_x19 + 0x28) = lVar2;
    uVar3 = lVar1 - (in_x12 + lVar2);
    while (0x7ff < uVar3) {
      __ZdlPv(*(undefined8 *)(in_x11 + -8));
      in_x11 = *(long *)(unaff_x19 + 0x10) + -8;
      *(long *)(unaff_x19 + 0x10) = in_x11;
      lVar2 = 0;
      if (in_x11 != *(long *)(unaff_x19 + 8)) {
        lVar2 = (in_x11 - *(long *)(unaff_x19 + 8)) * 0x80 + -1;
      }
      uVar3 = lVar2 - (*(long *)(unaff_x19 + 0x28) + *(long *)(unaff_x19 + 0x20));
    }
  }
  return;
}

