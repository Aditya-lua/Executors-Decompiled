/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085f204
 */

/* WARNING: Removing unreachable block (ram,0x0085f814) */
/* WARNING: Removing unreachable block (ram,0x0085f7cc) */
/* WARNING: Removing unreachable block (ram,0x0085ffb4) */

void FUN_0085f204(long param_1,undefined8 *param_2,long param_3)

{
  long *plVar1;
  uint uVar2;
  undefined4 uVar3;
  long lVar4;
  uint uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  long *plVar8;
  ulong uVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  int iVar12;
  undefined8 uVar13;
  long lVar14;
  long lVar15;
  void *pvVar16;
  undefined8 uVar17;
  long lVar18;
  ulong uVar19;
  long lVar20;
  undefined8 *puVar21;
  undefined8 *puVar22;
  ulong uVar23;
  uint *puVar24;
  undefined8 uVar25;
  char *pcVar26;
  undefined4 uVar27;
  undefined8 uVar28;
  long lVar29;
  long lVar30;
  void *pvVar31;
  uint uVar32;
  long lVar33;
  undefined8 *puVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined1 auVar38 [16];
  undefined8 local_1e0;
  undefined8 local_1d8;
  undefined8 local_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  long lStack_198;
  undefined8 local_190;
  undefined8 uStack_188;
  undefined8 uStack_180;
  long lStack_178;
  undefined8 *local_170;
  ulong uStack_168;
  undefined8 local_160;
  undefined8 uStack_158;
  uint local_150;
  undefined4 uStack_14c;
  uint uStack_148;
  undefined4 uStack_144;
  undefined4 uStack_140;
  undefined4 uStack_13c;
  long local_138;
  undefined1 local_130 [16];
  int local_11c;
  undefined8 local_118;
  undefined8 local_110;
  undefined8 local_108;
  undefined8 uStack_100;
  undefined1 local_f8 [16];
  undefined1 local_e8;
  undefined1 local_e4 [16];
  undefined1 local_d4;
  undefined4 local_d0;
  undefined4 uStack_cc;
  uint uStack_c8;
  undefined4 uStack_c4;
  void *pvStack_c0;
  undefined8 local_b8;
  undefined1 local_b0;
  undefined8 local_ac;
  undefined8 uStack_a4;
  undefined4 local_9c;
  long *local_90;
  size_t local_88;
  ulong local_80;
  long local_78;
  
  lVar4 = tpidr_el0;
  local_78 = *(long *)(lVar4 + 0x28);
  puVar24 = (uint *)(param_1 + 0x90);
  uVar32 = *puVar24;
  if (*(long *)(param_3 + 8) == 0) {
    if (uVar32 != 299) {
      pcVar26 = *(char **)(param_1 + 0xa8);
      if ((pcVar26 == (char *)0x0) || (iVar12 = strcmp(pcVar26,"extern"), iVar12 != 0)) {
        if (uVar32 != 0x119) {
          FUN_0086e040(param_1,"global variable name");
          local_d0 = 0;
          uStack_cc = 0;
          uStack_c8 = 0;
          uStack_c4 = 0;
          local_150 = 0;
          uStack_14c = 0;
          uStack_148 = 0;
          uStack_144 = 0;
          uVar13 = FUN_0085e984(param_1,param_2,&local_d0,&local_150,
                                "declare must be followed by an identifier, \'function\', or \'extern type\'"
                               );
          goto LAB_0085f95c;
        }
        pvStack_c0 = *(void **)(param_1 + 0x9c);
        uStack_c8 = (uint)*(undefined8 *)(param_1 + 0x94);
        uStack_c4 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x94) >> 0x20);
        FUN_00858f2c(param_1);
        local_d0 = (uint)pcVar26;
        uStack_cc = (undefined4)((ulong)pcVar26 >> 0x20);
        local_b8 = CONCAT71(local_b8._1_7_,1);
        if (*(int *)(param_1 + 0x90) == 0x3a) {
          FUN_00858f2c(param_1);
        }
        else {
          FUN_0086e3b4(param_1,0x3a,"global variable declaration");
        }
        uVar13 = 0;
        uVar27 = *(undefined4 *)(param_1 + 0x124);
        uStack_148 = (uint)*(undefined8 *)(param_1 + 0x9c);
        uStack_144 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 0x20);
        local_150 = (uint)*(undefined8 *)(param_1 + 0x94);
        uStack_14c = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x94) >> 0x20);
        if ((*(int *)(param_1 + 0x90) != 0x26) && (*(int *)(param_1 + 0x90) != 0x7c)) {
          uVar13 = FUN_008695d4(param_1,0,1);
          *(undefined4 *)(param_1 + 0x124) = uVar27;
        }
        lVar15 = FUN_00867310(param_1,uVar13,&local_150);
        *(undefined4 *)(param_1 + 0x124) = uVar27;
        local_150 = (uint)*param_2;
        uStack_14c = (undefined4)((ulong)*param_2 >> 0x20);
        uStack_148 = (uint)*(undefined8 *)(lVar15 + 0x14);
        uStack_144 = (undefined4)((ulong)*(undefined8 *)(lVar15 + 0x14) >> 0x20);
        uVar13 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x40);
        FUN_008505f0(uVar13,&local_150,&local_d0,&uStack_c8,lVar15);
        goto LAB_0085f958;
      }
      FUN_00858f2c(param_1);
      pcVar26 = *(char **)(param_1 + 0xa8);
      if ((pcVar26 == (char *)0x0) || (iVar12 = strcmp(pcVar26,"type"), iVar12 != 0)) {
        local_d0 = 0;
        uStack_cc = 0;
        uStack_c8 = 0;
        uStack_c4 = 0;
        local_150 = 0;
        uStack_14c = 0;
        uStack_148 = 0;
        uStack_144 = 0;
        uVar13 = FUN_0085e984(param_1,param_1 + 0x94,&local_d0,&local_150,
                              "Expected `type` keyword after `extern`, but got %s instead",pcVar26);
        goto LAB_0085f95c;
      }
      FUN_00858f2c(param_1);
      puVar34 = (undefined8 *)(param_1 + 0x94);
      uVar13 = *puVar34;
      if (*(int *)(param_1 + 0x90) == 0x119) {
        uStack_100 = *(undefined8 *)(param_1 + 0x9c);
        local_108 = *puVar34;
        local_110 = *(undefined8 *)(param_1 + 0xa8);
        FUN_00858f2c(param_1);
      }
      else {
        FUN_0086e040(param_1,"type name");
        local_108 = *(undefined8 *)(param_1 + 0x94);
        local_110 = *(undefined8 *)(param_1 + 0x138);
        uStack_100 = local_108;
      }
      pcVar26 = *(char **)(param_1 + 0xa8);
      if (pcVar26 == (char *)0x0) {
        local_1e0 = 0;
        local_1d8 = 0;
LAB_0085fab4:
        FUN_00860ecc(param_1,puVar34,
                     "Expected `with` keyword before listing properties of the external type, but got %s instead"
                     ,pcVar26);
      }
      else {
        iVar12 = strcmp(pcVar26,"extends");
        if (iVar12 == 0) {
          FUN_00858f2c(param_1);
          if (*(int *)(param_1 + 0x90) == 0x119) {
            local_1d8 = *(undefined8 *)(param_1 + 0xa8);
            FUN_00858f2c(param_1);
          }
          else {
            FUN_0086e040(param_1,"supertype name");
            local_1d8 = *(undefined8 *)(param_1 + 0x138);
          }
          pcVar26 = *(char **)(param_1 + 0xa8);
          local_1e0 = 1;
          if (pcVar26 == (char *)0x0) goto LAB_0085fab4;
        }
        else {
          local_1e0 = 0;
          local_1d8 = 0;
        }
        iVar12 = strcmp(pcVar26,"with");
        if (iVar12 != 0) goto LAB_0085fab4;
        FUN_00858f2c(param_1);
      }
      uVar32 = *(uint *)(param_1 + 0x90);
      plVar1 = (long *)(param_1 + 0x390);
      lVar15 = *(long *)(param_1 + 0x398) - *(long *)(param_1 + 0x390);
      if (uVar32 == 0x128) {
        lVar18 = 0;
        lVar14 = 0;
      }
      else {
        lVar14 = 0;
        lVar18 = 0;
        do {
          local_130._0_8_ = 0;
          local_130._8_8_ = 0;
          auVar38 = ZEXT816(0);
          if ((uVar32 & 0xfffffffe) == 0x11c) {
                    /* try { // try from 0085fba8 to 0085fbb3 has its CatchHandler @ 008600c8 */
            auVar38 = FUN_00862f80(param_1,0);
            if (*puVar24 != 299) {
              local_150 = 0;
              uStack_14c = 0;
              uStack_148 = 0;
              uStack_144 = 0;
              local_90 = (long *)0x0;
              local_88 = 0;
                    /* try { // try from 0085ffdc to 0085ffeb has its CatchHandler @ 00860080 */
              local_130 = auVar38;
              FUN_008521fc(&local_d0,puVar24);
              pvVar31 = pvStack_c0;
              if ((local_d0 & 1) == 0) {
                pvVar31 = (void *)((long)&local_d0 + 1);
              }
                    /* try { // try from 0085fffc to 00860017 has its CatchHandler @ 00860060 */
              uVar13 = FUN_0085e984(param_1,puVar34,&local_150,&local_90,
                                    "Expected a method type declaration after attribute, but got %s instead"
                                    ,pvVar31);
              if ((local_d0 & 1) != 0) {
                operator_delete(pvStack_c0,CONCAT44(uStack_cc,local_d0) & 0xfffffffffffffffe);
              }
              goto LAB_0085ff90;
            }
LAB_0085fbd8:
                    /* try { // try from 0085fbd8 to 0085fbf3 has its CatchHandler @ 008600d0 */
            local_130 = auVar38;
            FUN_00864ba4(&local_d0,param_1,local_130);
            FUN_00871f10(plVar1,&local_d0);
LAB_0085fbf4:
            lVar14 = lVar14 + 1;
          }
          else if (uVar32 == 0x5b) {
            local_138 = *(long *)(param_1 + 0xa8);
            uStack_148 = (uint)*(undefined8 *)(param_1 + 0x98);
            uStack_144 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x98) >> 0x20);
            local_150 = (uint)*(undefined8 *)puVar24;
            uStack_14c = (undefined4)((ulong)*(undefined8 *)puVar24 >> 0x20);
            uStack_140 = (undefined4)*(undefined8 *)(param_1 + 0xa0);
            uStack_13c = (undefined4)((ulong)*(undefined8 *)(param_1 + 0xa0) >> 0x20);
                    /* try { // try from 0085fc04 to 0085fc0b has its CatchHandler @ 008600b8 */
            FUN_00858f2c(param_1);
                    /* try { // try from 0085fc1c to 0085fc27 has its CatchHandler @ 008600ac */
            if (((*puVar24 & 0xfffffffe) == 0x116) &&
               (FUN_00853d20(&local_d0,param_1 + 0x70), local_d0 == 0x5d)) {
              uVar25 = *(undefined8 *)(param_1 + 0x94);
                    /* try { // try from 0085fc38 to 0085fc47 has its CatchHandler @ 0086008c */
              FUN_00865548(&local_90,param_1,0);
              pvVar31 = *(void **)(param_1 + 0xb8);
              local_d0 = local_150;
              uStack_cc = uStack_14c;
              uStack_c8 = uStack_148;
              if (*(int *)(param_1 + 0x90) == 0x5d) {
                    /* try { // try from 0085fc68 to 0085fc6f has its CatchHandler @ 00860098 */
                FUN_00858f2c(param_1);
              }
              else {
                    /* try { // try from 0085fe48 to 0085fe6b has its CatchHandler @ 00860098 */
                FUN_0086b5f8(param_1,0x5d,&local_d0,0);
                FUN_0086e434(param_1,0x5d);
              }
              if (*puVar24 == 0x3a) {
                    /* try { // try from 0085fe78 to 0085fe97 has its CatchHandler @ 00860088 */
                FUN_00858f2c(param_1);
              }
              else {
                FUN_0086e3b4(param_1,0x3a,"property type annotation");
              }
              uVar28 = 0;
              uVar27 = *(undefined4 *)(param_1 + 0x124);
              uStack_c8 = (uint)*(undefined8 *)(param_1 + 0x9c);
              uStack_c4 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 0x20);
              local_d0 = (uint)*puVar34;
              uStack_cc = (undefined4)((ulong)*puVar34 >> 0x20);
              if ((*(int *)(param_1 + 0x90) != 0x26) && (*(int *)(param_1 + 0x90) != 0x7c)) {
                    /* try { // try from 0085febc to 0085fedf has its CatchHandler @ 00860094 */
                uVar28 = FUN_008695d4(param_1,0,0);
                *(undefined4 *)(param_1 + 0x124) = uVar27;
              }
              uVar28 = FUN_00867310(param_1,uVar28,&local_d0);
              plVar8 = local_90;
              *(undefined4 *)(param_1 + 0x124) = uVar27;
              if (((char)local_80 == '\x01') &&
                 (pvVar16 = memchr(local_90,0,local_88), pvVar16 == (void *)0x0)) {
                local_ac = CONCAT44(uStack_148,uStack_14c);
                uStack_a4 = *(undefined8 *)(param_1 + 0xb8);
                local_d0 = (uint)plVar8;
                uStack_cc = (undefined4)((ulong)plVar8 >> 0x20);
                uStack_c8 = (uint)uVar25;
                uStack_c4 = (undefined4)((ulong)uVar25 >> 0x20);
                local_b0 = 0;
                local_9c = 3;
                    /* try { // try from 0085ff28 to 0085ff37 has its CatchHandler @ 0086005c */
                pvStack_c0 = pvVar31;
                local_b8 = uVar28;
                FUN_00871f10(plVar1,&local_d0);
                goto LAB_0085fbf4;
              }
                    /* try { // try from 0085fb70 to 0085fb87 has its CatchHandler @ 00860084 */
              FUN_00860ecc(param_1,(ulong)&local_150 | 4,
                           "String literal contains malformed escape sequence or \\0");
            }
            else if (lVar18 == 0) {
              uStack_1a8 = CONCAT44(uStack_144,uStack_148);
              local_1b0 = CONCAT44(uStack_14c,local_150);
              uStack_1a0 = CONCAT44(uStack_13c,uStack_140);
              local_f8[0] = 0;
              local_e8 = 0;
              lStack_198 = local_138;
                    /* try { // try from 0085fe28 to 0085fe3f has its CatchHandler @ 00860090 */
              FUN_008657f4(&local_d0,param_1,3,local_f8,&local_1b0);
              lVar18 = CONCAT44(uStack_cc,local_d0);
            }
            else {
              uStack_188 = CONCAT44(uStack_144,uStack_148);
              local_190 = CONCAT44(uStack_14c,local_150);
              uStack_180 = CONCAT44(uStack_13c,uStack_140);
              local_e4[0] = 0;
              local_d4 = 0;
              lStack_178 = local_138;
                    /* try { // try from 0085fd3c to 0085fd53 has its CatchHandler @ 008600a4 */
              FUN_008657f4(&local_d0,param_1,3,local_e4,&local_190);
                    /* try { // try from 0085fd58 to 0085fd6b has its CatchHandler @ 008600a0 */
              FUN_00860ecc(param_1,CONCAT44(uStack_cc,local_d0) + 0x10,
                           "Cannot have more than one indexer on an extern type");
            }
          }
          else {
            if (uVar32 == 299) goto LAB_0085fbd8;
                    /* try { // try from 0085fc7c to 0085fc87 has its CatchHandler @ 008600a8 */
            if ((uVar32 == 0x119) && (FUN_00853d20(&local_d0,param_1 + 0x70), local_d0 != 0x3a)) {
              pcVar26 = *(char **)(param_1 + 0xa8);
              if (pcVar26 == (char *)0x0) {
LAB_0085fcc4:
                    /* try { // try from 0085fcc4 to 0085fce3 has its CatchHandler @ 0086009c */
                FUN_00860ecc(param_1,puVar34,
                             "Expected blank or \'read\' or \'write\' attribute, got \'%s\'",pcVar26
                            );
                FUN_00853424(param_1 + 0x70);
                goto LAB_0085fce4;
              }
              iVar12 = strcmp(pcVar26,"read");
              if (iVar12 == 0) {
                    /* try { // try from 0085ff3c to 0085ff53 has its CatchHandler @ 0086009c */
                FUN_00853424(param_1 + 0x70);
                uVar27 = 1;
              }
              else {
                iVar12 = strcmp(pcVar26,"write");
                if (iVar12 != 0) goto LAB_0085fcc4;
                FUN_00853424(param_1 + 0x70);
                uVar27 = 2;
              }
            }
            else {
LAB_0085fce4:
              uVar27 = 3;
            }
            if (*puVar24 != 0x119) {
                    /* try { // try from 00860044 to 00860053 has its CatchHandler @ 00860058 */
              FUN_0086e040(param_1,"property name");
              break;
            }
            uVar25 = *puVar34;
            uVar28 = *(undefined8 *)(param_1 + 0xa8);
            uStack_148 = (uint)*(undefined8 *)(param_1 + 0x9c);
            uStack_144 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 0x20);
            local_150 = (uint)*puVar34;
            uStack_14c = (undefined4)((ulong)*puVar34 >> 0x20);
                    /* try { // try from 0085fd08 to 0085fd23 has its CatchHandler @ 008600c4 */
            FUN_00858f2c(param_1);
            if (*puVar24 == 0x3a) {
              FUN_00858f2c(param_1);
            }
            else {
                    /* try { // try from 0085fd70 to 0085fd83 has its CatchHandler @ 008600c4 */
              FUN_0086e3b4(param_1,0x3a,"property type annotation");
            }
            uVar3 = *(undefined4 *)(param_1 + 0x124);
            uVar17 = 0;
            uStack_c8 = (uint)*(undefined8 *)(param_1 + 0x9c);
            uStack_c4 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 0x20);
            local_d0 = (uint)*puVar34;
            uStack_cc = (undefined4)((ulong)*puVar34 >> 0x20);
            if ((*(int *)(param_1 + 0x90) != 0x26) && (*(int *)(param_1 + 0x90) != 0x7c)) {
                    /* try { // try from 0085fdac to 0085fdcf has its CatchHandler @ 008600bc */
              uVar17 = FUN_008695d4(param_1,0,0);
              *(undefined4 *)(param_1 + 0x124) = uVar3;
            }
            local_b8 = FUN_00867310(param_1,uVar17,&local_d0);
            pvStack_c0 = (void *)CONCAT44(uStack_144,uStack_148);
            *(undefined4 *)(param_1 + 0x124) = uVar3;
            local_d0 = (uint)uVar28;
            uStack_cc = (undefined4)((ulong)uVar28 >> 0x20);
            uStack_c8 = local_150;
            uStack_c4 = uStack_14c;
            uStack_a4 = *(undefined8 *)(param_1 + 0xb8);
            local_b0 = 0;
                    /* try { // try from 0085fdf8 to 0085fe07 has its CatchHandler @ 008600b4 */
            local_ac = uVar25;
            local_9c = uVar27;
            FUN_00871f10(plVar1,&local_d0);
            lVar14 = lVar14 + 1;
          }
          uVar32 = *puVar24;
        } while (uVar32 != 0x128);
      }
      uVar28 = *(undefined8 *)(param_1 + 0x9c);
                    /* try { // try from 0085fb04 to 0085fb0b has its CatchHandler @ 008600b0 */
      FUN_00858f2c(param_1);
      uVar25 = *(undefined8 *)(param_1 + 0xe8);
      local_d0 = (uint)uVar13;
      uStack_cc = (undefined4)((ulong)uVar13 >> 0x20);
      uStack_c8 = (uint)uVar28;
      uStack_c4 = (undefined4)((ulong)uVar28 >> 0x20);
      if (lVar14 == 0) {
        puVar34 = (undefined8 *)0x0;
      }
      else {
        lVar30 = *plVar1;
                    /* try { // try from 0085fb2c to 0085fb33 has its CatchHandler @ 008600c0 */
        puVar34 = (undefined8 *)FUN_0084e938(uVar25,lVar14 * 0x38);
        puVar21 = (undefined8 *)(lVar30 + lVar15);
        puVar22 = puVar34;
        lVar30 = lVar14;
        do {
          uVar37 = puVar21[3];
          uVar36 = puVar21[2];
          uVar28 = puVar21[5];
          uVar13 = puVar21[4];
          lVar30 = lVar30 + -1;
          uVar35 = puVar21[1];
          uVar17 = *puVar21;
          puVar22[6] = puVar21[6];
          puVar22[3] = uVar37;
          puVar22[2] = uVar36;
          puVar22[5] = uVar28;
          puVar22[4] = uVar13;
          puVar22[1] = uVar35;
          *puVar22 = uVar17;
          puVar21 = puVar21 + 7;
          puVar22 = puVar22 + 7;
        } while (lVar30 != 0);
      }
      local_150 = (uint)puVar34;
      uStack_14c = (undefined4)((ulong)puVar34 >> 0x20);
      uStack_148 = (uint)lVar14;
      uStack_144 = (undefined4)((ulong)lVar14 >> 0x20);
                    /* try { // try from 0085ff64 to 0085ff8f has its CatchHandler @ 008600c0 */
      uVar13 = FUN_0084e938(uVar25,0x50);
      FUN_0085099c(uVar13,&local_d0,&local_110,local_1d8,local_1e0,&local_150,lVar18);
