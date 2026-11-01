
void FUN_006328dc(long param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  long *plVar5;
  undefined8 extraout_x8;
  ulong uVar6;
  ulong in_x9;
  ulong in_x10;
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x29;
  undefined1 auVar7 [16];
  undefined1 uStack0000000000000010;
  undefined *puStack_b8;
  undefined *puStack_b0;
  ulong uStack_a0;
  ulong uStack_98;
  long lStack_90;
  undefined *puStack_80;
  ulong uStack_70;
  ulong uStack_68;
  long lStack_60;
  long lStack_48;
  long lStack_40;
  undefined8 uStack_38;
  
  while (unaff_x21 = (ulong)((int)unaff_x21 + 1), in_x9 < in_x10) {
    param_4 = param_1 + in_x9 * unaff_x22;
    (**(code **)(*unaff_x19 + 0x38))();
    param_1 = *(long *)(unaff_x20 + 0xb0);
    in_x9 = unaff_x21;
    in_x10 = (*(long *)(unaff_x20 + 0xb8) - param_1 >> 4) * unaff_x23;
  }
  func_0x00612b0c(&uStack0000000000000010);
  func_0x006143a8(&uStack0000000000000010);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return;
  }
  ___stack_chk_fail();
  uVar3 = __Unwind_Resume();
  func_0x006143a8(&uStack0000000000000010);
  uVar3 = __Unwind_Resume(uVar3);
  func_0x006143a8(&uStack0000000000000010);
  auVar7 = __Unwind_Resume(uVar3);
  plVar5 = auVar7._8_8_;
  lVar4 = auVar7._0_8_;
  lStack_48 = 0;
  lStack_40 = 0;
  uStack_38 = 0;
  func_0x00632b44(&lStack_48,
                  (*(long *)(lVar4 + 0xb8) - *(long *)(lVar4 + 0xb0) >> 4) * 0x6db6db6db6db6db7);
  func_0x00632c7c(lVar4,plVar5,&lStack_48,param_4);
  uVar3 = (**(code **)(*plVar5 + 0x28))(plVar5);
  func_0x00633274(&puStack_b8,uVar3,lStack_48,lStack_40);
  (**(code **)(*plVar5 + 0x20))(extraout_x8,plVar5,&puStack_b8);
  puStack_b8 = &UNK_00a09a40;
  puStack_80 = &UNK_009f5d60;
  if (uStack_68 <= uStack_70) {
    uStack_70 = uStack_68;
  }
  if (lStack_60 != 0) {
    if (uStack_70 != 0) {
      do {
        *(undefined8 *)(lStack_60 + -8 + uStack_70 * 8) = 0;
        uStack_70 = uStack_70 - 1;
      } while (uStack_70 != 0);
    }
    func_0x00611644();
  }
  puStack_b0 = &UNK_009f5d60;
  if (uStack_98 <= uStack_a0) {
    uStack_a0 = uStack_98;
  }
  if (lStack_90 != 0) {
    if (uStack_a0 != 0) {
      do {
        *(undefined8 *)(lStack_90 + -8 + uStack_a0 * 8) = 0;
        uStack_a0 = uStack_a0 - 1;
      } while (uStack_a0 != 0);
    }
    func_0x00611644();
  }
  lVar2 = lStack_48;
  lVar4 = lStack_40;
  if (lStack_48 != 0) {
    while (lVar4 != lVar2) {
      *(undefined **)(lVar4 + -0x30) = &UNK_009f5d60;
      lVar1 = *(long *)(lVar4 + -0x10);
      uVar6 = *(ulong *)(lVar4 + -0x20);
      if (*(ulong *)(lVar4 + -0x18) <= *(ulong *)(lVar4 + -0x20)) {
        uVar6 = *(ulong *)(lVar4 + -0x18);
      }
      if (lVar1 != 0) {
        if (uVar6 != 0) {
          do {
            *(undefined8 *)(lVar1 + -8 + uVar6 * 8) = 0;
            uVar6 = uVar6 - 1;
          } while (uVar6 != 0);
        }
        func_0x00611644();
      }
      func_0x0064f6d0(lVar4 + -0xa0);
      lVar4 = lVar4 + -0xa0;
    }
    lStack_40 = lVar2;
    __ZdlPv(lStack_48);
  }
  return;
}

