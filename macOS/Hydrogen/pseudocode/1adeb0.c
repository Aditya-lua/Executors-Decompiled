
void FUN_001adeb0(ulong param_1,undefined8 param_2,undefined8 param_3)

{
  long in_x9;
  long unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  
  if (param_1 < unaff_x21) {
    func_0x0079b61c();
    in_x9 = *(long *)(unaff_x19 + 8);
    unaff_x20 = *(long *)(unaff_x19 + 0x10);
  }
  _memcpy(in_x9 + unaff_x20,param_3);
  *(ulong *)(unaff_x19 + 0x10) = unaff_x20 + unaff_x21;
  return;
}

