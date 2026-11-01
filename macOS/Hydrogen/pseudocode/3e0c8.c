
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_0003e0c8(void)

{
  ulong uVar1;
  undefined8 *******pppppppuVar2;
  code *pcVar3;
  uint uVar4;
  undefined1 *puVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  undefined8 uVar8;
  long *plVar9;
  long *plVar10;
  long lVar11;
  ulong uVar12;
  long unaff_x29;
  undefined1 auVar13 [12];
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined1 *in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined *in_stack_00000048;
  long *in_stack_00000058;
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
  
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv();
  in_stack_00000030 = _UNK_007fc198;
  in_stack_00000028 = _UNK_007fc190;
  puVar5 = (undefined1 *)func_0x006115d0(0x20);
  in_stack_00000038 = puVar5;
  func_0x006954a8(1,puVar5,0x20);
  uStack0000000000000008 = 0;
  in_stack_00000010 = 0;
  in_stack_00000018 = 0;
  uVar6 = __Znwm(0x98);
  puVar7 = (undefined8 *)__Znwm(0x20);
  func_0x005edf2c(puVar7,0);
  *puVar7 = &UNK_009f9e90;
  puVar7[1] = &UNK_009fa020;
  puVar7[3] = &uStack0000000000000008;
  func_0x0004004c(uVar6,puVar7,0,0x48);
  func_0x0003f450(&uStack0000000000000040,puVar5,0x20,1,uVar6);
  uStack0000000000000040 = &UNK_00a0c238;
  in_stack_00000048 = &UNK_00a0c3e0;
  if (in_stack_00000058 != (long *)0x0) {
    (**(code **)(*in_stack_00000058 + 8))();
  }
  func_0x006e38d8();
  if (in_stack_00000018 < 0) {
    __ZdlPv(uStack0000000000000008);
  }
  if (puVar5 != (undefined1 *)0x0) {
    puVar5[0x1f] = 0;
    puVar5[0x1e] = 0;
    puVar5[0x1d] = 0;
    puVar5[0x1c] = 0;
    puVar5[0x1b] = 0;
    puVar5[0x1a] = 0;
    puVar5[0x19] = 0;
    puVar5[0x18] = 0;
    puVar5[0x17] = 0;
    puVar5[0x16] = 0;
    puVar5[0x15] = 0;
    puVar5[0x14] = 0;
    puVar5[0x13] = 0;
    puVar5[0x12] = 0;
    puVar5[0x11] = 0;
    puVar5[0x10] = 0;
    puVar5[0xf] = 0;
    puVar5[0xe] = 0;
    puVar5[0xd] = 0;
    puVar5[0xc] = 0;
    puVar5[0xb] = 0;
    puVar5[10] = 0;
    puVar5[9] = 0;
    puVar5[8] = 0;
    puVar5[7] = 0;
    puVar5[6] = 0;
    puVar5[5] = 0;
    puVar5[4] = 0;
    puVar5[3] = 0;
    puVar5[2] = 0;
    puVar5[1] = 0;
    *puVar5 = 0;
    func_0x00611644(puVar5);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return (undefined8 *)((long)&MACH_HEADER.magic + 1);
  }
  auVar13 = ___stack_chk_fail();
  uVar6 = auVar13._0_8_;
  if (auVar13._8_4_ != 0) {
    uVar6 = func_0x0001753c(uVar6);
  }
  uVar6 = __Unwind_Resume(uVar6);
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar8 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar8 = func_0x00086db4(uVar8,"crypt_generatebytes",0x13);
  uVar8 = func_0x00086db4(uVar8," @ ",3);
  uVar8 = func_0x00086db4(uVar8,"/Users/x0rch/hydrogen-m/src/lua/libs/crypt.h",0x2c);
  uVar8 = func_0x00086db4(uVar8,":",1);
  plVar9 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar8,0x23e);
  __ZNKSt3__18ios_base6getlocEv(&puStack_b0,(long)plVar9 + *(long *)(*plVar9 + -0x18));
  plVar10 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&puStack_b0,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar8 = (**(code **)(*plVar10 + 0x38))(plVar10,10);
  __ZNSt3__16localeD1Ev(&puStack_b0);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar9,uVar8);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar9);
  uVar4 = func_0x006e6bc0(uVar6,1);
  if (uVar4 + 0xfeffffff >> 0x18 < 0xff) {
    func_0x006e644c(uVar6,
                    "Invalid byte size requested (must be positive and reasonable, e.g., < 16MB)");
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x3e6c8);
    (*pcVar3)();
  }
  uVar12 = (ulong)uVar4;
  uStack_c8 = 0xffffffffffffffff;
  uStack_c0 = uVar12;
  lVar11 = func_0x006115d0(uVar12);
  lStack_b8 = lVar11;
  func_0x006954a8(1,lVar11,uVar12);
  pppppppuStack_e8 = (undefined8 *******)0x0;
  uStack_e0 = 0;
  uStack_d8 = 0;
  uVar8 = __Znwm(0x98);
  puVar7 = (undefined8 *)__Znwm(0x20);
  func_0x005edf2c(puVar7,0);
  *puVar7 = &UNK_009f9e90;
  puVar7[1] = &UNK_009fa020;
  puVar7[3] = &pppppppuStack_e8;
  func_0x0004004c(uVar8,puVar7,0,0x48);
  func_0x0003f450(&puStack_b0,lVar11,uVar12,1,uVar8);
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
  func_0x006e38d8(uVar6,pppppppuVar2,uVar1);
  if ((long)uStack_d8 < 0) {
    __ZdlPv(pppppppuStack_e8);
  }
  if (lVar11 != 0) {
    do {
      *(undefined1 *)(lVar11 + uVar12 + -1) = 0;
      uVar12 = uVar12 - 1;
    } while (uVar12 != 0);
    func_0x00611644(lVar11);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
    return (undefined8 *)((long)&MACH_HEADER.magic + 1);
  }
  auVar13 = ___stack_chk_fail();
  uVar6 = auVar13._0_8_;
  if (auVar13._8_4_ != 0) {
    uVar6 = func_0x0001753c(uVar6);
  }
  puVar7 = (undefined8 *)__Unwind_Resume(uVar6);
  *puVar7 = &UNK_00a0c238;
  puVar7[1] = &UNK_00a0c3e0;
  if ((long *)puVar7[3] != (long *)0x0) {
    (**(code **)(*(long *)puVar7[3] + 8))();
  }
  return puVar7;
}

