
void FUN_00651b00(void)

{
  undefined8 uVar1;
  long *plVar2;
  long lVar3;
  ulong uVar4;
  undefined8 *extraout_x8;
  long unaff_x19;
  undefined1 auVar5 [16];
  undefined *apuStack_90 [2];
  ulong uStack_80;
  ulong uStack_78;
  long lStack_70;
  undefined *apuStack_60 [2];
  ulong uStack_50;
  ulong uStack_48;
  long lStack_40;
  
  uVar1 = __Unwind_Resume();
  *(undefined **)(unaff_x19 + 8) = &UNK_009f5d60;
  lVar3 = *(long *)(unaff_x19 + 0x28);
  uVar4 = *(ulong *)(unaff_x19 + 0x18);
  if (*(ulong *)(unaff_x19 + 0x20) <= *(ulong *)(unaff_x19 + 0x18)) {
    uVar4 = *(ulong *)(unaff_x19 + 0x20);
  }
  if (lVar3 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(lVar3 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  __Unwind_Resume(uVar1);
  auVar5 = func_0x0001753c();
  lVar3 = auVar5._8_8_;
  if (*(char *)(lVar3 + 0x68) != '\0') {
    *extraout_x8 = &UNK_00a09a40;
    func_0x005fe0b4(extraout_x8 + 1,lVar3 + 8);
    func_0x005fe0b4(extraout_x8 + 7,lVar3 + 0x38);
    *(undefined1 *)(extraout_x8 + 0xd) = *(undefined1 *)(lVar3 + 0x68);
    return;
  }
  plVar2 = *(long **)(*(long *)(auVar5._0_8_ + 8) + 0x10);
  (**(code **)(*plVar2 + 0xd8))(apuStack_60,plVar2,lVar3 + 8);
  plVar2 = *(long **)(*(long *)(auVar5._0_8_ + 8) + 0x10);
  (**(code **)(*plVar2 + 0xd8))(apuStack_90,plVar2,lVar3 + 0x38);
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

