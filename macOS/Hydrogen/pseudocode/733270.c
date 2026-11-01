
void FUN_00733270(long param_1)

{
  long in_x9;
  long unaff_x19;
  long unaff_x20;
  
  *(long *)(unaff_x20 + 0x30) = param_1;
  *(long *)(unaff_x19 + 0x30) = in_x9 + 1;
  *(long *)(unaff_x19 + 0x38) = param_1 + 1;
  *(byte *)(unaff_x19 + 0x98) = *(byte *)(unaff_x19 + 0x98) & 0xfe;
  if ((*(long *)(unaff_x19 + 0x88) == 0) ||
     ((*(byte *)(*(long *)(unaff_x19 + 0x88) + 4) >> 5 & 1) == 0)) {
    return;
  }
  func_0x00779d40(*(undefined8 *)(unaff_x19 + 0x78),5);
  return;
}

