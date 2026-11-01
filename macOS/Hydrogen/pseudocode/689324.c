
void FUN_00689324(long param_1)

{
  long lVar1;
  ulong uVar2;
  long in_x9;
  long in_x10;
  long in_x11;
  long in_x12;
  long in_x13;
  long unaff_x19;
  
  lVar1 = 0;
  if (in_x9 != in_x11) {
    lVar1 = in_x12 + -1;
  }
  *(long *)(unaff_x19 + 0x28) = in_x10 - param_1;
  uVar2 = lVar1 - (in_x13 + (in_x10 - param_1));
  while (0x3ff < uVar2) {
    __ZdlPv(*(undefined8 *)(in_x9 + -8));
    in_x9 = *(long *)(unaff_x19 + 0x10) + -8;
    *(long *)(unaff_x19 + 0x10) = in_x9;
    lVar1 = 0;
    if (in_x9 != *(long *)(unaff_x19 + 8)) {
      lVar1 = (in_x9 - *(long *)(unaff_x19 + 8)) * 0x40 + -1;
    }
    uVar2 = lVar1 - (*(long *)(unaff_x19 + 0x28) + *(long *)(unaff_x19 + 0x20));
  }
  return;
}

