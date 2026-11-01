
byte FUN_00076f48(ulong param_1)

{
  int iVar1;
  code *pcVar2;
  int iVar3;
  undefined8 uVar4;
  ulong uVar5;
  int *piVar6;
  long *plVar7;
  long lVar8;
  int in_w9;
  ulong in_x10;
  long *unaff_x19;
  byte bVar9;
  long unaff_x21;
  undefined8 unaff_x24;
  long unaff_x25;
  long *unaff_x26;
  long unaff_x27;
  long unaff_x29;
  undefined4 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  long lStack0000000000000020;
  long in_stack_00000028;
  long lStack0000000000000040;
  long *in_stack_00000058;
  char in_stack_00000060;
  
  do {
    iVar1 = (int)param_1 + (int)in_x10 + in_w9 * (int)unaff_x24;
    iVar3 = _poll(&uStack0000000000000008,1,iVar1);
    if (iVar3 < 0) {
      piVar6 = (int *)___error();
      while (*piVar6 == 4) {
        uStack0000000000000010 = unaff_x24;
        __ZNSt3__111this_thread9sleep_forERKNS_6chrono8durationIxNS_5ratioILl1ELl1000000000EEEEE
                  (&uStack0000000000000010);
        iVar3 = _poll(&uStack0000000000000008,1,iVar1);
        if (-1 < iVar3) goto code_r0x00076f64;
        piVar6 = (int *)___error();
      }
    }
    else {
code_r0x00076f64:
      if (iVar3 == 0) {
        (**(code **)(*unaff_x19 + 0x20))();
        goto code_r0x00076efc;
      }
    }
    do {
      uVar4 = _accept(*(undefined4 *)(unaff_x21 + 0x28),0,0);
      if ((int)uVar4 == -1) {
        piVar6 = (int *)___error();
        if (*piVar6 == 0x18) {
          uStack0000000000000010 = unaff_x24;
          __ZNSt3__111this_thread9sleep_forERKNS_6chrono8durationIxNS_5ratioILl1ELl1000000000EEEEE
                    (&uStack0000000000000010);
          goto code_r0x00076efc;
        }
        piVar6 = (int *)___error();
        if ((*piVar6 == 4) || (piVar6 = (int *)___error(), *piVar6 == 0x23)) goto code_r0x00076efc;
        if (*(int *)(unaff_x21 + 0x28) == -1) goto code_r0x000770e0;
        _close(*(int *)(unaff_x21 + 0x28));
        bVar9 = 0;
code_r0x000770e4:
        (**(code **)(*unaff_x19 + 0x18))();
        (**(code **)(*unaff_x19 + 8))();
        *(byte *)(unaff_x21 + 0x79) = bVar9 ^ 1;
        if (in_stack_00000060 != '\0') {
          if (in_stack_00000058 == (long *)0x0) {
            func_0x00056004();
            goto code_r0x000771a8;
          }
          (**(code **)(*in_stack_00000058 + 0x30))();
        }
        if (in_stack_00000058 == &lStack0000000000000040) {
          lVar8 = 4;
          plVar7 = &lStack0000000000000040;
code_r0x00077150:
          (**(code **)(*plVar7 + lVar8 * 8))();
        }
        else if (in_stack_00000058 != (long *)0x0) {
          lVar8 = 5;
          plVar7 = in_stack_00000058;
          goto code_r0x00077150;
        }
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
          return bVar9;
        }
        ___stack_chk_fail();
        func_0x00056004();
code_r0x000771a8:
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x771ac);
        (*pcVar2)();
      }
      uStack0000000000000010 = *(undefined8 *)(unaff_x21 + 0x40);
      _setsockopt(uVar4,0xffff,"orks/CoreFoundation.framework/Versions/A/CoreFoundation",
                  &uStack0000000000000010,0x10);
      uStack0000000000000010 = *(undefined8 *)(unaff_x21 + 0x50);
      _setsockopt(uVar4,0xffff,"works/CoreFoundation.framework/Versions/A/CoreFoundation",
                  &uStack0000000000000010,0x10);
      lStack0000000000000020 = unaff_x27;
      in_stack_00000028 = unaff_x21;
      uVar5 = (**(code **)(*unaff_x19 + 0x10))();
      if (unaff_x26 == &lStack0000000000000020) {
        plVar7 = &lStack0000000000000020;
        lVar8 = 4;
code_r0x00077070:
        (**(code **)(*plVar7 + lVar8 * 8))();
      }
      else if (unaff_x26 != (long *)0x0) {
        lVar8 = 5;
        plVar7 = unaff_x26;
        goto code_r0x00077070;
      }
      if ((uVar5 & 1) == 0) {
        _shutdown(uVar4,2);
        _close(uVar4);
      }
code_r0x00076efc:
      if (*(int *)(unaff_x21 + 0x28) == -1) {
code_r0x000770e0:
        bVar9 = 1;
        goto code_r0x000770e4;
      }
    } while ((*(long *)(unaff_x21 + 0x60) < 1) && (*(long *)(unaff_x21 + 0x68) < 1));
    uStack0000000000000008 = *(undefined4 *)(unaff_x21 + 0x28);
    in_w9 = *(int *)(unaff_x21 + 0x60);
    param_1 = SUB168(SEXT816(*(long *)(unaff_x21 + 0x68)) * SEXT816(unaff_x25),8);
    in_x10 = param_1 >> 0x3f;
    param_1 = param_1 >> 7;
  } while( true );
}

