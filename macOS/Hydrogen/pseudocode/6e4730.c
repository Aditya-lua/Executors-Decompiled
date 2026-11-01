
void FUN_006e4730(long param_1)

{
  long unaff_x19;
  long *unaff_x21;
  
  if (((*(byte *)(*unaff_x21 + 1) >> 2 & 1) != 0) &&
     ((*(byte *)(*(long *)(param_1 + -0x10) + 1) & 3) != 0)) {
    func_0x006f0ea0();
    param_1 = *(long *)(unaff_x19 + 8);
  }
  *(long *)(unaff_x19 + 8) = param_1 + -0x10;
  return;
}

