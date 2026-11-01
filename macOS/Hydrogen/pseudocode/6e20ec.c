
void FUN_006e20ec(undefined8 param_1,undefined8 param_2,long param_3)

{
  long unaff_x19;
  
  if ((*(byte *)(param_3 + 1) & 3) == 0) {
    *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
    return;
  }
  func_0x006f0d48();
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
  return;
}

