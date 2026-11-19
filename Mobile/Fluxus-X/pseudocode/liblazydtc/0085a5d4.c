/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085a5d4
 */

/* WARNING: Removing unreachable block (ram,0x0085afbc) */
/* WARNING: Removing unreachable block (ram,0x0085af4c) */
/* WARNING: Removing unreachable block (ram,0x0085af84) */
/* WARNING: Removing unreachable block (ram,0x0085affc) */

undefined8 FUN_0085a5d4(long param_1)

{
  long **pplVar1;
  int iVar2;
  uint uVar3;
  undefined1 uVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  byte bVar9;
  undefined8 uVar10;
  long *plVar11;
  undefined8 *puVar12;
  long lVar13;
  long *plVar14;
  undefined8 *puVar15;
  long lVar16;
  undefined8 uVar17;
  long lVar18;
  long lVar19;
  long lVar20;
  long lVar21;
  ulong uVar22;
  int *piVar23;
  ulong uVar24;
  long lVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  long lVar28;
  ulong uVar29;
  undefined8 uVar30;
  int iVar31;
  long lVar32;
  undefined1 auVar33 [16];
  undefined8 local_1a0;
  undefined8 local_190;
  long local_170;
  ulong uStack_168;
  long local_160;
  ulong uStack_158;
  undefined4 local_150;
  undefined4 uStack_14c;
  undefined4 uStack_148;
  undefined4 uStack_144;
  long *local_140;
  long lStack_138;
  ulong local_130;
  long *local_128;
  long local_120;
  ulong local_118;
  undefined8 local_110;
  undefined8 uStack_108;
  undefined8 local_f8;
  undefined8 uStack_f0;
  undefined8 local_e8;
  undefined8 uStack_e0;
  ulong local_d8;
  undefined4 local_d0;
  undefined4 uStack_cc;
  undefined4 uStack_c8;
  undefined4 uStack_c4;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 local_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 local_88;
  undefined1 local_80;
  long local_78;
  
  lVar5 = tpidr_el0;
  local_78 = *(long *)(lVar5 + 0x28);
  uVar26 = *(undefined8 *)(param_1 + 0x94);
  FUN_00858f2c();
  FUN_00860d94(&local_a8,param_1,0);
  piVar23 = (int *)(param_1 + 0x90);
  local_e8._0_4_ = (undefined4)uVar26;
  uVar7 = (undefined4)local_e8;
  local_e8._4_4_ = (undefined4)((ulong)uVar26 >> 0x20);
  uVar8 = local_e8._4_4_;
  if (*piVar23 == 0x3d) {
    uVar30 = *(undefined8 *)(param_1 + 0x94);
    FUN_00858f2c(param_1);
    uVar26 = FUN_0086060c(param_1,0);
    if (*(int *)(param_1 + 0x90) == 0x2c) {
      FUN_00858f2c(param_1);
      uVar17 = *(undefined8 *)(param_1 + 0xb0);
    }
    else {
      FUN_0086e3b4(param_1,0x2c,"index range");
      uVar17 = 0xffffffffffffffff;
    }
    uVar10 = FUN_0086060c(param_1,0);
    iVar31 = *(int *)(param_1 + 0x90);
    if (iVar31 == 0x2c) {
      local_1a0 = *(undefined8 *)(param_1 + 0x94);
      FUN_00858f2c(param_1);
      local_190 = FUN_0086060c(param_1,0);
      iVar31 = *(int *)(param_1 + 0x90);
    }
    else {
      local_190 = 0;
      local_1a0 = 0xffffffffffffffff;
    }
    uStack_b8 = *(undefined8 *)(param_1 + 0xa8);
    uStack_c0 = *(undefined8 *)(param_1 + 0xa0);
    uStack_c8 = (undefined4)*(undefined8 *)(param_1 + 0x98);
    uStack_c4 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x98) >> 0x20);
    local_d0 = (undefined4)*(undefined8 *)piVar23;
    uStack_cc = (undefined4)((ulong)*(undefined8 *)piVar23 >> 0x20);
    if (iVar31 == 0x125) {
      FUN_00858f2c(param_1);
    }
    else {
      FUN_0086e3b4(param_1,0x125,"for loop");
    }
    lVar19 = *(long *)(param_1 + 0x1b8);
    lVar28 = *(long *)(param_1 + 0x1c0);
    *(int *)(*(long *)(param_1 + 0x160) + -4) = *(int *)(*(long *)(param_1 + 0x160) + -4) + 1;
    plVar11 = (long *)FUN_0086e18c(param_1 + 0x180,&local_a8);
    lVar25 = *(long *)(param_1 + 0x158);
    lVar18 = *(long *)(param_1 + 0x160);
    puVar12 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x40);
    lVar21 = *plVar11;
    uVar3 = *(uint *)(lVar18 + -4);
    *puVar12 = local_a8;
    puVar12[3] = lVar21;
    puVar12[4] = (lVar18 - lVar25 >> 3) + -1;
    puVar12[5] = (ulong)uVar3;
    *(undefined1 *)(puVar12 + 6) = local_80;
    puVar12[2] = uStack_98;
    puVar12[1] = local_a0;
    *(undefined1 *)((long)puVar12 + 0x31) = 0;
    puVar12[7] = local_90;
    *plVar11 = (long)puVar12;
    FUN_0086e2d0(param_1 + 0x1b8,plVar11);
    lVar18 = *(long *)(param_1 + 0x1b8);
    lVar20 = *(long *)(param_1 + 0x1c0);
    lVar32 = *plVar11;
    lVar13 = FUN_00859498(param_1);
    lVar21 = *(long *)(param_1 + 0x1b8);
    lVar25 = *(long *)(param_1 + 0x1c0);
    uVar24 = (ulong)(lVar20 - lVar18) >> 3 & 0xffffffff;
    uVar22 = lVar25 - lVar21 >> 3;
    if (uVar24 < uVar22) {
      do {
        uVar29 = uVar22 - 1;
        uVar27 = *(undefined8 *)(*(long *)(*(long *)(param_1 + 0x1b8) + uVar22 * 8 + -8) + 0x18);
        puVar12 = (undefined8 *)FUN_0086e18c(param_1 + 0x180);
        *puVar12 = uVar27;
        uVar22 = uVar29;
      } while (uVar24 < uVar29);
      lVar21 = *(long *)(param_1 + 0x1b8);
      lVar25 = *(long *)(param_1 + 0x1c0);
      uVar22 = lVar25 - lVar21 >> 3;
    }
    if (uVar24 < uVar22 || uVar24 - uVar22 == 0) {
      if (uVar24 < uVar22) {
        lVar25 = lVar21 + uVar24 * 8;
        *(long *)(param_1 + 0x1c0) = lVar25;
      }
    }
    else {
      FUN_00870174(param_1 + 0x1b8,uVar24 - uVar22);
      lVar21 = *(long *)(param_1 + 0x1b8);
      lVar25 = *(long *)(param_1 + 0x1c0);
    }
    uVar24 = (ulong)(lVar28 - lVar19) >> 3 & 0xffffffff;
    uVar22 = lVar25 - lVar21 >> 3;
    *(int *)(*(long *)(param_1 + 0x160) + -4) = *(int *)(*(long *)(param_1 + 0x160) + -4) + -1;
    if (uVar24 < uVar22) {
      do {
        uVar29 = uVar22 - 1;
        uVar27 = *(undefined8 *)(*(long *)(*(long *)(param_1 + 0x1b8) + uVar22 * 8 + -8) + 0x18);
        puVar12 = (undefined8 *)FUN_0086e18c(param_1 + 0x180);
        *puVar12 = uVar27;
        uVar22 = uVar29;
      } while (uVar24 < uVar29);
      lVar21 = *(long *)(param_1 + 0x1b8);
      uVar22 = *(long *)(param_1 + 0x1c0) - lVar21 >> 3;
    }
    if (uVar24 < uVar22 || uVar24 - uVar22 == 0) {
      if (uVar24 < uVar22) {
        *(ulong *)(param_1 + 0x1c0) = lVar21 + uVar24 * 8;
      }
    }
    else {
      FUN_00870174(param_1 + 0x1b8,uVar24 - uVar22);
    }
    uVar27 = *(undefined8 *)(param_1 + 0x9c);
    local_e8._0_4_ = local_d0;
    local_e8._4_4_ = uStack_cc;
    uStack_e0._0_4_ = uStack_c8;
    bVar9 = FUN_00861094(param_1,0x128,&local_e8);
    uStack_e0._0_4_ = (undefined4)uVar27;
    uStack_e0._4_4_ = (undefined4)((ulong)uVar27 >> 0x20);
    *(byte *)(lVar13 + 0x30) = bVar9 & 1;
    local_e8._0_4_ = uVar7;
    local_e8._4_4_ = uVar8;
    uVar27 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x60);
    FUN_0084ff54(uVar27,&local_e8,lVar32,uVar26,uVar10,local_190,lVar13,iVar31 == 0x125,
                 (ulong)&local_d0 | 4);
    if (*(char *)(param_1 + 0x68) == '\x01') {
      uVar26 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x24);
      FUN_00851f50(uVar26,local_88,uVar30,uVar17,local_1a0);
      local_e8._0_4_ = (undefined4)uVar27;
      local_e8._4_4_ = (undefined4)((ulong)uVar27 >> 0x20);
      puVar12 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_e8);
      *puVar12 = uVar26;
    }
    goto LAB_0085b010;
  }
  local_e8 = (long *)(param_1 + 0x300);
  local_f8 = 0;
  uStack_f0 = 0;
  uStack_e0 = (*(long *)(param_1 + 0x308) - *(long *)(param_1 + 0x300) >> 4) * -0x5555555555555555;
                    /* try { // try from 0085a698 to 0085a69f has its CatchHandler @ 0085b12c */
  FUN_00870aa0(local_e8,&local_a8);
  iVar31 = *piVar23;
  local_d8 = 1;
  if (iVar31 == 0x2c) {
    if (*(char *)(param_1 + 0x68) == '\x01') {
      local_128 = *(long **)(param_1 + 0x94);
                    /* try { // try from 0085a6c8 to 0085a6cf has its CatchHandler @ 0085b0fc */
      FUN_00858f2c(param_1);
                    /* try { // try from 0085a6d0 to 0085a6f3 has its CatchHandler @ 0085b0f4 */
      FUN_008614c0(&local_d0,param_1,&local_e8,0,&local_f8,&local_128,0,0);
    }
    else {
                    /* try { // try from 0085aa1c to 0085aa23 has its CatchHandler @ 0085b12c */
      FUN_00858f2c(param_1);
                    /* try { // try from 0085aa24 to 0085aa47 has its CatchHandler @ 0085b0ec */
      FUN_008614c0(&local_d0,param_1,&local_e8,0,0,0,0,0);
    }
    iVar31 = *piVar23;
  }
  uStack_108 = *(undefined8 *)(param_1 + 0x9c);
  local_110 = *(undefined8 *)(param_1 + 0x94);
  if (iVar31 == 0x12d) {
                    /* try { // try from 0085aa5c to 0085aa7b has its CatchHandler @ 0085b124 */
    FUN_00858f2c(param_1);
  }
  else {
    FUN_0086e3b4(param_1,0x12d,"for loop");
  }
  local_128 = (long *)(param_1 + 0x2a0);
  local_120 = *(long *)(param_1 + 0x2a8) - *(long *)(param_1 + 0x2a0) >> 3;
  local_130 = 0;
  lStack_138 = *(long *)(param_1 + 0x458) - *(long *)(param_1 + 0x450) >> 3;
  local_140 = (long *)(param_1 + 0x450);
  local_118 = 0;
  pplVar1 = &local_140;
  if (*(char *)(param_1 + 0x68) == '\0') {
    pplVar1 = (long **)0x0;
  }
                    /* try { // try from 0085aac0 to 0085aacb has its CatchHandler @ 0085b11c */
  FUN_00861848(param_1,&local_128,pplVar1);
  uStack_b8 = *(undefined8 *)(param_1 + 0xa8);
  uStack_c0 = *(undefined8 *)(param_1 + 0xa0);
  iVar2 = *piVar23;
  uStack_c8 = (undefined4)*(undefined8 *)(param_1 + 0x98);
  uStack_c4 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x98) >> 0x20);
  local_d0 = (undefined4)*(undefined8 *)piVar23;
  uStack_cc = (undefined4)((ulong)*(undefined8 *)piVar23 >> 0x20);
  if (iVar2 == 0x125) {
                    /* try { // try from 0085aae0 to 0085aaff has its CatchHandler @ 0085b114 */
    FUN_00858f2c(param_1);
    plVar11 = local_e8;
  }
  else {
    FUN_0086e3b4(param_1,0x125,"for loop");
    plVar11 = local_e8;
  }
  uVar22 = local_d8;
  lVar25 = *(long *)(param_1 + 0x1b8);
  lVar19 = *(long *)(param_1 + 0x1c0);
  *(int *)(*(long *)(param_1 + 0x160) + -4) = *(int *)(*(long *)(param_1 + 0x160) + -4) + 1;
  lVar18 = *(long *)(param_1 + 800);
  lVar21 = *(long *)(param_1 + 0x318);
  if (local_d8 == 0) {
    lVar28 = lVar19;
    lVar20 = lVar25;
  }
  else {
    lVar28 = uStack_e0 * 0x30;
    uVar24 = local_d8;
    local_e8 = plVar11;
    do {
      lVar32 = *plVar11;
                    /* try { // try from 0085ab54 to 0085abdb has its CatchHandler @ 0085b148 */
      plVar14 = (long *)FUN_0086e18c(param_1 + 0x180,lVar32 + lVar28);
      lVar20 = *(long *)(param_1 + 0x158);
      lVar13 = *(long *)(param_1 + 0x160);
      puVar15 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x40);
      puVar12 = (undefined8 *)(lVar32 + lVar28);
      lVar32 = *plVar14;
      uVar3 = *(uint *)(lVar13 + -4);
      uVar26 = puVar12[3];
      uVar4 = *(undefined1 *)(puVar12 + 5);
      *puVar15 = *puVar12;
      uVar17 = puVar12[2];
      uVar30 = puVar12[1];
      puVar15[3] = lVar32;
      puVar15[4] = (lVar13 - lVar20 >> 3) + -1;
      puVar15[5] = (ulong)uVar3;
      *(undefined1 *)(puVar15 + 6) = uVar4;
      *(undefined1 *)((long)puVar15 + 0x31) = 0;
      puVar15[2] = uVar17;
      puVar15[1] = uVar30;
      puVar15[7] = uVar26;
      *plVar14 = (long)puVar15;
      FUN_0086e2d0(param_1 + 0x1b8,plVar14);
      local_150 = (undefined4)*plVar14;
      uStack_14c = (undefined4)((ulong)*plVar14 >> 0x20);
      FUN_0086e2d0((long *)(param_1 + 0x318),&local_150);
      uVar24 = uVar24 - 1;
      lVar28 = lVar28 + 0x30;
    } while (uVar24 != 0);
    lVar28 = *(long *)(param_1 + 0x1c0);
    lVar20 = *(long *)(param_1 + 0x1b8);
    plVar11 = local_e8;
  }
                    /* try { // try from 0085ac00 to 0085ac07 has its CatchHandler @ 0085b138 */
  local_e8 = plVar11;
  lVar16 = FUN_00859498(param_1);
  lVar32 = *(long *)(param_1 + 0x1b8);
  lVar13 = *(long *)(param_1 + 0x1c0);
  uVar24 = (ulong)(lVar28 - lVar20) >> 3 & 0xffffffff;
  uVar29 = lVar13 - lVar32 >> 3;
  if (uVar24 < uVar29) {
    do {
      uVar26 = *(undefined8 *)(*(long *)(*(long *)(param_1 + 0x1b8) + uVar29 * 8 + -8) + 0x18);
                    /* try { // try from 0085ac38 to 0085ac3f has its CatchHandler @ 0085b144 */
      puVar12 = (undefined8 *)FUN_0086e18c(param_1 + 0x180);
      uVar29 = uVar29 - 1;
      *puVar12 = uVar26;
    } while (uVar24 < uVar29);
    lVar32 = *(long *)(param_1 + 0x1b8);
    lVar13 = *(long *)(param_1 + 0x1c0);
    uVar29 = lVar13 - lVar32 >> 3;
  }
  if (uVar24 < uVar29 || uVar24 - uVar29 == 0) {
    if (uVar24 < uVar29) {
      lVar13 = lVar32 + uVar24 * 8;
      *(long *)(param_1 + 0x1c0) = lVar13;
    }
  }
  else {
                    /* try { // try from 0085ac64 to 0085ac6b has its CatchHandler @ 0085b138 */
    FUN_00870174(param_1 + 0x1b8,uVar24 - uVar29);
    lVar32 = *(long *)(param_1 + 0x1b8);
    lVar13 = *(long *)(param_1 + 0x1c0);
  }
  uVar29 = lVar13 - lVar32 >> 3;
  uVar24 = (ulong)(lVar19 - lVar25) >> 3 & 0xffffffff;
  *(int *)(*(long *)(param_1 + 0x160) + -4) = *(int *)(*(long *)(param_1 + 0x160) + -4) + -1;
  if (uVar24 < uVar29) {
    do {
      uVar26 = *(undefined8 *)(*(long *)(*(long *)(param_1 + 0x1b8) + uVar29 * 8 + -8) + 0x18);
                    /* try { // try from 0085acb8 to 0085acbf has its CatchHandler @ 0085b140 */
      puVar12 = (undefined8 *)FUN_0086e18c(param_1 + 0x180);
      uVar29 = uVar29 - 1;
      *puVar12 = uVar26;
    } while (uVar24 < uVar29);
    lVar32 = *(long *)(param_1 + 0x1b8);
    uVar29 = *(long *)(param_1 + 0x1c0) - lVar32 >> 3;
  }
  if (uVar24 < uVar29 || uVar24 - uVar29 == 0) {
    if (uVar24 < uVar29) {
      *(ulong *)(param_1 + 0x1c0) = lVar32 + uVar24 * 8;
    }
  }
  else {
                    /* try { // try from 0085ace4 to 0085aceb has its CatchHandler @ 0085b138 */
    FUN_00870174(param_1 + 0x1b8,uVar24 - uVar29);
  }
  uVar30 = *(undefined8 *)(param_1 + 0x9c);
  local_150 = local_d0;
  uStack_14c = uStack_cc;
  uStack_148 = uStack_c8;
                    /* try { // try from 0085ad14 to 0085ad23 has its CatchHandler @ 0085b110 */
  bVar9 = FUN_00861094(param_1,0x128,&local_150);
  *(byte *)(lVar16 + 0x30) = bVar9 & 1;
  uVar26 = *(undefined8 *)(param_1 + 0xe8);
  uStack_148 = (undefined4)uVar30;
  uStack_144 = (undefined4)((ulong)uVar30 >> 0x20);
  local_150 = uVar7;
  uStack_14c = uVar8;
  if (uVar22 == 0) {
    local_160 = 0;
  }
  else {
    lVar25 = *(long *)(param_1 + 0x318);
                    /* try { // try from 0085ad44 to 0085ad4b has its CatchHandler @ 0085b10c */
    local_160 = FUN_0084e938(uVar26,uVar22 << 3);
    if ((uVar22 < 8) || ((ulong)((lVar21 + local_160) - (lVar25 + lVar18)) < 0x20)) {
      uVar24 = 0;
    }
    else {
      uVar24 = uVar22 & 0xfffffffffffffffc;
      puVar12 = (undefined8 *)(local_160 + 0x10);
      puVar15 = (undefined8 *)((lVar18 - lVar21) + lVar25 + 0x10);
      uVar29 = uVar24;
      do {
        puVar6 = puVar15 + -1;
        uVar30 = puVar15[-2];
        uVar10 = puVar15[1];
        uVar17 = *puVar15;
        uVar29 = uVar29 - 4;
        puVar15 = puVar15 + 4;
        puVar12[-1] = *puVar6;
        puVar12[-2] = uVar30;
        puVar12[1] = uVar10;
        *puVar12 = uVar17;
        puVar12 = puVar12 + 4;
      } while (uVar29 != 0);
      if (uVar22 == uVar24) goto LAB_0085ada0;
    }
    lVar19 = uVar22 - uVar24;
    puVar12 = (undefined8 *)(lVar25 + ((lVar18 + uVar24 * 8) - lVar21));
    puVar15 = (undefined8 *)(local_160 + uVar24 * 8);
    do {
      lVar19 = lVar19 + -1;
      *puVar15 = *puVar12;
      puVar12 = puVar12 + 1;
      puVar15 = puVar15 + 1;
    } while (lVar19 != 0);
  }
