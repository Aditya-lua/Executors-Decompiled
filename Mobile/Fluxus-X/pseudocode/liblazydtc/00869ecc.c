/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00869ecc
 */

/* WARNING: Removing unreachable block (ram,0x0086a5e4) */
/* WARNING: Removing unreachable block (ram,0x0086a56c) */
/* WARNING: Removing unreachable block (ram,0x0086a5a8) */
/* WARNING: Removing unreachable block (ram,0x0086a620) */

undefined8 * FUN_00869ecc(long param_1)

{
  long *plVar1;
  long *plVar2;
  ulong uVar3;
  void *pvVar4;
  int iVar5;
  byte bVar6;
  long lVar7;
  undefined8 *puVar8;
  undefined4 uVar9;
  ulong uVar10;
  undefined8 *puVar11;
  char *pcVar12;
  undefined8 *puVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  long lVar17;
  ulong uVar18;
  undefined1 *puVar19;
  long lVar20;
  undefined8 *puVar21;
  ulong uVar22;
  undefined8 *puVar23;
  long lVar24;
  undefined1 *puVar25;
  ulong uVar26;
  long lVar27;
  long lVar28;
  long lVar29;
  long lVar30;
  ulong uVar31;
  undefined8 uVar32;
  long *plVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  long local_f8;
  ulong local_f0;
  undefined8 local_e8;
  ulong uStack_e0;
  void *local_d8;
  undefined8 *local_d0;
  undefined8 uStack_c8;
  long local_c0;
  ulong uStack_b8;
  undefined8 *local_b0;
  ulong uStack_a8;
  undefined8 *local_a0;
  ulong uStack_98;
  undefined8 uStack_90;
  undefined8 local_88;
  long local_80;
  ulong uStack_78;
  long local_70;
  
  local_f8 = 0;
  local_f0 = 0;
  lVar7 = tpidr_el0;
  local_70 = *(long *)(lVar7 + 0x28);
  uVar31 = 1;
  puVar13 = *(undefined8 **)(param_1 + 0x94);
  plVar1 = (long *)(param_1 + 0x288);
  lVar28 = *(long *)(param_1 + 0x458);
  lVar27 = *(long *)(param_1 + 0x450);
  plVar2 = (long *)(param_1 + 0x2a0);
  lVar14 = *(long *)(param_1 + 0x278) - *(long *)(param_1 + 0x270);
  lVar24 = *(long *)(param_1 + 0x2a8);
  lVar29 = *plVar2;
  lVar15 = *(long *)(param_1 + 0x290) - *plVar1;
  plVar33 = (long *)(param_1 + 0x90);
  lVar16 = lVar28 - lVar27;
  lVar17 = lVar24 - lVar29;
  uVar26 = 0;
  do {
    uStack_98 = *(ulong *)(param_1 + 0x98);
    local_a0 = (undefined8 *)*plVar33;
    uVar32 = *(undefined8 *)(param_1 + 0xa8);
    uStack_90 = *(undefined8 *)(param_1 + 0xa0);
    uStack_78 = *(ulong *)(param_1 + 0x9c);
    local_80 = *(long *)(param_1 + 0x94);
                    /* try { // try from 00869fb0 to 00869fc7 has its CatchHandler @ 0086aa48 */
    local_88 = uVar32;
    uVar9 = FUN_008521f4(&local_a0);
    FUN_00802564(param_1 + 0x498,uVar32,uVar9);
    if (*(char *)(param_1 + 0x68) == '\x01') {
      bVar6 = *(byte *)(param_1 + 0x498);
      uVar18 = *(ulong *)(param_1 + 0x4a0);
      uVar22 = (ulong)(bVar6 >> 1);
      uVar10 = uVar22;
      lVar30 = param_1 + 0x499;
      if ((bVar6 & 1) != 0) {
        uVar10 = uVar18;
        lVar30 = *(long *)(param_1 + 0x4a8);
      }
      uVar3 = uVar10 + 1;
      if (uVar10 == 0xffffffffffffffff) {
        local_e8 = (undefined8 *)0x0;
      }
      else {
                    /* try { // try from 0086a004 to 0086a0df has its CatchHandler @ 0086aa3c */
        local_e8 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),uVar3);
        uVar18 = 0;
        if ((uVar3 < 8) || ((ulong)((long)local_e8 - lVar30) < 0x20)) {
LAB_0086a098:
          lVar20 = (uVar10 - uVar18) + 1;
          puVar19 = (undefined1 *)((long)local_e8 + uVar18);
          puVar25 = (undefined1 *)(lVar30 + uVar18);
          do {
            lVar20 = lVar20 + -1;
            *puVar19 = *puVar25;
            puVar19 = puVar19 + 1;
            puVar25 = puVar25 + 1;
          } while (lVar20 != 0);
        }
        else if (uVar3 < 0x20) {
          uVar22 = 0;
LAB_0086a06c:
          uVar18 = uVar3 & 0xfffffffffffffff8;
          lVar20 = uVar22 - uVar18;
          puVar11 = (undefined8 *)((long)local_e8 + uVar22);
          puVar21 = (undefined8 *)(lVar30 + uVar22);
          do {
            lVar20 = lVar20 + 8;
            *puVar11 = *puVar21;
            puVar11 = puVar11 + 1;
            puVar21 = puVar21 + 1;
          } while (lVar20 != 0);
          if (uVar3 != uVar18) goto LAB_0086a098;
        }
        else {
          uVar18 = uVar3 & 0xffffffffffffffe0;
          puVar11 = local_e8 + 2;
          puVar21 = (undefined8 *)(lVar30 + 0x10);
          uVar22 = uVar18;
          do {
            puVar23 = puVar21 + -1;
            uVar32 = puVar21[-2];
            uVar35 = puVar21[1];
            uVar34 = *puVar21;
            uVar22 = uVar22 - 0x20;
            puVar21 = puVar21 + 4;
            puVar11[-1] = *puVar23;
            puVar11[-2] = uVar32;
            puVar11[1] = uVar35;
            *puVar11 = uVar34;
            puVar11 = puVar11 + 4;
          } while (uVar22 != 0);
          if (uVar3 != uVar18) {
            uVar22 = uVar18;
            if ((uVar3 & 0x18) == 0) goto LAB_0086a098;
            goto LAB_0086a06c;
          }
        }
        bVar6 = *(byte *)(param_1 + 0x498);
        uVar18 = *(ulong *)(param_1 + 0x4a0);
        uVar22 = (ulong)(bVar6 >> 1);
      }
      uStack_e0 = uVar22;
      if ((bVar6 & 1) != 0) {
        uStack_e0 = uVar18;
      }
      FUN_00872950(plVar1,&local_e8);
                    /* try { // try from 0086a0e0 to 0086a10b has its CatchHandler @ 0086aa48 */
      FUN_00870ce4((long *)(param_1 + 0x450),(ulong)&local_a0 | 4);
      local_f8 = local_f8 + 1;
      local_f0 = local_f0 + 1;
    }
    uVar10 = FUN_00854cb0(param_1 + 0x498);
    if ((uVar10 & 1) == 0) {
                    /* try { // try from 0086a2fc to 0086a303 has its CatchHandler @ 0086aa10 */
      FUN_00858f2c(param_1);
      local_b0 = (undefined8 *)0x0;
      uStack_a8 = 0;
      uStack_e0 = uStack_78;
                    /* try { // try from 0086a314 to 0086a32b has its CatchHandler @ 0086aa0c */
      local_e8 = puVar13;
      puVar13 = (undefined8 *)
                FUN_008659e8(param_1,&local_e8,&local_b0,
                             "Interpolated string literal contains malformed escape sequence");
      goto LAB_0086a544;
    }
    bVar6 = *(byte *)(param_1 + 0x498);
    uVar18 = *(ulong *)(param_1 + 0x4a0);
    uVar22 = (ulong)(bVar6 >> 1);
    uVar10 = uVar22;
    lVar30 = param_1 + 0x499;
    if ((bVar6 & 1) != 0) {
      uVar10 = uVar18;
      lVar30 = *(long *)(param_1 + 0x4a8);
    }
    uVar3 = uVar10 + 1;
    if (uVar10 == 0xffffffffffffffff) {
      local_b0 = (undefined8 *)0x0;
    }
    else {
                    /* try { // try from 0086a140 to 0086a223 has its CatchHandler @ 0086aa44 */
      local_b0 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),uVar3);
      uVar18 = 0;
      if ((uVar3 < 8) || ((ulong)((long)local_b0 - lVar30) < 0x20)) {
LAB_0086a1d4:
        lVar20 = (uVar10 - uVar18) + 1;
        puVar19 = (undefined1 *)((long)local_b0 + uVar18);
        puVar25 = (undefined1 *)(lVar30 + uVar18);
        do {
          lVar20 = lVar20 + -1;
          *puVar19 = *puVar25;
          puVar19 = puVar19 + 1;
          puVar25 = puVar25 + 1;
        } while (lVar20 != 0);
      }
      else if (uVar3 < 0x20) {
        uVar22 = 0;
LAB_0086a1a8:
        uVar18 = uVar3 & 0xfffffffffffffff8;
        lVar20 = uVar22 - uVar18;
        puVar11 = (undefined8 *)((long)local_b0 + uVar22);
        puVar21 = (undefined8 *)(lVar30 + uVar22);
        do {
          lVar20 = lVar20 + 8;
          *puVar11 = *puVar21;
          puVar11 = puVar11 + 1;
          puVar21 = puVar21 + 1;
        } while (lVar20 != 0);
        if (uVar3 != uVar18) goto LAB_0086a1d4;
      }
      else {
        uVar18 = uVar3 & 0xffffffffffffffe0;
        puVar11 = local_b0 + 2;
        puVar21 = (undefined8 *)(lVar30 + 0x10);
        uVar22 = uVar18;
        do {
          puVar23 = puVar21 + -1;
          uVar32 = puVar21[-2];
          uVar35 = puVar21[1];
          uVar34 = *puVar21;
          uVar22 = uVar22 - 0x20;
          puVar21 = puVar21 + 4;
          puVar11[-1] = *puVar23;
          puVar11[-2] = uVar32;
          puVar11[1] = uVar35;
          *puVar11 = uVar34;
          puVar11 = puVar11 + 4;
        } while (uVar22 != 0);
        if (uVar3 != uVar18) {
          uVar22 = uVar18;
          if ((uVar3 & 0x18) == 0) goto LAB_0086a1d4;
          goto LAB_0086a1a8;
        }
      }
      bVar6 = *(byte *)(param_1 + 0x498);
      uVar18 = *(ulong *)(param_1 + 0x4a0);
      uVar22 = (ulong)(bVar6 >> 1);
    }
    uStack_a8 = uVar22;
    if ((bVar6 & 1) != 0) {
      uStack_a8 = uVar18;
    }
    FUN_00858f2c(param_1);
    FUN_00872950((long *)(param_1 + 0x270),&local_b0);
    uVar10 = uVar26 + 1;
    if (((uint)local_a0 & 0xfffffffe) == 0x10c) {
LAB_0086a36c:
      if (uVar10 == 0) {
        local_a0 = (undefined8 *)0x0;
      }
      else {
        lVar30 = *(long *)(param_1 + 0x270);
                    /* try { // try from 0086a37c to 0086a37f has its CatchHandler @ 0086aa28 */
        local_a0 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),uVar10 * 0x10);
        puVar11 = (undefined8 *)(lVar30 + lVar14);
        puVar21 = local_a0;
        do {
          uVar32 = *puVar11;
          uVar31 = uVar31 - 1;
          puVar21[1] = puVar11[1];
          *puVar21 = uVar32;
          puVar11 = puVar11 + 2;
          puVar21 = puVar21 + 2;
        } while (uVar31 != 0);
      }
      uStack_98 = uVar10;
      if (uVar26 == 0) {
        local_e8 = (undefined8 *)0x0;
      }
      else {
        lVar30 = *(long *)(param_1 + 0x2a0);
                    /* try { // try from 0086a3b0 to 0086a3b3 has its CatchHandler @ 0086aa24 */
        local_e8 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),uVar26 << 3);
        if ((uVar26 < 8) || ((ulong)((long)local_e8 + (lVar29 - (lVar30 + lVar24))) < 0x20)) {
          uVar31 = 0;
        }
        else {
          uVar31 = uVar26 & 0xfffffffffffffffc;
          puVar11 = local_e8 + 2;
          puVar21 = (undefined8 *)(lVar17 + lVar30 + 0x10);
          uVar10 = uVar31;
          do {
            puVar23 = puVar21 + -1;
            uVar32 = puVar21[-2];
            uVar35 = puVar21[1];
            uVar34 = *puVar21;
            uVar10 = uVar10 - 4;
            puVar21 = puVar21 + 4;
            puVar11[-1] = *puVar23;
            puVar11[-2] = uVar32;
            puVar11[1] = uVar35;
            *puVar11 = uVar34;
            puVar11 = puVar11 + 4;
          } while (uVar10 != 0);
          if (uVar26 == uVar31) goto LAB_0086a41c;
        }
        lVar20 = uVar26 - uVar31;
        puVar11 = (undefined8 *)(lVar30 + ((lVar24 + uVar31 * 8) - lVar29));
        puVar21 = local_e8 + uVar31;
        do {
          lVar20 = lVar20 + -1;
          *puVar21 = *puVar11;
          puVar11 = puVar11 + 1;
          puVar21 = puVar21 + 1;
        } while (lVar20 != 0);
      }
