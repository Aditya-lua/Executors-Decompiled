/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00868ac8
 */

/* WARNING: Removing unreachable block (ram,0x00869560) */
/* WARNING: Removing unreachable block (ram,0x008693dc) */
/* WARNING: Removing unreachable block (ram,0x008692c4) */
/* WARNING: Removing unreachable block (ram,0x008692fc) */
/* WARNING: Removing unreachable block (ram,0x00869528) */
/* WARNING: Removing unreachable block (ram,0x008695a0) */

undefined1  [16] FUN_00868ac8(long param_1,uint param_2,undefined8 param_3)

{
  uint uVar1;
  long lVar2;
  long **pplVar3;
  long **pplVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  char cVar8;
  uint uVar9;
  ulong uVar10;
  int iVar11;
  int iVar12;
  int iVar13;
  int iVar14;
  int iVar15;
  bool bVar16;
  long lVar17;
  undefined8 *puVar18;
  long lVar19;
  undefined8 *puVar20;
  undefined8 *puVar21;
  ulong uVar22;
  long lVar23;
  long lVar24;
  ulong uVar25;
  long lVar26;
  ulong uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  long lVar30;
  long lVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  int *piVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined1 auVar38 [16];
  uint local_16c;
  long local_158;
  long *local_150;
  long lStack_148;
  ulong local_140;
  long *local_138;
  long lStack_130;
  ulong local_128;
  long *local_120;
  long lStack_118;
  long local_110;
  long *local_108;
  long local_100;
  ulong local_f8;
  undefined8 local_f0;
  undefined8 uStack_e8;
  undefined8 local_e0;
  undefined8 uStack_d8;
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  int local_88;
  int iStack_84;
  int iStack_80;
  undefined4 uStack_7c;
  long local_78;
  long local_70;
  
  uVar9 = DAT_00d1eba0;
  lVar2 = tpidr_el0;
  local_70 = *(long *)(lVar2 + 0x28);
  uVar1 = *(int *)(param_1 + 0x124) + 1;
  *(uint *)(param_1 + 0x124) = uVar1;
  if (uVar9 < uVar1) {
    if (*(long *)(lVar2 + 0x28) == local_70) {
      uVar33 = FUN_008578f8(param_1 + 0x94,
                            "Exceeded allowed recursion depth; simplify your %s to make the code compile"
                            ,"type annotation");
                    /* catch() { ... } // from try @ 0086928c with catch @ 008694bc */
                    /* catch() { ... } // from try @ 00868c88 with catch @ 00869500 */
      lVar2 = *local_150 + lStack_148 * 8;
      if (lVar2 != local_150[1]) {
        local_150[1] = lVar2;
      }
      lVar2 = *local_138 + lStack_130 * 8;
      if (lVar2 != local_138[1]) {
        local_138[1] = lVar2;
      }
      FUN_0086549c(&local_120);
      lVar2 = *local_108 + local_100 * 8;
      if (lVar2 != local_108[1]) {
        local_108[1] = lVar2;
      }
      if (*(long *)(local_158 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
        FUN_00c2c090(uVar33);
      }
    }
    goto LAB_008695d0;
  }
  piVar34 = (int *)(param_1 + 0x90);
  iVar7 = *piVar34;
  uStack_a8 = *(undefined8 *)(param_1 + 0x98);
  local_b0 = *(undefined8 *)piVar34;
  uStack_98 = *(undefined8 *)(param_1 + 0xa8);
  uStack_a0 = *(undefined8 *)(param_1 + 0xa0);
  local_c0 = 0;
  uStack_b8 = 0xffffffffffffffff;
  local_d0 = 0xffffffffffffffff;
  uStack_c8 = 0;
  if (*(char *)(param_1 + 0x68) == '\x01') {
    puVar20 = &uStack_b8;
    puVar18 = &uStack_c8;
    puVar21 = &local_d0;
  }
  else {
    puVar20 = (undefined8 *)0x0;
    puVar18 = (undefined8 *)0x0;
    puVar21 = (undefined8 *)0x0;
  }
  FUN_00863bd4(&local_f0,param_1,0,puVar20,puVar18,puVar21);
  iVar5 = *(int *)(param_1 + 0x90);
  uVar33 = *(undefined8 *)(param_1 + 0x94);
  if (iVar5 == 0x28) {
    FUN_00858f2c(param_1);
  }
  else {
    FUN_0086e3b4(param_1,0x28,"function parameters");
  }
  local_108 = (long *)(param_1 + 0x360);
  lVar31 = 0;
  local_110 = 0;
  local_128 = 0;
  local_140 = 0;
  *(int *)(*(long *)(param_1 + 0x1e8) + 0x41c) = *(int *)(*(long *)(param_1 + 0x1e8) + 0x41c) + 1;
  local_120 = (long *)(param_1 + 0x438);
  local_100 = *(long *)(param_1 + 0x368) - *(long *)(param_1 + 0x360) >> 3;
  lStack_118 = *(long *)(param_1 + 0x440) - *(long *)(param_1 + 0x438) >> 5;
  local_f8 = 0;
  lStack_130 = *(long *)(param_1 + 0x458) - *(long *)(param_1 + 0x450) >> 3;
  local_138 = (long *)(param_1 + 0x450);
  local_150 = (long *)(param_1 + 0x468);
  lStack_148 = *(long *)(param_1 + 0x470) - *(long *)(param_1 + 0x468) >> 3;
  if (*(int *)(param_1 + 0x90) != 0x29) {
    pplVar4 = &local_138;
    pplVar3 = &local_150;
    if (*(char *)(param_1 + 0x68) == '\0') {
      pplVar3 = (long **)0x0;
      pplVar4 = (long **)0x0;
    }
                    /* try { // try from 00868c50 to 00868c5f has its CatchHandler @ 008694f4 */
    lVar31 = FUN_00866148(param_1,&local_108,&local_120,pplVar3,pplVar4);
  }
  uVar29 = *(undefined8 *)(param_1 + 0x94);
  uVar28 = *(undefined8 *)(param_1 + 0x9c);
  iStack_84 = (int)uVar33;
  iVar12 = iStack_84;
  iStack_80 = (int)((ulong)uVar33 >> 0x20);
  iVar15 = iStack_80;
  local_88 = iVar5;
  if (*(int *)(param_1 + 0x90) == 0x29) {
                    /* try { // try from 00868c88 to 00868cc7 has its CatchHandler @ 00869500 */
    FUN_00858f2c(param_1);
    local_16c = 1;
  }
  else {
    FUN_0086b5f8(param_1,0x29,&local_88,0);
    local_16c = FUN_0086e434(param_1,0x29);
  }
  uVar10 = local_f8;
  lVar19 = local_100;
  *(int *)(*(long *)(param_1 + 0x1e8) + 0x41c) = *(int *)(*(long *)(param_1 + 0x1e8) + 0x41c) + -1;
  if (local_f8 == 0) {
    lVar17 = 0;
  }
  else {
    lVar30 = *local_108;
                    /* try { // try from 00868d00 to 00868d03 has its CatchHandler @ 008694fc */
    lVar17 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),local_f8 << 3);
    if ((uVar10 < 8) || (lVar23 = lVar19 * 8 + lVar30, (ulong)(lVar17 - lVar23) < 0x20)) {
      uVar22 = 0;
    }
    else {
      uVar22 = uVar10 & 0xfffffffffffffffc;
      puVar20 = (undefined8 *)(lVar17 + 0x10);
      puVar18 = (undefined8 *)(lVar23 + 0x10);
      uVar25 = uVar22;
      do {
        puVar21 = puVar18 + -1;
        uVar32 = puVar18[-2];
        uVar36 = puVar18[1];
        uVar35 = *puVar18;
        uVar25 = uVar25 - 4;
        puVar18 = puVar18 + 4;
        puVar20[-1] = *puVar21;
        puVar20[-2] = uVar32;
        puVar20[1] = uVar36;
        *puVar20 = uVar35;
        puVar20 = puVar20 + 4;
      } while (uVar25 != 0);
      if (uVar10 == uVar22) goto LAB_00868d58;
    }
    lVar23 = uVar10 - uVar22;
    puVar20 = (undefined8 *)(lVar30 + uVar22 * 8 + lVar19 * 8);
    puVar18 = (undefined8 *)(lVar17 + uVar22 * 8);
    do {
      lVar23 = lVar23 + -1;
      *puVar18 = *puVar20;
      puVar20 = puVar20 + 1;
      puVar18 = puVar18 + 1;
    } while (lVar23 != 0);
  }
