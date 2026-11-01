
void FUN_001ea9cc(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined8 in_x4;
  undefined8 in_x5;
  undefined1 auVar7 [16];
  undefined8 in_stack_00000008;
  undefined2 uStack_116;
  undefined4 uStack_114;
  undefined2 uStack_10a;
  undefined2 *puStack_108;
  undefined8 uStack_100;
  undefined *puStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined *puStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  long lStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined1 uStack_51;
  
  uVar3 = __Unwind_Resume();
  func_0x002d8de8(in_stack_00000008);
  auVar7 = __Unwind_Resume(uVar3);
  lVar5 = auVar7._8_8_;
  puVar4 = auVar7._0_8_;
  uStack_114 = *(undefined4 *)(lVar5 + 0x28);
  uStack_116 = 4;
  auVar7 = FUN_001eb41c(*(undefined8 *)(lVar5 + 0x18),*(undefined8 *)(lVar5 + 0x20),&uStack_116,0);
  puVar6 = auVar7._8_8_;
  uVar3 = auVar7._0_8_;
  uStack_10a = 0x4000;
  func_0x001ebb0c(&lStack_b8,&uStack_116);
  puStack_108 = &uStack_10a;
  uStack_100 = 2;
  puStack_f8 = &UNK_0081f5b0;
  uStack_f0 = 7;
  uStack_e8 = uStack_b0;
  uStack_e0 = uStack_a8;
  puStack_d8 = &UNK_0081f5e5;
  uStack_d0 = 0xd;
  uStack_78 = 0;
  uStack_80 = 0;
  uStack_68 = 0;
  uStack_70 = 0;
  uStack_88 = 0;
  uStack_90 = 0;
  uStack_98 = 0;
  uStack_a0 = 0;
  uStack_c8 = in_x4;
  uStack_c0 = in_x5;
  iVar2 = (*(code *)puVar6[3])(uVar3,&puStack_108,5,&uStack_a0,0x40);
  if (iVar2 != 0) {
    func_0x007a2810(&UNK_0082a1b2,0x24,&uStack_51,&UNK_009c9de8,&UNK_009ca5c0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x1eab50);
    (*pcVar1)();
  }
  puVar4[1] = uStack_98;
  *puVar4 = uStack_a0;
  puVar4[3] = uStack_88;
  puVar4[2] = uStack_90;
  puVar4[5] = uStack_78;
  puVar4[4] = uStack_80;
  puVar4[7] = uStack_68;
  puVar4[6] = uStack_70;
  if (lStack_b8 != 0) {
    func_0x00187bd4(uStack_b0,lStack_b8,1);
  }
  if ((code *)*puVar6 != (code *)0x0) {
    (*(code *)*puVar6)(uVar3);
  }
  if (puVar6[1] != 0) {
    func_0x00187bd4(uVar3,puVar6[1],puVar6[2]);
  }
  return;
}

