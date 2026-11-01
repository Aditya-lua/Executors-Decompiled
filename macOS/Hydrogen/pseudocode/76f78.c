
byte FUN_00076f78(ulong param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  undefined1 auVar2 [16];
  code *pcVar3;
  int iVar4;
  undefined8 uVar5;
  ulong uVar6;
  int *piVar7;
  long *plVar8;
  long lVar9;
  long *unaff_x19;
  byte bVar10;
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
    uVar5 = _accept(param_1,param_2,param_3);
    if ((int)uVar5 == -1) {
      piVar7 = (int *)___error();
      if (*piVar7 == 0x18) {
        uStack0000000000000010 = unaff_x24;
        __ZNSt3__111this_thread9sleep_forERKNS_6chrono8durationIxNS_5ratioILl1ELl1000000000EEEEE
                  (&uStack0000000000000010);
      }
      else {
        piVar7 = (int *)___error();
        if ((*piVar7 != 4) && (piVar7 = (int *)___error(), *piVar7 != 0x23)) {
          if (*(int *)(unaff_x21 + 0x28) == -1) {
code_r0x000770e0:
            bVar10 = 1;
          }
          else {
            _close(*(int *)(unaff_x21 + 0x28));
            bVar10 = 0;
          }
          (**(code **)(*unaff_x19 + 0x18))();
          (**(code **)(*unaff_x19 + 8))();
          *(byte *)(unaff_x21 + 0x79) = bVar10 ^ 1;
          if (in_stack_00000060 != '\0') {
            if (in_stack_00000058 == (long *)0x0) {
              func_0x00056004();
              goto code_r0x000771a8;
            }
            (**(code **)(*in_stack_00000058 + 0x30))();
          }
          if (in_stack_00000058 == &lStack0000000000000040) {
            lVar9 = 4;
            plVar8 = &lStack0000000000000040;
code_r0x00077150:
            (**(code **)(*plVar8 + lVar9 * 8))();
          }
          else if (in_stack_00000058 != (long *)0x0) {
            lVar9 = 5;
            plVar8 = in_stack_00000058;
            goto code_r0x00077150;
          }
          if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
            return bVar10;
          }
          ___stack_chk_fail();
          func_0x00056004();
code_r0x000771a8:
                    /* WARNING: Does not return */
          pcVar3 = (code *)SoftwareBreakpoint(1,0x771ac);
          (*pcVar3)();
        }
      }
    }
    else {
      uStack0000000000000010 = *(undefined8 *)(unaff_x21 + 0x40);
      _setsockopt(uVar5,0xffff,"orks/CoreFoundation.framework/Versions/A/CoreFoundation",
                  &uStack0000000000000010,0x10);
      uStack0000000000000010 = *(undefined8 *)(unaff_x21 + 0x50);
      _setsockopt(uVar5,0xffff,"works/CoreFoundation.framework/Versions/A/CoreFoundation",
                  &uStack0000000000000010,0x10);
      lStack0000000000000020 = unaff_x27;
      in_stack_00000028 = unaff_x21;
      uVar6 = (**(code **)(*unaff_x19 + 0x10))();
      if (unaff_x26 == &lStack0000000000000020) {
        plVar8 = &lStack0000000000000020;
        lVar9 = 4;
code_r0x00077070:
        (**(code **)(*plVar8 + lVar9 * 8))();
      }
      else if (unaff_x26 != (long *)0x0) {
        lVar9 = 5;
        plVar8 = unaff_x26;
        goto code_r0x00077070;
      }
      if ((uVar6 & 1) == 0) {
        _shutdown(uVar5,2);
        _close(uVar5);
      }
    }
    while( true ) {
      if (*(int *)(unaff_x21 + 0x28) == -1) goto code_r0x000770e0;
      if ((*(long *)(unaff_x21 + 0x60) < 1) && (*(long *)(unaff_x21 + 0x68) < 1)) break;
      uStack0000000000000008 = *(undefined4 *)(unaff_x21 + 0x28);
      auVar2 = SEXT816(*(long *)(unaff_x21 + 0x68)) * SEXT816(unaff_x25);
      iVar1 = ((int)(auVar2._8_8_ >> 7) - (auVar2._12_4_ >> 0x1f)) +
              *(int *)(unaff_x21 + 0x60) * (int)unaff_x24;
      iVar4 = _poll(&uStack0000000000000008,1,iVar1);
      if (iVar4 < 0) {
        piVar7 = (int *)___error();
        while( true ) {
          if (*piVar7 != 4) goto code_r0x00076f68;
          uStack0000000000000010 = unaff_x24;
          __ZNSt3__111this_thread9sleep_forERKNS_6chrono8durationIxNS_5ratioILl1ELl1000000000EEEEE
                    (&uStack0000000000000010);
          iVar4 = _poll(&uStack0000000000000008,1,iVar1);
          if (-1 < iVar4) break;
          piVar7 = (int *)___error();
        }
      }
      if (iVar4 != 0) break;
      (**(code **)(*unaff_x19 + 0x20))();
    }
code_r0x00076f68:
    param_1 = (ulong)*(uint *)(unaff_x21 + 0x28);
    param_2 = 0;
    param_3 = 0;
  } while( true );
}

