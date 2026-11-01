
byte FUN_00076ff0(ulong param_1)

{
  int iVar1;
  undefined1 auVar2 [16];
  code *pcVar3;
  int iVar4;
  int *piVar5;
  long *plVar6;
  long lVar7;
  long *unaff_x19;
  byte bVar8;
  long unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x24;
  long unaff_x25;
  long *unaff_x26;
  long unaff_x27;
  long unaff_x29;
  undefined4 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  long lStack0000000000000020;
  long in_stack_00000028;
  long *in_stack_00000038;
  long lStack0000000000000040;
  long *in_stack_00000058;
  char in_stack_00000060;
  
  do {
    if (in_stack_00000038 == &lStack0000000000000020) {
      in_stack_00000038 = &lStack0000000000000020;
      lVar7 = 4;
LAB_00077070:
      (**(code **)(*in_stack_00000038 + lVar7 * 8))();
    }
    else if (in_stack_00000038 != (long *)0x0) {
      lVar7 = 5;
      goto LAB_00077070;
    }
    if ((param_1 & 1) == 0) {
      _shutdown(unaff_x22,2);
      _close(unaff_x22);
    }
LAB_00076efc:
    if (*(int *)(unaff_x21 + 0x28) == -1) {
code_r0x000770e0:
      bVar8 = 1;
code_r0x000770e4:
      (**(code **)(*unaff_x19 + 0x18))();
      (**(code **)(*unaff_x19 + 8))();
      *(byte *)(unaff_x21 + 0x79) = bVar8 ^ 1;
      if (in_stack_00000060 != '\0') {
        if (in_stack_00000058 == (long *)0x0) {
          func_0x00056004();
          goto code_r0x000771a8;
        }
        (**(code **)(*in_stack_00000058 + 0x30))();
      }
      if (in_stack_00000058 == &lStack0000000000000040) {
        lVar7 = 4;
        plVar6 = &lStack0000000000000040;
code_r0x00077150:
        (**(code **)(*plVar6 + lVar7 * 8))();
      }
      else if (in_stack_00000058 != (long *)0x0) {
        lVar7 = 5;
        plVar6 = in_stack_00000058;
        goto code_r0x00077150;
      }
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
        return bVar8;
      }
      ___stack_chk_fail();
      func_0x00056004();
code_r0x000771a8:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x771ac);
      (*pcVar3)();
    }
    if ((0 < *(long *)(unaff_x21 + 0x60)) || (0 < *(long *)(unaff_x21 + 0x68))) {
      uStack0000000000000008 = *(undefined4 *)(unaff_x21 + 0x28);
      auVar2 = SEXT816(*(long *)(unaff_x21 + 0x68)) * SEXT816(unaff_x25);
      iVar1 = ((int)(auVar2._8_8_ >> 7) - (auVar2._12_4_ >> 0x1f)) +
              *(int *)(unaff_x21 + 0x60) * (int)unaff_x24;
      iVar4 = _poll(&uStack0000000000000008,1,iVar1);
      if (iVar4 < 0) {
        piVar5 = (int *)___error();
        while (*piVar5 == 4) {
          uStack0000000000000010 = unaff_x24;
          __ZNSt3__111this_thread9sleep_forERKNS_6chrono8durationIxNS_5ratioILl1ELl1000000000EEEEE
                    (&uStack0000000000000010);
          iVar4 = _poll(&uStack0000000000000008,1,iVar1);
          if (-1 < iVar4) goto code_r0x00076f64;
          piVar5 = (int *)___error();
        }
        goto code_r0x00076f68;
      }
code_r0x00076f64:
      if (iVar4 != 0) goto code_r0x00076f68;
      (**(code **)(*unaff_x19 + 0x20))();
      goto LAB_00076efc;
    }
code_r0x00076f68:
    unaff_x22 = _accept(*(undefined4 *)(unaff_x21 + 0x28),0,0);
    if ((int)unaff_x22 == -1) {
      piVar5 = (int *)___error();
      if (*piVar5 == 0x18) {
        uStack0000000000000010 = unaff_x24;
        __ZNSt3__111this_thread9sleep_forERKNS_6chrono8durationIxNS_5ratioILl1ELl1000000000EEEEE
                  (&uStack0000000000000010);
      }
      else {
        piVar5 = (int *)___error();
        if ((*piVar5 != 4) && (piVar5 = (int *)___error(), *piVar5 != 0x23)) {
          if (*(int *)(unaff_x21 + 0x28) == -1) goto code_r0x000770e0;
          _close(*(int *)(unaff_x21 + 0x28));
          bVar8 = 0;
          goto code_r0x000770e4;
        }
      }
      goto LAB_00076efc;
    }
    uStack0000000000000010 = *(undefined8 *)(unaff_x21 + 0x40);
    _setsockopt(unaff_x22,0xffff,"orks/CoreFoundation.framework/Versions/A/CoreFoundation",
                &uStack0000000000000010,0x10);
    uStack0000000000000010 = *(undefined8 *)(unaff_x21 + 0x50);
    _setsockopt(unaff_x22,0xffff,"works/CoreFoundation.framework/Versions/A/CoreFoundation",
                &uStack0000000000000010,0x10);
    lStack0000000000000020 = unaff_x27;
    in_stack_00000028 = unaff_x21;
    param_1 = (**(code **)(*unaff_x19 + 0x10))();
    in_stack_00000038 = unaff_x26;
  } while( true );
}

