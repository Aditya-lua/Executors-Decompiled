
void FUN_006ae75c(long param_1)

{
  int iVar1;
  long *unaff_x21;
  long unaff_x22;
  
  iVar1 = (**(code **)(param_1 + 0x50))();
  *(byte *)(unaff_x22 + (ulong)(iVar1 - 1)) = *(byte *)(unaff_x22 + (ulong)(iVar1 - 1)) ^ 0x80;
  func_0x00684488(unaff_x21[0x1d]);
  _memcpy();
                    /* WARNING: Could not recover jumptable at 0x006ae7a8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*unaff_x21 + 0x40))();
  return;
}

