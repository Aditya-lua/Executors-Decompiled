
void FUN_006e2084(long param_1,undefined8 param_2,long param_3)

{
  int in_w9;
  long unaff_x19;
  
  if ((4 < in_w9) && ((*(byte *)(param_3 + 1) >> 2 & 1) != 0)) {
    if ((*(byte *)(*(long *)(param_1 + -0x10) + 1) & 3) != 0) {
      func_0x006f0d48();
      *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
      return;
    }
  }
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
  return;
}

