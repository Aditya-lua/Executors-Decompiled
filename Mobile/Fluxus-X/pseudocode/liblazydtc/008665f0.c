/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008665f0
 */

/* WARNING: Removing unreachable block (ram,0x00867264) */
/* WARNING: Removing unreachable block (ram,0x00867098) */
/* WARNING: Removing unreachable block (ram,0x00866f80) */
/* WARNING: Removing unreachable block (ram,0x00866fb8) */
/* WARNING: Removing unreachable block (ram,0x0086722c) */
/* WARNING: Removing unreachable block (ram,0x008672a4) */

undefined8 FUN_008665f0(long param_1)

{
  long **pplVar1;
  long **pplVar2;
  char cVar3;
  long lVar4;
  undefined8 *puVar5;
  bool bVar6;
  uint uVar7;
  undefined8 uVar8;
  long lVar9;
  long *plVar10;
  undefined8 uVar11;
  undefined8 *puVar12;
  ulong uVar13;
  undefined8 uVar14;
  undefined8 *puVar15;
  long lVar16;
  int iVar17;
  long lVar18;
  ulong uVar19;
  ulong uVar20;
  long lVar21;
  ulong uVar22;
  long lVar23;
  uint uVar24;
  long lVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined1 auVar28 [16];
  long local_158;
  undefined8 local_150;
  undefined8 uStack_148;
  undefined8 local_138;
  undefined8 local_130;
  undefined8 uStack_128;
  long *local_120;
  long lStack_118;
  ulong local_110;
  long *local_108;
  long lStack_100;
  ulong local_f8;
  long *local_f0;
  long lStack_e8;
  long local_e0;
  long *local_d8;
  long local_d0;
  ulong local_c8;
  int local_c0;
  undefined4 uStack_bc;
  undefined4 uStack_b8;
  undefined4 uStack_b4;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  int local_a0;
  undefined4 uStack_9c;
  undefined4 uStack_98;
  undefined4 uStack_94;
  long local_90;
  long local_78;
  
  uVar7 = DAT_00d1eba0;
  lVar4 = tpidr_el0;
  local_78 = *(long *)(lVar4 + 0x28);
  uVar24 = *(int *)(param_1 + 0x124) + 1;
  *(uint *)(param_1 + 0x124) = uVar24;
  if (uVar7 < uVar24) {
    if (*(long *)(lVar4 + 0x28) == local_78) {
      uVar8 = FUN_008578f8(param_1 + 0x94,
                           "Exceeded allowed recursion depth; simplify your %s to make the code compile"
                           ,"type annotation");
                    /* catch() { ... } // from try @ 00866934 with catch @ 008671ac */
                    /* catch() { ... } // from try @ 00866754 with catch @ 00867204
                       catch() { ... } // from try @ 00866848 with catch @ 00867204 */
      lVar9 = *local_120 + lStack_118 * 8;
      if (lVar9 != local_120[1]) {
        local_120[1] = lVar9;
      }
      lVar9 = *local_108 + lStack_100 * 8;
      if (lVar9 != local_108[1]) {
        local_108[1] = lVar9;
      }
      FUN_0086549c(&local_f0);
      lVar9 = *local_d8 + local_d0 * 8;
      if (lVar9 != local_d8[1]) {
        local_d8[1] = lVar9;
      }
      if (*(long *)(lVar4 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
        FUN_00c2c090(uVar8);
      }
    }
    goto LAB_008672d0;
  }
  uStack_a8 = *(undefined8 *)(param_1 + 0xa8);
  uStack_b0 = *(undefined8 *)(param_1 + 0xa0);
  iVar17 = *(int *)(param_1 + 0x90);
  uStack_b8 = (undefined4)*(undefined8 *)(param_1 + 0x98);
  uStack_b4 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x98) >> 0x20);
  local_c0 = (int)*(undefined8 *)(param_1 + 0x90);
  uStack_bc = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x90) >> 0x20);
  if (iVar17 == 0x28) {
    FUN_00858f2c(param_1);
    local_d8 = (long *)(param_1 + 0x360);
    lVar9 = 0;
    local_e0 = 0;
    local_f8 = 0;
    local_110 = 0;
    *(int *)(*(long *)(param_1 + 0x1e8) + 0x41c) = *(int *)(*(long *)(param_1 + 0x1e8) + 0x41c) + 1;
    local_f0 = (long *)(param_1 + 0x438);
    local_d0 = *(long *)(param_1 + 0x368) - *(long *)(param_1 + 0x360) >> 3;
    lStack_e8 = *(long *)(param_1 + 0x440) - *(long *)(param_1 + 0x438) >> 5;
    local_c8 = 0;
    lStack_100 = *(long *)(param_1 + 0x458) - *(long *)(param_1 + 0x450) >> 3;
    local_108 = (long *)(param_1 + 0x450);
    local_120 = (long *)(param_1 + 0x468);
    lStack_118 = *(long *)(param_1 + 0x470) - *(long *)(param_1 + 0x468) >> 3;
    if (*(int *)(param_1 + 0x90) != 0x29) {
      pplVar2 = &local_120;
      pplVar1 = &local_108;
      if (*(char *)(param_1 + 0x68) == '\0') {
        pplVar1 = (long **)0x0;
        pplVar2 = (long **)0x0;
      }
                    /* try { // try from 00866718 to 00866727 has its CatchHandler @ 008671f0 */
      lVar9 = FUN_00866148(param_1,&local_d8,&local_f0,pplVar1,pplVar2);
    }
    local_130 = CONCAT44(uStack_b8,uStack_bc);
    uStack_128 = *(undefined8 *)(param_1 + 0x9c);
    local_a0 = local_c0;
    uStack_9c = uStack_bc;
    uStack_98 = uStack_b8;
    if (*(int *)(param_1 + 0x90) == 0x29) {
                    /* try { // try from 00866754 to 0086675b has its CatchHandler @ 00867204 */
      FUN_00858f2c(param_1);
LAB_00866870:
      local_138 = *(undefined8 *)(param_1 + 0xb0);
      bVar6 = true;
    }
    else {
                    /* try { // try from 00866848 to 0086686b has its CatchHandler @ 00867204 */
      FUN_0086b5f8(param_1,0x29,&local_a0,0);
      uVar13 = FUN_0086e434(param_1,0x29);
      if ((uVar13 & 1) != 0) goto LAB_00866870;
      bVar6 = false;
      local_138 = 0xffffffffffffffff;
    }
    uVar13 = local_c8;
    lVar21 = local_d0;
    lVar16 = local_e0;
    *(int *)(*(long *)(param_1 + 0x1e8) + 0x41c) = *(int *)(*(long *)(param_1 + 0x1e8) + 0x41c) + -1
    ;
    iVar17 = *(int *)(param_1 + 0x90);
    if ((iVar17 == 0x107) || (local_e0 != 0)) {
      uVar8 = *(undefined8 *)(param_1 + 0x94);
      local_a0 = 0;
      uStack_9c = 0;
      uStack_98 = 0;
      uStack_94 = 0;
      if (local_c8 != 0) {
        lVar25 = *local_d8;
                    /* try { // try from 00866970 to 00866973 has its CatchHandler @ 008671fc */
        lVar23 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),local_c8 << 3);
        if ((uVar13 < 8) || (lVar18 = lVar21 * 8 + lVar25, (ulong)(lVar23 - lVar18) < 0x20)) {
          uVar19 = 0;
        }
        else {
          uVar19 = uVar13 & 0xfffffffffffffffc;
          puVar12 = (undefined8 *)(lVar23 + 0x10);
          puVar15 = (undefined8 *)(lVar18 + 0x10);
          uVar20 = uVar19;
          do {
            puVar5 = puVar15 + -1;
            uVar11 = puVar15[-2];
            uVar26 = puVar15[1];
            uVar14 = *puVar15;
            uVar20 = uVar20 - 4;
            puVar15 = puVar15 + 4;
            puVar12[-1] = *puVar5;
            puVar12[-2] = uVar11;
            puVar12[1] = uVar26;
            *puVar12 = uVar14;
            puVar12 = puVar12 + 4;
          } while (uVar20 != 0);
          if (uVar13 == uVar19) goto LAB_00866a2c;
        }
        lVar18 = uVar13 - uVar19;
        puVar12 = (undefined8 *)(lVar25 + uVar19 * 8 + lVar21 * 8);
        puVar15 = (undefined8 *)(lVar23 + uVar19 * 8);
        do {
          lVar18 = lVar18 + -1;
          *puVar15 = *puVar12;
          puVar12 = puVar12 + 1;
          puVar15 = puVar15 + 1;
        } while (lVar18 != 0);
      }
