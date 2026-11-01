
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00020e84(undefined8 *param_1)

{
  uint uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  ulong uVar6;
  undefined8 *******pppppppuVar7;
  undefined8 *******pppppppuVar8;
  undefined8 *puVar9;
  undefined8 ******ppppppuVar10;
  undefined8 ******ppppppuVar11;
  undefined8 ******ppppppuVar12;
  code *pcVar13;
  int iVar14;
  long lVar15;
  long *plVar16;
  long lVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  long *plVar20;
  undefined8 *******pppppppuVar21;
  undefined4 *puVar22;
  ulong uVar23;
  uint unaff_w20;
  int iVar24;
  ulong unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong uVar25;
  undefined8 *unaff_x24;
  undefined *unaff_x25;
  undefined *unaff_x26;
  undefined8 *unaff_x27;
  undefined8 unaff_x28;
  long unaff_x29;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000030;
  undefined7 uStack0000000000000038;
  byte bStack000000000000003f;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  long in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  long in_stack_00000068;
  long *in_stack_00000070;
  undefined8 uStack0000000000000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 *******pppppppuStack_170;
  ulong uStack_168;
  byte bStack_159;
  undefined8 *******pppppppuStack_158;
  ulong uStack_150;
  ulong uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  long lStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  long lStack_118;
  long *plStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_78;
  undefined8 uStack_60;
  undefined8 *puStack_58;
  undefined *puStack_50;
  undefined *puStack_48;
  undefined8 *puStack_40;
  ulong uStack_38;
  ulong uStack_30;
  ulong uStack_28;
  
  uVar18 = _UNK_00803514;
  param_1[1] = CONCAT44(_UNK_00803520,_UNK_0080351c);
  *param_1 = uVar18;
  uVar18 = CONCAT44(_UNK_00803524,_UNK_00803520);
  *(undefined8 *)((long)param_1 + 0x14) = _UNK_00803528;
  *(undefined8 *)((long)param_1 + 0xc) = uVar18;
  *(undefined4 *)((long)param_1 + 0x1c) = 0;
  if (1 < (int)unaff_w20) {
    unaff_x24 = &uStack0000000000000078;
    unaff_x21 = 1;
    unaff_x26 = &UNK_009b2bc0;
    unaff_x27 = &uStack0000000000000010;
    unaff_x28 = 4;
    do {
      while( true ) {
        lVar15 = func_0x006e778c();
        plVar16 = (long *)__Znwm(0x28);
        __ZNSt3__17codecvtIwc11__mbstate_tEC2Em(plVar16,0);
        plVar16[3] = (long)&UNK_0010ffff;
        *(undefined4 *)(plVar16 + 4) = 0;
        *plVar16 = (long)&UNK_009b2bc0;
        in_stack_00000048 = 0;
        uStack0000000000000040 = 0;
        in_stack_00000058 = 0;
        in_stack_00000050 = 0;
        in_stack_00000068 = 0;
        in_stack_00000060 = 0;
        in_stack_00000080 = 0;
        uStack0000000000000078 = 0;
        in_stack_00000090 = 0;
        in_stack_00000088 = 0;
        in_stack_000000a0 = 0;
        in_stack_00000098 = 0;
        in_stack_000000b0 = 0;
        in_stack_000000a8 = 0;
        in_stack_000000c0 = 0;
        in_stack_000000b8 = 0;
        in_stack_000000d0 = 0;
        in_stack_000000c8 = 0;
        in_stack_000000e0 = 0;
        in_stack_000000d8 = 0;
        in_stack_000000f0 = 0;
        in_stack_000000e8 = 0;
        in_stack_000000f8 = 0;
        in_stack_00000070 = plVar16;
        lVar17 = _strlen(lVar15);
        func_0x00023504(&uStack0000000000000010,&uStack0000000000000040,lVar15,lVar15 + lVar17);
        unaff_x22 = in_stack_00000018;
        puVar9 = uStack0000000000000010;
        if (-1 < (char)in_stack_00000020._7_1_) {
          unaff_x22 = (ulong)in_stack_00000020._7_1_;
          puVar9 = unaff_x27;
        }
        lVar15 = (CONCAT17(bStack000000000000003f,uStack0000000000000038) & 0x7fffffffffffffff) - 1;
        unaff_x23 = in_stack_00000030;
        if (-1 < (char)bStack000000000000003f) {
          lVar15 = 4;
          unaff_x23 = (ulong)bStack000000000000003f;
        }
        if (lVar15 - unaff_x23 < unaff_x22) {
          __ZNSt3__112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE21__grow_by_and_replaceEmmmmmmPKw
                    (&uStack0000000000000028,lVar15,(unaff_x23 + unaff_x22) - lVar15,unaff_x23,
                     unaff_x23,0,unaff_x22);
        }
        else if (unaff_x22 != 0) {
          puVar5 = uStack0000000000000028;
          if (-1 < (char)bStack000000000000003f) {
            puVar5 = &uStack0000000000000028;
          }
          _memmove((long)puVar5 + unaff_x23 * 4,puVar9,unaff_x22 << 2);
          uVar2 = unaff_x23 + unaff_x22;
          if ((char)bStack000000000000003f < '\0') {
            in_stack_00000030 = uVar2;
          }
          else {
            bStack000000000000003f = (byte)uVar2 & 0x7f;
          }
          *(undefined4 *)((long)puVar5 + uVar2 * 4) = 0;
        }
        unaff_x25 = &UNK_0010ffff;
        if ((char)in_stack_00000020._7_1_ < '\0') {
          __ZdlPv(uStack0000000000000010);
        }
        if (in_stack_00000070 != (long *)0x0) {
          (**(code **)(*in_stack_00000070 + 8))();
        }
        if (-1 < in_stack_00000068) break;
        __ZdlPv(in_stack_00000058);
        if (in_stack_00000050 < 0) goto LAB_0002103c;
LAB_00020ee0:
        uVar1 = (int)unaff_x21 + 1;
        unaff_x21 = (ulong)uVar1;
        if (unaff_w20 == uVar1) goto LAB_0002107c;
      }
      if (-1 < in_stack_00000050) goto LAB_00020ee0;
LAB_0002103c:
      __ZdlPv(uStack0000000000000040);
      uVar1 = (int)unaff_x21 + 1;
      unaff_x21 = (ulong)uVar1;
    } while (unaff_w20 != uVar1);
  }
LAB_0002107c:
  _wprintf(&UNK_008034c0);
  if ((char)bStack000000000000003f < '\0') {
    __ZdlPv(uStack0000000000000028);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return 0;
  }
  uVar18 = ___stack_chk_fail();
  if ((char)bStack000000000000003f < '\0') {
    __ZdlPv(uStack0000000000000028);
  }
  uVar18 = __Unwind_Resume(uVar18);
  uStack_78 = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
  uStack_60 = unaff_x28;
  puStack_58 = unaff_x27;
  puStack_50 = unaff_x26;
  puStack_48 = unaff_x25;
  puStack_40 = unaff_x24;
  uStack_38 = unaff_x23;
  uStack_30 = unaff_x22;
  uStack_28 = unaff_x21;
  uVar19 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar19 = func_0x00086db4(uVar19,"consoleerror",0xc);
  uVar19 = func_0x00086db4(uVar19," @ ",3);
  uVar19 = func_0x00086db4(uVar19,"/Users/x0rch/hydrogen-m/src/lua/libs/misc.h",0x2b);
  uVar19 = func_0x00086db4(uVar19,":",1);
  plVar16 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar19,0x7d);
  __ZNKSt3__18ios_base6getlocEv(&uStack_140,(long)plVar16 + *(long *)(*plVar16 + -0x18));
  plVar20 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&uStack_140,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar19 = (**(code **)(*plVar20 + 0x38))(plVar20,10);
  __ZNSt3__16localeD1Ev(&uStack_140);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar16,uVar19);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar16);
  iVar14 = func_0x006e1e34(uVar18);
  pppppppuStack_158 = (undefined8 *******)__Znwm(0x28);
  ppppppuVar12 = _UNK_0080354c;
  ppppppuVar11 = _UNK_00803544;
  ppppppuVar10 = _UNK_00803534;
  uStack_148 = _UNK_007fc168;
  uStack_150 = _UNK_007fc160;
  pppppppuStack_158[1] = _UNK_0080353c;
  *pppppppuStack_158 = ppppppuVar10;
  pppppppuStack_158[3] = ppppppuVar12;
  pppppppuStack_158[2] = ppppppuVar11;
  *(undefined4 *)(pppppppuStack_158 + 4) = 0;
  if (1 < iVar14) {
    iVar24 = 1;
code_r0x000212c4:
    do {
      lVar15 = func_0x006e778c(uVar18,iVar24,0);
      plVar16 = (long *)__Znwm(0x28);
      __ZNSt3__17codecvtIwc11__mbstate_tEC2Em(plVar16,0);
      plVar16[3] = (long)&UNK_0010ffff;
      *(undefined4 *)(plVar16 + 4) = 0;
      *plVar16 = (long)&UNK_009b2bc0;
      uStack_138 = 0;
      uStack_140 = 0;
      uStack_128 = 0;
      lStack_130 = 0;
      lStack_118 = 0;
      uStack_120 = 0;
      uStack_100 = 0;
      uStack_108 = 0;
      uStack_f0 = 0;
      uStack_f8 = 0;
      uStack_e0 = 0;
      uStack_e8 = 0;
      uStack_d0 = 0;
      uStack_d8 = 0;
      uStack_c0 = 0;
      uStack_c8 = 0;
      uStack_b0 = 0;
      uStack_b8 = 0;
      uStack_a0 = 0;
      uStack_a8 = 0;
      uStack_90 = 0;
      uStack_98 = 0;
      uStack_88 = 0;
      plStack_110 = plVar16;
      lVar17 = _strlen(lVar15);
      func_0x00023504(&pppppppuStack_170,&uStack_140,lVar15,lVar15 + lVar17);
      uVar2 = uStack_168;
      pppppppuVar8 = pppppppuStack_170;
      if (-1 < (char)bStack_159) {
        uVar2 = (ulong)bStack_159;
        pppppppuVar8 = &pppppppuStack_170;
      }
      uVar23 = (uStack_148 & 0x7fffffffffffffff) - 1;
      uVar4 = uStack_150;
      if (-1 < (long)uStack_148) {
        uVar23 = 4;
        uVar4 = uStack_148 >> 0x38;
      }
      if (uVar23 - uVar4 < uVar2) {
        uVar3 = uVar4 + uVar2;
        if (0x3ffffffffffffff6 - uVar23 < uVar3 - uVar23) {
          func_0x0001748c(&pppppppuStack_158);
          goto code_r0x0002160c;
        }
        pppppppuVar7 = pppppppuStack_158;
        if (-1 < (long)uStack_148) {
          pppppppuVar7 = &pppppppuStack_158;
        }
        if (uVar23 < 0x1ffffffffffffff3) {
          uVar6 = uVar3;
          if (uVar3 <= uVar23 * 2) {
            uVar6 = uVar23 * 2;
          }
          if (uVar6 < 5) {
            uVar25 = 5;
          }
          else {
            uVar25 = (uVar6 & 0xfffffffffffffffe) + 2;
            if ((uVar6 | 1) != 5) {
              uVar25 = uVar6 | 1;
            }
            uVar25 = uVar25 + 1;
            if (uVar25 >> 0x3e != 0) {
              func_0x00017514();
              goto code_r0x0002160c;
            }
          }
        }
        else {
          uVar25 = 0x3ffffffffffffff7;
        }
        pppppppuVar21 = (undefined8 *******)__Znwm(uVar25 << 2);
        if (uVar4 != 0) {
          _memmove(pppppppuVar21,pppppppuVar7,uVar4 << 2);
        }
        _memcpy((long)pppppppuVar21 + uVar4 * 4,pppppppuVar8,uVar2 << 2);
        if (uVar23 != 4) {
          __ZdlPv(pppppppuVar7);
        }
        uStack_148 = uVar25 | 0x8000000000000000;
        puVar22 = (undefined4 *)((long)pppppppuVar21 + uVar3 * 4);
        pppppppuStack_158 = pppppppuVar21;
        uStack_150 = uVar3;
code_r0x000214b8:
        *puVar22 = 0;
      }
      else if (uVar2 != 0) {
        pppppppuVar7 = pppppppuStack_158;
        if (-1 < (long)uStack_148) {
          pppppppuVar7 = &pppppppuStack_158;
        }
        _memmove((long)pppppppuVar7 + uVar4 * 4,pppppppuVar8,uVar2 << 2);
        uVar4 = uVar4 + uVar2;
        if ((long)uStack_148 < 0) {
          uStack_150 = uVar4;
        }
        else {
          uStack_148 = CONCAT17((char)uVar4,(undefined7)uStack_148) & 0x7fffffffffffffff;
        }
        puVar22 = (undefined4 *)((long)pppppppuVar7 + uVar4 * 4);
        goto code_r0x000214b8;
      }
      if ((char)bStack_159 < '\0') {
        __ZdlPv(pppppppuStack_170);
      }
      if (plStack_110 != (long *)0x0) {
        (**(code **)(*plStack_110 + 8))();
      }
      if (lStack_118 < 0) {
        __ZdlPv(uStack_128);
        if (lStack_130 < 0) goto code_r0x000214e8;
code_r0x000212b4:
        iVar24 = iVar24 + 1;
        if (iVar14 == iVar24) break;
        goto code_r0x000212c4;
      }
      if (-1 < lStack_130) goto code_r0x000212b4;
code_r0x000214e8:
      __ZdlPv(uStack_140);
      iVar24 = iVar24 + 1;
    } while (iVar14 != iVar24);
  }
  _wprintf(&UNK_008034c0);
  plVar16 = (long *)__Znwm(0x28);
  __ZNSt3__17codecvtIwc11__mbstate_tEC2Em(plVar16,0);
  plVar16[3] = (long)&UNK_0010ffff;
  *(undefined4 *)(plVar16 + 4) = 0;
  *plVar16 = (long)&UNK_009b2bc0;
  pppppppuVar8 = pppppppuStack_158;
  if (-1 < (long)uStack_148) {
    pppppppuVar8 = &pppppppuStack_158;
  }
  uStack_138 = 0;
  uStack_140 = 0;
  uStack_128 = 0;
  lStack_130 = 0;
  lStack_118 = 0;
  uStack_120 = 0;
  uStack_100 = 0;
  uStack_108 = 0;
  uStack_f0 = 0;
  uStack_f8 = 0;
  uStack_e0 = 0;
  uStack_e8 = 0;
  uStack_d0 = 0;
  uStack_d8 = 0;
  uStack_c0 = 0;
  uStack_c8 = 0;
  uStack_b0 = 0;
  uStack_b8 = 0;
  uVar2 = uStack_150;
  if (-1 < (long)uStack_148) {
    uVar2 = uStack_148 >> 0x38;
  }
  uStack_a0 = 0;
  uStack_a8 = 0;
  uStack_90 = 0;
  uStack_98 = 0;
  uStack_88 = 0;
  plStack_110 = plVar16;
  func_0x00023f98(&pppppppuStack_170,&uStack_140,pppppppuVar8,(long)pppppppuVar8 + uVar2 * 4);
  func_0x006eceb0(uVar18,"%s");
code_r0x0002160c:
                    /* WARNING: Does not return */
  pcVar13 = (code *)SoftwareBreakpoint(1,0x21610);
  (*pcVar13)();
}

