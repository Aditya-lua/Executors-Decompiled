/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085cdc0
 */

/* WARNING: Removing unreachable block (ram,0x0085d354) */
/* WARNING: Removing unreachable block (ram,0x0085d2e0) */
/* WARNING: Removing unreachable block (ram,0x0085d318) */
/* WARNING: Removing unreachable block (ram,0x0085d390) */

undefined8 FUN_0085cdc0(long param_1,long param_2)

{
  long *plVar1;
  long *plVar2;
  int iVar3;
  long lVar4;
  undefined8 *puVar5;
  long *plVar6;
  undefined8 *puVar7;
  long lVar8;
  long **pplVar9;
  ulong uVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  undefined8 *puVar14;
  ulong uVar15;
  long lVar16;
  ulong uVar17;
  undefined8 uVar18;
  long lVar19;
  long lVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  long lVar23;
  ulong uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  long local_f8;
  long local_d8;
  ulong uStack_d0;
  long local_c8;
  ulong uStack_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  long *local_a8;
  long lStack_a0;
  ulong local_98;
  long *local_90;
  long local_88;
  ulong local_80;
  long local_78;
  long local_70;
  
  lVar4 = tpidr_el0;
  local_70 = *(long *)(lVar4 + 0x28);
  iVar3 = *(int *)(param_2 + 8);
  local_78 = param_2;
  if ((((iVar3 != DAT_00d1b010) || (*(char *)(*(long *)(param_2 + 0x20) + 0x30) == '\x01')) &&
      (iVar3 != DAT_00d1b020)) && ((iVar3 != DAT_00d1b060 && (iVar3 != DAT_00d1b050)))) {
    if (DAT_00d1ec40 == '\x01') {
      local_78 = FUN_00864840(param_1);
    }
    else {
      local_90 = (long *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),8);
      *local_90 = param_2;
      local_88 = 1;
      local_78 = FUN_008659e8(param_1,param_2 + 0xc,&local_90,
                              "Assigned expression must be a variable or a field");
    }
  }
  lVar23 = *(long *)(param_1 + 0x2a8);
  lVar8 = *(long *)(param_1 + 0x2a0);
  plVar1 = (long *)(param_1 + 0x2a0);
  lVar16 = *(long *)(param_1 + 0x458);
  lVar19 = *(long *)(param_1 + 0x450);
                    /* try { // try from 0085cec4 to 0085cecf has its CatchHandler @ 0085d4cc */
  FUN_00872064(plVar1,&local_78);
  plVar2 = (long *)(param_1 + 0x450);
  if (*(int *)(param_1 + 0x90) == 0x2c) {
    uVar17 = 0;
    uVar24 = 1;
    do {
      if (*(char *)(param_1 + 0x68) == '\x01') {
                    /* try { // try from 0085cf04 to 0085cf1b has its CatchHandler @ 0085d550 */
        FUN_00870ce4(plVar2,param_1 + 0x94);
        uVar17 = uVar17 + 1;
      }
      FUN_00858f2c(param_1);
                    /* try { // try from 0085cf1c to 0085cf8f has its CatchHandler @ 0085d554 */
      plVar6 = (long *)FUN_0085cb14(param_1,1);
      iVar3 = (int)plVar6[1];
      local_a8 = plVar6;
      if (((iVar3 != DAT_00d1b010) || (*(char *)(plVar6[4] + 0x30) == '\x01')) &&
         ((iVar3 != DAT_00d1b020 && ((iVar3 != DAT_00d1b060 && (iVar3 != DAT_00d1b050)))))) {
        if (DAT_00d1ec40 == '\x01') {
          local_a8 = (long *)FUN_00864840(param_1,plVar6);
        }
        else {
                    /* try { // try from 0085cf98 to 0085cfc3 has its CatchHandler @ 0085d54c */
          local_90 = (long *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),8);
          *local_90 = (long)plVar6;
          local_88 = 1;
          local_a8 = (long *)FUN_008659e8(param_1,(long)plVar6 + 0xc,&local_90,
                                          "Assigned expression must be a variable or a field");
        }
      }
                    /* try { // try from 0085cfc8 to 0085cfd3 has its CatchHandler @ 0085d554 */
      FUN_00872064(plVar1,&local_a8);
      uVar24 = uVar24 + 1;
    } while (*(int *)(param_1 + 0x90) == 0x2c);
    if (*(int *)(param_1 + 0x90) == 0x3d) goto LAB_0085d020;