LAB_00866a2c:
      lVar21 = lStack_e8;
      if (lVar16 != 0) {
        lVar23 = *local_f0;
                    /* try { // try from 00866a40 to 00866a93 has its CatchHandler @ 008671fc */
        puVar15 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),lVar16 << 5);
        puVar12 = (undefined8 *)(lVar23 + lVar21 * 0x20);
        do {
          uVar26 = *puVar12;
          uVar14 = puVar12[3];
          uVar11 = puVar12[2];
          lVar16 = lVar16 + -1;
          puVar15[1] = puVar12[1];
          *puVar15 = uVar26;
          puVar15[3] = uVar14;
          puVar15[2] = uVar11;
          puVar12 = puVar12 + 4;
          puVar15 = puVar15 + 4;
        } while (lVar16 != 0);
      }
      lVar21 = FUN_00867cac(param_1,&local_c0,&local_a0,0,0,0,0);
      uVar13 = local_110;
      lVar16 = lStack_118;
      if ((*(char *)(param_1 + 0x68) == '\x01') && (*(int *)(lVar21 + 8) == DAT_00d1b260)) {
        uVar11 = *(undefined8 *)(param_1 + 0xe8);
        if (local_110 == 0) {
          local_158 = 0;
        }
        else {
          lVar23 = *local_120;
                    /* try { // try from 00866ad0 to 00866ad7 has its CatchHandler @ 008671c4 */
          local_158 = FUN_0084e938(uVar11,local_110 << 3);
          if ((uVar13 < 8) || (lVar25 = lVar16 * 8 + lVar23, (ulong)(local_158 - lVar25) < 0x20)) {
            uVar19 = 0;
          }
          else {
            uVar19 = uVar13 & 0xfffffffffffffffc;
            puVar12 = (undefined8 *)(local_158 + 0x10);
            puVar15 = (undefined8 *)(lVar25 + 0x10);
            uVar20 = uVar19;
            do {
              puVar5 = puVar15 + -1;
              uVar14 = puVar15[-2];
              uVar27 = puVar15[1];
              uVar26 = *puVar15;
              uVar20 = uVar20 - 4;
              puVar15 = puVar15 + 4;
              puVar12[-1] = *puVar5;
              puVar12[-2] = uVar14;
              puVar12[1] = uVar27;
              *puVar12 = uVar26;
              puVar12 = puVar12 + 4;
            } while (uVar20 != 0);
            if (uVar13 == uVar19) goto LAB_00866d74;
          }
          lVar25 = uVar13 - uVar19;
          puVar12 = (undefined8 *)(lVar23 + uVar19 * 8 + lVar16 * 8);
          puVar15 = (undefined8 *)(local_158 + uVar19 * 8);
          do {
            lVar25 = lVar25 + -1;
            *puVar15 = *puVar12;
            puVar12 = puVar12 + 1;
            puVar15 = puVar15 + 1;
          } while (lVar25 != 0);
        }
LAB_00866d74:
        uVar19 = local_f8;
        lVar16 = lStack_100;
        if (local_f8 == 0) {
          lVar23 = 0;
        }
        else {
          lVar25 = *local_108;
                    /* try { // try from 00866d90 to 00866d93 has its CatchHandler @ 008671e4 */
          lVar23 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),local_f8 << 3);
          if ((uVar19 < 8) || (lVar18 = lVar16 * 8 + lVar25, (ulong)(lVar23 - lVar18) < 0x20)) {
            uVar20 = 0;
          }
          else {
            uVar20 = uVar19 & 0xfffffffffffffffc;
            puVar12 = (undefined8 *)(lVar23 + 0x10);
            puVar15 = (undefined8 *)(lVar18 + 0x10);
            uVar22 = uVar20;
            do {
              puVar5 = puVar15 + -1;
              uVar14 = puVar15[-2];
              uVar27 = puVar15[1];
              uVar26 = *puVar15;
              uVar22 = uVar22 - 4;
              puVar15 = puVar15 + 4;
              puVar12[-1] = *puVar5;
              puVar12[-2] = uVar14;
              puVar12[1] = uVar27;
              *puVar12 = uVar26;
              puVar12 = puVar12 + 4;
            } while (uVar22 != 0);
            if (uVar19 == uVar20) goto LAB_00866e20;
          }
          lVar18 = uVar19 - uVar20;
          puVar12 = (undefined8 *)(lVar25 + uVar20 * 8 + lVar16 * 8);
          puVar15 = (undefined8 *)(lVar23 + uVar20 * 8);
          do {
            lVar18 = lVar18 + -1;
            *puVar15 = *puVar12;
            puVar12 = puVar12 + 1;
            puVar15 = puVar15 + 1;
          } while (lVar18 != 0);
        }
