
undefined8 FUN_0004fbe4(double param_1,double param_2)

{
  undefined8 uVar1;
  double unaff_d8;
  double unaff_d9;
  
  uVar1 = _CGEventCreateMouseEvent(unaff_d8 + param_1,unaff_d9 + param_2,0,5,0);
  _CGEventPost(0,uVar1);
  _CFRelease(uVar1);
  _CFRelease();
  return 0;
}

