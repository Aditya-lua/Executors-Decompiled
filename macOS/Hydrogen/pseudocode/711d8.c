
/* WARNING: Type propagation algorithm not settling */

undefined8 * FUN_000711d8(undefined8 param_1,undefined8 param_2,long *param_3)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  byte bVar5;
  code *pcVar6;
  bool bVar7;
  long *plVar8;
  short *psVar9;
  undefined8 *******pppppppuVar10;
  undefined8 uVar11;
  long *plVar12;
  ulong uVar13;
  long lVar14;
  long *plVar15;
  long lVar16;
  long lVar17;
  undefined8 *puVar18;
  ulong uVar19;
  undefined8 *puVar20;
  ulong uVar21;
  ulong uVar22;
  long lVar23;
  long lVar24;
  ulong uVar25;
  undefined1 auVar26 [16];
  undefined8 auStack_160 [2];
  char cStack_149;
  undefined8 auStack_148 [2];
  char cStack_131;
  undefined8 uStack_130;
  undefined8 uStack_128;
  long lStack_120;
  undefined1 auStack_110 [24];
  undefined8 *******pppppppuStack_f8;
  ulong uStack_f0;
  undefined8 uStack_e8;
  long lStack_e0;
  undefined8 uStack_d8;
  long *plStack_d0;
  undefined8 uStack_c8;
  undefined4 uStack_c0;
  
  auVar26 = __Unwind_Resume();
  plVar12 = auVar26._0_8_;
  lVar16 = plVar12[1] - *plVar12 >> 3;
  uVar25 = lVar16 * -0x3333333333333333 + 1;
  if (0x666666666666666 < uVar25) {
    func_0x00017f90(plVar12);
code_r0x00071428:
    func_0x00017514();
    func_0x0001753c();
    auVar26 = func_0x0001753c();
    plVar15 = auVar26._8_8_;
    puVar20 = auVar26._0_8_;
    uVar13 = 0;
    uVar25 = 0;
    puVar18 = puVar20 + 1;
    puVar20[2] = 0;
    *puVar18 = 0;
    *puVar20 = &UNK_009b91f8;
    puVar20[4] = 0;
    puVar20[3] = 0;
    puVar20[6] = 0;
    puVar20[5] = 0;
    uStack_d8 = 0;
    lStack_e0 = 0;
    uStack_c8 = 0;
    plStack_d0 = (long *)0x0;
    uStack_c0 = 0x3f800000;
    uVar21 = (ulong)*(byte *)((long)plVar15 + 0x17);
    bVar7 = (char)*(byte *)((long)plVar15 + 0x17) < '\0';
    plVar12 = (long *)*plVar15;
    uVar22 = plVar15[1];
    uVar19 = uVar22;
    plVar8 = plVar12;
    if (!bVar7) {
      uVar19 = uVar21;
      plVar8 = plVar15;
    }
    do {
      lVar16 = (long)plVar8 + uVar13;
      while( true ) {
        lVar14 = (long)((long)plVar8 + uVar19) - lVar16;
        if ((lVar14 < 2) ||
           (psVar9 = (short *)_memchr(lVar16,0x2f,lVar14 + -1), psVar9 == (short *)0x0))
        goto code_r0x00071788;
        if (*psVar9 == 0x3a2f) break;
        lVar16 = (long)psVar9 + 1;
      }
      if ((psVar9 == (short *)((long)plVar8 + uVar19)) ||
         (lVar16 = (long)psVar9 - (long)plVar8, lVar16 == -1)) break;
      plVar8 = plVar15;
      if (bVar7) {
        plVar8 = plVar12;
        uVar21 = uVar22;
      }
      if (uVar21 < uVar25) {
        func_0x00049dd0(&pppppppuStack_f8);
        goto code_r0x000719e0;
      }
      uVar19 = (lVar16 - uVar25) + 1;
      uVar13 = uVar21 - uVar25;
      if (uVar19 <= uVar21 - uVar25) {
        uVar13 = uVar19;
      }
      if (0x7ffffffffffffff7 < uVar13) {
        func_0x0001748c(&pppppppuStack_f8);
        goto code_r0x000719e0;
      }
      if (uVar13 < 0x17) {
        uStack_e8 = CONCAT17((char)uVar13,(undefined7)uStack_e8);
        pppppppuVar10 = &pppppppuStack_f8;
        if (uVar13 != 0) goto code_r0x000715c0;
        pppppppuStack_f8 = (undefined8 *******)((ulong)pppppppuStack_f8 & 0xffffffffffffff00);
        plVar12 = (long *)puVar20[2];
        if (plVar12 < (long *)puVar20[3]) goto code_r0x00071578;
code_r0x000715e0:
        uVar11 = func_0x000232b4(puVar18,&pppppppuStack_f8);
        puVar20[2] = uVar11;
        if ((long)uStack_e8 < 0) {
          __ZdlPv(pppppppuStack_f8);
        }
      }
      else {
        uVar19 = (uVar13 & 0xfffffffffffffff8) + 8;
        if ((uVar13 | 7) != 0x17) {
          uVar19 = uVar13 | 7;
        }
        pppppppuVar10 = (undefined8 *******)__Znwm(uVar19 + 1);
        uStack_e8 = uVar19 + 1 | 0x8000000000000000;
        pppppppuStack_f8 = pppppppuVar10;
        uStack_f0 = uVar13;
code_r0x000715c0:
        _memmove(pppppppuVar10,(long)plVar8 + uVar25,uVar13);
        *(undefined1 *)((long)pppppppuVar10 + uVar13) = 0;
        plVar12 = (long *)puVar20[2];
        if ((long *)puVar20[3] <= plVar12) goto code_r0x000715e0;
code_r0x00071578:
        plVar12[2] = uStack_e8;
        plVar12[1] = uStack_f0;
        *plVar12 = (long)pppppppuStack_f8;
        puVar20[2] = plVar12 + 3;
      }
      uVar25 = lVar16 + 2;
      bVar5 = *(byte *)((long)plVar15 + 0x17);
      uVar13 = (ulong)bVar5;
      uVar22 = plVar15[1];
      uVar19 = uVar22;
      if (-1 < (char)bVar5) {
        uVar19 = uVar13;
      }
      if (uVar19 < uVar25 || uVar19 - uVar25 == 0) {
code_r0x00071658:
        if ((char)bVar5 < '\0') {
          uVar21 = uVar22 - uVar25;
          uVar19 = uVar22;
          goto code_r0x0007167c;
        }
        uVar21 = uVar13 - uVar25;
        uVar19 = uVar13;
code_r0x00071664:
        plVar12 = plVar15;
        if (uVar13 < uVar25) goto code_r0x000719c0;
      }
      else {
        plVar12 = (long *)*plVar15;
        if (-1 < (char)bVar5) {
          plVar12 = plVar15;
        }
        lVar16 = _memchr((long)plVar12 + uVar25,0x2f,uVar19 - uVar25);
        if ((lVar16 == 0) || (uVar19 = lVar16 - (long)plVar12, uVar19 == 0xffffffffffffffff))
        goto code_r0x00071658;
        uVar21 = uVar19 - uVar25;
        if (-1 < (char)bVar5) goto code_r0x00071664;
code_r0x0007167c:
        if (uVar22 < uVar25) {
code_r0x000719c0:
          func_0x00049dd0(&pppppppuStack_f8);
          goto code_r0x000719e0;
        }
        uVar13 = uVar22;
        plVar12 = (long *)*plVar15;
      }
      uVar22 = uVar13 - uVar25;
      if (uVar21 <= uVar13 - uVar25) {
        uVar22 = uVar21;
      }
      if (0x7ffffffffffffff7 < uVar22) {
        func_0x0001748c(&pppppppuStack_f8);
        goto code_r0x000719e0;
      }
      if (uVar22 < 0x17) {
        uStack_e8 = CONCAT17((char)uVar22,(undefined7)uStack_e8);
        pppppppuVar10 = &pppppppuStack_f8;
        if (uVar22 != 0) goto code_r0x000716f0;
      }
      else {
        uVar13 = (uVar22 & 0xfffffffffffffff8) + 8;
        if ((uVar22 | 7) != 0x17) {
          uVar13 = uVar22 | 7;
        }
        pppppppuVar10 = (undefined8 *******)__Znwm(uVar13 + 1);
        uStack_e8 = uVar13 + 1 | 0x8000000000000000;
        pppppppuStack_f8 = pppppppuVar10;
        uStack_f0 = uVar22;
code_r0x000716f0:
        _memmove(pppppppuVar10,(long)plVar12 + uVar25,uVar22);
      }
      *(undefined1 *)((long)pppppppuVar10 + uVar22) = 0;
      lVar16 = func_0x00072168(&lStack_e0,&pppppppuStack_f8);
      if (lVar16 != 0) {
        __ZNSt3__1plIcNS_11char_traitsIcEENS_9allocatorIcEEEENS_12basic_stringIT_T0_T1_EEPKS6_RKS9_
                  (auStack_160,"Encountered path parameter \'",&pppppppuStack_f8);
        func_0x0003a638(auStack_148,auStack_160,"\' multiple times in route pattern \'");
        uVar25 = plVar15[1];
        plVar12 = (long *)*plVar15;
        if (-1 < (char)*(byte *)((long)plVar15 + 0x17)) {
          uVar25 = (ulong)*(byte *)((long)plVar15 + 0x17);
          plVar12 = plVar15;
        }
        puVar20 = (undefined8 *)
                  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                            (auStack_148,plVar12,uVar25);
        uStack_128 = puVar20[1];
        uStack_130 = *puVar20;
        lStack_120 = puVar20[2];
        puVar20[1] = 0;
        puVar20[2] = 0;
        *puVar20 = 0;
        func_0x0003a638(auStack_110,&uStack_130,"\'.");
        if (lStack_120 < 0) {
          __ZdlPv(uStack_130);
        }
        if (cStack_131 < '\0') {
          __ZdlPv(auStack_148[0]);
        }
        if (cStack_149 < '\0') {
          __ZdlPv(auStack_160[0]);
        }
        plVar12 = (long *)___cxa_allocate_exception(0x10);
        __ZNSt11logic_errorC2ERKNSt3__112basic_stringIcNS0_11char_traitsIcEENS0_9allocatorIcEEEE
                  (plVar12,auStack_110);
        *plVar12 = (long)(PTR___ZTVSt16invalid_argument_009b01a0 + 0x10);
        ___cxa_throw(plVar12,PTR___ZTISt16invalid_argument_009b0130,
                     PTR___ZNSt16invalid_argumentD1Ev_009b0058);
        goto code_r0x000719e0;
      }
      plVar12 = (long *)puVar20[5];
      if (plVar12 < (long *)puVar20[6]) {
        plVar12[2] = uStack_e8;
        plVar12[1] = uStack_f0;
        *plVar12 = (long)pppppppuStack_f8;
        puVar20[5] = plVar12 + 3;
      }
      else {
        uVar11 = func_0x000232b4(puVar20 + 4,&pppppppuStack_f8);
        puVar20[5] = uVar11;
        if ((long)uStack_e8 < 0) {
          __ZdlPv(pppppppuStack_f8);
        }
      }
      uVar25 = uVar19 + 1;
      uVar13 = 0;
      if (uVar25 != 0) {
        uVar13 = uVar19;
      }
      uVar21 = (ulong)*(byte *)((long)plVar15 + 0x17);
      bVar7 = (char)*(byte *)((long)plVar15 + 0x17) < '\0';
      plVar12 = (long *)*plVar15;
      uVar22 = plVar15[1];
      uVar19 = uVar22;
      plVar8 = plVar12;
      if (!bVar7) {
        uVar19 = uVar21;
        plVar8 = plVar15;
      }
    } while (uVar13 <= uVar19);
code_r0x00071788:
    lVar16 = lStack_e0;
    plVar8 = plStack_d0;
    if ((uint)uVar21 >> 7 == 0) {
      if (uVar21 <= uVar25) goto joined_r0x00071878;
      uVar21 = uVar21 - uVar25;
    }
    else {
      if (uVar22 <= uVar25) goto joined_r0x00071878;
      uVar21 = uVar22 - uVar25;
      plVar15 = plVar12;
    }
    if (0x7ffffffffffffff7 < uVar21) {
      func_0x0001748c(&pppppppuStack_f8);
code_r0x000719e0:
                    /* WARNING: Does not return */
      pcVar6 = (code *)SoftwareBreakpoint(1,0x719e4);
      (*pcVar6)();
    }
    if (uVar21 < 0x17) {
      uStack_e8 = CONCAT17((char)uVar21,(undefined7)uStack_e8);
      pppppppuVar10 = &pppppppuStack_f8;
    }
    else {
      uVar19 = (uVar21 & 0xfffffffffffffff8) + 8;
      if ((uVar21 | 7) != 0x17) {
        uVar19 = uVar21 | 7;
      }
      pppppppuVar10 = (undefined8 *******)__Znwm(uVar19 + 1);
      uStack_e8 = uVar19 + 1 | 0x8000000000000000;
      pppppppuStack_f8 = pppppppuVar10;
      uStack_f0 = uVar21;
    }
    _memmove(pppppppuVar10,(long)plVar15 + uVar25,uVar21);
    *(undefined1 *)((long)pppppppuVar10 + uVar21) = 0;
    plVar12 = (long *)puVar20[2];
    if (plVar12 < (long *)puVar20[3]) {
      plVar12[2] = uStack_e8;
      plVar12[1] = uStack_f0;
      *plVar12 = (long)pppppppuStack_f8;
      puVar20[2] = plVar12 + 3;
      lVar16 = lStack_e0;
      plVar8 = plStack_d0;
    }
    else {
      uVar11 = func_0x000232b4(puVar18,&pppppppuStack_f8);
      puVar20[2] = uVar11;
      lVar16 = lStack_e0;
      plVar8 = plStack_d0;
      if ((long)uStack_e8 < 0) {
        __ZdlPv(pppppppuStack_f8);
        lVar16 = lStack_e0;
        plVar8 = plStack_d0;
      }
    }
joined_r0x00071878:
    while (plVar8 != (long *)0x0) {
      lVar14 = *plVar8;
      lStack_e0 = lVar16;
      if (*(char *)((long)plVar8 + 0x27) < '\0') {
        __ZdlPv(plVar8[2]);
      }
      __ZdlPv(plVar8);
      lVar16 = lStack_e0;
      plVar8 = (long *)lVar14;
    }
    lStack_e0 = 0;
    if (lVar16 != 0) {
      __ZdlPv();
    }
    return puVar20;
  }
  lVar14 = plVar12[2] - *plVar12 >> 3;
  uVar19 = lVar14 * -0x6666666666666666;
  if (uVar19 <= uVar25) {
    uVar19 = uVar25;
  }
  if (0x333333333333332 < (ulong)(lVar14 * -0x3333333333333333)) {
    uVar19 = 0x666666666666666;
  }
  if (uVar19 == 0) {
    lVar14 = 0;
  }
  else {
    if (0x666666666666666 < uVar19) goto code_r0x00071428;
    lVar14 = __Znwm(uVar19 * 0x28);
  }
  puVar20 = (undefined8 *)(lVar14 + lVar16 * 8);
  uVar11 = *auVar26._8_8_;
  *auVar26._8_8_ = 0;
  *puVar20 = uVar11;
  plVar8 = param_3 + 3;
  plVar15 = (long *)*plVar8;
  if (plVar15 == (long *)0x0) {
    plVar8 = (long *)(lVar14 + lVar16 * 8 + 0x20);
  }
  else {
    plVar1 = (long *)(lVar14 + lVar16 * 8 + 0x20);
    if (plVar15 == param_3) {
      *plVar1 = (long)(puVar20 + 1);
      (**(code **)(*param_3 + 0x18))(param_3);
      goto code_r0x000712e4;
    }
    *plVar1 = (long)plVar15;
  }
  *plVar8 = 0;