LAB_00866e20:
                    /* try { // try from 00866e20 to 00866e57 has its CatchHandler @ 008671e4 */
        uVar11 = FUN_0084e938(uVar11,0x60);
        FUN_008520e0(uVar11,0xffffffffffffffff,0,0,0xffffffffffffffff,local_130,local_158,uVar13,
                     lVar23,uVar19,local_138,uVar8,lVar9);
        local_a0 = (int)lVar21;
        uStack_9c = (undefined4)((ulong)lVar21 >> 0x20);
                    /* try { // try from 00866e5c to 00866e67 has its CatchHandler @ 008671d0 */
        puVar12 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_a0);
        *puVar12 = uVar11;
      }
      uStack_148 = *(undefined8 *)(lVar21 + 0x14);
      uVar8 = *(undefined8 *)(param_1 + 0xe8);
      local_150 = local_130;
                    /* try { // try from 00866e7c to 00866eb7 has its CatchHandler @ 00867200 */
      plVar10 = (long *)FUN_0084e938(uVar8,8);
      *plVar10 = lVar21;
      uVar8 = FUN_0084e938(uVar8,0x38);
      local_90 = 0;
      local_a0 = (int)plVar10;
      uStack_9c = (undefined4)((ulong)plVar10 >> 0x20);
      uStack_98 = 1;
      uStack_94 = 0;
      FUN_00851204(uVar8,&local_150,&local_a0);
      if (*(char *)(param_1 + 0x68) == '\x01') {
                    /* try { // try from 00866ec8 to 00866ed7 has its CatchHandler @ 008671ec */
        uVar11 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x28);
        FUN_0085218c();
        local_a0 = (int)uVar8;
        uStack_9c = (undefined4)((ulong)uVar8 >> 0x20);
                    /* try { // try from 00866edc to 00866ee7 has its CatchHandler @ 008671d8 */
        puVar12 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_a0);
        goto LAB_00866f58;
      }
    }
    else {
      local_90 = lVar9;
      if (local_c8 == 1) {
        if (DAT_00d1ecc0 == 1) {
          if ((lVar9 != 0) || (((iVar17 != 0x26 && (iVar17 != 0x7c)) && (iVar17 != 0x3f))))
          goto LAB_00866b28;
                    /* try { // try from 008668f4 to 008668ff has its CatchHandler @ 008671c8 */
          uVar11 = FUN_008672d4(*(undefined8 *)(param_1 + 0xe8),&local_130,*local_d8 + local_d0 * 8)
          ;
          uVar8 = local_138;
          if (*(char *)(param_1 + 0x68) == '\x01') {
                    /* try { // try from 00866918 to 0086692f has its CatchHandler @ 008671b4 */
            uVar14 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0xc);
            if (!bVar6) {
              uVar8 = 0xffffffffffffffff;
            }
            FUN_00852178(uVar14,uVar8);
            local_a0 = (int)uVar11;
            uStack_9c = (undefined4)((ulong)uVar11 >> 0x20);
                    /* try { // try from 00866934 to 0086693f has its CatchHandler @ 008671ac */
            puVar12 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_a0);
            *puVar12 = uVar14;
            bVar6 = true;
          }
          else {
            bVar6 = true;
          }
        }
        else {
          if (lVar9 == 0) {
                    /* try { // try from 00866d14 to 00866d1f has its CatchHandler @ 008671c8 */
            uVar11 = FUN_008672d4(*(undefined8 *)(param_1 + 0xe8),&local_130,
                                  *local_d8 + local_d0 * 8);
            uVar8 = local_138;
            if (*(char *)(param_1 + 0x68) == '\x01') {
                    /* try { // try from 00866d38 to 00866d4f has its CatchHandler @ 008671b8 */
              uVar14 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0xc);
              if (!bVar6) {
                uVar8 = 0xffffffffffffffff;
              }
              FUN_00852178(uVar14,uVar8);
              local_a0 = (int)uVar11;
              uStack_9c = (undefined4)((ulong)uVar11 >> 0x20);
                    /* try { // try from 00866d54 to 00866d5f has its CatchHandler @ 008671b0 */
              puVar12 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_a0);
              bVar6 = false;
              *puVar12 = uVar14;
              goto LAB_00866b38;
            }
          }
          else {
LAB_00866b28:
            uVar11 = *(undefined8 *)(*local_d8 + local_d0 * 8);
          }
          bVar6 = false;
        }