LAB_0085ada0:
  uVar24 = local_118;
  lVar25 = local_120;
  uStack_158 = uVar22;
  if (local_118 == 0) {
    local_170 = 0;
  }
  else {
    lVar19 = *local_128;
                    /* try { // try from 0085adbc to 0085ae57 has its CatchHandler @ 0085b13c */
    local_170 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),local_118 << 3);
    if ((uVar24 < 8) || (lVar28 = lVar25 * 8 + lVar19, (ulong)(local_170 - lVar28) < 0x20)) {
      uVar22 = 0;
    }
    else {
      uVar22 = uVar24 & 0xfffffffffffffffc;
      puVar12 = (undefined8 *)(local_170 + 0x10);
      puVar15 = (undefined8 *)(lVar28 + 0x10);
      uVar29 = uVar22;
      do {
        puVar6 = puVar15 + -1;
        uVar30 = puVar15[-2];
        uVar10 = puVar15[1];
        uVar17 = *puVar15;
        uVar29 = uVar29 - 4;
        puVar15 = puVar15 + 4;
        puVar12[-1] = *puVar6;
        puVar12[-2] = uVar30;
        puVar12[1] = uVar10;
        *puVar12 = uVar17;
        puVar12 = puVar12 + 4;
      } while (uVar29 != 0);
      if (uVar24 == uVar22) goto LAB_0085ae0c;
    }
    lVar28 = uVar24 - uVar22;
    puVar12 = (undefined8 *)(lVar19 + uVar22 * 8 + lVar25 * 8);
    puVar15 = (undefined8 *)(local_170 + uVar22 * 8);
    do {
      lVar28 = lVar28 + -1;
      *puVar15 = *puVar12;
      puVar12 = puVar12 + 1;
      puVar15 = puVar15 + 1;
    } while (lVar28 != 0);
  }
