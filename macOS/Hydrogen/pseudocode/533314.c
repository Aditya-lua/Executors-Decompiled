
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00533314(void)

{
  bool bVar1;
  undefined *puVar2;
  undefined *puVar3;
  uint uVar4;
  undefined *puVar5;
  undefined *puVar6;
  dword dVar7;
  uint uVar8;
  undefined *puVar9;
  undefined *puVar10;
  code *pcVar11;
  undefined8 uVar12;
  dword *pdVar13;
  dword *pdVar14;
  byte *pbVar15;
  undefined *puVar16;
  dword *pdVar17;
  undefined *puVar18;
  undefined *puVar19;
  dword *pdVar20;
  undefined *puVar21;
  byte *in_x3;
  undefined *puVar22;
  byte *in_x4;
  ulong uVar23;
  dword *in_x5;
  undefined *puVar24;
  undefined8 extraout_x8;
  dword *pdVar25;
  undefined *puVar26;
  undefined *puVar27;
  ulong uVar28;
  undefined8 *puVar29;
  undefined *puVar30;
  undefined *puVar31;
  undefined *puVar32;
  byte *pbVar33;
  undefined *puVar34;
  int iVar35;
  long lVar36;
  undefined *unaff_x25;
  long lVar37;
  uint uVar38;
  ulong uVar39;
  undefined1 auVar40 [16];
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
  undefined *puStack_90;
  undefined *puStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined *puStack_70;
  
  uVar12 = func_0x007a23d8();
  pdVar20 = (dword *)&UNK_009eb960;
  auVar40 = func_0x007a2570(uVar12,extraout_x8);
  pbStack_908 = auVar40._0_8_;
  pdVar17 = in_x5;
  if (in_x5 <= pdVar20) {
    pdVar17 = pdVar20;
  }
  puVar21 = (undefined *)((long)pdVar17 + 1);
  _memset(adStack_8b0,0xff,0x800);
  uStack_8c0 = 0;
  iStack_8b8 = -1;
  puVar2 = (undefined *)((long)in_x5 + 2);
  puStack_900 = (undefined *)((long)puVar2 * 8);
  puStack_8d8 = (undefined *)0x8000000000000000;
  bVar1 = (ulong)puVar2 >> 0x3d != 0 || (undefined *)0x7ffffffffffffff8 < puStack_900;
  puVar34 = puVar2;
  if (pdVar17 == (dword *)0xffffffffffffffff) {
    if (bVar1) {
      func_0x007a1f00(0,puStack_900,&UNK_009eb9c0);
      goto code_r0x00533e40;
    }
    if (puStack_900 != (undefined *)0x0) {
      uVar12 = 8;
      pdVar13 = (dword *)func_0x00187bdc(puStack_900,8);
      if (pdVar13 == (dword *)0x0) goto LAB_00533e44;
      pdVar14 = (dword *)func_0x00187bdc(puStack_900,8);
      if (pdVar14 != (dword *)0x0) {
        puStack_900 = puVar2;
        goto code_r0x00533580;
      }
      goto code_r0x00533e58;
    }
    puVar34 = (undefined *)0x0;
    pdVar13 = &MACH_HEADER.cpusubtype;
code_r0x0053357c:
    pdVar14 = &MACH_HEADER.cpusubtype;
  }
  else {
    if (bVar1) {
code_r0x00533e40:
      uVar12 = 0;
LAB_00533e44:
      func_0x007a1f00(uVar12,puStack_900,&UNK_009eb9c0);
code_r0x00533e58:
      func_0x007a1f00(8,puStack_900,&UNK_009eb9d8);
      goto code_r0x00533e88;
    }
    if (puStack_900 == (undefined *)0x0) {
      puVar34 = (undefined *)0x0;
      pdVar20 = &MACH_HEADER.cpusubtype;
      pdVar13 = pdVar20;
      if (in_x5 < (dword *)0xfffffffffffffffe) goto code_r0x00533448;
code_r0x0053347c:
      pdVar13 = pdVar20;
      if (puVar2 == (undefined *)0x0) {
        puStack_900 = (undefined *)0x0;
        goto code_r0x0053357c;
      }
    }
    else {
      unaff_x25 = &___rust_no_alloc_shim_is_unstable;
      uVar12 = 8;
      pdVar20 = (dword *)func_0x00187bd0(puStack_900,8);
      if (pdVar20 == (dword *)0x0) goto LAB_00533e44;
      pdVar13 = pdVar20;
      if ((dword *)0xfffffffffffffffd < in_x5) goto code_r0x0053347c;
code_r0x00533448:
      puVar27 = (undefined *)((long)in_x5 + 1);
      if (puVar27 < (undefined *)0x8) {
        uVar39 = 1;
        pdVar20 = pdVar13;
      }
      else {
        puVar26 = (undefined *)((ulong)puVar27 & 0xfffffffffffffff8);
        pdVar20 = pdVar13 + (long)puVar26 * 2;
        uVar39 = (ulong)puVar26 | 1;
        puVar29 = (undefined8 *)(pdVar13 + 8);
        puVar19 = puVar26;
        do {
          puVar29[-3] = puVar21;
          puVar29[-4] = puVar21;
          puVar29[-1] = puVar21;
          puVar29[-2] = puVar21;
          puVar29[1] = puVar21;
          *puVar29 = puVar21;
          puVar29[3] = puVar21;
          puVar29[2] = puVar21;
          puVar19 = puVar19 + -8;
          puVar29 = puVar29 + 8;
        } while (puVar19 != (undefined *)0x0);
        if (puVar27 == puVar26) goto code_r0x005334d0;
      }
      puVar27 = (undefined *)((long)in_x5 + (2 - uVar39));
      pdVar14 = pdVar20;
      do {
        pdVar20 = pdVar14 + 2;
        *(undefined **)pdVar14 = puVar21;
        puVar27 = puVar27 + -1;
        pdVar14 = pdVar20;
      } while (puVar27 != (undefined *)0x0);
    }
code_r0x005334d0:
    *(undefined **)pdVar20 = puVar21;
    if (puStack_900 == (undefined *)0x0) {
      pdVar14 = &MACH_HEADER.cpusubtype;
      puVar27 = puStack_900;
      pdVar20 = &MACH_HEADER.cpusubtype;
    }
    else {
      pdVar14 = (dword *)func_0x00187bd0(puStack_900,8);
      puVar27 = puVar2;
      pdVar20 = pdVar14;
      if (pdVar14 == (dword *)0x0) {
        func_0x007a1f00(8,puStack_900,&UNK_009eb9d8);
        goto code_r0x00533e88;
      }
    }
    puStack_900 = puVar27;
    if (in_x5 < (dword *)0xfffffffffffffffe) {
      puVar27 = (undefined *)((long)in_x5 + 1);
      if (puVar27 < (undefined *)0x8) {
        uVar39 = 1;
        pdVar20 = pdVar14;
      }
      else {
        puVar26 = (undefined *)((ulong)puVar27 & 0xfffffffffffffff8);
        pdVar20 = pdVar14 + (long)puVar26 * 2;
        uVar39 = (ulong)puVar26 | 1;
        puVar29 = (undefined8 *)(pdVar14 + 8);
        puVar19 = puVar26;
        do {
          puVar29[-3] = puVar21;
          puVar29[-4] = puVar21;
          puVar29[-1] = puVar21;
          puVar29[-2] = puVar21;
          puVar29[1] = puVar21;
          *puVar29 = puVar21;
          puVar29[3] = puVar21;
          puVar29[2] = puVar21;
          puVar19 = puVar19 + -8;
          puVar29 = puVar29 + 8;
        } while (puVar19 != (undefined *)0x0);
        if (puVar27 == puVar26) goto code_r0x00533570;
      }
      puVar27 = (undefined *)((long)in_x5 + (2 - uVar39));
      pdVar25 = pdVar20;
      do {
        pdVar20 = pdVar25 + 2;
        *(undefined **)pdVar25 = puVar21;
        puVar27 = puVar27 + -1;
        pdVar25 = pdVar20;
      } while (puVar27 != (undefined *)0x0);
    }
code_r0x00533570:
    *(undefined **)pdVar20 = puVar21;
  }
code_r0x00533580:
  puStack_88 = (undefined *)((long)pdVar17 + 2);
  puVar27 = (undefined *)((long)in_x5 + 1);
  uStack_98 = 1;
  uStack_78 = _UNK_007fc128;
  uStack_80 = _UNK_007fc120;
  puStack_90 = puVar21;
  puStack_70 = puVar27;
  func_0x00534dec(&puStack_b0,&uStack_98,&UNK_009eb7a0);
  if (pbStack_908 == auVar40._8_8_) {
    puStack_8f8 = (undefined *)0x8000000000000000;
  }
  else {
    iStack_92c = 0;
    iVar35 = 0;
    lVar36 = 0;
    pdStack_980 = (dword *)(section_00000068.segname + 8);
    uStack_988 = 8;
    puStack_978 = &UNK_009eb990;
    puStack_970 = &UNK_009eba08;
    puVar26 = (undefined *)0x8000000000000000;
    puStack_8f8 = (undefined *)0x8000000000000000;
    puVar19 = puVar2;
    do {
      puVar10 = puStack_a0;
      pdVar20 = pdStack_a8;
      puVar9 = puStack_b0;
      uVar38 = (uint)*pbStack_908;
      uVar39 = (ulong)uVar38;
      if ((char)*pbStack_908 < '\0') {
        pbVar33 = pbStack_908 + 1;
        if (uVar38 < 0xe0) {
          pbStack_908 = pbStack_908 + 2;
          uVar39 = (ulong)(*pbVar33 & 0x3f | (uVar38 & 0x1f) << 6);
        }
        else {
          uVar4 = pbStack_908[2] & 0x3f | (*pbVar33 & 0x3f) << 6;
          if (uVar38 < 0xf0) {
            uVar39 = (ulong)(uVar4 | (uVar38 & 0x1f) << 0xc);
            pbStack_908 = pbStack_908 + 3;
          }
          else {
            uVar38 = pbStack_908[3] & 0x3f | uVar4 << 6 | (uVar38 & 7) << 0x12;
            uVar39 = (ulong)uVar38;
            if (uVar38 == 0x110000) break;
            pbStack_908 = pbStack_908 + 4;
          }
        }
      }
      else {
        pbStack_908 = pbStack_908 + 1;
      }
      puStack_b0 = puStack_900;
      if (puVar19 < (undefined *)0x2) {
        puVar26 = (undefined *)0x1;
        pdStack_a8 = pdVar14;
        puStack_a0 = puVar19;
code_r0x00533ddc:
        func_0x007a2570(puVar26,puVar19,puStack_970);
        goto code_r0x00533e88;
      }
      lVar36 = lVar36 + 1;
      puVar24 = *(undefined **)(pdVar14 + 2);
      *(long *)(pdVar14 + 2) = lVar36;
      uVar38 = (uint)uVar39;
      if (in_x3 != in_x4) {
        uVar28 = (ulong)iStack_8b8;
        puVar5 = (undefined *)0x0;
        if (puStack_a0 != (undefined *)0x0) {
          puVar5 = puStack_a0 + -1;
        }
        puVar6 = (undefined *)0x0;
        if ((undefined *)0x1 < puStack_a0) {
          puVar6 = puStack_a0 + -2;
        }
        puVar31 = (undefined *)0xffffffffffffffff;
        puVar30 = (undefined *)0x0;
        puVar32 = puVar21;
        pbVar33 = in_x3;
        do {
          pbVar15 = pbVar33 + 1;
          uVar4 = (uint)*pbVar33;
          if ((char)*pbVar33 < '\0') {
            if (uVar4 < 0xe0) {
              pbVar15 = pbVar33 + 2;
              uVar4 = pbVar33[1] & 0x3f | (uVar4 & 0x1f) << 6;
            }
            else {
              pbVar15 = pbVar33 + 3;
              uVar8 = pbVar33[2] & 0x3f | (pbVar33[1] & 0x3f) << 6;
              if (uVar4 < 0xf0) {
                uVar4 = uVar8 | (uVar4 & 0x1f) << 0xc;
              }
              else {
                uVar4 = *pbVar15 & 0x3f | uVar8 << 6 | (uVar4 & 7) << 0x12;
                if (uVar4 == 0x110000) break;
                pbVar15 = pbVar33 + 4;
              }
            }
            if (puVar30 != puVar5) goto code_r0x005337d8;
code_r0x00533cfc:
            puVar18 = puVar30 + 1;
            puVar21 = &UNK_009eba20;
code_r0x00533d24:
            puVar24 = puVar18;
            unaff_x25 = puStack_a0;
code_r0x00533d94:
            pdStack_a8 = pdVar14;
            puStack_a0 = puVar19;
            func_0x007a2570(puVar24,unaff_x25,puVar21);
            goto code_r0x00533e88;
          }
          if (puVar30 == puVar5) goto code_r0x00533cfc;
code_r0x005337d8:
          uVar23 = (ulong)uVar4;
          puVar16 = puVar30 + 1;
          puVar18 = puVar30 + 2;
          if (puVar30 == puVar6) {
            puVar21 = &UNK_009eba38;
            goto code_r0x00533d24;
          }
          puVar22 = *(undefined **)(pdStack_a8 + (long)puVar16 * 2);
          if (uVar38 != uVar4) {
            puVar22 = puVar22 + 1;
          }
          puVar3 = (undefined *)(*(long *)(pdStack_a8 + (long)puVar18 * 2) + 1);
          if (*(long *)(pdVar14 + (long)puVar16 * 2) + 1 <= (long)puVar3) {
            puVar3 = (undefined *)(*(long *)(pdVar14 + (long)puVar16 * 2) + 1);
          }
          if ((long)puVar22 <= (long)puVar3) {
            puVar3 = puVar22;
          }
          if (uVar38 != uVar4) {
            if (uVar4 < 0x100) {
              lVar37 = *(long *)(adStack_8b0 + uVar23 * 2);
code_r0x00533898:
              if ((long)puVar16 - (long)puVar31 == 1) {
                if (puVar2 <= puVar18) {
                  puVar21 = &UNK_009eba50;
                  puVar24 = puVar18;
                  unaff_x25 = puVar2;
                  goto code_r0x00533d94;
                }
                puVar22 = (undefined *)((lVar36 - lVar37) + *(long *)(pdVar13 + (long)puVar18 * 2));
                if ((long)puVar3 <= (long)puVar22) {
                  puVar22 = puVar3;
                }
              }
              else {
                puVar22 = puVar32 + ((long)puVar16 - (long)puVar31);
                if ((long)puVar3 <= (long)(puVar32 + ((long)puVar16 - (long)puVar31))) {
                  puVar22 = puVar3;
                }
                if (lVar36 - lVar37 != 1) {
                  puVar22 = puVar3;
                }
              }
              goto code_r0x005338e0;
            }
            if (puVar26 == (undefined *)0x8000000000000000) {
              lVar37 = -1;
              goto code_r0x00533898;
            }
            puVar24 = (undefined *)(uVar28 & uVar23);
            if (puVar24 < unaff_x25) {
              lVar37 = *(long *)(pdVar17 + (long)puVar24 * 4);
              if ((lVar37 != -1) && (pdVar17[((long)puVar24 * 2 + 1) * 2] != uVar4)) {
                puVar24 = (undefined *)(uVar23 + (long)puVar24 * 5 + 1 & uVar28);
                if (unaff_x25 <= puVar24) {
code_r0x00533d2c:
                  puVar21 = &UNK_009eb978;
                  goto code_r0x00533d94;
                }
                while ((lVar37 = *(long *)(pdVar17 + (long)puVar24 * 4), lVar37 != -1 &&
                       (pdVar17[((long)puVar24 * 2 + 1) * 2] != uVar4))) {
                  uVar23 = uVar23 >> 5;
                  puVar24 = (undefined *)((long)puVar24 * 5 + (ulong)((int)uVar23 + 1) & uVar28);
                  if (unaff_x25 <= puVar24) goto code_r0x00533d2c;
                }
              }
              if (puVar24 < unaff_x25) goto code_r0x00533898;
              puVar21 = &UNK_009eb8e8;
            }
            else {
              puVar21 = &UNK_009eb960;
            }
            goto code_r0x00533d94;
          }
          if (puVar2 <= puVar18) {
            puVar21 = &UNK_009eba68;
            puVar24 = puVar18;
            unaff_x25 = puVar2;
            goto code_r0x00533d94;
          }
          *(undefined8 *)(pdVar13 + (long)puVar18 * 2) =
               *(undefined8 *)(pdStack_a8 + (long)puVar30 * 2);
          puVar22 = puVar3;
          puVar31 = puVar16;
          puVar32 = puVar24;
code_r0x005338e0:
          if (puVar30 == puVar19 + -2) {
            puVar21 = &UNK_009eba80;
            puVar24 = puVar19;
            unaff_x25 = puVar19;
            goto code_r0x00533d94;
          }
          puVar24 = *(undefined **)(pdVar14 + (long)puVar18 * 2);
          *(undefined **)(pdVar14 + (long)puVar18 * 2) = puVar22;
          puVar30 = puVar16;
          pbVar33 = pbVar15;
        } while (pbVar15 != in_x4);
      }
      if (0xff < uVar38) {
        if (puStack_8f8 == (undefined *)0x8000000000000000) {
          iStack_8b8 = 7;
          pdStack_a8 = pdVar14;
          puStack_a0 = puVar19;
          pdVar17 = (dword *)func_0x00187bd0(0x80,8);
          if (pdVar17 != (dword *)0x0) {
            *(undefined8 *)pdVar17 = 0xffffffffffffffff;
            pdVar17[2] = 0;
            *(undefined8 *)(pdVar17 + 4) = 0xffffffffffffffff;
            pdVar17[6] = 0;
            *(undefined8 *)(pdVar17 + 8) = 0xffffffffffffffff;
            pdVar17[10] = 0;
            *(undefined8 *)(pdVar17 + 0xc) = 0xffffffffffffffff;
            pdVar17[0xe] = 0;
            *(undefined8 *)(pdVar17 + 0x10) = 0xffffffffffffffff;
            pdVar17[0x12] = 0;
            *(undefined8 *)(pdVar17 + 0x14) = 0xffffffffffffffff;
            pdVar17[0x16] = 0;
            *(undefined8 *)(pdVar17 + 0x18) = 0xffffffffffffffff;
            pdVar17[0x1a] = 0;
            *(undefined8 *)(pdVar17 + 0x1c) = 0xffffffffffffffff;
            pdVar17[0x1e] = 0;
            puStack_8d8 = (undefined *)0x8;
            puStack_8c8 = (undefined *)0x8;
            pdStack_8d0 = pdVar17;
            puVar26 = (undefined *)func_0x00533238(&puStack_8d8,uVar39);
            puStack_8f8 = (undefined *)0x8;
            puVar19 = (undefined *)0x8;
            goto code_r0x00533a1c;
          }
          puStack_978 = &UNK_009eb930;
          goto code_r0x00533e18;
        }
        pdStack_a8 = pdVar14;
        puStack_a0 = puVar19;
        puVar26 = (undefined *)func_0x00533238(&puStack_8d8,uVar39);
        puVar19 = unaff_x25;
code_r0x00533a1c:
        if (puVar26 < puVar19) {
          unaff_x25 = puVar19;
          if (*(long *)(pdVar17 + (long)puVar26 * 4) == -1) {
            iVar35 = iVar35 + 1;
            if (iVar35 * 3 < iStack_8b8 * 2 + 2) {
              uStack_8c0._4_4_ = iVar35;
            }
            else {
              uVar4 = iStack_8b8 + 1;
              do {
                uVar8 = uVar4;
                uVar4 = uVar8 << 1;
              } while ((int)uVar8 <= iStack_92c * 2 + 2);
              iStack_8b8 = uVar8 - 1;
              uStack_8c0 = CONCAT44(iStack_92c,(int)uStack_8c0);
              if (((int)uVar8 < 0) ||
                 (pdVar14 = (dword *)(-(ulong)(uVar8 >> 0x1f) & 0xfffffff000000000 |
                                     (ulong)uVar8 << 4), (dword *)0x7ffffffffffffff8 < pdVar14)) {
                uStack_988 = 0;
                pdStack_980 = pdStack_968;
code_r0x00533e18:
                func_0x007a1f00(uStack_988,pdStack_980,puStack_978);
                goto code_r0x00533e88;
              }
              if (uVar8 == 0) {
                puVar24 = (undefined *)0x0;
                unaff_x25 = (undefined *)0x0;
                pdStack_968 = &MACH_HEADER.cpusubtype;
              }
              else {
                pdStack_968 = (dword *)func_0x00187bd0(pdVar14,8);
                if (pdStack_968 == (dword *)0x0) {
                  pdStack_980 = pdVar14;
                  goto code_r0x00533e18;
                }
                puVar24 = (undefined *)(long)(int)uVar8;
                pdVar14 = pdStack_968;
                if (uVar8 == 1) {
                  unaff_x25 = (undefined *)0x1;
                }
                else {
                  puVar26 = puVar24 + -1;
                  do {
                    *(undefined8 *)pdVar14 = 0xffffffffffffffff;
                    pdVar14[2] = 0;
                    pdVar14 = pdVar14 + 4;
                    puVar26 = puVar26 + -1;
                  } while (puVar26 != (undefined *)0x0);
                  unaff_x25 = puVar24;
                }
                *(undefined8 *)pdVar14 = 0xffffffffffffffff;
                pdVar14[2] = 0;
              }
              pdVar14 = pdVar17;
              iVar35 = iStack_92c;
              puStack_8d8 = puVar24;
              pdStack_8d0 = pdStack_968;
              puStack_8c8 = unaff_x25;
              do {
                lVar37 = *(long *)pdVar14;
                if (lVar37 != -1) {
                  dVar7 = pdVar14[2];
                  puVar26 = (undefined *)func_0x00533238(&puStack_8d8,dVar7);
                  if (unaff_x25 <= puVar26) {
                    func_0x007a2570(puVar26,unaff_x25,&UNK_009eb9a8);
                    goto code_r0x00533e88;
                  }
                  (pdStack_968 + (long)puVar26 * 4)[2] = dVar7;
                  *(long *)(pdStack_968 + (long)puVar26 * 4) = lVar37;
                  iVar35 = iVar35 + -1;
                  uStack_8c0 = CONCAT44(uStack_8c0._4_4_,iVar35);
                  if (iVar35 == 0) break;
                }
                pdVar14 = pdVar14 + 4;
              } while (pdVar14 != pdVar17 + (long)puVar19 * 4);
              if (puStack_8f8 != (undefined *)0x0) {
                func_0x00187bd4(pdVar17,(long)puStack_8f8 << 4,8);
              }
              uStack_8c0._0_4_ = iStack_92c;
              puVar26 = (undefined *)func_0x00533238(&puStack_8d8,uVar39);
              pdVar17 = pdStack_968;
              puStack_8f8 = puVar24;
              iVar35 = iStack_92c;
            }
            iStack_92c = iStack_92c + 1;
            uStack_8c0 = CONCAT44(uStack_8c0._4_4_,iStack_92c);
            puVar19 = unaff_x25;
            if (puVar26 < unaff_x25) goto code_r0x00533c0c;
          }
          else if (puVar26 < puVar19) {
code_r0x00533c0c:
            pdVar25 = pdVar17 + (long)puVar26 * 4;
            pdVar25[2] = uVar38;
            puVar26 = puStack_8f8;
            goto code_r0x00533624;
          }
          puStack_970 = &UNK_009eb918;
        }
        else {
          puStack_970 = &UNK_009eb900;
        }
        goto code_r0x00533ddc;
      }
      pdVar25 = adStack_8b0 + uVar39 * 2;
      pdStack_a8 = pdVar14;
      puStack_a0 = puVar19;
code_r0x00533624:
      *(long *)pdVar25 = lVar36;
      puVar19 = puVar10;
      pdVar14 = pdVar20;
      puStack_900 = puVar9;
    } while (pbStack_908 != auVar40._8_8_);
  }
  if (puVar27 < puStack_a0) {
    uVar12 = *(undefined8 *)(pdStack_a8 + (long)puVar27 * 2);
    if (puStack_b0 != (undefined *)0x0) {
      func_0x00187bd4(pdStack_a8,(long)puStack_b0 << 3,8);
    }
    if (puStack_900 != (undefined *)0x0) {
      func_0x00187bd4(pdVar14,(long)puStack_900 << 3,8);
    }
    if (puVar34 != (undefined *)0x0) {
      func_0x00187bd4(pdVar13,(long)puVar34 << 3,8);
    }
    if ((puStack_8f8 != (undefined *)0x8000000000000000) && (puStack_8f8 != (undefined *)0x0)) {
      func_0x00187bd4(pdStack_8d0,(long)puStack_8f8 << 4,8);
    }
    return uVar12;
  }
  func_0x007a2570(puVar27,puStack_a0,&UNK_009eb9f0);
code_r0x00533e88:
                    /* WARNING: Does not return */
  pcVar11 = (code *)SoftwareBreakpoint(1,0x533e8c);
  (*pcVar11)();
}

