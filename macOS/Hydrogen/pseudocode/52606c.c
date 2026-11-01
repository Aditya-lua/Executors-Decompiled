
void FUN_0052606c(void)

{
  code *pcVar1;
  long lVar2;
  long lVar3;
  long *unaff_x19;
  undefined8 uVar4;
  undefined1 auVar5 [16];
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  func_0x00526280();
  auVar5 = func_0x004af770(in_stack_00000010,in_stack_00000018);
  lVar3 = auVar5._8_8_;
  if (lVar3 < 0) {
    uVar4 = 0;
LAB_0052612c:
    func_0x007a1f00(uVar4,lVar3,&UNK_009e95a8);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x526144);
    (*pcVar1)();
  }
  if (lVar3 == 0) {
    lVar2 = 1;
    _memcpy(1,auVar5._0_8_,0);
  }
  else {
    uVar4 = 1;
    lVar2 = func_0x00187bd0(lVar3,1);
    if (lVar2 == 0) goto LAB_0052612c;
    _memcpy(lVar2,auVar5._0_8_,lVar3);
  }
  if (in_stack_00000008 != 0) {
    func_0x00187bd4(in_stack_00000010,in_stack_00000008,1);
  }
  unaff_x19[2] = lVar3;
  unaff_x19[1] = lVar2;
  *unaff_x19 = lVar3;
  return;
}

