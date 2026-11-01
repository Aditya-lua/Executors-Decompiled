
void FUN_0004eb2c(void)

{
  ulong uVar1;
  undefined1 uVar2;
  code *pcVar3;
  int iVar4;
  undefined8 *puVar5;
  ulong uVar6;
  long *unaff_x19;
  int unaff_w22;
  undefined8 *unaff_x26;
  undefined8 *unaff_x28;
  long unaff_x29;
  undefined1 auVar7 [16];
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  undefined8 uStack0000000000000058;
  undefined8 in_stack_00000060;
  undefined7 uStack0000000000000068;
  char cStack000000000000006f;
  long in_stack_00000070;
  long in_stack_00000078;
  undefined8 uStack0000000000000090;
  ulong in_stack_00000098;
  undefined7 uStack00000000000000a0;
  undefined1 uStack00000000000000a7;
  
  do {
    __ZdlPv(uStack0000000000000090);
    do {
      if (unaff_w22 == 0) {
        auVar7 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv();
        uVar6 = auVar7._8_8_;
        if (0x7ffffffffffffff7 < uVar6) {
LAB_0004ec7c:
          func_0x0001748c(&uStack0000000000000090);
                    /* WARNING: Does not return */
          pcVar3 = (code *)SoftwareBreakpoint(1,0x4ec88);
          (*pcVar3)();
        }
        if (uVar6 < 0x17) {
          _uStack00000000000000a0 = CONCAT17(auVar7[8],uStack00000000000000a0);
          puVar5 = &uStack0000000000000090;
          if (uVar6 != 0) goto LAB_0004eb9c;
        }
        else {
          uVar1 = (uVar6 & 0xfffffffffffffff8) + 8;
          if ((uVar6 | 7) != 0x17) {
            uVar1 = uVar6 | 7;
          }
          puVar5 = (undefined8 *)__Znwm(uVar1 + 1);
          _uStack00000000000000a0 = uVar1 + 1 | 0x8000000000000000;
          uStack0000000000000090 = puVar5;
          in_stack_00000098 = uVar6;
LAB_0004eb9c:
          _memmove(puVar5,auVar7._0_8_,uVar6);
        }
        *(undefined1 *)((long)puVar5 + uVar6) = 0;
        puVar5 = uStack0000000000000090;
        *(undefined8 *)(unaff_x29 + -0x78) = *unaff_x28;
        *(undefined8 *)(unaff_x29 + -0x71) = *(undefined8 *)((long)unaff_x28 + 7);
        uVar2 = uStack00000000000000a7;
        if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
          __ZdlPv(*unaff_x19);
        }
        *unaff_x19 = (long)puVar5;
        *unaff_x26 = *(undefined8 *)(unaff_x29 + -0x78);
        *(undefined8 *)((long)unaff_x26 + 7) = *(undefined8 *)(unaff_x29 + -0x71);
        *(undefined1 *)((long)unaff_x19 + 0x17) = uVar2;
      }
      else {
        func_0x0001754c();
      }
      do {
        if (in_stack_00000010 < 0) {
          __ZdlPv(in_stack_00000000);
        }
        __ZNSt3__14__fs10filesystem4path8iterator11__incrementEv(&uStack0000000000000058);
        if (in_stack_00000070 == in_stack_00000038 && in_stack_00000078 == in_stack_00000040) {
          if (in_stack_00000030 < 0) {
            __ZdlPv(in_stack_00000020);
            if (-1 < cStack000000000000006f) goto code_r0x0004ec10;
code_r0x0004ec58:
            __ZdlPv(uStack0000000000000058);
            if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
              return;
            }
          }
          else {
            if (cStack000000000000006f < '\0') goto code_r0x0004ec58;
code_r0x0004ec10:
            if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
              return;
            }
          }
          ___stack_chk_fail();
          goto LAB_0004ec7c;
        }
        if (cStack000000000000006f < '\0') {
          func_0x00017634();
        }
        else {
          in_stack_00000000 = uStack0000000000000058;
          in_stack_00000010 = CONCAT17(cStack000000000000006f,uStack0000000000000068);
        }
        uStack0000000000000090 = (undefined8 *)0x0;
        in_stack_00000098 = 0;
        _uStack00000000000000a0 = 0;
        func_0x00017184(&uStack0000000000000090);
        iVar4 = __ZNKSt3__14__fs10filesystem4path9__compareENS_17basic_string_viewIcNS_11char_traitsIcEEEE
                          ();
        if ((long)_uStack00000000000000a0 < 0) {
          __ZdlPv(uStack0000000000000090);
        }
      } while (iVar4 == 0);
      uStack0000000000000090 = (undefined8 *)0x0;
      in_stack_00000098 = 0;
      _uStack00000000000000a0 = 0;
      func_0x00017184(&uStack0000000000000090);
      unaff_w22 = __ZNKSt3__14__fs10filesystem4path9__compareENS_17basic_string_viewIcNS_11char_traitsIcEEEE
                            ();
    } while (-1 < (long)_uStack00000000000000a0);
  } while( true );
}

