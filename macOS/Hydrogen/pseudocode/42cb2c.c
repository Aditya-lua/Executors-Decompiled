
void FUN_0042cb2c(undefined8 param_1,long *param_2)

{
  long lVar1;
  long unaff_x29;
  
  lVar1 = *param_2;
  *param_2 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x00403ba4(unaff_x29 + -0x40);
  }
  return;
}

