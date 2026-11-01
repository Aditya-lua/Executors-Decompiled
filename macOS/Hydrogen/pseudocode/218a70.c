
void FUN_00218a70(void)

{
  long lVar1;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 *unaff_x24;
  long unaff_x25;
  long unaff_x26;
  
  do {
    lVar1 = unaff_x24[-1];
    if (lVar1 != unaff_x25 && lVar1 != 0) {
      func_0x00187bd4(*unaff_x24,lVar1,1);
    }
    unaff_x24 = unaff_x24 + 3;
    unaff_x20 = unaff_x20 + -1;
  } while (unaff_x20 != 0);
  *unaff_x19 = unaff_x21;
  unaff_x19[1] = unaff_x22;
  unaff_x19[2] = ((ulong)(unaff_x23 - unaff_x22) >> 3) * unaff_x26;
  return;
}

