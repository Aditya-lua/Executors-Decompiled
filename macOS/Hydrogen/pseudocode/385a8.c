
undefined8 FUN_000385a8(void)

{
  code *pcVar1;
  int iVar2;
  uint uVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  long *plVar7;
  long *plVar8;
  long lVar9;
  int *piVar10;
  long unaff_x19;
  long lVar11;
  undefined1 uStack0000000000000008;
  undefined1 auStack_170 [312];
  long lStack_38;
  
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv();
  iVar2 = func_0x006e2400();
  if (iVar2 == 0) {
    func_0x006e63b0();
LAB_000386d0:
    func_0x006e63b0();
LAB_000386e4:
    func_0x006e63b0();
LAB_000386f8:
    func_0x006e63b0();
LAB_0003870c:
    func_0x006e644c();
LAB_0003871c:
    func_0x006e644c();
  }
  else {
    iVar2 = func_0x006e2400();
    if (iVar2 == 0) goto LAB_000386d0;
    iVar2 = func_0x006e21f8();
    if (iVar2 == -1) goto LAB_000386e4;
    uVar3 = func_0x006e2ab8();
    iVar2 = func_0x006e2ab8();
    if ((int)uVar3 < 1) goto LAB_000386f8;
    if ((uint)((int)((ulong)(*(long *)(unaff_x19 + 0x20) - *(long *)(unaff_x19 + 0x40)) >> 3) *
              -0x33333333) <= uVar3) goto LAB_0003870c;
    plVar7 = (long *)(*(long *)(unaff_x19 + 0x20) + (ulong)uVar3 * -0x28);
    lVar11 = *plVar7;
    if ((int)((ulong)(plVar7[2] - lVar11) >> 4) < iVar2) goto LAB_0003871c;
    func_0x006e2154();
    puVar4 = (undefined8 *)func_0x006e1710();
    piVar10 = (int *)(lVar11 + ((long)iVar2 + -1) * 0x10 + 0xc);
    if (*(int *)((long)puVar4 + 0xc) == *piVar10) {
      *piVar10 = *(int *)((long)puVar4 + 0xc);
      *(undefined8 *)(lVar11 + ((long)iVar2 + -1) * 0x10) = *puVar4;
      return 0;
    }
  }
  uVar5 = func_0x006e63b0();
  __ZNSt3__16localeD1Ev(&uStack0000000000000008);
  uVar5 = __Unwind_Resume(uVar5);
  lStack_38 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar6 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar6 = func_0x00086db4(uVar6,"getupvalues",0xb);
  uVar6 = func_0x00086db4(uVar6," @ ",3);
  uVar6 = func_0x00086db4(uVar6,"/Users/x0rch/hydrogen-m/src/lua/libs/debug.h",0x2c);
  uVar6 = func_0x00086db4(uVar6,":",1);
  plVar7 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar6,0x197);
  __ZNKSt3__18ios_base6getlocEv(auStack_170,(long)plVar7 + *(long *)(*plVar7 + -0x18));
  plVar8 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (auStack_170,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar6 = (**(code **)(*plVar8 + 0x38))(plVar8,10);
  __ZNSt3__16localeD1Ev(auStack_170);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar7,uVar6);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar7);
  iVar2 = func_0x006e2400(uVar5,1);
  if ((iVar2 != 0) || (iVar2 = func_0x006e21f8(uVar5,1), iVar2 == 7)) {
    uVar6 = func_0x0003a4b8(uVar5);
    iVar2 = func_0x006ecb14(uVar5,uVar6,"f",auStack_170);
    if (iVar2 == 0) {
      func_0x006e644c(uVar5,"invalid level passed to getupvalues");
      goto code_r0x00038968;
    }
    iVar2 = func_0x006e21f8(uVar5,0xffffffff);
    if (iVar2 != 7) {
      func_0x006e644c(uVar5,"getupvalues Failed to get closure at this stack level");
      goto code_r0x00038968;
    }
    plVar7 = (long *)func_0x006e1710(uVar5,0xffffffff);
    lVar11 = *plVar7;
    func_0x006e4118(uVar5,0,0);
    if (*(char *)(lVar11 + 4) != '\0') {
      uVar3 = 0;
      do {
        uVar3 = uVar3 + 1;
        lVar9 = func_0x006e5864(uVar5,0xfffffffe,uVar3);
        if (lVar9 != 0) {
          func_0x006e4860(uVar5,0xfffffffe,uVar3);
        }
      } while (uVar3 < *(byte *)(lVar11 + 4));
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
      return 1;
    }
    ___stack_chk_fail();
  }
  func_0x006e63b0(uVar5,1,"getupvalues expected number or closure");
code_r0x00038968:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x3896c);
  (*pcVar1)();
}