LAB_00868d58:
  iVar13 = iStack_84;
  iVar11 = local_88;
  lVar23 = local_100;
  lVar19 = local_110;
  lVar30 = lStack_118;
  iVar6 = *piVar34;
  bVar16 = local_110 != 0 || iVar7 == 0x3c;
  if (iVar6 == 0x107) {
LAB_00868d78:
    local_88 = iVar11;
    iStack_84 = iVar13;
    if (local_110 != 0) {
      lVar17 = *local_120;
                    /* try { // try from 00868d90 to 00868d93 has its CatchHandler @ 008694f0 */
      puVar18 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),local_110 << 5);
      puVar20 = (undefined8 *)(lVar17 + lVar30 * 0x20);
      do {
        uVar35 = *puVar20;
        uVar32 = puVar20[3];
        uVar28 = puVar20[2];
        lVar19 = lVar19 + -1;
        puVar18[1] = puVar20[1];
        *puVar18 = uVar35;
        puVar18[3] = uVar32;
        puVar18[2] = uVar28;
        puVar20 = puVar20 + 4;
        puVar18 = puVar18 + 4;
      } while (lVar19 != 0);
    }
    uVar28 = *(undefined8 *)(param_1 + 0x94);
                    /* try { // try from 00868f7c to 00868f97 has its CatchHandler @ 008694f8 */
    lVar19 = FUN_00867cac(param_1,&local_b0,param_3,local_f0,uStack_e8,local_e0,uStack_d8);
    uVar10 = local_128;
    lVar17 = lStack_130;
    if ((*(char *)(param_1 + 0x68) == '\x01') && (*(int *)(lVar19 + 8) == DAT_00d1b260)) {
      uVar32 = *(undefined8 *)(param_1 + 0xe8);
      if (iVar5 != 0x28) {
        uVar33 = 0xffffffffffffffff;
      }
      if (local_128 == 0) {
        lVar30 = 0;
      }
      else {
        lVar23 = *local_138;
                    /* try { // try from 00868fdc to 00868fe3 has its CatchHandler @ 008694cc */
        lVar30 = FUN_0084e938(uVar32,local_128 << 3);
        if ((uVar10 < 8) || (lVar24 = lVar17 * 8 + lVar23, (ulong)(lVar30 - lVar24) < 0x20)) {
          uVar22 = 0;
        }
        else {
          uVar22 = uVar10 & 0xfffffffffffffffc;
          puVar20 = (undefined8 *)(lVar30 + 0x10);
          puVar18 = (undefined8 *)(lVar24 + 0x10);
          uVar25 = uVar22;
          do {
            puVar21 = puVar18 + -1;
            uVar35 = puVar18[-2];
            uVar37 = puVar18[1];
            uVar36 = *puVar18;
            uVar25 = uVar25 - 4;
            puVar18 = puVar18 + 4;
            puVar20[-1] = *puVar21;
            puVar20[-2] = uVar35;
            puVar20[1] = uVar37;
            *puVar20 = uVar36;
            puVar20 = puVar20 + 4;
          } while (uVar25 != 0);
          if (uVar10 == uVar22) goto LAB_008690ec;
        }
        lVar24 = uVar10 - uVar22;
        puVar20 = (undefined8 *)(lVar23 + uVar22 * 8 + lVar17 * 8);
        puVar18 = (undefined8 *)(lVar30 + uVar22 * 8);
        do {
          lVar24 = lVar24 + -1;
          *puVar18 = *puVar20;
          puVar20 = puVar20 + 1;
          puVar18 = puVar18 + 1;
        } while (lVar24 != 0);
      }
LAB_008690ec:
      uVar22 = local_140;
      lVar17 = lStack_148;
      if (local_140 == 0) {
        lVar23 = 0;
      }
      else {
        lVar24 = *local_150;
                    /* try { // try from 00869108 to 0086910b has its CatchHandler @ 008694c8 */
        lVar23 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),local_140 << 3);
        if ((uVar22 < 8) || (lVar26 = lVar17 * 8 + lVar24, (ulong)(lVar23 - lVar26) < 0x20)) {
          uVar25 = 0;
        }
        else {
          uVar25 = uVar22 & 0xfffffffffffffffc;
          puVar20 = (undefined8 *)(lVar23 + 0x10);
          puVar18 = (undefined8 *)(lVar26 + 0x10);
          uVar27 = uVar25;
          do {
            puVar21 = puVar18 + -1;
            uVar35 = puVar18[-2];
            uVar37 = puVar18[1];
            uVar36 = *puVar18;
            uVar27 = uVar27 - 4;
            puVar18 = puVar18 + 4;
            puVar20[-1] = *puVar21;
            puVar20[-2] = uVar35;
            puVar20[1] = uVar37;
            *puVar20 = uVar36;
            puVar20 = puVar20 + 4;
          } while (uVar27 != 0);
          if (uVar22 == uVar25) goto LAB_00869160;
        }
        lVar26 = uVar22 - uVar25;
        puVar20 = (undefined8 *)(lVar24 + uVar25 * 8 + lVar17 * 8);
        puVar18 = (undefined8 *)(lVar23 + uVar25 * 8);
        do {
          lVar26 = lVar26 + -1;
          *puVar18 = *puVar20;
          puVar20 = puVar20 + 1;
          puVar18 = puVar18 + 1;
        } while (lVar26 != 0);
      }
