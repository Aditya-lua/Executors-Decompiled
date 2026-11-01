
bool FUN_003f4728(void)

{
  long unaff_x19;
  long *plVar1;
  long unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  long unaff_x24;
  
  _memcpy();
  *(long *)(unaff_x23 + 0x10) = unaff_x20 + unaff_x24;
  if (unaff_x22 < unaff_x21) {
    plVar1 = (long *)(unaff_x19 + 8);
    if (*plVar1 != 0) {
      func_0x003f67e4(plVar1);
    }
    *plVar1 = (long)&UNK_009da470;
  }
  return unaff_x22 < unaff_x21;
}

