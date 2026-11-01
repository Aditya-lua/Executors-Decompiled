
/* WARNING: Removing unreachable block (ram,0x0003a048) */

undefined8 FUN_00039ea4(undefined8 param_1,long param_2)

{
  code *pcVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  long *plVar5;
  long *plVar6;
  undefined8 *puVar7;
  long lVar8;
  long unaff_x19;
  long unaff_x29;
  undefined1 uStack0000000000000030;
  
  uVar4 = func_0x00086db4(param_1,param_2 + 0xc0c,8);
  uVar4 = func_0x00086db4(uVar4," @ ",3);
  uVar4 = func_0x00086db4(uVar4,"/Users/x0rch/hydrogen-m/src/lua/libs/debug.h",0x2c);
  uVar4 = func_0x00086db4(uVar4,":",1);
  plVar5 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar4,0xce);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000030,(long)plVar5 + *(long *)(*plVar5 + -0x18));
  plVar6 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000030,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar4 = (**(code **)(*plVar6 + 0x38))(plVar6,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000030);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar5,uVar4);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar5);
  iVar2 = func_0x006e2400();
  if ((iVar2 != 0) || (iVar2 = func_0x006e2368(), iVar2 != 0)) {
    iVar2 = func_0x006e2400();
    if (iVar2 == 0) {
      func_0x006e63b0();
      goto code_r0x0003a164;
    }
    iVar2 = func_0x006e2ab8();
    func_0x0003a4b8();
    iVar3 = func_0x006ecb14();
    if (iVar3 == 0) {
      func_0x006e644c();
      goto code_r0x0003a164;
    }
    iVar3 = func_0x006e2368();
    if (iVar3 == 0) {
      func_0x006e644c();
      goto code_r0x0003a164;
    }
    plVar5 = (long *)func_0x006e1710();
    if ((iVar2 < 1) || (*(int *)(*(long *)(*plVar5 + 0x18) + 0x8c) < iVar2)) {
      func_0x006e644c();
      goto code_r0x0003a164;
    }
    iVar2 = func_0x006e21f8();
    if ((iVar2 == 1) && (iVar2 = func_0x006e2c48(), iVar2 != 0)) {
      func_0x006e4118();
      func_0x006f410c();
    }
    else {
      func_0x006e17a8();
      func_0x0003ab60();
      uVar4 = func_0x006ef684();
      puVar7 = *(undefined8 **)(unaff_x19 + 8);
      *puVar7 = uVar4;
      *(undefined4 *)((long)puVar7 + 0xc) = 7;
      lVar8 = *(long *)(unaff_x19 + 8);
      if (*(long *)(unaff_x19 + 0x28) - lVar8 < 0x11) {
        func_0x006ee1d4();
        lVar8 = *(long *)(unaff_x19 + 8);
      }
      *(long *)(unaff_x19 + 8) = lVar8 + 0x10;
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
      return 1;
    }
    ___stack_chk_fail();
  }
  func_0x006e63b0();
code_r0x0003a164:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x3a168);
  (*pcVar1)();
}

