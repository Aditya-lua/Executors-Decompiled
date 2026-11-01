
undefined8 FUN_000220ec(void)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  undefined4 uVar4;
  undefined8 uVar5;
  long *plVar6;
  long *plVar7;
  ulong uVar8;
  undefined8 uVar9;
  long lVar10;
  long *unaff_x22;
  long lVar11;
  undefined *puVar12;
  code *pcVar13;
  undefined1 auVar14 [16];
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 auStack_a8 [8];
  undefined1 auStack_38 [8];
  long *plStack_30;
  long lStack_28;
  long *plStack_20;
  undefined8 uStack_18;
  
  uVar5 = func_0x00086db4();
  uVar5 = func_0x00086db4(uVar5,"/Users/x0rch/hydrogen-m/src/lua/libs/misc.h",0x2b);
  uVar5 = func_0x00086db4(uVar5,":",1);
  plVar6 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar5,0x41c);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000008,(long)plVar6 + *(long *)(*plVar6 + -0x18));
  plVar7 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000008,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar5 = (**(code **)(*plVar7 + 0x38))(plVar7,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000008);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar6,uVar5);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar6);
  func_0x006e69bc();
  plVar7 = (long *)func_0x006e33ec();
  lVar10 = *plVar7;
  if (lVar10 == 0) {
    func_0x006e644c();
  }
  else {
    func_0x006e67c8();
    auVar14 = func_0x00022f2c();
    plVar7 = auVar14._0_8_;
    if ((auVar14._8_8_ & 0xff) != 0) {
      _printf("prop_desc: %p\n");
      uVar8 = func_0x0000b86c(plVar7);
      unaff_x22 = plVar7;
      if ((uVar8 & 1) != 0) {
        uVar8 = func_0x0002305c(plVar7);
        iVar2 = *(int *)(plVar7[0xc] + 0x30);
        pcVar13 = *(code **)(*plVar7 + 0xa0);
        _printf("prop_id: %d\n");
        _printf("vftable_func: %p\n");
        _printf("property: %s\n");
        if (iVar2 == 0x1d) {
          in_stack_00000028 = 0;
          in_stack_00000020 = 0;
          in_stack_00000038 = 0;
          in_stack_00000030 = 0;
          in_stack_00000018 = 0;
          in_stack_00000010 = 0;
          uStack0000000000000008 = (*pcRam0000000000a279f8)();
          (*pcVar13)(plVar7,lVar10,&uStack0000000000000008);
          func_0x006e3870();
        }
        else if (iVar2 == 0x1e) {
          func_0x006e383c();
        }
        else if (iVar2 == 0x3d) {
          in_stack_00000028 = 0;
          in_stack_00000020 = 0;
          in_stack_00000038 = 0;
          in_stack_00000030 = 0;
          in_stack_00000018 = 0;
          in_stack_00000010 = 0;
          uStack0000000000000008 = (*pcRam0000000000a279f8)();
          (*pcVar13)(plVar7,lVar10,&uStack0000000000000008);
          if (in_stack_00000018 == 0) {
            func_0x006e383c();
            return 1;
          }
          func_0x006e38d8();
        }
        else if ((uVar8 & 1) == 0) {
          func_0x0002319c(plVar7,1);
          func_0x006e3d18();
          func_0x0002319c(plVar7,0);
        }
        else {
          func_0x006e3d18();
        }
        func_0x006e3c24();
        return 2;
      }
      goto LAB_00022378;
    }
  }
  func_0x00023168();
