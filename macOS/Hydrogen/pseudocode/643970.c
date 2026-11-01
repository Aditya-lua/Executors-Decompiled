
void FUN_00643970(void)

{
  long *plVar1;
  long *plVar2;
  long *plVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long *plVar6;
  undefined1 auVar7 [16];
  undefined1 uStack0000000000000008;
  undefined *puStack_d0;
  undefined *puStack_c8;
  ulong uStack_b8;
  ulong uStack_b0;
  long lStack_a8;
  undefined *puStack_98;
  ulong uStack_88;
  ulong uStack_80;
  long lStack_78;
  undefined *apuStack_60 [2];
  ulong uStack_50;
  ulong uStack_48;
  long lStack_40;
  
  func_0x00633a74(&uStack0000000000000008,&UNK_009fb230);
  auVar7 = __Unwind_Resume();
  plVar6 = auVar7._8_8_;
  plVar1 = auVar7._0_8_;
  plVar2 = (long *)(**(code **)(*plVar1 + 0x10))();
  plVar3 = (long *)(**(code **)(*plVar6 + 0x18))(plVar6);
  plVar3 = (long *)((long)plVar3 + *(long *)(*plVar3 + -0x70));
  (**(code **)(*plVar3 + 0x18))(plVar3,(long)plVar2 + *(long *)(*plVar2 + -0x70));
  uVar4 = (**(code **)(*plVar1 + 0x20))(plVar1);
  uVar5 = (**(code **)(*plVar2 + 0xa0))(plVar2);
  func_0x0060aaf0(apuStack_60,uVar4,uVar5);
  (**(code **)(*plVar2 + 0x78))(&puStack_d0,plVar2,apuStack_60);
  (**(code **)(*plVar6 + 0x28))(plVar6,&puStack_d0);
  puStack_d0 = &UNK_00a09a40;
  puStack_98 = &UNK_009f5d60;
  if (uStack_80 <= uStack_88) {
    uStack_88 = uStack_80;
  }
  if (lStack_78 != 0) {
    if (uStack_88 != 0) {
      do {
        *(undefined8 *)(lStack_78 + -8 + uStack_88 * 8) = 0;
        uStack_88 = uStack_88 - 1;
      } while (uStack_88 != 0);
    }
    func_0x00611644();
  }
  puStack_c8 = &UNK_009f5d60;
  if (uStack_b0 <= uStack_b8) {
    uStack_b8 = uStack_b0;
  }
  if (lStack_a8 != 0) {
    if (uStack_b8 != 0) {
      do {
        *(undefined8 *)(lStack_a8 + -8 + uStack_b8 * 8) = 0;
        uStack_b8 = uStack_b8 - 1;
      } while (uStack_b8 != 0);
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

