
/* WARNING: Type propagation algorithm not settling */

undefined8 * FUN_0003e200(void)

{
  ulong uVar1;
  undefined8 *******pppppppuVar2;
  code *pcVar3;
  uint uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  long *plVar7;
  long *plVar8;
  long lVar9;
  undefined8 *puVar10;
  undefined1 *unaff_x20;
  ulong uVar11;
  long unaff_x29;
  undefined1 auVar12 [12];
  undefined8 *******pppppppuStack_e8;
  ulong uStack_e0;
  ulong uStack_d8;
  undefined8 uStack_c8;
  ulong uStack_c0;
  long lStack_b8;
  undefined *puStack_b0;
  undefined *puStack_a8;
  long *plStack_98;
  long lStack_48;
  
  unaff_x20[0x16] = 0;
  unaff_x20[0x15] = 0;
  unaff_x20[0x14] = 0;
  unaff_x20[0x13] = 0;
  unaff_x20[0x12] = 0;
  unaff_x20[0x11] = 0;
  unaff_x20[0x10] = 0;
  unaff_x20[0xf] = 0;
  unaff_x20[0xe] = 0;
  unaff_x20[0xd] = 0;
  unaff_x20[0xc] = 0;
  unaff_x20[0xb] = 0;
  unaff_x20[10] = 0;
  unaff_x20[9] = 0;
  unaff_x20[8] = 0;
  unaff_x20[7] = 0;
  unaff_x20[6] = 0;
  unaff_x20[5] = 0;
  unaff_x20[4] = 0;
  unaff_x20[3] = 0;
  unaff_x20[2] = 0;
  unaff_x20[1] = 0;
  *unaff_x20 = 0;
  func_0x00611644();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return (undefined8 *)((long)&MACH_HEADER.magic + 1);
  }
  auVar12 = ___stack_chk_fail();
  uVar5 = auVar12._0_8_;
  if (auVar12._8_4_ != 0) {
    uVar5 = func_0x0001753c(uVar5);
  }
  uVar5 = __Unwind_Resume(uVar5);
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar6 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar6 = func_0x00086db4(uVar6,"crypt_generatebytes",0x13);
  uVar6 = func_0x00086db4(uVar6," @ ",3);
  uVar6 = func_0x00086db4(uVar6,"/Users/x0rch/hydrogen-m/src/lua/libs/crypt.h",0x2c);
  uVar6 = func_0x00086db4(uVar6,":",1);
  plVar7 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar6,0x23e);
  __ZNKSt3__18ios_base6getlocEv(&puStack_b0,(long)plVar7 + *(long *)(*plVar7 + -0x18));
  plVar8 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&puStack_b0,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar6 = (**(code **)(*plVar8 + 0x38))(plVar8,10);
  __ZNSt3__16localeD1Ev(&puStack_b0);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar7,uVar6);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar7);
  uVar4 = func_0x006e6bc0(uVar5,1);
  if (uVar4 + 0xfeffffff >> 0x18 < 0xff) {
    func_0x006e644c(uVar5,
                    "Invalid byte size requested (must be positive and reasonable, e.g., < 16MB)");
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x3e6c8);
    (*pcVar3)();
  }
  uVar11 = (ulong)uVar4;
  uStack_c8 = 0xffffffffffffffff;
  uStack_c0 = uVar11;
  lVar9 = func_0x006115d0(uVar11);
  lStack_b8 = lVar9;
  func_0x006954a8(1,lVar9,uVar11);
  pppppppuStack_e8 = (undefined8 *******)0x0;
  uStack_e0 = 0;
  uStack_d8 = 0;
  uVar6 = __Znwm(0x98);
  puVar10 = (undefined8 *)__Znwm(0x20);
  func_0x005edf2c(puVar10,0);
  *puVar10 = &UNK_009f9e90;
  puVar10[1] = &UNK_009fa020;
  puVar10[3] = &pppppppuStack_e8;
  func_0x0004004c(uVar6,puVar10,0,0x48);
  func_0x0003f450(&puStack_b0,lVar9,uVar11,1,uVar6);
  puStack_b0 = &UNK_00a0c238;
  puStack_a8 = &UNK_00a0c3e0;
  if (plStack_98 != (long *)0x0) {
    (**(code **)(*plStack_98 + 8))();
  }
  uVar1 = uStack_e0;
  pppppppuVar2 = pppppppuStack_e8;
  if (-1 < (long)uStack_d8) {
    uVar1 = uStack_d8 >> 0x38;
    pppppppuVar2 = &pppppppuStack_e8;
  }
  func_0x006e38d8(uVar5,pppppppuVar2,uVar1);
  if ((long)uStack_d8 < 0) {
    __ZdlPv(pppppppuStack_e8);
  }
  if (lVar9 != 0) {
    do {
      *(undefined1 *)(lVar9 + uVar11 + -1) = 0;
      uVar11 = uVar11 - 1;
    } while (uVar11 != 0);
    func_0x00611644(lVar9);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
    return (undefined8 *)((long)&MACH_HEADER.magic + 1);
  }
  auVar12 = ___stack_chk_fail();
  uVar5 = auVar12._0_8_;
  if (auVar12._8_4_ != 0) {
    uVar5 = func_0x0001753c(uVar5);
  }
  puVar10 = (undefined8 *)__Unwind_Resume(uVar5);
  *puVar10 = &UNK_00a0c238;
  puVar10[1] = &UNK_00a0c3e0;
  if ((long *)puVar10[3] != (long *)0x0) {
    (**(code **)(*(long *)puVar10[3] + 8))();
  }
  return puVar10;
}

