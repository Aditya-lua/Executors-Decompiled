
void FUN_001eab54(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined8 in_x4;
  undefined8 in_x5;
  long unaff_x20;
  undefined8 unaff_x21;
  undefined1 auVar7 [16];
  undefined2 uStack_106;
  undefined4 uStack_104;
  undefined2 uStack_fa;
  undefined2 *puStack_f8;
  undefined8 uStack_f0;
  undefined *puStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined *puStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  long lStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined1 uStack_51;
  
  if (*(long *)(unaff_x20 + 8) != 0) {
    func_0x00187bd4();
    unaff_x21 = __Unwind_Resume();
    func_0x001e0d0c();
  }
  __Unwind_Resume(unaff_x21);
  auVar7 = func_0x007a2668();
  lVar5 = auVar7._8_8_;
  puVar3 = auVar7._0_8_;
  uStack_104 = *(undefined4 *)(lVar5 + 0x28);
  uStack_106 = 4;
  auVar7 = FUN_001eb41c(*(undefined8 *)(lVar5 + 0x18),*(undefined8 *)(lVar5 + 0x20),&uStack_106,0);
  puVar6 = auVar7._8_8_;
  uVar4 = auVar7._0_8_;
  uStack_fa = 0x3000;
  func_0x001ebb0c(&lStack_a8,&uStack_106);
  puStack_f8 = &uStack_fa;
  uStack_f0 = 2;
  puStack_e8 = &UNK_0081f5b0;
  uStack_e0 = 7;
  uStack_d8 = uStack_a0;
  uStack_d0 = uStack_98;
  puStack_c8 = &UNK_0081f5e5;
  uStack_c0 = 0xd;
  uStack_78 = 0;
  uStack_80 = 0;
  uStack_68 = 0;
  uStack_70 = 0;
  uStack_88 = 0;
  uStack_90 = 0;
  uStack_b8 = in_x4;
  uStack_b0 = in_x5;
  iVar2 = (*(code *)puVar6[3])(uVar4,&puStack_f8,5,&uStack_90,0x30);
  if (iVar2 != 0) {
    func_0x007a2810(&UNK_0082a1b2,0x24,&uStack_51,&UNK_009c9de8,&UNK_009ca5c0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x1ead0c);
    (*pcVar1)();
  }
  puVar3[1] = uStack_88;
  *puVar3 = uStack_90;
  puVar3[3] = uStack_78;
  puVar3[2] = uStack_80;
  puVar3[5] = uStack_68;
  puVar3[4] = uStack_70;
  if (lStack_a8 != 0) {
    func_0x00187bd4(uStack_a0,lStack_a8,1);
  }
  if ((code *)*puVar6 != (code *)0x0) {
    (*(code *)*puVar6)(uVar4);
  }
  if (puVar6[1] != 0) {
    func_0x00187bd4(uVar4,puVar6[1],puVar6[2]);
  }
  return;
}