LAB_00866b38:
                    /* try { // try from 00866b3c to 00866b47 has its CatchHandler @ 008671e0 */
        lVar16 = FUN_00867310(param_1,uVar11,(ulong)&local_c0 | 4);
        if (((lVar9 != 0) && ((DAT_00d1ec20 & 1) != 0)) &&
           ((*(int *)(lVar16 + 8) == DAT_00d1b290 || (*(int *)(lVar16 + 8) == DAT_00d1b2a0)))) {
          DAT_00d1ed20 = 1;
        }
        uVar8 = *(undefined8 *)(param_1 + 0xe8);
        uStack_148 = uStack_128;
        local_150 = local_130;
                    /* try { // try from 00866b98 to 00866bd3 has its CatchHandler @ 008671f8 */
        plVar10 = (long *)FUN_0084e938(uVar8,8);
        *plVar10 = lVar16;
        uVar8 = FUN_0084e938(uVar8,0x38);
        local_a0 = (int)plVar10;
        uStack_9c = (undefined4)((ulong)plVar10 >> 0x20);
        uStack_98 = 1;
        uStack_94 = 0;
        FUN_00851204(uVar8,&local_150,&local_a0);
        if (((DAT_00d1ecc0 & 1) == 0) || ((*(byte *)(param_1 + 0x68) & 1) == 0)) {
          if ((*(byte *)(param_1 + 0x68) & 1) == 0) goto LAB_00866f5c;
          uVar11 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x28);
          FUN_0085218c();
          local_a0 = (int)uVar8;
          uStack_9c = (undefined4)((ulong)uVar8 >> 0x20);
                    /* try { // try from 00866c20 to 00866c2b has its CatchHandler @ 008671cc */
          puVar12 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_a0);
        }
        else {
          uVar11 = *(undefined8 *)(param_1 + 0xe8);
          if (bVar6) {
                    /* try { // try from 00866bec to 00866c1b has its CatchHandler @ 008671dc */
            uVar11 = FUN_0084e938(uVar11,0x28);
            FUN_0085218c();
          }
          else {
                    /* try { // try from 00866f20 to 00866f43 has its CatchHandler @ 008671c0 */
            auVar28 = FUN_00861ad0(param_1,&local_108);
            local_a0 = auVar28._0_4_;
            uStack_9c = auVar28._4_4_;
            uStack_98 = auVar28._8_4_;
            uStack_94 = auVar28._12_4_;
            uVar11 = FUN_00867c60(uVar11,&local_130,&local_138,&local_a0);
          }
                    /* try { // try from 00866f4c to 00866f57 has its CatchHandler @ 008671bc */
          local_150 = uVar8;
          puVar12 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_150);
        }
