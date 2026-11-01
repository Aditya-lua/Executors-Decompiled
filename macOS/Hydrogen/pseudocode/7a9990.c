
undefined8 FUN_007a9990(long param_1)

{
  long lVar1;
  long lVar2;
  undefined8 in_x10;
  long in_x11;
  long unaff_x23;
  
  *(undefined8 *)(in_x11 + 0x10) = in_x10;
  if (unaff_x23 != 0) {
    lVar2 = unaff_x23 * 0x48 + 0x48;
    lVar1 = unaff_x23 + lVar2 + 9;
    if (lVar1 != 0) {
      func_0x00187bd4(param_1 - lVar2,lVar1,8);
    }
  }
  return 0x8000000000000001;
}

