
void FUN_006e756c(long param_1)

{
  long *unaff_x20;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long in_stack_00000008;
  
  *unaff_x20 = unaff_x26 + (param_1 - unaff_x23);
  unaff_x20[1] = unaff_x26 + unaff_x24;
  unaff_x20[3] = unaff_x25;
  _memcpy();
  *unaff_x20 = *unaff_x20 + in_stack_00000008;
  func_0x006e1d54();
  return;
}

