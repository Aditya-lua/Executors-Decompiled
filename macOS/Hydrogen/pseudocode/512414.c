
void FUN_00512414(undefined8 param_1,undefined8 param_2)

{
  long unaff_x19;
  long unaff_x20;
  long lVar1;
  
  func_0x007a5594();
  lVar1 = *(long *)(unaff_x19 + 0x10);
  _memcpy(*(long *)(unaff_x19 + 8) + lVar1,param_2);
  *(long *)(unaff_x19 + 0x10) = lVar1 + unaff_x20;
  return;
}

