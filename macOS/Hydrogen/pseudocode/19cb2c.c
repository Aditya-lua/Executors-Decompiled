
undefined1  [16] FUN_0019cb2c(void)

{
  code *pcVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined1 auVar6 [16];
  undefined1 uStack0000000000000008;
  long lStack_40;
  long lStack_38;
  
  func_0x0019fb28(&uStack0000000000000008);
  _CFRelease();
  auVar6 = __Unwind_Resume();
  if ((*(long *)PTR__kSecAttrKeyType_009b02d8 == 0) || (lVar2 = _CFRetain(), lVar2 == 0)) {
    func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c58);
  }
  else {
    lStack_40 = lVar2;
    if ((auVar6._0_8_ != 0) && (lVar3 = _CFRetain(auVar6._0_8_), lVar3 != 0)) {
      lStack_40 = lVar2;
      lStack_38 = lVar3;
      uVar4 = func_0x0018e1ec(&lStack_40,1);
      func_0x0019fb28(&lStack_40);
      func_0x0019fb28(&lStack_38);
      lStack_40 = 0;
      lVar2 = _SecKeyCreateFromData(uVar4,*auVar6._8_8_,&lStack_40);
      if (lVar2 != 0) {
        uVar5 = 0;
code_r0x0019cbf4:
        _CFRelease(uVar4);
        auVar6._8_8_ = lVar2;
        auVar6._0_8_ = uVar5;
        return auVar6;
      }
      if (lStack_40 != 0) {
        uVar5 = 1;
        lVar2 = lStack_40;
        goto code_r0x0019cbf4;
      }
      func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1cd0);
      goto code_r0x0019cc64;
    }
  }
  func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c58);
code_r0x0019cc64:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x19cc68);
  (*pcVar1)();
}