LAB_0085cff4:
                    /* try { // try from 0085cff4 to 0085d027 has its CatchHandler @ 0085d4c8 */
    FUN_0086e3b4(param_1,0x3d,"assignment");
    uVar18 = 0xffffffffffffffff;
  }
  else {
    uVar17 = 0;
    uVar24 = 1;
    if (*(int *)(param_1 + 0x90) != 0x3d) goto LAB_0085cff4;
LAB_0085d020:
    FUN_00858f2c(param_1);
    uVar18 = *(undefined8 *)(param_1 + 0xb0);
  }
  local_90 = (long *)(param_1 + 0x2b8);
  local_88 = *(long *)(param_1 + 0x2c0) - *(long *)(param_1 + 0x2b8) >> 3;
  local_98 = 0;
  lStack_a0 = *(long *)(param_1 + 0x458) - *(long *)(param_1 + 0x450) >> 3;
  local_80 = 0;
  pplVar9 = &local_a8;
  if (*(char *)(param_1 + 0x68) == '\0') {
    pplVar9 = (long **)0x0;
  }
                    /* try { // try from 0085d06c to 0085d077 has its CatchHandler @ 0085d4c4 */
  local_a8 = plVar2;
  FUN_00861848(param_1,&local_90,pplVar9);
  plVar6 = local_90;
  uVar21 = *(undefined8 *)(param_1 + 0xe8);
  local_b8 = *(undefined8 *)(local_78 + 0xc);
  uStack_b0 = *(undefined8 *)(*(long *)(local_90[1] + -8) + 0x14);
  if (uVar24 == 0) {
    local_c8 = 0;
  }
  else {
    lVar20 = *plVar1;
                    /* try { // try from 0085d0a4 to 0085d0ab has its CatchHandler @ 0085d4c0 */
    local_c8 = FUN_0084e938(uVar21,uVar24 << 3);
    if ((uVar24 < 8) || ((ulong)((lVar8 + local_c8) - (lVar20 + lVar23)) < 0x20)) {
      uVar10 = 0;
    }
    else {
      uVar10 = uVar24 & 0xfffffffffffffffc;
      puVar7 = (undefined8 *)(local_c8 + 0x10);
      puVar14 = (undefined8 *)((lVar23 - lVar8) + lVar20 + 0x10);
      uVar15 = uVar10;
      do {
        puVar5 = puVar14 + -1;
        uVar22 = puVar14[-2];
        uVar26 = puVar14[1];
        uVar25 = *puVar14;
        uVar15 = uVar15 - 4;
        puVar14 = puVar14 + 4;
        puVar7[-1] = *puVar5;
        puVar7[-2] = uVar22;
        puVar7[1] = uVar26;
        *puVar7 = uVar25;
        puVar7 = puVar7 + 4;
      } while (uVar15 != 0);
      if (uVar24 == uVar10) goto LAB_0085d100;
    }
    lVar11 = uVar24 - uVar10;
    puVar7 = (undefined8 *)(lVar20 + ((lVar23 + uVar10 * 8) - lVar8));
    puVar14 = (undefined8 *)(local_c8 + uVar10 * 8);
    do {
      lVar11 = lVar11 + -1;
      *puVar14 = *puVar7;
      puVar7 = puVar7 + 1;
      puVar14 = puVar14 + 1;
    } while (lVar11 != 0);
  }
LAB_0085d100:
  uVar10 = local_80;
  lVar20 = local_88;
  uStack_c0 = uVar24;
  if (local_80 == 0) {
    local_d8 = 0;
  }
  else {
    lVar11 = *plVar6;
                    /* try { // try from 0085d11c to 0085d18f has its CatchHandler @ 0085d4d4 */
    local_d8 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),local_80 << 3);
    if ((uVar10 < 8) || (lVar12 = lVar20 * 8 + lVar11, (ulong)(local_d8 - lVar12) < 0x20)) {
      uVar24 = 0;
    }
    else {
      uVar24 = uVar10 & 0xfffffffffffffffc;
      puVar7 = (undefined8 *)(local_d8 + 0x10);
      puVar14 = (undefined8 *)(lVar12 + 0x10);
      uVar15 = uVar24;
      do {
        puVar5 = puVar14 + -1;
        uVar22 = puVar14[-2];
        uVar26 = puVar14[1];
        uVar25 = *puVar14;
        uVar15 = uVar15 - 4;
        puVar14 = puVar14 + 4;
        puVar7[-1] = *puVar5;
        puVar7[-2] = uVar22;
        puVar7[1] = uVar26;
        *puVar7 = uVar25;
        puVar7 = puVar7 + 4;
      } while (uVar15 != 0);
      if (uVar10 == uVar24) goto LAB_0085d16c;
    }
    lVar12 = uVar10 - uVar24;
    puVar7 = (undefined8 *)(lVar11 + uVar24 * 8 + lVar20 * 8);
    puVar14 = (undefined8 *)(local_d8 + uVar24 * 8);
    do {
      lVar12 = lVar12 + -1;
      *puVar14 = *puVar7;
      puVar7 = puVar7 + 1;
      puVar14 = puVar14 + 1;
    } while (lVar12 != 0);
  }
