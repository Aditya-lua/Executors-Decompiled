
undefined8 FUN_00038970(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long *plVar5;
  long *plVar6;
  undefined8 uVar7;
  long lVar8;
  undefined1 auStack_188 [24];
  undefined8 ***apppuStack_170 [2];
  char cStack_159;
  long lStack_38;
  
  __ZNSt3__16localeD1Ev();
  __Unwind_Resume();
  uVar3 = __Unwind_Resume();
  lStack_38 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar4 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar4 = func_0x00086db4(uVar4,"getupvalue",10);
  uVar4 = func_0x00086db4(uVar4," @ ",3);
  uVar4 = func_0x00086db4(uVar4,"/Users/x0rch/hydrogen-m/src/lua/libs/debug.h",0x2c);
  uVar4 = func_0x00086db4(uVar4,":",1);
  plVar5 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar4,0x1b1);
  __ZNKSt3__18ios_base6getlocEv(apppuStack_170,(long)plVar5 + *(long *)(*plVar5 + -0x18));
  plVar6 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (apppuStack_170,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar4 = (**(code **)(*plVar6 + 0x38))(plVar6,10);
  __ZNSt3__16localeD1Ev(apppuStack_170);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar5,uVar4);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar5);
  iVar2 = func_0x006e2400(uVar3,1);
  if ((iVar2 != 0) || (iVar2 = func_0x006e21f8(uVar3,1), iVar2 == 7)) {
    iVar2 = func_0x006e2400(uVar3,2);
    if (iVar2 == 0) {
      func_0x006e63b0(uVar3,2,"getupvalue Expected Number");
      goto code_r0x00038bd8;
    }
    uVar4 = func_0x006e2ab8(uVar3,2,0);
    uVar7 = func_0x0003a4b8(uVar3);
    iVar2 = func_0x006ecb14(uVar3,uVar7,"f",apppuStack_170);
    if (iVar2 == 0) {
      func_0x006e644c(uVar3,"invalid level passed to getupvalue");
      goto code_r0x00038bd8;
    }
    iVar2 = func_0x006e21f8(uVar3,0xffffffff);
    if (iVar2 != 7) {
      func_0x006e644c(uVar3,"getupvalue Failed to get closure at this stack level");
      goto code_r0x00038bd8;
    }
    lVar8 = func_0x006e5864(uVar3,0xffffffff,uVar4);
    if (lVar8 == 0) {
      func_0x006e644c(uVar3,"getupvalue Invalid index");
      goto code_r0x00038bd8;
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
      return 1;
    }
    ___stack_chk_fail();
  }
  func_0x0000a968(auStack_188,"getupvalue expected type number or closure, got");
  uVar4 = func_0x006e21f8(uVar3,1);
  uVar4 = func_0x006e22ac(uVar3,uVar4);
  func_0x0003a638(apppuStack_170,auStack_188,uVar4);
  if (-1 < cStack_159) {
    apppuStack_170[0] = apppuStack_170;
  }
  func_0x006e63b0(uVar3,1,apppuStack_170[0]);
code_r0x00038bd8:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x38bdc);
  (*pcVar1)();
}

