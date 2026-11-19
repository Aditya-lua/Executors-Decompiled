/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085b410
 */

/* WARNING: Removing unreachable block (ram,0x0085bc34) */
/* WARNING: Removing unreachable block (ram,0x0085bbc0) */
/* WARNING: Removing unreachable block (ram,0x0085bbf8) */
/* WARNING: Removing unreachable block (ram,0x0085bc74) */

long * FUN_0085b410(long param_1,long *param_2,undefined8 param_3,undefined8 param_4,long param_5,
                   uint param_6,undefined8 *param_7)

{
  long **pplVar1;
  void *pvVar2;
  uint uVar3;
  undefined1 uVar4;
  long lVar5;
  undefined8 *puVar6;
  int iVar7;
  ulong uVar8;
  long lVar9;
  long *plVar10;
  undefined8 *puVar11;
  long *plVar12;
  undefined8 *puVar13;
  undefined4 uVar14;
  ulong uVar15;
  long lVar16;
  void *pvVar17;
  long lVar18;
  long lVar19;
  void *pvVar20;
  ulong uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  long lVar24;
  long lVar25;
  void *pvVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined1 auVar30 [16];
  long local_130;
  void *pvStack_128;
  long local_120;
  void *pvStack_118;
  long *local_110;
  undefined8 uStack_108;
  long *local_100;
  long local_f8;
  ulong local_f0;
  undefined8 local_e8;
  undefined8 uStack_e0;
  long *local_d8;
  void *local_d0;
  void *pvStack_c8;
  undefined8 local_c0;
  undefined4 uStack_b8;
  int iStack_b4;
  void *local_b0;
  undefined8 uStack_a8;
  long *local_a0;
  undefined8 uStack_98;
  long *local_90;
  undefined8 uStack_88;
  undefined1 local_80;
  long local_70;
  
  lVar5 = tpidr_el0;
  local_70 = *(long *)(lVar5 + 0x28);
  local_a0 = param_2;
  uStack_98 = param_3;
  if ((param_6 & 1) == 0) {
    FUN_00858f2c(param_1);
  }
  if ((DAT_00d1ec80 == '\x01') && (uVar8 = FUN_00863160(param_1), (uVar8 & 1) != 0)) {
    if ((*(char **)(param_1 + 0xa8) == (char *)0x0) ||
       (iVar7 = strcmp(*(char **)(param_1 + 0xa8),"open"), iVar7 != 0)) {
      uVar23 = 0;
    }
    else {
      FUN_00858f2c(param_1);
      uVar23 = 1;
    }
    FUN_00858f2c(param_1);
    if (*(long *)(param_5 + 8) != 0) {
      FUN_00860ecc(param_1,&local_a0,"Attributes are not supported on class declarations");
    }
    uVar14 = 1;
    if ((param_6 & 1) != 0) {
      uVar14 = 2;
    }
    plVar12 = (long *)FUN_0085da04(param_1,&local_a0,uVar14,uVar23);
    goto LAB_0085bc88;
  }
  if (*(int *)(param_1 + 0x90) == 299) {
    uVar23 = *(undefined8 *)(param_1 + 0x90);
    uStack_a8 = *(undefined8 *)(param_1 + 0xa8);
    local_b0 = *(void **)(param_1 + 0xa0);
    uStack_b8 = (undefined4)*(undefined8 *)(param_1 + 0x98);
    iStack_b4 = (int)((ulong)*(undefined8 *)(param_1 + 0x98) >> 0x20);
    local_c0._0_4_ = (uint)uVar23;
    local_c0._4_4_ = (int)((ulong)uVar23 >> 0x20);
    FUN_00858f2c(param_1);
    uVar23 = CONCAT44(uStack_b8,local_c0._4_4_);
    if (local_c0._4_4_ == (int)param_2) {
      uStack_b8 = (undefined4)((ulong)param_2 >> 0x20);
    }
    if (*(int *)(param_1 + 0x90) == 0x119) {
      pvStack_c8 = *(void **)(param_1 + 0x9c);
      local_d0 = *(void **)(param_1 + 0x94);
      local_d8 = *(long **)(param_1 + 0xa8);
      FUN_00858f2c(param_1);
    }
    else {
      FUN_0086e040(param_1,"variable name");
      local_d0 = *(void **)(param_1 + 0x94);
      local_d8 = *(long **)(param_1 + 0x138);
      pvStack_c8 = local_d0;
    }
    uVar22 = param_4;
    if ((param_6 & 1) == 0) {
      uVar22 = 0xffffffffffffffff;
    }
    *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) = *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) + 1;
    auVar30 = FUN_00863248(param_1,0,&local_c0,&local_d8,&local_d8,param_5,param_6 & 1,0);
    *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) = *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) + -1
    ;
    local_f8 = *(long *)(auVar30._0_8_ + 0x14);
    local_100 = param_2;
    plVar12 = (long *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x40);
    FUN_008503a4(plVar12,&local_100,auVar30._8_8_,auVar30._0_8_,param_6 & 1,uVar22);
    if (*(char *)(param_1 + 0x68) != '\x01') goto LAB_0085bc88;
    uVar22 = *(undefined8 *)(param_1 + 0xe8);
    if (param_7 == (undefined8 *)0x0) {
      uVar22 = FUN_0084e938(uVar22,0x28);
      FUN_00852014(uVar22,param_4,uVar23);
    }
    else {
      uVar8 = param_7[2];
      if (uVar8 == 0) {
        lVar9 = 0;
      }
      else {
        lVar19 = param_7[1];
        lVar24 = *(long *)*param_7;
        lVar9 = FUN_0084e938(uVar22,uVar8 << 3);
        if ((uVar8 < 8) || (lVar16 = lVar19 * 8 + lVar24, (ulong)(lVar9 - lVar16) < 0x20)) {
          uVar15 = 0;
        }
        else {
          uVar15 = uVar8 & 0xfffffffffffffffc;
          puVar13 = (undefined8 *)(lVar9 + 0x10);
          puVar11 = (undefined8 *)(lVar16 + 0x10);
          uVar21 = uVar15;
          do {
            puVar6 = puVar11 + -1;
            uVar27 = puVar11[-2];
            uVar29 = puVar11[1];
            uVar28 = *puVar11;
            uVar21 = uVar21 - 4;
            puVar11 = puVar11 + 4;
            puVar13[-1] = *puVar6;
            puVar13[-2] = uVar27;
            puVar13[1] = uVar29;
            *puVar13 = uVar28;
            puVar13 = puVar13 + 4;
          } while (uVar21 != 0);
          if (uVar8 == uVar15) goto LAB_0085bac0;
        }
        lVar16 = uVar8 - uVar15;
        puVar13 = (undefined8 *)(lVar24 + uVar15 * 8 + lVar19 * 8);
        puVar11 = (undefined8 *)(lVar9 + uVar15 * 8);
        do {
          lVar16 = lVar16 + -1;
          *puVar11 = *puVar13;
          puVar13 = puVar13 + 1;
          puVar11 = puVar11 + 1;
        } while (lVar16 != 0);
      }
LAB_0085bac0:
      uVar22 = FUN_0084e938(uVar22,0x28);
      FUN_0085202c(uVar22,lVar9,uVar8,param_4,uVar23);
    }
    local_90 = plVar12;
    puVar13 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_90);
    *puVar13 = uVar22;
    goto LAB_0085bc88;
  }
  if (*(long *)(param_5 + 8) != 0) {
    local_d8 = (long *)0x0;
    local_d0 = (void *)0x0;
    local_100 = (long *)0x0;
    local_f8 = 0;
    FUN_008521fc(&local_c0);
    pvVar2 = local_b0;
    if (((uint)local_c0 & 1) == 0) {
      pvVar2 = (void *)((long)&local_c0 + 1);
    }
                    /* try { // try from 0085b524 to 0085b53f has its CatchHandler @ 0085bdbc */
    plVar12 = (long *)FUN_0085e984(param_1,param_1 + 0x94,&local_d8,&local_100,
                                   "Expected \'function\' after local declaration with attribute, but got %s instead"
                                   ,pvVar2);
    if (((uint)local_c0 & 1) != 0) {
      operator_delete(local_b0,CONCAT44(local_c0._4_4_,(uint)local_c0) & 0xfffffffffffffffe);
    }
    goto LAB_0085bc88;
  }
  local_e8 = 0;
  uStack_e0 = 0;
  *(int *)(*(long *)(param_1 + 0x1e8) + 0xf4) = *(int *)(*(long *)(param_1 + 0x1e8) + 0xf4) + 1;
  local_d0 = (void *)((*(long *)(param_1 + 0x308) - *(long *)(param_1 + 0x300) >> 4) *
                     -0x5555555555555555);
  local_d8 = (long *)(param_1 + 0x300);
  pvStack_c8 = (void *)0x0;
  if (*(char *)(param_1 + 0x68) == '\x01') {
                    /* try { // try from 0085b6cc to 0085b6ef has its CatchHandler @ 0085bda8 */
    FUN_008614c0(&local_c0,param_1,&local_d8,0,&local_e8,0,0,param_6 & 1);
  }
  else {
                    /* try { // try from 0085b714 to 0085b737 has its CatchHandler @ 0085bda0 */
    FUN_008614c0(&local_c0,param_1,&local_d8,0,0,0,0,param_6 & 1);
  }
  local_100 = (long *)(param_1 + 0x450);
  local_90 = (long *)((ulong)local_90 & 0xffffffffffffff00);
  local_80 = 0;
  *(int *)(*(long *)(param_1 + 0x1e8) + 0xf4) = *(int *)(*(long *)(param_1 + 0x1e8) + 0xf4) + -1;
  lVar9 = *(long *)(param_1 + 0x2a8) - *(long *)(param_1 + 0x2a0);
  local_c0 = (long *)(param_1 + 0x2a0);
  lVar19 = *(long *)(param_1 + 0x318);
  local_f8 = *(long *)(param_1 + 0x458) - *(long *)(param_1 + 0x450) >> 3;
  uStack_b8 = (undefined4)(lVar9 >> 3);
  iStack_b4 = (int)(lVar9 >> 0x23);
  local_b0 = (void *)0x0;
  lVar9 = *(long *)(param_1 + 800);
  local_f0 = 0;
  if (*(int *)(param_1 + 0x90) == 0x3d) {
    uStack_88 = *(undefined8 *)(param_1 + 0x9c);
    local_90 = *(long **)(param_1 + 0x94);
    local_80 = 1;
                    /* try { // try from 0085b7bc to 0085b7df has its CatchHandler @ 0085bdb4 */
    FUN_00858f2c(param_1);
    pplVar1 = &local_100;
    if (*(char *)(param_1 + 0x68) == '\0') {
      pplVar1 = (long **)0x0;
    }
    FUN_00861848(param_1,&local_c0,pplVar1);
  }
  pvVar2 = pvStack_c8;
  plVar12 = local_d8;
  if (pvStack_c8 != (void *)0x0) {
    lVar24 = (long)local_d0 * 0x30;
    pvVar26 = pvStack_c8;
    do {
      lVar25 = *plVar12;
                    /* try { // try from 0085b804 to 0085b88b has its CatchHandler @ 0085bde4 */
      plVar10 = (long *)FUN_0086e18c(param_1 + 0x180,lVar25 + lVar24);
      lVar16 = *(long *)(param_1 + 0x158);
      lVar18 = *(long *)(param_1 + 0x160);
      puVar11 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x40);
      puVar13 = (undefined8 *)(lVar25 + lVar24);
      lVar25 = *plVar10;
      uVar3 = *(uint *)(lVar18 + -4);
      uVar23 = puVar13[3];
      uVar4 = *(undefined1 *)(puVar13 + 5);
      *puVar11 = *puVar13;
      uVar27 = puVar13[2];
      uVar22 = puVar13[1];
      puVar11[3] = lVar25;
      puVar11[4] = (lVar18 - lVar16 >> 3) + -1;
      puVar11[5] = (ulong)uVar3;
      *(undefined1 *)(puVar11 + 6) = uVar4;
      *(undefined1 *)((long)puVar11 + 0x31) = 0;
      puVar11[2] = uVar27;
      puVar11[1] = uVar22;
      puVar11[7] = uVar23;
      *plVar10 = (long)puVar11;
      FUN_0086e2d0(param_1 + 0x1b8,plVar10);
      local_110 = (long *)*plVar10;
      FUN_0086e2d0((long *)(param_1 + 0x318),&local_110);
      pvVar26 = (void *)((long)pvVar26 - 1);
      lVar24 = lVar24 + 0x30;
    } while (pvVar26 != (void *)0x0);
  }
  pvVar26 = local_b0;
  if (local_b0 == (void *)0x0) {
    lVar24 = param_1 + 0xb0;
  }
  else {
    lVar24 = *(long *)(local_c0[1] + -8) + 0xc;
  }
  uStack_108 = *(undefined8 *)(lVar24 + 8);
  uVar23 = *(undefined8 *)(param_1 + 0xe8);
  local_110 = param_2;
  if (pvVar2 == (void *)0x0) {
    local_120 = 0;
  }
  else {
    lVar24 = *(long *)(param_1 + 0x318);
                    /* try { // try from 0085b930 to 0085b93b has its CatchHandler @ 0085bdb0 */
    local_120 = FUN_0084e938(uVar23,(long)pvVar2 << 3);
    if ((pvVar2 < (void *)0x8) || ((ulong)((lVar19 + local_120) - (lVar24 + lVar9)) < 0x20)) {
      pvVar17 = (void *)0x0;
    }
    else {
      pvVar17 = (void *)((ulong)pvVar2 & 0xfffffffffffffffc);
      puVar13 = (undefined8 *)(local_120 + 0x10);
      puVar11 = (undefined8 *)((lVar9 - lVar19) + lVar24 + 0x10);
      pvVar20 = pvVar17;
      do {
        puVar6 = puVar11 + -1;
        uVar22 = puVar11[-2];
        uVar28 = puVar11[1];
        uVar27 = *puVar11;
        pvVar20 = (void *)((long)pvVar20 - 4);
        puVar11 = puVar11 + 4;
        puVar13[-1] = *puVar6;
        puVar13[-2] = uVar22;
        puVar13[1] = uVar28;
        *puVar13 = uVar27;
        puVar13 = puVar13 + 4;
      } while (pvVar20 != (void *)0x0);
      if (pvVar2 == pvVar17) goto LAB_0085b994;
    }
    lVar16 = (long)pvVar2 - (long)pvVar17;
    puVar13 = (undefined8 *)(lVar24 + ((lVar9 + (long)pvVar17 * 8) - lVar19));
    puVar11 = (undefined8 *)(local_120 + (long)pvVar17 * 8);
    do {
      lVar16 = lVar16 + -1;
      *puVar11 = *puVar13;
      puVar13 = puVar13 + 1;
      puVar11 = puVar11 + 1;
    } while (lVar16 != 0);
  }
