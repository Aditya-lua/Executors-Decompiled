
void FUN_0019615c(undefined8 param_1)

{
  long *plVar1;
  long lVar2;
  code *pcVar3;
  long lVar4;
  long lVar5;
  undefined *puVar6;
  undefined8 uVar7;
  undefined *puVar8;
  long in_x9;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x24;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  long unaff_x29;
  long in_stack_00000000;
  long *in_stack_00000008;
  long in_stack_00000020;
  undefined1 uStack0000000000000028;
  long lStack0000000000000030;
  long lStack0000000000000038;
  undefined4 uStack0000000000000060;
  
  *(undefined8 *)(in_x9 + 0x20) = unaff_x20;
  *(undefined8 *)(in_x9 + 0x28) = unaff_x21;
  *(undefined8 *)(in_x9 + 0x30) = unaff_x22;
  *(undefined8 *)(in_x9 + 0x38) = unaff_x26;
  *(undefined8 *)(in_x9 + 0x40) = unaff_x27;
  *(undefined8 *)(in_x9 + 0x48) = unaff_x24;
  *(undefined8 *)(in_x9 + 0x50) = unaff_x19;
  *(undefined8 *)(in_x9 + 0x58) = param_1;
  _uStack0000000000000028 = 6;
  lStack0000000000000038 = 6;
  lStack0000000000000030 = in_x9;
  if (in_stack_00000020 == 0) {
LAB_0019620c:
    if ((*(ushort *)(unaff_x29 + 0x10) & 1) == 0) {
LAB_00196298:
      in_stack_00000008[1] = lStack0000000000000030;
      *in_stack_00000008 = _uStack0000000000000028;
      in_stack_00000008[2] = lStack0000000000000038;
      return;
    }
    if ((*(long *)PTR__kSecAttrPort_009b0308 != 0) && (lVar4 = _CFRetain(), lVar4 != 0)) {
      *(long *)(unaff_x29 + -0x60) = lVar4;
      uStack0000000000000060 = (uint)*(ushort *)(unaff_x29 + 0x12);
      lVar5 = _CFNumberCreate(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,3,
                              &uStack0000000000000060);
      lVar2 = lStack0000000000000038;
      if (lVar5 == 0) {
        func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c1680);
        goto LAB_001964d8;
      }
      *(long *)(unaff_x29 + -0x60) = lVar4;
      *(long *)(unaff_x29 + -0x58) = lVar5;
      if (lStack0000000000000038 == _uStack0000000000000028) {
        func_0x0019275c(&uStack0000000000000028,&UNK_009c16b0);
      }
      plVar1 = (long *)(lStack0000000000000030 + lVar2 * 0x10);
      *plVar1 = lVar4;
      plVar1[1] = lVar5;
      lStack0000000000000038 = lVar2 + 1;
      goto LAB_00196298;
    }
  }
  else if ((*(long *)PTR__kSecAttrSecurityDomain_009b0318 != 0) && (lVar4 = _CFRetain(), lVar4 != 0)
          ) {
    *(long *)(unaff_x29 + -0x60) = lVar4;
    if (in_stack_00000000 < 0) {
      puVar8 = &UNK_009c14e0;
      uVar7 = 0x12;
      puVar6 = &UNK_0081b8dc;
    }
    else {
      lVar5 = _CFStringCreateWithBytes
                        (*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,in_stack_00000020,
                         in_stack_00000000,0x8000100,0);
      lVar2 = lStack0000000000000038;
      if (lVar5 != 0) {
        *(long *)(unaff_x29 + -0x60) = lVar4;
        *(long *)(unaff_x29 + -0x58) = lVar5;
        if (lStack0000000000000038 == _uStack0000000000000028) {
          func_0x0019275c(&uStack0000000000000028,&UNK_009c1698);
        }
        plVar1 = (long *)(lStack0000000000000030 + lVar2 * 0x10);
        *plVar1 = lVar4;
        plVar1[1] = lVar5;
        lStack0000000000000038 = lVar2 + 1;
        goto LAB_0019620c;
      }
      puVar8 = &UNK_009c14c8;
      uVar7 = 0x22;
      puVar6 = &UNK_0081b7f0;
    }
    func_0x007a11c0(puVar6,uVar7,puVar8);
    goto LAB_001964d8;
  }
  func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
LAB_001964d8:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x1964dc);
  (*pcVar3)();
}

