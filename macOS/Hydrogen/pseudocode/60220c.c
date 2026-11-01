
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * thunk_FUN_00602264(undefined8 param_1,undefined8 param_2,int param_3)

{
  bool bVar1;
  ulong uVar2;
  long lVar3;
  bool bVar4;
  int iVar5;
  int iVar6;
  undefined8 uVar7;
  undefined8 *puVar8;
  ulong *puVar9;
  undefined8 *puVar10;
  uint uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  uint uVar15;
  ulong uVar16;
  undefined **ppuVar17;
  int *piVar18;
  uint uVar19;
  uint uVar20;
  undefined1 auVar21 [16];
  long in_stack_00000008;
  undefined1 uStack00000000000000b8;
  undefined *apuStack_158 [2];
  ulong uStack_148;
  ulong uStack_140;
  long lStack_138;
  undefined *apuStack_128 [2];
  ulong uStack_118;
  ulong uStack_110;
  ulong *puStack_108;
  undefined4 uStack_100;
  undefined *apuStack_f8 [2];
  ulong uStack_e8;
  ulong uStack_e0;
  undefined8 *puStack_d8;
  undefined4 uStack_d0;
  undefined *apuStack_c8 [2];
  ulong uStack_b8;
  ulong uStack_b0;
  long *plStack_a8;
  int iStack_a0;
  undefined *apuStack_98 [2];
  ulong uStack_88;
  ulong uStack_80;
  ulong *puStack_78;
  undefined4 uStack_70;
  
  func_0x00087574(&uStack00000000000000b8);
  func_0x005fde38(in_stack_00000008 + 8);
  auVar21 = __Unwind_Resume(param_1);
  piVar18 = auVar21._8_8_;
  puVar10 = auVar21._0_8_;
  DataMemoryBarrier(2,3);
  if ((bRam0000000000a3c148 & 1) == 0) {
    puRam0000000000a2ab70 = &DAT_005f6230;
    puRam0000000000a2ab78 = &DAT_005f627c;
    puRam0000000000a2aa98 = &DAT_005f4e6c;
    puRam0000000000a2aaa0 = &DAT_005f4ed4;
    puRam0000000000a2aaa8 = &DAT_005f50a8;
    puRam0000000000a2ab28 = &DAT_005f5e0c;
    puRam0000000000a2ab30 = &DAT_005f5e38;
    puRam0000000000a2ab38 = &DAT_005f5eec;
    puRam0000000000a2aae0 = &DAT_005f57fc;
    puRam0000000000a2aae8 = &DAT_005f5844;
    puRam0000000000a2aaf0 = &DAT_005f5984;
    puRam0000000000a2ab80 = &DAT_005f63c0;
    puRam0000000000a2aab8 = &DAT_005f6838;
    puRam0000000000a2ab48 = &DAT_005f9574;
    puRam0000000000a2ab00 = &DAT_005f850c;
    puRam0000000000a2ab90 = &DAT_005fa300;
    bRam0000000000a3c148 = 1;
    DataMemoryBarrier(2,3);
  }
  *puVar10 = &UNK_009f5d60;
  uVar14 = _UNK_008baa78;
  uVar13 = _UNK_008baa70;
  puVar10[3] = _UNK_008baa78;
  puVar10[2] = uVar13;
  uVar7 = func_0x006115d0(0x10);
  puVar10[4] = uVar7;
  *(undefined4 *)(puVar10 + 5) = 0;
  uVar19 = 0xffffffff;
  do {
    uVar15 = uVar19;
    uVar19 = uVar15 + 1;
  } while (piVar18[uVar19] != 0);
  DataMemoryBarrier(2,3);
  if ((bRam0000000000a3c148 & 1) == 0) {
    puRam0000000000a2ab70 = &DAT_005f6230;
    puRam0000000000a2ab78 = &DAT_005f627c;
    puRam0000000000a2aa98 = &DAT_005f4e6c;
    puRam0000000000a2aaa0 = &DAT_005f4ed4;
    puRam0000000000a2aaa8 = &DAT_005f50a8;
    puRam0000000000a2ab28 = &DAT_005f5e0c;
    puRam0000000000a2ab30 = &DAT_005f5e38;
    puRam0000000000a2ab38 = &DAT_005f5eec;
    puRam0000000000a2aae0 = &DAT_005f57fc;
    puRam0000000000a2aae8 = &DAT_005f5844;
    puRam0000000000a2aaf0 = &DAT_005f5984;
    puRam0000000000a2ab80 = &DAT_005f63c0;
    puRam0000000000a2aab8 = &DAT_005f6838;
    puRam0000000000a2ab48 = &DAT_005f9574;
    puRam0000000000a2ab00 = &DAT_005f850c;
    puRam0000000000a2ab90 = &DAT_005fa300;
    bRam0000000000a3c148 = 1;
    DataMemoryBarrier(2,3);
  }
  apuStack_c8[0] = &UNK_009f5d60;
  uStack_b0 = uVar14;
  uStack_b8 = uVar13;
  plStack_a8 = (long *)func_0x006115d0(0x10);
  iStack_a0 = 0;
  *plStack_a8 = 0;
  plStack_a8[1] = 0;
  if (uVar19 == 0) {
    ppuVar17 = (undefined **)0xa3c168;
    if (((bRam0000000000a3c150 & 1) == 0) && (iVar5 = ___cxa_guard_acquire(0xa3c150), iVar5 != 0)) {
      func_0x005fe1e8(0xa3c168,0);
      ppuVar17 = (undefined **)0xa3c168;
      ___cxa_atexit(&SUB_00087574,0xa3c168,0);
      ___cxa_guard_release(0xa3c150);
    }
    goto code_r0x00602024;
  }
  uVar12 = (ulong)(piVar18[uVar15] - 0x42U);
  if (piVar18[uVar15] - 0x42U < 0x2e) {
    if ((1L << (uVar12 & 0x3f) & 0x100000001U) == 0) {
      if ((1L << (uVar12 & 0x3f) & 0x4000000040U) == 0) {
        if ((1L << (uVar12 & 0x3f) & 0x200000002000U) == 0) goto code_r0x0060161c;
        uVar7 = 8;
      }
      else {
        uVar7 = 0x10;
      }
    }
    else {
      uVar7 = 2;
    }
  }
  else {
code_r0x0060161c:
    uVar7 = 10;
  }
  iVar5 = *piVar18;
  if (iVar5 != 0x2d) {
    uVar15 = uVar19;
  }
  piVar18 = piVar18 + (iVar5 == 0x2d);
  if (((uVar15 < 3) || (*piVar18 != 0x30)) ||
     (uVar12 = (ulong)(piVar18[1] - 0x4eU), 0x2a < piVar18[1] - 0x4eU)) {
code_r0x00601d24:
    if (param_3 != 1) goto code_r0x006016a4;
code_r0x00601d2c:
    if (uVar15 != 0) {
      uVar12 = 0;
      do {
        iVar6 = piVar18[uVar12];
        uVar19 = iVar6 - 0x37;
        if (5 < iVar6 - 0x41U) {
          uVar19 = (uint)uVar7;
        }
        if (iVar6 - 0x61U < 6) {
          uVar19 = iVar6 - 0x57;
        }
        uVar20 = iVar6 - 0x30U;
        if (9 < iVar6 - 0x30U) {
          uVar20 = uVar19;
        }
        if ((int)uVar20 < (int)(uint)uVar7) {
          DataMemoryBarrier(2,3);
          if ((bRam0000000000a3c148 & 1) == 0) {
            puRam0000000000a2ab70 = &DAT_005f6230;
            puRam0000000000a2ab78 = &DAT_005f627c;
            puRam0000000000a2aa98 = &DAT_005f4e6c;
            puRam0000000000a2aaa0 = &DAT_005f4ed4;
            puRam0000000000a2aaa8 = &DAT_005f50a8;
            puRam0000000000a2ab28 = &DAT_005f5e0c;
            puRam0000000000a2ab30 = &DAT_005f5e38;
            puRam0000000000a2ab38 = &DAT_005f5eec;
            puRam0000000000a2aae0 = &DAT_005f57fc;
            puRam0000000000a2aae8 = &DAT_005f5844;
            puRam0000000000a2aaf0 = &DAT_005f5984;
            puRam0000000000a2ab80 = &DAT_005f63c0;
            puRam0000000000a2aab8 = &DAT_005f6838;
            puRam0000000000a2ab48 = &DAT_005f9574;
            puRam0000000000a2ab00 = &DAT_005f850c;
            puRam0000000000a2ab90 = &DAT_005fa300;
            bRam0000000000a3c148 = 1;
            DataMemoryBarrier(2,3);
          }
          apuStack_f8[0] = &UNK_009f5d60;
          uStack_e0 = uVar14;
          uStack_e8 = uVar13;
          puVar8 = (undefined8 *)func_0x006115d0(0x10);
          uStack_d0 = 0;
          *puVar8 = uVar7;
          puVar8[1] = 0;
          puStack_d8 = puVar8;
          func_0x00608730(apuStack_98,apuStack_c8,apuStack_f8);
          func_0x005ffccc(apuStack_c8,apuStack_98);
          apuStack_98[0] = &UNK_009f5d60;
          uVar16 = uStack_88;
          if (uStack_80 <= uStack_88) {
            uVar16 = uStack_80;
          }
          if (puStack_78 != (ulong *)0x0) {
            for (; uVar16 != 0; uVar16 = uVar16 - 1) {
              puStack_78[uVar16 - 1] = 0;
            }
            func_0x00611644();
          }
          apuStack_f8[0] = &UNK_009f5d60;
          puVar8[1] = 0;
          *puVar8 = 0;
          func_0x00611644(puVar8);
          DataMemoryBarrier(2,3);
          if ((bRam0000000000a3c148 & 1) == 0) {
            puRam0000000000a2ab70 = &DAT_005f6230;
            puRam0000000000a2ab78 = &DAT_005f627c;
            puRam0000000000a2aa98 = &DAT_005f4e6c;
            puRam0000000000a2aaa0 = &DAT_005f4ed4;
            puRam0000000000a2aaa8 = &DAT_005f50a8;
            puRam0000000000a2ab28 = &DAT_005f5e0c;
            puRam0000000000a2ab30 = &DAT_005f5e38;
            puRam0000000000a2ab38 = &DAT_005f5eec;
            puRam0000000000a2aae0 = &DAT_005f57fc;
            puRam0000000000a2aae8 = &DAT_005f5844;
            puRam0000000000a2aaf0 = &DAT_005f5984;
            puRam0000000000a2ab80 = &DAT_005f63c0;
            puRam0000000000a2aab8 = &DAT_005f6838;
            puRam0000000000a2ab48 = &DAT_005f9574;
            puRam0000000000a2ab00 = &DAT_005f850c;
            puRam0000000000a2ab90 = &DAT_005fa300;
            bRam0000000000a3c148 = 1;
            DataMemoryBarrier(2,3);
          }
          apuStack_98[0] = &UNK_009f5d60;
          uStack_80 = uVar14;
          uStack_88 = uVar13;
          puVar9 = (ulong *)func_0x006115d0(0x10);
          uStack_70 = 0;
          *puVar9 = (ulong)uVar20;
          puVar9[1] = 0;
          puStack_78 = puVar9;
          func_0x00603158(apuStack_c8,apuStack_98);
          apuStack_98[0] = &UNK_009f5d60;
          puVar9[1] = 0;
          *puVar9 = 0;
          func_0x00611644(puVar9);
        }
        uVar12 = uVar12 + 1;
      } while (uVar12 != uVar15);
    }
  }
  else {
    if ((1L << (uVar12 & 0x3f) & 0x100000001U) == 0) {
      if ((1L << (uVar12 & 0x3f) & 0x200000002U) == 0) {
        if ((1L << (uVar12 & 0x3f) & 0x40000000400U) != 0) {
          uVar7 = 0x10;
          goto joined_r0x006016a0;
        }
      }
      else {
        piVar18 = piVar18 + 2;
        uVar15 = uVar15 - 2;
        uVar7 = 8;
      }
      goto code_r0x00601d24;
    }
    uVar7 = 10;
joined_r0x006016a0:
    uVar15 = uVar15 - 2;
    piVar18 = piVar18 + 2;
    if (param_3 == 1) goto code_r0x00601d2c;
code_r0x006016a4:
    uVar19 = (uint)uVar7;
    if ((param_3 == 0) && (uVar19 == 0x10)) {
      if (((bRam0000000000a3c158 & 1) == 0) && (iVar6 = ___cxa_guard_acquire(0xa3c158), iVar6 != 0))
      {
        func_0x005fe1e8(0xa3c198,1);
        ___cxa_atexit(&SUB_00087574,0xa3c198,0);
        ___cxa_guard_release(0xa3c158);
      }
      func_0x005fde88(apuStack_98,0xa3c198);
      if (uVar15 != 0) {
        bVar1 = false;
        uVar19 = 0;
        uVar20 = 0;
        uVar16 = (ulong)uVar15 - 1;
        uVar12 = 0;
        do {
          while( true ) {
            iVar6 = piVar18[uVar12];
            uVar11 = iVar6 - 0x30;
            if (9 < uVar11) break;
code_r0x00601728:
            if (bVar1) {
              uVar19 = uVar11;
              uVar11 = uVar20;
            }
joined_r0x00601734:
            uVar20 = uVar11;
            if (bVar1) {
              DataMemoryBarrier(2,3);
              if ((bRam0000000000a3c148 & 1) == 0) {
                puRam0000000000a2ab70 = &DAT_005f6230;
                puRam0000000000a2ab78 = &DAT_005f627c;
                puRam0000000000a2aa98 = &DAT_005f4e6c;
                puRam0000000000a2aaa0 = &DAT_005f4ed4;
                puRam0000000000a2aaa8 = &DAT_005f50a8;
                puRam0000000000a2ab28 = &DAT_005f5e0c;
                puRam0000000000a2ab30 = &DAT_005f5e38;
                puRam0000000000a2ab38 = &DAT_005f5eec;
                puRam0000000000a2aae0 = &DAT_005f57fc;
                puRam0000000000a2aae8 = &DAT_005f5844;
                puRam0000000000a2aaf0 = &DAT_005f5984;
                puRam0000000000a2ab80 = &DAT_005f63c0;
                puRam0000000000a2aab8 = &DAT_005f6838;
                puRam0000000000a2ab48 = &DAT_005f9574;
                puRam0000000000a2ab00 = &DAT_005f850c;
                puRam0000000000a2ab90 = &DAT_005fa300;
                bRam0000000000a3c148 = 1;
                DataMemoryBarrier(2,3);
              }
              apuStack_128[0] = &UNK_009f5d60;
              uStack_110 = uVar14;
              uStack_118 = uVar13;
              puVar9 = (ulong *)func_0x006115d0(0x10);
              uStack_100 = 0;
              *puVar9 = (ulong)(uVar19 | uVar20 << 4);
              puVar9[1] = 0;
              puStack_108 = puVar9;
              func_0x00608730(apuStack_f8,apuStack_98,apuStack_128);
              func_0x00603158(apuStack_c8,apuStack_f8);
              apuStack_f8[0] = &UNK_009f5d60;
              uVar2 = uStack_e8;
              if (uStack_e0 <= uStack_e8) {
                uVar2 = uStack_e0;
              }
              if (puStack_d8 != (undefined8 *)0x0) {
                for (; uVar2 != 0; uVar2 = uVar2 - 1) {
                  puStack_d8[uVar2 - 1] = 0;
                }
                func_0x00611644();
              }
              apuStack_128[0] = &UNK_009f5d60;
              puVar9[1] = 0;
              *puVar9 = 0;
              func_0x00611644(puVar9);
              func_0x006075d4(apuStack_98,8);
              bVar1 = false;
              bVar4 = uVar16 == uVar12;
              uVar12 = uVar12 + 1;
              if (bVar4) goto code_r0x00601ce4;
            }
            else {
              bVar1 = true;
              bVar4 = uVar16 == uVar12;
              uVar12 = uVar12 + 1;
              if (bVar4) goto code_r0x00601b94;
            }
          }
          if (iVar6 - 0x61U < 6) {
            uVar11 = iVar6 - 0x57;
            goto code_r0x00601728;
          }
          if (iVar6 - 0x41U < 6) {
            uVar11 = iVar6 - 0x37U;
            if (bVar1) {
              uVar19 = iVar6 - 0x37U;
              uVar11 = uVar20;
            }
            goto joined_r0x00601734;
          }
          uVar12 = uVar12 + 1;
        } while (uVar15 != uVar12);
        if (bVar1) {
code_r0x00601b94:
          DataMemoryBarrier(2,3);
          if ((bRam0000000000a3c148 & 1) == 0) {
            puRam0000000000a2ab70 = &DAT_005f6230;
            puRam0000000000a2ab78 = &DAT_005f627c;
            puRam0000000000a2aa98 = &DAT_005f4e6c;
            puRam0000000000a2aaa0 = &DAT_005f4ed4;
            puRam0000000000a2aaa8 = &DAT_005f50a8;
            puRam0000000000a2ab28 = &DAT_005f5e0c;
            puRam0000000000a2ab30 = &DAT_005f5e38;
            puRam0000000000a2ab38 = &DAT_005f5eec;
            puRam0000000000a2aae0 = &DAT_005f57fc;
            puRam0000000000a2aae8 = &DAT_005f5844;
            puRam0000000000a2aaf0 = &DAT_005f5984;
            puRam0000000000a2ab80 = &DAT_005f63c0;
            puRam0000000000a2aab8 = &DAT_005f6838;
            puRam0000000000a2ab48 = &DAT_005f9574;
            puRam0000000000a2ab00 = &DAT_005f850c;
            puRam0000000000a2ab90 = &DAT_005fa300;
            bRam0000000000a3c148 = 1;
            DataMemoryBarrier(2,3);
          }
          apuStack_128[0] = &UNK_009f5d60;
          uStack_110 = uVar14;
          uStack_118 = uVar13;
          puVar9 = (ulong *)func_0x006115d0(0x10);
          uStack_100 = 0;
          *puVar9 = (ulong)uVar20;
          puVar9[1] = 0;
          puStack_108 = puVar9;
          func_0x00608730(apuStack_f8,apuStack_128,apuStack_98);
          func_0x00603158(apuStack_c8,apuStack_f8);
          apuStack_f8[0] = &UNK_009f5d60;
          uVar13 = uStack_e8;
          if (uStack_e0 <= uStack_e8) {
            uVar13 = uStack_e0;
          }
          if (puStack_d8 != (undefined8 *)0x0) {
            for (; uVar13 != 0; uVar13 = uVar13 - 1) {
              puStack_d8[uVar13 - 1] = 0;
            }
            func_0x00611644();
          }
          apuStack_128[0] = &UNK_009f5d60;
          puVar9[1] = 0;
          *puVar9 = 0;
          func_0x00611644(puVar9);
        }
      }
code_r0x00601ce4:
      apuStack_98[0] = &UNK_009f5d60;
      uVar13 = uStack_88;
      if (uStack_80 <= uStack_88) {
        uVar13 = uStack_80;
      }
      if (puStack_78 != (ulong *)0x0) {
        for (; uVar13 != 0; uVar13 = uVar13 - 1) {
          puStack_78[uVar13 - 1] = 0;
        }
        func_0x00611644();
      }
    }
    else if (0 < (int)uVar15) {
      uVar12 = (ulong)uVar15;
      do {
        iVar6 = piVar18[uVar12 - 1 & 0xffffffff];
        uVar15 = iVar6 - 0x37;
        if (5 < iVar6 - 0x41U) {
          uVar15 = uVar19;
        }
        if (iVar6 - 0x61U < 6) {
          uVar15 = iVar6 - 0x57;
        }
        uVar20 = iVar6 - 0x30U;
        if (9 < iVar6 - 0x30U) {
          uVar20 = uVar15;
        }
        if ((int)uVar20 < (int)uVar19) {
          DataMemoryBarrier(2,3);
          if ((bRam0000000000a3c148 & 1) == 0) {
            puRam0000000000a2ab70 = &DAT_005f6230;
            puRam0000000000a2ab78 = &DAT_005f627c;
            puRam0000000000a2aa98 = &DAT_005f4e6c;
            puRam0000000000a2aaa0 = &DAT_005f4ed4;
            puRam0000000000a2aaa8 = &DAT_005f50a8;
            puRam0000000000a2ab28 = &DAT_005f5e0c;
            puRam0000000000a2ab30 = &DAT_005f5e38;
            puRam0000000000a2ab38 = &DAT_005f5eec;
            puRam0000000000a2aae0 = &DAT_005f57fc;
            puRam0000000000a2aae8 = &DAT_005f5844;
            puRam0000000000a2aaf0 = &DAT_005f5984;
            puRam0000000000a2ab80 = &DAT_005f63c0;
            puRam0000000000a2aab8 = &DAT_005f6838;
            puRam0000000000a2ab48 = &DAT_005f9574;
            puRam0000000000a2ab00 = &DAT_005f850c;
            puRam0000000000a2ab90 = &DAT_005fa300;
            bRam0000000000a3c148 = 1;
            DataMemoryBarrier(2,3);
          }
          apuStack_f8[0] = &UNK_009f5d60;
          uStack_e0 = uVar14;
          uStack_e8 = uVar13;
          puVar8 = (undefined8 *)func_0x006115d0(0x10);
          uStack_d0 = 0;
          *puVar8 = uVar7;
          puVar8[1] = 0;
          puStack_d8 = puVar8;
          func_0x00608730(apuStack_98,apuStack_c8,apuStack_f8);
          func_0x005ffccc(apuStack_c8,apuStack_98);
          apuStack_98[0] = &UNK_009f5d60;
          uVar16 = uStack_88;
          if (uStack_80 <= uStack_88) {
            uVar16 = uStack_80;
          }
          if (puStack_78 != (ulong *)0x0) {
            for (; uVar16 != 0; uVar16 = uVar16 - 1) {
              puStack_78[uVar16 - 1] = 0;
            }
            func_0x00611644();
          }
          apuStack_f8[0] = &UNK_009f5d60;
          puVar8[1] = 0;
          *puVar8 = 0;
          func_0x00611644(puVar8);
          DataMemoryBarrier(2,3);
          if ((bRam0000000000a3c148 & 1) == 0) {
            puRam0000000000a2ab70 = &DAT_005f6230;
            puRam0000000000a2ab78 = &DAT_005f627c;
            puRam0000000000a2aa98 = &DAT_005f4e6c;
            puRam0000000000a2aaa0 = &DAT_005f4ed4;
            puRam0000000000a2aaa8 = &DAT_005f50a8;
            puRam0000000000a2ab28 = &DAT_005f5e0c;
            puRam0000000000a2ab30 = &DAT_005f5e38;
            puRam0000000000a2ab38 = &DAT_005f5eec;
            puRam0000000000a2aae0 = &DAT_005f57fc;
            puRam0000000000a2aae8 = &DAT_005f5844;
            puRam0000000000a2aaf0 = &DAT_005f5984;
            puRam0000000000a2ab80 = &DAT_005f63c0;
            puRam0000000000a2aab8 = &DAT_005f6838;
            puRam0000000000a2ab48 = &DAT_005f9574;
            puRam0000000000a2ab00 = &DAT_005f850c;
            puRam0000000000a2ab90 = &DAT_005fa300;
            bRam0000000000a3c148 = 1;
            DataMemoryBarrier(2,3);
          }
          apuStack_98[0] = &UNK_009f5d60;
          uStack_80 = uVar14;
          uStack_88 = uVar13;
          puVar9 = (ulong *)func_0x006115d0(0x10);
          uStack_70 = 0;
          *puVar9 = (ulong)uVar20;
          puVar9[1] = 0;
          puStack_78 = puVar9;
          func_0x00603158(apuStack_c8,apuStack_98);
          apuStack_98[0] = &UNK_009f5d60;
          puVar9[1] = 0;
          *puVar9 = 0;
          func_0x00611644(puVar9);
        }
        bVar1 = 1 < (long)uVar12;
        uVar12 = uVar12 - 1;
      } while (bVar1);
    }
  }
  if (iVar5 != 0x2d) {
    ppuVar17 = apuStack_c8;
    goto code_r0x00602024;
  }
  if ((iStack_a0 == 1) || (*plStack_a8 != 0)) {
code_r0x00602008:
    iStack_a0 = 1 - iStack_a0;
  }
  else {
    uVar13 = uStack_b0;
    do {
      if (uVar13 == 0) goto code_r0x00602014;
      uVar14 = uVar13 - 1;
      lVar3 = uVar13 - 1;
      uVar13 = uVar14;
    } while (plStack_a8[lVar3] == 0);
    if ((int)uVar14 != -1) goto code_r0x00602008;
  }
code_r0x00602014:
  ppuVar17 = apuStack_c8;
code_r0x00602024:
  func_0x005fde88(apuStack_158,ppuVar17);
  apuStack_c8[0] = &UNK_009f5d60;
  uVar13 = uStack_b8;
  if (uStack_b0 <= uStack_b8) {
    uVar13 = uStack_b0;
  }
  if (plStack_a8 != (long *)0x0) {
    for (; uVar13 != 0; uVar13 = uVar13 - 1) {
      plStack_a8[uVar13 - 1] = 0;
    }
    func_0x00611644();
  }
  func_0x005ffccc(puVar10,apuStack_158);
  apuStack_158[0] = &UNK_009f5d60;
  if (uStack_140 <= uStack_148) {
    uStack_148 = uStack_140;
  }
  if (lStack_138 != 0) {
    if (uStack_148 != 0) {
      do {
        *(undefined8 *)(lStack_138 + -8 + uStack_148 * 8) = 0;
        uStack_148 = uStack_148 - 1;
      } while (uStack_148 != 0);
    }
    func_0x00611644();
  }
  return puVar10;
}

