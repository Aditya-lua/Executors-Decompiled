
undefined8 FUN_006f2b24(double param_1)

{
  int unaff_w20;
  int unaff_w21;
  double unaff_d8;
  double dVar1;
  
  while( true ) {
    dVar1 = param_1;
    if (unaff_d8 <= param_1) {
      dVar1 = unaff_d8;
    }
    if (unaff_w20 == unaff_w21) break;
    unaff_w21 = unaff_w21 + 1;
    param_1 = (double)func_0x006e6a4c();
    unaff_d8 = dVar1;
  }
  func_0x006e3850(dVar1);
  return 1;
}