code_r0x000712e4:
  lVar14 = lVar14 + uVar19 * 0x28;
  puVar18 = puVar20 + 5;
  lVar16 = *plVar12;
  lVar4 = plVar12[1];
  if (lVar4 == lVar16) {
    *plVar12 = (long)puVar20;
    plVar12[1] = (long)puVar18;
    plVar12[2] = lVar14;
  }
  else {
    lVar23 = 0;
    lVar24 = lVar4;
    do {
      lVar2 = (long)puVar20 + lVar23;
      lVar3 = lVar4 + lVar23;
      uVar11 = *(undefined8 *)(lVar3 + -0x28);
      *(undefined8 *)(lVar3 + -0x28) = 0;
      *(undefined8 *)(lVar2 + -0x28) = uVar11;
      lVar17 = *(long *)(lVar3 + -8);
      if (lVar17 == 0) {
code_r0x00071308:
        *(undefined8 *)(lVar2 + -8) = 0;
      }
      else {
        if (lVar3 + -0x20 != lVar17) {
          *(long *)(lVar2 + -8) = lVar17;
          lVar2 = lVar24;
          goto code_r0x00071308;
        }
        *(long *)(lVar2 + -8) = lVar2 + -0x20;
        (**(code **)(**(long **)(lVar3 + -8) + 0x18))();
      }
      lVar24 = lVar24 + -0x28;
      lVar23 = lVar23 + -0x28;
    } while (lVar4 + lVar23 != lVar16);
    lVar16 = *plVar12;
    lVar24 = plVar12[1];
    *plVar12 = (long)puVar20 + lVar23;
    plVar12[1] = (long)puVar18;
    plVar12[2] = lVar14;
    lVar4 = lVar24;
    for (; lVar24 != lVar16; lVar24 = lVar24 + -0x28) {
      plVar12 = (long *)(lVar24 + -0x20);
      plVar8 = *(long **)(lVar24 + -8);
      if (plVar12 == plVar8) {
        lVar14 = 4;
code_r0x000713bc:
        (**(code **)(*plVar12 + lVar14 * 8))();
      }
      else if (plVar8 != (long *)0x0) {
        lVar14 = 5;
        plVar12 = plVar8;
        goto code_r0x000713bc;
      }
      plVar12 = *(long **)(lVar24 + -0x28);
      *(undefined8 *)(lVar24 + -0x28) = 0;
      if (plVar12 != (long *)0x0) {
        (**(code **)(*plVar12 + 8))();
      }
      lVar4 = lVar16;
    }
  }
  if (lVar4 != 0) {
    __ZdlPv(lVar4);
  }
  return puVar18;
}

