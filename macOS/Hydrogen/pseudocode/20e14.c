
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00020e14(long param_1,long param_2)

{
  uint uVar1;
  ulong uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  ulong uVar5;
  undefined8 *******pppppppuVar6;
  undefined8 *******pppppppuVar7;
  undefined8 *puVar8;
  undefined8 ******ppppppuVar9;
  undefined8 ******ppppppuVar10;
  undefined8 ******ppppppuVar11;
  code *pcVar12;
  int iVar13;
  long *plVar14;
  ulong uVar15;
  undefined8 uVar16;
  long lVar17;
  long lVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  long *plVar21;
  undefined8 *******pppppppuVar22;
  undefined4 *puVar23;
  ulong uVar24;
  uint uVar25;
  int iVar26;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong uVar27;
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
  undefined8 uStack_20;
  undefined8 uStack_18;
  
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000040,param_2 + param_1);
  plVar14 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&uStack0000000000000040,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar15 = (**(code **)(*plVar14 + 0x38))(plVar14,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000040);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv();
  uVar16 = func_0x006e1e34();
  uStack0000000000000028 = (undefined8 *)__Znwm(0x20);
  uVar19 = _UNK_00803514;
  _uStack0000000000000038 = _UNK_007fc158;
  in_stack_00000030 = _UNK_007fc150;
  uStack0000000000000028[1] = CONCAT44(_UNK_00803520,_UNK_0080351c);
  *uStack0000000000000028 = uVar19;
  uVar19 = CONCAT44(_UNK_00803524,_UNK_00803520);
  *(undefined8 *)((long)uStack0000000000000028 + 0x14) = _UNK_00803528;
  *(undefined8 *)((long)uStack0000000000000028 + 0xc) = uVar19;
  *(undefined4 *)((long)uStack0000000000000028 + 0x1c) = 0;
  uVar25 = (uint)uVar16;
  if (1 < (int)uVar25) {
    unaff_x24 = &uStack0000000000000078;
    uVar15 = 1;
    unaff_x26 = &UNK_009b2bc0;
    unaff_x27 = &uStack0000000000000010;
    unaff_x28 = 4;
    do {
      while( true ) {
        lVar17 = func_0x006e778c();
        plVar14 = (long *)__Znwm(0x28);
        __ZNSt3__17codecvtIwc11__mbstate_tEC2Em(plVar14,0);
        plVar14[3] = (long)&UNK_0010ffff;
        *(undefined4 *)(plVar14 + 4) = 0;
        *plVar14 = (long)&UNK_009b2bc0;
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
        in_stack_00000070 = plVar14;
        lVar18 = _strlen(lVar17);
        func_0x00023504(&uStack0000000000000010,&uStack0000000000000040,lVar17,lVar17 + lVar18);
        unaff_x22 = in_stack_00000018;
        puVar8 = uStack0000000000000010;
        if (-1 < (char)in_stack_00000020._7_1_) {
          unaff_x22 = (ulong)in_stack_00000020._7_1_;
          puVar8 = unaff_x27;
        }
        lVar17 = (_uStack0000000000000038 & 0x7fffffffffffffff) - 1;
        unaff_x23 = in_stack_00000030;
        if (-1 < (long)_uStack0000000000000038) {
          lVar17 = 4;
          unaff_x23 = _uStack0000000000000038 >> 0x38;
        }
        if (lVar17 - unaff_x23 < unaff_x22) {
          __ZNSt3__112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE21__grow_by_and_replaceEmmmmmmPKw
                    (&uStack0000000000000028,lVar17,(unaff_x23 + unaff_x22) - lVar17,unaff_x23,
                     unaff_x23,0,unaff_x22);
        }
        else if (unaff_x22 != 0) {
          puVar4 = uStack0000000000000028;
          if (-1 < (long)_uStack0000000000000038) {
            puVar4 = &uStack0000000000000028;
          }
          _memmove((long)puVar4 + unaff_x23 * 4,puVar8,unaff_x22 << 2);
          uVar3 = unaff_x23 + unaff_x22;
          if ((long)_uStack0000000000000038 < 0) {
            in_stack_00000030 = uVar3;
          }
          else {
            _uStack0000000000000038 =
                 CONCAT17((char)uVar3,uStack0000000000000038) & 0x7fffffffffffffff;
          }
          *(undefined4 *)((long)puVar4 + uVar3 * 4) = 0;
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
        if (in_stack_00000050 < 0) goto code_r0x0002103c;
code_r0x00020ee0:
        uVar1 = (int)uVar15 + 1;
        uVar15 = (ulong)uVar1;
        if (uVar25 == uVar1) goto code_r0x0002107c;
      }
      if (-1 < in_stack_00000050) goto code_r0x00020ee0;
code_r0x0002103c:
      __ZdlPv(uStack0000000000000040);
      uVar1 = (int)uVar15 + 1;
      uVar15 = (ulong)uVar1;
    } while (uVar25 != uVar1);
  }
code_r0x0002107c:
  _wprintf(&UNK_008034c0);
  if ((long)_uStack0000000000000038 < 0) {
    __ZdlPv(uStack0000000000000028);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return 0;
  }
  uVar19 = ___stack_chk_fail();
  if ((long)_uStack0000000000000038 < 0) {
    __ZdlPv(uStack0000000000000028);
  }
  uVar20 = __Unwind_Resume(uVar19);
  uStack_78 = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
  uStack_60 = unaff_x28;
  puStack_58 = unaff_x27;
  puStack_50 = unaff_x26;
  puStack_48 = unaff_x25;
  puStack_40 = unaff_x24;
  uStack_38 = unaff_x23;
  uStack_30 = unaff_x22;
  uStack_28 = uVar15;
  uStack_20 = uVar16;
  uStack_18 = uVar19;
  uVar19 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar19 = func_0x00086db4(uVar19,"consoleerror",0xc);
  uVar19 = func_0x00086db4(uVar19," @ ",3);
  uVar19 = func_0x00086db4(uVar19,"/Users/x0rch/hydrogen-m/src/lua/libs/misc.h",0x2b);
  uVar19 = func_0x00086db4(uVar19,":",1);
  plVar14 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar19,0x7d);
  __ZNKSt3__18ios_base6getlocEv(&uStack_140,(long)plVar14 + *(long *)(*plVar14 + -0x18));
  plVar21 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                              (&uStack_140,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar19 = (**(code **)(*plVar21 + 0x38))(plVar21,10);
  __ZNSt3__16localeD1Ev(&uStack_140);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar14,uVar19);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar14);
  iVar13 = func_0x006e1e34(uVar20);
  pppppppuStack_158 = (undefined8 *******)__Znwm(0x28);
  ppppppuVar11 = _UNK_0080354c;
  ppppppuVar10 = _UNK_00803544;
  ppppppuVar9 = _UNK_00803534;
  uStack_148 = _UNK_007fc168;
  uStack_150 = _UNK_007fc160;
  pppppppuStack_158[1] = _UNK_0080353c;
  *pppppppuStack_158 = ppppppuVar9;
  pppppppuStack_158[3] = ppppppuVar11;
  pppppppuStack_158[2] = ppppppuVar10;
  *(undefined4 *)(pppppppuStack_158 + 4) = 0;
  if (1 < iVar13) {
    iVar26 = 1;
code_r0x000212c4:
    do {
      lVar17 = func_0x006e778c(uVar20,iVar26,0);
      plVar14 = (long *)__Znwm(0x28);
      __ZNSt3__17codecvtIwc11__mbstate_tEC2Em(plVar14,0);
      plVar14[3] = (long)&UNK_0010ffff;
      *(undefined4 *)(plVar14 + 4) = 0;
      *plVar14 = (long)&UNK_009b2bc0;
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
      plStack_110 = plVar14;
      lVar18 = _strlen(lVar17);
      func_0x00023504(&pppppppuStack_170,&uStack_140,lVar17,lVar17 + lVar18);
      uVar15 = uStack_168;
      pppppppuVar7 = pppppppuStack_170;
      if (-1 < (char)bStack_159) {
        uVar15 = (ulong)bStack_159;
        pppppppuVar7 = &pppppppuStack_170;
      }
      uVar24 = (uStack_148 & 0x7fffffffffffffff) - 1;
      uVar3 = uStack_150;
      if (-1 < (long)uStack_148) {
        uVar24 = 4;
        uVar3 = uStack_148 >> 0x38;
      }
      if (uVar24 - uVar3 < uVar15) {
        uVar2 = uVar3 + uVar15;
        if (0x3ffffffffffffff6 - uVar24 < uVar2 - uVar24) {
          func_0x0001748c(&pppppppuStack_158);
          goto code_r0x0002160c;
        }
        pppppppuVar6 = pppppppuStack_158;
        if (-1 < (long)uStack_148) {
          pppppppuVar6 = &pppppppuStack_158;
        }
        if (uVar24 < 0x1ffffffffffffff3) {
          uVar5 = uVar2;
          if (uVar2 <= uVar24 * 2) {
            uVar5 = uVar24 * 2;
          }
          if (uVar5 < 5) {
            uVar27 = 5;
          }
          else {
            uVar27 = (uVar5 & 0xfffffffffffffffe) + 2;
            if ((uVar5 | 1) != 5) {
              uVar27 = uVar5 | 1;
            }
            uVar27 = uVar27 + 1;
            if (uVar27 >> 0x3e != 0) {
              func_0x00017514();
              goto code_r0x0002160c;
            }
          }
        }
        else {
          uVar27 = 0x3ffffffffffffff7;
        }
        pppppppuVar22 = (undefined8 *******)__Znwm(uVar27 << 2);
        if (uVar3 != 0) {
          _memmove(pppppppuVar22,pppppppuVar6,uVar3 << 2);
        }
        _memcpy((long)pppppppuVar22 + uVar3 * 4,pppppppuVar7,uVar15 << 2);
        if (uVar24 != 4) {
          __ZdlPv(pppppppuVar6);
        }
        uStack_148 = uVar27 | 0x8000000000000000;
        puVar23 = (undefined4 *)((long)pppppppuVar22 + uVar2 * 4);
        pppppppuStack_158 = pppppppuVar22;
        uStack_150 = uVar2;
code_r0x000214b8:
        *puVar23 = 0;
      }
      else if (uVar15 != 0) {
        pppppppuVar6 = pppppppuStack_158;
        if (-1 < (long)uStack_148) {
          pppppppuVar6 = &pppppppuStack_158;
        }
        _memmove((long)pppppppuVar6 + uVar3 * 4,pppppppuVar7,uVar15 << 2);
        uVar3 = uVar3 + uVar15;
        if ((long)uStack_148 < 0) {
          uStack_150 = uVar3;
        }
        else {
          uStack_148 = CONCAT17((char)uVar3,(undefined7)uStack_148) & 0x7fffffffffffffff;
        }
        puVar23 = (undefined4 *)((long)pppppppuVar6 + uVar3 * 4);
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
        iVar26 = iVar26 + 1;
        if (iVar13 == iVar26) break;
        goto code_r0x000212c4;
      }
      if (-1 < lStack_130) goto code_r0x000212b4;
code_r0x000214e8:
      __ZdlPv(uStack_140);
      iVar26 = iVar26 + 1;
    } while (iVar13 != iVar26);
  }
  _wprintf(&UNK_008034c0);
  plVar14 = (long *)__Znwm(0x28);
  __ZNSt3__17codecvtIwc11__mbstate_tEC2Em(plVar14,0);
  plVar14[3] = (long)&UNK_0010ffff;
  *(undefined4 *)(plVar14 + 4) = 0;
  *plVar14 = (long)&UNK_009b2bc0;
  pppppppuVar7 = pppppppuStack_158;
  if (-1 < (long)uStack_148) {
    pppppppuVar7 = &pppppppuStack_158;
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
  uVar15 = uStack_150;
  if (-1 < (long)uStack_148) {
    uVar15 = uStack_148 >> 0x38;
  }
  uStack_a0 = 0;
  uStack_a8 = 0;
  uStack_90 = 0;
  uStack_98 = 0;
  uStack_88 = 0;
  plStack_110 = plVar14;
  func_0x00023f98(&pppppppuStack_170,&uStack_140,pppppppuVar7,(long)pppppppuVar7 + uVar15 * 4);
  func_0x006eceb0(uVar20,"%s");
code_r0x0002160c:
                    /* WARNING: Does not return */
  pcVar12 = (code *)SoftwareBreakpoint(1,0x21610);
  (*pcVar12)();
}

