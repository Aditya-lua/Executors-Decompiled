
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0015fce8(void)

{
  undefined8 uVar1;
  ulong uVar2;
  long unaff_x19;
  long unaff_x21;
  long lVar3;
  undefined1 auVar4 [16];
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined *in_stack_00000018;
  undefined *in_stack_00000020;
  
  uVar1 = func_0x007b6360(uRam0000000000a27590);
  *(undefined8 *)(unaff_x21 + 8) = uVar1;
  uVar1 = func_0x007b60c0(uRam0000000000a27590);
  *(undefined8 *)(unaff_x21 + 0x10) = uVar1;
  uVar1 = func_0x007b6580(uRam0000000000a27590);
  *(undefined8 *)(unaff_x21 + 0x18) = uVar1;
  uVar1 = func_0x007b7160(uRam0000000000a27590);
  *(undefined8 *)(unaff_x21 + 0x40) = uVar1;
  uVar1 = func_0x007b70c0(uRam0000000000a27590);
  *(undefined8 *)(unaff_x21 + 0x48) = uVar1;
  uVar2 = _objc_opt_respondsToSelector
                    (uRam0000000000a27590,PTR_s__windowResizeNorthSouthCursor_00a26c08);
  if ((uVar2 & 1) == 0) {
    uVar1 = func_0x007b7300(uRam0000000000a27590);
  }
  else {
    uVar1 = func_0x007b6160();
  }
  *(undefined8 *)(unaff_x21 + 0x20) = uVar1;
  uVar2 = _objc_opt_respondsToSelector
                    (uRam0000000000a27590,PTR_s__windowResizeEastWestCursor_00a26bf8);
  if ((uVar2 & 1) == 0) {
    uVar1 = func_0x007b72e0(uRam0000000000a27590);
  }
  else {
    uVar1 = func_0x007b6120();
  }
  *(undefined8 *)(unaff_x21 + 0x28) = uVar1;
  uVar2 = _objc_opt_respondsToSelector
                    (uRam0000000000a27590,PTR_s__windowResizeNorthEastSouthWestC_00a26c00);
  if ((uVar2 & 1) == 0) {
    uVar1 = func_0x007b6580(uRam0000000000a27590);
  }
  else {
    uVar1 = func_0x007b6140();
  }
  *(undefined8 *)(unaff_x21 + 0x30) = uVar1;
  uVar2 = _objc_opt_respondsToSelector
                    (uRam0000000000a27590,PTR_s__windowResizeNorthWestSouthEastC_00a26c10);
  if ((uVar2 & 1) == 0) {
    uVar1 = func_0x007b6580(uRam0000000000a27590);
  }
  else {
    uVar1 = func_0x007b6180();
  }
  *(undefined8 *)(unaff_x21 + 0x38) = uVar1;
  *(undefined **)(unaff_x19 + 0xa0) = &DAT_001605b4;
  *(undefined **)(unaff_x19 + 0xa8) = &DAT_00160538;
  auVar4 = func_0x007b6800(uRam0000000000a27598);
  func_0x007b6280(auVar4._0_8_,auVar4._8_8_,*(undefined8 *)(unaff_x21 + 0x58),
                  PTR_s_onApplicationBecomeActive__00a274b0,
                  *(undefined8 *)PTR__NSApplicationDidBecomeActiveNotification_009b0008,0);
  auVar4 = func_0x007b6800(uRam0000000000a27598);
  func_0x007b6280(auVar4._0_8_,auVar4._8_8_,*(undefined8 *)(unaff_x21 + 0x58),
                  PTR_s_onApplicationBecomeInactive__00a274b8,
                  *(undefined8 *)PTR__NSApplicationDidResignActiveNotification_009b0010,0);
  _objc_alloc(uRam0000000000a275a0);
  uVar1 = func_0x007b6b40(*(undefined8 *)PTR__NSZeroRect_009b0020,
                          *(undefined8 *)(PTR__NSZeroRect_009b0020 + 8),
                          *(undefined8 *)(PTR__NSZeroRect_009b0020 + 0x10),
                          *(undefined8 *)(PTR__NSZeroRect_009b0020 + 0x18));
  *(undefined8 *)(unaff_x21 + 0x60) = uVar1;
  auVar4 = _objc_alloc(uRam0000000000a275a8);
  uVar1 = func_0x007b6b20(auVar4._0_8_,auVar4._8_8_,*(undefined8 *)(unaff_x21 + 0x60));
  *(undefined8 *)(unaff_x21 + 0x68) = uVar1;
  func_0x007b62a0();
  auVar4 = func_0x000c2db8();
  lVar3 = *(long *)(auVar4._0_8_ + 0x88);
  if (*(long *)(lVar3 + 0x70) == 0) {
    uStack0000000000000008 = PTR___NSConcreteStackBlock_009b0030;
    in_stack_00000010 = _UNK_0080be50;
    in_stack_00000018 = &DAT_001607c8;
    in_stack_00000020 = &UNK_009bd868;
    uVar1 = func_0x007b6240(uRam0000000000a275b0,auVar4._8_8_,0xe401cfe,&uStack0000000000000008);
    *(undefined8 *)(lVar3 + 0x70) = uVar1;
  }
  *(undefined **)(unaff_x19 + 0xb8) = &DAT_0016074c;
  return 1;
}

