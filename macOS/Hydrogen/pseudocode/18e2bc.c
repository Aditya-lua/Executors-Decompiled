
long FUN_0018e2bc(void)

{
  code *pcVar1;
  long lVar2;
  long unaff_x22;
  undefined1 auVar3 [16];
  long lStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  long lStack_58;
  undefined8 uStack_50;
  
  do {
    __Unwind_Resume();
    func_0x00187bd4();
  } while (unaff_x22 == 0);
  func_0x00187bd4();
  auVar3 = __Unwind_Resume();
  func_0x0018d348(&lStack_70,auVar3._0_8_,auVar3._0_8_ + auVar3._8_8_ * 0x10);
  lVar2 = _CFDictionaryCreate(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,uStack_68,uStack_50,
                              uStack_60,PTR__kCFTypeDictionaryKeyCallBacks_009b0260,
                              PTR__kCFTypeDictionaryValueCallBacks_009b0268);
  if (lVar2 == 0) {
    func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c0778);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x18e3ac);
    (*pcVar1)();
  }
  if (lStack_58 != 0) {
    func_0x00187bd4(uStack_50,lStack_58 << 3,8);
  }
  if (lStack_70 != 0) {
    func_0x00187bd4(uStack_68,lStack_70 << 3,8);
  }
  return lVar2;
}