LAB_00869160:
                    /* try { // try from 00869160 to 0086919f has its CatchHandler @ 008694ec */
      uVar32 = FUN_0084e938(uVar32,0x60);
      if ((local_16c & 1) == 0) {
        uVar29 = 0xffffffffffffffff;
      }
      FUN_008520e0(uVar32,uStack_b8,uStack_c8,local_c0,local_d0,uVar33,lVar30,uVar10,lVar23,uVar22,
                   uVar29,uVar28,lVar31);
      local_88 = (int)lVar19;
      iStack_84 = (int)((ulong)lVar19 >> 0x20);
                    /* try { // try from 008691a4 to 008691af has its CatchHandler @ 008694d4 */
      puVar20 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_88);
      uVar28 = 0;
      *puVar20 = uVar32;
    }
    else {
LAB_008690d8:
      uVar28 = 0;
    }
  }
  else {
    local_88 = (int)lVar17;
    iVar7 = local_88;
    iStack_84 = (int)((ulong)lVar17 >> 0x20);
    iVar14 = iStack_84;
    if ((iVar6 == 0x3a) || ((lVar31 != 0 || uVar10 != 1) || bVar16)) {
      if (bVar16 || (iVar6 == 0x3a || ((param_2 ^ 0xffffffff) & 1) != 0)) goto LAB_00868d78;
      local_88 = iVar11;
      iStack_84 = iVar13;
                    /* try { // try from 00868eb0 to 00868ed3 has its CatchHandler @ 008694e4 */
      uVar28 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x38);
      iStack_80 = (int)uVar10;
      uStack_7c = (undefined4)(uVar10 >> 0x20);
      local_88 = iVar7;
      iStack_84 = iVar14;
      local_78 = lVar31;
      FUN_00851204(uVar28,(ulong)&local_b0 | 4,&local_88);
      uVar10 = local_140;
      lVar31 = lStack_148;
      if (*(char *)(param_1 + 0x68) != '\x01') goto LAB_008690e0;
      if (iVar5 != 0x28) {
        uVar33 = 0xffffffffffffffff;
      }
      uVar32 = *(undefined8 *)(param_1 + 0xe8);
      if ((local_16c & 1) == 0) {
        uVar29 = 0xffffffffffffffff;
      }
      if (local_140 == 0) {
        lVar19 = 0;
      }
      else {
        lVar17 = *local_150;
                    /* try { // try from 00868f14 to 00868f1b has its CatchHandler @ 008694dc */
        lVar19 = FUN_0084e938(uVar32,local_140 << 3);
        if ((uVar10 < 8) || (lVar30 = lVar31 * 8 + lVar17, (ulong)(lVar19 - lVar30) < 0x20)) {
          uVar22 = 0;
        }
        else {
          uVar22 = uVar10 & 0xfffffffffffffffc;
          puVar20 = (undefined8 *)(lVar19 + 0x10);
          puVar18 = (undefined8 *)(lVar30 + 0x10);
          uVar25 = uVar22;
          do {
            puVar21 = puVar18 + -1;
            uVar35 = puVar18[-2];
            uVar37 = puVar18[1];
            uVar36 = *puVar18;
            uVar25 = uVar25 - 4;
            puVar18 = puVar18 + 4;
            puVar20[-1] = *puVar21;
            puVar20[-2] = uVar35;
            puVar20[1] = uVar37;
            *puVar20 = uVar36;
            puVar20 = puVar20 + 4;
          } while (uVar25 != 0);
          if (uVar10 == uVar22) goto LAB_00869228;
        }
        lVar30 = uVar10 - uVar22;
        puVar20 = (undefined8 *)(lVar17 + uVar22 * 8 + lVar31 * 8);
        puVar18 = (undefined8 *)(lVar19 + uVar22 * 8);
        do {
          lVar30 = lVar30 + -1;
          *puVar18 = *puVar20;
          puVar20 = puVar20 + 1;
          puVar18 = puVar18 + 1;
        } while (lVar30 != 0);
      }
LAB_00869228:
                    /* try { // try from 00869228 to 0086924b has its CatchHandler @ 008694dc */
      uVar32 = FUN_0084e938(uVar32,0x28);
      FUN_008521ac(uVar32,uVar33,uVar29,lVar19,uVar10);
      local_88 = (int)uVar28;
      iStack_84 = (int)((ulong)uVar28 >> 0x20);
                    /* try { // try from 00869250 to 0086925b has its CatchHandler @ 008694c0 */
      puVar20 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_88);
