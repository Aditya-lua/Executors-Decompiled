
void FUN_00689720(long *param_1,ulong param_2)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  long lVar7;
  ulong uVar8;
  undefined8 *puVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  undefined8 *puVar15;
  long lVar16;
  undefined8 *puVar17;
  undefined8 *puVar18;
  undefined8 *puVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uStack0000000000000008;
  
  puVar2 = (undefined8 *)param_1[2];
  if ((long)puVar2 - param_1[1] == 0) {
    param_2 = param_2 + 1;
  }
  uVar10 = param_2 >> 9;
  if ((param_2 & 0x1ff) != 0) {
    uVar10 = uVar10 + 1;
  }
  uVar11 = (ulong)param_1[4] >> 9;
  uVar8 = uVar10;
  if (uVar11 <= uVar10) {
    uVar8 = uVar11;
  }
  if (uVar11 < uVar10) {
    uVar11 = uVar10 - uVar8;
    lVar16 = (long)puVar2 - param_1[1] >> 3;
    if ((ulong)((param_1[3] - *param_1 >> 3) - lVar16) < uVar11) {
      uVar10 = param_1[3] - *param_1 >> 2;
      if (uVar10 <= uVar11 + lVar16) {
        uVar10 = uVar11 + lVar16;
      }
      if (uVar10 == 0) {
        puVar2 = (undefined8 *)0x0;
      }
      else {
        if (uVar10 >> 0x3d != 0) {
LAB_00689fe0:
          func_0x00017514();
code_r0x00689fe4:
          func_0x00017514();
code_r0x0068a044:
                    /* WARNING: Does not return */
          pcVar1 = (code *)SoftwareBreakpoint(1,0x68a048);
          (*pcVar1)();
        }
        puVar2 = (undefined8 *)__Znwm(uVar10 << 3);
      }
      puVar19 = puVar2 + uVar10;
      puVar17 = puVar2 + (lVar16 - uVar8);
      puVar18 = puVar2 + (lVar16 - uVar8);
      do {
        uVar3 = __Znwm(0x1000);
        puVar4 = puVar2;
        puVar6 = puVar17;
        if (puVar18 == puVar19) {
          if (puVar17 < puVar2 || (long)puVar17 - (long)puVar2 == 0) {
            uVar10 = (long)puVar19 - (long)puVar2 >> 2;
            if ((long)puVar19 - (long)puVar2 == 0) {
              uVar10 = 1;
            }
            if (uVar10 >> 0x3d != 0) goto code_r0x00689fe4;
            puVar4 = (undefined8 *)__Znwm(uVar10 << 3);
            uVar14 = uVar10 >> 2;
            puVar6 = puVar4 + uVar14;
            uVar12 = (long)puVar19 - (long)puVar17;
            puVar18 = puVar6;
            if (uVar12 != 0) {
              puVar18 = (undefined8 *)((long)puVar6 + (uVar12 & 0xfffffffffffffff8));
              if ((uVar12 - 8 < 0x38) || ((long)puVar4 + (uVar14 * 8 - (long)puVar17) < 0x40)) {
                puVar19 = puVar6;
                puVar5 = puVar17;
              }
              else {
                uVar12 = (uVar12 - 8 >> 3) + 1;
                uVar13 = uVar12 & 0x3ffffffffffffff8;
                puVar19 = puVar6 + uVar13;
                puVar5 = puVar17 + uVar13;
                puVar9 = puVar4 + uVar14 + 4;
                puVar17 = puVar17 + 4;
                uVar14 = uVar13;
                do {
                  uVar20 = puVar17[-4];
                  uVar22 = puVar17[-1];
                  uVar21 = puVar17[-2];
                  uVar24 = puVar17[1];
                  uVar23 = *puVar17;
                  uVar26 = puVar17[3];
                  uVar25 = puVar17[2];
                  puVar9[-3] = puVar17[-3];
                  puVar9[-4] = uVar20;
                  puVar9[-1] = uVar22;
                  puVar9[-2] = uVar21;
                  puVar9[1] = uVar24;
                  *puVar9 = uVar23;
                  puVar9[3] = uVar26;
                  puVar9[2] = uVar25;
                  uVar14 = uVar14 - 8;
                  puVar9 = puVar9 + 8;
                  puVar17 = puVar17 + 8;
                } while (uVar14 != 0);
                if (uVar12 == uVar13) goto code_r0x00689a78;
              }
              do {
                puVar17 = puVar19 + 1;
                *puVar19 = *puVar5;
                puVar19 = puVar17;
                puVar5 = puVar5 + 1;
              } while (puVar17 != puVar18);
            }
code_r0x00689a78:
            puVar19 = puVar4 + uVar10;
            if (puVar2 != (undefined8 *)0x0) {
              __ZdlPv();
            }
          }
          else {
            lVar7 = (long)puVar17 - (long)puVar2 >> 3;
            lVar16 = lVar7 + 2;
            if (-2 < lVar7) {
              lVar16 = lVar7 + 1;
            }
            lVar7 = (long)puVar19 - (long)puVar17;
            puVar6 = puVar19;
            if (lVar7 != 0) {
              _memmove(puVar17 + -(lVar16 >> 1),puVar17,lVar7);
              puVar6 = puVar17;
            }
            puVar18 = (undefined8 *)((long)(puVar17 + -(lVar16 >> 1)) + lVar7);
            puVar6 = puVar6 + -(lVar16 >> 1);
          }
        }
        puVar5 = puVar18 + 1;
        *puVar18 = uVar3;
        uVar11 = uVar11 - 1;
        puVar2 = puVar4;
        puVar17 = puVar6;
        puVar18 = puVar5;
      } while (uVar11 != 0);
      puVar2 = (undefined8 *)param_1[1];
      uVar10 = uVar8;
      if (uVar8 != 0) {
        do {
          if (puVar18 == puVar19) {
            if (puVar6 < puVar4 || (long)puVar6 - (long)puVar4 == 0) {
              uVar11 = (long)puVar19 - (long)puVar4 >> 2;
              if ((long)puVar19 - (long)puVar4 == 0) {
                uVar11 = 1;
              }
              if (uVar11 >> 0x3d != 0) {
                func_0x00017514();
                goto code_r0x0068a044;
              }
              puVar5 = (undefined8 *)__Znwm(uVar11 << 3);
              uVar14 = uVar11 >> 2;
              puVar17 = puVar5 + uVar14;
              uVar12 = (long)puVar19 - (long)puVar6;
              puVar18 = puVar17;
              if (uVar12 != 0) {
                puVar18 = (undefined8 *)((long)puVar17 + (uVar12 & 0xfffffffffffffff8));
                if ((uVar12 - 8 < 0x38) || ((long)puVar5 + (uVar14 * 8 - (long)puVar6) < 0x40)) {
                  puVar19 = puVar17;
                  puVar9 = puVar6;
                }
                else {
                  uVar12 = (uVar12 - 8 >> 3) + 1;
                  uVar13 = uVar12 & 0x3ffffffffffffff8;
                  puVar19 = puVar17 + uVar13;
                  puVar9 = puVar6 + uVar13;
                  puVar15 = puVar5 + uVar14 + 4;
                  puVar6 = puVar6 + 4;
                  uVar14 = uVar13;
                  do {
                    uVar3 = puVar6[-4];
                    uVar21 = puVar6[-1];
                    uVar20 = puVar6[-2];
                    uVar23 = puVar6[1];
                    uVar22 = *puVar6;
                    uVar25 = puVar6[3];
                    uVar24 = puVar6[2];
                    puVar15[-3] = puVar6[-3];
                    puVar15[-4] = uVar3;
                    puVar15[-1] = uVar21;
                    puVar15[-2] = uVar20;
                    puVar15[1] = uVar23;
                    *puVar15 = uVar22;
                    puVar15[3] = uVar25;
                    puVar15[2] = uVar24;
                    uVar14 = uVar14 - 8;
                    puVar15 = puVar15 + 8;
                    puVar6 = puVar6 + 8;
                  } while (uVar14 != 0);
                  if (uVar12 == uVar13) goto code_r0x00689c2c;
                }
                do {
                  puVar6 = puVar19 + 1;
                  *puVar19 = *puVar9;
                  puVar19 = puVar6;
                  puVar9 = puVar9 + 1;
                } while (puVar6 != puVar18);
              }
code_r0x00689c2c:
              puVar19 = puVar5 + uVar11;
              if (puVar4 != (undefined8 *)0x0) {
                __ZdlPv(puVar4);
              }
              puVar4 = puVar5;
              puVar6 = puVar17;
            }
            else {
              lVar7 = (long)puVar6 - (long)puVar4 >> 3;
              lVar16 = lVar7 + 2;
              if (-2 < lVar7) {
                lVar16 = lVar7 + 1;
              }
              lVar7 = (long)puVar19 - (long)puVar6;
              puVar17 = puVar19;
              if (lVar7 != 0) {
                _memmove(puVar6 + -(lVar16 >> 1),puVar6,lVar7);
                puVar17 = puVar6;
              }
              puVar18 = (undefined8 *)((long)(puVar6 + -(lVar16 >> 1)) + lVar7);
              puVar6 = puVar17 + -(lVar16 >> 1);
            }
          }
          puVar5 = puVar18 + 1;
          *puVar18 = *puVar2;
          puVar2 = (undefined8 *)(param_1[1] + 8);
          param_1[1] = (long)puVar2;
          uVar10 = uVar10 - 1;
          puVar18 = puVar5;
        } while (uVar10 != 0);
      }
      puVar18 = (undefined8 *)param_1[2];
      if (puVar18 != puVar2) {
        do {
          if (puVar6 == puVar4) {
            if (puVar5 < puVar19) {
              lVar7 = (long)puVar19 - (long)puVar5 >> 3;
              lVar16 = lVar7 + 2;
              if (-2 < lVar7) {
                lVar16 = lVar7 + 1;
              }
              puVar6 = puVar4 + (lVar16 >> 1);
              puVar2 = puVar4;
              if ((long)puVar5 - (long)puVar4 != 0) {
                _memmove(puVar6,puVar4,(long)puVar5 - (long)puVar4);
                puVar2 = puVar5;
              }
              puVar5 = puVar2 + (lVar16 >> 1);
              puVar2 = puVar4;
            }
            else {
              uVar10 = (long)puVar19 - (long)puVar4 >> 2;
              if ((long)puVar19 - (long)puVar4 == 0) {
                uVar10 = 1;
              }
              if (uVar10 >> 0x3d != 0) {
                func_0x00017514();
                goto code_r0x0068a044;
              }
              puVar2 = (undefined8 *)__Znwm(uVar10 << 3);
              uVar12 = uVar10 + 3 >> 2;
              puVar6 = puVar2 + uVar12;
              uVar11 = (long)puVar5 - (long)puVar4;
              puVar5 = puVar6;
              if (uVar11 != 0) {
                puVar5 = (undefined8 *)((long)puVar6 + (uVar11 & 0xfffffffffffffff8));
                puVar19 = puVar6;
                puVar17 = puVar4;
                if ((0x37 < uVar11 - 8) && (0x3f < (long)puVar2 + (uVar12 * 8 - (long)puVar4))) {
                  uVar11 = (uVar11 - 8 >> 3) + 1;
                  uVar14 = uVar11 & 0x3ffffffffffffff8;
                  puVar19 = puVar2 + uVar12 + 4;
                  puVar17 = puVar4 + 4;
                  uVar12 = uVar14;
                  do {
                    uVar3 = puVar17[-4];
                    uVar21 = puVar17[-1];
                    uVar20 = puVar17[-2];
                    uVar23 = puVar17[1];
                    uVar22 = *puVar17;
                    uVar25 = puVar17[3];
                    uVar24 = puVar17[2];
                    puVar19[-3] = puVar17[-3];
                    puVar19[-4] = uVar3;
                    puVar19[-1] = uVar21;
                    puVar19[-2] = uVar20;
                    puVar19[1] = uVar23;
                    *puVar19 = uVar22;
                    puVar19[3] = uVar25;
                    puVar19[2] = uVar24;
                    uVar12 = uVar12 - 8;
                    puVar19 = puVar19 + 8;
                    puVar17 = puVar17 + 8;
                  } while (uVar12 != 0);
                  puVar19 = puVar6 + uVar14;
                  puVar17 = puVar4 + uVar14;
                  if (uVar11 == uVar14) goto code_r0x00689dcc;
                }
                do {
                  puVar9 = puVar19 + 1;
                  *puVar19 = *puVar17;
                  puVar19 = puVar9;
                  puVar17 = puVar17 + 1;
                } while (puVar9 != puVar5);
              }
code_r0x00689dcc:
              puVar19 = puVar2 + uVar10;
              if (puVar4 != (undefined8 *)0x0) {
                __ZdlPv(puVar4);
              }
            }
            puVar4 = puVar2;
          }
          puVar18 = puVar18 + -1;
          puVar6 = puVar6 + -1;
          *puVar6 = *puVar18;
        } while (puVar18 != (undefined8 *)param_1[1]);
      }
      lVar16 = *param_1;
      *param_1 = (long)puVar4;
      param_1[1] = (long)puVar6;
      param_1[2] = (long)puVar5;
      param_1[3] = (long)puVar19;
      param_1[4] = param_1[4] + uVar8 * -0x200;
      if (lVar16 != 0) {
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR___ZdlPv_009b01b8)();
        return;
      }
    }
    else {
      if (uVar11 != 0) {
code_r0x0068992c:
        if (param_1[3] != param_1[2]) goto code_r0x00689938;
        if (uVar11 != 0) {
          uVar8 = 0;
          do {
            uStack0000000000000008 = __Znwm(0x1000);
            func_0x0003600c(param_1,&uStack0000000000000008);
            lVar16 = 0x1ff;
            if (param_1[2] - param_1[1] != 8) {
              lVar16 = 0x200;
            }
            lVar7 = param_1[4];
            param_1[4] = lVar16 + lVar7;
            uVar8 = uVar8 + 1;
          } while (uVar11 != uVar8);
          param_1[4] = lVar16 + lVar7 + uVar10 * -0x200;
          if (uVar10 == 0) {
            return;
          }
          goto code_r0x00689e50;
        }
      }
code_r0x00689e40:
      param_1[4] = param_1[4] + uVar8 * -0x200;
      uVar10 = uVar8;
      if (uVar8 != 0) {
code_r0x00689e50:
        puVar2 = (undefined8 *)param_1[2];
        do {
          puVar19 = (undefined8 *)param_1[1];
          puVar18 = puVar19 + 1;
          uVar3 = *puVar19;
          param_1[1] = (long)puVar18;
          if (puVar2 == (undefined8 *)param_1[3]) {
            puVar17 = (undefined8 *)*param_1;
            if (puVar18 < puVar17 || (long)puVar18 - (long)puVar17 == 0) {
              uVar8 = (long)puVar2 - (long)puVar17 >> 2;
              if ((long)puVar2 - (long)puVar17 == 0) {
                uVar8 = 1;
              }
              if (uVar8 >> 0x3d != 0) goto LAB_00689fe0;
              lVar16 = __Znwm(uVar8 * 8);
              puVar6 = (undefined8 *)(lVar16 + (uVar8 >> 2) * 8);
              uVar11 = (long)puVar2 - (long)puVar18;
              puVar2 = puVar6;
              if (uVar11 != 0) {
                puVar2 = (undefined8 *)((long)puVar6 + (uVar11 & 0xfffffffffffffff8));
                if (uVar11 - 8 < 0x38) {
                  puVar4 = puVar6;
                }
                else {
                  lVar7 = (uVar8 >> 2) * 8;
                  puVar4 = puVar6;
                  if (0x3f < (ulong)((lVar7 + lVar16) - (long)puVar18)) {
                    uVar11 = (uVar11 - 8 >> 3) + 1;
                    uVar14 = uVar11 & 0x3ffffffffffffff8;
                    puVar4 = puVar6 + uVar14;
                    puVar18 = puVar18 + uVar14;
                    puVar5 = (undefined8 *)(lVar16 + lVar7 + 0x20);
                    puVar19 = puVar19 + 5;
                    uVar12 = uVar14;
                    do {
                      uVar20 = puVar19[-4];
                      uVar22 = puVar19[-1];
                      uVar21 = puVar19[-2];
                      uVar24 = puVar19[1];
                      uVar23 = *puVar19;
                      uVar26 = puVar19[3];
                      uVar25 = puVar19[2];
                      puVar5[-3] = puVar19[-3];
                      puVar5[-4] = uVar20;
                      puVar5[-1] = uVar22;
                      puVar5[-2] = uVar21;
                      puVar5[1] = uVar24;
                      *puVar5 = uVar23;
                      puVar5[3] = uVar26;
                      puVar5[2] = uVar25;
                      uVar12 = uVar12 - 8;
                      puVar5 = puVar5 + 8;
                      puVar19 = puVar19 + 8;
                    } while (uVar12 != 0);
                    if (uVar11 == uVar14) goto code_r0x00689fa0;
                  }
                }
                do {
                  puVar19 = puVar4 + 1;
                  *puVar4 = *puVar18;
                  puVar4 = puVar19;
                  puVar18 = puVar18 + 1;
                } while (puVar19 != puVar2);
              }
code_r0x00689fa0:
              *param_1 = lVar16;
              param_1[1] = (long)puVar6;
              param_1[2] = (long)puVar2;
              param_1[3] = lVar16 + uVar8 * 8;
              if (puVar17 != (undefined8 *)0x0) {
                __ZdlPv(puVar17);
                puVar2 = (undefined8 *)param_1[2];
              }
            }
            else {
              lVar7 = (long)puVar18 - (long)puVar17 >> 3;
              lVar16 = lVar7 + 2;
              if (-2 < lVar7) {
                lVar16 = lVar7 + 1;
              }
              lVar7 = (long)puVar2 - (long)puVar18;
              if (lVar7 != 0) {
                _memmove(puVar18 + -(lVar16 >> 1),puVar18,lVar7);
                puVar2 = (undefined8 *)param_1[1];
              }
              puVar19 = puVar2 + -(lVar16 >> 1);
              puVar2 = (undefined8 *)((long)(puVar18 + -(lVar16 >> 1)) + lVar7);
              param_1[1] = (long)puVar19;
              param_1[2] = (long)puVar2;
            }
          }
          *puVar2 = uVar3;
          puVar2 = (undefined8 *)(param_1[2] + 8);
          param_1[2] = (long)puVar2;
          uVar10 = uVar10 - 1;
        } while (uVar10 != 0);
      }
    }
  }
  else {
    param_1[4] = param_1[4] + uVar8 * -0x200;
    for (; uVar8 != 0; uVar8 = uVar8 - 1) {
      puVar19 = (undefined8 *)param_1[1];
      puVar18 = puVar19 + 1;
      uVar3 = *puVar19;
      param_1[1] = (long)puVar18;
      if (puVar2 == (undefined8 *)param_1[3]) {
        puVar17 = (undefined8 *)*param_1;
        if (puVar18 < puVar17 || (long)puVar18 - (long)puVar17 == 0) {
          uVar10 = (long)puVar2 - (long)puVar17 >> 2;
          if ((long)puVar2 - (long)puVar17 == 0) {
            uVar10 = 1;
          }
          if (uVar10 >> 0x3d != 0) goto LAB_00689fe0;
          lVar16 = __Znwm(uVar10 * 8);
          puVar6 = (undefined8 *)(lVar16 + (uVar10 >> 2) * 8);
          uVar11 = (long)puVar2 - (long)puVar18;
          puVar2 = puVar6;
          if (uVar11 != 0) {
            puVar2 = (undefined8 *)((long)puVar6 + (uVar11 & 0xfffffffffffffff8));
            if (uVar11 - 8 < 0x38) {
              puVar4 = puVar6;
            }
            else {
              lVar7 = (uVar10 >> 2) * 8;
              puVar4 = puVar6;
              if (0x3f < (ulong)((lVar7 + lVar16) - (long)puVar18)) {
                uVar11 = (uVar11 - 8 >> 3) + 1;
                uVar14 = uVar11 & 0x3ffffffffffffff8;
                puVar4 = puVar6 + uVar14;
                puVar18 = puVar18 + uVar14;
                puVar5 = (undefined8 *)(lVar16 + lVar7 + 0x20);
                puVar19 = puVar19 + 5;
                uVar12 = uVar14;
                do {
                  uVar20 = puVar19[-4];
                  uVar22 = puVar19[-1];
                  uVar21 = puVar19[-2];
                  uVar24 = puVar19[1];
                  uVar23 = *puVar19;
                  uVar26 = puVar19[3];
                  uVar25 = puVar19[2];
                  puVar5[-3] = puVar19[-3];
                  puVar5[-4] = uVar20;
                  puVar5[-1] = uVar22;
                  puVar5[-2] = uVar21;
                  puVar5[1] = uVar24;
                  *puVar5 = uVar23;
                  puVar5[3] = uVar26;
                  puVar5[2] = uVar25;
                  uVar12 = uVar12 - 8;
                  puVar5 = puVar5 + 8;
                  puVar19 = puVar19 + 8;
                } while (uVar12 != 0);
                if (uVar11 == uVar14) goto code_r0x00689908;
              }
            }
            do {
              puVar19 = puVar4 + 1;
              *puVar4 = *puVar18;
              puVar4 = puVar19;
              puVar18 = puVar18 + 1;
            } while (puVar19 != puVar2);
          }
code_r0x00689908:
          *param_1 = lVar16;
          param_1[1] = (long)puVar6;
          param_1[2] = (long)puVar2;
          param_1[3] = lVar16 + uVar10 * 8;
          if (puVar17 != (undefined8 *)0x0) {
            __ZdlPv(puVar17);
            puVar2 = (undefined8 *)param_1[2];
          }
        }
        else {
          lVar7 = (long)puVar18 - (long)puVar17 >> 3;
          lVar16 = lVar7 + 2;
          if (-2 < lVar7) {
            lVar16 = lVar7 + 1;
          }
          lVar7 = (long)puVar2 - (long)puVar18;
          if (lVar7 != 0) {
            _memmove(puVar18 + -(lVar16 >> 1),puVar18,lVar7);
            puVar2 = (undefined8 *)param_1[1];
          }
          puVar19 = puVar2 + -(lVar16 >> 1);
          puVar2 = (undefined8 *)((long)(puVar18 + -(lVar16 >> 1)) + lVar7);
          param_1[1] = (long)puVar19;
          param_1[2] = (long)puVar2;
        }
      }
      *puVar2 = uVar3;
      puVar2 = (undefined8 *)(param_1[2] + 8);
      param_1[2] = (long)puVar2;
    }
  }
  return;
code_r0x00689938:
  uStack0000000000000008 = __Znwm(0x1000);
  func_0x00035e80(param_1,&uStack0000000000000008);
  uVar10 = uVar10 - 1;
  uVar11 = uVar11 - 1;
  if (uVar11 == 0) goto code_r0x00689e40;
  goto code_r0x0068992c;
}

