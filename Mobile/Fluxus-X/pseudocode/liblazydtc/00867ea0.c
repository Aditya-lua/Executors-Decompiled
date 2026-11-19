/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00867ea0
 */

/* WARNING: Removing unreachable block (ram,0x00868a58) */
/* WARNING: Removing unreachable block (ram,0x008687a4) */
/* WARNING: Removing unreachable block (ram,0x008687e0) */
/* WARNING: Removing unreachable block (ram,0x00868a94) */

undefined8 FUN_00867ea0(long param_1,uint param_2)

{
  long *plVar1;
  long *plVar2;
  undefined4 uVar3;
  long lVar4;
  uint uVar5;
  uint uVar6;
  int iVar7;
  void *pvVar8;
  ulong uVar9;
  undefined8 *puVar10;
  undefined8 uVar11;
  uint uVar12;
  long lVar13;
  long lVar14;
  uint uVar15;
  undefined8 *puVar16;
  undefined8 *puVar17;
  undefined8 *puVar18;
  undefined1 uVar19;
  undefined8 uVar20;
  long lVar21;
  char *__s1;
  undefined1 uVar22;
  undefined8 uVar23;
  uint *puVar24;
  undefined8 uVar25;
  undefined8 *puVar26;
  long lVar27;
  undefined4 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  uint local_22c;
  undefined4 local_20c;
  long local_1d8;
  long local_1c0;
  long local_1a0;
  undefined8 local_190;
  undefined8 uStack_188;
  undefined8 uStack_180;
  undefined8 uStack_178;
  undefined8 local_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 local_150;
  undefined8 uStack_148;
  uint local_140;
  uint uStack_13c;
  uint uStack_138;
  undefined4 uStack_134;
  undefined8 uStack_130;
  undefined8 uStack_128;
  uint local_118;
  undefined8 *local_114;
  undefined1 local_10c [16];
  undefined1 local_fc;
  undefined8 *local_f8;
  uint local_f0;
  uint uStack_ec;
  char cStack_e8;
  undefined7 uStack_e7;
  undefined8 local_e0;
  undefined1 local_d4 [16];
  undefined1 local_c4;
  uint local_c0;
  uint uStack_bc;
  uint uStack_b8;
  uint uStack_b4;
  uint uStack_b0;
  undefined4 uStack_ac;
  undefined4 local_a8;
  int iStack_a4;
  undefined4 local_a0;
  undefined4 uStack_9c;
  undefined4 uStack_98;
  undefined4 uStack_94;
  undefined4 uStack_90;
  undefined4 local_8c;
  undefined7 local_88;
  undefined1 uStack_81;
  undefined7 uStack_80;
  long local_78;
  
  uVar5 = DAT_00d1eba0;
  lVar4 = tpidr_el0;
  local_78 = *(long *)(lVar4 + 0x28);
  uVar12 = *(int *)(param_1 + 0x124) + 1;
  *(uint *)(param_1 + 0x124) = uVar12;
  if (uVar5 < uVar12) {
    if (*(long *)(lVar4 + 0x28) == local_78) {
      uVar23 = FUN_008578f8(param_1 + 0x94,
                            "Exceeded allowed recursion depth; simplify your %s to make the code compile"
                            ,"type annotation");
                    /* catch() { ... } // from try @ 00868934 with catch @ 008689b4 */
                    /* catch() { ... } // from try @ 00868328 with catch @ 00868a2c
                       catch() { ... } // from try @ 00868424 with catch @ 00868a2c */
      lVar14 = local_1d8 + *(long *)(param_1 + 0x348);
      if (lVar14 != *(long *)(param_1 + 0x350)) {
        *(long *)(param_1 + 0x350) = lVar14;
      }
      lVar14 = local_1c0 + *(long *)(param_1 + 0x330);
      if (lVar14 != *(long *)(param_1 + 0x338)) {
        *(long *)(param_1 + 0x338) = lVar14;
      }
      if (*(long *)(lVar4 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
        FUN_00c2c090(uVar23);
      }
    }
  }
  else {
    puVar24 = (uint *)(param_1 + 0x90);
    local_118 = *puVar24;
    lVar13 = *(long *)(param_1 + 0x338) - *(long *)(param_1 + 0x330);
    puVar18 = (undefined8 *)(param_1 + 0x94);
    puVar17 = (undefined8 *)*puVar18;
    lVar14 = *(long *)(param_1 + 0x350) - *(long *)(param_1 + 0x348);
    local_114 = puVar17;
    if (local_118 == 0x7b) {
                    /* try { // try from 00867f38 to 00867f57 has its CatchHandler @ 008689ec */
      FUN_00858f2c(param_1);
    }
    else {
      FUN_0086e3b4(param_1,0x7b,"table type");
    }
    uVar5 = uStack_bc;
    uVar12 = *puVar24;
    plVar1 = (long *)(param_1 + 0x330);
    plVar2 = (long *)(param_1 + 0x348);
    uVar15 = (uint)puVar17;
    uStack_bc = (uint)((ulong)puVar17 >> 0x20);
    uVar6 = uStack_bc;
    uStack_bc = uVar5;
    if (uVar12 == 0x7d) {
      puVar26 = (undefined8 *)0x0;
      local_1a0 = 0;
      lVar27 = 0;
    }
    else {
      lVar27 = 0;
      puVar26 = (undefined8 *)0x0;
      lVar21 = param_1 + 0x70;
      local_1a0 = 0;
      puVar16 = (undefined8 *)((ulong)&local_140 | 4);
      do {
                    /* try { // try from 0086803c to 00868047 has its CatchHandler @ 00868a24 */
        if (((uVar12 == 0x119) && (FUN_00853d20(&local_c0,lVar21), local_c0 != 0x3a)) &&
           (__s1 = *(char **)(param_1 + 0xa8), __s1 != (char *)0x0)) {
          iVar7 = strcmp(__s1,"read");
          if (iVar7 == 0) {
            uVar19 = *(undefined1 *)puVar18;
            local_88 = (undefined7)*(undefined8 *)(param_1 + 0x95);
            uStack_81 = (undefined1)*(undefined8 *)(param_1 + 0x9c);
            uStack_80 = (undefined7)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 8);
                    /* try { // try from 00868424 to 0086845b has its CatchHandler @ 00868a2c */
            FUN_00853424(lVar21);
            uVar22 = 1;
            uVar28 = 1;
          }
          else {
            iVar7 = strcmp(__s1,"write");
            if (iVar7 != 0) goto LAB_00868084;
            uVar19 = *(undefined1 *)puVar18;
            local_88 = (undefined7)*(undefined8 *)(param_1 + 0x95);
            uStack_81 = (undefined1)*(undefined8 *)(param_1 + 0x9c);
            uStack_80 = (undefined7)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 8);
            FUN_00853424(lVar21);
            uVar28 = 2;
            uVar22 = 1;
          }
        }
        else {
LAB_00868084:
          uVar19 = 0;
          uVar22 = 0;
          uVar28 = 3;
        }
        uVar12 = *puVar24;
        if (uVar12 != 0x5b) {
          if ((lVar27 == 0) && (puVar26 == (undefined8 *)0x0)) {
            if (uVar12 == 0x119) {
                    /* try { // try from 00868120 to 0086812b has its CatchHandler @ 00868a08 */
              FUN_00853d20(&local_c0,lVar21);
              uVar12 = *puVar24;
              if (local_c0 == 0x3a) goto LAB_0086813c;
            }
            uVar3 = *(undefined4 *)(param_1 + 0x124);
            uVar23 = 0;
            uStack_b8 = (uint)*(undefined8 *)(param_1 + 0x9c);
            uStack_b4 = (uint)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 0x20);
            local_c0 = (uint)*puVar18;
            uStack_bc = (uint)((ulong)*puVar18 >> 0x20);
            if ((uVar12 != 0x26) && (uVar12 != 0x7c)) {
                    /* try { // try from 00868864 to 00868887 has its CatchHandler @ 008689bc */
              uVar23 = FUN_008695d4(param_1,0,0);
              *(undefined4 *)(param_1 + 0x124) = uVar3;
            }
            lVar27 = FUN_00867310(param_1,uVar23,&local_c0);
            *(undefined4 *)(param_1 + 0x124) = uVar3;
            local_f8 = puVar17;
            local_f0 = uVar15;
            uStack_ec = uVar6;
                    /* try { // try from 008688a4 to 008688e3 has its CatchHandler @ 008689c4 */
            uVar23 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x78);
            local_c0 = local_c0 & 0xffffff00;
            uStack_b0 = uStack_b0 & 0xffffff00;
            local_140 = 0;
            uStack_13c = 0;
            uStack_138 = 0;
            uStack_134 = 0;
            FUN_00850b3c(uVar23,&local_f8,0,0,*(undefined8 *)(param_1 + 0x130),&local_c0,&local_f8,0
                         ,&local_140,0);
            uStack_b8 = (uint)*(undefined8 *)(lVar27 + 0x14);
            uStack_b4 = (uint)((ulong)*(undefined8 *)(lVar27 + 0x14) >> 0x20);
            local_c0 = (uint)*(undefined8 *)(lVar27 + 0xc);
            uStack_bc = (uint)((ulong)*(undefined8 *)(lVar27 + 0xc) >> 0x20);
                    /* try { // try from 008688f0 to 008688f7 has its CatchHandler @ 008689b8 */
            puVar26 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x38);
            *puVar26 = uVar23;
            puVar26[1] = lVar27;
            lVar27 = 0;
            uVar23 = 1;
            *(undefined4 *)(puVar26 + 4) = uVar28;
            puVar26[3] = CONCAT44(uStack_b4,uStack_b8);
            puVar26[2] = CONCAT44(uStack_bc,local_c0);
            *(undefined1 *)((long)puVar26 + 0x24) = uVar19;
            *(ulong *)((long)puVar26 + 0x25) = CONCAT17(uStack_81,local_88);
            *(ulong *)((long)puVar26 + 0x2c) = CONCAT71(uStack_80,uStack_81);
            *(undefined1 *)((long)puVar26 + 0x34) = uVar22;
          }
          else {
LAB_0086813c:
            if (uVar12 == 0x119) {
              uVar23 = *(undefined8 *)(param_1 + 0xa8);
              uStack_138 = (uint)*(undefined8 *)(param_1 + 0x9c);
              uStack_134 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 0x20);
              local_140 = (uint)*puVar18;
              uStack_13c = (uint)((ulong)*puVar18 >> 0x20);
                    /* try { // try from 00868154 to 0086815b has its CatchHandler @ 00868a18 */
              FUN_00858f2c(param_1);
              if (*puVar24 == 0x3a) {
                    /* try { // try from 00868168 to 0086816f has its CatchHandler @ 00868a14 */
                FUN_00858f2c(param_1);
                uVar20 = *(undefined8 *)(param_1 + 0xb0);
              }
              else {
                    /* try { // try from 008681dc to 008681ef has its CatchHandler @ 00868a14 */
                FUN_0086e3b4(param_1,0x3a,"table field");
                uVar20 = 0xffffffffffffffff;
              }
              uVar25 = 0;
              uVar3 = *(undefined4 *)(param_1 + 0x124);
              uStack_b8 = (uint)*(undefined8 *)(param_1 + 0x9c);
              uStack_b4 = (uint)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 0x20);
              local_c0 = (uint)*puVar18;
              uStack_bc = (uint)((ulong)*puVar18 >> 0x20);
              if ((*(int *)(param_1 + 0x90) != 0x26) && (*(int *)(param_1 + 0x90) != 0x7c)) {
                    /* try { // try from 00868220 to 00868247 has its CatchHandler @ 00868a28 */
                uVar25 = FUN_008695d4(param_1,0,param_2 & 1);
                *(undefined4 *)(param_1 + 0x124) = uVar3;
              }
              uVar25 = FUN_00867310(param_1,uVar25,&local_c0);
              *(undefined4 *)(param_1 + 0x124) = uVar3;
              uStack_b0 = uStack_138;
              uStack_ac = uStack_134;
              uStack_b8 = local_140;
              uStack_b4 = uStack_13c;
              local_c0 = (uint)uVar23;
              uStack_bc = (uint)((ulong)uVar23 >> 0x20);
              local_a8 = (undefined4)uVar25;
              iStack_a4 = (int)((ulong)uVar25 >> 0x20);
              uStack_9c._1_3_ = (undefined3)local_88;
              uStack_9c = CONCAT31(uStack_9c._1_3_,uVar19);
              uStack_98 = (undefined4)((uint7)local_88 >> 0x18);
              uStack_94 = (undefined4)CONCAT71(uStack_80,uStack_81);
              uStack_90 = (undefined4)((uint7)uStack_80 >> 0x18);
              local_8c = CONCAT31(local_8c._1_3_,uVar22);
                    /* try { // try from 00868280 to 0086828b has its CatchHandler @ 00868a10 */
              local_a0 = uVar28;
              FUN_00872148(plVar1,&local_c0);
              if (*(char *)(param_1 + 0x68) == '\x01') {
                uVar12 = *puVar24;
                *(undefined8 *)((ulong)&local_c0 | 4) = 0xffffffffffffffff;
                ((undefined8 *)((ulong)&local_c0 | 4))[1] = 0xffffffffffffffff;
                iVar7 = 1;
                if (uVar12 != 0x3b) {
                  iVar7 = 2;
                }
                uStack_ac = (undefined4)uVar20;
                local_a8 = (undefined4)((ulong)uVar20 >> 0x20);
                iStack_a4 = 0;
                if (uVar12 != 0x2c) {
                  iStack_a4 = iVar7;
                }
                local_c0 = 1;
                uVar23 = *puVar18;
                if (iStack_a4 == 2) {
                  uVar23 = 0xffffffffffffffff;
                }
                local_a0 = (undefined4)uVar23;
                uStack_9c = (undefined4)((ulong)uVar23 >> 0x20);
                uStack_98 = 0;
                uStack_94 = 0;
                uStack_90 = 0;
                local_8c = 0;
                    /* try { // try from 008682ec to 008682f7 has its CatchHandler @ 00868a00 */
                FUN_0087229c(plVar2,&local_c0);
                local_1a0 = local_1a0 + 1;
              }
              lVar27 = lVar27 + 1;
              goto LAB_00868314;
            }
                    /* try { // try from 00868934 to 00868943 has its CatchHandler @ 008689b4 */
            FUN_0086e040(param_1,"table field");
            uVar23 = 0;
          }
          uVar20 = *(undefined8 *)(param_1 + 0x9c);
          if (*(int *)(param_1 + 0x90) == 0x7d) goto LAB_00867f88;
