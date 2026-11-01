
void FUN_00431514(undefined8 param_1)

{
  long lVar1;
  undefined8 *unaff_x19;
  undefined8 uStack0000000000000008;
  
  unaff_x19[1] = 0;
  unaff_x19[2] = param_1;
  *unaff_x19 = 1;
  lVar1 = *uStack0000000000000008;
  *uStack0000000000000008 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x004037b4(&uStack0000000000000008);
  }
  return;
}