LAB_00866f58:
        *puVar12 = uVar11;
      }
      else {
        uVar8 = *(undefined8 *)(param_1 + 0xe8);
        if (local_c8 == 0) {
          lVar9 = 0;
        }
        else {
          lVar16 = *local_d8;
                    /* try { // try from 008669d4 to 008669db has its CatchHandler @ 008671f4 */
          lVar9 = FUN_0084e938(uVar8,local_c8 << 3);
          if ((uVar13 < 8) || (lVar23 = lVar21 * 8 + lVar16, (ulong)(lVar9 - lVar23) < 0x20)) {
            uVar19 = 0;
          }
          else {
            uVar19 = uVar13 & 0xfffffffffffffffc;
            puVar12 = (undefined8 *)(lVar9 + 0x10);
            puVar15 = (undefined8 *)(lVar23 + 0x10);
            uVar20 = uVar19;
            do {
              puVar5 = puVar15 + -1;
              uVar11 = puVar15[-2];
              uVar26 = puVar15[1];
              uVar14 = *puVar15;
              uVar20 = uVar20 - 4;
              puVar15 = puVar15 + 4;
              puVar12[-1] = *puVar5;
              puVar12[-2] = uVar11;
              puVar12[1] = uVar26;
              *puVar12 = uVar14;
              puVar12 = puVar12 + 4;
            } while (uVar20 != 0);
            if (uVar13 == uVar19) goto LAB_00866c34;
          }
          lVar23 = uVar13 - uVar19;
          puVar12 = (undefined8 *)(lVar16 + uVar19 * 8 + lVar21 * 8);
          puVar15 = (undefined8 *)(lVar9 + uVar19 * 8);
          do {
            lVar23 = lVar23 + -1;
            *puVar15 = *puVar12;
            puVar12 = puVar12 + 1;
            puVar15 = puVar15 + 1;
          } while (lVar23 != 0);
        }
LAB_00866c34:
                    /* try { // try from 00866c34 to 00866c57 has its CatchHandler @ 008671f4 */
        uVar8 = FUN_0084e938(uVar8,0x38);
        local_a0 = (int)lVar9;
        uStack_9c = (undefined4)((ulong)lVar9 >> 0x20);
        uStack_98 = (undefined4)uVar13;
        uStack_94 = (undefined4)(uVar13 >> 0x20);
        FUN_00851204(uVar8,&local_130,&local_a0);
        uVar13 = local_f8;
        lVar9 = lStack_100;
        if (*(char *)(param_1 + 0x68) == '\x01') {
          uVar11 = *(undefined8 *)(param_1 + 0xe8);
          if (local_f8 == 0) {
            lVar16 = 0;
          }
          else {
            lVar21 = *local_108;
                    /* try { // try from 00866c7c to 00866c83 has its CatchHandler @ 008671e8 */
            lVar16 = FUN_0084e938(uVar11,local_f8 << 3);
            if ((uVar13 < 8) || (lVar23 = lVar9 * 8 + lVar21, (ulong)(lVar16 - lVar23) < 0x20)) {
              uVar19 = 0;
            }
            else {
              uVar19 = uVar13 & 0xfffffffffffffffc;
              puVar12 = (undefined8 *)(lVar16 + 0x10);
              puVar15 = (undefined8 *)(lVar23 + 0x10);
              uVar20 = uVar19;
              do {
                puVar5 = puVar15 + -1;
                uVar14 = puVar15[-2];
                uVar27 = puVar15[1];
                uVar26 = *puVar15;
                uVar20 = uVar20 - 4;
                puVar15 = puVar15 + 4;
                puVar12[-1] = *puVar5;
                puVar12[-2] = uVar14;
                puVar12[1] = uVar27;
                *puVar12 = uVar26;
                puVar12 = puVar12 + 4;
              } while (uVar20 != 0);
              if (uVar13 == uVar19) goto LAB_00866de4;
            }
            lVar23 = uVar13 - uVar19;
            puVar12 = (undefined8 *)(lVar21 + uVar19 * 8 + lVar9 * 8);
            puVar15 = (undefined8 *)(lVar16 + uVar19 * 8);
            do {
              lVar23 = lVar23 + -1;
              *puVar15 = *puVar12;
              puVar12 = puVar12 + 1;
              puVar15 = puVar15 + 1;
            } while (lVar23 != 0);
          }
LAB_00866de4:
                    /* try { // try from 00866de4 to 00866e03 has its CatchHandler @ 008671e8 */
          uVar11 = FUN_0084e938(uVar11,0x28);
          FUN_008521ac(uVar11,local_130,local_138,lVar16,uVar13);
          local_a0 = (int)uVar8;
          uStack_9c = (undefined4)((ulong)uVar8 >> 0x20);
                    /* try { // try from 00866e08 to 00866e13 has its CatchHandler @ 008671d4 */
          puVar12 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_a0);
          *puVar12 = uVar11;
        }
      }
    }
