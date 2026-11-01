
undefined1  [16] FUN_005d3d4c(void)

{
  bool in_ZR;
  undefined8 *puVar1;
  undefined1 (*pauVar2) [16];
  undefined8 extraout_x1;
  undefined8 uVar3;
  undefined1 auVar4 [16];
  undefined1 uStack0000000000000020;
  undefined *puStack_a8;
  undefined8 uStack_a0;
  long **pplStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  long *plStack_78;
  undefined *puStack_70;
  long lStack_68;
  undefined8 uStack_60;
  long lStack_50;
  long lStack_48;
  
  if (in_ZR) {
    func_0x005d2b20(&uStack0000000000000020);
  }
  __Unwind_Resume();
  puVar1 = (undefined8 *)func_0x007a2668();
  pauVar2 = (undefined1 (*) [16])(*(code *)*puVar1)(0);
  if (pauVar2 != (undefined1 (*) [16])0x0) {
    *(long *)*pauVar2 = *(long *)*pauVar2 + 1;
    return *pauVar2;
  }
  auVar4 = func_0x007a02f0(&UNK_009f2e68);
  lStack_50 = *(long *)(*auVar4._0_8_ + 8);
  lStack_48 = lStack_50 + *(long *)(*auVar4._0_8_ + 0x10) * 8;
  func_0x005bd894(&lStack_68,&lStack_50,&UNK_008b608c,2);
  puStack_70 = &DAT_005d41a8;
  puStack_a8 = &UNK_009f2ed0;
  uStack_a0 = 2;
  pplStack_98 = &plStack_78;
  uStack_90 = 1;
  uStack_88 = 0;
  plStack_78 = &lStack_68;
  auVar4._0_8_ = func_0x0046849c(*auVar4._8_8_,auVar4._8_8_[1],&puStack_a8);
  uVar3 = 0;
  if (lStack_68 != 0) {
    func_0x00187bd4(uStack_60,lStack_68,1);
    uVar3 = extraout_x1;
  }
  auVar4._8_8_ = uVar3;
  return auVar4;
}

