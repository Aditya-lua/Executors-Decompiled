
undefined8 FUN_00038674(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long *plVar6;
  long *plVar7;
  long lVar8;
  int *piVar9;
  uint uVar10;
  long unaff_x20;
  long unaff_x21;
  long lVar11;
  undefined1 uStack0000000000000008;
  undefined1 auStack_170 [312];
  long lStack_38;
  
  puVar3 = (undefined8 *)func_0x006e1710();
  piVar9 = (int *)(unaff_x20 + unaff_x21 * 0x10 + 0xc);
  if (*(int *)((long)puVar3 + 0xc) == *piVar9) {
    *piVar9 = *(int *)((long)puVar3 + 0xc);
    *(undefined8 *)(unaff_x20 + unaff_x21 * 0x10) = *puVar3;
    return 0;
  }
  uVar4 = func_0x006e63b0();
  __ZNSt3__16localeD1Ev(&uStack0000000000000008);
  uVar4 = __Unwind_Resume(uVar4);
  lStack_38 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar5 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar5 = func_0x00086db4(uVar5,"getupvalues",0xb);
  uVar5 = func_0x00086db4(uVar5," @ ",3);
  uVar5 = func_0x00086db4(uVar5,"/Users/x0rch/hydrogen-m/src/lua/libs/debug.h",0x2c);
  uVar5 = func_0x00086db4(uVar5,":",1);
  plVar6 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar5,0x197);
  __ZNKSt3__18ios_base6getlocEv(auStack_170,(long)plVar6 + *(long *)(*plVar6 + -0x18));
  plVar7 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (auStack_170,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar5 = (**(code **)(*plVar7 + 0x38))(plVar7,10);
  __ZNSt3__16localeD1Ev(auStack_170);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar6,uVar5);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar6);
  iVar2 = func_0x006e2400(uVar4,1);
  if ((iVar2 != 0) || (iVar2 = func_0x006e21f8(uVar4,1), iVar2 == 7)) {
    uVar5 = func_0x0003a4b8(uVar4);
    iVar2 = func_0x006ecb14(uVar4,uVar5,"f",auStack_170);
    if (iVar2 == 0) {
      func_0x006e644c(uVar4,"invalid level passed to getupvalues");
      goto code_r0x00038968;
    }
    iVar2 = func_0x006e21f8(uVar4,0xffffffff);
    if (iVar2 != 7) {
      func_0x006e644c(uVar4,"getupvalues Failed to get closure at this stack level");
      goto code_r0x00038968;
    }
    plVar6 = (long *)func_0x006e1710(uVar4,0xffffffff);
    lVar11 = *plVar6;
    func_0x006e4118(uVar4,0,0);
    if (*(char *)(lVar11 + 4) != '\0') {
      uVar10 = 0;
      do {
        uVar10 = uVar10 + 1;
        lVar8 = func_0x006e5864(uVar4,0xfffffffe,uVar10);
        if (lVar8 != 0) {
          func_0x006e4860(uVar4,0xfffffffe,uVar10);
        }
      } while (uVar10 < *(byte *)(lVar11 + 4));
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
      return 1;
    }
    ___stack_chk_fail();
  }
  func_0x006e63b0(uVar4,1,"getupvalues expected number or closure");
code_r0x00038968:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x3896c);
  (*pcVar1)();
}