LAB_0086a41c:
      uStack_a8 = uStack_78;
      uStack_e0 = uVar26;
      local_b0 = puVar13;
                    /* try { // try from 0086a430 to 0086a44b has its CatchHandler @ 0086aa38 */
      puVar13 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x40);
      FUN_0084f61c(puVar13,&local_b0,&local_a0,&local_e8);
      if (*(char *)(param_1 + 0x68) != '\x01') goto LAB_0086a544;
      uVar32 = *(undefined8 *)(param_1 + 0xe8);
      if (local_f8 == 0) {
        puVar11 = (undefined8 *)0x0;
        if (local_f0 != 0) goto LAB_0086a49c;
LAB_0086a508:
        lVar24 = 0;
      }
      else {
        lVar24 = *plVar1;
                    /* try { // try from 0086a46c to 0086a473 has its CatchHandler @ 0086aa18 */
        puVar11 = (undefined8 *)FUN_0084e938(uVar32,local_f8 << 4);
        puVar21 = (undefined8 *)(lVar24 + lVar15);
        puVar23 = puVar11;
        lVar24 = local_f8;
        do {
          uVar34 = *puVar21;
          lVar24 = lVar24 + -1;
          puVar23[1] = puVar21[1];
          *puVar23 = uVar34;
          puVar21 = puVar21 + 2;
          puVar23 = puVar23 + 2;
        } while (lVar24 != 0);
        if (local_f0 == 0) goto LAB_0086a508;
LAB_0086a49c:
        lVar29 = *(long *)(param_1 + 0x450);
                    /* try { // try from 0086a4a8 to 0086a52f has its CatchHandler @ 0086aa34 */
        lVar24 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),local_f0 << 3);
        if ((local_f0 < 8) || ((ulong)((lVar27 + lVar24) - (lVar29 + lVar28)) < 0x20)) {
          uVar31 = 0;
LAB_0086a4d4:
          lVar30 = local_f0 - uVar31;
          puVar21 = (undefined8 *)(lVar29 + ((lVar28 + uVar31 * 8) - lVar27));
          puVar23 = (undefined8 *)(lVar24 + uVar31 * 8);
          do {
            lVar30 = lVar30 + -1;
            *puVar23 = *puVar21;
            puVar21 = puVar21 + 1;
            puVar23 = puVar23 + 1;
          } while (lVar30 != 0);
        }
        else {
          uVar31 = local_f0 & 0xfffffffffffffffc;
          puVar21 = (undefined8 *)(lVar24 + 0x10);
          puVar23 = (undefined8 *)(lVar16 + lVar29 + 0x10);
          uVar26 = uVar31;
          do {
            puVar8 = puVar23 + -1;
            uVar34 = puVar23[-2];
            uVar36 = puVar23[1];
            uVar35 = *puVar23;
            uVar26 = uVar26 - 4;
            puVar23 = puVar23 + 4;
            puVar21[-1] = *puVar8;
            puVar21[-2] = uVar34;
            puVar21[1] = uVar36;
            *puVar21 = uVar35;
            puVar21 = puVar21 + 4;
          } while (uVar26 != 0);
          if (local_f0 != uVar31) goto LAB_0086a4d4;
        }
      }
      uVar32 = FUN_0084e938(uVar32,0x28);
      FUN_00851eb8(uVar32,puVar11,local_f8,lVar24,local_f0);
                    /* try { // try from 0086a534 to 0086a53f has its CatchHandler @ 0086aa20 */
      local_b0 = puVar13;
      puVar11 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_b0);
      *puVar11 = uVar32;
      goto LAB_0086a544;
    }
    if (*(int *)plVar33 - 0x10bU < 2) {
                    /* try { // try from 0086a288 to 0086a28f has its CatchHandler @ 0086aa2c */
      FUN_00858f2c(param_1);
      local_e8 = (undefined8 *)0x0;
      uStack_e0 = 0;
                    /* try { // try from 0086a294 to 0086a2bb has its CatchHandler @ 0086aa30 */
      local_c0 = FUN_008659e8(param_1,&local_80,&local_e8,
                              "Malformed interpolated string, expected expression inside \'{}\'");
      FUN_00872064(plVar2,&local_c0);
LAB_0086a368:
      uVar26 = uVar10;
      goto LAB_0086a36c;
    }
    if (*(int *)plVar33 == 0x11e) {
                    /* try { // try from 0086a334 to 0086a33b has its CatchHandler @ 0086aa2c */
      FUN_00858f2c(param_1);
      local_e8 = (undefined8 *)0x0;
      uStack_e0 = 0;
                    /* try { // try from 0086a340 to 0086a367 has its CatchHandler @ 0086aa1c */
      local_c0 = FUN_008659e8(param_1,&local_80,&local_e8,
                              "Malformed interpolated string; did you forget to add a \'`\'?");
      FUN_00872064(plVar2,&local_c0);
      goto LAB_0086a368;
    }
                    /* try { // try from 0086a250 to 0086a26b has its CatchHandler @ 0086aa40 */
    local_e8 = (undefined8 *)FUN_0086060c(param_1,0);
    FUN_00872064(plVar2,&local_e8);
    iVar5 = *(int *)plVar33;
    if (2 < iVar5 - 0x10aU) break;
    uVar31 = uVar31 + 1;
    uVar26 = uVar10;
  } while( true );
  if (iVar5 != 0) {
    if (iVar5 != 0x11e) {
      if (iVar5 == 0x121) {
                    /* try { // try from 0086a2d4 to 0086a2db has its CatchHandler @ 0086aa2c */
        FUN_00858f2c(param_1);
        local_e8 = (undefined8 *)0x0;
        uStack_e0 = 0;
                    /* try { // try from 0086a2e0 to 0086a2f7 has its CatchHandler @ 0086a9f4 */
        puVar13 = (undefined8 *)
                  FUN_008659e8(param_1,&local_80,&local_e8,
                               "Double braces are not permitted within interpolated strings; did you mean \'\\{\'?"
                              );
      }
      else {
        local_c0 = 0;
        uStack_b8 = 0;
                    /* try { // try from 0086a754 to 0086a763 has its CatchHandler @ 0086a9f8 */
        FUN_008521fc(&local_e8,plVar33);
        pvVar4 = local_d8;
        if (((ulong)local_e8 & 1) == 0) {
          pvVar4 = (void *)((long)&local_e8 + 1);
        }
                    /* try { // try from 0086a774 to 0086a78b has its CatchHandler @ 0086a9d4 */
        puVar13 = (undefined8 *)
                  FUN_008659e8(param_1,&local_80,&local_c0,"Malformed interpolated string, got %s",
                               pvVar4);
        if (((ulong)local_e8 & 1) != 0) {
          operator_delete(local_d8,(ulong)local_e8 & 0xfffffffffffffffe);
        }
      }
      goto LAB_0086a544;
    }
                    /* try { // try from 0086a6e4 to 0086a6eb has its CatchHandler @ 0086aa2c */
    FUN_00858f2c(param_1);
  }
  if (uVar10 == 0) {
    local_c0 = 0;
    local_e8 = (undefined8 *)0x0;
    uStack_e0 = uVar10;
  }
  else {
    lVar30 = *(long *)(param_1 + 0x270);
                    /* try { // try from 0086a6fc to 0086a6ff has its CatchHandler @ 0086aa00 */
    local_e8 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),uVar10 * 0x10);
    puVar11 = (undefined8 *)(lVar30 + lVar14);
    puVar21 = local_e8;
    uVar18 = uVar31;
    do {
      uVar32 = *puVar11;
      uVar18 = uVar18 - 1;
      puVar21[1] = puVar11[1];
      *puVar21 = uVar32;
      puVar11 = puVar11 + 2;
      puVar21 = puVar21 + 2;
    } while (uVar18 != 0);
    lVar30 = *(long *)(param_1 + 0x2a0);
    uStack_e0 = uVar10;
                    /* try { // try from 0086a730 to 0086a737 has its CatchHandler @ 0086a9fc */
    local_c0 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),uVar10 * 8);
    uVar26 = uVar26 + 1;
    if (uVar26 < 8) {
      uVar18 = 0;
    }
    else if ((ulong)((lVar29 + local_c0) - (lVar30 + lVar24)) < 0x20) {
      uVar18 = 0;
    }
    else {
      uVar18 = uVar26 & 0xfffffffffffffffc;
      uVar22 = uVar31 & 0xfffffffffffffffc;
      puVar11 = (undefined8 *)(local_c0 + 0x10);
      puVar21 = (undefined8 *)(lVar17 + lVar30 + 0x10);
      do {
        puVar23 = puVar21 + -1;
        uVar32 = puVar21[-2];
        uVar35 = puVar21[1];
        uVar34 = *puVar21;
        uVar22 = uVar22 - 4;
        puVar21 = puVar21 + 4;
        puVar11[-1] = *puVar23;
        puVar11[-2] = uVar32;
        puVar11[1] = uVar35;
        *puVar11 = uVar34;
        puVar11 = puVar11 + 4;
      } while (uVar22 != 0);
      if (uVar26 == uVar18) goto LAB_0086a834;
    }
    do {
      *(undefined8 *)(local_c0 + uVar18 * 8) = *(undefined8 *)(lVar30 + lVar17 + uVar18 * 8);
      uVar18 = uVar18 + 1;
    } while (uVar31 != uVar18);
  }
