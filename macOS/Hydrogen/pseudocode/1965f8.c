
void FUN_001965f8(void)

{
  long *plVar1;
  code *pcVar2;
  long *plVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  undefined1 auVar7 [16];
  undefined1 uStack0000000000000028;
  undefined4 uStack_44;
  long lStack_40;
  long lStack_38;
  
  func_0x00194830(&uStack0000000000000028);
  __Unwind_Resume();
  auVar7 = func_0x007a2668();
  plVar3 = auVar7._0_8_;
  if ((*(long *)PTR__kSecAttrAccessControl_009b0278 == 0) || (lVar4 = _CFRetain(), lVar4 == 0)) {
    func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
  }
  else {
    lStack_40 = lVar4;
    lVar5 = _SecAccessControlCreateWithFlags
                      (*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,0,auVar7._8_8_,0);
    if (lVar5 != 0) {
      lVar6 = plVar3[2];
      if (lVar6 == *plVar3) {
        lStack_40 = lVar4;
        lStack_38 = lVar5;
        func_0x0019275c(plVar3,&UNK_009c16e0);
      }
      plVar1 = (long *)(plVar3[1] + lVar6 * 0x10);
      *plVar1 = lVar4;
      plVar1[1] = lVar5;
      plVar3[2] = lVar6 + 1;
      return;
    }
  }
  uStack_44 = 0xffffffce;
  func_0x007a2810(&UNK_0081b8ee,0x2b,&uStack_44,&UNK_009c14f8,&UNK_009c16c8);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x196700);
  (*pcVar2)();
}

