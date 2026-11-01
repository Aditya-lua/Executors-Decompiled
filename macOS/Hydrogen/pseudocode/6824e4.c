
long FUN_006824e4(long param_1,int param_2)

{
  long lVar1;
  uint in_w9;
  uint in_w10;
  ulong *unaff_x19;
  
  *unaff_x19 = (ulong)(param_2 - (in_w10 & in_w9));
  lVar1 = (**(code **)(param_1 + 0xd8))();
  return lVar1 + (ulong)(in_w10 & in_w9);
}

