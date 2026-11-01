
void FUN_001b6570(ulong param_1,undefined8 param_2,undefined8 param_3)

{
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  
  if (param_1 < unaff_x20) {
    func_0x0079b61c();
    unaff_x21 = *(long *)(unaff_x19 + 0x10);
  }
  _memcpy(*(long *)(unaff_x19 + 8) + unaff_x21,param_3);
  *(ulong *)(unaff_x19 + 0x10) = unaff_x21 + unaff_x20;
  return;
}

