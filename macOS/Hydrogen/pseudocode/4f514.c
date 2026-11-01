
/* WARNING: Removing unreachable block (ram,0x0004f680) */
/* WARNING: Removing unreachable block (ram,0x0004f6cc) */
/* WARNING: Removing unreachable block (ram,0x0004f6b4) */
/* WARNING: Removing unreachable block (ram,0x0004f6d8) */
/* WARNING: Removing unreachable block (ram,0x0004f6e8) */

void FUN_0004f514(void)

{
  long *plVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  char cVar5;
  long *plVar6;
  code *pcVar7;
  long lVar8;
  undefined8 uVar9;
  ulong uVar10;
  long unaff_x19;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined3 uStack0000000000000000;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000030;
  long *in_stack_00000038;
  long in_stack_00000040;
  long *in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000060;
  
  __ZNSt3__14__fs10filesystem18directory_iteratorC1ERKNS1_4pathEPNS_10error_codeENS1_17directory_optionsE
            ();
  plVar6 = in_stack_00000048;
  if (in_stack_00000048 == (long *)0x0) {
    in_stack_00000038 = (long *)0x0;
  }
  else {
    in_stack_00000048[1] = in_stack_00000048[1] + 1;
    uStack0000000000000030 = in_stack_00000040;
    in_stack_00000038 = in_stack_00000048;
    if (in_stack_00000048 != (long *)0x0) {
      plVar1 = in_stack_00000048 + 1;
      *plVar1 = *plVar1 + 1;
      LOAcquire();
      lVar8 = *plVar1;
      *plVar1 = lVar8 + -1;
      LORelease();
      if (lVar8 == 0) {
        (**(code **)(*in_stack_00000048 + 0x10))(in_stack_00000048);
        __ZNSt3__119__shared_weak_count14__release_weakEv(plVar6);
      }
      goto LAB_0004f57c;
    }
  }
  uStack0000000000000030 = in_stack_00000040;
LAB_0004f57c:
  do {
    plVar6 = in_stack_00000038;
    if (uStack0000000000000030 == 0) {
      plVar1 = in_stack_00000048;
      if (in_stack_00000038 != (long *)0x0) {
        LOAcquire();
        lVar8 = in_stack_00000038[1];
        in_stack_00000038[1] = lVar8 + -1;
        LORelease();
        if (lVar8 == 0) {
          (**(code **)(*in_stack_00000038 + 0x10))(in_stack_00000038);
          __ZNSt3__119__shared_weak_count14__release_weakEv(plVar6);
          plVar1 = in_stack_00000048;
        }
      }
      in_stack_00000048 = plVar1;
      if (plVar1 != (long *)0x0) {
        LOAcquire();
        lVar8 = plVar1[1];
        plVar1[1] = lVar8 + -1;
        LORelease();
        if (lVar8 == 0) {
          (**(code **)(*plVar1 + 0x10))(plVar1);
          __ZNSt3__119__shared_weak_count14__release_weakEv(plVar1);
        }
      }
      if (in_stack_00000060._7_1_ < '\0') {
        __ZdlPv(in_stack_00000050);
      }
      return;
    }
    __ZNKSt3__14__fs10filesystem18directory_iterator13__dereferenceEv(&uStack0000000000000030);
    auVar11 = __ZNKSt3__14__fs10filesystem4path10__filenameEv();
    uVar10 = auVar11._8_8_;
    if (0x7ffffffffffffff7 < uVar10) {
      func_0x0001748c(unaff_x29 + -0x58);
                    /* WARNING: Does not return */
      pcVar7 = (code *)SoftwareBreakpoint(1,0x4f7c4);
      (*pcVar7)();
    }
    if (uVar10 < 0x17) {
      *(char *)(unaff_x29 + -0x41) = auVar11[8];
      lVar8 = unaff_x29 + -0x58;
      if (uVar10 != 0) goto code_r0x0004f634;
    }
    else {
      uVar2 = (uVar10 & 0xfffffffffffffff8) + 8;
      if ((uVar10 | 7) != 0x17) {
        uVar2 = uVar10 | 7;
      }
      lVar8 = __Znwm(uVar2 + 1);
      *(ulong *)(unaff_x29 + -0x50) = uVar10;
      *(ulong *)(unaff_x29 + -0x48) = uVar2 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0x58) = lVar8;
code_r0x0004f634:
      _memmove(lVar8,auVar11._0_8_,uVar10);
    }
    *(undefined1 *)(lVar8 + uVar10) = 0;
    uVar3 = *(undefined8 *)(unaff_x29 + -0x58);
    uVar9 = *(undefined8 *)(unaff_x29 + -0x50);
    uStack0000000000000000 = (undefined3)*(undefined4 *)(unaff_x29 + -0x48);
    cVar5 = *(char *)(unaff_x29 + -0x41);
    uStack0000000000000018 =
         CONCAT17(cVar5,CONCAT43(*(undefined4 *)(unaff_x29 + -0x45),uStack0000000000000000));
    puVar4 = *(undefined8 **)(unaff_x19 + 8);
    if (puVar4 < *(undefined8 **)(unaff_x19 + 0x10)) {
      puVar4[2] = uStack0000000000000018;
      puVar4[1] = uVar9;
      *puVar4 = uVar3;
      *(undefined8 **)(unaff_x19 + 8) = puVar4 + 3;
    }
    else {
      uVar9 = func_0x000232b4();
      *(undefined8 *)(unaff_x19 + 8) = uVar9;
      if (cVar5 < '\0') {
        __ZdlPv(uVar3);
      }
    }
    __ZNSt3__14__fs10filesystem18directory_iterator11__incrementEPNS_10error_codeE
              (&uStack0000000000000030,0);
  } while( true );
}

