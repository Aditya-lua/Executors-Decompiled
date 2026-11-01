
void FUN_00651aec(void)

{
  long lVar1;
  undefined8 uVar2;
  long *plVar3;
  long lVar4;
  ulong uVar5;
  undefined8 *extraout_x8;
  undefined1 auVar6 [16];
  undefined1 uStack0000000000000030;
  undefined *apuStack_90 [2];
  ulong uStack_80;
  ulong uStack_78;
  long lStack_70;
  undefined *apuStack_60 [2];
  ulong uStack_50;
  ulong uStack_48;
  long lStack_40;
  
  lVar1 = __Unwind_Resume();
  func_0x00087574(&uStack0000000000000030);
  uVar2 = __Unwind_Resume(lVar1);
  *(undefined **)(lVar1 + 8) = &UNK_009f5d60;
  lVar4 = *(long *)(lVar1 + 0x28);
  uVar5 = *(ulong *)(lVar1 + 0x18);
  if (*(ulong *)(lVar1 + 0x20) <= *(ulong *)(lVar1 + 0x18)) {
    uVar5 = *(ulong *)(lVar1 + 0x20);
  }
  if (lVar4 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(lVar4 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  __Unwind_Resume(uVar2);
  auVar6 = func_0x0001753c();
  lVar4 = auVar6._8_8_;
  if (*(char *)(lVar4 + 0x68) != '\0') {
    *extraout_x8 = &UNK_00a09a40;
    func_0x005fe0b4(extraout_x8 + 1,lVar4 + 8);
    func_0x005fe0b4(extraout_x8 + 7,lVar4 + 0x38);
    *(undefined1 *)(extraout_x8 + 0xd) = *(undefined1 *)(lVar4 + 0x68);
    return;
  }
  plVar3 = *(long **)(*(long *)(auVar6._0_8_ + 8) + 0x10);
  (**(code **)(*plVar3 + 0xd8))(apuStack_60,plVar3,lVar4 + 8);
  plVar3 = *(long **)(*(long *)(auVar6._0_8_ + 8) + 0x10);
  (**(code **)(*plVar3 + 0xd8))(apuStack_90,plVar3,lVar4 + 0x38);
  *extraout_x8 = &UNK_00a09a40;
  func_0x005fe0b4(extraout_x8 + 1,apuStack_60);
  func_0x005fe0b4(extraout_x8 + 7,apuStack_90);
  *(undefined1 *)(extraout_x8 + 0xd) = 0;
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
  return;
}

