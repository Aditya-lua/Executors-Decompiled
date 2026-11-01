
undefined8 FUN_0004bc4c(undefined8 param_1)

{
  ulong uVar1;
  long lVar2;
  code *pcVar3;
  int iVar4;
  int iVar5;
  undefined8 uVar6;
  long *plVar7;
  long *plVar8;
  ulong uVar9;
  undefined8 *puVar10;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000030;
  undefined7 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined1 uStack0000000000000060;
  long in_stack_000000c0;
  undefined8 uStack00000000000001e0;
  
  uVar6 = func_0x00086db4(param_1," @ ",3);
  uVar6 = func_0x00086db4(uVar6,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar6 = func_0x00086db4(uVar6,":",1);
  plVar7 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar6,0xb2);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000040,(long)plVar7 + *(long *)(*plVar7 + -0x18));
  plVar8 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000040,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar6 = (**(code **)(*plVar8 + 0x38))(plVar8,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000040);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar7,uVar6);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar7);
  uVar6 = func_0x006e67c8();
  uVar9 = _strlen();
  if (uVar9 < 0x7ffffffffffffff8) {
    if (uVar9 < 0x17) {
      _uStack0000000000000038 = CONCAT17((char)uVar9,uStack0000000000000038);
      puVar10 = &uStack0000000000000028;
      if (uVar9 != 0) goto code_r0x0004bd4c;
    }
    else {
      uVar1 = (uVar9 & 0xfffffffffffffff8) + 8;
      if ((uVar9 | 7) != 0x17) {
        uVar1 = uVar9 | 7;
      }
      puVar10 = (undefined8 *)__Znwm(uVar1 + 1);
      _uStack0000000000000038 = uVar1 + 1 | 0x8000000000000000;
      uStack0000000000000028 = puVar10;
      in_stack_00000030 = uVar9;
code_r0x0004bd4c:
      _memmove(puVar10,uVar6,uVar9);
    }
    *(undefined1 *)((long)puVar10 + uVar9) = 0;
    in_stack_00000020 = 0;
    uVar6 = func_0x006e67c8();
    func_0x0004dd60(&uStack0000000000000008);
    func_0x0004eec4(&uStack0000000000000040,&uStack0000000000000008,5);
    if (in_stack_000000c0 == 0) {
      func_0x006e644c();
      goto code_r0x0004befc;
    }
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5writeEPKcl
              (&uStack0000000000000040,uVar6,in_stack_00000020);
    lVar2 = in_stack_000000c0;
    if (in_stack_000000c0 == 0) {
code_r0x0004be08:
      __ZNSt3__18ios_base5clearEj
                ((long)&uStack0000000000000040 + *(long *)(uStack0000000000000040 + -0x18),
                 *(uint *)(&uStack0000000000000060 + *(long *)(uStack0000000000000040 + -0x18)) | 4)
      ;
    }
    else {
      iVar4 = (**(code **)(uStack0000000000000048 + 0x30))(&uStack0000000000000048);
      iVar5 = _fclose(lVar2);
      in_stack_000000c0 = 0;
      (**(code **)(uStack0000000000000048 + 0x18))(&uStack0000000000000048,0,0);
      if (iVar5 != 0 || iVar4 != 0) goto code_r0x0004be08;
    }
    uStack0000000000000040 = &UNK_009b7a40;
    uStack00000000000001e0 = &UNK_009b7a68;
    func_0x0001aa68(&uStack0000000000000048);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000040,&UNK_009b7a80);
    __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(&uStack00000000000001e0);
    if (in_stack_00000018._7_1_ < '\0') {
      __ZdlPv(uStack0000000000000008);
      if ((long)_uStack0000000000000038 < 0) goto code_r0x0004bebc;
code_r0x0004be78:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
        return 0;
      }
    }
    else {
      if (-1 < (long)_uStack0000000000000038) goto code_r0x0004be78;
code_r0x0004bebc:
      __ZdlPv(uStack0000000000000028);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
        return 0;
      }
    }
    ___stack_chk_fail();
  }
  func_0x0001748c(&uStack0000000000000028);
code_r0x0004befc:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x4bf00);
  (*pcVar3)();
}

