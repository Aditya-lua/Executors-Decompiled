
void FUN_006a55e0(void)

{
  undefined1 *puVar1;
  ulong uVar2;
  undefined8 extraout_x8;
  undefined8 *unaff_x19;
  long *unaff_x20;
  long unaff_x22;
  long unaff_x24;
  long lVar3;
  long unaff_x29;
  undefined1 auVar4 [16];
  undefined1 auVar5 [12];
  long *in_stack_00000000;
  undefined8 uStack0000000000000030;
  undefined *in_stack_00000038;
  undefined *in_stack_00000040;
  undefined *in_stack_00000048;
  undefined *in_stack_00000050;
  undefined *in_stack_00000058;
  long in_stack_00000060;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000090;
  ulong in_stack_000000a0;
  ulong in_stack_000000a8;
  long in_stack_000000b0;
  undefined8 uStack00000000000000c0;
  undefined *in_stack_000000c8;
  undefined *in_stack_000000d0;
  undefined *in_stack_000000d8;
  undefined *in_stack_000000e0;
  undefined *in_stack_000000e8;
  long in_stack_000000f0;
  ulong in_stack_00000100;
  ulong in_stack_00000108;
  long in_stack_00000110;
  long in_stack_00000120;
  ulong in_stack_00000130;
  ulong in_stack_00000138;
  long in_stack_00000140;
  long in_stack_00000248;
  undefined1 auStack_7ffffffe [2147483502];
  undefined *apuStack_90 [2];
  ulong uStack_80;
  ulong uStack_78;
  long lStack_70;
  undefined *apuStack_60 [2];
  ulong uStack_50;
  ulong uStack_48;
  long lStack_40;
  
  func_0x006aaaf8();
  *unaff_x19 = &UNK_00a19958;
  *(undefined **)(unaff_x24 + 0x10) = &UNK_00a199b0;
  (**(code **)(*unaff_x20 + 0x70))();
  func_0x006aacb8(&uStack00000000000000c0);
  func_0x00093e00(auStack_7ffffffe + 0x8000043e,&uStack00000000000000c0);
  lVar3 = *(long *)(*in_stack_00000000 + -0x18);
  func_0x005edf2c(auStack_7ffffffe + 0x80000236,1);
  puVar1 = auStack_7ffffffe + 0x80000246;
  func_0x006aaaf8(puVar1);
  (**(code **)(in_stack_00000248 + 0x70))(puVar1,(long)in_stack_00000000 + lVar3);
  func_0x006aaef0(&uStack0000000000000030,auStack_7ffffffe + 0x80000236);
  func_0x00093e00(&uStack0000000000000030,auStack_7ffffffe + 0x8000022e);
  uStack0000000000000030 = &UNK_00a191b0;
  in_stack_00000038 = &UNK_00a19248;
  in_stack_00000040 = &UNK_00a192a0;
  in_stack_00000048 = &UNK_00a15e30;
  in_stack_00000050 = &UNK_00a15ec0;
  in_stack_00000058 = &UNK_00a15f90;
  lVar3 = unaff_x22 + 0x10;
  uVar2 = in_stack_000000a0;
  if (in_stack_000000a8 <= in_stack_000000a0) {
    uVar2 = in_stack_000000a8;
  }
  in_stack_00000090 = lVar3;
  if (in_stack_000000b0 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_000000b0 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  uVar2 = in_stack_00000070;
  if (in_stack_00000078 <= in_stack_00000070) {
    uVar2 = in_stack_00000078;
  }
  in_stack_00000060 = lVar3;
  if (in_stack_00000080 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000080 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  func_0x006aa350(puVar1,&UNK_00a16770);
  uStack00000000000000c0 = &UNK_00a19490;
  in_stack_000000c8 = &UNK_00a19580;
  in_stack_000000d0 = &UNK_00a195d8;
  in_stack_000000d8 = &UNK_00a15e30;
  in_stack_000000e0 = &UNK_00a15ec0;
  in_stack_000000e8 = &UNK_00a15f90;
  lVar3 = unaff_x22 + 0x10;
  uVar2 = in_stack_00000130;
  if (in_stack_00000138 <= in_stack_00000130) {
    uVar2 = in_stack_00000138;
  }
  in_stack_00000120 = lVar3;
  if (in_stack_00000140 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000140 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  uVar2 = in_stack_00000100;
  if (in_stack_00000108 <= in_stack_00000100) {
    uVar2 = in_stack_00000108;
  }
  in_stack_000000f0 = lVar3;
  if (in_stack_00000110 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000110 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  func_0x006aa350();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
  auVar5 = ___stack_chk_fail();
  if (auVar5._8_4_ == 0) {
    __Unwind_Resume(auVar5._0_8_);
  }
  auVar4 = func_0x0001753c(auVar5._0_8_);
  func_0x0060a94c(apuStack_90);
  func_0x006095dc(apuStack_60,auVar4._0_8_,apuStack_90);
  func_0x00608730(extraout_x8,apuStack_60,auVar4._8_8_);
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