LAB_00868958:
                    /* try { // try from 00868958 to 0086897b has its CatchHandler @ 008689f4 */
          FUN_0086b5f8(param_1,0x7d,&local_118,0);
          uVar9 = FUN_0086e434(param_1,0x7d);
          if ((uVar9 & 1) == 0) {
            uVar20 = *(undefined8 *)(param_1 + 0xb8);
          }
          goto LAB_00867f90;
        }
        uStack_128 = *(undefined8 *)(param_1 + 0xa8);
        uStack_130 = *(undefined8 *)(param_1 + 0xa0);
        uStack_138 = (uint)*(undefined8 *)(param_1 + 0x98);
        uStack_134 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x98) >> 0x20);
        local_140 = (uint)*(undefined8 *)puVar24;
        uStack_13c = (uint)((ulong)*(undefined8 *)puVar24 >> 0x20);
                    /* try { // try from 008680a4 to 008680ab has its CatchHandler @ 00868a20 */
        FUN_00858f2c(param_1);
                    /* try { // try from 008680bc to 008680c7 has its CatchHandler @ 00868a0c */
        if (((*puVar24 & 0xfffffffe) == 0x116) && (FUN_00853d20(&local_c0,lVar21), local_c0 == 0x5d)
           ) {
          if (*(char *)(param_1 + 0x68) == '\x01') {
            if (*puVar24 == 0x116) {
                    /* try { // try from 00868468 to 0086846f has its CatchHandler @ 008689cc */
              local_20c = FUN_00853390(puVar24);
              local_22c = 2;
            }
            else if (*puVar24 == 0x117) {
                    /* try { // try from 008680f8 to 008680ff has its CatchHandler @ 008689cc */
              iVar7 = FUN_008533bc(puVar24);
              local_20c = 0;
              local_22c = (uint)(iVar7 == 1);
            }
            else {
              local_20c = 0;
              local_22c = 3;
            }
            puVar10 = &local_150;
            if ((*(byte *)(param_1 + 0x68) & 1) == 0) {
              puVar10 = (undefined8 *)0x0;
            }
          }
          else {
            puVar10 = (undefined8 *)0x0;
            local_20c = 0;
          }
          uVar23 = *(undefined8 *)(param_1 + 0x94);
          local_150 = 0;
          uStack_148 = 0;
                    /* try { // try from 008684a0 to 008684ab has its CatchHandler @ 008689e0 */
          FUN_00865548(&local_f8,param_1,puVar10);
          local_c0 = local_140;
          uStack_bc = uStack_13c;
          uStack_b8 = uStack_138;
          if (*puVar24 == 0x5d) {
                    /* try { // try from 008684cc to 008684fb has its CatchHandler @ 008689f0 */
            FUN_00858f2c(param_1);
LAB_00868500:
            uVar20 = *(undefined8 *)(param_1 + 0xb0);
          }
          else {
            FUN_0086b5f8(param_1,0x5d,&local_c0,0);
            uVar9 = FUN_0086e434(param_1,0x5d);
            if ((uVar9 & 1) != 0) goto LAB_00868500;
            uVar20 = 0xffffffffffffffff;
          }
          if (*puVar24 == 0x3a) {
                    /* try { // try from 0086851c to 0086853f has its CatchHandler @ 008689dc */
            FUN_00858f2c(param_1);
            uVar25 = *(undefined8 *)(param_1 + 0xb0);
          }
          else {
            FUN_0086e3b4(param_1,0x3a,"table field");
            uVar25 = 0xffffffffffffffff;
          }
          uVar11 = 0;
          uVar3 = *(undefined4 *)(param_1 + 0x124);
          uStack_b8 = (uint)*(undefined8 *)(param_1 + 0x9c);
          uStack_b4 = (uint)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 0x20);
          local_c0 = (uint)*puVar18;
          uStack_bc = (uint)((ulong)*puVar18 >> 0x20);
          if ((*(int *)(param_1 + 0x90) != 0x26) && (*(int *)(param_1 + 0x90) != 0x7c)) {
                    /* try { // try from 00868570 to 00868593 has its CatchHandler @ 008689e8 */
            uVar11 = FUN_008695d4(param_1,0,0);
            *(undefined4 *)(param_1 + 0x124) = uVar3;
          }
          uVar11 = FUN_00867310(param_1,uVar11,&local_c0);
          puVar10 = local_f8;
          *(undefined4 *)(param_1 + 0x124) = uVar3;
          if ((cStack_e8 == '\x01') &&
             (pvVar8 = memchr(local_f8,0,CONCAT44(uStack_ec,local_f0)), pvVar8 == (void *)0x0)) {
            local_c0 = (uint)puVar10;
            uStack_bc = (uint)((ulong)puVar10 >> 0x20);
            local_a8 = (undefined4)uVar11;
            iStack_a4 = (int)((ulong)uVar11 >> 0x20);
            uStack_b0 = (uint)puVar16[1];
            uStack_ac = (undefined4)((ulong)puVar16[1] >> 0x20);
            uStack_b8 = (uint)*puVar16;
            uStack_b4 = (uint)((ulong)*puVar16 >> 0x20);
            uStack_9c._1_3_ = (undefined3)local_88;
            uStack_9c = CONCAT31(uStack_9c._1_3_,uVar19);
            uStack_98 = (undefined4)((uint7)local_88 >> 0x18);
            uStack_94 = (undefined4)CONCAT71(uStack_80,uStack_81);
            uStack_90 = (undefined4)((uint7)uStack_80 >> 0x18);
            local_8c = CONCAT31(local_8c._1_3_,uVar22);
                    /* try { // try from 00868610 to 0086861b has its CatchHandler @ 008689c0 */
            local_a0 = uVar28;
            FUN_00872148(plVar1,&local_c0);
            lVar27 = lVar27 + 1;
            if (*(char *)(param_1 + 0x68) == '\x01') {
              uStack_bc = uStack_13c;
              uStack_b8 = uStack_138;
              iVar7 = 1;
              if (*(int *)(param_1 + 0x90) != 0x3b) {
                iVar7 = 2;
              }
              uStack_b4 = (uint)uVar20;
              uStack_b0 = (uint)((ulong)uVar20 >> 0x20);
              iStack_a4 = 0;
              if (*(int *)(param_1 + 0x90) != 0x2c) {
                iStack_a4 = iVar7;
              }
              uStack_ac = (undefined4)uVar25;
              local_a8 = (undefined4)((ulong)uVar25 >> 0x20);
              uVar20 = *(undefined8 *)(param_1 + 0x94);
              local_c0 = 2;
              if (iStack_a4 == 2) {
                uVar20 = 0xffffffffffffffff;
              }
              local_a0 = (undefined4)uVar20;
              uStack_9c = (undefined4)((ulong)uVar20 >> 0x20);
                    /* try { // try from 00868680 to 008686ab has its CatchHandler @ 008689c8 */
              uVar20 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x20);
              FUN_00851dd8(uVar20,local_150,uStack_148,local_22c,local_20c);
              uStack_98 = (undefined4)uVar20;
              uStack_94 = (undefined4)((ulong)uVar20 >> 0x20);
              uStack_90 = (undefined4)uVar23;
              local_8c = (undefined4)((ulong)uVar23 >> 0x20);
              FUN_0087229c(plVar2,&local_c0);
              goto LAB_008683f0;
            }
          }
          else {
                    /* try { // try from 008685bc to 008685cf has its CatchHandler @ 008689d8 */
            FUN_00860ecc(param_1,puVar16,"String literal contains malformed escape sequence or \\0")
            ;
          }
        }
        else if (puVar26 == (undefined8 *)0x0) {
          uStack_188 = CONCAT44(uStack_134,uStack_138);
          local_190 = CONCAT44(uStack_13c,local_140);
          *(undefined8 *)((ulong)local_10c | 1) = CONCAT17(uStack_81,local_88);
          *(ulong *)((long)((ulong)local_10c | 1) + 7) = CONCAT71(uStack_80,uStack_81);
          uStack_178 = uStack_128;
          uStack_180 = uStack_130;
                    /* try { // try from 00868368 to 0086837f has its CatchHandler @ 008689e4 */
          local_10c[0] = uVar19;
          local_fc = uVar22;
          FUN_008657f4(&local_f8,param_1,uVar28,local_10c,&local_190);
          puVar26 = local_f8;
          if (*(char *)(param_1 + 0x68) == '\x01') {
            local_c0 = 0;
            uStack_ac = (undefined4)local_e0;
            local_a8 = (undefined4)((ulong)local_e0 >> 0x20);
            iVar7 = 1;
            if (*puVar24 != 0x3b) {
              iVar7 = 2;
            }
            iStack_a4 = 0;
            if (*puVar24 != 0x2c) {
              iStack_a4 = iVar7;
            }
            uStack_b4 = (uint)CONCAT71(uStack_e7,cStack_e8);
            uStack_b0 = (uint)((uint7)uStack_e7 >> 0x18);
            uStack_bc = local_f0;
            uStack_b8 = uStack_ec;
            uVar23 = *puVar18;
            if (iStack_a4 == 2) {
              uVar23 = 0xffffffffffffffff;
            }
            local_a0 = (undefined4)uVar23;
            uStack_9c = (undefined4)((ulong)uVar23 >> 0x20);
            uStack_98 = 0;
            uStack_94 = 0;
            uStack_90 = 0;
            local_8c = 0;
                    /* try { // try from 008683e0 to 008683eb has its CatchHandler @ 008689d0 */
            FUN_0087229c(plVar2,&local_c0);
LAB_008683f0:
            local_1a0 = local_1a0 + 1;
          }
        }
        else {
          uStack_168 = CONCAT44(uStack_134,uStack_138);
          local_170 = CONCAT44(uStack_13c,local_140);
          *(undefined8 *)((ulong)local_d4 | 1) = CONCAT17(uStack_81,local_88);
          *(ulong *)((long)((ulong)local_d4 | 1) + 7) = CONCAT71(uStack_80,uStack_81);
          uStack_158 = uStack_128;
          uStack_160 = uStack_130;
                    /* try { // try from 008681a8 to 008681bf has its CatchHandler @ 008689fc */
          local_d4[0] = uVar19;
          local_c4 = uVar22;
          FUN_008657f4(&local_c0,param_1,uVar28,local_d4,&local_170);
                    /* try { // try from 008681c4 to 008681d7 has its CatchHandler @ 008689f8 */
          FUN_00860ecc(param_1,CONCAT44(uStack_bc,local_c0) + 0x10,
                       "Cannot have more than one table indexer");
        }
