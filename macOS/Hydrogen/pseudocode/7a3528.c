
undefined8 FUN_007a3528(undefined8 param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long in_x10;
  undefined8 *in_x11;
  undefined8 unaff_x19;
  long unaff_x22;
  long unaff_x23;
  long *unaff_x25;
  
  lVar3 = *unaff_x25;
  *in_x11 = unaff_x19;
  in_x11[1] = param_1;
  in_x11[2] = in_x10 - unaff_x22;
  if (unaff_x23 != 0) {
    lVar2 = unaff_x23 * 0x20 + 0x20;
    lVar1 = unaff_x23 + lVar2 + 9;
    if (lVar1 != 0) {
      func_0x00187bd4(lVar3 - lVar2,lVar1,8);
    }
  }
  return 0x8000000000000001;
}

