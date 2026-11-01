/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_1801dae50(longlong param_1,ulonglong param_2,ulonglong param_3,ulonglong param_4)

{
  ulonglong uVar1;
  byte bVar2;
  code *pcVar3;
  byte bVar4;
  int iVar5;
  uint uVar6;
  ulonglong *puVar7;
  undefined8 uVar8;
  ulonglong uVar9;
  ulonglong uVar10;
  longlong *plVar11;
  ulonglong uVar12;
  longlong *plVar13;
  undefined1 *puVar14;
  ulonglong uVar15;
  ulonglong uVar16;
  undefined4 *puVar17;
  byte bVar18;
  char cVar19;
  char cVar20;
  undefined1 uVar21;
  longlong lVar22;
  undefined2 uVar23;
  longlong lVar24;
  longlong lVar25;
  undefined1 auStack_108 [8];
  undefined1 auStack_100 [24];
  ulonglong *puStack_e8;
  undefined4 uStack_d8;
  undefined4 uStack_d4;
  undefined4 uStack_d0;
  undefined1 uStack_cc;
  undefined2 uStack_cb;
  undefined1 uStack_c9;
  undefined2 uStack_c8;
  undefined1 uStack_c6;
  undefined1 uStack_c5;
  undefined1 uStack_c4;
  undefined5 uStack_c3;
  undefined3 uStack_be;
  longlong *plStack_b8;
  longlong *plStack_b0;
  longlong *plStack_a8;
  ulonglong uStack_a0;
  longlong alStack_98 [5];
  ulonglong uStack_70;
  byte abStack_68 [8];
  ulonglong uStack_60;
  ulonglong uStack_58;
  ulonglong uStack_50;
  undefined4 uStack_47;
  
  uStack_50 = _DAT_1810c1700 ^ (ulonglong)auStack_108;
  uStack_a0 = param_3;
  alStack_98[4] = param_1;
  uStack_60 = param_2;
  uStack_58 = param_4;
  if ((param_2 != 0) && (param_3 != 0)) {
    iVar5 = FUN_1801dced0();
    puVar14 = auStack_108;
    if (iVar5 == 0) {
      uStack_d8 = 0xa3924e6d;
      uStack_d4 = 0;
      uStack_d0 = 0;
      uStack_cc = 0;
      uStack_cb = 0;
      uStack_c9 = 0;
      uStack_c8 = 0;
      uStack_c6 = 0;
      uStack_c5 = 0;
      uStack_c4 = 0;
      uStack_c3 = 0;
      bVar18 = abStack_68[0];
code_r0x0001801daeca:
      puVar7 = (ulonglong *)func_0x000180b36780();
      uVar16 = *puVar7;
      puVar7 = (ulonglong *)func_0x000180b36790();
      uVar9 = *puVar7;
code_r0x0001801daf02:
      uVar10 = uVar9;
      uVar12 = uVar16;
      for (uVar15 = 0; uVar15 < 0x1a; uVar15 = uVar15 + 1) {
        bVar2 = *(byte *)((longlong)alStack_98 + (uVar15 - 0x40));
        cVar20 = (char)uVar15;
code_r0x0001801daf31:
        if (uVar15 < uVar12) {
          puVar17 = (undefined4 *)(auStack_108 + 0xd1da1e);
          goto code_r0x0001801db67e;
        }
        if (uVar10 + 1 <= uVar12) {
          if (uVar12 == uVar10 + 1) {
            bVar18 = cVar20 + 0x32;
            cVar20 = cVar20 + bVar2 + -0x2c;
            goto code_r0x0001801db5bb;
          }
          if (uVar12 == uVar10 + 2) {
            bVar18 = cVar20 - 0x36;
            cVar19 = bVar2 + 0x44;
            goto code_r0x0001801db55f;
          }
          if (uVar12 == uVar10 + 3) {
            bVar18 = cVar20 + 0x2e;
            cVar19 = bVar2 - 0x14;
code_r0x0001801db524:
            bVar18 = cVar19 + cVar20 + (bVar18 & bVar2) * -2;
            goto code_r0x0001801db52f;
          }
          if (uVar12 != uVar10 + 7) {
            if (uVar12 != uVar10 + 6) goto LAB_1801dafa0;
            bVar18 = cVar20 + 0x92;
            cVar19 = bVar2 + 0x94;
            goto code_r0x0001801db4d5;
          }
          bVar18 = cVar20 + bVar2 + '$' + (cVar20 - 6U & bVar2) * -2;
          uVar15 = uVar15 - 1;
          goto code_r0x0001801db5ce;
        }
        bVar18 = (cVar20 + 0x66U & bVar2) * -2 + '6' + cVar20 + 0x66U + bVar2;
LAB_1801dafa0:
        if (uVar15 < uVar10) {
          puVar17 = (undefined4 *)(auStack_108 + 0x16850b8);
          goto code_r0x0001801db67e;
        }
        if (uVar12 < uVar10 + 1) {
          bVar18 = bVar2 + 0x6e + cVar20 + 0x5eU + (cVar20 + 0x5eU & bVar2) * -2;
        }
        else {
          if (uVar12 == uVar10 + 1) {
            bVar18 = cVar20 + 0x2a;
            cVar19 = bVar2 + 4;
            goto code_r0x0001801db4d5;
          }
          if (uVar12 == uVar10 + 2) {
            bVar18 = cVar20 + bVar2 + 't' + (cVar20 - 0x3eU & bVar2) * -2;
            uVar15 = uVar15 - 1;
            goto code_r0x0001801db5ce;
          }
          if (uVar12 == uVar10 + 3) {
            bVar18 = cVar20 + bVar2 + '\x1c' + (cVar20 + 0x26U & bVar2) * -2;
            uVar15 = (uVar15 - 1) - (ulonglong)bVar18;
            goto code_r0x0001801db5ce;
          }
          if (uVar12 == uVar10 + 7) {
            bVar18 = cVar20 - 0xe;
            cVar19 = bVar2 + 0x54;
            goto code_r0x0001801db55f;
          }
          if (uVar12 == uVar10 + 6) {
            bVar18 = cVar20 + 0x8a;
            cVar20 = cVar20 + bVar2 + -0x3c;
            goto code_r0x0001801db5bb;
          }
        }
        while (uVar15 < uVar10 + uVar12) {
          while( true ) {
            if (uVar12 == uVar10 + 6) {
              bVar18 = cVar20 - 0x2c;
              cVar19 = bVar2 + 8;
              goto code_r0x0001801db4d5;
            }
            if (uVar12 == uVar10 + 0x61) {
              bVar18 = cVar20 + bVar2 + '@' + (cVar20 + 0xa0U & bVar2) * -2;
              uVar10 = uVar10 + 1;
              uVar15 = uVar15 - 1;
              goto code_r0x0001801db5ce;
            }
            uVar16 = uVar10 + 0x20;
            if (uVar12 == uVar16) {
              bVar18 = cVar20 + bVar2 + 'x' + (cVar20 + 0x6cU & bVar2) * -2;
              uVar15 = uVar15 - 1;
              goto code_r0x0001801db5ce;
            }
            if (uVar12 == uVar10 + 1) {
              bVar18 = cVar20 + 0x38;
              cVar19 = bVar2 + 0xb0;
              goto code_r0x0001801db524;
            }
            if (uVar12 == uVar10 + 0x80) {
              bVar18 = cVar20 + bVar2 + -0x18 + (cVar20 + 4U & bVar2) * -2;
              uVar12 = uVar12 + uVar10;
              uVar15 = (uVar15 - 1) - (ulonglong)bVar18;
              goto code_r0x0001801db5ce;
            }
            if (uVar16 < uVar10 + 0x27) {
              bVar18 = bVar2 + cVar20 + 0x32U + -0x5e + (bVar2 & cVar20 + 0x32U) * -2;
              goto code_r0x0001801daeca;
            }
            uVar9 = uVar10 + 0x26;
            if (uVar16 < uVar10 + 0xa6) {
              bVar18 = bVar2 + (cVar20 - 2U) + '\x0e' + (bVar2 & cVar20 - 2U) * -2;
              goto code_r0x0001801daf02;
            }
            uVar12 = uVar10 + 0x2c;
            if (uVar16 < uVar12) {
              bVar18 = bVar2 + 0x7a + (cVar20 - 0x36U) + (cVar20 - 0x36U & bVar2) * -2;
              uVar10 = uVar9;
              uVar12 = uVar16;
              goto code_r0x0001801daf31;
            }
            if (uVar16 < uVar10 + 0x87) {
              bVar18 = (bVar2 - 0x1a) + cVar20 + 0x96U + (cVar20 + 0x96U & bVar2) * -2;
              uVar10 = uVar9;
              uVar12 = uVar16;
              goto LAB_1801dafa0;
            }
            if (uVar16 < uVar10 + 0x46) break;
            uVar16 = uVar10 + 0x2d;
            if (uVar10 + 0x8e < uVar12) {
              bVar18 = cVar20 + 0x90;
              cVar20 = cVar20 + bVar2 + -0x60;
              uVar10 = uVar16;
              goto code_r0x0001801db5bb;
            }
            if (uVar10 + 0x4d < uVar12) {
              bVar18 = (bVar2 - 0x28) + cVar20 + (cVar20 + 0x5cU & bVar2) * -2;
              uVar10 = uVar16;
              goto code_r0x0001801db58b;
            }
            uVar9 = uVar10 + 0x2e;
            if (uVar9 < uVar12) {
              bVar18 = cVar20 + 0x28;
              cVar19 = bVar2 + 0x10;
              uVar10 = uVar16;
              goto code_r0x0001801db55f;
            }
            if (uVar10 + 0xad < uVar12) {
              bVar18 = cVar20 + bVar2 + 'H' + (cVar20 - 0xcU & bVar2) * -2;
              uVar15 = (uVar15 - 1) - (ulonglong)bVar18;
              uVar10 = uVar16;
              goto code_r0x0001801db5ce;
            }
            if (uVar10 + 0x33 < uVar12) {
              bVar18 = cVar20 + bVar2 + -0x80 + (cVar20 - 0x40U & bVar2) * -2;
              uVar12 = uVar12 + uVar16;
              uVar15 = (uVar15 - 1) - (ulonglong)bVar18;
              uVar10 = uVar16;
              goto code_r0x0001801db5ce;
            }
            uVar10 = uVar10 + 0x8f;
            uVar12 = uVar9;
          }
          bVar18 = bVar2 + 0x52 + cVar20 + 0x62U + (cVar20 + 0x62U & bVar2) * -2;
          uVar10 = uVar9;
          uVar12 = uVar16;
        }
        uVar16 = uVar10 + 1;
        if (uVar12 < uVar16) {
          bVar18 = bVar2 + 0x9c + cVar20 + (bVar2 & cVar20 + 0x66U) * -2;
code_r0x0001801db258:
          if (uVar10 + uVar12 == 6) {
            bVar18 = cVar20 + -0x68 + (bVar2 & cVar20 + 0x3cU) * -2;
code_r0x0001801db56a:
            bVar4 = bVar2 + 0x34 + (cVar20 + 0xa2U & bVar2) * -2 + cVar20;
            *(byte *)((longlong)alStack_98 + (uVar15 - 0x40)) = bVar4;
            uVar15 = (uVar15 - (uVar10 + 1)) - (ulonglong)bVar4;
            uVar10 = uVar10 + 1;
code_r0x0001801db58b:
            *(byte *)((longlong)alStack_98 + (uVar15 - 0x40)) =
                 (char)uVar15 + -0x30 + bVar2 + ((char)uVar15 + 8U & bVar2) * -2;
            uVar12 = uVar12 + 1;
            uVar15 = uVar15 + ~uVar12;
            goto code_r0x0001801db5c3;
          }
          if (uVar16 < uVar12) {
            bVar18 = bVar2 + 0x2c + cVar20 + (bVar2 & cVar20 + 0x4eU) * -2;
code_r0x0001801db288:
            if (uVar12 == 0) {
              if (uVar10 == 0xffffffffffffffff) {
                bVar18 = cVar20 + bVar2 + '0' + (bVar2 & cVar20 + 0x78U) * -2;
                goto code_r0x0001801db5c3;
              }
              if (uVar10 != 0xfffffffffffffffe) {
                if (uVar10 == 0xfffffffffffffffd) {
                  bVar18 = cVar20 + 0x10;
                  cVar19 = bVar2 + 0xa0;
                  goto code_r0x0001801db55f;
                }
                if (uVar10 == 0xfffffffffffffff9) {
                  bVar18 = cVar20 - 0x28;
                  cVar19 = bVar2 - 0x10;
                  goto code_r0x0001801db4d5;
                }
                if (0x60 < uVar10) {
                  bVar18 = (bVar2 + 0x28 + cVar20 + (bVar2 & cVar20 + 0xa4U) * -2) * '\x02';
                  goto code_r0x0001801db4dd;
                }
                *(byte *)((longlong)alStack_98 + (uVar15 - 0x40)) = bVar18;
                goto code_r0x0001801db5ce;
              }
              bVar18 = bVar2 + 0x68 + cVar20 + (cVar20 + 0x44U & bVar2) * -2;
              goto code_r0x0001801db58b;
            }
            bVar18 = bVar2 * '\x02' + '`' + cVar20 + (bVar2 & cVar20 + 0x70U) * -2;
code_r0x0001801db52f:
            *(byte *)((longlong)alStack_98 + (uVar15 - 0x40)) =
                 bVar2 + (cVar20 - 0x2aU & bVar2) * -2 + -4 + cVar20 + bVar18;
            uVar12 = uVar12 + uVar10;
            uVar15 = (uVar15 - 1) - (ulonglong)bVar18;
          }
          else {
            if (uVar12 == uVar16) {
              bVar18 = cVar20 + 0x1a;
              cVar19 = bVar2 + 100;
              goto code_r0x0001801db4d5;
            }
            if (uVar12 == uVar10 + 2) {
              bVar18 = cVar20 + bVar2 + -0x2c + (cVar20 + 0xb2U & bVar2) * -2;
              uVar15 = uVar15 - 1;
            }
            else {
              if (uVar12 != uVar10 + 3) {
                if (uVar12 == uVar10 + 7) {
                  bVar18 = cVar20 - 0x1e;
                  cVar19 = bVar2 + 0xb4;
                  goto code_r0x0001801db55f;
                }
                if (uVar12 == uVar10 + 6) {
                  bVar18 = cVar20 + 0x7a;
                  cVar20 = cVar20 + bVar2 + '$';
code_r0x0001801db5bb:
                  bVar18 = cVar20 + (bVar18 & bVar2) * -2;
                  goto code_r0x0001801db5c3;
                }
                goto code_r0x0001801db288;
              }
              bVar18 = cVar20 + bVar2 + '|' + (cVar20 + 0x16U & bVar2) * -2;
              uVar15 = (uVar15 - 1) - (ulonglong)bVar18;
            }
          }
        }
        else {
          if (uVar12 != uVar16) {
            if (uVar12 != uVar10 + 2) {
              if (uVar12 == uVar10 + 5) {
                bVar18 = cVar20 + bVar2 + -0x18 + (cVar20 + 0x84U & bVar2) * -2;
                uVar15 = uVar15 - 1;
                goto code_r0x0001801db5ce;
              }
              if (uVar12 != uVar10 + 3) goto code_r0x0001801db258;
              bVar18 = cVar20 + 0x1c;
              cVar19 = bVar2 + 0x58;
code_r0x0001801db4d5:
              bVar18 = cVar19 + cVar20 + (bVar18 & bVar2) * -2;
code_r0x0001801db4dd:
              *(byte *)((longlong)alStack_98 + (uVar15 - 0x40)) =
                   (bVar2 - 0x3c) + (cVar20 + 10U & bVar2) * -2 + cVar20;
              uVar10 = uVar10 + 1;
              uVar15 = uVar15 - 1;
              goto code_r0x0001801db5ce;
            }
            bVar18 = cVar20 + 0x54;
            cVar19 = bVar2 + 8;
code_r0x0001801db55f:
            bVar18 = cVar19 + cVar20 + (bVar18 & bVar2) * -2;
            goto code_r0x0001801db56a;
          }
          bVar18 = cVar20 + bVar2 + -0x68 + (bVar2 & cVar20 + 0xbcU) * -2;
code_r0x0001801db5c3:
          uVar15 = uVar15 + *(byte *)((longlong)alStack_98 + (uVar15 - 0x40)) + uVar10;
        }
code_r0x0001801db5ce:
      }
      puVar17 = &uStack_d8;
code_r0x0001801db67e:
      FUN_1801aca80(alStack_98,puVar17);
      FUN_1801a4a90(alStack_98);
      FUN_180195980();
      param_2 = uStack_60;
      param_1 = alStack_98[4];
      param_4 = uStack_58;
    }
    uStack_60 = param_4 + 0x115f530;
    uVar12 = param_2 & 0xfffffffffffff000;
    uVar16 = uStack_a0 + 0xfff + param_2 & 0xfffffffffffff000;
    uStack_d8 = (undefined4)uVar16;
    uStack_d4 = (undefined4)(uVar16 >> 0x20);
    plStack_b8 = (longlong *)0x0;
    plStack_b0 = (longlong *)0x0;
    plStack_a8 = (longlong *)0x0;
    uVar9 = uVar16 - uVar12 >> 0xc;
    uStack_a0 = uVar9;
    if (uVar9 != 0) {
      uVar8 = FUN_1801a9d90(&plStack_b8,&uStack_a0);
      FUN_180f29110(uVar8,plStack_b8,(longlong)plStack_b0 - (longlong)plStack_b8);
      FUN_1801bf190(&plStack_b8,uVar8,0,uVar9);
    }
    if (uVar12 < uVar16) {
      uVar21 = uStack_c9;
      uVar23 = uStack_cb;
      while( true ) {
        lVar25 = (uVar12 >> 0xf) + uStack_60;
        abStack_68[0] = 0;
        uStack_58 = 0;
        puStack_e8 = &uStack_58;
        iVar5 = ReadProcessMemory(param_1,lVar25,abStack_68,1);
        plVar11 = plStack_b0;
        if ((iVar5 == 0) || (uStack_58 != 1)) break;
        uVar6 = (uint)(uVar12 >> 0xc) & 7;
        if ((abStack_68[0] >> uVar6 & 1) == 0) {
          bVar18 = abStack_68[0] | (byte)(1 << uVar6);
          if (plStack_b0 == plStack_a8) {
            uVar16 = (longlong)plStack_b0 - (longlong)plStack_b8;
            lVar24 = (longlong)uVar16 >> 4;
            if (lVar24 == 0xfffffffffffffff) goto code_r0x0001801dceba;
            uStack_70 = lVar24 + 1;
            uVar9 = (longlong)plStack_a8 - (longlong)plStack_b8 >> 4;
            if (0xfffffffffffffff - (uVar9 >> 1) < uVar9) {
              uVar9 = 0xfffffffffffffff;
            }
            else {
              uVar9 = (uVar9 >> 1) + uVar9;
              if (uVar9 < uStack_70) {
                uVar9 = uStack_70;
              }
            }
            uStack_a0 = uVar9;
            lVar24 = FUN_1801a9d90(&plStack_b8,&uStack_a0);
            uVar16 = uVar16 & 0xfffffffffffffff0;
            *(longlong *)(uVar16 + lVar24) = lVar25;
            *(byte *)(uVar16 + 8 + lVar24) = bVar18;
            *(uint *)(uVar16 + 9 + lVar24) = CONCAT13(uStack_cc,uStack_d0._1_3_);
            *(undefined2 *)(uVar16 + 0xd + lVar24) = uStack_cb;
            *(undefined1 *)(uVar16 + 0xf + lVar24) = uStack_c9;
            if (plVar11 == plStack_b0) {
              lVar22 = (longlong)plStack_b0 - (longlong)plStack_b8;
              lVar25 = lVar24;
              plVar11 = plStack_b8;
            }
            else {
              FUN_180f29110(lVar24,plStack_b8,(longlong)plVar11 - (longlong)plStack_b8);
              lVar22 = (longlong)plStack_b0 - (longlong)plVar11;
              lVar25 = uVar16 + 0x10 + lVar24;
            }
            FUN_180f29110(lVar25,plVar11,lVar22);
            FUN_1801bf190(&plStack_b8,lVar24,uStack_70,uVar9);
            uVar16 = CONCAT44(uStack_d4,uStack_d8);
            uVar21 = uStack_c9;
            uVar23 = uStack_cb;
          }
          else {
            *plStack_b0 = lVar25;
            *(byte *)(plStack_b0 + 1) = bVar18;
            *(uint *)((longlong)plStack_b0 + 9) = CONCAT13(uStack_cc,uStack_d0._1_3_);
            *(undefined2 *)((longlong)plStack_b0 + 0xd) = uVar23;
            *(undefined1 *)((longlong)plStack_b0 + 0xf) = uVar21;
            plStack_b0 = plStack_b0 + 2;
          }
        }
        uVar12 = uVar12 + 0x1000;
        if (uVar16 <= uVar12) goto code_r0x0001801dc3f8;
        param_1 = alStack_98[4];
      }
      uStack_d8 = 0xebe334d1;
      uStack_d4 = 0;
      uStack_d0 = 0;
      uStack_cc = 0;
      uStack_cb = 0;
      uStack_c9 = 0;
      uStack_c8 = 0;
      uStack_c6 = 0;
      uStack_c5 = 0;
      uStack_c4 = 0;
      uStack_c3 = 0;
      uStack_be = 0;
      bVar18 = abStack_68[0];
code_r0x0001801db8f8:
      puVar7 = (ulonglong *)func_0x000180b36780();
      uVar9 = *puVar7;
      puVar7 = (ulonglong *)func_0x000180b36790();
      uVar16 = *puVar7;
code_r0x0001801db940:
      uVar10 = uVar16;
      uVar12 = uVar9;
      for (uVar15 = 0; uVar15 < 0x1d; uVar15 = uVar15 + 1) {
        bVar2 = *(byte *)((longlong)alStack_98 + (uVar15 - 0x40));
        cVar20 = (char)uVar15;
code_r0x0001801db962:
        if (uVar15 < uVar12) {
          puVar17 = (undefined4 *)(auStack_108 + 0x125e1e9);
          goto code_r0x0001801dc36e;
        }
        if (uVar10 + 1 <= uVar12) {
          if (uVar12 == uVar10 + 1) {
            bVar18 = cVar20 + 0x37;
            cVar20 = cVar20 + bVar2 + -0x4a;
            goto code_r0x0001801dc296;
          }
          if (uVar12 == uVar10 + 3) {
            bVar18 = cVar20 + 0x2b;
            cVar19 = bVar2 - 2;
            goto code_r0x0001801dc237;
          }
          if (uVar12 == uVar10 + 5) {
            bVar18 = cVar20 + 0x1f;
            cVar20 = cVar20 + bVar2 + 'F';
            goto code_r0x0001801dc20f;
          }
          if (uVar12 == uVar10 + 6) {
            bVar18 = cVar20 + 0x99;
            cVar19 = bVar2 + 0x6a;
            goto code_r0x0001801dc1cb;
          }
          if (uVar12 == uVar10 + 4) {
            bVar18 = cVar20 + bVar2 + -0x72 + (cVar20 + 0x13U & bVar2) * -2;
            uVar15 = uVar15 - 1;
          }
          else {
            if (uVar12 != uVar10 + 2) goto code_r0x0001801db9d7;
            bVar18 = cVar20 + bVar2 + -0x4e + (cVar20 + 0x8dU & bVar2) * -2;
            uVar10 = uVar10 + 1;
            uVar15 = uVar15 - 1;
          }
          goto code_r0x0001801dc2aa;
        }
        bVar18 = (cVar20 + 0xbdU & bVar2) * -2 + -0x2b + cVar20 + 0xbdU + bVar2;
code_r0x0001801db9d7:
        if (uVar15 < uVar10) {
          puVar17 = (undefined4 *)(auStack_108 + 0x158b72c);
          goto code_r0x0001801dc36e;
        }
        if (uVar10 + 0x80 <= uVar12) {
          if (uVar12 == uVar10 + 1) {
            bVar18 = cVar20 - 5;
            cVar19 = bVar2 + 0x1e;
            goto code_r0x0001801dc15d;
          }
          if (uVar12 != uVar10 + 2) {
            if (uVar12 != uVar10 + 3) {
              if (uVar12 != uVar10 + 5) {
                if (uVar12 != uVar10 + 6) goto code_r0x0001801dba42;
                bVar18 = cVar20 - 0x29;
                cVar19 = bVar2 - 10;
                goto code_r0x0001801dc237;
              }
              bVar18 = cVar20 - 0x1d;
              cVar20 = cVar20 + bVar2 + -0x52;
              goto code_r0x0001801dc20f;
            }
            bVar18 = cVar20 + 0x69;
            cVar19 = bVar2 + 0x8a;
            goto code_r0x0001801dc1cb;
          }
          bVar18 = cVar20 + bVar2 + 'f' + (cVar20 - 0x11U & bVar2) * -2;
          uVar15 = uVar15 - 1;
          goto code_r0x0001801dc2aa;
        }
        bVar18 = bVar2 + 0x79 + cVar20 + 0x81U + (cVar20 + 0x81U & bVar2) * -2;
code_r0x0001801dba42:
        while (uVar1 = uVar10, uVar15 < uVar10 + uVar12) {
          while( true ) {
            do {
              uVar10 = uVar1;
              if (uVar12 == uVar10 + 9) {
                bVar18 = cVar20 + 0x36;
                cVar19 = bVar2 + 0xbc;
                goto code_r0x0001801dc15d;
              }
              uVar16 = uVar10 + 10;
              if (uVar12 == uVar16) {
                bVar18 = cVar20 + bVar2 + -0x20 + (bVar2 & cVar20 + 0xb0U) * -2;
                uVar10 = uVar10 + 1;
                uVar15 = uVar15 - 1;
                goto code_r0x0001801dc2aa;
              }
              if (uVar12 == uVar10 + 0x10) {
                bVar18 = cVar20 + bVar2 + '\x04' + (bVar2 & cVar20 + 0x2aU) * -2;
                uVar15 = uVar15 - 1;
                goto code_r0x0001801dc2aa;
              }
              uVar9 = uVar10 + 2;
              if (uVar12 == uVar9) {
                bVar18 = bVar2 & cVar20 + 0xa4U;
                cVar19 = bVar2 + 0x28;
                goto code_r0x0001801dc1ce;
              }
              if (uVar12 == uVar10 + 3) {
                bVar18 = cVar20 + bVar2 + 'L' + (bVar2 & cVar20 + 0x1eU) * -2;
                uVar12 = uVar12 + uVar10;
                uVar15 = (uVar15 - 1) - (ulonglong)bVar18;
                goto code_r0x0001801dc2aa;
              }
              if (uVar12 == uVar10 + 0x1000) {
                bVar18 = cVar20 + bVar2 + 'p' + (bVar2 & cVar20 + 0x98U) * -2;
                uVar15 = (uVar15 - 1) - (ulonglong)bVar18;
                goto code_r0x0001801dc2aa;
              }
              if (uVar12 == uVar10 + 0x61) {
                bVar18 = cVar20 + 0x12;
                cVar19 = bVar2 + 0x94;
                goto code_r0x0001801dc237;
              }
              if (uVar12 == uVar10 + 0x40) {
                bVar18 = bVar2 + 0xb8 + cVar20 + (bVar2 & cVar20 + 0x8cU) * -2;
                goto code_r0x0001801dc262;
              }
              if (uVar12 == uVar10 + 0x42) {
                bVar18 = cVar20 + bVar2 + -0x24 + (bVar2 & cVar20 + 6U) * -2;
                goto code_r0x0001801dc29e;
              }
              uVar1 = uVar10;
            } while (uVar12 == uVar10 + 6);
            if (uVar9 < uVar10 + 0xd) {
              bVar18 = bVar2 + cVar20 + 0xb7U + -1 + (bVar2 & cVar20 + 0xb7U) * -2;
              goto code_r0x0001801db8f8;
            }
            if (uVar9 < uVar10 + 0x100a) {
              bVar18 = bVar2 + cVar20 + 0x31U + -0x57 + (bVar2 & cVar20 + 0x31U) * -2;
              goto code_r0x0001801db940;
            }
            uVar12 = uVar9;
            if (uVar9 < uVar10 + 0x6b) {
              bVar18 = bVar2 + 0x53 + cVar20 + 0xabU + (cVar20 + 0xabU & bVar2) * -2;
              uVar10 = uVar16;
              goto code_r0x0001801db962;
            }
            if (uVar9 < uVar10 + 0x4a) {
              bVar18 = (bVar2 - 3) + cVar20 + 0x25U + (cVar20 + 0x25U & bVar2) * -2;
              uVar10 = uVar16;
              goto code_r0x0001801db9d7;
            }
            if (uVar9 < uVar10 + 0x4c) break;
            if (uVar9 < uVar10 + 0x10) {
              bVar18 = cVar20 + 0x19;
              cVar19 = bVar2 + 0x6a;
              uVar10 = uVar16;
              goto code_r0x0001801dbe1b;
            }
            if (uVar9 < uVar10 + 0x12) {
              bVar18 = cVar20 + 0x93;
              cVar19 = bVar2 + 0x8e;
              uVar10 = uVar16;
              goto code_r0x0001801dbddc;
            }
            if (uVar9 < uVar10 + 100) {
              bVar18 = cVar20 + 0xd;
              cVar19 = bVar2 + 0xb2;
              uVar10 = uVar16;
              goto code_r0x0001801dbda0;
            }
            if (uVar9 < uVar10 + 0x34) {
              bVar18 = cVar20 + bVar2 + -0x2a + (bVar2 & cVar20 + 0x87U) * -2;
              uVar10 = uVar16;
              goto code_r0x0001801dbd83;
            }
            uVar1 = uVar16;
            if (uVar10 + 0x20a <= uVar9) {
              uVar12 = uVar10 + 0x84;
              uVar1 = uVar10 + 0x46c;
              if (uVar10 + 0x4ae < uVar12) {
                bVar18 = cVar20 + bVar2 + -0x50 + (bVar2 & cVar20 + 0x38U) * -2;
                uVar10 = uVar1;
                goto code_r0x0001801dc29e;
              }
              if (uVar10 + 0x4d0 < uVar12) {
                bVar18 = (bVar2 - 0x2c) + cVar20 + (bVar2 & cVar20 + 0xb2U) * -2;
                uVar10 = uVar1;
                goto code_r0x0001801dc262;
              }
              if (uVar10 + 0x474 < uVar12) {
                bVar18 = cVar20 + 0x2c;
                cVar19 = bVar2 - 8;
                uVar10 = uVar1;
                goto code_r0x0001801dc237;
              }
              if (uVar10 + 0x475 < uVar12) {
                bVar18 = cVar20 + bVar2 + '\x1c' + (bVar2 & cVar20 + 0xa6U) * -2;
                uVar15 = (uVar15 - 1) - (ulonglong)bVar18;
                uVar10 = uVar1;
                goto code_r0x0001801dc2aa;
              }
              if (uVar10 + 0x496 < uVar12) {
                bVar18 = cVar20 + bVar2 + '@' + (bVar2 & cVar20 + 0x20U) * -2;
                uVar12 = uVar12 + uVar1;
                uVar15 = (uVar15 - 1) - (ulonglong)bVar18;
                uVar10 = uVar1;
                goto code_r0x0001801dc2aa;
              }
              if (uVar10 + 0x46d < uVar12) {
                bVar18 = bVar2 & cVar20 + 0x9aU;
                cVar19 = bVar2 + 100;
                uVar10 = uVar1;
                goto code_r0x0001801dc1ce;
              }
              if (uVar10 + 0x854 < uVar12) {
                bVar18 = cVar20 + bVar2 + -0x78 + (bVar2 & cVar20 + 0x14U) * -2;
                uVar15 = uVar15 - 1;
                uVar10 = uVar1;
                goto code_r0x0001801dc2aa;
              }
              if (uVar10 + 0x86c < uVar12) {
                bVar18 = cVar20 + bVar2 + -0x54 + (bVar2 & cVar20 + 0x8eU) * -2;
                uVar15 = uVar15 - 1;
                uVar10 = uVar10 + 0x46d;
                goto code_r0x0001801dc2aa;
              }
              if (uVar10 + 0x48c < uVar12) {
                bVar18 = cVar20 + 8;
                cVar19 = bVar2 - 0x30;
                uVar10 = uVar1;
                goto code_r0x0001801dc15d;
              }
              if (uVar12 <= uVar10 + 0x494) {
                uVar1 = uVar10 + 0x479;
                uVar12 = uVar10 + 0x475;
              }
            }
          }
          bVar18 = bVar2 + 0xa7 + cVar20 + 0x9fU + (cVar20 + 0x9fU & bVar2) * -2;
          uVar10 = uVar16;
        }
        if (uVar12 < uVar10 + 6) {
          bVar18 = cVar20 + 0xbd;
          cVar19 = bVar2 + 0x92;
code_r0x0001801dbe1b:
          bVar18 = cVar19 + cVar20 + (bVar2 & bVar18) * -2;
code_r0x0001801dbe21:
          if (uVar10 + uVar12 == 0x2a) {
            bVar18 = cVar20 + 't' + (bVar2 & cVar20 + 0x42U) * -2;
code_r0x0001801dc23f:
            bVar4 = bVar2 + 6 + (cVar20 - 1U & bVar2) * -2 + cVar20;
            *(byte *)((longlong)alStack_98 + (uVar15 - 0x40)) = bVar4;
            uVar15 = (uVar15 - (uVar10 + 1)) - (ulonglong)bVar4;
            uVar10 = uVar10 + 1;
code_r0x0001801dc262:
            *(byte *)((longlong)alStack_98 + (uVar15 - 0x40)) =
                 (char)uVar15 + -0x68 + bVar2 + ((char)uVar15 + 0xbcU & bVar2) * -2;
            uVar12 = uVar12 + 1;
            uVar15 = uVar15 + ~uVar12;
            goto code_r0x0001801dc29e;
          }
          if (uVar10 + 0x61 < uVar12) {
            bVar18 = cVar20 + 9;
            cVar19 = bVar2 - 0x36;
code_r0x0001801dbddc:
            bVar18 = cVar19 + cVar20 + (bVar2 & bVar18) * -2;
code_r0x0001801dbde2:
            if (uVar12 < 0x20) {
              if (uVar10 + 8 < uVar12) {
                bVar18 = cVar20 + 0x8a;
                cVar19 = bVar2 - 0x3c;
code_r0x0001801dbda0:
                bVar18 = cVar19 + cVar20 + (bVar2 & bVar18) * -2;
              }
              else {
                if (uVar12 == uVar10 + 1) {
                  bVar18 = cVar20 + 4;
                  cVar20 = cVar20 + bVar2 + -0x18;
                  goto code_r0x0001801dc296;
                }
                if (uVar12 == uVar10 + 2) {
                  bVar18 = cVar20 - 8;
                  cVar19 = bVar2 + 0x30;
                  goto code_r0x0001801dc237;
                }
                if (uVar12 == uVar10 + 5) {
                  bVar18 = cVar20 - 0x14;
                  cVar20 = cVar20 + bVar2 + 'x';
                  goto code_r0x0001801dc20f;
                }
                if (uVar12 == uVar10 + 3) {
                  bVar18 = cVar20 + 0x66;
                  cVar19 = bVar2 + 0x9c;
code_r0x0001801dc1cb:
                  bVar18 = bVar18 & bVar2;
code_r0x0001801dc1ce:
                  bVar18 = cVar19 + cVar20 + bVar18 * -2;
                  goto code_r0x0001801dc1d6;
                }
                if (uVar12 == uVar10 + 6) {
                  bVar18 = cVar20 + bVar2 + -0x40 + (cVar20 - 0x20U & bVar2) * -2;
                  uVar15 = uVar15 - 1;
                  goto code_r0x0001801dc2aa;
                }
              }
              if (0x79 < uVar10) {
                bVar18 = (bVar2 + 0x2c + cVar20 + (bVar2 & cVar20 + 0x4eU) * -2) * '\x02';
                goto code_r0x0001801dc165;
              }
code_r0x0001801dbd83:
              *(byte *)((longlong)alStack_98 + (uVar15 - 0x40)) = bVar18;
            }
            else {
              bVar18 = bVar2 * '\x02' + 'P' + cVar20 + (bVar2 & cVar20 - 0x38U) * -2;
code_r0x0001801dc1d6:
              *(byte *)((longlong)alStack_98 + (uVar15 - 0x40)) =
                   bVar2 + (cVar20 + 0x85U & bVar2) * -2 + -0x1e + cVar20 + bVar18;
              uVar12 = uVar12 + uVar10;
              uVar15 = (uVar15 - 1) - (ulonglong)bVar18;
            }
          }
          else {
            if (uVar12 != uVar10 + 1) {
              if (uVar12 != uVar10 + 2) {
                if (uVar12 == uVar10 + 8) {
                  bVar18 = cVar20 + 0x53;
                  cVar20 = cVar20 + bVar2 + '\x0e';
                  goto code_r0x0001801dc296;
                }
                goto code_r0x0001801dbde2;
              }
              bVar18 = cVar20 + 0x5f;
              cVar19 = bVar2 - 0x3a;
code_r0x0001801dc237:
              bVar18 = cVar19 + cVar20 + (bVar18 & bVar2) * -2;
              goto code_r0x0001801dc23f;
            }
            bVar18 = cVar20 + 0x83;
            cVar19 = bVar2 - 0x12;
code_r0x0001801dc15d:
            bVar18 = cVar19 + cVar20 + (bVar2 & bVar18) * -2;
code_r0x0001801dc165:
            *(byte *)((longlong)alStack_98 + (uVar15 - 0x40)) =
                 bVar2 + 0xbe + (cVar20 + 0xbU & bVar2) * -2 + cVar20;
            uVar15 = uVar15 - 1;
            uVar10 = uVar10 + 1;
          }
        }
        else {
          if (uVar12 != uVar10 + 1) {
            if (uVar12 != uVar10 + 2) {
              if (uVar12 == uVar10 + 5) {
                bVar18 = cVar20 - 0x16;
                cVar20 = cVar20 + bVar2 + -0x7c;
code_r0x0001801dc20f:
                bVar18 = cVar20 + (bVar18 & bVar2) * -2;
                uVar12 = uVar12 + uVar10;
                uVar15 = (uVar15 - 1) - (ulonglong)bVar18;
              }
              else {
                if (uVar12 != uVar10 + 7) goto code_r0x0001801dbe21;
                bVar18 = cVar20 + bVar2 + -0x34 + (cVar20 - 0x22U & bVar2) * -2;
                uVar15 = uVar15 - 1;
              }
              goto code_r0x0001801dc2aa;
            }
            bVar18 = bVar2 + 0x18 + cVar20 + (cVar20 + 0x7cU & bVar2) * -2;
            goto code_r0x0001801dc262;
          }
          bVar18 = cVar20 + 2;
          cVar20 = cVar20 + bVar2 + -0xc;
code_r0x0001801dc296:
          bVar18 = cVar20 + (bVar18 & bVar2) * -2;
code_r0x0001801dc29e:
          uVar15 = uVar15 + *(byte *)((longlong)alStack_98 + (uVar15 - 0x40)) + uVar10;
        }
code_r0x0001801dc2aa:
      }
      puVar17 = &uStack_d8;
code_r0x0001801dc36e:
      alStack_98[0] = 0;
      alStack_98[1] = 0;
      alStack_98[2] = 0;
      alStack_98[3] = 0;
      uVar8 = FUN_180f29c00(puVar17);
      FUN_180191ab0(alStack_98,puVar17,uVar8);
      FUN_1801a4a90(alStack_98);
      if (0xf < (ulonglong)alStack_98[3]) {
        if (alStack_98[3] + 1U < 0x1000) {
          lVar24 = alStack_98[3] + 1;
          lVar25 = alStack_98[0];
        }
        else {
          if (0x1f < (alStack_98[0] - *(longlong *)(alStack_98[0] + -8)) - 8U)
          goto code_r0x0001801dcec0;
          lVar24 = alStack_98[3] + 0x28;
          lVar25 = *(longlong *)(alStack_98[0] + -8);
        }
code_r0x0001801dce3b:
        func_0x000180e15340(lVar25,lVar24);
      }
    }
    else {
code_r0x0001801dc3f8:
      lVar24 = 1;
      if ((plStack_b8 != plStack_b0) &&
         (FUN_1801abb70(plStack_b8,plStack_b0,(longlong)plStack_b0 - (longlong)plStack_b8 >> 4,
                        abStack_68[0]), lVar25 = alStack_98[4], plVar11 = plStack_b0,
         plVar13 = plStack_b8, plStack_b8 != plStack_b0)) {
code_r0x0001801dc440:
        uStack_60 = 0;
        puStack_e8 = &uStack_60;
        iVar5 = WriteProcessMemory(lVar25,*plVar13,plVar13 + 1);
        if ((iVar5 != 0) && (uStack_60 == 1)) goto code_r0x0001801dc46b;
        uStack_d8 = 0x532df015;
        uStack_d4 = 0;
        uStack_d0 = 0;
        uStack_cc = 0;
        uStack_cb = 0;
        uStack_c9 = 0;
        uStack_c8 = 0;
        uStack_c6 = 0;
        puVar17 = &uStack_d8;
        bVar18 = abStack_68[0];
code_r0x0001801dc498:
        puVar7 = (ulonglong *)func_0x000180b36780();
        uVar16 = *puVar7;
        puVar7 = (ulonglong *)func_0x000180b36790();
        uVar9 = *puVar7;
code_r0x0001801dc4d0:
        uVar12 = uVar9;
        for (uVar10 = 0; uVar10 < 0x13; uVar10 = uVar10 + 1) {
          bVar2 = *(byte *)((longlong)alStack_98 + (uVar10 - 0x40));
          cVar20 = (char)uVar10;
code_r0x0001801dc510:
          if (uVar10 < uVar16) {
            puVar17 = (undefined4 *)(auStack_108 + 0x7eaae7);
            break;
          }
          if (uVar12 + 1 <= uVar16) {
            if (uVar16 != uVar12 + 1) {
              if (uVar16 == uVar12 + 3) {
                bVar18 = cVar20 + 0x25;
                cVar19 = bVar2 + 0x22;
code_r0x0001801dccbd:
                bVar18 = bVar2 & bVar18;
                goto code_r0x0001801dccc3;
              }
              if (uVar16 == uVar12 + 5) {
                bVar18 = cVar20 - 0x29;
                cVar19 = bVar2 - 10;
                goto code_r0x0001801dcc80;
              }
              if (uVar16 != uVar12 + 2) goto code_r0x0001801dc570;
              bVar18 = cVar20 + bVar2 + -0x6e + (bVar2 & cVar20 + 0xbdU) * -2;
              uVar10 = uVar10 - 1;
              goto code_r0x0001801dcd3c;
            }
            bVar18 = cVar20 + bVar2 + -0x16 + (bVar2 & cVar20 + 0x59U) * -2;
            goto code_r0x0001801dcd30;
          }
          bVar18 = (cVar20 + 0x73U & bVar2) * -2 + -0x25 + cVar20 + 0x73U + bVar2;
code_r0x0001801dc570:
          if (uVar10 < uVar12) {
            puVar17 = (undefined4 *)(auStack_108 + 0x1443974);
            break;
          }
          if (uVar12 + 9 <= uVar16) {
            if (uVar16 == uVar12 + 1) {
              bVar18 = cVar20 + 0x55;
              cVar19 = bVar2 + 2;
code_r0x0001801dcc1f:
              bVar18 = bVar2 & bVar18;
              goto code_r0x0001801dcc25;
            }
            if (uVar16 == uVar12 + 2) {
              bVar18 = cVar20 + bVar2 + -0x62 + (bVar2 & cVar20 + 0x3bU) * -2;
              uVar12 = uVar12 + 1;
              uVar10 = uVar10 - 1;
            }
            else {
              if (uVar16 != uVar12 + 5) {
                if (uVar16 != uVar12 + 4) {
                  if (uVar16 != uVar12 + 3) goto code_r0x0001801dc5e0;
                  bVar18 = bVar2 + 0x46 + cVar20 + (bVar2 & cVar20 + 0x9fU) * -2;
                  goto code_r0x0001801dccf1;
                }
                bVar18 = cVar20 + 0xb9;
                cVar19 = bVar2 + 0xaa;
                goto code_r0x0001801dccbd;
              }
              bVar18 = cVar20 + bVar2 + '\x0e' + (bVar2 & cVar20 - 0x2dU) * -2;
              uVar10 = (uVar10 - 1) - (ulonglong)bVar18;
            }
            goto code_r0x0001801dcd3c;
          }
          bVar18 = (bVar2 - 9) + cVar20 + 0x6fU + (cVar20 + 0x6fU & bVar2) * -2;
code_r0x0001801dc5e0:
          while (uVar9 = uVar12, uVar10 < uVar12 + uVar16) {
            while( true ) {
              do {
                uVar12 = uVar9;
                if (uVar16 == uVar12 + 2) {
                  bVar18 = cVar20 + 0x6a;
                  cVar19 = bVar2 + 0x84;
                  goto code_r0x0001801dcc1f;
                }
                if (uVar16 == uVar12 + 0x7a) {
                  bVar18 = cVar20 + bVar2 + ' ' + (bVar2 & cVar20 + 0x50U) * -2;
                  uVar12 = uVar12 + 1;
                  uVar10 = uVar10 - 1;
                  goto code_r0x0001801dcd3c;
                }
                if (uVar16 == uVar12 + 0x200) {
                  bVar18 = cVar20 + bVar2 + -0x44 + (bVar2 & cVar20 + 0x36U) * -2;
                  uVar10 = uVar10 - 1;
                  goto code_r0x0001801dcd3c;
                }
                if (uVar16 == uVar12 + 0x28) {
                  bVar18 = cVar20 + 0x1c;
                  cVar19 = bVar2 + 0x58;
                  goto code_r0x0001801dcc80;
                }
                if (uVar16 == uVar12 + 8) {
                  bVar18 = cVar20 + bVar2 + -0xc + (bVar2 & cVar20 + 2U) * -2;
                  uVar16 = uVar16 + uVar12;
                  uVar10 = (uVar10 - 1) - (ulonglong)bVar18;
                  goto code_r0x0001801dcd3c;
                }
                if (uVar16 == uVar12 + 9) {
                  bVar18 = (bVar2 - 0x38) + cVar20 + (bVar2 & cVar20 + 0xb4U) * -2;
                  goto code_r0x0001801dccf1;
                }
                if (uVar16 == uVar12 + 3) {
                  bVar18 = cVar20 + bVar2 + 'd' + (cVar20 + 0x9aU & bVar2) * -2;
                  goto code_r0x0001801dcd30;
                }
                uVar9 = uVar12;
              } while (uVar16 == uVar12 + 0x41);
              uVar16 = uVar12 + 0x2a;
              if (uVar16 < uVar12 + 0x432) {
                bVar18 = bVar2 + (cVar20 - 0x27U) + '\x11' + (bVar2 & cVar20 - 0x27U) * -2;
                goto code_r0x0001801dc498;
              }
              uVar9 = uVar12 + 0x412;
              if (uVar16 < uVar12 + 0x418) {
                bVar18 = bVar2 + cVar20 + 0xbfU + -0x39 + (bVar2 & cVar20 + 0xbfU) * -2;
                goto code_r0x0001801dc4d0;
              }
              if (uVar16 < uVar12 + 0x413) {
                bVar18 = bVar2 + 0x7d + cVar20 + 0xa5U + (bVar2 & cVar20 + 0xa5U) * -2;
                uVar12 = uVar9;
                goto code_r0x0001801dc510;
              }
              if (uVar16 < uVar12 + 0x473) {
                bVar18 = bVar2 + 0x33 + cVar20 + 0x8bU + (bVar2 & cVar20 + 0x8bU) * -2;
                uVar12 = uVar9;
                goto code_r0x0001801dc570;
              }
              if (uVar16 < uVar12 + 0x492) break;
              if (uVar16 < uVar12 + 0x612) {
                bVar18 = cVar20 + 0x23;
                cVar19 = bVar2 + 0x2e;
                uVar12 = uVar9;
                goto code_r0x0001801dc8b4;
              }
              if (uVar16 < uVar12 + 0x43a) {
                bVar18 = cVar20 + bVar2 + -0x36 + (cVar20 + 9U & bVar2) * -2;
                uVar12 = uVar9;
                goto code_r0x0001801dc89d;
              }
              if (uVar12 + 0x41a <= uVar16) {
                uVar16 = uVar12 + 0x41c;
                uVar9 = uVar12 + 0x41e;
                if (uVar12 + 0x141e < uVar16) {
                  bVar18 = cVar20 + bVar2 + 'P' + (cVar20 + 0x48U & bVar2) * -2;
                  uVar12 = uVar9;
                  goto code_r0x0001801dcd30;
                }
                if (uVar12 + 0x482 < uVar16) {
                  bVar18 = (bVar2 - 0x14) + cVar20 + (cVar20 + 0x2eU & bVar2) * -2;
                  uVar12 = uVar9;
                  goto code_r0x0001801dccf1;
                }
                if (uVar12 + 0x42e < uVar16) {
                  bVar18 = cVar20 + 0x14;
                  cVar19 = bVar2 + 0x88;
                  uVar12 = uVar9;
                  goto code_r0x0001801dccbd;
                }
                if (uVar12 + 0x423 < uVar16) {
                  bVar18 = cVar20 + bVar2 + '$' + (cVar20 - 6U & bVar2) * -2;
                  uVar10 = (uVar10 - 1) - (ulonglong)bVar18;
                  uVar12 = uVar9;
                  goto code_r0x0001801dcd3c;
                }
                if (uVar12 + 0x448 < uVar16) {
                  bVar18 = cVar20 + bVar2 + -0x40 + (cVar20 - 0x20U & bVar2) * -2;
                  uVar16 = uVar16 + uVar9;
                  uVar10 = (uVar10 - 1) - (ulonglong)bVar18;
                  uVar12 = uVar9;
                  goto code_r0x0001801dcd3c;
                }
                if (uVar12 + 0x41f < uVar16) {
                  bVar18 = cVar20 + bVar2 + -0x6c + (cVar20 + 0x92U & bVar2) * -2;
                  uVar10 = uVar10 - 1;
                  uVar12 = uVar12 + 0x41f;
                  goto code_r0x0001801dcd3c;
                }
                if (uVar12 + 0x47f < uVar16) {
                  bVar18 = cVar20 + 0x78U & bVar2;
                  cVar19 = bVar2 + 0x30;
                  uVar12 = uVar9;
                  goto code_r0x0001801dcc25;
                }
                if (uVar16 <= uVar12 + 0x49e) {
                  uVar16 = uVar12 + 0x806;
                  uVar9 = uVar12 + 0x826;
                }
              }
            }
            bVar18 = (bVar2 - 0x17) + cVar20 + 0x71U + (bVar2 & cVar20 + 0x71U) * -2;
            uVar12 = uVar9;
          }
          if (uVar16 < uVar12 + 0x5a) {
            bVar18 = bVar2 + 0x4e + cVar20 + (cVar20 + 0x73U & bVar2) * -2;
code_r0x0001801dc9b9:
            uVar9 = uVar12 + 6;
            if (uVar9 < uVar16) {
              bVar18 = bVar2 + 0x96 + cVar20 + (cVar20 + 0x67U & bVar2) * -2;
code_r0x0001801dc9e4:
              if (uVar16 < 0x7a) {
                if (uVar12 + 100 < uVar16) {
                  bVar18 = cVar20 - 0x2a;
                  cVar19 = bVar2 - 4;
code_r0x0001801dc8b4:
                  bVar18 = cVar19 + cVar20 + (bVar18 & bVar2) * -2;
                }
                else {
                  if (uVar16 == uVar12 + 1) {
                    bVar18 = cVar20 + bVar2 + -0x68 + (cVar20 + 0xbcU & bVar2) * -2;
                    goto code_r0x0001801dcd30;
                  }
                  if (uVar16 == uVar12 + 2) {
                    bVar18 = bVar2 + 0x34 + cVar20 + (cVar20 + 0xa2U & bVar2) * -2;
                    goto code_r0x0001801dccf1;
                  }
                  if (uVar16 == uVar12 + 7) {
                    bVar18 = cVar20 + bVar2 + '@' + (cVar20 + 0x20U & bVar2) * -2;
                    uVar10 = uVar10 - 1;
                    goto code_r0x0001801dcd3c;
                  }
                  if (uVar16 == uVar9) {
                    bVar18 = cVar20 - 0x14U & bVar2;
                    cVar19 = bVar2 + 0x78;
                    goto code_r0x0001801dcc25;
                  }
                }
                if (5 < uVar12) {
                  bVar18 = ((bVar2 - 0x2e) + cVar20 + (cVar20 - 0x2eU & bVar2) * -2) * '\x02' + 0x84
                  ;
                  goto code_r0x0001801dcc2d;
                }
code_r0x0001801dc89d:
                *(byte *)((longlong)alStack_98 + (uVar10 - 0x40)) = bVar18;
              }
              else {
                bVar18 = bVar2 * '\x02' + -0x50 + cVar20 + (cVar20 + 0xb8U & bVar2) * -2;
code_r0x0001801dcc88:
                *(byte *)((longlong)alStack_98 + (uVar10 - 0x40)) =
                     bVar2 + (cVar20 + 0x2bU & bVar2) * -2 + -2 + cVar20 + bVar18;
                uVar16 = uVar16 + uVar12;
                uVar10 = (uVar10 - 1) - (ulonglong)bVar18;
              }
            }
            else if (uVar16 == uVar12 + 1) {
              bVar18 = cVar20 + 0x4dU & bVar2;
              cVar19 = bVar2 + 0x32;
code_r0x0001801dcc25:
              bVar18 = cVar19 + cVar20 + bVar18 * -2;
code_r0x0001801dcc2d:
              *(byte *)((longlong)alStack_98 + (uVar10 - 0x40)) =
                   bVar2 + 0x62 + (cVar20 + 0x45U & bVar2) * -2 + cVar20;
              uVar10 = uVar10 - 1;
              uVar12 = uVar12 + 1;
            }
            else if (uVar16 == uVar12 + 2) {
              bVar18 = cVar20 + bVar2 + -0x32 + (cVar20 + 0x33U & bVar2) * -2;
              uVar12 = uVar12 + 1;
              uVar10 = uVar10 - 1;
            }
            else {
              if (uVar16 != uVar12 + 3) {
                if (uVar16 == uVar9) {
                  bVar18 = cVar20 + 0xb1U & bVar2;
                  cVar19 = bVar2 - 0x26;
                  goto code_r0x0001801dccc3;
                }
                goto code_r0x0001801dc9e4;
              }
              bVar18 = cVar20 + bVar2 + 'j' + (cVar20 + 0x19U & bVar2) * -2;
              uVar10 = uVar10 - 1;
            }
          }
          else {
            if (uVar16 == uVar12 + 1) {
              bVar18 = cVar20 + bVar2 + -0x34 + (cVar20 - 0x22U & bVar2) * -2;
            }
            else {
              if (uVar16 != uVar12 + 3) {
                if (uVar16 != uVar12 + 4) {
                  if (uVar16 != uVar12 + 2) goto code_r0x0001801dc9b9;
                  bVar18 = cVar20 + bVar2 + '\x10' + (cVar20 + 0x28U & bVar2) * -2;
                  uVar12 = uVar12 + 1;
                  uVar10 = uVar10 - 1;
                  goto code_r0x0001801dcd3c;
                }
                bVar18 = cVar20 + 0x5c;
                cVar19 = bVar2 - 0x28;
code_r0x0001801dcc80:
                bVar18 = cVar19 + cVar20 + (bVar2 & bVar18) * -2;
                goto code_r0x0001801dcc88;
              }
              bVar18 = cVar20 + 0xaaU & bVar2;
              cVar19 = bVar2 + 4;
code_r0x0001801dccc3:
              bVar18 = cVar19 + cVar20 + bVar18 * -2;
              bVar4 = bVar2 + 0x9a + (cVar20 + 0x11U & bVar2) * -2 + cVar20;
              *(byte *)((longlong)alStack_98 + (uVar10 - 0x40)) = bVar4;
              uVar10 = (uVar10 - (uVar12 + 1)) - (ulonglong)bVar4;
              uVar12 = uVar12 + 1;
code_r0x0001801dccf1:
              *(byte *)((longlong)alStack_98 + (uVar10 - 0x40)) =
                   (char)uVar10 + -0x18 + bVar2 + ((char)uVar10 + 0x84U & bVar2) * -2;
              uVar16 = uVar16 + 1;
              uVar10 = uVar10 + ~uVar16;
            }
code_r0x0001801dcd30:
            uVar10 = uVar10 + *(byte *)((longlong)alStack_98 + (uVar10 - 0x40)) + uVar12;
          }
code_r0x0001801dcd3c:
        }
        alStack_98[0] = 0;
        alStack_98[1] = 0;
        alStack_98[2] = 0;
        alStack_98[3] = 0;
        uVar8 = FUN_180f29c00(puVar17);
        FUN_180191ab0(alStack_98,puVar17,uVar8);
        FUN_1801a4a90(alStack_98);
        if (0xf < (ulonglong)alStack_98[3]) {
          if (alStack_98[3] + 1U < 0x1000) {
            lVar25 = alStack_98[0];
          }
          else {
            if (0x1f < (alStack_98[0] - *(longlong *)(alStack_98[0] + -8)) - 8U)
            goto code_r0x0001801dcec0;
            lVar24 = 0x28;
            lVar25 = *(longlong *)(alStack_98[0] + -8);
          }
          lVar24 = alStack_98[3] + lVar24;
          goto code_r0x0001801dce3b;
        }
      }
    }
code_r0x0001801dce46:
    if (plStack_b8 != (longlong *)0x0) {
      uVar16 = (longlong)plStack_a8 - (longlong)plStack_b8 & 0xfffffffffffffff0;
      if (uVar16 < 0x1000) {
        func_0x000180e15340(plStack_b8);
      }
      else {
        if (0x1f < (ulonglong)((longlong)plStack_b8 + (-8 - plStack_b8[-1]))) {
          pcVar3 = (code *)swi(0x29);
          (*pcVar3)(5);
          puVar14 = auStack_100;
code_r0x0001801dceba:
          *(undefined8 *)(puVar14 + -8) = 0x1801dcebf;
          FUN_1801c0c10();
code_r0x0001801dcec0:
          pcVar3 = (code *)swi(0x29);
          (*pcVar3)(5);
          pcVar3 = (code *)swi(3);
          (*pcVar3)();
          return;
        }
        func_0x000180e15340(plStack_b8[-1],uVar16 + 0x27);
      }
    }
  }
  FUN_180e155e0(uStack_50 ^ (ulonglong)auStack_108);
  return;
code_r0x0001801dc46b:
  plVar13 = plVar13 + 2;
  if (plVar13 == plVar11) goto code_r0x0001801dce46;
  goto code_r0x0001801dc440;
}

