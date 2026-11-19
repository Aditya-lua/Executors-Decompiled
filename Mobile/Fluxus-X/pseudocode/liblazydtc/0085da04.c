/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085da04
 */

undefined8 FUN_0085da04(long param_1,ulong *param_2,uint param_3,byte param_4)

{
  undefined4 *puVar1;
  undefined4 uVar2;
  uint uVar3;
  undefined1 uVar4;
  long lVar5;
  long *plVar6;
  int iVar7;
  int iVar8;
  undefined8 uVar9;
  ulong *puVar10;
  ulong *puVar11;
  long lVar12;
  size_t sVar13;
  undefined4 *puVar14;
  void *pvVar15;
  long lVar16;
  undefined8 uVar17;
  char *pcVar18;
  long lVar19;
  ulong uVar20;
  void *pvVar21;
  undefined8 *puVar22;
  int *piVar23;
  int *piVar24;
  undefined1 uVar25;
  ulong uVar26;
  undefined8 uVar27;
  undefined1 uVar28;
  char *pcVar29;
  undefined8 *puVar30;
  long lVar31;
  long lVar32;
  undefined1 local_230;
  ulong local_1d8;
  long local_1d0;
  ulong local_1c8;
  uint local_1bc;
  ulong local_1b8;
  char *local_1b0;
  undefined8 local_1a8;
  undefined8 uStack_1a0;
  long *local_198;
  long lStack_190;
  long local_188;
  char *local_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 local_168;
  void *local_160;
  undefined8 uStack_158;
  undefined8 local_150;
  void *pvStack_148;
  long local_140;
  long local_138;
  byte local_130;
  ulong local_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined1 local_110;
  undefined1 local_104 [8];
  undefined7 uStack_fc;
  undefined4 uStack_f5;
  ulong local_f0;
  undefined1 uStack_e8;
  undefined7 uStack_e7;
  undefined1 uStack_e0;
  undefined7 uStack_df;
  undefined1 local_d8;
  undefined7 uStack_d7;
  undefined1 uStack_d0;
  undefined7 uStack_cf;
  undefined4 uStack_c8;
  undefined4 uStack_c4;
  undefined1 uStack_c0;
  undefined7 uStack_bf;
  undefined1 local_b8;
  undefined7 uStack_b7;
  undefined8 uStack_b0;
  long local_a8;
  uint uStack_a0;
  undefined4 uStack_9c;
  undefined7 local_98;
  undefined1 uStack_91;
  undefined7 uStack_90;
  undefined7 local_88;
  undefined1 uStack_81;
  undefined7 uStack_80;
  long local_78;
  
  lVar5 = tpidr_el0;
  local_78 = *(long *)(lVar5 + 0x28);
  piVar23 = (int *)(param_1 + 0x90);
  if (*piVar23 == 0x119) {
    uStack_118 = *(undefined8 *)(param_1 + 0x9c);
    uStack_120 = *(undefined8 *)(param_1 + 0x94);
    uVar26 = *(ulong *)(param_1 + 0xa8);
    FUN_00858f2c(param_1);
  }
  else {
    FUN_0086e040(param_1,"class name");
    uStack_118 = *(undefined8 *)(param_1 + 0x9c);
    uStack_120 = *(undefined8 *)(param_1 + 0x94);
    uVar26 = *(ulong *)(param_1 + 0x138);
  }
  local_110 = 1;
  local_128 = uVar26;
  if (*piVar23 == 0x119) {
    uVar9 = 0;
    if (*(char **)(param_1 + 0xa8) != (char *)0x0) {
      iVar7 = strcmp(*(char **)(param_1 + 0xa8),"extends");
      if (iVar7 != 0) goto LAB_0085dab8;
      FUN_00858f2c(param_1);
      uVar9 = FUN_00864650(param_1);
    }
  }
  else {
LAB_0085dab8:
    uVar9 = 0;
  }
  if (param_3 == 0) {
    if (*(long *)(param_1 + 0x1a8) != 0) {
      uVar20 = (uVar26 >> 4 ^ uVar26 >> 9) * -0x61c8864680b583eb >>
               ((ulong)*(byte *)(param_1 + 0x1b0) & 0x3f);
      if ((*(ulong *)(*(long *)(param_1 + 0x198) + (uVar20 >> 6) * 8) >> (uVar20 & 0x3f) & 1) != 0)
      {
        do {
          if (*(ulong *)(*(long *)(param_1 + 0x180) + uVar20 * 0x10) == uVar26) {
            puVar22 = *(undefined8 **)(*(long *)(param_1 + 0x180) + uVar20 * 0x10 + 8);
            if (puVar22 != (undefined8 *)0x0) {
              uVar26 = puVar22[4];
              if (uVar26 < *(ulong *)(param_1 + 0x170)) {
                local_f0 = 0;
                uStack_e8 = 0;
                uStack_e7 = 0;
                local_160 = (void *)0x0;
                uStack_158 = 0;
                uVar17 = FUN_0085e984(param_1,param_1 + 0x94,&local_f0,&local_160,
                                      "Type function cannot assign to outer local \'%s\'",*puVar22);
                goto LAB_0085e714;
              }
              lVar12 = *(long *)(param_1 + 0x158);
              lVar19 = *(long *)(param_1 + 0x160);
              local_1d0 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x30);
              FUN_0084ece8(local_1d0,&uStack_120,puVar22,uVar26 != (lVar19 - lVar12 >> 3) - 1U);
              goto LAB_0085e7c8;
            }
            break;
          }
          uVar20 = uVar20 + 1 & *(long *)(param_1 + 0x1a0) - 1U;
        } while ((*(ulong *)(*(long *)(param_1 + 0x198) + (uVar20 >> 6) * 8) >> (uVar20 & 0x3f) & 1)
                 != 0);
      }
    }
    local_1d0 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x28);
    FUN_0084ed38(local_1d0,&uStack_120,&local_128);
