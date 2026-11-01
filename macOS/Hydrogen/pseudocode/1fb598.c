
undefined8 FUN_001fb598(void)

{
  long lVar1;
  long *plVar2;
  long *unaff_x19;
  uint unaff_w22;
  long *unaff_x24;
  long *unaff_x27;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000040;
  undefined1 uStack0000000000000048;
  
  func_0x0016b01c(&uStack0000000000000048);
  lVar1 = *unaff_x27;
  *unaff_x27 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9f08(&uStack0000000000000040);
  }
  lVar1 = *unaff_x24;
  *unaff_x24 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9964(&uStack0000000000000030);
  }
  lVar1 = *(long *)unaff_x19[0x10];
  *(long *)unaff_x19[0x10] = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9964();
  }
  if (*unaff_x19 != -0x7ffffffffffffffe) {
    func_0x0016d960();
  }
  if ((unaff_w22 & 1) != 0) {
    plVar2 = (long *)unaff_x19[0x15];
    lVar1 = *plVar2;
    *plVar2 = lVar1 + -1;
    LORelease();
    if (lVar1 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001f9964(unaff_x19 + 0x15);
    }
  }
  __Unwind_Resume();
  func_0x007a2668();
  func_0x007a2668();
  return 0;
}

