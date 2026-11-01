
void FUN_0006e908(long *param_1)

{
  code *pcVar1;
  int iVar2;
  long *plVar3;
  long lVar4;
  long unaff_x19;
  bool bVar5;
  ulong unaff_x20;
  ulong unaff_x21;
  long *unaff_x22;
  ulong unaff_x23;
  ulong unaff_x25;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  long lStack0000000000000028;
  long *in_stack_00000040;
  long lStack0000000000000048;
  long *in_stack_00000060;
  
  do {
    if (param_1 == (long *)0x0) {
LAB_0006e9e0:
      func_0x00056004();
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x6e9e8);
      (*pcVar1)();
    }
    iVar2 = (**(code **)(*param_1 + 0x30))
                      (param_1,&uStack0000000000000020,&uStack0000000000000018,
                       &uStack0000000000000010,&uStack0000000000000008);
    if ((iVar2 == 0) ||
       ((unaff_x23 = unaff_x21 + unaff_x23, in_stack_00000060 != (long *)0x0 &&
        (uStack0000000000000018 = unaff_x20, uStack0000000000000020 = unaff_x23,
        iVar2 = (**(code **)(*in_stack_00000060 + 0x30))
                          (in_stack_00000060,&uStack0000000000000020,&uStack0000000000000018),
        iVar2 == 0)))) {
LAB_0006e954:
      bVar5 = false;
      if (in_stack_00000040 == &lStack0000000000000028) {
LAB_0006e988:
        lVar4 = 4;
        plVar3 = &lStack0000000000000028;
LAB_0006e990:
        (**(code **)(*plVar3 + lVar4 * 8))();
      }
      else {
code_r0x0006e968:
        if (in_stack_00000040 != (long *)0x0) {
          lVar4 = 5;
          plVar3 = in_stack_00000040;
          goto LAB_0006e990;
        }
      }
      if (in_stack_00000060 == &lStack0000000000000048) {
        lVar4 = 4;
        plVar3 = &lStack0000000000000048;
LAB_0006e9c0:
        (**(code **)(*plVar3 + lVar4 * 8))();
      }
      else if (in_stack_00000060 != (long *)0x0) {
        lVar4 = 5;
        plVar3 = in_stack_00000060;
        goto LAB_0006e9c0;
      }
      if (!bVar5) {
        **(undefined4 **)(unaff_x19 + 0x20) = 400;
      }
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
        return;
      }
      ___stack_chk_fail(bVar5);
      goto LAB_0006e9e0;
    }
    if (unaff_x20 <= unaff_x23) {
      bVar5 = true;
      if (in_stack_00000040 == &lStack0000000000000028) goto LAB_0006e988;
      goto code_r0x0006e968;
    }
    unaff_x21 = (**(code **)(*unaff_x22 + 0x28))();
    if ((long)unaff_x21 < 1) goto LAB_0006e954;
    param_1 = in_stack_00000040;
    uStack0000000000000008 = unaff_x20;
    uStack0000000000000010 = unaff_x23;
    uStack0000000000000018 = unaff_x21;
    uStack0000000000000020 = unaff_x25;
  } while( true );
}