LAB_0085ae0c:
  uStack_168 = uVar24;
  uVar27 = FUN_0084e938(uVar26,0x70);
  FUN_00850054(uVar27,&local_150,&local_160,&local_170,lVar16,iVar31 == 0x12d,&local_110,
               iVar2 == 0x125,(ulong)&local_d0 | 4);
  if (*(char *)(param_1 + 0x68) == '\x01') {
    uVar26 = *(undefined8 *)(param_1 + 0xe8);
                    /* try { // try from 0085ae68 to 0085ae73 has its CatchHandler @ 0085b108 */
    auVar33 = FUN_0086191c(param_1,&local_e8);
    uVar22 = local_130;
    lVar25 = lStack_138;
    if (local_130 == 0) {
      lVar19 = 0;
    }
    else {
      lVar28 = *local_140;
                    /* try { // try from 0085ae94 to 0085af0f has its CatchHandler @ 0085b134 */
      lVar19 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),local_130 << 3);
      if ((uVar22 < 8) || (lVar20 = lVar25 * 8 + lVar28, (ulong)(lVar19 - lVar20) < 0x20)) {
        uVar24 = 0;
      }
      else {
        uVar24 = uVar22 & 0xfffffffffffffffc;
        puVar12 = (undefined8 *)(lVar19 + 0x10);
        puVar15 = (undefined8 *)(lVar20 + 0x10);
        uVar29 = uVar24;
        do {
          puVar6 = puVar15 + -1;
          uVar30 = puVar15[-2];
          uVar10 = puVar15[1];
          uVar17 = *puVar15;
          uVar29 = uVar29 - 4;
          puVar15 = puVar15 + 4;
          puVar12[-1] = *puVar6;
          puVar12[-2] = uVar30;
          puVar12[1] = uVar10;
          *puVar12 = uVar17;
          puVar12 = puVar12 + 4;
        } while (uVar29 != 0);
        if (uVar22 == uVar24) goto LAB_0085aee8;
      }
      lVar20 = uVar22 - uVar24;
      puVar12 = (undefined8 *)(lVar28 + uVar24 * 8 + lVar25 * 8);
      puVar15 = (undefined8 *)(lVar19 + uVar24 * 8);
      do {
        lVar20 = lVar20 + -1;
        *puVar15 = *puVar12;
        puVar12 = puVar12 + 1;
        puVar15 = puVar15 + 1;
      } while (lVar20 != 0);
    }