LAB_0085ff90:
      lVar15 = lVar15 + *(long *)(param_1 + 0x390);
      if (lVar15 != *(long *)(param_1 + 0x398)) {
        *(long *)(param_1 + 0x398) = lVar15;
      }
      goto LAB_0085f95c;
    }
  }
  else if (uVar32 != 299) {
    local_150 = 0;
    uStack_14c = 0;
    uStack_148 = 0;
    uStack_144 = 0;
    local_110 = 0;
    local_108 = 0;
    FUN_008521fc(&local_d0,puVar24);
    pvVar31 = pvStack_c0;
    if ((local_d0 & 1) == 0) {
      pvVar31 = (void *)((long)&local_d0 + 1);
    }
                    /* try { // try from 0085f27c to 0085f297 has its CatchHandler @ 00860124 */
    uVar13 = FUN_0085e984(param_1,param_1 + 0x94,&local_150,&local_110,
                          "Expected a function type declaration after attribute, but got %s instead"
                          ,pvVar31);
    if ((local_d0 & 1) == 0) goto LAB_0085f95c;
    operator_delete(pvStack_c0,CONCAT44(uStack_cc,local_d0) & 0xfffffffffffffffe);
LAB_0085f958:
    goto LAB_0085f95c;
  }
  FUN_00858f2c(param_1);
  if (*(int *)(param_1 + 0x90) == 0x119) {
    uStack_100 = *(undefined8 *)(param_1 + 0x9c);
    local_108 = *(undefined8 *)(param_1 + 0x94);
    local_110 = *(undefined8 *)(param_1 + 0xa8);
    FUN_00858f2c(param_1);
  }
  else {
    FUN_0086e040(param_1,"global function name");
    local_108 = *(undefined8 *)(param_1 + 0x94);
    local_110 = *(undefined8 *)(param_1 + 0x138);
    uStack_100 = local_108;
  }
  FUN_00863bd4(&local_d0,param_1,0,0,0,0);
  local_11c = *(int *)(param_1 + 0x90);
  local_118 = *(undefined8 *)(param_1 + 0x94);
  if (local_11c == 0x28) {
    FUN_00858f2c(param_1);
  }
  else {
    FUN_0086e3b4(param_1,0x28,"global function declaration");
  }
  local_130._0_8_ = 0;
  local_130._8_8_ = 0;
  local_88 = (*(long *)(param_1 + 0x308) - *(long *)(param_1 + 0x300) >> 4) * -0x5555555555555555;
  local_90 = (long *)(param_1 + 0x300);
  local_80 = 0;
  if (*(int *)(param_1 + 0x90) == 0x29) {
    uVar32 = 0;
    lVar15 = 0;
LAB_0085f3f0:
                    /* try { // try from 0085f3f0 to 0085f3f7 has its CatchHandler @ 00860150 */
    FUN_00858f2c(param_1);
  }
  else {
                    /* try { // try from 0085f3b0 to 0085f3d3 has its CatchHandler @ 0086011c */
    FUN_008614c0(&local_150,param_1,&local_90,1,0,0,0,0);
    lVar15 = local_138;
    local_130._8_8_ = CONCAT44(uStack_140,uStack_144);
    local_130._0_8_ = CONCAT44(uStack_148,uStack_14c);
    uVar32 = local_150 & 0xff;
    if (*puVar24 == 0x29) goto LAB_0085f3f0;
                    /* try { // try from 0085f454 to 0085f477 has its CatchHandler @ 00860150 */
    FUN_0086b5f8(param_1,0x29,&local_11c,0);
    FUN_0086e434(param_1,0x29);
  }
  if (*puVar24 == 0x3a) {
LAB_0085f4a0:
    FUN_00858f2c(param_1);
    uVar27 = *(undefined4 *)(param_1 + 0x124);
    lVar14 = FUN_008665f0(param_1);
    if (*puVar24 == 0x2c) {
      FUN_00860ecc(param_1,param_1 + 0x94,
                   "Expected a statement, got \',\'; did you forget to wrap the list of return types in parentheses?"
                  );
      FUN_00858f2c(param_1);
    }
    *(undefined4 *)(param_1 + 0x124) = uVar27;
    if (lVar14 == 0) goto LAB_0085f4e8;
  }
  else {
    if (*puVar24 == 0x107) {
                    /* try { // try from 0085f48c to 0085f4df has its CatchHandler @ 00860158 */
      FUN_00860ecc(param_1,param_1 + 0x94,
                   "Function return type annotations are written after \':\' instead of \'->\'");
      goto LAB_0085f4a0;
    }
LAB_0085f4e8:
                    /* try { // try from 0085f4ec to 0085f50b has its CatchHandler @ 00860148 */
    lVar14 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x38);
    local_150 = 0;
    uStack_14c = 0;
    uStack_148 = 0;
    uStack_144 = 0;
    uStack_140 = 0;
    uStack_13c = 0;
    FUN_00851204(lVar14,param_1 + 0x94,&local_150);
  }
  uVar9 = local_80;
  plVar1 = local_90;
  uVar11 = uStack_13c;
  uVar10 = uStack_140;
  uVar27 = uStack_144;
  uVar2 = uStack_148;
  lVar33 = *(long *)(param_1 + 0x368);
  lVar30 = *(long *)(param_1 + 0x360);
  uStack_158 = *(undefined8 *)(param_1 + 0x9c);
  lVar18 = *(long *)(param_1 + 0x3f8) - *(long *)(param_1 + 0x3f0);
  uStack_148 = (uint)uStack_158;
  uVar5 = uStack_148;
  uStack_144 = (undefined4)((ulong)uStack_158 >> 0x20);
  uVar3 = uStack_144;
  uStack_140 = (undefined4)lVar15;
  uVar6 = uStack_140;
  uStack_13c = (undefined4)((ulong)lVar15 >> 0x20);
  uVar7 = uStack_13c;
  if (local_80 == 0) {
    uVar2 = 0;
    if (lVar15 == 0) {
      uVar2 = uVar32;
    }
    if (uVar2 == 1) goto LAB_0085f67c;
    uVar13 = *(undefined8 *)(param_1 + 0xe8);
    local_170 = (undefined8 *)0x0;
    local_150 = 0;
    uStack_14c = 0;
    uStack_148 = 0;
    uStack_144 = 0;
    local_160 = *param_2;
LAB_0085f708:
    uStack_168 = uVar9;
                    /* try { // try from 0085f70c to 0085f753 has its CatchHandler @ 00860144 */
    uVar13 = FUN_0084e938(uVar13,0xb0);
    FUN_00850864(uVar13,&local_160,param_3,&local_110,&local_108,&local_d0,&pvStack_c0,&local_150,
                 &local_170,(char)uVar32,local_130,lVar14);
  }
  else {
    lVar29 = local_88 * 0x30;
    uVar19 = local_80;
    uStack_148 = uVar2;
    uStack_144 = uVar27;
    uStack_140 = uVar10;
    uStack_13c = uVar11;
    do {
      if (*(long *)(*plVar1 + lVar29 + 0x18) == 0) {
        local_160 = 0;
        uStack_158 = 0;
        local_170 = (undefined8 *)0x0;
        uStack_168 = 0;
        local_150 = (uint)*param_2;
        uStack_14c = (undefined4)((ulong)*param_2 >> 0x20);
                    /* try { // try from 0085f6c4 to 0085f6df has its CatchHandler @ 00860114 */
        uStack_148 = uVar5;
        uStack_144 = uVar3;
        uVar13 = FUN_0085e984(param_1,&local_150,&local_160,&local_170,
                              "All declaration parameters must be annotated");
        goto LAB_0085f754;
      }
                    /* try { // try from 0085f560 to 0085f567 has its CatchHandler @ 00860164 */
      FUN_00871cec(param_1 + 0x360);
      puVar34 = (undefined8 *)(*plVar1 + lVar29);
      local_150 = (uint)*puVar34;
      uStack_14c = (undefined4)((ulong)*puVar34 >> 0x20);
      uStack_140 = (undefined4)puVar34[2];
      uStack_13c = (undefined4)((ulong)puVar34[2] >> 0x20);
      uStack_148 = (uint)puVar34[1];
      uStack_144 = (undefined4)((ulong)puVar34[1] >> 0x20);
                    /* try { // try from 0085f580 to 0085f58b has its CatchHandler @ 00860160 */
      FUN_00871de4(param_1 + 0x3f0,&local_150);
      uVar19 = uVar19 - 1;
      lVar29 = lVar29 + 0x30;
    } while (uVar19 != 0);
    uVar2 = 0;
    if (lVar15 == 0) {
      uVar2 = uVar32;
    }
    uVar10 = uStack_140;
    uVar11 = uStack_13c;
    if ((uVar2 & 1) == 0) {
      uVar13 = *(undefined8 *)(param_1 + 0xe8);
      lVar29 = *(long *)(param_1 + 0x360);
      local_160 = *param_2;
                    /* try { // try from 0085f5c8 to 0085f5cf has its CatchHandler @ 008600cc */
      lVar15 = FUN_0084e938(uVar13,uVar9 << 3);
      if ((uVar9 < 8) || ((ulong)((lVar30 + lVar15) - (lVar29 + lVar33)) < 0x20)) {
        uVar19 = 0;
LAB_0085f5f0:
        lVar20 = uVar9 - uVar19;
        puVar34 = (undefined8 *)(lVar29 + ((lVar33 + uVar19 * 8) - lVar30));
        puVar21 = (undefined8 *)(lVar15 + uVar19 * 8);
        do {
          lVar20 = lVar20 + -1;
          *puVar21 = *puVar34;
          puVar34 = puVar34 + 1;
          puVar21 = puVar21 + 1;
        } while (lVar20 != 0);
      }
      else {
        uVar19 = uVar9 & 0xfffffffffffffffc;
        puVar34 = (undefined8 *)(lVar15 + 0x10);
        puVar21 = (undefined8 *)((lVar33 - lVar30) + lVar29 + 0x10);
        uVar23 = uVar19;
        do {
          puVar22 = puVar21 + -1;
          uVar25 = puVar21[-2];
          uVar17 = puVar21[1];
          uVar28 = *puVar21;
          uVar23 = uVar23 - 4;
          puVar21 = puVar21 + 4;
          puVar34[-1] = *puVar22;
          puVar34[-2] = uVar25;
          puVar34[1] = uVar17;
          *puVar34 = uVar28;
          puVar34 = puVar34 + 4;
        } while (uVar23 != 0);
        if (uVar9 != uVar19) goto LAB_0085f5f0;
      }
      local_150 = (uint)lVar15;
      uStack_14c = (undefined4)((ulong)lVar15 >> 0x20);
      uStack_148 = (uint)uVar9;
      uStack_144 = (undefined4)(uVar9 >> 0x20);
      lVar15 = *(long *)(param_1 + 0x3f0);
      uStack_140 = uVar6;
      uStack_13c = uVar7;
                    /* try { // try from 0085f630 to 0085f633 has its CatchHandler @ 00860144 */
      local_170 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),uVar9 * 0x18);
      puVar34 = (undefined8 *)(lVar15 + lVar18);
      puVar21 = local_170;
      uVar19 = uVar9;
      do {
        uVar28 = puVar34[1];
        uVar25 = *puVar34;
        uVar19 = uVar19 - 1;
        puVar21[2] = puVar34[2];
        puVar21[1] = uVar28;
        *puVar21 = uVar25;
        puVar34 = puVar34 + 3;
        puVar21 = puVar21 + 3;
      } while (uVar19 != 0);
      goto LAB_0085f708;
    }