LAB_00022378:
  uVar5 = func_0x006e644c();
  __ZNSt3__16localeD1Ev(&uStack0000000000000008);
  uVar9 = __Unwind_Resume(uVar5);
  plStack_30 = unaff_x22;
  lStack_28 = lVar10;
  plStack_20 = plVar6;
  uStack_18 = uVar5;
  uVar5 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar5 = func_0x00086db4(uVar5,"sethiddenproperty",0x11);
  uVar5 = func_0x00086db4(uVar5," @ ",3);
  uVar5 = func_0x00086db4(uVar5,"/Users/x0rch/hydrogen-m/src/lua/libs/misc.h",0x2b);
  uVar5 = func_0x00086db4(uVar5,":",1);
  plVar6 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar5,0x496);
  __ZNKSt3__18ios_base6getlocEv(auStack_38,(long)plVar6 + *(long *)(*plVar6 + -0x18));
  plVar7 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (auStack_38,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar5 = (**(code **)(*plVar7 + 0x38))(plVar7,10);
  __ZNSt3__16localeD1Ev(auStack_38);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar6,uVar5);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar6);
  func_0x006e69bc(uVar9,1,8);
  plVar6 = (long *)func_0x006e33ec(uVar9,1);
  lVar10 = *plVar6;
  if (lVar10 == 0) {
    func_0x006e644c(uVar9,"instance expected, got userdata");
  }
  else {
    uVar5 = func_0x006e67c8(uVar9,2,0);
    func_0x006e6a04(uVar9,3);
    auVar14 = func_0x00022f2c(uVar9,uVar5,lVar10);
    if ((auVar14._8_8_ & 0xff) != 0) {
      uVar1 = func_0x0002305c();
      if ((uVar1 & 1) == 0) {
        func_0x0002319c(auVar14._0_8_,1);
        func_0x006e2154(uVar9,3);
        func_0x006e45a4(uVar9,1,uVar5);
        func_0x0002319c(auVar14._0_8_,0);
      }
      else {
        func_0x006e2154(uVar9,3);
        func_0x006e45a4(uVar9,1,uVar5);
      }
      func_0x006e3c24(uVar9,uVar1 ^ 1);
      return 1;
    }
  }
  uVar5 = func_0x006e644c(uVar9,"Invalid Property: \"%s\"");
  __ZNSt3__16localeD1Ev(auStack_38);
  uVar5 = __Unwind_Resume(uVar5);
  uVar9 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar9 = func_0x00086db4(uVar9,"getconnections",0xe);
  uVar9 = func_0x00086db4(uVar9," @ ",3);
  uVar9 = func_0x00086db4(uVar9,"/Users/x0rch/hydrogen-m/src/lua/libs/misc.h",0x2b);
  uVar9 = func_0x00086db4(uVar9,":",1);
  plVar7 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar9,0x68f);
  __ZNKSt3__18ios_base6getlocEv(auStack_a8,(long)plVar7 + *(long *)(*plVar7 + -0x18));
  plVar6 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (auStack_a8,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  plVar6 = (long *)(**(code **)(*plVar6 + 0x38))(plVar6,10);
  __ZNSt3__16localeD1Ev(auStack_a8);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar7,plVar6);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar7);
  func_0x006e69bc(uVar5,1,8);
  func_0x006e3d18(uVar5,1,"Connect");
  iVar2 = func_0x006e21f8(uVar5,0xffffffff);
  if (iVar2 != 7) goto code_r0x000228ec;
  plVar7 = (long *)func_0x006e1c18(uVar5,1);
  func_0x006e2154(uVar5,1);
  func_0x006e3af8(uVar5,&DAT_000278a0,0,0,0);
  func_0x006e4c80(uVar5,2,1);
  iVar2 = func_0x006e2570(uVar5,0xffffffff);
  if (iVar2 == 0) goto code_r0x000228dc;
  plVar6 = (long *)0xa28000;
  if ((bRam0000000000a28a90 & 1) == 0) goto code_r0x000228fc;
code_r0x0002270c:
  if (((int)plVar6[0x151] != -1) && (lVar10 = func_0x006e33ec(uVar5,0xffffffff), lVar10 != 0)) {
    plVar6 = (long *)func_0x006e33ec(uVar5,0xffffffff);
    plVar6 = (long *)*plVar6;
    uVar8 = func_0x0000b86c(plVar6);
    if ((uVar8 & 1) != 0) {
      plVar6 = plVar6 + 2;
      uVar8 = func_0x0000b86c(plVar6);
      if ((uVar8 & 1) != 0) goto code_r0x00022754;
    }
  }
code_r0x000228dc:
  func_0x006e644c(uVar5,"Temp connection is not valid");
code_r0x000228ec:
  func_0x006e644c(uVar5,"Getconnections failed to make temp connection");
code_r0x000228fc:
  iVar2 = ___cxa_guard_acquire(0xa28a90);
  if (iVar2 != 0) {
    uVar4 = func_0x006e353c(uVar5,0xffffffff);
    *(undefined4 *)(plVar6 + 0x151) = uVar4;
    ___cxa_guard_release(0xa28a90);
  }
  goto code_r0x0002270c;
code_r0x00022754:
  lVar10 = *plVar6;
  func_0x006e4118(uVar5,0,0);
  if (lVar10 != 0) {
    iVar2 = 1;
    do {
      iVar3 = func_0x0000b86c(lVar10);
      if (iVar3 == 0) break;
      iVar3 = func_0x0000b86c(*(undefined8 *)(lVar10 + 0x30));
      if ((iVar3 == 0) ||
         (uVar8 = func_0x0000b86c(*(undefined8 *)(*(long *)(lVar10 + 0x30) + 0x70)),
         (uVar8 & 1) == 0)) {
        plVar6 = (long *)func_0x006e5610(uVar5,0x10,0);
        *plVar6 = lVar10;
        *(undefined2 *)((long)plVar6 + 0xc) = 0x100;
        puVar12 = &DAT_000272a8;
      }
      else {
        lVar11 = *(long *)(*(long *)(*(long *)(lVar10 + 0x30) + 0x70) + 8);
        plVar6 = (long *)func_0x006e5610(uVar5,0x10,0);
        *plVar6 = lVar10;
        *(undefined1 *)((long)plVar6 + 0xc) = 1;
        *(bool *)((long)plVar6 + 0xd) =
             *(long *)(lVar11 + 0x18) != *(long *)(lRam0000000000a332a0 + 0x18);
        puVar12 = &DAT_0002752c;
      }
      *(int *)(plVar6 + 1) = (int)plVar7;
      func_0x006e4118(uVar5,0,0);
      func_0x006e3af8(uVar5,puVar12,0,0,0);
      func_0x006e45a4(uVar5,0xfffffffe,"__index");
      func_0x006e4a40(uVar5,0xfffffffe);
      func_0x006e4860(uVar5,0xfffffffe,iVar2);
      lVar10 = *(long *)(lVar10 + 0x10);
      iVar2 = iVar2 + 1;
    } while (lVar10 != 0);
  }
  func_0x006e3d18(uVar5,0xfffffffe,"Disconnect");
  func_0x006e2154(uVar5,0xfffffffd);
  func_0x006e4c80(uVar5,1,0);
  return 1;
}

