
void FUN_00514350(void)

{
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long lVar1;
  undefined8 *unaff_x22;
  long lVar2;
  
  do {
    if (unaff_x22[-1] != 0) {
      func_0x00187bd4(*unaff_x22,unaff_x22[-1],1);
    }
    unaff_x22 = unaff_x22 + 3;
    unaff_x21 = unaff_x21 + -1;
  } while (unaff_x21 != 0);
  lVar1 = *(long *)(unaff_x19 + 0x20);
  if (lVar1 != 0) {
    lVar2 = *(long *)(unaff_x20 + 0x10);
    if (*(long *)(unaff_x19 + 0x18) != lVar2) {
      _memmove(*(long *)(unaff_x20 + 8) + lVar2 * 0x18,
               *(long *)(unaff_x20 + 8) + *(long *)(unaff_x19 + 0x18) * 0x18,lVar1 * 0x18);
    }
    *(long *)(unaff_x20 + 0x10) = lVar2 + lVar1;
  }
  return;
}

