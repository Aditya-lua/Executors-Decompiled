
undefined8 FUN_007a531c(void)

{
  long lVar1;
  long lVar2;
  undefined8 in_x9;
  long lVar3;
  long in_x10;
  undefined8 *in_x11;
  undefined8 unaff_x19;
  long unaff_x22;
  long unaff_x23;
  long *unaff_x25;
  
  lVar2 = *unaff_x25;
  *in_x11 = unaff_x19;
  in_x11[1] = in_x9;
  in_x11[2] = in_x10 - unaff_x23;
  in_x11[3] = unaff_x23;
  if (unaff_x22 != 0) {
    lVar3 = unaff_x22 * 0x18 + 0x18;
    lVar1 = unaff_x22 + lVar3 + 9;
    if (lVar1 != 0) {
      func_0x00187bd4(lVar2 - lVar3,lVar1,8);
    }
  }
  return 0x8000000000000001;
}