LAB_00868314:
        uVar12 = *puVar24;
        if ((uVar12 != 0x2c) && (uVar12 != 0x3b)) {
          if (uVar12 != 0x7d) {
            uVar20 = *(undefined8 *)(param_1 + 0x9c);
            uVar23 = 0;
            goto LAB_00868958;
          }
          break;
        }
                    /* try { // try from 00868328 to 0086832f has its CatchHandler @ 00868a2c */
        FUN_00858f2c(param_1);
        uVar12 = *puVar24;
      } while (uVar12 != 0x7d);
    }
    uVar20 = *(undefined8 *)(param_1 + 0x9c);
    uVar23 = 0;
LAB_00867f88:
                    /* try { // try from 00867f88 to 00867f8f has its CatchHandler @ 008689f4 */
    FUN_00858f2c(param_1);
LAB_00867f90:
    uVar25 = *(undefined8 *)(param_1 + 0xe8);
    uStack_b8 = (uint)uVar20;
    uStack_b4 = (uint)((ulong)uVar20 >> 0x20);
    local_c0 = uVar15;
    uStack_bc = uVar6;
    if (lVar27 == 0) {
      puVar17 = (undefined8 *)0x0;
    }
    else {
      lVar21 = *plVar1;
                    /* try { // try from 00867fb0 to 00867fb7 has its CatchHandler @ 00868a1c */
      puVar17 = (undefined8 *)FUN_0084e938(uVar25,lVar27 * 0x38);
      puVar18 = (undefined8 *)(lVar21 + lVar13);
      puVar16 = puVar17;
      lVar21 = lVar27;
      do {
        uVar32 = puVar18[3];
        uVar31 = puVar18[2];
        uVar11 = puVar18[5];
        uVar20 = puVar18[4];
        lVar21 = lVar21 + -1;
        uVar30 = puVar18[1];
        uVar29 = *puVar18;
        puVar16[6] = puVar18[6];
        puVar16[3] = uVar32;
        puVar16[2] = uVar31;
        puVar16[5] = uVar11;
        puVar16[4] = uVar20;
        puVar16[1] = uVar30;
        *puVar16 = uVar29;
        puVar18 = puVar18 + 7;
        puVar16 = puVar16 + 7;
      } while (lVar21 != 0);
    }
    local_140 = (uint)puVar17;
    uStack_13c = (uint)((ulong)puVar17 >> 0x20);
    uStack_138 = (uint)lVar27;
    uStack_134 = (undefined4)((ulong)lVar27 >> 0x20);
                    /* try { // try from 008686c0 to 008686df has its CatchHandler @ 00868a1c */
    uVar20 = FUN_0084e938(uVar25,0x38);
    FUN_00850c24(uVar20,&local_c0,&local_140,puVar26);
    if (*(char *)(param_1 + 0x68) == '\x01') {
      uVar25 = *(undefined8 *)(param_1 + 0xe8);
      if (local_1a0 == 0) {
        puVar17 = (undefined8 *)0x0;
      }
      else {
        lVar27 = *plVar2;
                    /* try { // try from 0086870c to 0086876b has its CatchHandler @ 00868a04 */
        puVar17 = (undefined8 *)FUN_0084e938(uVar25,local_1a0 * 0x38);
        puVar18 = (undefined8 *)(lVar27 + lVar14);
        puVar26 = puVar17;
        lVar27 = local_1a0;
        do {
          uVar33 = puVar18[3];
          uVar32 = puVar18[2];
          uVar29 = puVar18[5];
          uVar11 = puVar18[4];
          lVar27 = lVar27 + -1;
          uVar31 = puVar18[1];
          uVar30 = *puVar18;
          puVar26[6] = puVar18[6];
          puVar26[3] = uVar33;
          puVar26[2] = uVar32;
          puVar26[5] = uVar29;
          puVar26[4] = uVar11;
          puVar26[1] = uVar31;
          *puVar26 = uVar30;
          puVar18 = puVar18 + 7;
          puVar26 = puVar26 + 7;
        } while (lVar27 != 0);
      }
      uVar25 = FUN_0084e938(uVar25,0x20);
      FUN_008520c8(uVar25,puVar17,local_1a0,uVar23);
      local_c0 = (uint)uVar20;
      uStack_bc = (uint)((ulong)uVar20 >> 0x20);
                    /* try { // try from 00868770 to 0086877b has its CatchHandler @ 008689d4 */
      puVar17 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_c0);
      *puVar17 = uVar25;
    }
    lVar14 = lVar14 + *(long *)(param_1 + 0x348);
    if (lVar14 != *(long *)(param_1 + 0x350)) {
      *(long *)(param_1 + 0x350) = lVar14;
    }
    lVar13 = lVar13 + *(long *)(param_1 + 0x330);
    if (lVar13 != *(long *)(param_1 + 0x338)) {
      *(long *)(param_1 + 0x338) = lVar13;
    }
    if (*(long *)(lVar4 + 0x28) == local_78) {
      return uVar20;
    }
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