LAB_0085d16c:
  uStack_d0 = uVar10;
  uVar21 = FUN_0084e938(uVar21,0x40);
  FUN_00850184(uVar21,&local_b8,&local_c8,&local_d8);
  if (*(char *)(param_1 + 0x68) != '\x01') goto LAB_0085d2bc;
  uVar22 = *(undefined8 *)(param_1 + 0xe8);
  if (uVar17 == 0) {
    local_f8 = 0;
  }
  else {
    lVar20 = *plVar2;
                    /* try { // try from 0085d1ac to 0085d1b3 has its CatchHandler @ 0085d4b8 */
    local_f8 = FUN_0084e938(uVar22,uVar17 << 3);
    if ((uVar17 < 8) || ((ulong)((lVar19 + local_f8) - (lVar20 + lVar16)) < 0x20)) {
      uVar24 = 0;
    }
    else {
      uVar24 = uVar17 & 0xfffffffffffffffc;
      puVar7 = (undefined8 *)(local_f8 + 0x10);
      puVar14 = (undefined8 *)((lVar16 - lVar19) + lVar20 + 0x10);
      uVar10 = uVar24;
      do {
        puVar5 = puVar14 + -1;
        uVar25 = puVar14[-2];
        uVar27 = puVar14[1];
        uVar26 = *puVar14;
        uVar10 = uVar10 - 4;
        puVar14 = puVar14 + 4;
        puVar7[-1] = *puVar5;
        puVar7[-2] = uVar25;
        puVar7[1] = uVar27;
        *puVar7 = uVar26;
        puVar7 = puVar7 + 4;
      } while (uVar10 != 0);
      if (uVar17 == uVar24) goto LAB_0085d20c;
    }
    lVar11 = uVar17 - uVar24;
    puVar7 = (undefined8 *)(lVar20 + ((lVar16 + uVar24 * 8) - lVar19));
    puVar14 = (undefined8 *)(local_f8 + uVar24 * 8);
    do {
      lVar11 = lVar11 + -1;
      *puVar14 = *puVar7;
      puVar7 = puVar7 + 1;
      puVar14 = puVar14 + 1;
    } while (lVar11 != 0);
  }
LAB_0085d20c:
  uVar24 = local_98;
  lVar20 = lStack_a0;
  if (local_98 == 0) {
    lVar11 = 0;
  }
  else {
    lVar12 = *local_a8;
                    /* try { // try from 0085d228 to 0085d2a3 has its CatchHandler @ 0085d4d0 */
    lVar11 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),local_98 << 3);
    if ((uVar24 < 8) || (lVar13 = lVar20 * 8 + lVar12, (ulong)(lVar11 - lVar13) < 0x20)) {
      uVar10 = 0;
    }
    else {
      uVar10 = uVar24 & 0xfffffffffffffffc;
      puVar7 = (undefined8 *)(lVar11 + 0x10);
      puVar14 = (undefined8 *)(lVar13 + 0x10);
      uVar15 = uVar10;
      do {
        puVar5 = puVar14 + -1;
        uVar25 = puVar14[-2];
        uVar27 = puVar14[1];
        uVar26 = *puVar14;
        uVar15 = uVar15 - 4;
        puVar14 = puVar14 + 4;
        puVar7[-1] = *puVar5;
        puVar7[-2] = uVar25;
        puVar7[1] = uVar27;
        *puVar7 = uVar26;
        puVar7 = puVar7 + 4;
      } while (uVar15 != 0);
      if (uVar24 == uVar10) goto LAB_0085d27c;
    }
    lVar13 = uVar24 - uVar10;
    puVar7 = (undefined8 *)(lVar12 + uVar10 * 8 + lVar20 * 8);
    puVar14 = (undefined8 *)(lVar11 + uVar10 * 8);
    do {
      lVar13 = lVar13 + -1;
      *puVar14 = *puVar7;
      puVar7 = puVar7 + 1;
      puVar14 = puVar14 + 1;
    } while (lVar13 != 0);
  }
LAB_0085d27c:
  uVar22 = FUN_0084e938(uVar22,0x30);
  FUN_00851fb4(uVar22,local_f8,uVar17,uVar18,lVar11,uVar24);
                    /* try { // try from 0085d2a8 to 0085d2b3 has its CatchHandler @ 0085d4bc */
  local_b8 = uVar21;
  puVar7 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_b8);
  *puVar7 = uVar22;
LAB_0085d2bc:
  lVar20 = *local_a8 + lStack_a0 * 8;
  if (lVar20 != local_a8[1]) {
    local_a8[1] = lVar20;
  }
  lVar20 = *plVar6 + local_88 * 8;
  if (lVar20 != plVar6[1]) {
    plVar6[1] = lVar20;
  }
  lVar16 = (lVar16 - lVar19) + *(long *)(param_1 + 0x450);
  if (lVar16 != *(long *)(param_1 + 0x458)) {
    *(long *)(param_1 + 0x458) = lVar16;
  }
  lVar8 = (lVar23 - lVar8) + *(long *)(param_1 + 0x2a0);
  if (lVar8 != *(long *)(param_1 + 0x2a8)) {
    *(long *)(param_1 + 0x2a8) = lVar8;
  }
  if (*(long *)(lVar4 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar21;
}

