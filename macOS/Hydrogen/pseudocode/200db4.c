
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00200db4(void)

{
  undefined8 uVar1;
  long lVar2;
  long unaff_x19;
  undefined8 *unaff_x20;
  long *unaff_x21;
  undefined1 uStack0000000000000008;
  
  uVar1 = _UNK_00826e90;
  unaff_x20[1] = _UNK_00826e98;
  *unaff_x20 = uVar1;
  lVar2 = *unaff_x21;
  *unaff_x21 = lVar2 + -1;
  LORelease();
  if (lVar2 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001fa1d4(&uStack0000000000000008);
  }
  func_0x001f772c();
  func_0x001f8508(unaff_x19 + 0x498);
  if (*(long *)(unaff_x19 + 0x480) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x488),*(long *)(unaff_x19 + 0x480) << 2,2);
  }
  return;
}

