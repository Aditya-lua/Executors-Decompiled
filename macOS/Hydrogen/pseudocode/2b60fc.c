
undefined8 FUN_002b60fc(void)

{
  long unaff_x19;
  ulong unaff_x22;
  
  if (0x7f < unaff_x22) {
    if ((bRam0000000000a334f8 >> 6 & 1) == 0) {
      func_0x00388780();
    }
    else {
      func_0x003895c0();
    }
    unaff_x22 = unaff_x22 & 0x7f;
  }
  if (unaff_x22 != 0) {
    _memcpy();
    *(int *)(unaff_x19 + 0xd0) = (int)unaff_x22;
  }
  return 1;
}