LAB_0085b994:
  pvStack_118 = pvVar2;
  if (pvVar26 == (void *)0x0) {
    local_130 = 0;
  }
  else {
    lVar24 = CONCAT44(iStack_b4,uStack_b8);
    lVar16 = *local_c0;
                    /* try { // try from 0085b9ac to 0085ba27 has its CatchHandler @ 0085bde0 */
    local_130 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),(long)pvVar26 << 3);
    if ((pvVar26 < (void *)0x8) ||
       (lVar18 = lVar24 * 8 + lVar16, (ulong)(local_130 - lVar18) < 0x20)) {
      pvVar17 = (void *)0x0;
    }
    else {
      pvVar17 = (void *)((ulong)pvVar26 & 0xfffffffffffffffc);
      puVar13 = (undefined8 *)(local_130 + 0x10);
      puVar11 = (undefined8 *)(lVar18 + 0x10);
      pvVar20 = pvVar17;
      do {
        puVar6 = puVar11 + -1;
        uVar22 = puVar11[-2];
        uVar28 = puVar11[1];
        uVar27 = *puVar11;
        pvVar20 = (void *)((long)pvVar20 - 4);
        puVar11 = puVar11 + 4;
        puVar13[-1] = *puVar6;
        puVar13[-2] = uVar22;
        puVar13[1] = uVar28;
        *puVar13 = uVar27;
        puVar13 = puVar13 + 4;
      } while (pvVar20 != (void *)0x0);
      if (pvVar26 == pvVar17) goto LAB_0085b9fc;
    }
    lVar18 = (long)pvVar26 - (long)pvVar17;
    puVar13 = (undefined8 *)(lVar16 + (long)pvVar17 * 8 + lVar24 * 8);
    puVar11 = (undefined8 *)(local_130 + (long)pvVar17 * 8);
    do {
      lVar18 = lVar18 + -1;
      *puVar11 = *puVar13;
      puVar13 = puVar13 + 1;
      puVar11 = puVar11 + 1;
    } while (lVar18 != 0);
  }
