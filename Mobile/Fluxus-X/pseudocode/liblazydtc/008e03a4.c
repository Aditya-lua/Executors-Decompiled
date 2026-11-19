/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e03a4
 */

/* WARNING: Restarted to delay deadcode elimination for space: stack */

void blake3_hasher_update(undefined8 *param_1,void *param_2,ulong param_3)

{
  long lVar1;
  int iVar2;
  long *plVar3;
  undefined8 *puVar4;
  undefined1 *puVar5;
  byte bVar6;
  long lVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  char cVar11;
  byte bVar12;
  uint uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  size_t sVar17;
  long lVar18;
  uint uVar19;
  void *pvVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  ulong local_208;
  undefined8 local_1f0;
  undefined8 uStack_1e8;
  undefined8 uStack_1e0;
  undefined8 local_1d8;
  long local_1d0;
  long local_1c8;
  long lStack_1c0;
  long local_1b8;
  undefined8 uStack_1b0;
  undefined8 local_1a8;
  undefined8 uStack_1a0;
  undefined8 local_198;
  undefined8 uStack_190;
  char local_188;
  byte local_187;
  undefined8 local_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 local_168;
  long local_160;
  long lStack_158;
  long lStack_150;
  long local_148;
  undefined8 uStack_140;
  undefined8 local_138;
  undefined8 uStack_130;
  undefined8 local_128;
  undefined8 uStack_120;
  byte local_118;
  byte bStack_117;
  byte local_116;
  undefined8 local_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 local_f8;
  undefined8 local_f0;
  undefined8 uStack_e8;
  undefined8 local_e0;
  undefined8 local_d8;
  undefined8 local_d0;
  undefined8 local_c8;
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined1 local_88;
  byte local_87;
  long local_78;
  
  lVar7 = tpidr_el0;
  local_78 = *(long *)(lVar7 + 0x28);
  if (param_3 == 0) goto LAB_008e0eb8;
  uVar14 = (ulong)*(byte *)(param_1 + 0x11);
  lVar18 = uVar14 + (ulong)*(byte *)((long)param_1 + 0x89) * 0x40;
  if (lVar18 == 0) {
    local_208 = param_3;
  }
  else {
    uVar16 = 0x400 - lVar18;
    if (param_3 <= uVar16) {
      uVar16 = param_3;
    }
    if (*(byte *)(param_1 + 0x11) == 0) {
      uVar14 = uVar16;
      pvVar20 = param_2;
      if (0x40 < uVar16) goto LAB_008e0494;
LAB_008e04fc:
      uVar15 = 0;
    }
    else {
      puVar4 = param_1 + 9;
      sVar17 = 0x40 - uVar14;
      if (uVar16 <= 0x40 - uVar14) {
        sVar17 = uVar16;
      }
      memcpy((void *)((long)puVar4 + uVar14),param_2,sVar17);
      uVar14 = uVar16 - sVar17;
      uVar13 = (uint)*(byte *)(param_1 + 0x11) + (int)sVar17;
      uVar15 = (ulong)uVar13;
      pvVar20 = (void *)((long)param_2 + sVar17);
      *(char *)(param_1 + 0x11) = (char)uVar13;
      if (uVar14 != 0) {
        blake3_compress_in_place
                  (param_1 + 4,puVar4,0x40,param_1[8],
                   *(byte *)((long)param_1 + 0x8a) | *(char *)((long)param_1 + 0x89) == '\0');
        *(undefined1 *)(param_1 + 0x11) = 0;
        *(char *)((long)param_1 + 0x89) = *(char *)((long)param_1 + 0x89) + '\x01';
        param_1[10] = 0;
        *puVar4 = 0;
        param_1[0xc] = 0;
        param_1[0xb] = 0;
        param_1[0xe] = 0;
        param_1[0xd] = 0;
        param_1[0x10] = 0;
        param_1[0xf] = 0;
        if (uVar14 < 0x41) goto LAB_008e04fc;
LAB_008e0494:
        cVar11 = *(char *)((long)param_1 + 0x89);
        do {
          blake3_compress_in_place
                    (param_1 + 4,pvVar20,0x40,param_1[8],
                     *(byte *)((long)param_1 + 0x8a) | cVar11 == '\0');
          uVar14 = uVar14 - 0x40;
          pvVar20 = (void *)((long)pvVar20 + 0x40);
          cVar11 = *(char *)((long)param_1 + 0x89) + '\x01';
          *(char *)((long)param_1 + 0x89) = cVar11;
        } while (0x40 < uVar14);
        uVar15 = (ulong)*(byte *)(param_1 + 0x11);
      }
    }
    plVar3 = param_1 + 9;
    sVar17 = 0x40 - (uVar15 & 0xff);
    if (uVar14 <= sVar17) {
      sVar17 = uVar14;
    }
    memcpy((void *)((long)plVar3 + (uVar15 & 0xff)),pvVar20,sVar17);
    cVar11 = *(char *)(param_1 + 0x11) + (char)sVar17;
    *(char *)(param_1 + 0x11) = cVar11;
    local_208 = param_3 - uVar16;
    if (local_208 == 0) goto LAB_008e0eb8;
    uStack_178 = param_1[5];
    local_180 = param_1[4];
    local_168 = param_1[7];
    uStack_170 = param_1[6];
    local_160 = param_1[8];
    param_2 = (void *)((long)param_2 + uVar16);
    lStack_150 = param_1[10];
    lStack_158 = *plVar3;
    uStack_140 = param_1[0xc];
    local_148 = param_1[0xb];
    uStack_130 = param_1[0xe];
    local_138 = param_1[0xd];
    uStack_120 = param_1[0x10];
    local_128 = param_1[0xf];
    bStack_117 = *(byte *)((long)param_1 + 0x8a) | *(char *)((long)param_1 + 0x89) == '\0' | 2;
    uStack_e8 = param_1[5];
    local_f0 = param_1[4];
    local_d8 = param_1[7];
    local_e0 = param_1[6];
    local_118 = cVar11;
    blake3_compress_in_place(&local_f0,&lStack_158);
    uVar10 = local_d8;
    uVar9 = local_e0;
    uVar8 = uStack_e8;
    uVar22 = local_f0;
    uVar21 = param_1[8];
    bVar12 = *(byte *)(param_1 + 0x12);
    uVar13 = (uint)bVar12;
    uVar19 = (uint)(byte)(POPCOUNT((char)uVar21) + POPCOUNT((char)((ulong)uVar21 >> 8)) +
                          POPCOUNT((char)((ulong)uVar21 >> 0x10)) +
                          POPCOUNT((char)((ulong)uVar21 >> 0x18)) +
                          POPCOUNT((char)((ulong)uVar21 >> 0x20)) +
                          POPCOUNT((char)((ulong)uVar21 >> 0x28)) +
                          POPCOUNT((char)((ulong)uVar21 >> 0x30)) +
                         POPCOUNT((char)((ulong)uVar21 >> 0x38)));
    if (uVar19 < uVar13) {
      do {
        uStack_e8 = param_1[1];
        local_f0 = *param_1;
        local_d8 = param_1[3];
        local_e0 = param_1[2];
        lVar18 = (long)(int)uVar13 * 0x20;
        uStack_c0 = *(undefined8 *)((long)param_1 + lVar18 + 0x59);
        local_c8 = *(undefined8 *)((long)param_1 + lVar18 + 0x51);
        uStack_b0 = *(undefined8 *)((long)param_1 + lVar18 + 0x69);
        local_b8 = *(undefined8 *)((long)param_1 + lVar18 + 0x61);
        local_87 = *(byte *)((long)param_1 + 0x8a) | 4;
        local_88 = 0x40;
        local_d0 = 0;
        uStack_a0 = *(undefined8 *)((long)param_1 + lVar18 + 0x79);
        local_a8 = *(undefined8 *)((long)param_1 + lVar18 + 0x71);
        uStack_90 = *(undefined8 *)((long)param_1 + lVar18 + 0x89);
        local_98 = *(undefined8 *)((long)param_1 + lVar18 + 0x81);
        uStack_1e8 = param_1[1];
        local_1f0 = *param_1;
        local_1d8 = param_1[3];
        uStack_1e0 = param_1[2];
        blake3_compress_in_place(&local_1f0,&local_c8,0x40,0);
        *(undefined4 *)((long)param_1 + lVar18 + 0x69) = (undefined4)local_1d8;
        *(undefined4 *)((long)param_1 + lVar18 + 0x6d) = local_1d8._4_4_;
        cVar11 = *(char *)(param_1 + 0x12);
        *(undefined8 *)((long)param_1 + lVar18 + 0x61) = uStack_1e0;
        *(undefined8 *)((long)param_1 + lVar18 + 0x59) = uStack_1e8;
        bVar12 = cVar11 - 1;
        *(byte *)(param_1 + 0x12) = bVar12;
        *(undefined4 *)((long)param_1 + lVar18 + 0x51) = (undefined4)local_1f0;
        *(undefined4 *)((long)param_1 + lVar18 + 0x55) = local_1f0._4_4_;
        uVar13 = (uint)bVar12;
      } while (uVar19 < uVar13);
    }
    *(byte *)(param_1 + 0x12) = bVar12 + 1;
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0x92) = (char)((ulong)uVar22 >> 8);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0x94) = (char)((ulong)uVar22 >> 0x18);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0x93) = (char)((ulong)uVar22 >> 0x10);
    *(char *)(param_1 + (ulong)bVar12 * 4 + 0x13) = (char)((ulong)uVar22 >> 0x38);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0x96) = (char)((ulong)uVar22 >> 0x28);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0x9c) = (char)((ulong)uVar8 >> 0x18);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0x97) = (char)((ulong)uVar22 >> 0x30);
    *(char *)(param_1 + (ulong)bVar12 * 4 + 0x14) = (char)((ulong)uVar8 >> 0x38);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0x9a) = (char)((ulong)uVar8 >> 8);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0xa4) = (char)((ulong)uVar9 >> 0x18);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0x9b) = (char)((ulong)uVar8 >> 0x10);
    *(char *)(param_1 + (ulong)bVar12 * 4 + 0x15) = (char)((ulong)uVar9 >> 0x38);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0x9e) = (char)((ulong)uVar8 >> 0x28);
    param_1[10] = 0;
    *plVar3 = 0;
    param_1[0xc] = 0;
    param_1[0xb] = 0;
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0x9f) = (char)((ulong)uVar8 >> 0x30);
    param_1[0xe] = 0;
    param_1[0xd] = 0;
    param_1[0x10] = 0;
    param_1[0xf] = 0;
    uVar25 = param_1[1];
    uVar24 = *param_1;
    uVar23 = param_1[3];
    uVar21 = param_1[2];
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0xa2) = (char)((ulong)uVar9 >> 8);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0xac) = (char)((ulong)uVar10 >> 0x18);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0xa3) = (char)((ulong)uVar9 >> 0x10);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0x91) = (char)uVar22;
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0xa6) = (char)((ulong)uVar9 >> 0x28);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0x95) = (char)((ulong)uVar22 >> 0x20);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0xa7) = (char)((ulong)uVar9 >> 0x30);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0x99) = (char)uVar8;
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0xaa) = (char)((ulong)uVar10 >> 8);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0x9d) = (char)((ulong)uVar8 >> 0x20);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0xab) = (char)((ulong)uVar10 >> 0x10);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0xa1) = (char)uVar9;
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0xae) = (char)((ulong)uVar10 >> 0x28);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0xa5) = (char)((ulong)uVar9 >> 0x20);
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0xaf) = (char)((ulong)uVar10 >> 0x30);
    lVar18 = param_1[8];
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0xa9) = (char)uVar10;
    *(char *)((long)param_1 + (ulong)bVar12 * 0x20 + 0xad) = (char)((ulong)uVar10 >> 0x20);
    *(char *)(param_1 + (ulong)bVar12 * 4 + 0x16) = (char)((ulong)uVar10 >> 0x38);
    param_1[8] = lVar18 + 1;
    param_1[5] = uVar25;
    param_1[4] = uVar24;
    param_1[7] = uVar23;
    param_1[6] = uVar21;
    *(undefined2 *)(param_1 + 0x11) = 0;
  }
  if (0x400 < local_208) {
    lVar18 = param_1[8];
    do {
      uVar14 = 1L << ((LZCOUNT(local_208 | 1) ^ 0x3fU) & 0x3f);
      do {
        uVar16 = uVar14;
        uVar14 = uVar16 >> 1;
      } while ((uVar16 - 1 & lVar18 << 10) != 0);
      if (uVar16 < 0x401) {
        uStack_178 = param_1[1];
        local_180 = *param_1;
        local_168 = param_1[3];
        uStack_170 = param_1[2];
        local_116 = *(byte *)((long)param_1 + 0x8a);
        local_118 = 0;
        bStack_117 = 0;
        lStack_150 = 0;
        lStack_158 = 0;
        uStack_140 = 0;
        local_148 = 0;
        uStack_130 = 0;
        local_138 = 0;
        uStack_120 = 0;
        local_128 = 0;
        uVar14 = uVar16;
        pvVar20 = param_2;
        local_160 = lVar18;
        if (uVar16 < 0x41) {
          uVar15 = 0;
        }
        else {
          do {
            blake3_compress_in_place(&local_180,pvVar20,0x40,local_160,local_116 | bStack_117 == 0);
            uVar14 = uVar14 - 0x40;
            pvVar20 = (void *)((long)pvVar20 + 0x40);
            bStack_117 = bStack_117 + 1;
          } while (0x40 < uVar14);
          uVar15 = (ulong)local_118;
        }
        lVar18 = local_160;
        sVar17 = 0x40 - uVar15;
        if (uVar14 <= 0x40 - uVar15) {
          sVar17 = uVar14;
        }
        memcpy((void *)((long)&lStack_158 + uVar15),pvVar20,sVar17);
        uStack_1e8 = uStack_178;
        local_1f0 = local_180;
        local_1d8 = local_168;
        uStack_1e0 = uStack_170;
        lStack_1c0 = lStack_150;
        local_1c8 = lStack_158;
        uStack_1b0 = uStack_140;
        local_1b8 = local_148;
        iVar2 = (uint)local_118 + (int)sVar17;
        local_188 = (char)iVar2;
        uStack_1a0 = uStack_130;
        local_1a8 = local_138;
        uStack_190 = uStack_120;
        local_198 = local_128;
        local_187 = local_116 | bStack_117 == 0 | 2;
        uStack_e8 = uStack_178;
        local_f0 = local_180;
        local_d8 = local_168;
        local_e0 = uStack_170;
        local_1d0 = lVar18;
        local_118 = local_188;
        blake3_compress_in_place(&local_f0,&local_1c8,iVar2,lVar18);
        uVar10 = local_d8;
        uVar9 = local_e0;
        uVar8 = uStack_e8;
        uVar22 = local_f0;
        bVar12 = *(byte *)(param_1 + 0x12);
        uVar13 = (uint)bVar12;
        uVar19 = (uint)(byte)(POPCOUNT((char)local_160) + POPCOUNT((char)((ulong)local_160 >> 8)) +
                              POPCOUNT((char)((ulong)local_160 >> 0x10)) +
                              POPCOUNT((char)((ulong)local_160 >> 0x18)) +
                              POPCOUNT((char)((ulong)local_160 >> 0x20)) +
                              POPCOUNT((char)((ulong)local_160 >> 0x28)) +
                              POPCOUNT((char)((ulong)local_160 >> 0x30)) +
                             POPCOUNT((char)((ulong)local_160 >> 0x38)));
        if (uVar19 < uVar13) {
          do {
            uStack_e8 = param_1[1];
            local_f0 = *param_1;
            local_d8 = param_1[3];
            local_e0 = param_1[2];
            lVar18 = (long)(int)uVar13 * 0x20;
            uStack_c0 = *(undefined8 *)((long)param_1 + lVar18 + 0x59);
            local_c8 = *(undefined8 *)((long)param_1 + lVar18 + 0x51);
            uStack_b0 = *(undefined8 *)((long)param_1 + lVar18 + 0x69);
            local_b8 = *(undefined8 *)((long)param_1 + lVar18 + 0x61);
            local_87 = *(byte *)((long)param_1 + 0x8a) | 4;
            local_88 = 0x40;
            local_d0 = 0;
            uStack_a0 = *(undefined8 *)((long)param_1 + lVar18 + 0x79);
            local_a8 = *(undefined8 *)((long)param_1 + lVar18 + 0x71);
            uStack_90 = *(undefined8 *)((long)param_1 + lVar18 + 0x89);
            local_98 = *(undefined8 *)((long)param_1 + lVar18 + 0x81);
            uStack_108 = param_1[1];
            local_110 = *param_1;
            local_f8 = param_1[3];
            uStack_100 = param_1[2];
            blake3_compress_in_place(&local_110,&local_c8,0x40,0);
            *(undefined4 *)((long)param_1 + lVar18 + 0x69) = (undefined4)local_f8;
            *(undefined4 *)((long)param_1 + lVar18 + 0x6d) = local_f8._4_4_;
            cVar11 = *(char *)(param_1 + 0x12);
            *(undefined8 *)((long)param_1 + lVar18 + 0x61) = uStack_100;
            *(undefined8 *)((long)param_1 + lVar18 + 0x59) = uStack_108;
            bVar12 = cVar11 - 1;
            *(byte *)(param_1 + 0x12) = bVar12;
            *(undefined4 *)((long)param_1 + lVar18 + 0x51) = (undefined4)local_110;
            *(undefined4 *)((long)param_1 + lVar18 + 0x55) = local_110._4_4_;
            uVar13 = (uint)bVar12;
          } while (uVar19 < uVar13);
        }
        puVar5 = (undefined1 *)((long)param_1 + (ulong)bVar12 * 0x20 + 0x91);
        *(byte *)(param_1 + 0x12) = bVar12 + 1;
        puVar5[1] = (char)((ulong)uVar22 >> 8);
        puVar5[3] = (char)((ulong)uVar22 >> 0x18);
        puVar5[2] = (char)((ulong)uVar22 >> 0x10);
        puVar5[7] = (char)((ulong)uVar22 >> 0x38);
        puVar5[5] = (char)((ulong)uVar22 >> 0x28);
        puVar5[0xb] = (char)((ulong)uVar8 >> 0x18);
        puVar5[6] = (char)((ulong)uVar22 >> 0x30);
        puVar5[0xf] = (char)((ulong)uVar8 >> 0x38);
        puVar5[9] = (char)((ulong)uVar8 >> 8);
        puVar5[0x13] = (char)((ulong)uVar9 >> 0x18);
        puVar5[10] = (char)((ulong)uVar8 >> 0x10);
        puVar5[0x17] = (char)((ulong)uVar9 >> 0x38);
        puVar5[0xd] = (char)((ulong)uVar8 >> 0x28);
        puVar5[0x1b] = (char)((ulong)uVar10 >> 0x18);
        puVar5[0xe] = (char)((ulong)uVar8 >> 0x30);
        *puVar5 = (char)uVar22;
        puVar5[0x11] = (char)((ulong)uVar9 >> 8);
        puVar5[4] = (char)((ulong)uVar22 >> 0x20);
        puVar5[0x12] = (char)((ulong)uVar9 >> 0x10);
        puVar5[8] = (char)uVar8;
        puVar5[0x15] = (char)((ulong)uVar9 >> 0x28);
        puVar5[0xc] = (char)((ulong)uVar8 >> 0x20);
        puVar5[0x16] = (char)((ulong)uVar9 >> 0x30);
        puVar5[0x10] = (char)uVar9;
        puVar5[0x19] = (char)((ulong)uVar10 >> 8);
        puVar5[0x14] = (char)((ulong)uVar9 >> 0x20);
        puVar5[0x1a] = (char)((ulong)uVar10 >> 0x10);
        puVar5[0x18] = (char)uVar10;
        puVar5[0x1d] = (char)((ulong)uVar10 >> 0x28);
        puVar5[0x1c] = (char)((ulong)uVar10 >> 0x20);
        puVar5[0x1e] = (char)((ulong)uVar10 >> 0x30);
        puVar5[0x1f] = (char)((ulong)uVar10 >> 0x38);
      }
      else {
        FUN_008dfe70(param_2,uVar16,param_1,lVar18,*(undefined1 *)((long)param_1 + 0x8a),&local_180,
                     0);
        uVar22 = param_1[8];
        bVar12 = *(byte *)(param_1 + 0x12);
        uVar13 = (uint)bVar12;
        uVar19 = (uint)(byte)(POPCOUNT((char)uVar22) + POPCOUNT((char)((ulong)uVar22 >> 8)) +
                              POPCOUNT((char)((ulong)uVar22 >> 0x10)) +
                              POPCOUNT((char)((ulong)uVar22 >> 0x18)) +
                              POPCOUNT((char)((ulong)uVar22 >> 0x20)) +
                              POPCOUNT((char)((ulong)uVar22 >> 0x28)) +
                              POPCOUNT((char)((ulong)uVar22 >> 0x30)) +
                             POPCOUNT((char)((ulong)uVar22 >> 0x38)));
        if (uVar19 < uVar13) {
          do {
            uStack_e8 = param_1[1];
            local_f0 = *param_1;
            local_d8 = param_1[3];
            local_e0 = param_1[2];
            lVar18 = (long)(int)uVar13 * 0x20;
            uStack_c0 = *(undefined8 *)((long)param_1 + lVar18 + 0x59);
            local_c8 = *(undefined8 *)((long)param_1 + lVar18 + 0x51);
            uStack_b0 = *(undefined8 *)((long)param_1 + lVar18 + 0x69);
            local_b8 = *(undefined8 *)((long)param_1 + lVar18 + 0x61);
            local_87 = *(byte *)((long)param_1 + 0x8a) | 4;
            local_88 = 0x40;
            local_d0 = 0;
            uStack_a0 = *(undefined8 *)((long)param_1 + lVar18 + 0x79);
            local_a8 = *(undefined8 *)((long)param_1 + lVar18 + 0x71);
            uStack_90 = *(undefined8 *)((long)param_1 + lVar18 + 0x89);
            local_98 = *(undefined8 *)((long)param_1 + lVar18 + 0x81);
            uStack_1e8 = param_1[1];
            local_1f0 = *param_1;
            local_1d8 = param_1[3];
            uStack_1e0 = param_1[2];
            blake3_compress_in_place(&local_1f0,&local_c8,0x40,0);
            *(undefined4 *)((long)param_1 + lVar18 + 0x69) = (undefined4)local_1d8;
            *(undefined4 *)((long)param_1 + lVar18 + 0x6d) = local_1d8._4_4_;
            cVar11 = *(char *)(param_1 + 0x12);
            *(undefined8 *)((long)param_1 + lVar18 + 0x61) = uStack_1e0;
            *(undefined8 *)((long)param_1 + lVar18 + 0x59) = uStack_1e8;
            bVar12 = cVar11 - 1;
            *(byte *)(param_1 + 0x12) = bVar12;
            *(undefined4 *)((long)param_1 + lVar18 + 0x51) = (undefined4)local_1f0;
            *(undefined4 *)((long)param_1 + lVar18 + 0x55) = local_1f0._4_4_;
            uVar13 = (uint)bVar12;
          } while (uVar19 < uVar13);
        }
        lVar18 = param_1[8] + (uVar16 >> 0xb);
        bVar6 = bVar12 + 1;
        puVar4 = (undefined8 *)((long)param_1 + (ulong)bVar12 * 0x20 + 0x91);
        *(byte *)(param_1 + 0x12) = bVar6;
        puVar4[1] = uStack_178;
        *puVar4 = local_180;
        puVar4[3] = local_168;
        puVar4[2] = uStack_170;
        while ((uint)(byte)(POPCOUNT((char)lVar18) + POPCOUNT((char)((ulong)lVar18 >> 8)) +
                            POPCOUNT((char)((ulong)lVar18 >> 0x10)) +
                            POPCOUNT((char)((ulong)lVar18 >> 0x18)) +
                            POPCOUNT((char)((ulong)lVar18 >> 0x20)) +
                            POPCOUNT((char)((ulong)lVar18 >> 0x28)) +
                            POPCOUNT((char)((ulong)lVar18 >> 0x30)) +
                           POPCOUNT((char)((ulong)lVar18 >> 0x38))) < (uint)bVar6) {
          uStack_e8 = param_1[1];
          local_f0 = *param_1;
          local_d8 = param_1[3];
          local_e0 = param_1[2];
          lVar1 = (long)(int)(uint)bVar6 * 0x20;
          uStack_c0 = *(undefined8 *)((long)param_1 + lVar1 + 0x59);
          local_c8 = *(undefined8 *)((long)param_1 + lVar1 + 0x51);
          uStack_b0 = *(undefined8 *)((long)param_1 + lVar1 + 0x69);
          local_b8 = *(undefined8 *)((long)param_1 + lVar1 + 0x61);
          local_87 = *(byte *)((long)param_1 + 0x8a) | 4;
          local_88 = 0x40;
          local_d0 = 0;
          uStack_a0 = *(undefined8 *)((long)param_1 + lVar1 + 0x79);
          local_a8 = *(undefined8 *)((long)param_1 + lVar1 + 0x71);
          uStack_90 = *(undefined8 *)((long)param_1 + lVar1 + 0x89);
          local_98 = *(undefined8 *)((long)param_1 + lVar1 + 0x81);
          uStack_1e8 = param_1[1];
          local_1f0 = *param_1;
          local_1d8 = param_1[3];
          uStack_1e0 = param_1[2];
          blake3_compress_in_place(&local_1f0,&local_c8,0x40,0);
          *(undefined4 *)((long)param_1 + lVar1 + 0x69) = (undefined4)local_1d8;
          *(undefined4 *)((long)param_1 + lVar1 + 0x6d) = local_1d8._4_4_;
          cVar11 = *(char *)(param_1 + 0x12);
          *(undefined8 *)((long)param_1 + lVar1 + 0x61) = uStack_1e0;
          *(undefined8 *)((long)param_1 + lVar1 + 0x59) = uStack_1e8;
          bVar6 = cVar11 - 1;
          *(byte *)(param_1 + 0x12) = bVar6;
          *(undefined4 *)((long)param_1 + lVar1 + 0x51) = (undefined4)local_1f0;
          *(undefined4 *)((long)param_1 + lVar1 + 0x55) = local_1f0._4_4_;
        }
        plVar3 = (long *)((long)param_1 + (ulong)bVar6 * 0x20 + 0x91);
        *(byte *)(param_1 + 0x12) = bVar6 + 1;
        plVar3[1] = lStack_158;
        *plVar3 = local_160;
        plVar3[3] = local_148;
        plVar3[2] = lStack_150;
      }
      local_208 = local_208 - uVar16;
      param_2 = (void *)((long)param_2 + uVar16);
      lVar18 = param_1[8] + (uVar16 >> 10);
      param_1[8] = lVar18;
    } while (0x400 < local_208);
  }
  if (local_208 == 0) goto LAB_008e0eb8;
  uVar14 = (ulong)*(byte *)(param_1 + 0x11);
  if (uVar14 == 0) {
    if (0x40 < local_208) goto LAB_008e0d7c;
LAB_008e0dd4:
    uVar14 = 0;
  }
  else {
    puVar4 = param_1 + 9;
    sVar17 = 0x40 - uVar14;
    if (local_208 <= 0x40 - uVar14) {
      sVar17 = local_208;
    }
    memcpy((void *)((long)puVar4 + uVar14),param_2,sVar17);
    local_208 = local_208 - sVar17;
    param_2 = (void *)((long)param_2 + sVar17);
    uVar13 = (uint)*(byte *)(param_1 + 0x11) + (int)sVar17;
    uVar14 = (ulong)uVar13;
    *(char *)(param_1 + 0x11) = (char)uVar13;
    if (local_208 != 0) {
      blake3_compress_in_place
                (param_1 + 4,puVar4,0x40,param_1[8],
                 *(byte *)((long)param_1 + 0x8a) | *(char *)((long)param_1 + 0x89) == '\0');
      *(undefined1 *)(param_1 + 0x11) = 0;
      *(char *)((long)param_1 + 0x89) = *(char *)((long)param_1 + 0x89) + '\x01';
      param_1[10] = 0;
      *puVar4 = 0;
      param_1[0xc] = 0;
      param_1[0xb] = 0;
      param_1[0xe] = 0;
      param_1[0xd] = 0;
      param_1[0x10] = 0;
      param_1[0xf] = 0;
      if (local_208 < 0x41) goto LAB_008e0dd4;
LAB_008e0d7c:
      cVar11 = *(char *)((long)param_1 + 0x89);
      do {
        blake3_compress_in_place
                  (param_1 + 4,param_2,0x40,param_1[8],
                   *(byte *)((long)param_1 + 0x8a) | cVar11 == '\0');
        local_208 = local_208 - 0x40;
        param_2 = (void *)((long)param_2 + 0x40);
        cVar11 = *(char *)((long)param_1 + 0x89) + '\x01';
        *(char *)((long)param_1 + 0x89) = cVar11;
      } while (0x40 < local_208);
      uVar14 = (ulong)*(byte *)(param_1 + 0x11);
    }
  }
  sVar17 = 0x40 - (uVar14 & 0xff);
  if (local_208 <= sVar17) {
    sVar17 = local_208;
  }
  memcpy((void *)((long)param_1 + (uVar14 & 0xff) + 0x48),param_2,sVar17);
  uVar22 = param_1[8];
  bVar12 = *(byte *)(param_1 + 0x12);
  *(char *)(param_1 + 0x11) = *(char *)(param_1 + 0x11) + (char)sVar17;
  while ((uint)(byte)(POPCOUNT((char)uVar22) + POPCOUNT((char)((ulong)uVar22 >> 8)) +
                      POPCOUNT((char)((ulong)uVar22 >> 0x10)) +
                      POPCOUNT((char)((ulong)uVar22 >> 0x18)) +
                      POPCOUNT((char)((ulong)uVar22 >> 0x20)) +
                      POPCOUNT((char)((ulong)uVar22 >> 0x28)) +
                      POPCOUNT((char)((ulong)uVar22 >> 0x30)) +
                     POPCOUNT((char)((ulong)uVar22 >> 0x38))) < (uint)bVar12) {
    uStack_e8 = param_1[1];
    local_f0 = *param_1;
    local_d8 = param_1[3];
    local_e0 = param_1[2];
    lVar18 = (long)(int)(uint)bVar12 * 0x20;
    uStack_c0 = *(undefined8 *)((long)param_1 + lVar18 + 0x59);
    local_c8 = *(undefined8 *)((long)param_1 + lVar18 + 0x51);
    uStack_b0 = *(undefined8 *)((long)param_1 + lVar18 + 0x69);
    local_b8 = *(undefined8 *)((long)param_1 + lVar18 + 0x61);
    local_87 = *(byte *)((long)param_1 + 0x8a) | 4;
    local_88 = 0x40;
    local_d0 = 0;
    uStack_a0 = *(undefined8 *)((long)param_1 + lVar18 + 0x79);
    local_a8 = *(undefined8 *)((long)param_1 + lVar18 + 0x71);
    uStack_90 = *(undefined8 *)((long)param_1 + lVar18 + 0x89);
    local_98 = *(undefined8 *)((long)param_1 + lVar18 + 0x81);
    uStack_178 = param_1[1];
    local_180 = *param_1;
    local_168 = param_1[3];
    uStack_170 = param_1[2];
    blake3_compress_in_place(&local_180,&local_c8,0x40,0);
    *(undefined4 *)((long)param_1 + lVar18 + 0x69) = (undefined4)local_168;
    *(undefined4 *)((long)param_1 + lVar18 + 0x6d) = local_168._4_4_;
    cVar11 = *(char *)(param_1 + 0x12);
    *(undefined8 *)((long)param_1 + lVar18 + 0x61) = uStack_170;
    *(undefined8 *)((long)param_1 + lVar18 + 0x59) = uStack_178;
    bVar12 = cVar11 - 1;
    *(byte *)(param_1 + 0x12) = bVar12;
    *(undefined4 *)((long)param_1 + lVar18 + 0x51) = (undefined4)local_180;
    *(undefined4 *)((long)param_1 + lVar18 + 0x55) = local_180._4_4_;
  }
LAB_008e0eb8:
  if (*(long *)(lVar7 + 0x28) != local_78) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

