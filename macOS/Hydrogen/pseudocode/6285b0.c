
void FUN_006285b0(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined **ppuVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  ulong uVar4;
  long lVar5;
  undefined8 extraout_x8;
  ulong uVar6;
  long unaff_x29;
  undefined1 auVar7 [16];
  undefined1 uStack0000000000000078;
  undefined1 uStack0000000000000098;
  undefined *apuStack_a0 [2];
  ulong uStack_90;
  ulong uStack_88;
  long lStack_80;
  int iStack_78;
  undefined *apuStack_70 [2];
  ulong uStack_60;
  ulong uStack_58;
  long lStack_50;
  
  uVar3 = func_0x0001753c();
  func_0x00087574();
  func_0x0003e9ec(&uStack0000000000000078);
  func_0x0003e9ec(&uStack0000000000000098);
  func_0x0003e9ec(unaff_x29 + -0x98);
  func_0x0003e9ec(unaff_x29 + -0x78);
  auVar7 = __Unwind_Resume(uVar3);
  lVar5 = auVar7._8_8_;
  uVar4 = func_0x00602288(param_3);
  func_0x005fef78(apuStack_70,*(undefined8 *)(lVar5 + 0x18),*(undefined8 *)(lVar5 + 0x10),0,1);
  uVar6 = *(long *)(lVar5 + 0x10) * 8;
  lVar5 = uVar6 - (uVar4 & 0xffffffff);
  if ((uVar4 & 0xffffffff) <= uVar6 && lVar5 != 0) {
    func_0x006078e0(apuStack_70,lVar5);
  }
  func_0x00607398(apuStack_a0,apuStack_70,param_3);
  uVar2 = func_0x005fe4e8(param_3);
  ppuVar1 = apuStack_70;
  if (iStack_78 != 1) {
    ppuVar1 = apuStack_a0;
  }
  func_0x00628898(extraout_x8,auVar7._0_8_,ppuVar1,uVar2);
  apuStack_a0[0] = &UNK_009f5d60;
  if (uStack_88 <= uStack_90) {
    uStack_90 = uStack_88;
  }
  if (lStack_80 != 0) {
    if (uStack_90 != 0) {
      do {
        *(undefined8 *)(lStack_80 + -8 + uStack_90 * 8) = 0;
        uStack_90 = uStack_90 - 1;
      } while (uStack_90 != 0);
    }
    func_0x00611644();
  }
  apuStack_70[0] = &UNK_009f5d60;
  if (uStack_58 <= uStack_60) {
    uStack_60 = uStack_58;
  }
  if (lStack_50 != 0) {
    if (uStack_60 != 0) {
      do {
        *(undefined8 *)(lStack_50 + -8 + uStack_60 * 8) = 0;
        uStack_60 = uStack_60 - 1;
      } while (uStack_60 != 0);
    }
    func_0x00611644();
  }
  return;
}

