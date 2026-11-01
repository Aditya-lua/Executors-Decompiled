
/* WARNING: Removing unreachable block (ram,0x0004f680) */
/* WARNING: Removing unreachable block (ram,0x0004f6cc) */
/* WARNING: Removing unreachable block (ram,0x0004f6b4) */
/* WARNING: Removing unreachable block (ram,0x0004f6d8) */
/* WARNING: Removing unreachable block (ram,0x0004f6e8) */

void FUN_0004f410(undefined8 param_1)

{
  ulong uVar1;
  undefined8 *puVar2;
  char cVar3;
  code *pcVar4;
  long lVar5;
  undefined8 uVar6;
  long *plVar7;
  long *plVar8;
  undefined8 uVar9;
  ulong uVar10;
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined3 uStack0000000000000000;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000030;
  long *in_stack_00000038;
  undefined8 uStack0000000000000040;
  long *in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000060;
  
  uVar6 = func_0x00086db4(param_1,"list_files",10);
  uVar6 = func_0x00086db4(uVar6," @ ",3);
  uVar6 = func_0x00086db4(uVar6,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar6 = func_0x00086db4(uVar6,":",1);
  plVar7 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar6,0x135);
  __ZNKSt3__18ios_base6getlocEv(unaff_x29 + -0x58,(long)plVar7 + *(long *)(*plVar7 + -0x18));
  plVar8 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (unaff_x29 + -0x58,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar6 = (**(code **)(*plVar8 + 0x38))(plVar8,10);
  __ZNSt3__16localeD1Ev(unaff_x29 + -0x58);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar7,uVar6);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar7);
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
  *unaff_x19 = 0;
  unaff_x19[1] = 0;
  unaff_x19[2] = 0;
  __ZNSt3__14__fs10filesystem18directory_iteratorC1ERKNS1_4pathEPNS_10error_codeENS1_17directory_optionsE
            (&uStack0000000000000040,&uStack0000000000000050,0,0);
  plVar7 = in_stack_00000048;
  if (in_stack_00000048 == (long *)0x0) {
    in_stack_00000038 = (long *)0x0;
code_r0x0004f578:
    uStack0000000000000030 = uStack0000000000000040;
  }
  else {
    in_stack_00000048[1] = in_stack_00000048[1] + 1;
    uStack0000000000000030 = uStack0000000000000040;
    in_stack_00000038 = in_stack_00000048;
    if (in_stack_00000048 == (long *)0x0) goto code_r0x0004f578;
    plVar8 = in_stack_00000048 + 1;
    *plVar8 = *plVar8 + 1;
    LOAcquire();
    lVar5 = *plVar8;
    *plVar8 = lVar5 + -1;
    LORelease();
    if (lVar5 == 0) {
      (**(code **)(*in_stack_00000048 + 0x10))(in_stack_00000048);
      __ZNSt3__119__shared_weak_count14__release_weakEv(plVar7);
    }
  }
  while( true ) {
    plVar7 = in_stack_00000038;
    if (uStack0000000000000030 == 0) {
      plVar8 = in_stack_00000048;
      if (in_stack_00000038 != (long *)0x0) {
        LOAcquire();
        lVar5 = in_stack_00000038[1];
        in_stack_00000038[1] = lVar5 + -1;
        LORelease();
        if (lVar5 == 0) {
          (**(code **)(*in_stack_00000038 + 0x10))(in_stack_00000038);
          __ZNSt3__119__shared_weak_count14__release_weakEv(plVar7);
          plVar8 = in_stack_00000048;
        }
      }
      in_stack_00000048 = plVar8;
      if (plVar8 != (long *)0x0) {
        LOAcquire();
        lVar5 = plVar8[1];
        plVar8[1] = lVar5 + -1;
        LORelease();
        if (lVar5 == 0) {
          (**(code **)(*plVar8 + 0x10))(plVar8);
          __ZNSt3__119__shared_weak_count14__release_weakEv(plVar8);
        }
      }
      if (in_stack_00000060._7_1_ < '\0') {
        __ZdlPv(uStack0000000000000050);
      }
      return;
    }
    __ZNKSt3__14__fs10filesystem18directory_iterator13__dereferenceEv(&uStack0000000000000030);
    auVar11 = __ZNKSt3__14__fs10filesystem4path10__filenameEv();
    uVar10 = auVar11._8_8_;
    if (0x7ffffffffffffff7 < uVar10) break;
    if (uVar10 < 0x17) {
      *(char *)(unaff_x29 + -0x41) = auVar11[8];
      lVar5 = unaff_x29 + -0x58;
      if (uVar10 != 0) goto code_r0x0004f634;
    }
    else {
      uVar1 = (uVar10 & 0xfffffffffffffff8) + 8;
      if ((uVar10 | 7) != 0x17) {
        uVar1 = uVar10 | 7;
      }
      lVar5 = __Znwm(uVar1 + 1);
      *(ulong *)(unaff_x29 + -0x50) = uVar10;
      *(ulong *)(unaff_x29 + -0x48) = uVar1 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0x58) = lVar5;
code_r0x0004f634:
      _memmove(lVar5,auVar11._0_8_,uVar10);
    }
    *(undefined1 *)(lVar5 + uVar10) = 0;
    uVar6 = *(undefined8 *)(unaff_x29 + -0x58);
    uVar9 = *(undefined8 *)(unaff_x29 + -0x50);
    uStack0000000000000000 = (undefined3)*(undefined4 *)(unaff_x29 + -0x48);
    cVar3 = *(char *)(unaff_x29 + -0x41);
    uStack0000000000000018 =
         CONCAT17(cVar3,CONCAT43(*(undefined4 *)(unaff_x29 + -0x45),uStack0000000000000000));
    puVar2 = (undefined8 *)unaff_x19[1];
    if (puVar2 < (undefined8 *)unaff_x19[2]) {
      puVar2[2] = uStack0000000000000018;
      puVar2[1] = uVar9;
      *puVar2 = uVar6;
      unaff_x19[1] = puVar2 + 3;
    }
    else {
      uVar9 = func_0x000232b4();
      unaff_x19[1] = uVar9;
      if (cVar3 < '\0') {
        __ZdlPv(uVar6);
      }
    }
    __ZNSt3__14__fs10filesystem18directory_iterator11__incrementEPNS_10error_codeE
              (&uStack0000000000000030,0);
  }
  func_0x0001748c(unaff_x29 + -0x58);
code_r0x0004f7c0:
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x4f7c4);
  (*pcVar4)();
}

