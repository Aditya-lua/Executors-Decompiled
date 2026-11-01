
void FUN_001aeba8(undefined8 param_1,undefined8 param_2)

{
  bool in_ZR;
  bool in_CY;
  long in_x10;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  if (in_CY && !in_ZR) {
    func_0x0079b61c();
    in_x10 = *(long *)(unaff_x19 + 8);
    unaff_x21 = *(long *)(unaff_x19 + 0x10);
  }
  _memcpy(in_x10 + unaff_x21,param_2);
  *(long *)(unaff_x19 + 0x10) = unaff_x21 + unaff_x20;
  return;
}