LAB_00869298:
      lVar19 = 0;
      *puVar20 = uVar32;
    }
    else if ((param_2 & 1) == 0) {
      iStack_80 = (int)uVar28;
      uStack_7c = (undefined4)((ulong)uVar28 >> 0x20);
      lVar31 = *local_108;
      local_88 = iVar12;
      iStack_84 = iVar15;
                    /* try { // try from 00869074 to 0086908b has its CatchHandler @ 008694e0 */
      lVar19 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x28);
      FUN_008510d0(lVar19,&local_88,*(undefined8 *)(lVar31 + lVar23 * 8));
      if (*(char *)(param_1 + 0x68) != '\x01') goto LAB_008690d8;
                    /* try { // try from 0086909c to 008690bb has its CatchHandler @ 008694d0 */
      uVar33 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0xc);
      if ((local_16c & 1) == 0) {
        uVar29 = 0xffffffffffffffff;
      }
      FUN_00852178(uVar33,uVar29);
      local_88 = (int)lVar19;
      iStack_84 = (int)((ulong)lVar19 >> 0x20);
                    /* try { // try from 008690c0 to 008690cb has its CatchHandler @ 008694c4 */
      puVar20 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_88);
      uVar28 = 0;
      *puVar20 = uVar33;
    }
    else {
      local_88 = iVar11;
      iStack_84 = iVar13;
                    /* try { // try from 00868ddc to 00868e03 has its CatchHandler @ 008694e8 */
      uVar28 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x38);
      local_78 = 0;
      iStack_80 = 1;
      uStack_7c = 0;
      local_88 = iVar7;
      iStack_84 = iVar14;
      FUN_00851204(uVar28,(ulong)&local_b0 | 4,&local_88);
      uVar10 = local_140;
      lVar31 = lStack_148;
      if (*(char *)(param_1 + 0x68) == '\x01') {
        if (iVar5 != 0x28) {
          uVar33 = 0xffffffffffffffff;
        }
        uVar32 = *(undefined8 *)(param_1 + 0xe8);
        if ((local_16c & 1) == 0) {
          uVar29 = 0xffffffffffffffff;
        }
        if (local_140 == 0) {
          lVar19 = 0;
        }
        else {
          lVar17 = *local_150;
                    /* try { // try from 00868e44 to 00868e4b has its CatchHandler @ 008694d8 */
          lVar19 = FUN_0084e938(uVar32,local_140 << 3);
          if ((uVar10 < 8) || (lVar30 = lVar31 * 8 + lVar17, (ulong)(lVar19 - lVar30) < 0x20)) {
            uVar22 = 0;
          }
          else {
            uVar22 = uVar10 & 0xfffffffffffffffc;
            puVar20 = (undefined8 *)(lVar19 + 0x10);
            puVar18 = (undefined8 *)(lVar30 + 0x10);
            uVar25 = uVar22;
            do {
              puVar21 = puVar18 + -1;
              uVar35 = puVar18[-2];
              uVar37 = puVar18[1];
              uVar36 = *puVar18;
              uVar25 = uVar25 - 4;
              puVar18 = puVar18 + 4;
              puVar20[-1] = *puVar21;
              puVar20[-2] = uVar35;
              puVar20[1] = uVar37;
              *puVar20 = uVar36;
              puVar20 = puVar20 + 4;
            } while (uVar25 != 0);
            if (uVar10 == uVar22) goto LAB_00869264;
          }
          lVar30 = uVar10 - uVar22;
          puVar20 = (undefined8 *)(lVar17 + uVar22 * 8 + lVar31 * 8);
          puVar18 = (undefined8 *)(lVar19 + uVar22 * 8);
          do {
            lVar30 = lVar30 + -1;
            *puVar18 = *puVar20;
            puVar20 = puVar20 + 1;
            puVar18 = puVar18 + 1;
          } while (lVar30 != 0);
        }
LAB_00869264:
                    /* try { // try from 00869264 to 00869287 has its CatchHandler @ 008694d8 */
        uVar32 = FUN_0084e938(uVar32,0x28);
        FUN_008521ac(uVar32,uVar33,uVar29,lVar19,uVar10);
        local_88 = (int)uVar28;
        iStack_84 = (int)((ulong)uVar28 >> 0x20);
                    /* try { // try from 0086928c to 00869297 has its CatchHandler @ 008694bc */
        puVar20 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_88);
        goto LAB_00869298;
      }
