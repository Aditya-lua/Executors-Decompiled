
void FUN_001bddb8(undefined8 param_1,undefined8 param_2)

{
  long *unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  
  if ((ulong)(*unaff_x19 - unaff_x21) < unaff_x20) {
    func_0x0079b61c();
    unaff_x21 = unaff_x19[2];
  }
  _memcpy(unaff_x19[1] + unaff_x21,param_2);
  unaff_x19[2] = unaff_x21 + unaff_x20;
  return;
}

