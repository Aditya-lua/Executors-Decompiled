
void FUN_0067f92c(void)

{
  undefined **ppuVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  long *plVar6;
  undefined8 extraout_x8;
  undefined1 uStack0000000000000030;
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
  
  func_0x00087574();
  func_0x00087574(&uStack0000000000000030);
  lVar5 = __Unwind_Resume();
  plVar6 = (long *)(lVar5 + -8);
  uVar4 = (**(code **)(*plVar6 + 0x50))();
  func_0x005fe1e8(apuStack_90,1);
  func_0x00607398(apuStack_60,uVar4,apuStack_90);
  iVar2 = (**(code **)(*plVar6 + 0xb0))(plVar6);
  (**(code **)(*plVar6 + 0xa0))(plVar6);
  iVar3 = func_0x00602288();
  iVar2 = func_0x00692c9c(iVar3 * iVar2);
  func_0x005ffa7c(apuStack_c0,iVar2 << 1);
  iVar2 = func_0x00609ec8(apuStack_c0,apuStack_60);
  ppuVar1 = apuStack_c0;
  if (-1 < iVar2) {
    ppuVar1 = apuStack_60;
  }
  func_0x005fe0b4(extraout_x8,ppuVar1);
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
  return;
}

