
/* WARNING: Removing unreachable block (ram,0x0004f680) */
/* WARNING: Removing unreachable block (ram,0x0004f6cc) */
/* WARNING: Removing unreachable block (ram,0x0004f6b4) */

void FUN_0004f3f4(undefined8 *param_1)

{
  ulong uVar1;
  undefined8 *puVar2;
  code *pcVar3;
  long lVar4;
  undefined8 uVar5;
  long *plVar6;
  long *plVar7;
  ulong uVar8;
  long unaff_x29;
  undefined1 auVar9 [16];
  undefined3 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long *in_stack_00000028;
  undefined8 uStack0000000000000030;
  long *in_stack_00000038;
  undefined8 uStack0000000000000040;
  long *in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000060;
  
  uVar5 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar5 = func_0x00086db4(uVar5,"list_files",10);
  uVar5 = func_0x00086db4(uVar5," @ ",3);
  uVar5 = func_0x00086db4(uVar5,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar5 = func_0x00086db4(uVar5,":",1);
  plVar6 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar5,0x135);
  __ZNKSt3__18ios_base6getlocEv(unaff_x29 + -0x58,(long)plVar6 + *(long *)(*plVar6 + -0x18));
  plVar7 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (unaff_x29 + -0x58,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar5 = (**(code **)(*plVar7 + 0x38))(plVar7,10);
  __ZNSt3__16localeD1Ev(unaff_x29 + -0x58);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar6,uVar5);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar6);
  func_0x0004dd60(&uStack0000000000000050);
  __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
            (unaff_x29 + -0x58,&uStack0000000000000050,0);
  if (((*(char *)(unaff_x29 + -0x58) == '\0') || (*(char *)(unaff_x29 + -0x58) == -1)) ||
     (__ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
                (unaff_x29 + -0x58,&uStack0000000000000050,0),
     *(char *)(unaff_x29 + -0x58) != '\x02')) {
    func_0x006e644c();
    goto code_r0x0004f7c0;
  }
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  __ZNSt3__14__fs10filesystem18directory_iteratorC1ERKNS1_4pathEPNS_10error_codeENS1_17directory_optionsE
            (&uStack0000000000000040,&uStack0000000000000050,0,0);
  plVar6 = in_stack_00000048;
  if (in_stack_00000048 == (long *)0x0) {
    in_stack_00000038 = (long *)0x0;
LAB_0004f578:
    uStack0000000000000030 = uStack0000000000000040;
    in_stack_00000020 = 0;
    in_stack_00000028 = (long *)0x0;
  }
  else {
    in_stack_00000048[1] = in_stack_00000048[1] + 1;
    uStack0000000000000030 = uStack0000000000000040;
    in_stack_00000038 = in_stack_00000048;
    if (in_stack_00000048 == (long *)0x0) goto LAB_0004f578;
    plVar7 = in_stack_00000048 + 1;
    *plVar7 = *plVar7 + 1;
    in_stack_00000020 = 0;
    in_stack_00000028 = (long *)0x0;
    LOAcquire();
    lVar4 = *plVar7;
    *plVar7 = lVar4 + -1;
    LORelease();
    if (lVar4 == 0) {
      (**(code **)(*in_stack_00000048 + 0x10))(in_stack_00000048);
      __ZNSt3__119__shared_weak_count14__release_weakEv(plVar6);
    }
  }
  while( true ) {
    plVar6 = in_stack_00000028;
    if (uStack0000000000000030 == in_stack_00000020) {
      if (in_stack_00000028 != (long *)0x0) {
        LOAcquire();
        lVar4 = in_stack_00000028[1];
        in_stack_00000028[1] = lVar4 + -1;
        LORelease();
        if (lVar4 == 0) {
          (**(code **)(*in_stack_00000028 + 0x10))(in_stack_00000028);
          __ZNSt3__119__shared_weak_count14__release_weakEv(plVar6);
        }
      }
      plVar7 = in_stack_00000038;
      plVar6 = in_stack_00000048;
      if (in_stack_00000038 != (long *)0x0) {
        LOAcquire();
        lVar4 = in_stack_00000038[1];
        in_stack_00000038[1] = lVar4 + -1;
        LORelease();
        if (lVar4 == 0) {
          (**(code **)(*in_stack_00000038 + 0x10))(in_stack_00000038);
          __ZNSt3__119__shared_weak_count14__release_weakEv(plVar7);
          plVar6 = in_stack_00000048;
        }
      }
      in_stack_00000048 = plVar6;
      if (plVar6 != (long *)0x0) {
        LOAcquire();
        lVar4 = plVar6[1];
        plVar6[1] = lVar4 + -1;
        LORelease();
        if (lVar4 == 0) {
          (**(code **)(*plVar6 + 0x10))(plVar6);
          __ZNSt3__119__shared_weak_count14__release_weakEv(plVar6);
        }
      }
      if (in_stack_00000060._7_1_ < '\0') {
        __ZdlPv(uStack0000000000000050);
      }
      return;
    }
    __ZNKSt3__14__fs10filesystem18directory_iterator13__dereferenceEv(&uStack0000000000000030);
    auVar9 = __ZNKSt3__14__fs10filesystem4path10__filenameEv();
    uVar8 = auVar9._8_8_;
    if (0x7ffffffffffffff7 < uVar8) break;
    if (uVar8 < 0x17) {
      *(char *)(unaff_x29 + -0x41) = auVar9[8];
      lVar4 = unaff_x29 + -0x58;
      if (uVar8 != 0) goto code_r0x0004f634;
    }
    else {
      uVar1 = (uVar8 & 0xfffffffffffffff8) + 8;
      if ((uVar8 | 7) != 0x17) {
        uVar1 = uVar8 | 7;
      }
      lVar4 = __Znwm(uVar1 + 1);
      *(ulong *)(unaff_x29 + -0x50) = uVar8;
      *(ulong *)(unaff_x29 + -0x48) = uVar1 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0x58) = lVar4;
code_r0x0004f634:
      _memmove(lVar4,auVar9._0_8_,uVar8);
    }
    *(undefined1 *)(lVar4 + uVar8) = 0;
    uStack0000000000000008 = *(undefined8 *)(unaff_x29 + -0x58);
    in_stack_00000010 = *(undefined8 *)(unaff_x29 + -0x50);
    uStack0000000000000000 = (undefined3)*(undefined4 *)(unaff_x29 + -0x48);
    in_stack_00000018 =
         CONCAT17(*(undefined1 *)(unaff_x29 + -0x41),
                  CONCAT43(*(undefined4 *)(unaff_x29 + -0x45),uStack0000000000000000));
    puVar2 = (undefined8 *)param_1[1];
    if (puVar2 < (undefined8 *)param_1[2]) {
      puVar2[2] = in_stack_00000018;
      puVar2[1] = in_stack_00000010;
      *puVar2 = uStack0000000000000008;
      in_stack_00000010 = 0;
      in_stack_00000018 = 0;
      uStack0000000000000008 = 0;
      param_1[1] = puVar2 + 3;
    }
    else {
      uVar5 = func_0x000232b4(param_1,&uStack0000000000000008);
      param_1[1] = uVar5;
      if (in_stack_00000018 < 0) {
        __ZdlPv(uStack0000000000000008);
      }
    }
    __ZNSt3__14__fs10filesystem18directory_iterator11__incrementEPNS_10error_codeE
              (&uStack0000000000000030,0);
  }
  func_0x0001748c(unaff_x29 + -0x58);
code_r0x0004f7c0:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x4f7c4);
  (*pcVar3)();
}

