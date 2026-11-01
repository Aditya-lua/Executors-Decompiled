
void FUN_001955d4(long *param_1)

{
  long *plVar1;
  code *pcVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 *unaff_x19;
  long lVar7;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  
  if ((*param_1 == 0) || (lVar4 = _CFRetain(), lVar4 == 0)) {
    func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
  }
  else {
    uStack0000000000000030 = lVar4;
    lVar5 = func_0x0019eaac(1);
    lVar7 = in_stack_00000028;
    if (lVar5 != 0) {
      uStack0000000000000030 = lVar4;
      in_stack_00000038 = lVar5;
      if (in_stack_00000028 == uStack0000000000000018) {
        func_0x0019275c(&uStack0000000000000018,&UNK_009c1620);
      }
      plVar1 = (long *)(in_stack_00000020 + lVar7 * 0x10);
      *plVar1 = lVar4;
      plVar1[1] = lVar5;
      in_stack_00000028 = lVar7 + 1;
      uVar6 = func_0x0018e2ec(in_stack_00000020);
      uStack0000000000000030 = 0;
      iVar3 = _SecItemCopyMatching(uVar6,&uStack0000000000000030);
      if (iVar3 == 0) {
        func_0x00195b20();
        _CFRelease(uVar6);
        lVar4 = in_stack_00000020;
        for (lVar7 = in_stack_00000028; lVar7 != 0; lVar7 = lVar7 + -1) {
          func_0x0019fb28(lVar4);
          func_0x0019e6a4(lVar4 + 8);
          lVar4 = lVar4 + 0x10;
        }
      }
      else {
        *(int *)(unaff_x19 + 1) = iVar3;
        *unaff_x19 = 0x8000000000000000;
        _CFRelease(uVar6);
        lVar4 = in_stack_00000020;
        for (lVar7 = in_stack_00000028; lVar7 != 0; lVar7 = lVar7 + -1) {
          func_0x0019fb28(lVar4);
          func_0x0019e6a4(lVar4 + 8);
          lVar4 = lVar4 + 0x10;
        }
      }
      if (uStack0000000000000018 != 0) {
        func_0x00187bd4(in_stack_00000020,uStack0000000000000018 << 4,8);
      }
      return;
    }
    func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14b0);
  }
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x195734);
  (*pcVar2)();
}