LAB_0085e7c8:
    iVar7 = *(int *)(local_1d0 + 8);
    if (iVar7 == DAT_00d1b010) {
      local_1c8 = 0;
      if ((*(char *)(*(long *)(local_1d0 + 0x20) + 0x30) != '\x01') || (iVar7 == DAT_00d1b020))
      goto LAB_0085db68;
    }
    else if (iVar7 == DAT_00d1b020) {
      local_1c8 = 0;
      goto LAB_0085db68;
    }
    local_1c8 = 0;
    if ((iVar7 != DAT_00d1b060) && (iVar7 != DAT_00d1b050)) {
      local_1d0 = FUN_00864840(param_1,local_1d0);
      local_1c8 = 0;
    }
  }
  else {
    uStack_e0 = (undefined1)uStack_118;
    uStack_df = (undefined7)((ulong)uStack_118 >> 8);
    local_d8 = 0;
    uStack_d7 = 0;
    uStack_d0 = 0;
    uStack_cf = 0;
    uStack_e8 = (undefined1)uStack_120;
    uStack_e7 = (undefined7)((ulong)uStack_120 >> 8);
    local_f0 = local_128;
    uStack_c8 = CONCAT31(uStack_c8._1_3_,(param_3 & 0xfffffffe) == 2);
    puVar10 = (ulong *)FUN_0086e18c(param_1 + 0x180,&local_f0);
    lVar12 = *(long *)(param_1 + 0x158);
    lVar19 = *(long *)(param_1 + 0x160);
    puVar11 = (ulong *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x40);
    uVar26 = *puVar10;
    uVar3 = *(uint *)(lVar19 + -4);
    *puVar11 = local_f0;
    puVar11[3] = uVar26;
    puVar11[4] = (lVar19 - lVar12 >> 3) - 1;
    puVar11[5] = (ulong)uVar3;
    *(undefined1 *)(puVar11 + 6) = (undefined1)uStack_c8;
    puVar11[2] = CONCAT71(uStack_df,uStack_e0);
    puVar11[1] = CONCAT71(uStack_e7,uStack_e8);
    *(undefined1 *)((long)puVar11 + 0x31) = 0;
    puVar11[7] = CONCAT71(uStack_d7,local_d8);
    *puVar10 = (ulong)puVar11;
    FUN_0086e2d0(param_1 + 0x1b8,puVar10);
    local_1c8 = *puVar10;
    local_1d0 = 0;
  }
