
void FUN_00190188(void)

{
  code *pcVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  undefined8 uVar6;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000028;
  
  iVar2 = _CMSEncodeContent();
  if (iVar2 != 0) {
    *(int *)(unaff_x21 + 1) = iVar2;
    *unaff_x21 = -0x8000000000000000;
    if (unaff_x22 != 0) {
      func_0x0019fb28(unaff_x20 + 8);
    }
    _CFRelease(in_stack_00000008);
    _CFRelease(in_stack_00000000);
    return;
  }
  if (in_stack_00000010 == 0) {
    func_0x007a11c0(&UNK_0081a360,0x22,&UNK_009c0e28);
    goto code_r0x001902fc;
  }
  uStack0000000000000028 = in_stack_00000010;
  lVar3 = _CFDataGetBytePtr(in_stack_00000010);
  if (lVar3 == 0) {
    lVar4 = 0;
    lVar3 = 1;
LAB_0019022c:
    lVar5 = 1;
LAB_00190230:
    _memcpy(lVar5,lVar3,lVar4);
    *unaff_x21 = lVar4;
    unaff_x21[1] = lVar5;
    unaff_x21[2] = lVar4;
    if (in_stack_00000018 != 0) {
      func_0x0019fb28(unaff_x20 + 8);
    }
    _CFRelease(in_stack_00000008);
    _CFRelease(in_stack_00000000);
    func_0x0019fb28(&uStack0000000000000028);
    return;
  }
  lVar4 = _CFDataGetLength(in_stack_00000010);
  if (lVar4 < 0) {
    uVar6 = 0;
  }
  else {
    if (lVar4 == 0) goto LAB_0019022c;
    uVar6 = 1;
    lVar5 = func_0x00187bd0(lVar4,1);
    if (lVar5 != 0) goto LAB_00190230;
  }
  func_0x007a1f00(uVar6,lVar4,&UNK_009c08e8);
code_r0x001902fc:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x190300);
  (*pcVar1)();
}

