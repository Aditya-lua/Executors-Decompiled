
void FUN_00401414(void)

{
  bool in_CY;
  long lVar1;
  long *plVar2;
  undefined8 *in_x12;
  long in_x13;
  long unaff_x20;
  long unaff_x22;
  long unaff_x26;
  
  if (!in_CY) {
    lVar1 = unaff_x22 + 0x45;
    do {
      plVar2 = *(long **)(unaff_x26 + lVar1 * 8);
      *plVar2 = unaff_x26;
      *(short *)(plVar2 + 0x43) = (short)lVar1 + -0x44;
      lVar1 = lVar1 + 1;
    } while (lVar1 - unaff_x20 != 0x46);
  }
  *(long *)(in_x13 + 0x10) = *(long *)(in_x13 + 0x10) + 1;
  *in_x12 = 0x8000000000000001;
  return;
}

