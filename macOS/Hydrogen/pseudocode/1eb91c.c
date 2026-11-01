
void FUN_001eb91c(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4,
                 char param_5,undefined8 param_6,undefined8 param_7)

{
  code *pcVar1;
  int iVar2;
  undefined8 *puVar3;
  long unaff_x20;
  undefined8 unaff_x22;
  undefined1 auVar4 [16];
  undefined2 uStack_ea;
  undefined2 *puStack_e8;
  undefined8 uStack_e0;
  undefined *puStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  long lStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined1 uStack_51;
  
  if (*(long *)(unaff_x20 + 8) != 0) {
    param_3 = *(undefined8 *)(unaff_x20 + 0x10);
    func_0x00187bd4();
    unaff_x22 = __Unwind_Resume();
    func_0x001e0d0c();
  }
  __Unwind_Resume(unaff_x22);
  auVar4 = func_0x007a2668();
  puVar3 = auVar4._0_8_;
  uStack_ea = 0x2000;
  func_0x001ebb0c(&lStack_98,auVar4._8_8_);
  uStack_b0 = *(undefined8 *)(&UNK_0081f720 + ((long)param_5 + -3) * 8);
  uStack_b8 = *(undefined8 *)(&UNK_009c4278 + (long)(char)((long)param_5 + -3) * 8);
  puStack_e8 = &uStack_ea;
  uStack_e0 = 2;
  puStack_d8 = &UNK_0081f5b0;
  uStack_d0 = 7;
  uStack_c8 = uStack_90;
  uStack_c0 = uStack_88;
  uStack_78 = 0;
  uStack_80 = 0;
  uStack_68 = 0;
  uStack_70 = 0;
  uStack_a8 = param_6;
  uStack_a0 = param_7;
  iVar2 = (*(code *)param_4[3])(param_3,&puStack_e8,5,&uStack_80,0x20);
  if (iVar2 != 0) {
    func_0x007a2810(&UNK_0082a1b2,0x24,&uStack_51,&UNK_009c9de8,&UNK_009ca5c0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x1ebab4);
    (*pcVar1)();
  }
  puVar3[1] = uStack_78;
  *puVar3 = uStack_80;
  puVar3[3] = uStack_68;
  puVar3[2] = uStack_70;
  if (lStack_98 != 0) {
    func_0x00187bd4(uStack_90,lStack_98,1);
  }
  if ((code *)*param_4 != (code *)0x0) {
    (*(code *)*param_4)(param_3);
  }
  if (param_4[1] != 0) {
    func_0x00187bd4(param_3,param_4[1],param_4[2]);
  }
  return;
}

