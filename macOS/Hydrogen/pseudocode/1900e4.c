
void FUN_001900e4(undefined8 param_1)

{
  undefined8 uVar1;
  bool bVar2;
  code *pcVar3;
  int iVar4;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  undefined *puVar9;
  undefined *puVar10;
  long *unaff_x21;
  long unaff_x22;
  long unaff_x25;
  undefined8 uVar11;
  long in_stack_00000010;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  
  uVar5 = func_0x0018dba4();
  if (unaff_x22 != 0) {
    if (unaff_x25 < 0) {
      puVar10 = &UNK_009c08b8;
      uVar5 = 0x12;
      puVar9 = &UNK_0081a3e8;
    }
    else {
      unaff_x25 = _CFStringCreateWithBytes(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238);
      if (unaff_x25 != 0) {
        bVar2 = true;
        uStack0000000000000020 = unaff_x25;
        goto LAB_0019013c;
      }
      puVar10 = &UNK_009c08a0;
      uVar5 = 0x22;
      puVar9 = &UNK_0081a360;
    }
    func_0x007a11c0(puVar9,uVar5,puVar10);
    goto code_r0x001902fc;
  }
  bVar2 = false;
LAB_0019013c:
  lVar6 = _CFArrayGetCount(param_1);
  uVar11 = 0;
  if (lVar6 != 0) {
    uVar11 = param_1;
  }
  lVar6 = _CFArrayGetCount(uVar5);
  uVar1 = 0;
  if (lVar6 != 0) {
    uVar1 = uVar5;
  }
  if (!bVar2) {
    unaff_x25 = 0;
  }
  iVar4 = _CMSEncodeContent(uVar11,uVar1,unaff_x25);
  if (iVar4 != 0) {
    *(int *)(unaff_x21 + 1) = iVar4;
    *unaff_x21 = -0x8000000000000000;
    if (unaff_x22 != 0) {
      func_0x0019fb28(&uStack0000000000000020);
    }
    _CFRelease(uVar5);
    _CFRelease(param_1);
    return;
  }
  if (in_stack_00000010 == 0) {
    func_0x007a11c0(&UNK_0081a360,0x22,&UNK_009c0e28);
    goto code_r0x001902fc;
  }
  uStack0000000000000028 = in_stack_00000010;
  lVar6 = _CFDataGetBytePtr(in_stack_00000010);
  if (lVar6 == 0) {
    lVar7 = 0;
    lVar6 = 1;
code_r0x0019022c:
    lVar8 = 1;
code_r0x00190230:
    _memcpy(lVar8,lVar6,lVar7);
    *unaff_x21 = lVar7;
    unaff_x21[1] = lVar8;
    unaff_x21[2] = lVar7;
    if (bVar2) {
      func_0x0019fb28(&uStack0000000000000020);
    }
    _CFRelease(uVar5);
    _CFRelease(param_1);
    func_0x0019fb28(&uStack0000000000000028);
    return;
  }
  lVar7 = _CFDataGetLength(in_stack_00000010);
  if (lVar7 < 0) {
    uVar11 = 0;
  }
  else {
    if (lVar7 == 0) goto code_r0x0019022c;
    uVar11 = 1;
    lVar8 = func_0x00187bd0(lVar7,1);
    if (lVar8 != 0) goto code_r0x00190230;
  }
  func_0x007a1f00(uVar11,lVar7,&UNK_009c08e8);
code_r0x001902fc:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x190300);
  (*pcVar3)();
}

