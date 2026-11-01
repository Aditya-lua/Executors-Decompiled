
void FUN_00252670(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,ulong param_6)

{
  code *pcVar1;
  undefined8 uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  ulong *extraout_x8;
  long lVar5;
  long unaff_x20;
  undefined1 auVar6 [16];
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined1 auStack_98 [64];
  ulong uStack_58;
  undefined8 uStack_50;
  ulong uStack_48;
  
  uVar2 = func_0x007a28b0(param_2,0x40,param_1);
  if (*(long *)(unaff_x20 + 8) != 0) {
    func_0x00187bd4();
    uVar2 = __Unwind_Resume(uVar2);
    func_0x00246df4();
  }
  __Unwind_Resume(uVar2);
  auVar6 = func_0x007a2668();
  uStack_b8 = 0;
  uStack_c0 = 0;
  uStack_a8 = 0;
  uStack_b0 = 0;
  uStack_d8 = 0;
  uStack_e0 = 0;
  uStack_c8 = 0;
  uStack_d0 = 0;
  uVar2 = *auVar6._0_8_;
  lVar5 = auVar6._0_8_[1];
  puVar4 = (undefined8 *)auVar6._8_8_;
  if (auVar6._8_8_ == (undefined1 *)0x0) {
    uVar3 = (**(code **)(lVar5 + 0x20))(uVar2);
    if (uVar3 < 0x41) {
      puVar4 = &uStack_e0;
      goto LAB_00252718;
    }
    func_0x007a28b0(uVar3,0x40,&UNK_009ca5a8);
    uStack_58 = param_6;
  }
  else {
LAB_00252718:
    auVar6 = (**(code **)(lVar5 + 0x18))(uVar2,puVar4);
    puVar4 = auVar6._8_8_;
    uVar2 = auVar6._0_8_;
    uStack_50 = param_5;
    uStack_48 = param_6;
    (*(code *)puVar4[3])(auStack_98,uVar2,&uStack_50,1);
    if (0x40 < uStack_58) {
      func_0x007a28b0(uStack_58,0x40,&UNK_009c9cd0);
      goto LAB_00252818;
    }
    if (uStack_58 == 0) {
      uVar3 = 1;
LAB_00252778:
      _memcpy(uVar3,auStack_98,uStack_58);
      *extraout_x8 = uStack_58;
      extraout_x8[1] = uVar3;
      extraout_x8[2] = uStack_58;
      func_0x00240a1c(auStack_98);
      if ((code *)*puVar4 != (code *)0x0) {
        (*(code *)*puVar4)(uVar2);
      }
      if (puVar4[1] != 0) {
        func_0x00187bd4(uVar2,puVar4[1],puVar4[2]);
      }
      return;
    }
    uVar3 = func_0x00187bd0(uStack_58,1);
    if (uVar3 != 0) goto LAB_00252778;
  }
  func_0x007a1f00(1,uStack_58,&UNK_009c9ec0);
LAB_00252818:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x25281c);
  (*pcVar1)();
}

