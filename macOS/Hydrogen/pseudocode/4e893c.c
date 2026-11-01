
void FUN_004e893c(void)

{
  long lVar1;
  long lVar2;
  code *pcVar3;
  long lVar4;
  int *piVar5;
  long *plVar6;
  long *unaff_x19;
  int *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 uVar7;
  long lVar8;
  int *unaff_x28;
  long in_stack_00000000;
  long in_stack_00000008;
  long lStack0000000000000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000028;
  
  do {
    if (unaff_x28 == unaff_x20) {
code_r0x004e8948:
      unaff_x19[1] = in_stack_00000008;
      *unaff_x19 = in_stack_00000000;
      unaff_x19[2] = unaff_x23;
      return;
    }
    while (piVar5 = unaff_x28 + 8, *unaff_x28 != 1) {
      unaff_x28 = piVar5;
      if (piVar5 == unaff_x20) goto code_r0x004e8948;
    }
    lStack0000000000000010 = unaff_x23;
    func_0x0045b558(&uStack0000000000000018,*(undefined8 *)(unaff_x28 + 2),
                    *(undefined8 *)(unaff_x28 + 4));
    lVar2 = in_stack_00000028;
    lVar1 = in_stack_00000020;
    lVar4 = in_stack_00000020;
    lVar8 = uStack0000000000000018;
    if (uStack0000000000000018 == unaff_x21) {
      if (in_stack_00000028 < 0) {
        uVar7 = 0;
code_r0x004e89a8:
        func_0x007a1f00(uVar7,lVar2,&UNK_009e80a0);
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x4e89c0);
        (*pcVar3)();
      }
      uVar7 = 1;
      if (in_stack_00000028 == 0) {
        lVar4 = 1;
      }
      else {
        lVar4 = func_0x00187bd0(in_stack_00000028,1);
        if (lVar4 == 0) goto code_r0x004e89a8;
      }
      _memcpy(lVar4,lVar1,lVar2);
      unaff_x21 = -0x8000000000000000;
      lVar8 = lVar2;
    }
    if (unaff_x23 == in_stack_00000000) {
      func_0x007a5594();
      unaff_x22 = in_stack_00000008;
    }
    unaff_x28 = unaff_x28 + 8;
    plVar6 = (long *)(unaff_x22 + unaff_x23 * 0x18);
    *plVar6 = lVar8;
    plVar6[1] = lVar4;
    plVar6[2] = lVar2;
    unaff_x23 = unaff_x23 + 1;
  } while( true );
}

