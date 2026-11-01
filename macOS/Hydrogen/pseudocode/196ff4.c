
undefined8 FUN_00196ff4(undefined8 param_1,undefined8 param_2)

{
  bool in_ZR;
  bool in_CY;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  if (in_CY && !in_ZR) {
    func_0x0079ab9c();
    unaff_x21 = *(long *)(unaff_x20 + 0x10);
  }
  _memcpy(*(long *)(unaff_x20 + 8) + unaff_x21,param_2);
  *(long *)(unaff_x20 + 0x10) = unaff_x21 + unaff_x19;
  return 0;
}