LAB_0085b9fc:
  pvStack_128 = pvVar26;
  plVar12 = (long *)FUN_0084e938(uVar23,0x70);
  FUN_0084fe44(plVar12,&local_110,&local_120,&local_130,&local_90,param_6 & 1);
  if (*(char *)(param_1 + 0x68) == '\x01') {
    uVar23 = *(undefined8 *)(param_1 + 0xe8);
                    /* try { // try from 0085ba38 to 0085ba43 has its CatchHandler @ 0085bd9c */
    auVar30 = FUN_0086191c(param_1,&local_d8);
    uVar8 = local_f0;
    lVar24 = local_f8;
    if (local_f0 == 0) {
      lVar16 = 0;
    }
    else {
      lVar18 = *local_100;
                    /* try { // try from 0085ba68 to 0085ba6b has its CatchHandler @ 0085bdb8 */
      lVar16 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),local_f0 << 3);
      if ((uVar8 < 8) || (lVar25 = lVar24 * 8 + lVar18, (ulong)(lVar16 - lVar25) < 0x20)) {
        uVar15 = 0;
      }
      else {
        uVar15 = uVar8 & 0xfffffffffffffffc;
        puVar13 = (undefined8 *)(lVar16 + 0x10);
        puVar11 = (undefined8 *)(lVar25 + 0x10);
        uVar21 = uVar15;
        do {
          puVar6 = puVar11 + -1;
          uVar22 = puVar11[-2];
          uVar28 = puVar11[1];
          uVar27 = *puVar11;
          uVar21 = uVar21 - 4;
          puVar11 = puVar11 + 4;
          puVar13[-1] = *puVar6;
          puVar13[-2] = uVar22;
          puVar13[1] = uVar28;
          *puVar13 = uVar27;
          puVar13 = puVar13 + 4;
        } while (uVar21 != 0);
        if (uVar8 == uVar15) goto LAB_0085bb00;
      }
      lVar25 = uVar8 - uVar15;
      puVar13 = (undefined8 *)(lVar18 + uVar15 * 8 + lVar24 * 8);
      puVar11 = (undefined8 *)(lVar16 + uVar15 * 8);
      do {
        lVar25 = lVar25 + -1;
        *puVar11 = *puVar13;
        puVar13 = puVar13 + 1;
        puVar11 = puVar11 + 1;
      } while (lVar25 != 0);
    }
