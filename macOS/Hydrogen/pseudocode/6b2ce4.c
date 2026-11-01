
int FUN_006b2ce4(long param_1)

{
  undefined4 in_w9;
  undefined1 in_w10;
  long unaff_x19;
  
  *(undefined1 *)(param_1 + 0x1c) = in_w10;
  *(undefined4 *)(param_1 + 0x18) = in_w9;
  *(long *)(unaff_x19 + 0x228) = param_1 + 0x20;
  return (int)((ulong)((param_1 + 0x20) - *(long *)(unaff_x19 + 0x220)) >> 5) + -1;
}

