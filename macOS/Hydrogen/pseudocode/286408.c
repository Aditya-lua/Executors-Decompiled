
undefined * FUN_00286408(undefined *param_1)

{
  long unaff_x19;
  long unaff_x20;
  long unaff_x29;
  
  *(byte *)(unaff_x19 + 10) = *(byte *)(unaff_x19 + 10) ^ *(byte *)(unaff_x20 + 10);
  *(byte *)(unaff_x19 + 0xb) = *(byte *)(unaff_x19 + 0xb) ^ *(byte *)(unaff_x20 + 0xb);
  *(byte *)(unaff_x19 + 0xf) = *(byte *)(unaff_x19 + 0xf) & 0x7f;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return param_1;
  }
  ___stack_chk_fail();
  return &UNK_009cde48;
}

