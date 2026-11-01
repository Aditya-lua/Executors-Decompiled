
undefined8 FUN_007aafb0(long param_1)

{
  long lVar1;
  undefined8 in_x9;
  long lVar2;
  long in_x10;
  undefined8 *in_x11;
  undefined8 unaff_x19;
  long unaff_x22;
  long unaff_x23;
  
  *in_x11 = unaff_x19;
  in_x11[1] = in_x9;
  in_x11[2] = in_x10 - unaff_x22;
  if (unaff_x23 != 0) {
    lVar2 = unaff_x23 * 200 + 200;
    lVar1 = unaff_x23 + lVar2 + 9;
    if (lVar1 != 0) {
      func_0x00187bd4(param_1 - lVar2,lVar1,8);
    }
  }
  return 0x8000000000000001;
}