LAB_0085f67c:
    uStack_13c = uVar11;
    uStack_140 = uVar10;
    local_160 = 0;
    uStack_158 = 0;
    local_170 = (undefined8 *)0x0;
    uStack_168 = 0;
    local_150 = (uint)*param_2;
    uStack_14c = (undefined4)((ulong)*param_2 >> 0x20);
                    /* try { // try from 0085f690 to 0085f6ab has its CatchHandler @ 00860118 */
    uStack_148 = uVar5;
    uStack_144 = uVar3;
    uVar13 = FUN_0085e984(param_1,&local_150,&local_160,&local_170,
                          "All declaration parameters must be annotated");
  }
LAB_0085f754:
  auVar38._8_8_ = local_130._8_8_;
  auVar38._0_8_ = local_130._0_8_;
  puVar21 = *(undefined8 **)(param_1 + 0x3f8);
  puVar34 = (undefined8 *)(lVar18 + *(long *)(param_1 + 0x3f0));
  if (puVar34 != puVar21) {
    puVar22 = (undefined8 *)(*(long *)(param_1 + 0x3f0) + lVar18);
    for (puVar34 = (undefined8 *)((long)puVar22 + ((long)puVar21 - (long)puVar34));
        puVar34 != puVar21; puVar34 = puVar34 + 3) {
      *puVar22 = *puVar34;
      uVar25 = puVar34[1];
      puVar22[2] = puVar34[2];
      puVar22[1] = uVar25;
      puVar22 = puVar22 + 3;
    }
    *(undefined8 **)(param_1 + 0x3f8) = puVar22;
  }
  lVar15 = (lVar33 - lVar30) + *(long *)(param_1 + 0x360);
  if (lVar15 != *(long *)(param_1 + 0x368)) {
    *(long *)(param_1 + 0x368) = lVar15;
  }
  lVar15 = *local_90 + local_88 * 0x30;
  if (lVar15 != local_90[1]) {
    local_90[1] = lVar15;
    local_130 = auVar38;
  }
LAB_0085f95c:
  if (*(long *)(lVar4 + 0x28) != local_78) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar13);
  }
  return;
}