LAB_0085bb00:
                    /* try { // try from 0085bb00 to 0085bb27 has its CatchHandler @ 0085bdb8 */
    uVar23 = FUN_0084e938(uVar23,0x38);
    FUN_00851f34(uVar23,auVar30._0_8_,auVar30._8_8_,local_e8,uStack_e0,lVar16,uVar8);
                    /* try { // try from 0085bb2c to 0085bb37 has its CatchHandler @ 0085bd98 */
    local_110 = plVar12;
    puVar13 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_110);
    *puVar13 = uVar23;
  }
  if ((param_6 & 1) != 0) {
    if (pvVar26 == (void *)0x0) {
      if (pvVar2 != (void *)0x0) goto LAB_0085bb88;
    }
    else {
      iVar7 = *(int *)(*(long *)(local_c0[1] + -8) + 8);
      if (((iVar7 != DAT_00d1b040) && (iVar7 != DAT_00d1b030)) && (pvVar26 != pvVar2)) {
LAB_0085bb88:
                    /* try { // try from 0085bb88 to 0085bb9b has its CatchHandler @ 0085bd94 */
        FUN_00860ecc(param_1,(long)plVar12 + 0xc,"Missing initializer in const declaration");
      }
    }
  }
  lVar24 = *local_100 + local_f8 * 8;
  if (lVar24 != local_100[1]) {
    local_100[1] = lVar24;
  }
  lVar24 = *local_c0 + CONCAT44(iStack_b4,uStack_b8) * 8;
  if (lVar24 != local_c0[1]) {
    local_c0[1] = lVar24;
  }
  lVar9 = (lVar9 - lVar19) + *(long *)(param_1 + 0x318);
  if (lVar9 != *(long *)(param_1 + 800)) {
    *(long *)(param_1 + 800) = lVar9;
  }
  lVar9 = *local_d8 + (long)local_d0 * 0x30;
  if (lVar9 != local_d8[1]) {
    local_d8[1] = lVar9;
  }
LAB_0085bc88:
  if (*(long *)(lVar5 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return plVar12;
}

