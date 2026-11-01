
undefined8 FUN_006d272c(void)

{
  int iVar1;
  ulong uVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  
  iVar1 = _strcmp();
  if (iVar1 == 0) {
    return 0x35;
  }
  iVar1 = _strcmp();
  if (iVar1 == 0) {
    return 0x39;
  }
  iVar1 = _strcmp();
  if (iVar1 == 0) {
    return 0x3c;
  }
  iVar1 = _strcmp();
  if (iVar1 == 0) {
    return 0x3d;
  }
  iVar1 = _strcmp();
  if (iVar1 == 0) {
    return 0x3e;
  }
  iVar1 = _strcmp();
  if (iVar1 == 0) {
    return 0x3f;
  }
  if (unaff_x19 != 0) {
    if (unaff_x21 == 0) {
      if (((unaff_x22 == 0) && (*(long *)(unaff_x20 + 8) != 0)) && (iVar1 = _strcmp(), iVar1 == 0))
      {
        return 0x36;
      }
    }
    else {
      uVar2 = func_0x006d37b8();
      if ((uVar2 & 1) != 0) {
        return 0x36;
      }
    }
  }
  return 0xffffffff;
}

