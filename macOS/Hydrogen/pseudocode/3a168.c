
undefined8 FUN_0003a168(undefined8 param_1)

{
  undefined1 uVar1;
  code *pcVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  long *plVar6;
  long *plVar7;
  undefined8 *puVar8;
  long lVar9;
  long lVar10;
  undefined8 uVar11;
  long lVar12;
  long in_stack_00000010;
  undefined1 auStack_190 [312];
  long lStack_58;
  
  if (in_stack_00000010 != 0) {
    __ZdlPv();
    param_1 = __Unwind_Resume(param_1);
  }
  lVar4 = __Unwind_Resume(param_1);
  lStack_58 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar5 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar5 = func_0x00086db4(uVar5,"getprotos",9);
  uVar5 = func_0x00086db4(uVar5," @ ",3);
  uVar5 = func_0x00086db4(uVar5,"/Users/x0rch/hydrogen-m/src/lua/libs/debug.h",0x2c);
  uVar5 = func_0x00086db4(uVar5,":",1);
  plVar6 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar5,0x11d);
  __ZNKSt3__18ios_base6getlocEv(auStack_190,(long)plVar6 + *(long *)(*plVar6 + -0x18));
  plVar7 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (auStack_190,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar5 = (**(code **)(*plVar7 + 0x38))(plVar7,10);
  __ZNSt3__16localeD1Ev(auStack_190);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar6,uVar5);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar6);
  iVar3 = func_0x006e2400(lVar4,1);
  if ((iVar3 == 0) && (iVar3 = func_0x006e2368(lVar4,1), iVar3 == 0)) {
    func_0x006e63b0(lVar4,1,"invalid argument #1 expected number or lua closure");
    goto LAB_0003a49c;
  }
  iVar3 = func_0x006e2400(lVar4,1);
  if (iVar3 == 0) {
    func_0x006e69bc(lVar4,1,7);
    plVar6 = (long *)func_0x006e1710(lVar4,1);
    if (*(char *)(*plVar6 + 3) != '\0') {
      func_0x006e63b0(lVar4,1,"stack points to a C closure, Lua closure expected!");
      goto LAB_0003a49c;
    }
    func_0x006e2154(lVar4,1);
LAB_0003a380:
    plVar6 = (long *)func_0x006e1710(lVar4,0xffffffff);
    lVar9 = *plVar6;
    func_0x006e4118(lVar4,0,0);
    lVar12 = *(long *)(lVar9 + 0x18);
    if (0 < *(int *)(lVar12 + 0x8c)) {
      lVar10 = 0;
      do {
        uVar1 = *(undefined1 *)(*(long *)(*(long *)(lVar12 + 0x18) + lVar10 * 8) + 3);
        uVar11 = *(undefined8 *)(lVar9 + 0x10);
        uVar5 = func_0x0003ab60(lVar4);
        uVar5 = func_0x006ef684(lVar4,uVar1,uVar11,uVar5);
        puVar8 = *(undefined8 **)(lVar4 + 8);
        *puVar8 = uVar5;
        *(undefined4 *)((long)puVar8 + 0xc) = 7;
        *(long *)(lVar4 + 8) = *(long *)(lVar4 + 8) + 0x10;
        lVar10 = lVar10 + 1;
        func_0x006e4860(lVar4,0xfffffffe,lVar10);
      } while (lVar10 < *(int *)(lVar12 + 0x8c));
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_58) {
      return 1;
    }
    ___stack_chk_fail();
  }
  else {
    iVar3 = func_0x006e2ab8(lVar4,1,0);
    if (-1 < iVar3) {
      lVar9 = (long)iVar3;
      if (lVar9 < (*(long *)(lVar4 + 0x20) - *(long *)(lVar4 + 0x40) >> 3) * -0x3333333333333333) {
        func_0x006ecb14(lVar4,lVar9,"f",auStack_190);
        if (*(char *)(**(long **)(*(long *)(lVar4 + 0x20) + lVar9 * -0x28 + 8) + 3) != '\0') {
          func_0x006e63b0(lVar4,1,"Stack level is a C closure. Lua closure expected.");
          goto LAB_0003a49c;
        }
        goto LAB_0003a380;
      }
    }
  }
  func_0x006e63b0(lVar4,1,"stack out of range.");
LAB_0003a49c:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x3a4a0);
  (*pcVar2)();
}