LAB_0085db68:
  local_198 = (long *)(param_1 + 0x3a8);
  local_130 = 0x40;
  lStack_190 = (*(long *)(param_1 + 0x3b0) - *(long *)(param_1 + 0x3a8) >> 3) * 0x2e8ba2e8ba2e8ba3;
  puVar22 = (undefined8 *)((ulong)&local_160 | 8);
  local_1b8 = 0;
  local_1d8 = 0;
  pvVar21 = (void *)((ulong)&local_f0 | 1);
  local_188 = 0;
  pvStack_148 = (void *)0x0;
  local_150 = 0;
  local_138 = 0;
  local_140 = 0;
  uStack_158 = 0;
  local_160 = (void *)0x0;
LAB_0085dc0c:
  do {
    pcVar18 = "Private class properties must begin with \'_\'";
    iVar7 = *piVar23;
    if (0x127 < iVar7) {
      if (iVar7 == 0x128) {
LAB_0085e470:
        if (0xff < local_1d8) {
                    /* try { // try from 0085e480 to 0085e4bf has its CatchHandler @ 0085e93c */
          FUN_00860ecc(param_1,&uStack_120,"Exceeded the maximum of %zu private fields in a class",
                       0xff);
        }
        if (0xff < local_1b8) {
          FUN_00860ecc(param_1,&uStack_120,"Exceeded the maximum of %zu private methods in a class",
                       0xff);
        }
        uVar17 = *(undefined8 *)(param_1 + 0x9c);
        if (*(int *)(param_1 + 0x90) == 0x128) {
                    /* try { // try from 0085e4d0 to 0085e4ef has its CatchHandler @ 0085e938 */
          FUN_00858f2c(param_1);
        }
        else {
          FUN_0086e3b4(param_1,0x128,"class");
        }
        lVar19 = local_188;
        lVar12 = lStack_190;
        uVar27 = *(undefined8 *)(param_1 + 0xe8);
        local_f0 = *param_2;
        uStack_e8 = (undefined1)uVar17;
        uStack_e7 = (undefined7)((ulong)uVar17 >> 8);
        if (local_188 == 0) {
          lVar16 = 0;
        }
        else {
          lVar31 = *local_198;
                    /* try { // try from 0085e518 to 0085e51f has its CatchHandler @ 0085e940 */
          lVar16 = FUN_0084e938(uVar27,local_188 * 0x58);
          lVar32 = lVar16 + 8;
          lVar12 = lVar31 + lVar12 * 0x58 + 8;
          lVar31 = lVar19;
          do {
            iVar7 = *(int *)(lVar12 + -8);
            *(int *)(lVar32 + -8) = iVar7;
                    /* try { // try from 0085e54c to 0085e557 has its CatchHandler @ 0085e94c */
            (*(code *)(&PTR_LAB_00c4a6f8)[iVar7])(lVar32,lVar12);
            lVar31 = lVar31 + -1;
            lVar12 = lVar12 + 0x58;
            lVar32 = lVar32 + 0x58;
          } while (lVar31 != 0);
        }
                    /* try { // try from 0085e5e8 to 0085e61b has its CatchHandler @ 0085e940 */
        uVar17 = FUN_0084e938(uVar27,0x48);
        FUN_0085068c(uVar17,&local_f0,local_1d0,local_1c8,uVar9,lVar16,lVar19,param_3,param_4 & 1);
        if (local_160 != (void *)0x0) {
          operator_delete(local_160);
          local_160 = (void *)0x0;
          operator_delete(pvStack_148);
          *puVar22 = 0;
          puVar22[1] = 0;
          puVar22[2] = 0;
          operator_delete((void *)0x0);
          local_140 = 0;
          local_130 = 0x40;
        }
        operator_delete(pvStack_148);
        plVar6 = local_198;
        lVar19 = lStack_190 * 0x58;
        lVar12 = *local_198;
        piVar23 = (int *)local_198[1];
        if ((int *)(lVar19 + lVar12) != piVar23) {
          piVar24 = (int *)(lVar12 + lVar19);
          if ((int *)((long)piVar24 + ((long)piVar23 - (lVar19 + lVar12))) != piVar23) {
            lVar16 = (long)piVar23 - lVar12;
            do {
              if (lVar16 != lVar19) {
                piVar24 = (int *)(lVar12 + lVar19);
                    /* try { // try from 0085e6c4 to 0085e6cb has its CatchHandler @ 0085e944 */
                (*(code *)(&PTR_LAB_00c4a6d8)[*piVar24])(piVar24 + 2);
                iVar7 = *(int *)(lVar12 + lVar16);
                *piVar24 = iVar7;
                (*(code *)(&PTR_LAB_00c4a6e8)[iVar7])(piVar24 + 2,(int *)(lVar12 + lVar16) + 2);
              }
              lVar12 = lVar12 + 0x58;
            } while ((int *)(lVar12 + lVar16) != piVar23);
            piVar24 = (int *)(lVar12 + lVar19);
            piVar23 = (int *)plVar6[1];
          }
          for (; piVar23 != piVar24; piVar23 = piVar23 + -0x16) {
                    /* try { // try from 0085e700 to 0085e707 has its CatchHandler @ 0085e948 */
            (*(code *)(&PTR_LAB_00c4a6d8)[piVar23[-0x16]])(piVar23 + -0x14);
          }
          plVar6[1] = (long)piVar24;
        }
LAB_0085e714:
        if (*(long *)(lVar5 + 0x28) == local_78) {
          return uVar17;
        }
LAB_0085e980:
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      if (iVar7 != 299) goto LAB_0085dcd8;
      uVar25 = 0;
      uVar28 = 0;
      local_1bc = 0;
LAB_0085dc94:
      uStack_178 = *(undefined8 *)(param_1 + 0x98);
      local_180 = *(char **)piVar23;
      local_168 = *(undefined8 *)(param_1 + 0xa8);
      uStack_170 = *(undefined8 *)(param_1 + 0xa0);
                    /* try { // try from 0085dc9c to 0085dca3 has its CatchHandler @ 0085e928 */
      FUN_00858f2c(param_1);
      if (*piVar23 == 0x119) {
        uStack_1a0 = *(undefined8 *)(param_1 + 0x9c);
        local_1a8 = *(undefined8 *)(param_1 + 0x94);
        pcVar29 = *(char **)(param_1 + 0xa8);
                    /* try { // try from 0085dcc8 to 0085dccf has its CatchHandler @ 0085e924 */
        FUN_00858f2c(param_1);
      }
      else {
                    /* try { // try from 0085dd2c to 0085dd3b has its CatchHandler @ 0085e924 */
        FUN_0086e040(param_1,"method name");
        local_1a8 = *(undefined8 *)(param_1 + 0x94);
        pcVar29 = *(char **)(param_1 + 0x138);
        uStack_1a0 = local_1a8;
      }
      local_f0 = 0;
      uStack_e8 = 0;
      uStack_e7 = 0;
      *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) =
           *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) + 1;
      uVar4 = *(undefined1 *)(param_1 + 0x178);
      *(undefined1 *)(param_1 + 0x178) = 1;
                    /* try { // try from 0085dd68 to 0085dd8b has its CatchHandler @ 0085e920 */
      local_1b0 = pcVar29;
      lVar12 = FUN_00863248(param_1,0,&local_180,&local_1b0,0,&local_f0,0,0);
      *(undefined1 *)(param_1 + 0x178) = uVar4;
      *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) =
           *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) + -1;
      if (*(long *)(lVar12 + 0x60) != 0) {
        puVar30 = (undefined8 *)**(undefined8 **)(lVar12 + 0x58);
        pcVar29 = (char *)*puVar30;
        if (((pcVar29 != (char *)0x0) && (iVar7 = strcmp(pcVar29,"self"), iVar7 == 0)) &&
           (lVar19 = puVar30[7], lVar19 != 0)) {
                    /* try { // try from 0085ddd4 to 0085dde7 has its CatchHandler @ 0085e92c */
          FUN_00860ecc(param_1,lVar19 + 0xc,"The \'self\' parameter cannot have a type annotation");
        }
      }
      pcVar29 = local_1b0;
      if (local_1bc == 0) {
        if (*local_1b0 == '_') {
          if (local_1b0[1] != '_') {
            pcVar29 = "%s";
            pcVar18 = "Public class properties cannot begin with \'_\'";
            goto LAB_0085df10;
          }
          sVar13 = strlen(local_1b0);
          if (0xfffffffffffffff7 < sVar13) {
            if (*(long *)(lVar5 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0085e8a8 to 0085e8ab has its CatchHandler @ 0085e8ec */
              FUN_007fe124();
            }
            goto LAB_0085e980;
          }
          if (sVar13 < 0x17) {
            local_f0 = CONCAT71(local_f0._1_7_,(char)((int)sVar13 << 1));
            pvVar15 = pvVar21;
            if (sVar13 != 0) goto LAB_0085deb4;
          }
          else {
            uVar26 = 0x1a;
            if ((sVar13 | 7) != 0x17) {
              uVar26 = (sVar13 | 7) + 1;
            }
                    /* try { // try from 0085de98 to 0085de9f has its CatchHandler @ 0085e8cc */
            pvVar15 = operator_new(uVar26);
            uStack_e8 = (undefined1)sVar13;
            uStack_e7 = (undefined7)(sVar13 >> 8);
            uStack_e0 = SUB81(pvVar15,0);
            uStack_df = (undefined7)((ulong)pvVar15 >> 8);
            local_f0 = uVar26 | 1;
LAB_0085deb4:
            memmove(pvVar15,pcVar29,sVar13);
          }
          *(undefined1 *)((long)pvVar15 + sVar13) = 0;
          lVar19 = FUN_00871a60(&DAT_00d1ee98,&local_f0);
          if ((local_f0 & 1) != 0) {
            operator_delete((void *)CONCAT71(uStack_df,uStack_e0),local_f0 & 0xfffffffffffffffe);
          }
          pcVar18 = local_1b0;
          if (lVar19 != 0) {
            pcVar29 = "Classes cannot define \'%s\' as a metamethod";
            goto LAB_0085df10;
          }
          sVar13 = strlen(local_1b0);
          if (0xfffffffffffffff7 < sVar13) {
            if (*(long *)(lVar5 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0085e8c0 to 0085e8c3 has its CatchHandler @ 0085e8c8 */
              FUN_007fe124();
            }
            goto LAB_0085e980;
          }
          if (sVar13 < 0x17) {
            local_f0 = CONCAT71(local_f0._1_7_,(char)((int)sVar13 << 1));
            pvVar15 = pvVar21;
            if (sVar13 != 0) goto LAB_0085e11c;
          }
          else {
            uVar26 = 0x1a;
            if ((sVar13 | 7) != 0x17) {
              uVar26 = (sVar13 | 7) + 1;
            }
                    /* try { // try from 0085e0fc to 0085e103 has its CatchHandler @ 0085e8c4 */
            pvVar15 = operator_new(uVar26);
            local_f0 = uVar26 | 1;
            uStack_e8 = (undefined1)sVar13;
            uStack_e7 = (undefined7)(sVar13 >> 8);
            uStack_e0 = SUB81(pvVar15,0);
            uStack_df = (undefined7)((ulong)pvVar15 >> 8);
LAB_0085e11c:
            memmove(pvVar15,pcVar18,sVar13);
          }
          *(undefined1 *)((long)pvVar15 + sVar13) = 0;
          lVar19 = FUN_00871a60(&DAT_00d1ee70,&local_f0);
          if ((local_f0 & 1) != 0) {
            operator_delete((void *)CONCAT71(uStack_df,uStack_e0),local_f0 & 0xfffffffffffffffe);
          }
          if (lVar19 == 0) {
            pcVar29 = "Cannot use \'%s\' as a method name: names starting with \'__\' are reserved";
            pcVar18 = local_1b0;
            goto LAB_0085df10;
          }
        }
      }
      else {
        if (*local_1b0 == '_') {
          if (local_1b0[1] != '_') goto LAB_0085df20;
          pcVar29 = "%s";
          pcVar18 = "Private class properties cannot start with \'__\'";
        }
        else {
          pcVar29 = "%s";
        }
LAB_0085df10:
                    /* try { // try from 0085df10 to 0085df1f has its CatchHandler @ 0085e914 */
        FUN_00860ecc(param_1,&local_1a8,pcVar29,pcVar18);
      }
LAB_0085df20:
      if ((local_138 != 0) &&
         (uVar26 = ((ulong)local_1b0 >> 4 ^ (ulong)local_1b0 >> 9) * -0x61c8864680b583eb >>
                   ((ulong)local_130 & 0x3f),
         (*(ulong *)((long)pvStack_148 + (uVar26 >> 6) * 8) >> (uVar26 & 0x3f) & 1) != 0)) {
        do {
          if (*(char **)((long)local_160 + uVar26 * 8) == local_1b0) {
                    /* try { // try from 0085e098 to 0085e0af has its CatchHandler @ 0085e92c */
            FUN_00860ecc(param_1,&local_1a8,"Duplicate class member \'%s\'");
            goto LAB_0085dc0c;
          }
          uVar26 = uVar26 + 1 & local_140 - 1U;
        } while ((*(ulong *)((long)pvStack_148 + (uVar26 >> 6) * 8) >> (uVar26 & 0x3f) & 1) != 0);
      }
                    /* try { // try from 0085df94 to 0085df9f has its CatchHandler @ 0085e92c */
      FUN_00864920(&local_160,&local_1b0);
      plVar6 = local_198;
      local_f0 = CONCAT44(local_f0._4_4_,1);
      uVar17 = *(undefined8 *)((ulong)&local_180 | 4);
      ((undefined8 *)((ulong)local_104 | 3))[1] = ((undefined8 *)((ulong)&local_180 | 4))[1];
      *(undefined8 *)((ulong)local_104 | 3) = uVar17;
      uStack_b0 = uStack_1a0;
      local_b8 = (undefined1)local_1a8;
      uStack_b7 = (undefined7)((ulong)local_1a8 >> 8);
      uStack_e7 = local_88;
      uStack_e0 = uStack_81;
      uStack_df = uStack_80;
      uStack_cf = uStack_fc;
      uStack_d7 = local_104._0_7_;
      uStack_d0 = local_104[7];
      uStack_c8 = uStack_f5;
      uStack_c0 = SUB81(local_1b0,0);
      uStack_bf = (undefined7)((ulong)local_1b0 >> 8);
      uStack_a0 = local_1bc;
      puVar1 = (undefined4 *)local_198[1];
      uStack_e8 = uVar28;
      local_d8 = uVar25;
      local_a8 = lVar12;
      if (puVar1 < (undefined4 *)local_198[2]) {
        *puVar1 = 1;
        puVar14 = puVar1 + 0x16;
        *(ulong *)(puVar1 + 4) = CONCAT71(uStack_80,uStack_81);
        *(ulong *)(puVar1 + 2) = CONCAT71(local_88,uVar28);
        *(ulong *)(puVar1 + 0x14) = CONCAT44(uStack_9c,local_1bc);
        *(long *)(puVar1 + 0x12) = lVar12;
        *(undefined8 *)(puVar1 + 0x10) = uStack_1a0;
        *(undefined8 *)(puVar1 + 0xe) = local_1a8;
        *(char **)(puVar1 + 0xc) = local_1b0;
        *(ulong *)(puVar1 + 10) = CONCAT44(uStack_c4,uStack_f5);
        *(ulong *)(puVar1 + 8) = CONCAT71(uStack_fc,uStack_d0);
        *(ulong *)(puVar1 + 6) = CONCAT71(uStack_d7,uVar25);
        local_198[1] = (long)puVar14;
      }
      else {
                    /* try { // try from 0085e050 to 0085e05f has its CatchHandler @ 0085e8f4 */
        puVar14 = (undefined4 *)FUN_00871764(local_198,&local_f0);
      }
      plVar6[1] = (long)puVar14;
      local_188 = local_188 + 1;
                    /* try { // try from 0085e07c to 0085e083 has its CatchHandler @ 0085e91c */
      (*(code *)(&PTR_LAB_00c4a6d8)[(int)local_f0])(&uStack_e8);
      local_1b8 = local_1b8 + local_1bc;
      goto LAB_0085dc0c;
    }
    if (iVar7 != 0x119) {
      if (iVar7 == 0) goto LAB_0085e470;
LAB_0085dcd8:
                    /* try { // try from 0085dcd8 to 0085dcef has its CatchHandler @ 0085e950 */
      FUN_00860ecc(param_1,param_1 + 0x94,
                   "Only class properties and functions can be declared within a class");
      FUN_00858f2c(param_1);
      goto LAB_0085dc0c;
    }
    pcVar29 = *(char **)(param_1 + 0xa8);
    if (pcVar29 == (char *)0x0) goto LAB_0085dcd8;
    iVar7 = strcmp(pcVar29,"public");
    if (iVar7 == 0) {
      uVar28 = *(undefined1 *)(param_1 + 0x94);
      local_88 = (undefined7)*(undefined8 *)(param_1 + 0x95);
      uStack_81 = (undefined1)*(undefined8 *)(param_1 + 0x9c);
      uStack_80 = (undefined7)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 8);
                    /* try { // try from 0085dd0c to 0085dd13 has its CatchHandler @ 0085e934 */
      FUN_00858f2c(param_1);
      local_1bc = 0;
    }
    else {
      iVar8 = strcmp(pcVar29,"private");
      if (iVar8 != 0) goto LAB_0085dcd8;
      uVar28 = *(undefined1 *)(param_1 + 0x94);
      local_88 = (undefined7)*(undefined8 *)(param_1 + 0x95);
      uStack_81 = (undefined1)*(undefined8 *)(param_1 + 0x9c);
      uStack_80 = (undefined7)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 8);
                    /* try { // try from 0085dc64 to 0085dc6b has its CatchHandler @ 0085e934 */
      FUN_00858f2c(param_1);
      local_1bc = 1;
    }
    if (*piVar23 == 299) {
      uVar25 = 1;
      goto LAB_0085dc94;
    }
    if (*piVar23 == 0x119) {
      uStack_170 = *(undefined8 *)(param_1 + 0x9c);
      uStack_178 = *(undefined8 *)(param_1 + 0x94);
      pcVar29 = *(char **)(param_1 + 0xa8);
                    /* try { // try from 0085e194 to 0085e19b has its CatchHandler @ 0085e930 */
      FUN_00858f2c(param_1);
      local_168 = CONCAT71(local_168._1_7_,1);
      local_180 = pcVar29;
      if (*piVar23 == 0x3a) {
        uVar25 = *(undefined1 *)(param_1 + 0x94);
        local_98 = (undefined7)*(undefined8 *)(param_1 + 0x95);
        uStack_91 = (undefined1)*(undefined8 *)(param_1 + 0x9c);
        uStack_90 = (undefined7)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 8);
                    /* try { // try from 0085e1c8 to 0085e21f has its CatchHandler @ 0085e918 */
        FUN_00858f2c(param_1);
        local_f0 = *(ulong *)(param_1 + 0x94);
        uVar17 = 0;
        uVar2 = *(undefined4 *)(param_1 + 0x124);
        uStack_e8 = (undefined1)*(undefined8 *)(param_1 + 0x9c);
        uStack_e7 = (undefined7)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 8);
        if ((*(int *)(param_1 + 0x90) != 0x26) && (*(int *)(param_1 + 0x90) != 0x7c)) {
          uVar17 = FUN_008695d4(param_1,0,0);
          *(undefined4 *)(param_1 + 0x124) = uVar2;
        }
        lVar12 = FUN_00867310(param_1,uVar17,&local_f0);
        *(undefined4 *)(param_1 + 0x124) = uVar2;
        local_230 = 1;
      }
      else {
        uVar25 = 0;
        lVar12 = 0;
        local_230 = 0;
      }
      if (iVar7 == 0) {
        if (*local_180 != '_') {
LAB_0085e2bc:
          if ((local_138 != 0) &&
             (uVar26 = ((ulong)local_180 >> 4 ^ (ulong)local_180 >> 9) * -0x61c8864680b583eb >>
                       ((ulong)local_130 & 0x3f),
             (*(ulong *)((long)pvStack_148 + (uVar26 >> 6) * 8) >> (uVar26 & 0x3f) & 1) != 0)) {
            do {
              if (*(char **)((long)local_160 + uVar26 * 8) == local_180) {
                pcVar29 = "Duplicate class member \'%s\'";
                pcVar18 = local_180;
                goto LAB_0085e458;
              }
              uVar26 = uVar26 + 1 & local_140 - 1U;
            } while ((*(ulong *)((long)pvStack_148 + (uVar26 >> 6) * 8) >> (uVar26 & 0x3f) & 1) != 0
                    );
          }
          FUN_00864920(&local_160,&local_180);
          plVar6 = local_198;
          uStack_e7 = local_88;
          local_f0 = local_f0 & 0xffffffff00000000;
          local_d8 = SUB81(local_180,0);
          uStack_d7 = (undefined7)((ulong)local_180 >> 8);
          uStack_e0 = uStack_81;
          uStack_df = uStack_80;
          if (iVar7 != 0) {
            local_1d8 = local_1d8 + 1;
          }
          uStack_bf = local_98;
          uStack_b0 = CONCAT71(uStack_b0._1_7_,local_230);
          uStack_c8 = (undefined4)uStack_170;
          uStack_c4 = (undefined4)((ulong)uStack_170 >> 0x20);
          uStack_d0 = (undefined1)uStack_178;
          uStack_cf = (undefined7)((ulong)uStack_178 >> 8);
          local_b8 = uStack_91;
          uStack_b7 = uStack_90;
          uStack_a0 = local_1bc;
          puVar1 = (undefined4 *)local_198[1];
          uStack_e8 = uVar28;
          uStack_c0 = uVar25;
          local_a8 = lVar12;
          if (puVar1 < (undefined4 *)local_198[2]) {
            *puVar1 = 0;
            puVar14 = puVar1 + 0x16;
            *(ulong *)(puVar1 + 4) = CONCAT71(uStack_80,uStack_81);
            *(ulong *)(puVar1 + 2) = CONCAT71(local_88,uVar28);
            *(ulong *)(puVar1 + 0x14) = CONCAT44(uStack_9c,local_1bc);
            *(long *)(puVar1 + 0x12) = lVar12;
            *(undefined8 *)(puVar1 + 0x10) = uStack_b0;
            *(ulong *)(puVar1 + 0xe) = CONCAT71(uStack_90,uStack_91);
            *(ulong *)(puVar1 + 0xc) = CONCAT71(local_98,uVar25);
            *(undefined8 *)(puVar1 + 10) = uStack_170;
            *(undefined8 *)(puVar1 + 8) = uStack_178;
            *(char **)(puVar1 + 6) = local_180;
            local_198[1] = (long)puVar14;
          }
          else {
                    /* try { // try from 0085e400 to 0085e40f has its CatchHandler @ 0085e8d0 */
            puVar14 = (undefined4 *)FUN_00871764(local_198,&local_f0);
          }
          plVar6[1] = (long)puVar14;
          local_188 = local_188 + 1;
                    /* try { // try from 0085e430 to 0085e437 has its CatchHandler @ 0085e8f0 */
          (*(code *)(&PTR_LAB_00c4a6d8)[(int)local_f0])(&uStack_e8);
          goto LAB_0085dc0c;
        }
        if (local_180[1] == '_') {
                    /* try { // try from 0085e2a0 to 0085e337 has its CatchHandler @ 0085e910 */
          FUN_00860ecc(param_1,&uStack_178,"Class properties cannot start with \'__\'");
          goto LAB_0085dc0c;
        }
        pcVar29 = "%s";
        pcVar18 = "Public class properties cannot begin with \'_\'";
      }
      else if (*local_180 != '_') {
        pcVar29 = "%s";
      }
      else {
        if (local_180[1] != '_') goto LAB_0085e2bc;
        pcVar29 = "%s";
        pcVar18 = "Private class properties cannot start with \'__\'";
      }
LAB_0085e458:
                    /* try { // try from 0085e458 to 0085e46b has its CatchHandler @ 0085e910 */
      FUN_00860ecc(param_1,&uStack_178,pcVar29,pcVar18);
      goto LAB_0085dc0c;
    }
                    /* try { // try from 0085e240 to 0085e24f has its CatchHandler @ 0085e930 */
    FUN_0086e040(param_1,"class property name");
  } while( true );
}

