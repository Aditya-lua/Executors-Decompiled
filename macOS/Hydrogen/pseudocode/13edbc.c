
/* WARNING: Removing unreachable block (ram,0x0013f300) */

void FUN_0013edbc(long param_1,uint param_2,ulong param_3)

{
  ulong *puVar1;
  long *plVar2;
  long *plVar3;
  undefined1 uVar4;
  int iVar5;
  code *pcVar6;
  int iVar7;
  ulong uVar8;
  bool bVar9;
  uint uVar10;
  long lVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  undefined2 *puVar14;
  uint uVar15;
  long lVar16;
  undefined8 uVar17;
  undefined8 *puVar18;
  ulong uVar19;
  int iVar20;
  uint uVar21;
  ulong uVar22;
  char *pcVar23;
  long lVar24;
  undefined *puVar25;
  int iVar26;
  int iVar27;
  byte bVar28;
  long *plVar29;
  int iVar30;
  char *pcVar31;
  long *plVar32;
  long lVar33;
  uint uVar34;
  long *plVar35;
  undefined8 *puVar36;
  undefined8 *puVar37;
  undefined8 *puVar38;
  byte *pbVar39;
  ulong *puVar40;
  ulong uVar41;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  byte bStack0000000000000060;
  undefined7 uStack0000000000000061;
  long in_stack_00000068;
  undefined8 uStack0000000000000070;
  undefined8 uStack0000000000000078;
  undefined2 uStack0000000000000080;
  undefined8 uStack0000000000000088;
  undefined7 uStack0000000000000090;
  ulong uStack0000000000000098;
  ulong uStack00000000000000a0;
  undefined1 uStack00000000000000a8;
  undefined8 uStack00000000000000b0;
  long lStack00000000000000b8;
  ulong uStack00000000000000c0;
  ulong uStack00000000000000c8;
  ulong uStack00000000000000d0;
  undefined8 uStack00000000000000d8;
  undefined8 uStack00000000000000e0;
  ulong uStack00000000000000e8;
  undefined8 uStack00000000000000f0;
  undefined8 uStack00000000000000f8;
  
  uStack00000000000000e8 = 0;
  uStack00000000000000f8 = 0;
  uStack00000000000000f0 = 0;
  _uStack00000000000000a8 = 0;
  uStack00000000000000a0 = 0;
  lStack00000000000000b8 = 0;
  uStack00000000000000b0 = 0;
  uStack0000000000000088 = 0;
  _uStack0000000000000080 = (undefined2 *)0x0;
  uStack0000000000000098 = 0;
  _uStack0000000000000090 = 0;
  puVar40 = (ulong *)(param_1 + 0x20);
  uStack00000000000000d8 = *(undefined8 *)(param_1 + 0x28);
  uStack00000000000000d0 = *puVar40;
  uStack00000000000000c8 = 0;
  uStack00000000000000c0 = 0;
  uStack00000000000000e0 = *(undefined8 *)(param_1 + 0x30);
  iVar20 = *(int *)(param_1 + 0x28);
  if (iVar20 == *(int *)puVar40) {
    if (*(int *)(param_1 + 0x24) < *(int *)(param_1 + 0x2c)) {
LAB_0013ee70:
      func_0x001377f0(&uStack0000000000000058,param_1,puVar40);
      if (lStack00000000000000b8 < 0) {
        __ZdlPv(_uStack00000000000000a8);
      }
      uStack00000000000000b0 = CONCAT71(uStack0000000000000061,bStack0000000000000060);
      _uStack00000000000000a8 =
           CONCAT44(uStack0000000000000058._4_4_,(undefined4)uStack0000000000000058);
      lStack00000000000000b8 = in_stack_00000068;
      uStack00000000000000c8 = *(ulong *)(param_1 + 0x28);
      uStack00000000000000c0 = *(ulong *)(param_1 + 0x20);
      func_0x00143318(param_1);
    }
  }
  else if (*(int *)puVar40 < iVar20) {
    if (param_2 != 9) goto LAB_0013ee70;
    uStack0000000000000078 = *puVar40;
    uVar19 = *(ulong *)(param_1 + 0x28);
    iVar27 = (int)(uVar19 >> 0x20);
    iVar30 = (int)(uStack0000000000000078 >> 0x20);
    iVar7 = (int)uVar19;
    uStack0000000000000070 = uVar19;
    iVar20 = iVar27;
    if ((int)uStack0000000000000078 == iVar7) {
      if (iVar27 < iVar30) goto LAB_0013f4c4;
    }
    else if (iVar7 < (int)uStack0000000000000078) {
LAB_0013f4c4:
      uStack0000000000000070 = uStack0000000000000078;
      uStack0000000000000078 = uVar19;
      iVar20 = iVar30;
    }
    uVar41 = uStack0000000000000078;
    uStack0000000000000078 = uStack0000000000000078 & 0xffffffff;
    uVar8 = uStack0000000000000078;
    if (iVar20 == 0) {
      if (0 < (int)(uint)uStack0000000000000070) {
        uStack0000000000000070._0_4_ = (uint)uStack0000000000000070 - 1;
      }
    }
    lVar16 = *(long *)(param_1 + 8);
    uVar22 = (*(long *)(param_1 + 0x10) - lVar16 >> 3) * -0x5555555555555555;
    iVar20 = (int)uVar22;
    if (iVar20 <= (int)(uint)uStack0000000000000070) {
      uStack0000000000000070._0_4_ = 0;
      if (lVar16 != *(long *)(param_1 + 0x10)) {
        uStack0000000000000070._0_4_ = iVar20 - 1;
      }
    }
    uVar10 = (uint)uStack0000000000000070;
    if ((ulong)(long)(int)(uint)uStack0000000000000070 < uVar22) {
      plVar29 = (long *)(lVar16 + (long)(int)(uint)uStack0000000000000070 * 0x18);
      lVar16 = *plVar29;
      lVar24 = plVar29[1] - lVar16;
      if (lVar24 == 0) goto code_r0x0013f5f4;
      uVar22 = 0;
      iVar20 = 0;
      do {
        bVar28 = *(byte *)(lVar16 + uVar22 * 0xc);
        if (bVar28 == 9) {
          iVar30 = *(int *)(param_1 + 0x54);
          iVar26 = 0;
          if (iVar30 != 0) {
            iVar26 = iVar20 / iVar30;
          }
          iVar20 = iVar30 + iVar26 * iVar30;
          bVar28 = 0;
code_r0x0013f598:
          iVar30 = 1;
          if ((bVar28 & 0xe0) == 0xc0) {
            iVar30 = 2;
          }
        }
        else {
          iVar20 = iVar20 + 1;
          if ((bVar28 & 0xfe) == 0xfc) {
            iVar30 = 6;
          }
          else if ((bVar28 & 0xfc) == 0xf8) {
            iVar30 = 5;
          }
          else if ((bVar28 & 0xf8) == 0xf0) {
            iVar30 = 4;
          }
          else {
            if ((bVar28 & 0xf0) != 0xe0) goto code_r0x0013f598;
            iVar30 = 3;
          }
        }
        uVar22 = (ulong)(uint)(iVar30 + (int)uVar22);
      } while (uVar22 < (ulong)((lVar24 >> 2) * -0x5555555555555555));
    }
    else {
code_r0x0013f5f4:
      iVar20 = 0;
    }
    uStack0000000000000070 = CONCAT44(iVar20,(uint)uStack0000000000000070);
    uStack00000000000000c0 = uStack0000000000000078;
    uStack00000000000000c8 = uStack0000000000000070;
    func_0x001377f0(&uStack0000000000000058,param_1,&uStack0000000000000078,&uStack0000000000000070)
    ;
    if (lStack00000000000000b8 < 0) {
      __ZdlPv(_uStack00000000000000a8);
    }
    uStack00000000000000b0 = CONCAT71(uStack0000000000000061,bStack0000000000000060);
    _uStack00000000000000a8 =
         CONCAT44(uStack0000000000000058._4_4_,(undefined4)uStack0000000000000058);
    lStack00000000000000b8 = in_stack_00000068;
    iVar20 = (int)uVar41;
    if ((int)uVar10 < iVar20) goto code_r0x001401ac;
    lVar16 = (long)iVar20;
    if ((param_3 & 1) == 0) {
      lVar16 = lVar16 * 0x18;
      iVar20 = (uVar10 - iVar20) + 1;
      do {
        puVar37 = (undefined8 *)(*(long *)(param_1 + 8) + lVar16);
        uStack0000000000000058._0_4_ = CONCAT31(uStack0000000000000058._1_3_,9);
        uStack0000000000000058._4_4_ = 0xc;
        bStack0000000000000060 = bStack0000000000000060 & 0xf8;
        func_0x001396dc(puVar37,*puVar37,&uStack0000000000000058);
        lVar16 = lVar16 + 0x18;
        iVar20 = iVar20 + -1;
      } while (iVar20 != 0);
    }
    else {
      bVar9 = false;
      do {
        puVar37 = (undefined8 *)(*(long *)(param_1 + 8) + lVar16 * 0x18);
        pcVar31 = (char *)*puVar37;
        plVar29 = puVar37 + 1;
        pcVar23 = (char *)*plVar29;
        if (pcVar31 != pcVar23) {
          if (*pcVar31 == '\t') {
            lVar24 = (long)pcVar23 - (long)(pcVar31 + 0xc);
            if (lVar24 != 0) {
              _memmove(pcVar31,pcVar31 + 0xc,lVar24 + -3);
            }
            *plVar29 = (long)(pcVar31 + lVar24);
code_r0x0013f678:
            bVar9 = true;
          }
          else {
            iVar20 = *(int *)(param_1 + 0x54);
            if ((0 < iVar20) && (*pcVar31 == ' ')) {
              lVar24 = (long)pcVar23 - (long)(pcVar31 + 0xc);
              if (lVar24 != 0) {
                _memmove(pcVar31,pcVar31 + 0xc,lVar24 + -3);
                iVar20 = *(int *)(param_1 + 0x54);
              }
              pcVar31 = pcVar31 + lVar24;
              *plVar29 = (long)pcVar31;
              if (iVar20 < 2) goto code_r0x0013f678;
              iVar30 = 1;
              do {
                pcVar23 = (char *)*puVar37;
                if ((pcVar23 == pcVar31) || (*pcVar23 != ' ')) goto code_r0x0013f678;
                lVar24 = (long)pcVar31 - (long)(pcVar23 + 0xc);
                if (lVar24 != 0) {
                  _memmove(pcVar23,pcVar23 + 0xc,lVar24 + -3);
                  iVar20 = *(int *)(param_1 + 0x54);
                }
                pcVar31 = pcVar23 + lVar24;
                *plVar29 = (long)pcVar31;
                iVar30 = iVar30 + 1;
                bVar9 = true;
              } while (iVar30 < iVar20);
            }
          }
        }
        lVar16 = lVar16 + 1;
      } while (uVar10 + 1 != (int)lVar16);
      if (!bVar9) goto code_r0x001401ac;
    }
    lVar16 = *(long *)(param_1 + 8);
    uVar41 = (*(long *)(param_1 + 0x10) - lVar16 >> 3) * -0x5555555555555555;
    uStack0000000000000078 = uVar8;
    if (iVar27 == 0) {
      uVar22 = (long)iVar7 - 1;
      if (uVar22 < uVar41) {
        plVar29 = (long *)(lVar16 + uVar22 * 0x18);
        lVar16 = *plVar29;
        lVar24 = plVar29[1] - lVar16;
        if (lVar24 == 0) goto code_r0x001401f8;
        uVar41 = 0;
        uVar10 = 0;
        do {
          bVar28 = *(byte *)(lVar16 + uVar41 * 0xc);
          if (bVar28 == 9) {
            iVar20 = *(int *)(param_1 + 0x54);
            iVar30 = 0;
            if (iVar20 != 0) {
              iVar30 = (int)uVar10 / iVar20;
            }
            uVar10 = iVar20 + iVar30 * iVar20;
            bVar28 = 0;
code_r0x0013fb70:
            iVar20 = 1;
            if ((bVar28 & 0xe0) == 0xc0) {
              iVar20 = 2;
            }
          }
          else {
            uVar10 = uVar10 + 1;
            if ((bVar28 & 0xfe) == 0xfc) {
              iVar20 = 6;
            }
            else if ((bVar28 & 0xfc) == 0xf8) {
              iVar20 = 5;
            }
            else if ((bVar28 & 0xf8) == 0xf0) {
              iVar20 = 4;
            }
            else {
              if ((bVar28 & 0xf0) != 0xe0) goto code_r0x0013fb70;
              iVar20 = 3;
            }
          }
          uVar41 = (ulong)(uint)(iVar20 + (int)uVar41);
        } while (uVar41 < (ulong)((lVar24 >> 2) * -0x5555555555555555));
        uVar41 = (ulong)uVar10 << 0x20;
      }
      else {
code_r0x001401f8:
        uVar41 = 0;
      }
      uVar41 = uVar41 | uVar22 & 0xffffffff;
      uStack0000000000000050 = uVar41;
      func_0x001377f0(&uStack0000000000000058,param_1,&uStack0000000000000078,
                      &uStack0000000000000050);
      uVar19 = uVar19 & 0xffffffff;
      if (_uStack0000000000000090 < 0) {
        __ZdlPv(_uStack0000000000000080);
      }
      uStack0000000000000088 = CONCAT71(uStack0000000000000061,bStack0000000000000060);
      _uStack0000000000000080 =
           (undefined2 *)CONCAT44(uStack0000000000000058._4_4_,(undefined4)uStack0000000000000058);
    }
    else {
      if ((ulong)(long)(int)uVar10 < uVar41) {
        plVar29 = (long *)(lVar16 + (long)(int)uVar10 * 0x18);
        lVar16 = *plVar29;
        lVar24 = plVar29[1] - lVar16;
        if (lVar24 == 0) goto code_r0x0013fad8;
        uVar19 = 0;
        uVar15 = 0;
        do {
          bVar28 = *(byte *)(lVar16 + uVar19 * 0xc);
          if (bVar28 == 9) {
            iVar20 = *(int *)(param_1 + 0x54);
            iVar30 = 0;
            if (iVar20 != 0) {
              iVar30 = (int)uVar15 / iVar20;
            }
            uVar15 = iVar20 + iVar30 * iVar20;
            bVar28 = 0;
code_r0x0013fa7c:
            iVar20 = 1;
            if ((bVar28 & 0xe0) == 0xc0) {
              iVar20 = 2;
            }
          }
          else {
            uVar15 = uVar15 + 1;
            if ((bVar28 & 0xfe) == 0xfc) {
              iVar20 = 6;
            }
            else if ((bVar28 & 0xfc) == 0xf8) {
              iVar20 = 5;
            }
            else if ((bVar28 & 0xf8) == 0xf0) {
              iVar20 = 4;
            }
            else {
              if ((bVar28 & 0xf0) != 0xe0) goto code_r0x0013fa7c;
              iVar20 = 3;
            }
          }
          uVar19 = (ulong)(uint)(iVar20 + (int)uVar19);
        } while (uVar19 < (ulong)((lVar24 >> 2) * -0x5555555555555555));
        uVar19 = (ulong)uVar15 << 0x20;
      }
      else {
code_r0x0013fad8:
        uVar19 = 0;
      }
      uVar19 = uVar19 | uVar10;
      uStack0000000000000070 = uVar19;
      func_0x001377f0(&uStack0000000000000058,param_1,&uStack0000000000000078,
                      &uStack0000000000000070);
      if (_uStack0000000000000090 < 0) {
        __ZdlPv(_uStack0000000000000080);
      }
      uStack0000000000000088 = CONCAT71(uStack0000000000000061,bStack0000000000000060);
      _uStack0000000000000080 =
           (undefined2 *)CONCAT44(uStack0000000000000058._4_4_,(undefined4)uStack0000000000000058);
      uVar41 = uVar19;
    }
    uStack0000000000000098 = uVar8;
    uStack00000000000000f0 = *(undefined8 *)(param_1 + 0x28);
    uStack00000000000000e8 = *puVar40;
    uStack00000000000000f8 = *(undefined8 *)(param_1 + 0x30);
    *(ulong *)(param_1 + 0x20) = uVar8;
    *(ulong *)(param_1 + 0x28) = uVar19;
    _uStack0000000000000090 = in_stack_00000068;
    uStack00000000000000a0 = uVar41;
    func_0x00139988(param_1,&uStack0000000000000080);
    *(undefined1 *)(param_1 + 0x5d) = 1;
    func_0x001420d0(param_1);
    goto code_r0x001401ac;
  }
  puVar1 = (ulong *)(param_1 + 0x30);
  uVar8 = func_0x00137dcc(param_1);
  uVar19 = uStack0000000000000078;
  iVar20 = (int)uVar8;
  iVar30 = (int)(uVar8 >> 0x20);
  uStack0000000000000098 = uVar8;
  if (param_2 == 10) {
    uVar19 = (long)iVar20 + 1;
    func_0x00139304(param_1,uVar19);
    lVar24 = *(long *)(param_1 + 8);
    plVar35 = (long *)(lVar24 + (long)iVar20 * 0x18);
    plVar29 = (long *)(lVar24 + uVar19 * 0x18);
    lVar16 = lVar24;
    if (*(char *)(param_1 + 0x201) != '\0') {
      plVar32 = (long *)(lVar24 + (long)iVar20 * 0x18 + 8);
      lVar11 = *plVar35;
      if (*plVar32 != lVar11) {
        uVar8 = 0;
        lVar16 = lVar24 + uVar19 * 0x18;
        plVar2 = (long *)(lVar16 + 8);
        plVar3 = (long *)(lVar16 + 0x10);
        puVar25 = PTR___DefaultRuneLocale_009b0028;
        do {
          pbVar39 = (byte *)(lVar11 + uVar8 * 0xc);
          if (((char)*pbVar39 < '\0') ||
             ((*(uint *)(puVar25 + (ulong)*pbVar39 * 4 + 0x3c) >> 0x11 & 1) == 0)) break;
          puVar37 = (undefined8 *)*plVar2;
          puVar12 = (undefined8 *)*plVar3;
          if (puVar37 < puVar12) {
            uVar17 = *(undefined8 *)pbVar39;
            *(undefined4 *)(puVar37 + 1) = *(undefined4 *)(pbVar39 + 8);
            *puVar37 = uVar17;
            lVar16 = (long)puVar37 + 0xc;
          }
          else {
            puVar36 = (undefined8 *)*plVar29;
            lVar16 = (long)puVar37 - (long)puVar36 >> 2;
            uVar41 = lVar16 * -0x5555555555555555 + 1;
            if (0x1555555555555555 < uVar41) {
              func_0x00017f90(plVar29);
code_r0x001402dc:
                    /* WARNING: Does not return */
              pcVar6 = (code *)SoftwareBreakpoint(1,0x1402e0);
              (*pcVar6)();
            }
            lVar11 = (long)puVar12 - (long)puVar36 >> 2;
            uVar22 = lVar11 * 0x5555555555555556;
            if (uVar22 <= uVar41) {
              uVar22 = uVar41;
            }
            if (0xaaaaaaaaaaaaaa9 < (ulong)(lVar11 * -0x5555555555555555)) {
              uVar22 = 0x1555555555555555;
            }
            if (uVar22 == 0) {
              lVar11 = 0;
            }
            else {
              if (0x1555555555555555 < uVar22) {
                func_0x00017514();
                goto code_r0x001402dc;
              }
              lVar11 = __Znwm(uVar22 * 0xc);
            }
            uVar17 = *(undefined8 *)pbVar39;
            puVar13 = (undefined8 *)(lVar11 + lVar16 * 4);
            *(undefined4 *)(puVar13 + 1) = *(undefined4 *)(pbVar39 + 8);
            *puVar13 = uVar17;
            puVar12 = puVar13;
            puVar18 = puVar13;
            if (puVar37 != puVar36) {
              do {
                puVar38 = (undefined8 *)((long)puVar37 + -0xc);
                uVar4 = *(undefined1 *)((long)puVar37 + -4);
                puVar18 = (undefined8 *)((long)puVar12 + -0xc);
                *puVar18 = *puVar38;
                *(undefined1 *)((long)puVar12 + -4) = uVar4;
                puVar12 = puVar18;
                puVar37 = puVar38;
              } while (puVar38 != puVar36);
              puVar37 = (undefined8 *)*plVar29;
            }
            *plVar29 = (long)puVar18;
            lVar16 = (long)puVar13 + 0xc;
            *plVar2 = lVar16;
            *plVar3 = lVar11 + uVar22 * 0xc;
            if (puVar37 != (undefined8 *)0x0) {
              __ZdlPv(puVar37);
            }
            puVar25 = PTR___DefaultRuneLocale_009b0028;
          }
          *plVar2 = lVar16;
          uVar8 = uVar8 + 1;
          lVar11 = *plVar35;
        } while (uVar8 < (ulong)((*plVar32 - lVar11 >> 2) * -0x5555555555555555));
        lVar16 = *(long *)(param_1 + 8);
      }
    }
    lVar11 = *(long *)(lVar24 + uVar19 * 0x18 + 8);
    if ((ulong)(long)iVar20 <
        (ulong)((*(long *)(param_1 + 0x10) - lVar16 >> 3) * -0x5555555555555555)) {
      plVar32 = (long *)(lVar16 + (long)iVar20 * 0x18);
      lVar16 = *plVar32;
      lVar33 = plVar32[1] - lVar16;
      uVar8 = 0;
      if (lVar33 != 0 && 0 < iVar30) {
        iVar7 = 0;
        do {
          bVar28 = *(byte *)(lVar16 + uVar8 * 0xc);
          iVar27 = (int)uVar8;
          if (bVar28 == 9) {
            iVar26 = *(int *)(param_1 + 0x54);
            iVar5 = 0;
            if (iVar26 != 0) {
              iVar5 = iVar7 / iVar26;
            }
            iVar7 = iVar26 + iVar5 * iVar26;
            bVar28 = 0;
code_r0x0013f1f0:
            iVar26 = 1;
            if ((bVar28 & 0xe0) == 0xc0) {
              iVar26 = 2;
            }
            uVar10 = iVar26 + iVar27;
          }
          else {
            iVar7 = iVar7 + 1;
            if ((bVar28 & 0xfe) == 0xfc) {
              uVar10 = iVar27 + 6;
            }
            else if ((bVar28 & 0xfc) == 0xf8) {
              uVar10 = iVar27 + 5;
            }
            else if ((bVar28 & 0xf8) == 0xf0) {
              uVar10 = iVar27 + 4;
            }
            else {
              if ((bVar28 & 0xf0) != 0xe0) goto code_r0x0013f1f0;
              uVar10 = iVar27 + 3;
            }
          }
          uVar8 = (ulong)uVar10;
        } while ((uVar8 < (ulong)((lVar33 >> 2) * -0x5555555555555555)) && (iVar7 < iVar30));
      }
    }
    else {
      uVar8 = 0xffffffffffffffff;
    }
    lVar33 = *plVar29;
    lVar16 = *plVar35 + uVar8 * 0xc;
    plVar32 = (long *)(lVar24 + (long)iVar20 * 0x18 + 8);
    func_0x00149130(plVar29,lVar11,lVar16,*plVar32,(*plVar32 - lVar16 >> 2) * -0x5555555555555555);
    iVar30 = (int)(lVar11 - lVar33 >> 2) * -0x55555555;
    if ((*plVar32 - *plVar35 >> 2) * -0x5555555555555555 != uVar8) {
      *plVar32 = *plVar35 + uVar8 * 0xc;
    }
    uVar8 = (*(long *)(param_1 + 0x10) - *(long *)(param_1 + 8) >> 3) * -0x5555555555555555;
    if ((iVar30 >= 1 && uVar19 <= uVar8) && (iVar30 < 1 || uVar8 != uVar19)) {
      uVar10 = 0;
      uVar15 = 0;
      plVar29 = (long *)(*(long *)(param_1 + 8) + uVar19 * 0x18);
      lVar16 = *plVar29;
      do {
        while( true ) {
          if ((int)((ulong)(plVar29[1] - lVar16) >> 2) * -0x55555555 <= (int)uVar15)
          goto code_r0x0013f33c;
          bVar28 = *(byte *)(lVar16 + (ulong)uVar15 * 0xc);
          iVar7 = 1;
          if ((bVar28 & 0xe0) == 0xc0) {
            iVar7 = 2;
          }
          iVar27 = 3;
          if ((bVar28 & 0xf0) != 0xe0) {
            iVar27 = iVar7;
          }
          iVar7 = 4;
          if ((bVar28 & 0xf8) != 0xf0) {
            iVar7 = iVar27;
          }
          iVar27 = 5;
          if ((bVar28 & 0xfc) != 0xf8) {
            iVar27 = iVar7;
          }
          iVar7 = 6;
          if ((bVar28 & 0xfe) != 0xfc) {
            iVar7 = iVar27;
          }
          if (bVar28 != 9) break;
          iVar27 = *(int *)(param_1 + 0x54);
          iVar26 = 0;
          if (iVar27 != 0) {
            iVar26 = (int)uVar10 / iVar27;
          }
          uVar10 = iVar27 + iVar26 * iVar27;
          uVar15 = iVar7 + uVar15;
          if (iVar30 <= (int)uVar15) goto code_r0x0013f33c;
        }
        uVar10 = uVar10 + 1;
        uVar15 = iVar7 + uVar15;
      } while ((int)uVar15 < iVar30);
    }
    else {
      uVar10 = 0;
    }
code_r0x0013f33c:
    if ((*(int *)puVar1 != (int)uVar19) || (*(uint *)(param_1 + 0x34) != uVar10)) {
      *(ulong *)(param_1 + 0x30) = uVar19 & 0xffffffff | (ulong)uVar10 << 0x20;
      *(undefined1 *)(param_1 + 0x68) = 1;
      func_0x001420d0(param_1);
    }
    if (_uStack0000000000000090 < 0) {
      uStack0000000000000088 = 1;
      puVar14 = _uStack0000000000000080;
    }
    else {
      _uStack0000000000000090 = CONCAT17(1,uStack0000000000000090);
      puVar14 = &uStack0000000000000080;
    }
    *puVar14 = 10;
  }
  else {
    uVar4 = (undefined1)param_2;
    if (param_2 < 0x80) {
      uVar10 = param_2 & 0xff;
      uStack0000000000000078 = CONCAT71(uStack0000000000000078._1_7_,uVar4);
      lVar16 = 1;
    }
    else if (param_2 < 0x800) {
      uVar10 = (param_2 >> 6 & 0xff) + 0xc0;
      uStack0000000000000078 =
           CONCAT62(uStack0000000000000078._2_6_,CONCAT11(uVar4,(char)uVar10)) & 0xffffffffffff3fff
           | 0x8000;
      lVar16 = 2;
    }
    else {
      if ((param_2 & 0xfc00) == 0xdc00) goto code_r0x001401ac;
      if ((param_2 & 0xfc00) == 0xd800) {
        uStack0000000000000078._0_3_ = CONCAT12((byte)(param_2 >> 6) & 0x3f | 0x80,0x8df0);
        uStack0000000000000078._4_4_ = SUB84(uVar19,4);
        uStack0000000000000078 =
             CONCAT44(uStack0000000000000078._4_4_,
                      CONCAT13(uVar4,(undefined3)uStack0000000000000078)) & 0xffffffff3fffffff |
             0x80000000;
        uVar10 = 0xf0;
        lVar16 = 4;
      }
      else {
        uVar10 = param_2 >> 0xc | 0xe0;
        uVar19 = CONCAT62(uStack0000000000000078._2_6_,CONCAT11((char)(param_2 >> 6),(char)uVar10))
                 & 0xffffffffffff3fff;
        uStack0000000000000078._3_5_ = (undefined5)(uVar19 >> 0x18);
        uStack0000000000000078 =
             CONCAT53(uStack0000000000000078._3_5_,CONCAT12(uVar4,(short)uVar19)) &
             0xffffffffff3fffff | 0x808000;
        lVar16 = 3;
      }
    }
    *(undefined1 *)((long)&uStack0000000000000078 + lVar16) = 0;
    uVar41 = (ulong)iVar20;
    lVar16 = *(long *)(param_1 + 8);
    plVar29 = (long *)(lVar16 + (long)iVar20 * 0x18);
    uVar19 = (*(long *)(param_1 + 0x10) - lVar16 >> 3) * -0x5555555555555555;
    if (uVar41 < uVar19) {
      lVar24 = *(long *)(lVar16 + (long)iVar20 * 0x18 + 8) - *plVar29;
      if (lVar24 == 0 || iVar30 < 1) {
        uVar22 = 0;
      }
      else {
        iVar7 = 0;
        uVar22 = 0;
        do {
          bVar28 = *(byte *)(*plVar29 + uVar22 * 0xc);
          iVar27 = (int)uVar22;
          if (bVar28 == 9) {
            iVar26 = *(int *)(param_1 + 0x54);
            iVar5 = 0;
            if (iVar26 != 0) {
              iVar5 = iVar7 / iVar26;
            }
            iVar7 = iVar26 + iVar5 * iVar26;
            bVar28 = 0;
code_r0x0013f8a4:
            iVar26 = 1;
            if ((bVar28 & 0xe0) == 0xc0) {
              iVar26 = 2;
            }
            uVar15 = iVar26 + iVar27;
          }
          else {
            iVar7 = iVar7 + 1;
            if ((bVar28 & 0xfe) == 0xfc) {
              uVar15 = iVar27 + 6;
            }
            else if ((bVar28 & 0xfc) == 0xf8) {
              uVar15 = iVar27 + 5;
            }
            else if ((bVar28 & 0xf8) == 0xf0) {
              uVar15 = iVar27 + 4;
            }
            else {
              if ((bVar28 & 0xf0) != 0xe0) goto code_r0x0013f8a4;
              uVar15 = iVar27 + 3;
            }
          }
          uVar22 = (ulong)uVar15;
        } while ((uVar22 < (ulong)((lVar24 >> 2) * -0x5555555555555555)) && (iVar7 < iVar30));
      }
    }
    else {
      uVar22 = 0xffffffff;
    }
    uVar15 = (uint)uVar22;
    if (*(char *)(param_1 + 0x58) != '\0') {
      plVar35 = (long *)(lVar16 + (long)iVar20 * 0x18 + 8);
      if ((int)uVar15 < (int)((ulong)(*plVar35 - *plVar29) >> 2) * -0x55555555) {
        bVar28 = *(byte *)(*plVar29 + (long)(int)uVar15 * 0xc);
        if ((bVar28 & 0xfe) == 0xfc) {
          uVar34 = 6;
        }
        else if ((bVar28 & 0xfc) == 0xf8) {
          uVar34 = 5;
        }
        else if ((bVar28 & 0xf8) == 0xf0) {
          uVar34 = 4;
        }
        else {
          uVar10 = 1;
          if ((bVar28 & 0xe0) == 0xc0) {
            uVar10 = 2;
          }
          uVar34 = 3;
          if ((bVar28 & 0xf0) != 0xe0) {
            uVar34 = uVar10;
          }
        }
        uVar10 = 0;
        uStack00000000000000c0 = *puVar1;
        if ((uVar41 < uVar19) && (iVar30 = uVar34 + uVar15, 0 < iVar30)) {
          uVar10 = 0;
          uVar21 = 0;
          do {
            while( true ) {
              if ((int)((ulong)(*plVar35 - *plVar29) >> 2) * -0x55555555 <= (int)uVar21)
              goto code_r0x0013fcd8;
              bVar28 = *(byte *)(*plVar29 + (ulong)uVar21 * 0xc);
              iVar7 = 1;
              if ((bVar28 & 0xe0) == 0xc0) {
                iVar7 = 2;
              }
              iVar27 = 3;
              if ((bVar28 & 0xf0) != 0xe0) {
                iVar27 = iVar7;
              }
              iVar7 = 4;
              if ((bVar28 & 0xf8) != 0xf0) {
                iVar7 = iVar27;
              }
              iVar27 = 5;
              if ((bVar28 & 0xfc) != 0xf8) {
                iVar27 = iVar7;
              }
              iVar7 = 6;
              if ((bVar28 & 0xfe) != 0xfc) {
                iVar7 = iVar27;
              }
              if (bVar28 != 9) break;
              iVar27 = *(int *)(param_1 + 0x54);
              iVar26 = 0;
              if (iVar27 != 0) {
                iVar26 = (int)uVar10 / iVar27;
              }
              uVar10 = iVar27 + iVar26 * iVar27;
              uVar21 = iVar7 + uVar21;
              if (iVar30 <= (int)uVar21) goto code_r0x0013fcd8;
            }
            uVar10 = uVar10 + 1;
            uVar21 = iVar7 + uVar21;
          } while ((int)uVar21 < iVar30);
        }
code_r0x0013fcd8:
        uStack00000000000000c8 = uVar8 & 0xffffffff | (ulong)uVar10 << 0x20;
        if ((int)uVar15 < (int)((ulong)(*plVar35 - *plVar29) >> 2) * -0x55555555) {
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                    (&uStack00000000000000a8,(long)*(char *)(*plVar29 + (long)(int)uVar15 * 0xc));
          lVar24 = *plVar29 + (long)(int)uVar15 * 0xc;
          lVar16 = *plVar35 - (lVar24 + 0xc);
          if (lVar16 != 0) {
            _memmove(lVar24,lVar24 + 0xc,lVar16 + -3);
          }
          *plVar35 = lVar24 + lVar16;
          if ((1 < uVar34) &&
             ((int)uVar15 < (int)((ulong)((lVar24 + lVar16) - *plVar29) >> 2) * -0x55555555)) {
            __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                      (&uStack00000000000000a8,(long)*(char *)(*plVar29 + (long)(int)uVar15 * 0xc));
            lVar24 = *plVar29 + (long)(int)uVar15 * 0xc;
            lVar16 = *plVar35 - (lVar24 + 0xc);
            if (lVar16 != 0) {
              _memmove(lVar24,lVar24 + 0xc,lVar16 + -3);
            }
            *plVar35 = lVar24 + lVar16;
            if ((2 < uVar34) &&
               ((int)uVar15 < (int)((ulong)((lVar24 + lVar16) - *plVar29) >> 2) * -0x55555555)) {
              __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                        (&uStack00000000000000a8,(long)*(char *)(*plVar29 + (long)(int)uVar15 * 0xc)
                        );
              lVar24 = *plVar29 + (long)(int)uVar15 * 0xc;
              lVar16 = *plVar35 - (lVar24 + 0xc);
              if (lVar16 != 0) {
                _memmove(lVar24,lVar24 + 0xc,lVar16 + -3);
              }
              *plVar35 = lVar24 + lVar16;
              if ((3 < uVar34) &&
                 ((int)uVar15 < (int)((ulong)((lVar24 + lVar16) - *plVar29) >> 2) * -0x55555555)) {
                __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                          (&uStack00000000000000a8,
                           (long)*(char *)(*plVar29 + (long)(int)uVar15 * 0xc));
                lVar24 = *plVar29 + (long)(int)uVar15 * 0xc;
                lVar16 = *plVar35 - (lVar24 + 0xc);
                if (lVar16 != 0) {
                  _memmove(lVar24,lVar24 + 0xc,lVar16 + -3);
                }
                *plVar35 = lVar24 + lVar16;
                if ((4 < uVar34) &&
                   ((int)uVar15 < (int)((ulong)((lVar24 + lVar16) - *plVar29) >> 2) * -0x55555555))
                {
                  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                            (&uStack00000000000000a8,
                             (long)*(char *)(*plVar29 + (long)(int)uVar15 * 0xc));
                  lVar24 = *plVar29 + (long)(int)uVar15 * 0xc;
                  lVar16 = *plVar35 - (lVar24 + 0xc);
                  if (lVar16 != 0) {
                    _memmove(lVar24,lVar24 + 0xc,lVar16 + -3);
                  }
                  *plVar35 = lVar24 + lVar16;
                  if ((5 < uVar34) &&
                     ((int)uVar15 < (int)((ulong)((lVar24 + lVar16) - *plVar29) >> 2) * -0x55555555)
                     ) {
                    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                              (&uStack00000000000000a8,
                               (long)*(char *)(*plVar29 + (long)(int)uVar15 * 0xc));
                    lVar24 = *plVar29 + (long)(int)uVar15 * 0xc;
                    lVar16 = *plVar35 - (lVar24 + 0xc);
                    if (lVar16 != 0) {
                      _memmove(lVar24,lVar24 + 0xc,lVar16 + -3);
                    }
                    *plVar35 = lVar24 + lVar16;
                  }
                }
              }
            }
          }
        }
        uVar10 = (uint)(byte)uStack0000000000000078;
      }
    }
    if (uVar10 != 0) {
      lVar16 = (long)(int)uVar15 * 0xc;
      pbVar39 = (byte *)((long)&uStack0000000000000078 + 1);
      do {
        uStack0000000000000058._0_4_ = CONCAT31(uStack0000000000000058._1_3_,(char)uVar10);
        uStack0000000000000058._4_4_ = 0;
        bStack0000000000000060 = bStack0000000000000060 & 0xf8;
        func_0x001396dc(plVar29,lVar16 + *plVar29,&uStack0000000000000058);
        bVar28 = *pbVar39;
        uVar10 = (uint)bVar28;
        lVar16 = lVar16 + 0xc;
        uVar15 = (int)uVar22 + 1;
        uVar22 = (ulong)uVar15;
        pbVar39 = pbVar39 + 1;
      } while (bVar28 != 0);
    }
    func_0x0002a730(&uStack0000000000000080,&uStack0000000000000078);
    uVar10 = 0;
    if ((0 < (int)uVar15) &&
       (uVar41 < (ulong)((*(long *)(param_1 + 0x10) - *(long *)(param_1 + 8) >> 3) *
                        -0x5555555555555555))) {
      uVar10 = 0;
      uVar34 = 0;
      plVar29 = (long *)(*(long *)(param_1 + 8) + (long)iVar20 * 0x18);
      lVar16 = *plVar29;
      do {
        while( true ) {
          if ((int)((ulong)(plVar29[1] - lVar16) >> 2) * -0x55555555 <= (int)uVar34)
          goto code_r0x001400e4;
          bVar28 = *(byte *)(lVar16 + (ulong)uVar34 * 0xc);
          iVar30 = 1;
          if ((bVar28 & 0xe0) == 0xc0) {
            iVar30 = 2;
          }
          iVar7 = 3;
          if ((bVar28 & 0xf0) != 0xe0) {
            iVar7 = iVar30;
          }
          iVar30 = 4;
          if ((bVar28 & 0xf8) != 0xf0) {
            iVar30 = iVar7;
          }
          iVar7 = 5;
          if ((bVar28 & 0xfc) != 0xf8) {
            iVar7 = iVar30;
          }
          iVar30 = 6;
          if ((bVar28 & 0xfe) != 0xfc) {
            iVar30 = iVar7;
          }
          if (bVar28 != 9) break;
          iVar7 = *(int *)(param_1 + 0x54);
          iVar27 = 0;
          if (iVar7 != 0) {
            iVar27 = (int)uVar10 / iVar7;
          }
          uVar10 = iVar7 + iVar27 * iVar7;
          uVar34 = iVar30 + uVar34;
          if ((int)uVar15 <= (int)uVar34) goto code_r0x001400e4;
        }
        uVar10 = uVar10 + 1;
        uVar34 = iVar30 + uVar34;
      } while ((int)uVar34 < (int)uVar15);
    }
code_r0x001400e4:
    if ((*(int *)puVar1 != iVar20) || (*(uint *)(param_1 + 0x34) != uVar10)) {
      *(ulong *)(param_1 + 0x30) = uVar8 & 0xffffffff | (ulong)uVar10 << 0x20;
      *(undefined1 *)(param_1 + 0x68) = 1;
      func_0x001420d0(param_1);
    }
  }
  *(undefined1 *)(param_1 + 0x5d) = 1;
  uStack00000000000000a0 = func_0x00137dcc(param_1,puVar1);
  uStack00000000000000f0 = *(undefined8 *)(param_1 + 0x28);
  uStack00000000000000e8 = *puVar40;
  uStack00000000000000f8 = *(undefined8 *)(param_1 + 0x30);
  func_0x00139988(param_1,&uStack0000000000000080);
  uVar15 = (int)((ulong)(*(long *)(param_1 + 0x10) - *(long *)(param_1 + 8)) >> 3) * -0x55555555;
  uVar10 = iVar20 + 2U;
  if ((int)uVar15 <= (int)(iVar20 + 2U)) {
    uVar10 = uVar15;
  }
  uVar15 = *(uint *)(param_1 + 0x6c);
  if ((int)(iVar20 - 1U) <= (int)*(uint *)(param_1 + 0x6c)) {
    uVar15 = iVar20 - 1U;
  }
  uVar34 = *(uint *)(param_1 + 0x70);
  if ((int)*(uint *)(param_1 + 0x70) <= (int)uVar10) {
    uVar34 = uVar10;
  }
  uVar15 = uVar15 & ((int)uVar15 >> 0x1f ^ 0xffffffffU);
  uVar10 = uVar15;
  if ((int)uVar15 <= (int)uVar34) {
    uVar10 = uVar34;
  }
  *(uint *)(param_1 + 0x6c) = uVar15;
  *(uint *)(param_1 + 0x70) = uVar10;
  *(undefined1 *)(param_1 + 0x248) = 1;
  func_0x001420d0(param_1);
code_r0x001401ac:
  if (lStack00000000000000b8 < 0) {
    __ZdlPv(_uStack00000000000000a8);
  }
  if (_uStack0000000000000090 < 0) {
    __ZdlPv(_uStack0000000000000080);
  }
  return;
}

