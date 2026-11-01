
/* WARNING: Removing unreachable block (ram,0x0004f680) */
/* WARNING: Removing unreachable block (ram,0x0004f6cc) */
/* WARNING: Removing unreachable block (ram,0x0004f6b4) */

void FUN_0004f610(ulong param_1)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  undefined4 uVar3;
  char cVar4;
  long *plVar5;
  long *plVar6;
  code *pcVar7;
  long lVar8;
  undefined8 uVar9;
  ulong in_x9;
  long unaff_x19;
  undefined8 unaff_x20;
  long lVar10;
  undefined8 unaff_x21;
  undefined4 *unaff_x24;
  undefined4 *unaff_x25;
  ulong unaff_x26;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined3 uStack0000000000000000;
  undefined1 uStack0000000000000003;
  undefined7 uStack0000000000000018;
  long in_stack_00000020;
  long *in_stack_00000028;
  undefined8 uStack0000000000000030;
  long *in_stack_00000038;
  long *in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000060;
  
  auVar11._8_8_ = unaff_x20;
  auVar11._0_8_ = unaff_x21;
code_r0x0004f610:
  if (in_x9 != 0x17) {
    param_1 = in_x9;
  }
  lVar8 = __Znwm(param_1 + 1);
  *(long *)(unaff_x29 + -0x50) = auVar11._8_8_;
  *(ulong *)(unaff_x29 + -0x48) = param_1 + 1 | 0x8000000000000000;
  *(long *)(unaff_x29 + -0x58) = lVar8;
  do {
    lVar10 = auVar11._8_8_;
    _memmove(lVar8,auVar11._0_8_,lVar10);
    do {
      *(undefined1 *)(lVar8 + lVar10) = 0;
      uVar1 = *(undefined8 *)(unaff_x29 + -0x58);
      uVar9 = *(undefined8 *)(unaff_x29 + -0x50);
      uVar3 = *(undefined4 *)((long)unaff_x24 + 3);
      uStack0000000000000000 = (undefined3)*unaff_x24;
      uStack0000000000000003 = (undefined1)uVar3;
      cVar4 = *(char *)(unaff_x29 + -0x41);
      *unaff_x25 = _uStack0000000000000000;
      *(undefined4 *)((long)unaff_x25 + 3) = uVar3;
      _uStack0000000000000018 = CONCAT17(cVar4,uStack0000000000000018);
      puVar2 = *(undefined8 **)(unaff_x19 + 8);
      if (puVar2 < *(undefined8 **)(unaff_x19 + 0x10)) {
        puVar2[2] = _uStack0000000000000018;
        puVar2[1] = uVar9;
        *puVar2 = uVar1;
        _uStack0000000000000018 = 0;
        *(undefined8 **)(unaff_x19 + 8) = puVar2 + 3;
      }
      else {
        uVar9 = func_0x000232b4();
        *(undefined8 *)(unaff_x19 + 8) = uVar9;
        if (cVar4 < '\0') {
          __ZdlPv(uVar1);
        }
      }
      __ZNSt3__14__fs10filesystem18directory_iterator11__incrementEPNS_10error_codeE
                (&uStack0000000000000030,0);
      if (uStack0000000000000030 == in_stack_00000020) {
        if (in_stack_00000028 != (long *)0x0) {
          LOAcquire();
          lVar8 = in_stack_00000028[1];
          in_stack_00000028[1] = lVar8 + -1;
          LORelease();
          if (lVar8 == 0) {
            (**(code **)(*in_stack_00000028 + 0x10))(in_stack_00000028);
            __ZNSt3__119__shared_weak_count14__release_weakEv(in_stack_00000028);
          }
        }
        plVar6 = in_stack_00000038;
        plVar5 = in_stack_00000048;
        if (in_stack_00000038 != (long *)0x0) {
          LOAcquire();
          lVar8 = in_stack_00000038[1];
          in_stack_00000038[1] = lVar8 + -1;
          LORelease();
          if (lVar8 == 0) {
            (**(code **)(*in_stack_00000038 + 0x10))(in_stack_00000038);
            __ZNSt3__119__shared_weak_count14__release_weakEv(plVar6);
            plVar5 = in_stack_00000048;
          }
        }
        in_stack_00000048 = plVar5;
        if (plVar5 != (long *)0x0) {
          LOAcquire();
          lVar8 = plVar5[1];
          plVar5[1] = lVar8 + -1;
          LORelease();
          if (lVar8 == 0) {
            (**(code **)(*plVar5 + 0x10))(plVar5);
            __ZNSt3__119__shared_weak_count14__release_weakEv(plVar5);
          }
        }
        if (in_stack_00000060._7_1_ < '\0') {
          __ZdlPv(in_stack_00000050);
        }
        return;
      }
      __ZNKSt3__14__fs10filesystem18directory_iterator13__dereferenceEv(&uStack0000000000000030);
      auVar11 = __ZNKSt3__14__fs10filesystem4path10__filenameEv();
      auVar11._8_8_ = auVar11._8_8_;
      if (unaff_x26 <= auVar11._8_8_) {
        func_0x0001748c(unaff_x29 + -0x58);
                    /* WARNING: Does not return */
        pcVar7 = (code *)SoftwareBreakpoint(1,0x4f7c4);
        (*pcVar7)();
      }
      if (0x16 < auVar11._8_8_) {
        param_1 = (auVar11._8_8_ & 0xfffffffffffffff8) + 8;
        in_x9 = auVar11._8_8_ | 7;
        goto code_r0x0004f610;
      }
      *(char *)(unaff_x29 + -0x41) = auVar11[8];
      lVar8 = unaff_x29 + -0x58;
      lVar10 = 0;
    } while (auVar11._8_8_ == 0);
  } while( true );
}

