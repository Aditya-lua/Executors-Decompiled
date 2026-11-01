
undefined8 FUN_0019e144(void)

{
  code *pcVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined1 auVar5 [16];
  undefined1 auStack_48 [16];
  long lStack_38;
  undefined8 uStack_30;
  long lStack_28;
  
  auVar5 = __Unwind_Resume();
  func_0x00469240(auStack_48,auVar5._8_8_,&UNK_0081ccd0,7);
  uVar4 = *auVar5._0_8_;
  lVar2 = _CFErrorGetDomain(uVar4);
  if ((lVar2 == 0) || (lVar2 = _CFRetain(), lVar2 == 0)) {
    func_0x007a11c0(&UNK_0081cb73,0x22,&UNK_009c2050);
  }
  else {
    lStack_38 = lVar2;
    uVar3 = func_0x004653b0(auStack_48,&UNK_0081ccd7,6,&lStack_38,&UNK_009c2098);
    uStack_30 = _CFErrorGetCode(uVar4);
    uVar3 = func_0x004653b0(uVar3,&UNK_0081c058,4,&uStack_30,&UNK_009c20b8);
    lStack_28 = _CFErrorCopyDescription(uVar4);
    if (lStack_28 != 0) {
      func_0x004653b0(uVar3,&UNK_0081ccdd,0xb,&lStack_28,&UNK_009c2098);
      uVar4 = func_0x00465628();
      _CFRelease(lStack_28);
      _CFRelease(lStack_38);
      return uVar4;
    }
  }
  func_0x007a11c0(&UNK_0081cb73,0x22,&UNK_009c2050);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x19e278);
  (*pcVar1)();
}

