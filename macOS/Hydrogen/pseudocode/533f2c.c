
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00533f2c(undefined8 param_1,undefined8 param_2,dword *param_3,ulong param_4)

{
  bool bVar1;
  byte *pbVar2;
  undefined1 *puVar3;
  undefined *puVar4;
  undefined *puVar5;
  undefined1 *puVar6;
  byte *pbVar7;
  uint uVar8;
  uint uVar9;
  undefined *puVar10;
  dword dVar11;
  undefined *puVar12;
  undefined *puVar13;
  code *pcVar14;
  dword *pdVar15;
  dword *pdVar16;
  dword *pdVar17;
  undefined *puVar18;
  dword *pdVar19;
  undefined *puVar20;
  dword *pdVar21;
  dword *pdVar22;
  undefined *puVar23;
  undefined *puVar24;
  undefined1 *puVar25;
  ulong uVar26;
  undefined1 *puVar27;
  undefined *puVar28;
  undefined *puVar29;
  ulong uVar30;
  undefined *puVar31;
  long *plVar32;
  undefined1 *puVar33;
  undefined *puVar34;
  undefined *puVar35;
  long unaff_x19;
  undefined8 uVar36;
  int iVar37;
  long lVar38;
  undefined *unaff_x25;
  long lVar39;
  long unaff_x27;
  uint uVar40;
  ulong uVar41;
  undefined1 auVar42 [16];
  ulong in_stack_00000098;
  undefined8 in_stack_000000c0;
  undefined8 uStack_988;
  dword *pdStack_980;
  undefined *puStack_978;
  undefined *puStack_970;
  dword *pdStack_968;
  int iStack_92c;
  byte *pbStack_908;
  undefined *puStack_900;
  undefined *puStack_8f8;
  undefined *puStack_8d8;
  dword *pdStack_8d0;
  undefined *puStack_8c8;
  undefined8 uStack_8c0;
  int iStack_8b8;
  dword adStack_8b0 [512];
  undefined *puStack_b0;
  dword *pdStack_a8;
  undefined *puStack_a0;
  undefined8 uStack_98;
  undefined1 *puStack_90;
  undefined1 *puStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined *puStack_70;
  
  if (unaff_x27 != 0) {
    param_3 = &MACH_HEADER.cpusubtype;
    func_0x00187bd4();
  }
  if (unaff_x19 != 0) {
    param_3 = &MACH_HEADER.cpusubtype;
    func_0x00187bd4();
  }
  if ((in_stack_00000098 | 0x8000000000000000) != 0x8000000000000000) {
    param_3 = &MACH_HEADER.cpusubtype;
    func_0x00187bd4(in_stack_000000c0,in_stack_00000098 << 4);
  }
  auVar42 = __Unwind_Resume();
  uVar41 = auVar42._8_8_;
  pbStack_908 = auVar42._0_8_;
  if (uVar41 < 0x20) {
    pdVar21 = (dword *)func_0x0046c47c(pbStack_908,uVar41);
    if (0x1f < param_4) goto code_r0x00533fc8;
code_r0x00533fec:
    pdVar22 = (dword *)func_0x0046c47c(param_3,param_4);
  }
  else {
    pdVar21 = (dword *)func_0x0046bd58(pbStack_908,uVar41);
    if (param_4 < 0x20) goto code_r0x00533fec;
code_r0x00533fc8:
    pdVar22 = (dword *)func_0x0046bd58();
  }
  pbVar7 = pbStack_908 + uVar41;
  pdVar19 = pdVar22;
  if (pdVar22 <= pdVar21) {
    pdVar19 = pdVar21;
  }
  puVar3 = (undefined1 *)((long)pdVar19 + 1);
  _memset(adStack_8b0,0xff,0x800);
  uStack_8c0 = 0;
  iStack_8b8 = -1;
  puVar4 = (undefined *)((long)pdVar22 + 2);
  puStack_900 = (undefined *)((long)puVar4 * 8);
  puStack_8d8 = (undefined *)0x8000000000000000;
  bVar1 = (ulong)puVar4 >> 0x3d != 0 || (undefined *)0x7ffffffffffffff8 < puStack_900;
  puVar24 = puVar4;
  if (pdVar19 == (dword *)0xffffffffffffffff) {
    if (bVar1) {
      func_0x007a1f00(0,puStack_900,&UNK_009eb9c0);
      goto code_r0x00533e40;
    }
    if (puStack_900 != (undefined *)0x0) {
      uVar36 = 8;
      pdVar15 = (dword *)func_0x00187bdc(puStack_900,8);
      if (pdVar15 == (dword *)0x0) goto code_r0x00533e44;
      pdVar16 = (dword *)func_0x00187bdc(puStack_900,8);
      if (pdVar16 != (dword *)0x0) {
        puStack_900 = puVar4;
        goto code_r0x00533580;
      }
      goto code_r0x00533e58;
    }
    puVar24 = (undefined *)0x0;
    pdVar15 = &MACH_HEADER.cpusubtype;
code_r0x0053357c:
    pdVar16 = &MACH_HEADER.cpusubtype;
  }
  else {
    if (bVar1) {
code_r0x00533e40:
      uVar36 = 0;
code_r0x00533e44:
      func_0x007a1f00(uVar36,puStack_900,&UNK_009eb9c0);
code_r0x00533e58:
      func_0x007a1f00(8,puStack_900,&UNK_009eb9d8);
      goto code_r0x00533e88;
    }
    if (puStack_900 == (undefined *)0x0) {
      puVar24 = (undefined *)0x0;
      pdVar21 = &MACH_HEADER.cpusubtype;
      pdVar15 = pdVar21;
      if (pdVar22 < (dword *)0xfffffffffffffffe) goto code_r0x00533448;
code_r0x0053347c:
      pdVar15 = pdVar21;
      if (puVar4 == (undefined *)0x0) {
        puStack_900 = (undefined *)0x0;
        goto code_r0x0053357c;
      }
    }
    else {
      unaff_x25 = &___rust_no_alloc_shim_is_unstable;
      uVar36 = 8;
      pdVar21 = (dword *)func_0x00187bd0(puStack_900,8);
      if (pdVar21 == (dword *)0x0) goto code_r0x00533e44;
      pdVar15 = pdVar21;
      if ((dword *)0xfffffffffffffffd < pdVar22) goto code_r0x0053347c;
code_r0x00533448:
      puVar27 = (undefined1 *)((long)pdVar22 + 1);
      if (puVar27 < (undefined1 *)0x8) {
        uVar41 = 1;
        pdVar21 = pdVar15;
      }
      else {
        puVar25 = (undefined1 *)((ulong)puVar27 & 0xfffffffffffffff8);
        pdVar21 = pdVar15 + (long)puVar25 * 2;
        uVar41 = (ulong)puVar25 | 1;
        plVar32 = (long *)(pdVar15 + 8);
        puVar33 = puVar25;
        do {
          plVar32[-3] = (long)puVar3;
          plVar32[-4] = (long)puVar3;
          plVar32[-1] = (long)puVar3;
          plVar32[-2] = (long)puVar3;
          plVar32[1] = (long)puVar3;
          *plVar32 = (long)puVar3;
          plVar32[3] = (long)puVar3;
          plVar32[2] = (long)puVar3;
          puVar33 = puVar33 + -8;
          plVar32 = plVar32 + 8;
        } while (puVar33 != (undefined1 *)0x0);
        if (puVar27 == puVar25) goto code_r0x005334d0;
      }
      lVar38 = (long)pdVar22 + (2 - uVar41);
      pdVar16 = pdVar21;
      do {
        pdVar21 = pdVar16 + 2;
        *(undefined1 **)pdVar16 = puVar3;
        lVar38 = lVar38 + -1;
        pdVar16 = pdVar21;
      } while (lVar38 != 0);
    }
code_r0x005334d0:
    *(undefined1 **)pdVar21 = puVar3;
    if (puStack_900 == (undefined *)0x0) {
      pdVar16 = &MACH_HEADER.cpusubtype;
      puVar5 = puStack_900;
      pdVar21 = &MACH_HEADER.cpusubtype;
    }
    else {
      pdVar16 = (dword *)func_0x00187bd0(puStack_900,8);
      puVar5 = puVar4;
      pdVar21 = pdVar16;
      if (pdVar16 == (dword *)0x0) {
        func_0x007a1f00(8,puStack_900,&UNK_009eb9d8);
        goto code_r0x00533e88;
      }
    }
    puStack_900 = puVar5;
    if (pdVar22 < (dword *)0xfffffffffffffffe) {
      puVar27 = (undefined1 *)((long)pdVar22 + 1);
      if (puVar27 < (undefined1 *)0x8) {
        uVar41 = 1;
        pdVar21 = pdVar16;
      }
      else {
        puVar25 = (undefined1 *)((ulong)puVar27 & 0xfffffffffffffff8);
        pdVar21 = pdVar16 + (long)puVar25 * 2;
        uVar41 = (ulong)puVar25 | 1;
        plVar32 = (long *)(pdVar16 + 8);
        puVar33 = puVar25;
        do {
          plVar32[-3] = (long)puVar3;
          plVar32[-4] = (long)puVar3;
          plVar32[-1] = (long)puVar3;
          plVar32[-2] = (long)puVar3;
          plVar32[1] = (long)puVar3;
          *plVar32 = (long)puVar3;
          plVar32[3] = (long)puVar3;
          plVar32[2] = (long)puVar3;
          puVar33 = puVar33 + -8;
          plVar32 = plVar32 + 8;
        } while (puVar33 != (undefined1 *)0x0);
        if (puVar27 == puVar25) goto code_r0x00533570;
      }
      lVar38 = (long)pdVar22 + (2 - uVar41);
      pdVar17 = pdVar21;
      do {
        pdVar21 = pdVar17 + 2;
        *(undefined1 **)pdVar17 = puVar3;
        lVar38 = lVar38 + -1;
        pdVar17 = pdVar21;
      } while (lVar38 != 0);
    }
code_r0x00533570:
    *(undefined1 **)pdVar21 = puVar3;
  }
code_r0x00533580:
  puStack_88 = (undefined1 *)((long)pdVar19 + 2);
  puVar5 = (undefined *)((long)pdVar22 + 1);
  uStack_98 = 1;
  uStack_78 = _UNK_007fc128;
  uStack_80 = _UNK_007fc120;
  puStack_90 = puVar3;
  puStack_70 = puVar5;
  func_0x00534dec(&puStack_b0,&uStack_98,&UNK_009eb7a0);
  if (pbStack_908 == pbVar7) {
    puStack_8f8 = (undefined *)0x8000000000000000;
  }
  else {
    iStack_92c = 0;
    iVar37 = 0;
    lVar38 = 0;
    pdStack_980 = (dword *)(section_00000068.segname + 8);
    uStack_988 = 8;
    puStack_978 = &UNK_009eb990;
    puStack_970 = &UNK_009eba08;
    puVar29 = (undefined *)0x8000000000000000;
    puStack_8f8 = (undefined *)0x8000000000000000;
    puVar23 = puVar4;
    do {
      puVar13 = puStack_a0;
      pdVar21 = pdStack_a8;
      puVar12 = puStack_b0;
      uVar40 = (uint)*pbStack_908;
      uVar41 = (ulong)uVar40;
      if ((char)*pbStack_908 < '\0') {
        pbVar2 = pbStack_908 + 1;
        if (uVar40 < 0xe0) {
          pbStack_908 = pbStack_908 + 2;
          uVar41 = (ulong)(*pbVar2 & 0x3f | (uVar40 & 0x1f) << 6);
        }
        else {
          uVar8 = pbStack_908[2] & 0x3f | (*pbVar2 & 0x3f) << 6;
          if (uVar40 < 0xf0) {
            uVar41 = (ulong)(uVar8 | (uVar40 & 0x1f) << 0xc);
            pbStack_908 = pbStack_908 + 3;
          }
          else {
            uVar40 = pbStack_908[3] & 0x3f | uVar8 << 6 | (uVar40 & 7) << 0x12;
            uVar41 = (ulong)uVar40;
            if (uVar40 == 0x110000) break;
            pbStack_908 = pbStack_908 + 4;
          }
        }
      }
      else {
        pbStack_908 = pbStack_908 + 1;
      }
      puStack_b0 = puStack_900;
      if (puVar23 < (undefined *)0x2) {
        puVar29 = (undefined *)0x1;
        pdStack_a8 = pdVar16;
        puStack_a0 = puVar23;
code_r0x00533ddc:
        func_0x007a2570(puVar29,puVar23,puStack_970);
        goto code_r0x00533e88;
      }
      lVar38 = lVar38 + 1;
      puVar27 = *(undefined1 **)(pdVar16 + 2);
      *(long *)(pdVar16 + 2) = lVar38;
      uVar40 = (uint)uVar41;
      if (param_3 != (dword *)((long)param_3 + param_4)) {
        uVar30 = (ulong)iStack_8b8;
        puVar31 = (undefined *)0x0;
        if (puStack_a0 != (undefined *)0x0) {
          puVar31 = puStack_a0 + -1;
        }
        puVar10 = (undefined *)0x0;
        if ((undefined *)0x1 < puStack_a0) {
          puVar10 = puStack_a0 + -2;
        }
        puVar35 = (undefined *)0xffffffffffffffff;
        puVar34 = (undefined *)0x0;
        puVar33 = puVar3;
        pdVar22 = param_3;
        do {
          pdVar17 = (dword *)((long)pdVar22 + 1);
          uVar8 = (uint)(byte)*pdVar22;
          if ((char)(byte)*pdVar22 < '\0') {
            uVar9 = *(byte *)((long)pdVar22 + 1) & 0x3f;
            if (uVar8 < 0xe0) {
              pdVar17 = (dword *)((long)pdVar22 + 2);
              uVar8 = uVar9 | (uVar8 & 0x1f) << 6;
            }
            else {
              pdVar17 = (dword *)((long)pdVar22 + 3);
              uVar9 = *(byte *)((long)pdVar22 + 2) & 0x3f | uVar9 << 6;
              if (uVar8 < 0xf0) {
                uVar8 = uVar9 | (uVar8 & 0x1f) << 0xc;
              }
              else {
                uVar8 = *(byte *)pdVar17 & 0x3f | uVar9 << 6 | (uVar8 & 7) << 0x12;
                if (uVar8 == 0x110000) break;
                pdVar17 = pdVar22 + 1;
              }
            }
            if (puVar34 != puVar31) goto code_r0x005337d8;
code_r0x00533cfc:
            puVar20 = puVar34 + 1;
            puVar24 = &UNK_009eba20;
code_r0x00533d24:
            puVar28 = puVar20;
            unaff_x25 = puStack_a0;
code_r0x00533d94:
            pdStack_a8 = pdVar16;
            puStack_a0 = puVar23;
            func_0x007a2570(puVar28,unaff_x25,puVar24);
            goto code_r0x00533e88;
          }
          if (puVar34 == puVar31) goto code_r0x00533cfc;
code_r0x005337d8:
          uVar26 = (ulong)uVar8;
          puVar18 = puVar34 + 1;
          puVar20 = puVar34 + 2;
          if (puVar34 == puVar10) {
            puVar24 = &UNK_009eba38;
            goto code_r0x00533d24;
          }
          puVar25 = *(undefined1 **)(pdStack_a8 + (long)puVar18 * 2);
          if (uVar40 != uVar8) {
            puVar25 = puVar25 + 1;
          }
          puVar6 = (undefined1 *)(*(long *)(pdStack_a8 + (long)puVar20 * 2) + 1);
          if (*(long *)(pdVar16 + (long)puVar18 * 2) + 1 <= (long)puVar6) {
            puVar6 = (undefined1 *)(*(long *)(pdVar16 + (long)puVar18 * 2) + 1);
          }
          if ((long)puVar25 <= (long)puVar6) {
            puVar6 = puVar25;
          }
          if (uVar40 != uVar8) {
            if (uVar8 < 0x100) {
              lVar39 = *(long *)(adStack_8b0 + uVar26 * 2);
code_r0x00533898:
              if ((long)puVar18 - (long)puVar35 == 1) {
                if (puVar4 <= puVar20) {
                  puVar24 = &UNK_009eba50;
                  puVar28 = puVar20;
                  unaff_x25 = puVar4;
                  goto code_r0x00533d94;
                }
                puVar25 = (undefined1 *)((lVar38 - lVar39) + *(long *)(pdVar15 + (long)puVar20 * 2))
                ;
                if ((long)puVar6 <= (long)puVar25) {
                  puVar25 = puVar6;
                }
              }
              else {
                puVar25 = puVar33 + ((long)puVar18 - (long)puVar35);
                if ((long)puVar6 <= (long)(puVar33 + ((long)puVar18 - (long)puVar35))) {
                  puVar25 = puVar6;
                }
                if (lVar38 - lVar39 != 1) {
                  puVar25 = puVar6;
                }
              }
              goto code_r0x005338e0;
            }
            if (puVar29 == (undefined *)0x8000000000000000) {
              lVar39 = -1;
              goto code_r0x00533898;
            }
            puVar28 = (undefined *)(uVar30 & uVar26);
            if (puVar28 < unaff_x25) {
              lVar39 = *(long *)(pdVar19 + (long)puVar28 * 4);
              if ((lVar39 != -1) && (pdVar19[((long)puVar28 * 2 + 1) * 2] != uVar8)) {
                puVar28 = (undefined *)(uVar26 + (long)puVar28 * 5 + 1 & uVar30);
                if (unaff_x25 <= puVar28) {
code_r0x00533d2c:
                  puVar24 = &UNK_009eb978;
                  goto code_r0x00533d94;
                }
                while ((lVar39 = *(long *)(pdVar19 + (long)puVar28 * 4), lVar39 != -1 &&
                       (pdVar19[((long)puVar28 * 2 + 1) * 2] != uVar8))) {
                  uVar26 = uVar26 >> 5;
                  puVar28 = (undefined *)((long)puVar28 * 5 + (ulong)((int)uVar26 + 1) & uVar30);
                  if (unaff_x25 <= puVar28) goto code_r0x00533d2c;
                }
              }
              if (puVar28 < unaff_x25) goto code_r0x00533898;
              puVar24 = &UNK_009eb8e8;
            }
            else {
              puVar24 = &UNK_009eb960;
            }
            goto code_r0x00533d94;
          }
          if (puVar4 <= puVar20) {
            puVar24 = &UNK_009eba68;
            puVar28 = puVar20;
            unaff_x25 = puVar4;
            goto code_r0x00533d94;
          }
          *(undefined8 *)(pdVar15 + (long)puVar20 * 2) =
               *(undefined8 *)(pdStack_a8 + (long)puVar34 * 2);
          puVar25 = puVar6;
          puVar35 = puVar18;
          puVar33 = puVar27;
code_r0x005338e0:
          if (puVar34 == puVar23 + -2) {
            puVar24 = &UNK_009eba80;
            puVar28 = puVar23;
            unaff_x25 = puVar23;
            goto code_r0x00533d94;
          }
          puVar27 = *(undefined1 **)(pdVar16 + (long)puVar20 * 2);
          *(undefined1 **)(pdVar16 + (long)puVar20 * 2) = puVar25;
          puVar34 = puVar18;
          pdVar22 = pdVar17;
        } while (pdVar17 != (dword *)((long)param_3 + param_4));
      }
      if (0xff < uVar40) {
        if (puStack_8f8 == (undefined *)0x8000000000000000) {
          iStack_8b8 = 7;
          pdStack_a8 = pdVar16;
          puStack_a0 = puVar23;
          pdVar19 = (dword *)func_0x00187bd0(0x80,8);
          if (pdVar19 != (dword *)0x0) {
            *(undefined8 *)pdVar19 = 0xffffffffffffffff;
            pdVar19[2] = 0;
            *(undefined8 *)(pdVar19 + 4) = 0xffffffffffffffff;
            pdVar19[6] = 0;
            *(undefined8 *)(pdVar19 + 8) = 0xffffffffffffffff;
            pdVar19[10] = 0;
            *(undefined8 *)(pdVar19 + 0xc) = 0xffffffffffffffff;
            pdVar19[0xe] = 0;
            *(undefined8 *)(pdVar19 + 0x10) = 0xffffffffffffffff;
            pdVar19[0x12] = 0;
            *(undefined8 *)(pdVar19 + 0x14) = 0xffffffffffffffff;
            pdVar19[0x16] = 0;
            *(undefined8 *)(pdVar19 + 0x18) = 0xffffffffffffffff;
            pdVar19[0x1a] = 0;
            *(undefined8 *)(pdVar19 + 0x1c) = 0xffffffffffffffff;
            pdVar19[0x1e] = 0;
            puStack_8d8 = (undefined *)0x8;
            puStack_8c8 = (undefined *)0x8;
            pdStack_8d0 = pdVar19;
            puVar29 = (undefined *)func_0x00533238(&puStack_8d8,uVar41);
            puStack_8f8 = (undefined *)0x8;
            puVar23 = (undefined *)0x8;
            goto code_r0x00533a1c;
          }
          puStack_978 = &UNK_009eb930;
          goto code_r0x00533e18;
        }
        pdStack_a8 = pdVar16;
        puStack_a0 = puVar23;
        puVar29 = (undefined *)func_0x00533238(&puStack_8d8,uVar41);
        puVar23 = unaff_x25;
code_r0x00533a1c:
        if (puVar29 < puVar23) {
          unaff_x25 = puVar23;
          if (*(long *)(pdVar19 + (long)puVar29 * 4) == -1) {
            iVar37 = iVar37 + 1;
            if (iVar37 * 3 < iStack_8b8 * 2 + 2) {
              uStack_8c0._4_4_ = iVar37;
            }
            else {
              uVar8 = iStack_8b8 + 1;
              do {
                uVar9 = uVar8;
                uVar8 = uVar9 << 1;
              } while ((int)uVar9 <= iStack_92c * 2 + 2);
              iStack_8b8 = uVar9 - 1;
              uStack_8c0 = CONCAT44(iStack_92c,(int)uStack_8c0);
              if (((int)uVar9 < 0) ||
                 (pdVar22 = (dword *)(-(ulong)(uVar9 >> 0x1f) & 0xfffffff000000000 |
                                     (ulong)uVar9 << 4), (dword *)0x7ffffffffffffff8 < pdVar22)) {
                uStack_988 = 0;
                pdStack_980 = pdStack_968;
code_r0x00533e18:
                func_0x007a1f00(uStack_988,pdStack_980,puStack_978);
                goto code_r0x00533e88;
              }
              if (uVar9 == 0) {
                puVar31 = (undefined *)0x0;
                unaff_x25 = (undefined *)0x0;
                pdStack_968 = &MACH_HEADER.cpusubtype;
              }
              else {
                pdStack_968 = (dword *)func_0x00187bd0(pdVar22,8);
                if (pdStack_968 == (dword *)0x0) {
                  pdStack_980 = pdVar22;
                  goto code_r0x00533e18;
                }
                puVar31 = (undefined *)(long)(int)uVar9;
                pdVar22 = pdStack_968;
                if (uVar9 == 1) {
                  unaff_x25 = (undefined *)0x1;
                }
                else {
                  puVar29 = puVar31 + -1;
                  do {
                    *(undefined8 *)pdVar22 = 0xffffffffffffffff;
                    pdVar22[2] = 0;
                    pdVar22 = pdVar22 + 4;
                    puVar29 = puVar29 + -1;
                  } while (puVar29 != (undefined *)0x0);
                  unaff_x25 = puVar31;
                }
                *(undefined8 *)pdVar22 = 0xffffffffffffffff;
                pdVar22[2] = 0;
              }
              pdVar22 = pdVar19;
              iVar37 = iStack_92c;
              puStack_8d8 = puVar31;
              pdStack_8d0 = pdStack_968;
              puStack_8c8 = unaff_x25;
              do {
                lVar39 = *(long *)pdVar22;
                if (lVar39 != -1) {
                  dVar11 = pdVar22[2];
                  puVar29 = (undefined *)func_0x00533238(&puStack_8d8,dVar11);
                  if (unaff_x25 <= puVar29) {
                    func_0x007a2570(puVar29,unaff_x25,&UNK_009eb9a8);
                    goto code_r0x00533e88;
                  }
                  (pdStack_968 + (long)puVar29 * 4)[2] = dVar11;
                  *(long *)(pdStack_968 + (long)puVar29 * 4) = lVar39;
                  iVar37 = iVar37 + -1;
                  uStack_8c0 = CONCAT44(uStack_8c0._4_4_,iVar37);
                  if (iVar37 == 0) break;
                }
                pdVar22 = pdVar22 + 4;
              } while (pdVar22 != pdVar19 + (long)puVar23 * 4);
              if (puStack_8f8 != (undefined *)0x0) {
                func_0x00187bd4(pdVar19,(long)puStack_8f8 << 4,8);
              }
              uStack_8c0._0_4_ = iStack_92c;
              puVar29 = (undefined *)func_0x00533238(&puStack_8d8,uVar41);
              pdVar19 = pdStack_968;
              puStack_8f8 = puVar31;
              iVar37 = iStack_92c;
            }
            iStack_92c = iStack_92c + 1;
            uStack_8c0 = CONCAT44(uStack_8c0._4_4_,iStack_92c);
            puVar23 = unaff_x25;
            if (puVar29 < unaff_x25) goto code_r0x00533c0c;
          }
          else if (puVar29 < puVar23) {
code_r0x00533c0c:
            pdVar22 = pdVar19 + (long)puVar29 * 4;
            pdVar22[2] = uVar40;
            puVar29 = puStack_8f8;
            goto code_r0x00533624;
          }
          puStack_970 = &UNK_009eb918;
        }
        else {
          puStack_970 = &UNK_009eb900;
        }
        goto code_r0x00533ddc;
      }
      pdVar22 = adStack_8b0 + uVar41 * 2;
      pdStack_a8 = pdVar16;
      puStack_a0 = puVar23;
code_r0x00533624:
      *(long *)pdVar22 = lVar38;
      puVar23 = puVar13;
      pdVar16 = pdVar21;
      puStack_900 = puVar12;
    } while (pbStack_908 != pbVar7);
  }
  if (puVar5 < puStack_a0) {
    uVar36 = *(undefined8 *)(pdStack_a8 + (long)puVar5 * 2);
    if (puStack_b0 != (undefined *)0x0) {
      func_0x00187bd4(pdStack_a8,(long)puStack_b0 << 3,8);
    }
    if (puStack_900 != (undefined *)0x0) {
      func_0x00187bd4(pdVar16,(long)puStack_900 << 3,8);
    }
    if (puVar24 != (undefined *)0x0) {
      func_0x00187bd4(pdVar15,(long)puVar24 << 3,8);
    }
    if ((puStack_8f8 != (undefined *)0x8000000000000000) && (puStack_8f8 != (undefined *)0x0)) {
      func_0x00187bd4(pdStack_8d0,(long)puStack_8f8 << 4,8);
    }
    return uVar36;
  }
  func_0x007a2570(puVar5,puStack_a0,&UNK_009eb9f0);
code_r0x00533e88:
                    /* WARNING: Does not return */
  pcVar14 = (code *)SoftwareBreakpoint(1,0x533e8c);
  (*pcVar14)();
}

