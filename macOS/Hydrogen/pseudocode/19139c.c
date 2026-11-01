
void FUN_0019139c(void)

{
  code *pcVar1;
  int iVar2;
  long lVar3;
  undefined4 uVar4;
  undefined4 *extraout_x8;
  undefined1 auVar5 [16];
  undefined1 uStack0000000000000008;
  long lStack_40;
  long lStack_38;
  
  func_0x0019fb28(&uStack0000000000000008);
  __Unwind_Resume();
  func_0x007a2668();
  lVar3 = _CFDictionaryCreateMutable
                    (*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,0,
                     PTR__kCFTypeDictionaryKeyCallBacks_009b0260,
                     PTR__kCFTypeDictionaryValueCallBacks_009b0268);
  if (lVar3 != 0) {
    return;
  }
  auVar5 = func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c07c0);
  if (auVar5._8_8_ < 0) {
    func_0x007a11c0(&UNK_0081aa9c,0x12,&UNK_009c0e88);
  }
  else {
    lVar3 = _CFStringCreateWithBytes
                      (*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,auVar5._0_8_,auVar5._8_8_,
                       0x8000100,0);
    if (lVar3 != 0) {
      lStack_40 = lVar3;
      iVar2 = _SecRequirementCreateWithString(lVar3,0,&lStack_38);
      if (iVar2 != 0) {
        extraout_x8[1] = iVar2;
        uVar4 = 1;
code_r0x00191470:
        *extraout_x8 = uVar4;
        func_0x0019fb28(&lStack_40);
        return;
      }
      if (lStack_38 != 0) {
        uVar4 = 0;
        *(long *)(extraout_x8 + 2) = lStack_38;
        goto code_r0x00191470;
      }
      goto code_r0x001914bc;
    }
  }
  func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
code_r0x001914bc:
  func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c1140);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x1914d8);
  (*pcVar1)();
}

