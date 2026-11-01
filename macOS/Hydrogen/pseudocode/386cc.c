
undefined8 FUN_000386cc(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long *plVar5;
  long *plVar6;
  long lVar7;
  uint uVar8;
  long lVar9;
  undefined1 uStack0000000000000008;
  undefined1 auStack_170 [312];
  long lStack_38;
  
  func_0x006e63b0();
  func_0x006e63b0();
  func_0x006e63b0();
  func_0x006e63b0();
  func_0x006e644c();
  func_0x006e644c();
  uVar3 = func_0x006e63b0();
  __ZNSt3__16localeD1Ev(&uStack0000000000000008);
  uVar3 = __Unwind_Resume(uVar3);
  lStack_38 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar4 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar4 = func_0x00086db4(uVar4,"getupvalues",0xb);
  uVar4 = func_0x00086db4(uVar4," @ ",3);
  uVar4 = func_0x00086db4(uVar4,"/Users/x0rch/hydrogen-m/src/lua/libs/debug.h",0x2c);
  uVar4 = func_0x00086db4(uVar4,":",1);
  plVar5 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar4,0x197);
  __ZNKSt3__18ios_base6getlocEv(auStack_170,(long)plVar5 + *(long *)(*plVar5 + -0x18));
  plVar6 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (auStack_170,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar4 = (**(code **)(*plVar6 + 0x38))(plVar6,10);
  __ZNSt3__16localeD1Ev(auStack_170);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar5,uVar4);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar5);
  iVar2 = func_0x006e2400(uVar3,1);
  if ((iVar2 != 0) || (iVar2 = func_0x006e21f8(uVar3,1), iVar2 == 7)) {
    uVar4 = func_0x0003a4b8(uVar3);
    iVar2 = func_0x006ecb14(uVar3,uVar4,"f",auStack_170);
    if (iVar2 == 0) {
      func_0x006e644c(uVar3,"invalid level passed to getupvalues");
      goto code_r0x00038968;
    }
    iVar2 = func_0x006e21f8(uVar3,0xffffffff);
    if (iVar2 != 7) {
      func_0x006e644c(uVar3,"getupvalues Failed to get closure at this stack level");
      goto code_r0x00038968;
    }
    plVar5 = (long *)func_0x006e1710(uVar3,0xffffffff);
    lVar9 = *plVar5;
    func_0x006e4118(uVar3,0,0);
    if (*(char *)(lVar9 + 4) != '\0') {
      uVar8 = 0;
      do {
        uVar8 = uVar8 + 1;
        lVar7 = func_0x006e5864(uVar3,0xfffffffe,uVar8);
        if (lVar7 != 0) {
          func_0x006e4860(uVar3,0xfffffffe,uVar8);
        }
      } while (uVar8 < *(byte *)(lVar9 + 4));
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
      return 1;
    }
    ___stack_chk_fail();
  }
  func_0x006e63b0(uVar3,1,"getupvalues expected number or closure");
code_r0x00038968:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x3896c);
  (*pcVar1)();
}

