
/* WARNING: Removing unreachable block (ram,0x0003a048) */

undefined8 FUN_00039efc(void)

{
  code *pcVar1;
  int iVar2;
  int iVar3;
  long *plVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  long lVar7;
  long unaff_x19;
  long unaff_x29;
  undefined1 uStack0000000000000030;
  
  __ZNKSt3__18ios_base6getlocEv();
  plVar4 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000030,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  (**(code **)(*plVar4 + 0x38))(plVar4,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000030);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv();
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
    plVar4 = (long *)func_0x006e1710();
    if ((iVar2 < 1) || (*(int *)(*(long *)(*plVar4 + 0x18) + 0x8c) < iVar2)) {
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
      uVar5 = func_0x006ef684();
      puVar6 = *(undefined8 **)(unaff_x19 + 8);
      *puVar6 = uVar5;
      *(undefined4 *)((long)puVar6 + 0xc) = 7;
      lVar7 = *(long *)(unaff_x19 + 8);
      if (*(long *)(unaff_x19 + 0x28) - lVar7 < 0x11) {
        func_0x006ee1d4();
        lVar7 = *(long *)(unaff_x19 + 8);
      }
      *(long *)(unaff_x19 + 8) = lVar7 + 0x10;
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