LAB_008690e0:
      lVar19 = 0;
    }
  }
  lVar31 = *local_150 + lStack_148 * 8;
  if (lVar31 != local_150[1]) {
    local_150[1] = lVar31;
  }
  lVar31 = *local_138 + lStack_130 * 8;
  if (lVar31 != local_138[1]) {
    local_138[1] = lVar31;
  }
  lVar31 = *local_120;
  lVar17 = local_120[1];
  lVar30 = lStack_118 * 0x20;
  if (lVar30 + lVar31 != lVar17) {
    lVar23 = lVar31 + lVar30;
    if (lVar23 + (lVar17 - (lVar30 + lVar31)) != lVar17) {
      lVar23 = lVar17 - lVar31;
      do {
        puVar20 = (undefined8 *)(lVar31 + lVar30);
        puVar18 = (undefined8 *)(lVar31 + lVar23);
        cVar8 = *(char *)(puVar20 + 3);
        if (cVar8 == *(char *)(puVar18 + 3)) {
          if (cVar8 != '\0') {
            puVar20 = (undefined8 *)(lVar31 + lVar23);
            puVar18 = (undefined8 *)(lVar31 + lVar30);
            *puVar18 = *puVar20;
            uVar33 = puVar20[1];
            puVar18[2] = puVar20[2];
            puVar18[1] = uVar33;
          }
        }
        else if (cVar8 == '\0') {
          uVar33 = puVar18[2];
          uVar32 = puVar18[1];
          uVar29 = *puVar18;
          *(undefined1 *)(puVar20 + 3) = 1;
          puVar20[2] = uVar33;
          puVar20[1] = uVar32;
          *puVar20 = uVar29;
        }
        else {
          *(undefined1 *)(puVar20 + 3) = 0;
        }
        lVar31 = lVar31 + 0x20;
      } while (lVar31 + lVar23 != lVar17);
      lVar23 = lVar31 + lVar30;
    }
    local_120[1] = lVar23;
  }
  lVar31 = *local_108 + local_100 * 8;
  if (lVar31 != local_108[1]) {
    local_108[1] = lVar31;
  }
  if (*(long *)(lVar2 + 0x28) == local_70) {
    auVar38._8_8_ = uVar28;
    auVar38._0_8_ = lVar19;
    return auVar38;
  }
LAB_008695d0:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

