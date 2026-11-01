
undefined8 FUN_00772a5c(ulong param_1)

{
  long lVar1;
  undefined8 uVar2;
  byte *in_x9;
  long in_x10;
  ulong in_x11;
  long unaff_x19;
  long unaff_x21;
  
  while( true ) {
    unaff_x21 = unaff_x21 + 1;
    if ((((uint)param_1 < 0x3c) && ((in_x10 << (param_1 & 0x3f) & in_x11) != 0)) ||
       ((uint)param_1 - 10 < 4)) break;
    param_1 = (ulong)*in_x9;
    in_x9 = in_x9 + 1;
  }
  if (*(long *)(unaff_x19 + 0x878) == 0) {
    lVar1 = func_0x0077e93c();
    *(long *)(unaff_x19 + 0x878) = lVar1;
    if (lVar1 == 0) {
      return 0x1b;
    }
    return 0;
  }
  lVar1 = _strlen(*(long *)(unaff_x19 + 0x878));
  if ((lVar1 == unaff_x21) && (uVar2 = _strncmp(), (int)uVar2 == 0)) {
    return uVar2;
  }
  func_0x0073c9e4();
  return 0x56;
}

