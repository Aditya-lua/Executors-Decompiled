
void FUN_006e4904(long param_1,undefined8 param_2,long param_3)

{
  long unaff_x19;
  
  if (((*(byte *)(param_3 + 1) >> 2 & 1) != 0) &&
     ((*(byte *)(*(long *)(param_1 + -0x10) + 1) & 3) != 0)) {
    func_0x006f0ea0();
    param_1 = *(long *)(unaff_x19 + 8);
  }
  *(long *)(unaff_x19 + 8) = param_1 + -0x10;
  return;
}

