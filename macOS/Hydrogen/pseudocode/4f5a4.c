
/* WARNING: Removing unreachable block (ram,0x0004f680) */
/* WARNING: Removing unreachable block (ram,0x0004f6cc) */

void FUN_0004f5a4(undefined8 *param_1)

{
  ulong uVar1;
  undefined8 *puVar2;
  undefined4 uVar3;
  byte bVar4;
  long *plVar5;
  long *plVar6;
  code *pcVar7;
  undefined8 uVar8;
  ulong uVar9;
  long unaff_x19;
  undefined8 unaff_x21;
  uint unaff_w22;
  long lVar10;
  undefined4 *unaff_x24;
  undefined4 *unaff_x25;
  ulong unaff_x26;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined3 uStack0000000000000000;
  undefined1 uStack0000000000000003;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined7 uStack0000000000000018;
  long in_stack_00000020;
  long *in_stack_00000028;
  undefined8 uStack0000000000000030;
  long *in_stack_00000038;
  long *in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000060;
  
  do {
    uStack0000000000000010 = 0;
    _uStack0000000000000018 = 0;
    uStack0000000000000008 = 0;
    *(undefined8 **)(unaff_x19 + 8) = param_1;
    if ((int)unaff_w22 < 0) {
      _uStack0000000000000018 = 0;
      uStack0000000000000010 = 0;
      uStack0000000000000008 = 0;
      __ZdlPv(unaff_x21);
    }
LAB_0004f5b4:
    __ZNSt3__14__fs10filesystem18directory_iterator11__incrementEPNS_10error_codeE
              (&uStack0000000000000030,0);
    if (uStack0000000000000030 == in_stack_00000020) {
      if (in_stack_00000028 != (long *)0x0) {
        LOAcquire();
        lVar10 = in_stack_00000028[1];
        in_stack_00000028[1] = lVar10 + -1;
        LORelease();
        if (lVar10 == 0) {
          (**(code **)(*in_stack_00000028 + 0x10))(in_stack_00000028);
          __ZNSt3__119__shared_weak_count14__release_weakEv(in_stack_00000028);
        }
      }
      plVar6 = in_stack_00000038;
      plVar5 = in_stack_00000048;
      if (in_stack_00000038 != (long *)0x0) {
        LOAcquire();
        lVar10 = in_stack_00000038[1];
        in_stack_00000038[1] = lVar10 + -1;
        LORelease();
        if (lVar10 == 0) {
          (**(code **)(*in_stack_00000038 + 0x10))(in_stack_00000038);
          __ZNSt3__119__shared_weak_count14__release_weakEv(plVar6);
          plVar5 = in_stack_00000048;
        }
      }
      in_stack_00000048 = plVar5;
      if (plVar5 != (long *)0x0) {
        LOAcquire();
        lVar10 = plVar5[1];
        plVar5[1] = lVar10 + -1;
        LORelease();
        if (lVar10 == 0) {
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
    uVar9 = auVar11._8_8_;
    if (unaff_x26 <= uVar9) {
      func_0x0001748c(unaff_x29 + -0x58);
                    /* WARNING: Does not return */
      pcVar7 = (code *)SoftwareBreakpoint(1,0x4f7c4);
      (*pcVar7)();
    }
    if (uVar9 < 0x17) {
      *(char *)(unaff_x29 + -0x41) = auVar11[8];
      lVar10 = unaff_x29 + -0x58;
      if (uVar9 != 0) goto LAB_0004f634;
    }
    else {
      uVar1 = (uVar9 & 0xfffffffffffffff8) + 8;
      if ((uVar9 | 7) != 0x17) {
        uVar1 = uVar9 | 7;
      }
      lVar10 = __Znwm(uVar1 + 1);
      *(ulong *)(unaff_x29 + -0x50) = uVar9;
      *(ulong *)(unaff_x29 + -0x48) = uVar1 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0x58) = lVar10;
LAB_0004f634:
      _memmove(lVar10,auVar11._0_8_,uVar9);
    }
    *(undefined1 *)(lVar10 + uVar9) = 0;
    unaff_x21 = *(undefined8 *)(unaff_x29 + -0x58);
    uStack0000000000000010 = *(undefined8 *)(unaff_x29 + -0x50);
    uVar3 = *(undefined4 *)((long)unaff_x24 + 3);
    uStack0000000000000000 = (undefined3)*unaff_x24;
    uStack0000000000000003 = (undefined1)uVar3;
    bVar4 = *(byte *)(unaff_x29 + -0x41);
    unaff_w22 = (uint)bVar4;
    *unaff_x25 = _uStack0000000000000000;
    *(undefined4 *)((long)unaff_x25 + 3) = uVar3;
    _uStack0000000000000018 = CONCAT17(bVar4,uStack0000000000000018);
    puVar2 = *(undefined8 **)(unaff_x19 + 8);
    if (*(undefined8 **)(unaff_x19 + 0x10) <= puVar2) {
      uStack0000000000000008 = unaff_x21;
      uVar8 = func_0x000232b4();
      *(undefined8 *)(unaff_x19 + 8) = uVar8;
      if (_uStack0000000000000018 < 0) {
        __ZdlPv(uStack0000000000000008);
      }
      goto LAB_0004f5b4;
    }
    puVar2[2] = _uStack0000000000000018;
    param_1 = puVar2 + 3;
    puVar2[1] = uStack0000000000000010;
    *puVar2 = unaff_x21;
  } while( true );
}

