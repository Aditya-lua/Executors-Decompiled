
undefined8 FUN_0004bbe4(void)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  int iVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  long *plVar7;
  long *plVar8;
  ulong uVar9;
  undefined8 *******pppppppuVar10;
  undefined8 auStack_2b8 [2];
  char cStack_2a1;
  undefined8 uStack_2a0;
  undefined8 *******pppppppuStack_298;
  ulong uStack_290;
  undefined8 uStack_288;
  undefined *puStack_280;
  long alStack_278 [3];
  uint auStack_260 [24];
  long lStack_200;
  undefined *apuStack_e0 [19];
  long lStack_48;
  
  uVar5 = __Unwind_Resume();
  uVar5 = __Unwind_Resume(uVar5);
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar6 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar6 = func_0x00086db4(uVar6,"appendfile",10);
  uVar6 = func_0x00086db4(uVar6," @ ",3);
  uVar6 = func_0x00086db4(uVar6,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar6 = func_0x00086db4(uVar6,":",1);
  plVar7 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar6,0xb2);
  __ZNKSt3__18ios_base6getlocEv(&puStack_280,(long)plVar7 + *(long *)(*plVar7 + -0x18));
  plVar8 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&puStack_280,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar6 = (**(code **)(*plVar8 + 0x38))(plVar8,10);
  __ZNSt3__16localeD1Ev(&puStack_280);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar7,uVar6);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar7);
  uVar6 = func_0x006e67c8(uVar5,1,0);
  uVar9 = _strlen();
  if (uVar9 < 0x7ffffffffffffff8) {
    if (uVar9 < 0x17) {
      uStack_288 = CONCAT17((char)uVar9,(undefined7)uStack_288);
      pppppppuVar10 = &pppppppuStack_298;
      if (uVar9 != 0) goto code_r0x0004bd4c;
    }
    else {
      uVar1 = (uVar9 & 0xfffffffffffffff8) + 8;
      if ((uVar9 | 7) != 0x17) {
        uVar1 = uVar9 | 7;
      }
      pppppppuVar10 = (undefined8 *******)__Znwm(uVar1 + 1);
      uStack_288 = uVar1 + 1 | 0x8000000000000000;
      pppppppuStack_298 = pppppppuVar10;
      uStack_290 = uVar9;
code_r0x0004bd4c:
      _memmove(pppppppuVar10,uVar6,uVar9);
    }
    *(undefined1 *)((long)pppppppuVar10 + uVar9) = 0;
    uStack_2a0 = 0;
    uVar6 = func_0x006e67c8(uVar5,2,&uStack_2a0);
    func_0x0004dd60(auStack_2b8,uVar5,&pppppppuStack_298,0);
    func_0x0004eec4(&puStack_280,auStack_2b8,5);
    if (lStack_200 == 0) {
      func_0x006e644c(uVar5,"Failed to open file");
      goto code_r0x0004befc;
    }
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5writeEPKcl(&puStack_280,uVar6,uStack_2a0);
    if (lStack_200 == 0) {
code_r0x0004be08:
      __ZNSt3__18ios_base5clearEj
                ((long)alStack_278 + *(long *)(puStack_280 + -0x18) + -8,
                 *(uint *)((long)auStack_260 + *(long *)(puStack_280 + -0x18)) | 4);
    }
    else {
      iVar3 = (**(code **)(alStack_278[0] + 0x30))(alStack_278);
      iVar4 = _fclose(lStack_200);
      lStack_200 = 0;
      (**(code **)(alStack_278[0] + 0x18))(alStack_278,0,0);
      if (iVar4 != 0 || iVar3 != 0) goto code_r0x0004be08;
    }
    puStack_280 = &UNK_009b7a40;
    apuStack_e0[0] = &UNK_009b7a68;
    func_0x0001aa68(alStack_278);
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED2Ev(&puStack_280,&UNK_009b7a80);
    __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(apuStack_e0);
    if (cStack_2a1 < '\0') {
      __ZdlPv(auStack_2b8[0]);
      if ((long)uStack_288 < 0) goto code_r0x0004bebc;
code_r0x0004be78:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
        return 0;
      }
    }
    else {
      if (-1 < (long)uStack_288) goto code_r0x0004be78;
code_r0x0004bebc:
      __ZdlPv(pppppppuStack_298);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
        return 0;
      }
    }
    ___stack_chk_fail();
  }
  func_0x0001748c(&pppppppuStack_298);
code_r0x0004befc:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4bf00);
  (*pcVar2)();
}