LAB_00866f5c:
    lVar9 = *local_120 + lStack_118 * 8;
    if (lVar9 != local_120[1]) {
      local_120[1] = lVar9;
    }
    lVar9 = *local_108 + lStack_100 * 8;
    if (lVar9 != local_108[1]) {
      local_108[1] = lVar9;
    }
    lVar9 = *local_f0;
    lVar16 = local_f0[1];
    lVar21 = lStack_e8 * 0x20;
    if (lVar21 + lVar9 != lVar16) {
      lVar23 = lVar9 + lVar21;
      if (lVar23 + (lVar16 - (lVar21 + lVar9)) != lVar16) {
        lVar23 = lVar16 - lVar9;
        do {
          puVar12 = (undefined8 *)(lVar9 + lVar21);
          puVar15 = (undefined8 *)(lVar9 + lVar23);
          cVar3 = *(char *)(puVar12 + 3);
          if (cVar3 == *(char *)(puVar15 + 3)) {
            if (cVar3 != '\0') {
              puVar12 = (undefined8 *)(lVar9 + lVar23);
              puVar15 = (undefined8 *)(lVar9 + lVar21);
              *puVar15 = *puVar12;
              uVar11 = puVar12[1];
              puVar15[2] = puVar12[2];
              puVar15[1] = uVar11;
            }
          }
          else if (cVar3 == '\0') {
            uVar11 = puVar15[2];
            uVar26 = puVar15[1];
            uVar14 = *puVar15;
            *(undefined1 *)(puVar12 + 3) = 1;
            puVar12[2] = uVar11;
            puVar12[1] = uVar26;
            *puVar12 = uVar14;
          }
          else {
            *(undefined1 *)(puVar12 + 3) = 0;
          }
          lVar9 = lVar9 + 0x20;
        } while (lVar9 + lVar23 != lVar16);
        lVar23 = lVar9 + lVar21;
      }
      local_f0[1] = lVar23;
    }
    lVar9 = *local_d8 + local_d0 * 8;
    if (lVar9 != local_d8[1]) {
      local_d8[1] = lVar9;
    }
  }
  else if (iVar17 == 0x106) {
LAB_00866658:
    uVar8 = FUN_00866418(param_1);
  }
  else {
    if (iVar17 == 0x119) {
      FUN_00853d20(&local_a0,param_1 + 0x70);
      if (local_a0 == 0x106) goto LAB_00866658;
      uVar24 = *(uint *)(param_1 + 0x124);
      iVar17 = *(int *)(param_1 + 0x90);
    }
    uVar8 = 0;
    uStack_98 = (undefined4)*(undefined8 *)(param_1 + 0x9c);
    uStack_94 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 0x20);
    local_a0 = (int)*(undefined8 *)(param_1 + 0x94);
    uStack_9c = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x94) >> 0x20);
    if ((iVar17 != 0x26) && (iVar17 != 0x7c)) {
      uVar8 = FUN_008695d4(param_1,0,0);
      *(uint *)(param_1 + 0x124) = uVar24;
    }
    lVar9 = FUN_00867310(param_1,uVar8,&local_a0);
    uVar8 = *(undefined8 *)(param_1 + 0xe8);
    *(uint *)(param_1 + 0x124) = uVar24;
    plVar10 = (long *)FUN_0084e938(uVar8,8);
    *plVar10 = lVar9;
    uVar8 = FUN_0084e938(uVar8,0x38);
    local_a0 = (int)plVar10;
    uStack_9c = (undefined4)((ulong)plVar10 >> 0x20);
    uStack_98 = 1;
    uStack_94 = 0;
    local_90 = 0;
    FUN_00851204(uVar8,lVar9 + 0xc,&local_a0);
    if (*(char *)(param_1 + 0x68) == '\x01') {
      uVar11 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x28);
      FUN_0085218c();
      local_a0 = (int)uVar8;
      uStack_9c = (undefined4)((ulong)uVar8 >> 0x20);
      puVar12 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_a0);
      *puVar12 = uVar11;
    }
  }
  if (*(long *)(lVar4 + 0x28) == local_78) {
    return uVar8;
  }
LAB_008672d0:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

