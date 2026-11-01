
int FUN_0068c640(void)

{
  int iVar1;
  undefined8 uVar2;
  ulong uVar3;
  long lVar4;
  uint uVar5;
  int iVar6;
  long unaff_x29;
  undefined1 auVar7 [16];
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000060;
  undefined1 uStack0000000000000090;
  undefined *apuStack_c0 [2];
  ulong uStack_b0;
  ulong uStack_a8;
  long lStack_a0;
  undefined *apuStack_90 [2];
  ulong uStack_80;
  ulong uStack_78;
  long lStack_70;
  undefined *apuStack_60 [2];
  ulong uStack_50;
  ulong uStack_48;
  long lStack_40;
  
  func_0x00087574(unaff_x29 + -0x70);
  __Unwind_Resume();
  func_0x0001753c();
  uVar2 = func_0x0001753c();
  func_0x00087574(unaff_x29 + -0x70);
  __Unwind_Resume(uVar2);
  uVar2 = func_0x0001753c();
  func_0x00087574(unaff_x29 + -0x70);
  __Unwind_Resume(uVar2);
  func_0x0001753c();
  func_0x0001753c();
  uVar2 = func_0x0001753c();
  func_0x00087574(&uStack0000000000000090);
  func_0x00087574(&uStack0000000000000030);
  func_0x00087574(&uStack0000000000000060);
  func_0x00087574(unaff_x29 + -0x70);
  uVar2 = __Unwind_Resume(uVar2);
  func_0x00087574(unaff_x29 + -0x70);
  uVar2 = __Unwind_Resume(uVar2);
  func_0x00087574(unaff_x29 + -0x70);
  auVar7 = __Unwind_Resume(uVar2);
  func_0x005fe0b4(apuStack_90);
  func_0x0060986c(apuStack_c0,auVar7._0_8_,auVar7._8_8_);
  iVar6 = 1;
  while (uVar3 = func_0x005ffc7c(apuStack_c0), (uVar3 & 1) == 0) {
    uVar5 = 0;
    while (uVar3 = func_0x005ffe3c(apuStack_c0,uVar5), (uVar3 & 1) == 0) {
      uVar5 = uVar5 + 1;
    }
    func_0x006078e0(apuStack_c0,uVar5);
    if (((uVar5 & 1) != 0) &&
       ((lVar4 = func_0x00609cf4(apuStack_90,8), lVar4 == 3 ||
        (lVar4 = func_0x00609cf4(apuStack_90,8), lVar4 == 5)))) {
      iVar6 = -iVar6;
    }
    lVar4 = func_0x00609cf4(apuStack_c0,4);
    iVar1 = iVar6;
    if (lVar4 == 3) {
      lVar4 = func_0x00609cf4(apuStack_90,4);
      iVar1 = -iVar6;
      if (lVar4 != 3) {
        iVar1 = iVar6;
      }
    }
    func_0x00600180(apuStack_c0,apuStack_90);
    func_0x0060986c(apuStack_60,apuStack_c0,apuStack_90);
    func_0x005ffccc(apuStack_c0,apuStack_60);
    apuStack_60[0] = &UNK_009f5d60;
    uVar3 = uStack_50;
    if (uStack_48 <= uStack_50) {
      uVar3 = uStack_48;
    }
    iVar6 = iVar1;
    if (lStack_40 != 0) {
      if (uVar3 != 0) {
        do {
          *(undefined8 *)(lStack_40 + -8 + uVar3 * 8) = 0;
          uVar3 = uVar3 - 1;
        } while (uVar3 != 0);
      }
      func_0x00611644();
    }
  }
  func_0x005fe1e8(apuStack_60,1);
  iVar1 = func_0x00609ec8(apuStack_90,apuStack_60);
  apuStack_60[0] = &UNK_009f5d60;
  if (uStack_48 <= uStack_50) {
    uStack_50 = uStack_48;
  }
  if (lStack_40 != 0) {
    if (uStack_50 != 0) {
      do {
        *(undefined8 *)(lStack_40 + -8 + uStack_50 * 8) = 0;
        uStack_50 = uStack_50 - 1;
      } while (uStack_50 != 0);
    }
    func_0x00611644();
  }
  apuStack_c0[0] = &UNK_009f5d60;
  if (uStack_a8 <= uStack_b0) {
    uStack_b0 = uStack_a8;
  }
  if (lStack_a0 != 0) {
    if (uStack_b0 != 0) {
      do {
        *(undefined8 *)(lStack_a0 + -8 + uStack_b0 * 8) = 0;
        uStack_b0 = uStack_b0 - 1;
      } while (uStack_b0 != 0);
    }
    func_0x00611644();
  }
  apuStack_90[0] = &UNK_009f5d60;
  if (uStack_78 <= uStack_80) {
    uStack_80 = uStack_78;
  }
  if (lStack_70 != 0) {
    if (uStack_80 != 0) {
      do {
        *(undefined8 *)(lStack_70 + -8 + uStack_80 * 8) = 0;
        uStack_80 = uStack_80 - 1;
      } while (uStack_80 != 0);
    }
    func_0x00611644();
  }
  if (iVar1 != 0) {
    iVar6 = 0;
  }
  return iVar6;
}

