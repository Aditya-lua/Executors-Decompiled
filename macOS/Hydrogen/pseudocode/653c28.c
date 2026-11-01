
long * FUN_00653c28(undefined8 param_1,undefined8 param_2,int param_3,undefined8 param_4)

{
  long *plVar1;
  undefined8 *puVar2;
  long lVar3;
  ulong uVar4;
  long unaff_x19;
  undefined1 auVar5 [16];
  undefined1 auStack_80 [8];
  long lStack_78;
  undefined8 uStack_70;
  ulong uStack_60;
  ulong uStack_58;
  long lStack_50;
  undefined *puStack_48;
  long *plStack_40;
  
  *(undefined **)(unaff_x19 + 0x48) = &UNK_009f5d60;
  lVar3 = *(long *)(unaff_x19 + 0x68);
  uVar4 = *(ulong *)(unaff_x19 + 0x58);
  if (*(ulong *)(unaff_x19 + 0x60) <= *(ulong *)(unaff_x19 + 0x58)) {
    uVar4 = *(ulong *)(unaff_x19 + 0x60);
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
  *(undefined **)(unaff_x19 + 0x18) = &UNK_009f5d60;
  lVar3 = *(long *)(unaff_x19 + 0x38);
  uVar4 = *(ulong *)(unaff_x19 + 0x28);
  if (*(ulong *)(unaff_x19 + 0x30) <= *(ulong *)(unaff_x19 + 0x28)) {
    uVar4 = *(ulong *)(unaff_x19 + 0x30);
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
  __Unwind_Resume(param_1);
  auVar5 = func_0x0001753c();
  lVar3 = auVar5._8_8_;
  plVar1 = auVar5._0_8_;
  puVar2 = (undefined8 *)func_0x0066a6b0(plVar1,0);
  *puVar2 = &UNK_00a0eb18;
  puVar2[1] = &UNK_00a0ece0;
  func_0x0066a7f0(puVar2,param_4);
  *plVar1 = (long)&UNK_009b3970;
  plVar1[1] = (long)&UNK_009b3b38;
  func_0x0003fb68(plVar1 + 6,0);
  *plVar1 = (long)&UNK_009b3748;
  plVar1[1] = (long)&UNK_009b3910;
  uStack_58 = 0;
  lStack_50 = 0;
  uStack_60 = 0xffffffffffffffff;
  if (lVar3 == 0) {
    uStack_70 = 0;
  }
  else {
    uStack_70 = _strlen(lVar3);
  }
  auStack_80[0] = 0;
  lStack_78 = lVar3;
  func_0x0003f610(&puStack_48,"InputBuffer",auStack_80,1);
  (**(code **)(*plVar1 + 0x58))(plVar1,&puStack_48);
  if (param_3 != 0) {
    (**(code **)(*plVar1 + 0x1a8))(plVar1,1);
  }
  puStack_48 = &UNK_009f6820;
  if (plStack_40 != (long *)0x0) {
    (**(code **)(*plStack_40 + 8))();
  }
  uVar4 = uStack_60;
  if (uStack_58 <= uStack_60) {
    uVar4 = uStack_58;
  }
  if (lStack_50 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined1 *)(lStack_50 + -1 + uVar4) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  return plVar1;
}

