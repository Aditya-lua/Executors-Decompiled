
void FUN_006ef224(long param_1)

{
  undefined4 in_w8;
  long unaff_x19;
  long unaff_x21;
  
  *(undefined4 *)(unaff_x19 + 0x4c) = in_w8;
  *(long *)(unaff_x19 + 0x20) = param_1 + (*(long *)(unaff_x19 + 0x20) - unaff_x21);
  *(undefined **)(unaff_x19 + 0x38) = &UNK_000c34d8 + param_1;
  *(long *)(unaff_x19 + 0x40) = param_1;
  return;
}

