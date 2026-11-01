
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_002b6324(void)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  undefined8 unaff_x19;
  long unaff_x29;
  undefined1 auVar3 [16];
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack00000000000000d0;
  undefined1 auStack_d8 [32];
  long lStack_b8;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  long lStack_28;
  
  uStack0000000000000040 = 0;
  uStack0000000000000048 = 0;
  uStack00000000000000d0 = _UNK_0080be58;
  func_0x002b603c();
  func_0x00300ef8();
  func_0x0036e464();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x18)) {
    return unaff_x19;
  }
  auVar3 = ___stack_chk_fail();
  puVar2 = auVar3._8_8_;
  lStack_28 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_48 = 0;
  uStack_50 = 0;
  uStack_38 = 0;
  uStack_40 = 0;
  uStack_68 = 0;
  uStack_70 = 0;
  uStack_58 = 0;
  uStack_60 = 0;
  uStack_88 = puVar2[1];
  uStack_90 = *puVar2;
  uStack_78 = puVar2[3];
  uStack_80 = puVar2[2];
  if ((bRam0000000000a334f9 & 0x70) == 0) {
    func_0x003af6f0(&uStack_70,&uStack_90);
  }
  else {
    func_0x003be3d8();
  }
  uVar1 = func_0x003af5e8(auVar3._0_8_,&uStack_70);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_28) {
    return uVar1;
  }
  auVar3 = ___stack_chk_fail();
  lStack_b8 = *(long *)PTR____stack_chk_guard_009b01e8;
  func_0x002b0104(auStack_d8,0x20,&UNK_00831b38);
  func_0x002b6198(auVar3._0_8_,auVar3._8_8_,auStack_d8);
  uVar1 = func_0x0036e464(auStack_d8,0x20);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_b8) {
    return uVar1;
  }
  ___stack_chk_fail();
  func_0x002b64bc();
  return 1;
}