LAB_0085aee8:
    uVar26 = FUN_0084e938(uVar26,0x38);
    FUN_00851f70(uVar26,auVar33._0_8_,auVar33._8_8_,local_f8,uStack_f0,lVar19,uVar22);
    local_150 = (undefined4)uVar27;
    uStack_14c = (undefined4)((ulong)uVar27 >> 0x20);
                    /* try { // try from 0085af14 to 0085af1f has its CatchHandler @ 0085b104 */
    puVar12 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_150);
    *puVar12 = uVar26;
  }
  lVar25 = (lVar18 - lVar21) + *(long *)(param_1 + 0x318);
  if (lVar25 != *(long *)(param_1 + 800)) {
    *(long *)(param_1 + 800) = lVar25;
  }
  lVar25 = *local_140 + lStack_138 * 8;
  if (lVar25 != local_140[1]) {
    local_140[1] = lVar25;
  }
  lVar25 = *local_128 + local_120 * 8;
  if (lVar25 != local_128[1]) {
    local_128[1] = lVar25;
  }
  lVar25 = *local_e8 + uStack_e0 * 0x30;
  if (lVar25 != local_e8[1]) {
    local_e8[1] = lVar25;
  }
LAB_0085b010:
  if (*(long *)(lVar5 + 0x28) != local_78) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar27;
}

