
void FUN_001891d8(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  long *plVar2;
  undefined8 *unaff_x19;
  
  func_0x00187bd4(param_1,param_2,1);
  lVar1 = *(long *)*unaff_x19;
  *(long *)*unaff_x19 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9f08();
  }
  plVar2 = (long *)unaff_x19[1];
  lVar1 = *plVar2;
  *plVar2 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9964(unaff_x19 + 1);
  }
  return;
}