LAB_0086a834:
  uStack_c8 = *(undefined8 *)(param_1 + 0xb8);
  local_d0 = puVar13;
  uStack_b8 = uVar10;
                    /* try { // try from 0086a844 to 0086a85f has its CatchHandler @ 0086aa14 */
  puVar13 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x40);
  FUN_0084f61c(puVar13,&local_d0,&local_e8,&local_c0);
  if (*(char *)(param_1 + 0x68) == '\x01') {
    uVar32 = *(undefined8 *)(param_1 + 0xe8);
    if (local_f8 == 0) {
      puVar11 = (undefined8 *)0x0;
      if (local_f0 != 0) goto LAB_0086a8b4;
LAB_0086a920:
      lVar24 = 0;
    }
    else {
      lVar24 = *plVar1;
                    /* try { // try from 0086a884 to 0086a88b has its CatchHandler @ 0086a9cc */
      puVar11 = (undefined8 *)FUN_0084e938(uVar32,local_f8 << 4);
      puVar21 = (undefined8 *)(lVar24 + lVar15);
      puVar23 = puVar11;
      lVar24 = local_f8;
      do {
        uVar34 = *puVar21;
        lVar24 = lVar24 + -1;
        puVar23[1] = puVar21[1];
        *puVar23 = uVar34;
        puVar21 = puVar21 + 2;
        puVar23 = puVar23 + 2;
      } while (lVar24 != 0);
      if (local_f0 == 0) goto LAB_0086a920;
LAB_0086a8b4:
      lVar29 = *(long *)(param_1 + 0x450);
                    /* try { // try from 0086a8c0 to 0086a947 has its CatchHandler @ 0086aa04 */
      lVar24 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),local_f0 << 3);
      if ((local_f0 < 8) || ((ulong)((lVar27 + lVar24) - (lVar29 + lVar28)) < 0x20)) {
        uVar31 = 0;
LAB_0086a8ec:
        lVar30 = local_f0 - uVar31;
        puVar21 = (undefined8 *)(lVar29 + ((lVar28 + uVar31 * 8) - lVar27));
        puVar23 = (undefined8 *)(lVar24 + uVar31 * 8);
        do {
          lVar30 = lVar30 + -1;
          *puVar23 = *puVar21;
          puVar21 = puVar21 + 1;
          puVar23 = puVar23 + 1;
        } while (lVar30 != 0);
      }
      else {
        uVar31 = local_f0 & 0xfffffffffffffffc;
        puVar21 = (undefined8 *)(lVar24 + 0x10);
        puVar23 = (undefined8 *)(lVar16 + lVar29 + 0x10);
        uVar26 = uVar31;
        do {
          puVar8 = puVar23 + -1;
          uVar34 = puVar23[-2];
          uVar36 = puVar23[1];
          uVar35 = *puVar23;
          uVar26 = uVar26 - 4;
          puVar23 = puVar23 + 4;
          puVar21[-1] = *puVar8;
          puVar21[-2] = uVar34;
          puVar21[1] = uVar36;
          *puVar21 = uVar35;
          puVar21 = puVar21 + 4;
        } while (uVar26 != 0);
        if (local_f0 != uVar31) goto LAB_0086a8ec;
      }
    }
    uVar32 = FUN_0084e938(uVar32,0x28);
    FUN_00851eb8(uVar32,puVar11,local_f8,lVar24,local_f0);
                    /* try { // try from 0086a94c to 0086a957 has its CatchHandler @ 0086a9d0 */
    local_d0 = puVar13;
    puVar11 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_d0);
    *puVar11 = uVar32;
  }
                    /* try { // try from 0086a95c to 0086a98b has its CatchHandler @ 0086aa08 */
  uVar31 = FUN_00854c90(param_1 + 0x70);
  if ((uVar31 >> 0x20 & 1) == 0) {
    pcVar12 = "Malformed interpolated string; did you forget to add a \'`\'?";
  }
  else {
    if ((int)uVar31 != 0) goto LAB_0086a544;
    pcVar12 = "Malformed interpolated string; did you forget to add a \'}\'?";
  }
  FUN_00860ecc(param_1,param_1 + 0xb0,pcVar12);
LAB_0086a544:
  lVar17 = lVar17 + *(long *)(param_1 + 0x2a0);
  if (lVar17 != *(long *)(param_1 + 0x2a8)) {
    *(long *)(param_1 + 0x2a8) = lVar17;
  }
  lVar16 = lVar16 + *(long *)(param_1 + 0x450);
  if (lVar16 != *(long *)(param_1 + 0x458)) {
    *(long *)(param_1 + 0x458) = lVar16;
  }
  lVar15 = lVar15 + *(long *)(param_1 + 0x288);
  if (lVar15 != *(long *)(param_1 + 0x290)) {
    *(long *)(param_1 + 0x290) = lVar15;
  }
  lVar14 = lVar14 + *(long *)(param_1 + 0x270);
  if (lVar14 != *(long *)(param_1 + 0x278)) {
    *(long *)(param_1 + 0x278) = lVar14;
  }
  if (*(long *)(lVar7 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return puVar13;
}

