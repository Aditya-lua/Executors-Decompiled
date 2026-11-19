/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088ebf4
 */

void FUN_0088ebf4(undefined8 *param_1,long param_2,uint param_3,ulong param_4,uint param_5)

{
  int *piVar1;
  uint uVar2;
  ulong uVar3;
  long lVar4;
  undefined8 *puVar5;
  int iVar6;
  undefined4 uVar7;
  int iVar8;
  int *piVar9;
  undefined4 *puVar10;
  undefined8 uVar11;
  char *pcVar12;
  uint uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong *puVar17;
  ulong uVar18;
  long lVar19;
  long lVar20;
  long lVar21;
  uint uVar22;
  ulong uVar23;
  long *plVar24;
  int *piVar25;
  undefined8 *puVar26;
  void *pvVar27;
  byte bVar28;
  uint uVar29;
  int iVar30;
  int iVar31;
  int iVar32;
  uint uVar33;
  int iVar34;
  int iVar35;
  int iVar36;
  int iVar37;
  uint uVar38;
  int iVar39;
  int iVar40;
  int iVar41;
  int iVar42;
  int iVar43;
  int iVar44;
  int iVar45;
  int iVar46;
  int iVar47;
  int iVar48;
  int iVar49;
  int iVar50;
  int iVar51;
  int iVar52;
  int iVar53;
  int iVar54;
  int iVar55;
  int iVar56;
  int iVar57;
  int iVar58;
  int iVar59;
  int iVar60;
  int iVar61;
  uint local_1dc;
  long local_1d8;
  undefined8 *local_1d0;
  undefined4 local_1c8;
  undefined4 *local_1c0;
  undefined4 *puStack_1b8;
  long local_1b0;
  void *pvStack_1a8;
  ulong local_1a0;
  undefined8 *local_198;
  long local_190;
  undefined4 local_188;
  undefined4 auStack_178 [32];
  int aiStack_f8 [32];
  uint local_78;
  undefined1 local_74;
  long local_70;
  
  lVar4 = tpidr_el0;
  local_70 = *(long *)(lVar4 + 0x28);
  uVar18 = *(ulong *)(param_2 + 0x28);
  local_1d8 = param_2;
  if (uVar18 == 0) {
    puVar10 = (undefined4 *)FUN_00891928(param_1 + 0x3e,&local_1d8);
    uVar7 = *puVar10;
    uVar29 = puVar10[1];
    FUN_008769e0(*param_1,"allocation: table hash %d",uVar29);
    uVar33 = 0xffffffff;
    do {
      uVar38 = uVar33;
      uVar33 = uVar38 + 1;
    } while ((uint)(1 << (ulong)(uVar33 & 0x1f)) < uVar29);
    iVar6 = 0;
    if (uVar29 != 0) {
      iVar6 = uVar38 + 2;
    }
    FUN_00875b54(*param_1,0x35,param_3,iVar6,0);
    FUN_00875d18(*param_1,uVar7);
  }
  else {
    lVar19 = *(long *)(param_2 + 0x20);
    if (uVar18 < 9) {
      uVar29 = 0;
      uVar38 = 0;
      lVar20 = 0;
      uVar33 = 0;
    }
    else {
      iVar6 = 0;
      iVar30 = 0;
      iVar8 = 0;
      iVar31 = 0;
      iVar50 = 0;
      iVar51 = 0;
      iVar52 = 0;
      iVar53 = 0;
      iVar42 = 0;
      iVar43 = 0;
      iVar44 = 0;
      iVar45 = 0;
      iVar46 = 0;
      iVar47 = 0;
      iVar48 = 0;
      iVar49 = 0;
      iVar32 = 0;
      iVar34 = 0;
      iVar35 = 0;
      iVar36 = 0;
      uVar23 = 8;
      if ((uVar18 & 7) != 0) {
        uVar23 = uVar18 & 7;
      }
      iVar37 = 0;
      iVar39 = 0;
      iVar40 = 0;
      iVar41 = 0;
      lVar20 = uVar18 - uVar23;
      piVar9 = (int *)(lVar19 + 0x60);
      lVar21 = lVar20;
      do {
        iVar54 = piVar9[-0x18];
        iVar58 = *piVar9;
        lVar21 = lVar21 + -8;
        iVar55 = piVar9[-0x12];
        iVar59 = piVar9[6];
        iVar56 = piVar9[-0xc];
        iVar60 = piVar9[0xc];
        piVar25 = piVar9 + -6;
        piVar1 = piVar9 + 0x12;
        piVar9 = piVar9 + 0x30;
        iVar57 = *piVar25;
        iVar61 = *piVar1;
        iVar32 = iVar32 + (uint)(iVar54 == 0);
        iVar34 = iVar34 + (uint)(iVar55 == 0);
        iVar35 = iVar35 + (uint)(iVar56 == 0);
        iVar36 = iVar36 + (uint)(iVar57 == 0);
        iVar37 = iVar37 + (uint)(iVar58 == 0);
        iVar39 = iVar39 + (uint)(iVar59 == 0);
        iVar40 = iVar40 + (uint)(iVar60 == 0);
        iVar41 = iVar41 + (uint)(iVar61 == 0);
        iVar6 = iVar6 + (uint)(iVar54 != 0);
        iVar30 = iVar30 + (uint)(iVar55 != 0);
        iVar8 = iVar8 + (uint)(iVar56 != 0);
        iVar31 = iVar31 + (uint)(iVar57 != 0);
        iVar50 = iVar50 + (uint)(iVar58 != 0);
        iVar51 = iVar51 + (uint)(iVar59 != 0);
        iVar52 = iVar52 + (uint)(iVar60 != 0);
        iVar53 = iVar53 + (uint)(iVar61 != 0);
        iVar42 = iVar42 + (uint)(iVar54 == 1);
        iVar43 = iVar43 + (uint)(iVar55 == 1);
        iVar44 = iVar44 + (uint)(iVar56 == 1);
        iVar45 = iVar45 + (uint)(iVar57 == 1);
        iVar46 = iVar46 + (uint)(iVar58 == 1);
        iVar47 = iVar47 + (uint)(iVar59 == 1);
        iVar48 = iVar48 + (uint)(iVar60 == 1);
        iVar49 = iVar49 + (uint)(iVar61 == 1);
      } while (lVar21 != 0);
      uVar29 = iVar50 + iVar6 + iVar51 + iVar30 + iVar52 + iVar8 + iVar53 + iVar31;
      uVar38 = iVar46 + iVar42 + iVar47 + iVar43 + iVar48 + iVar44 + iVar49 + iVar45;
      uVar33 = iVar37 + iVar32 + iVar39 + iVar34 + iVar40 + iVar35 + iVar41 + iVar36;
    }
    lVar21 = uVar18 - lVar20;
    piVar9 = (int *)(lVar19 + lVar20 * 0x18);
    do {
      if (*piVar9 == 0) {
        uVar33 = uVar33 + 1;
      }
      else {
        uVar29 = uVar29 + 1;
      }
      if (*piVar9 == 1) {
        uVar38 = uVar38 + 1;
      }
      lVar21 = lVar21 + -1;
      piVar9 = piVar9 + 6;
    } while (lVar21 != 0);
    iVar6 = 0;
    uVar13 = uVar29;
    if ((uVar33 == 0) && (uVar29 != 0)) {
      iVar6 = 0;
      uVar23 = 0;
      do {
        if (param_1[0x2e] != 0) {
          uVar14 = *(ulong *)(lVar19 + uVar23 * 0x18 + 8);
          uVar15 = ((ulong)(uint)((int)uVar14 << 3) + 8 ^ uVar14 >> 0x20) * -0x622015f714c7d297;
          uVar15 = (uVar14 >> 0x20 ^ uVar15 >> 0x2f ^ uVar15) * -0x622015f714c7d297;
          uVar15 = (uVar15 ^ uVar15 >> 0x2f) * -0x6b622cb0470b6a63 >>
                   ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
          uVar16 = *(ulong *)(param_1[0x2c] + (uVar15 >> 6) * 8) >> (uVar15 & 0x3f);
          while ((uVar16 & 1) != 0) {
            puVar17 = (ulong *)(param_1[0x29] + uVar15 * 0x30);
            if (*puVar17 == uVar14) {
              if ((int)puVar17[1] == 3) {
                uVar13 = (uint)((double)puVar17[2] == (double)(iVar6 + 1));
                goto LAB_0088ee14;
              }
              break;
            }
            uVar15 = uVar15 + 1 & param_1[0x2d] - 1;
            uVar16 = *(ulong *)(param_1[0x2c] + (uVar15 >> 6) * 8) >> (uVar15 & 0x3f);
          }
        }
        uVar13 = 0;
LAB_0088ee14:
        uVar23 = uVar23 + 1;
        iVar6 = uVar13 + iVar6;
      } while (uVar23 != uVar18);
      uVar13 = uVar38;
      if (uVar29 != iVar6 + uVar38) {
        iVar6 = 0;
        uVar13 = uVar29;
      }
    }
    uVar29 = 0xffffffff;
    do {
      uVar22 = uVar29;
      uVar29 = uVar22 + 1;
    } while ((uint)(1 << (ulong)(uVar29 & 0x1f)) < uVar13);
    uVar29 = *(uint *)((long)param_1 + 0x64c);
    iVar30 = 0;
    if (uVar13 != 0) {
      iVar30 = uVar22 + 2;
    }
    local_1dc = param_3;
    if ((param_4 & 1) == 0) {
      uVar22 = uVar29 + 1;
      if (0xff < uVar22) {
        if (*(long *)(lVar4 + 0x28) == local_70) {
                    /* try { // try from 0088f6ec to 0088f703 has its CatchHandler @ 0088f748 */
                    /* WARNING: Subroutine does not return */
          FUN_0087fcd8(param_2 + 0xc,
                       "Out of registers when trying to allocate %d registers: exceeded limit %d",1,
                       0xff);
        }
        goto LAB_0088f7cc;
      }
      *(uint *)((long)param_1 + 0x64c) = uVar22;
      uVar2 = *(uint *)(param_1 + 0xca);
      if (*(uint *)(param_1 + 0xca) <= uVar22) {
        uVar2 = uVar22;
      }
      *(uint *)(param_1 + 0xca) = uVar2;
      local_1dc = uVar29;
    }
    local_190 = 0;
    local_188 = 0x3f800000;
    pvStack_1a8 = (void *)0x0;
    local_1b0 = 0;
    local_198 = (undefined8 *)0x0;
    local_1a0 = 0;
    puStack_1b8 = (undefined4 *)0x0;
    local_1c0 = (undefined4 *)0x0;
    if (((uVar33 == 0 && iVar6 == 0) && (uVar38 - 1 < 0x20)) && (uVar13 == uVar38)) {
      uVar18 = 0;
      local_78 = 0;
      local_74 = 0;
      do {
        lVar21 = *(long *)(param_2 + 0x20) + uVar18 * 0x18;
        lVar19 = *(long *)(lVar21 + 8);
        if (*(int *)(lVar19 + 8) != DAT_00d1b000) {
          lVar19 = 0;
        }
                    /* try { // try from 0088ef94 to 0088ef97 has its CatchHandler @ 0088f77c */
        iVar6 = FUN_00875070(*param_1,*(undefined8 *)(lVar19 + 0x20),*(undefined8 *)(lVar19 + 0x28))
        ;
        local_1d0 = (undefined8 *)CONCAT44(local_1d0._4_4_,iVar6);
        if (iVar6 < 0) {
          if (*(long *)(lVar4 + 0x28) == local_70) {
                    /* try { // try from 0088f670 to 0088f67f has its CatchHandler @ 0088f778 */
                    /* WARNING: Subroutine does not return */
            FUN_0087fcd8(lVar19 + 0xc,"Exceeded constant limit; simplify the code to compile");
          }
          goto LAB_0088f7cc;
        }
                    /* try { // try from 0088efa4 to 0088f07f has its CatchHandler @ 0088f784 */
        uVar7 = FUN_008868ec(param_1,*(undefined8 *)(lVar21 + 0x10));
        if (local_1a0 != 0) {
          uVar23 = (ulong)(int)local_1d0;
          bVar28 = POPCOUNT((char)local_1a0) + POPCOUNT((char)(local_1a0 >> 8)) +
                   POPCOUNT((char)(local_1a0 >> 0x10)) + POPCOUNT((char)(local_1a0 >> 0x18)) +
                   POPCOUNT((char)(local_1a0 >> 0x20)) + POPCOUNT((char)(local_1a0 >> 0x28)) +
                   POPCOUNT((char)(local_1a0 >> 0x30)) + POPCOUNT((char)(local_1a0 >> 0x38));
          if (bVar28 < 2) {
            uVar15 = local_1a0 - 1 & uVar23;
          }
          else {
            uVar15 = uVar23;
            if (local_1a0 <= uVar23) {
              uVar15 = 0;
              if (local_1a0 != 0) {
                uVar15 = uVar23 / local_1a0;
              }
              uVar15 = uVar23 - uVar15 * local_1a0;
            }
          }
          plVar24 = *(long **)((long)pvStack_1a8 + uVar15 * 8);
          if ((plVar24 != (long *)0x0) && (plVar24 = (long *)*plVar24, plVar24 != (long *)0x0)) {
            do {
              uVar14 = plVar24[1];
              if (uVar14 == uVar23) {
                if ((int)plVar24[2] == (int)local_1d0) {
                  piVar9 = (int *)FUN_00891a24(&local_1c0,&local_1d0);
                  if (*piVar9 == -1) goto LAB_0088f084;
                  break;
                }
              }
              else {
                if (bVar28 < 2) {
                  uVar14 = uVar14 & local_1a0 - 1;
                }
                else if (local_1a0 <= uVar14) {
                  uVar16 = 0;
                  if (local_1a0 != 0) {
                    uVar16 = uVar14 / local_1a0;
                  }
                  uVar14 = uVar14 - uVar16 * local_1a0;
                }
                if (uVar14 != uVar15) break;
              }
              plVar24 = (long *)*plVar24;
            } while (plVar24 != (long *)0x0);
          }
        }
        puVar10 = (undefined4 *)FUN_00891a24(&local_1c0,&local_1d0);
        *puVar10 = uVar7;
LAB_0088f084:
        uVar18 = uVar18 + 1;
      } while (uVar18 < *(ulong *)(param_2 + 0x28));
      if (local_1c0 != puStack_1b8) {
        puVar10 = local_1c0;
        do {
          uVar13 = local_78;
          auStack_178[local_78] = *puVar10;
          iVar6 = puVar10[1];
          aiStack_f8[uVar13] = iVar6;
          if (-1 < iVar6) {
            local_74 = 1;
          }
          puVar10 = puVar10 + 2;
          local_78 = local_78 + 1;
        } while (puVar10 != puStack_1b8);
      }
                    /* try { // try from 0088f110 to 0088f133 has its CatchHandler @ 0088f750 */
      uVar18 = FUN_008751d0(*param_1,auStack_178);
      uVar23 = uVar18 & 0xffffffff;
      if ((int)uVar18 < 0) {
LAB_0088f71c:
        if (*(long *)(lVar4 + 0x28) == local_70) {
                    /* try { // try from 0088f730 to 0088f73f has its CatchHandler @ 0088f750 */
                    /* WARNING: Subroutine does not return */
          FUN_0087fcd8(param_2 + 0xc,"Exceeded constant limit; simplify the code to compile");
        }
        goto LAB_0088f7cc;
      }
      FUN_008769e0(*param_1,"allocation: table template %d",uVar38);
      if ((((param_5 ^ 0xffffffff) & 0xff) == 0) || ((DAT_00d1ec80 & 1) == 0)) {
        if ((int)(uVar23 >> 0xf) == 0) {
                    /* try { // try from 0088f5d0 to 0088f5df has its CatchHandler @ 0088f750 */
          FUN_00875cac(*param_1,0x36,local_1dc,uVar23);
        }
        else {
          local_74 = 0;
          puStack_1b8 = local_1c0;
          puVar5 = local_198;
          if (local_190 != 0) {
            while (puVar5 != (void *)0x0) {
              pvVar27 = (void *)*puVar5;
              operator_delete(puVar5,0x20);
              puVar5 = pvVar27;
            }
            local_198 = (undefined8 *)0x0;
            if (local_1a0 != 0) {
              memset(pvStack_1a8,0,local_1a0 << 3);
            }
            local_190 = 0;
          }
                    /* try { // try from 0088f638 to 0088f657 has its CatchHandler @ 0088f750 */
          FUN_00875b54(*param_1,0x35,local_1dc,iVar30,0);
          FUN_00875d18(*param_1,0);
        }
      }
      else {
                    /* try { // try from 0088f154 to 0088f183 has its CatchHandler @ 0088f744 */
        uVar7 = FUN_00875680(*param_1,uVar23);
        FUN_00875b54(*param_1,0x5b,local_1dc,param_5,0);
        FUN_00875d18(*param_1,uVar7);
      }
    }
    else {
      lVar19 = lVar19 + uVar18 * 0x18;
      piVar9 = (int *)(lVar19 + -0x18);
      if ((piVar9 == (int *)0x0) || (*piVar9 != 0)) {
        iVar8 = 0;
      }
      else {
        iVar8 = -(uint)(*(int *)(*(long *)(lVar19 + -8) + 8) == DAT_00d1b030);
      }
      uVar38 = iVar6 + uVar33 + iVar8;
      if (uVar13 == 0) {
        uVar11 = *param_1;
        pcVar12 = "allocation: table array %d";
        uVar13 = uVar38;
LAB_0088f1e4:
        FUN_008769e0(uVar11,pcVar12,uVar13);
      }
      else {
        uVar11 = *param_1;
        if (uVar38 == 0) {
          pcVar12 = "allocation: table hash %d";
          goto LAB_0088f1e4;
        }
                    /* try { // try from 0088f1b4 to 0088f20b has its CatchHandler @ 0088f75c */
        FUN_008769e0(uVar11,"allocation: table hash %d array %d",uVar13,uVar38);
      }
      FUN_00875b54(*param_1,0x35,local_1dc,iVar30,0);
      FUN_00875d18(*param_1,uVar38);
    }
    iVar6 = *(int *)((long)param_1 + 0x64c);
    if (0xf < uVar33) {
      uVar33 = 0x10;
    }
    uVar38 = iVar6 + uVar33;
    if (0xff < uVar38) {
      if (*(long *)(lVar4 + 0x28) == local_70) {
                    /* try { // try from 0088f6c0 to 0088f6d7 has its CatchHandler @ 0088f754 */
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8(param_2 + 0xc,
                     "Out of registers when trying to allocate %d registers: exceeded limit %d",
                     uVar33,0xff);
      }
      goto LAB_0088f7cc;
    }
    *(uint *)((long)param_1 + 0x64c) = uVar38;
    uVar13 = *(uint *)(param_1 + 0xca);
    if (*(uint *)(param_1 + 0xca) <= uVar38) {
      uVar13 = uVar38;
    }
    *(uint *)(param_1 + 0xca) = uVar13;
    if (*(long *)(param_2 + 0x28) != 0) {
      uVar38 = 0;
      uVar18 = 0;
      uVar23 = 0;
      iVar30 = 1;
      do {
        lVar21 = *(long *)(param_2 + 0x20) + uVar18 * 0x18;
        lVar19 = *(long *)(lVar21 + 8);
        lVar21 = *(long *)(lVar21 + 0x10);
                    /* try { // try from 0088f2ac to 0088f2af has its CatchHandler @ 0088f764 */
        if ((((puStack_1b8 != local_1c0) && (lVar19 != 0)) && (*(int *)(lVar19 + 8) == DAT_00d1b000)
            ) && (iVar8 = FUN_00875070(*param_1,*(undefined8 *)(lVar19 + 0x20),
                                       *(undefined8 *)(lVar19 + 0x28)), local_1a0 != 0)) {
          uVar15 = (ulong)iVar8;
          bVar28 = POPCOUNT((char)local_1a0) + POPCOUNT((char)(local_1a0 >> 8)) +
                   POPCOUNT((char)(local_1a0 >> 0x10)) + POPCOUNT((char)(local_1a0 >> 0x18)) +
                   POPCOUNT((char)(local_1a0 >> 0x20)) + POPCOUNT((char)(local_1a0 >> 0x28)) +
                   POPCOUNT((char)(local_1a0 >> 0x30)) + POPCOUNT((char)(local_1a0 >> 0x38));
          if (bVar28 < 2) {
            uVar14 = local_1a0 - 1 & uVar15;
          }
          else {
            uVar14 = uVar15;
            if (local_1a0 <= uVar15) {
              uVar14 = 0;
              if (local_1a0 != 0) {
                uVar14 = uVar15 / local_1a0;
              }
              uVar14 = uVar15 - uVar14 * local_1a0;
            }
          }
          plVar24 = *(long **)((long)pvStack_1a8 + uVar14 * 8);
          if ((plVar24 != (long *)0x0) && (plVar24 = (long *)*plVar24, plVar24 != (long *)0x0)) {
            do {
              uVar16 = plVar24[1];
              if (uVar16 == uVar15) {
                if ((int)plVar24[2] == iVar8) {
                  if ((ulong)((long)puStack_1b8 - (long)local_1c0 >> 3) <= (ulong)plVar24[3]) {
                    if (*(long *)(lVar4 + 0x28) != local_70) goto LAB_0088f7cc;
                    /* try { // try from 0088f718 to 0088f71b has its CatchHandler @ 0088f740 */
                    FUN_00892760();
                    goto LAB_0088f71c;
                  }
                  if (-1 < (int)local_1c0[plVar24[3] * 2 + 1]) goto LAB_0088f260;
                  break;
                }
              }
              else {
                if (bVar28 < 2) {
                  uVar16 = uVar16 & local_1a0 - 1;
                }
                else if (local_1a0 <= uVar16) {
                  uVar3 = 0;
                  if (local_1a0 != 0) {
                    uVar3 = uVar16 / local_1a0;
                  }
                  uVar16 = uVar16 - uVar3 * local_1a0;
                }
                if (uVar16 != uVar14) break;
              }
              plVar24 = (long *)*plVar24;
            } while (plVar24 != (long *)0x0);
          }
        }
        if (0 < *(int *)((long)param_1 + 0xc)) {
                    /* try { // try from 0088f390 to 0088f3ef has its CatchHandler @ 0088f79c */
          FUN_00876644(*param_1,*(int *)(lVar21 + 0xc) + 1);
        }
        if (1 < *(int *)((long)param_1 + 0x14)) {
          FUN_00875b54(*param_1,0x45,0,0,0);
        }
        if (uVar38 == 0) {
LAB_0088f3f4:
          if (lVar19 == 0) {
            uVar38 = 0;
            goto LAB_0088f494;
          }
          local_1c8 = *(undefined4 *)((long)param_1 + 0x64c);
                    /* try { // try from 0088f404 to 0088f41b has its CatchHandler @ 0088f780 */
          local_1d0 = param_1;
          FUN_00891ba0(auStack_178,param_1,local_1dc,lVar19,&local_1d0);
                    /* try { // try from 0088f41c to 0088f47b has its CatchHandler @ 0088f788 */
          iVar8 = FUN_0088df20(param_1,lVar21);
          if (iVar8 < 0) {
            iVar8 = *(int *)((long)param_1 + 0x64c);
            uVar38 = iVar8 + 1;
            if (0xff < uVar38) {
              if (*(long *)(lVar4 + 0x28) == local_70) {
                    /* try { // try from 0088f694 to 0088f6ab has its CatchHandler @ 0088f760 */
                    /* WARNING: Subroutine does not return */
                FUN_0087fcd8(lVar21 + 0xc,
                             "Out of registers when trying to allocate %d registers: exceeded limit %d"
                             ,1,0xff);
              }
              goto LAB_0088f7cc;
            }
            *(uint *)((long)param_1 + 0x64c) = uVar38;
            uVar13 = *(uint *)(param_1 + 0xca);
            if (*(uint *)(param_1 + 0xca) <= uVar38) {
              uVar13 = uVar38;
            }
            *(uint *)(param_1 + 0xca) = uVar13;
            iVar8 = FUN_00891438(param_1,lVar21,iVar8,0xff);
          }
          FUN_00892774(param_1,auStack_178,iVar8,1,0);
          uVar38 = 0;
          *(undefined4 *)((long)local_1d0 + 0x64c) = local_1c8;
        }
        else {
          if ((lVar19 != 0) || (uVar38 == uVar33)) {
            FUN_00875b54(*param_1,0x37,local_1dc,iVar6,uVar38 + 1);
            FUN_00875d18(*param_1,iVar30);
            iVar30 = uVar38 + iVar30;
            goto LAB_0088f3f4;
          }
LAB_0088f494:
          if (uVar18 + 1 == *(long *)(param_2 + 0x28)) {
                    /* try { // try from 0088f4a8 to 0088f4b3 has its CatchHandler @ 0088f768 */
            uVar23 = FUN_00891d80(param_1,lVar21);
            uVar23 = uVar23 & 0xffffffff;
          }
          else {
            uVar7 = *(undefined4 *)((long)param_1 + 0x64c);
            *(uint *)((long)param_1 + 0x64c) = (uVar38 + iVar6 & 0xff) + 1;
                    /* try { // try from 0088f4cc to 0088f4db has its CatchHandler @ 0088f76c */
            FUN_0088d1d0(param_1,lVar21,uVar38 + iVar6,1);
            *(undefined4 *)((long)param_1 + 0x64c) = uVar7;
          }
          uVar38 = uVar38 + 1;
        }
LAB_0088f260:
        uVar18 = uVar18 + 1;
      } while (uVar18 < *(ulong *)(param_2 + 0x28));
      if (uVar38 != 0) {
        iVar8 = 0;
        if ((uVar23 & 1) == 0) {
          iVar8 = uVar38 + 1;
        }
                    /* try { // try from 0088f4f8 to 0088f53b has its CatchHandler @ 0088f758 */
        FUN_00875b54(*param_1,0x37,local_1dc,iVar6,iVar8);
        FUN_00875d18(*param_1,iVar30);
      }
    }
    pvVar27 = pvStack_1a8;
    puVar5 = local_198;
    if ((param_3 & 0xff) != (local_1dc & 0xff)) {
      FUN_00875b54(*param_1,6,param_3,local_1dc,0);
      pvVar27 = pvStack_1a8;
      puVar5 = local_198;
    }
    while (puVar5 != (undefined8 *)0x0) {
      puVar26 = (undefined8 *)*puVar5;
      pvStack_1a8 = pvVar27;
      operator_delete(puVar5,0x20);
      pvVar27 = pvStack_1a8;
      puVar5 = puVar26;
    }
    pvStack_1a8 = (void *)0x0;
    if (pvVar27 != (void *)0x0) {
      operator_delete(pvVar27,local_1a0 << 3);
    }
    if (local_1c0 != (undefined4 *)0x0) {
      puStack_1b8 = local_1c0;
      operator_delete(local_1c0,local_1b0 - (long)local_1c0);
    }
    *(uint *)((long)param_1 + 0x64c) = uVar29;
  }
  if (*(long *)(lVar4 + 0x28) == local_70) {
    return;
  }
LAB_0088f7cc:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

