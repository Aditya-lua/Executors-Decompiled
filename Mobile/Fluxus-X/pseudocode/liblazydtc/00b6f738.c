/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6f738
 */

int mbedtls_aes_self_test(int param_1)

{
  uint uVar1;
  undefined8 *puVar2;
  byte bVar3;
  byte bVar4;
  uint uVar5;
  long lVar6;
  int iVar7;
  char *pcVar8;
  undefined *puVar9;
  long lVar10;
  ulong uVar11;
  byte *pbVar12;
  byte *pbVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  long lVar17;
  ulong uVar18;
  ulong uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  byte local_470 [8];
  ulong auStack_468 [37];
  undefined1 auStack_340 [288];
  undefined1 auStack_220 [288];
  undefined8 local_100;
  undefined8 uStack_f8;
  ulong local_f0;
  ulong uStack_e8;
  ulong local_e0;
  ulong uStack_d8;
  ulong local_d0 [14];
  
  lVar6 = tpidr_el0;
  local_d0[0xc] = *(long *)(lVar6 + 0x28);
  local_d0[9] = 0;
  local_d0[8] = 0;
  local_d0[0xb] = 0;
  local_d0[10] = 0;
  memset(auStack_220,0,0x120);
  if (param_1 != 0) {
    puts("  AES note: built-in implementation.");
  }
  uVar19 = 0;
  do {
    uVar1 = (int)(uVar19 >> 1) * 0x40 + 0x80;
    if (param_1 != 0) {
      pcVar8 = "dec";
      if ((uVar19 & 1) != 0) {
        pcVar8 = "enc";
      }
      printf("  AES-ECB-%3u (%s): ",uVar1,pcVar8);
    }
    local_d0[0] = 0;
    local_d0[1] = 0;
    if ((uVar19 & 1) == 0) {
      iVar7 = mbedtls_aes_setkey_dec();
      puVar9 = &UNK_0077d0f0;
      if (uVar1 != 0xc0) goto LAB_00b6f840;
LAB_00b6f81c:
      if (iVar7 != -0x72) goto LAB_00b6f840;
      pcVar8 = "skipped";
LAB_00b6f8a0:
      puts(pcVar8);
    }
    else {
      iVar7 = mbedtls_aes_setkey_enc(auStack_220,local_d0 + 8,uVar1);
      puVar9 = &UNK_0077d120;
      if (uVar1 == 0xc0) goto LAB_00b6f81c;
LAB_00b6f840:
      if (iVar7 != 0) goto LAB_00b700d8;
      iVar7 = 10000;
      do {
        while ((uVar19 & 1) == 0) {
          mbedtls_internal_aes_decrypt(auStack_220,local_d0,local_d0);
          iVar7 = iVar7 + -1;
          if (iVar7 == 0) goto LAB_00b6f884;
        }
        mbedtls_internal_aes_encrypt(auStack_220,local_d0,local_d0);
        iVar7 = iVar7 + -1;
      } while (iVar7 != 0);
LAB_00b6f884:
      iVar7 = memcmp(local_d0,puVar9 + (uVar19 >> 1) * 0x10,0x10);
      if (iVar7 != 0) goto LAB_00b700d4;
      if (param_1 != 0) {
        pcVar8 = "passed";
        goto LAB_00b6f8a0;
      }
    }
    uVar1 = (int)uVar19 + 1;
    uVar19 = (ulong)uVar1;
  } while (uVar1 < 6);
  if (param_1 != 0) {
    putchar(10);
  }
  uVar19 = 0;
  do {
    uVar1 = (int)(uVar19 >> 1) * 0x40 + 0x80;
    if (param_1 != 0) {
      pcVar8 = "dec";
      if ((uVar19 & 1) != 0) {
        pcVar8 = "enc";
      }
      printf("  AES-CBC-%3u (%s): ",uVar1,pcVar8);
    }
    local_e0 = 0;
    uStack_d8 = 0;
    local_f0 = 0;
    uStack_e8 = 0;
    local_d0[0] = 0;
    local_d0[1] = 0;
    if ((uVar19 & 1) == 0) {
      iVar7 = mbedtls_aes_setkey_dec();
      puVar9 = &UNK_0077d150;
      if (uVar1 != 0xc0) goto LAB_00b6f970;
LAB_00b6f94c:
      if (iVar7 != -0x72) goto LAB_00b6f970;
      pcVar8 = "skipped";
LAB_00b6fa24:
      puts(pcVar8);
    }
    else {
      iVar7 = mbedtls_aes_setkey_enc(auStack_220,local_d0 + 8,uVar1);
      puVar9 = &UNK_0077d180;
      if (uVar1 == 0xc0) goto LAB_00b6f94c;
LAB_00b6f970:
      if (iVar7 != 0) goto LAB_00b700d8;
      iVar7 = 10000;
      do {
        uVar15 = uStack_e8;
        if ((uVar19 & 1) == 0) {
          auStack_468[2] = local_d0[1];
          auStack_468[1] = local_d0[0];
          mbedtls_internal_aes_decrypt(auStack_220,local_d0,local_d0);
          local_d0[0] = local_e0 ^ local_d0[0];
          local_d0[1] = uStack_d8 ^ local_d0[1];
          local_e0 = auStack_468[1];
          uStack_d8 = auStack_468[2];
        }
        else {
          auStack_468[2] = uStack_e8;
          auStack_468[1] = local_f0;
          uVar16 = local_e0 ^ local_f0;
          uStack_e8 = local_d0[1];
          local_f0 = local_d0[0];
          local_d0[1] = uStack_d8 ^ uVar15;
          local_d0[0] = uVar16;
          mbedtls_internal_aes_encrypt(auStack_220,local_d0,local_d0);
          local_e0 = local_d0[0];
          uStack_d8 = local_d0[1];
        }
        iVar7 = iVar7 + -1;
      } while (iVar7 != 0);
      iVar7 = memcmp(local_d0,puVar9 + (uVar19 >> 1) * 0x10,0x10);
      if (iVar7 != 0) goto LAB_00b700d4;
      if (param_1 != 0) {
        pcVar8 = "passed";
        goto LAB_00b6fa24;
      }
    }
    uVar1 = (int)uVar19 + 1;
    uVar19 = (ulong)uVar1;
  } while (uVar1 < 6);
  if (param_1 != 0) {
    putchar(10);
  }
  uVar19 = 0;
  do {
    uVar15 = uVar19 >> 1;
    uVar1 = (int)uVar15 * 0x40 + 0x80;
    if (param_1 != 0) {
      pcVar8 = "dec";
      if ((uVar19 & 1) != 0) {
        pcVar8 = "enc";
      }
      printf("  AES-CFB128-%3u (%s): ",uVar1,pcVar8);
    }
    uStack_d8 = 0xf0e0d0c0b0a0908;
    local_e0 = 0x706050403020100;
    memcpy(local_d0 + 8,&DAT_0077d2b0 + uVar15 * 0x20,(ulong)(uVar1 >> 3));
    iVar7 = mbedtls_aes_setkey_enc(auStack_220,local_d0 + 8,uVar1);
    if ((uVar1 == 0xc0) && (iVar7 == -0x72)) {
      pcVar8 = "skipped";
LAB_00b6fbe0:
      puts(pcVar8);
    }
    else {
      if (iVar7 != 0) goto LAB_00b700d8;
      if ((uVar19 & 1) == 0) {
        lVar10 = uVar15 * 0x40;
        lVar17 = 0;
        uVar15 = 0;
        local_d0[5] = *(undefined8 *)(&UNK_0077d1d8 + lVar10);
        local_d0[4] = *(undefined8 *)(&DAT_0077d1d0 + lVar10);
        local_d0[7] = *(undefined8 *)(&UNK_0077d1e8 + lVar10);
        local_d0[6] = *(undefined8 *)(&DAT_0077d1e0 + lVar10);
        local_d0[1] = *(ulong *)(&UNK_0077d1b8 + lVar10);
        local_d0[0] = *(ulong *)(&DAT_0077d1b0 + lVar10);
        local_d0[3] = *(undefined8 *)(&UNK_0077d1c8 + lVar10);
        local_d0[2] = *(undefined8 *)(&DAT_0077d1c0 + lVar10);
        do {
          if (uVar15 == 0) {
            mbedtls_internal_aes_encrypt(auStack_220,&local_e0,&local_e0);
          }
          bVar3 = *(byte *)((long)local_d0 + lVar17);
          bVar4 = *(byte *)((long)local_d0 + (uVar15 - 0x10));
          *(byte *)((long)local_d0 + (uVar15 - 0x10)) = bVar3;
          *(byte *)((long)local_d0 + lVar17) = bVar4 ^ bVar3;
          lVar17 = lVar17 + 1;
          uVar15 = (ulong)((int)uVar15 + 1) & 0xf;
        } while (lVar17 != 0x40);
        puVar9 = &DAT_0077d270;
      }
      else {
        lVar10 = 0;
        uVar16 = 0;
        local_d0[5] = 0xef520a1a19c1fbe5;
        local_d0[4] = 0x11e45ca3461cc830;
        local_d0[7] = 0x10376ce67b412bad;
        local_d0[6] = 0x179b4fdf45249ff6;
        local_d0[1] = 0x2a179373117e3de9;
        local_d0[0] = 0x969f402ee2bec16b;
        local_d0[3] = 0x518eaf45ac6fb79e;
        local_d0[2] = 0x9cac031e578a2dae;
        do {
          if (uVar16 == 0) {
            mbedtls_internal_aes_encrypt(auStack_220,&local_e0,&local_e0);
          }
          bVar3 = *(byte *)((long)local_d0 + lVar10) ^ *(byte *)((long)local_d0 + (uVar16 - 0x10));
          *(byte *)((long)local_d0 + lVar10) = bVar3;
          lVar10 = lVar10 + 1;
          *(byte *)((long)local_d0 + (uVar16 - 0x10)) = bVar3;
          uVar16 = (ulong)((int)uVar16 + 1) & 0xf;
        } while (lVar10 != 0x40);
        puVar9 = &DAT_0077d1b0 + uVar15 * 0x40;
      }
      iVar7 = memcmp(local_d0,puVar9,0x40);
      if (iVar7 != 0) goto LAB_00b700d4;
      if (param_1 != 0) {
        pcVar8 = "passed";
        goto LAB_00b6fbe0;
      }
    }
    uVar1 = (int)uVar19 + 1;
    uVar19 = (ulong)uVar1;
  } while (uVar1 < 6);
  if (param_1 != 0) {
    putchar(10);
  }
  uVar19 = 0;
  do {
    uVar15 = uVar19 >> 1;
    uVar1 = (int)uVar15 * 0x40 + 0x80;
    if (param_1 != 0) {
      pcVar8 = "dec";
      if ((uVar19 & 1) != 0) {
        pcVar8 = "enc";
      }
      printf("  AES-OFB-%3u (%s): ",uVar1,pcVar8);
    }
    uStack_d8 = 0xf0e0d0c0b0a0908;
    local_e0 = 0x706050403020100;
    memcpy(local_d0 + 8,&DAT_0077d2b0 + uVar15 * 0x20,(ulong)(uVar1 >> 3));
    iVar7 = mbedtls_aes_setkey_enc(auStack_220,local_d0 + 8,uVar1);
    if ((uVar1 == 0xc0) && (iVar7 == -0x72)) {
      pcVar8 = "skipped";
LAB_00b6fd38:
      puts(pcVar8);
    }
    else {
      if (iVar7 != 0) goto LAB_00b700d8;
      if ((uVar19 & 1) == 0) {
        lVar10 = uVar15 * 0x40;
        local_d0[5] = *(ulong *)(&UNK_0077d338 + lVar10);
        local_d0[4] = *(ulong *)(&DAT_0077d330 + lVar10);
        local_d0[7] = *(ulong *)(&UNK_0077d348 + lVar10);
        local_d0[6] = *(ulong *)(&DAT_0077d340 + lVar10);
        local_d0[1] = *(ulong *)(&UNK_0077d318 + lVar10);
        local_d0[0] = *(ulong *)(&DAT_0077d310 + lVar10);
        local_d0[3] = *(ulong *)(&UNK_0077d328 + lVar10);
        local_d0[2] = *(ulong *)(&DAT_0077d320 + lVar10);
        puVar9 = &DAT_0077d3d0;
      }
      else {
        local_d0[5] = 0xef520a1a19c1fbe5;
        local_d0[4] = 0x11e45ca3461cc830;
        local_d0[7] = 0x10376ce67b412bad;
        local_d0[6] = 0x179b4fdf45249ff6;
        local_d0[1] = 0x2a179373117e3de9;
        local_d0[0] = 0x969f402ee2bec16b;
        local_d0[3] = 0x518eaf45ac6fb79e;
        local_d0[2] = 0x9cac031e578a2dae;
        puVar9 = &DAT_0077d310 + uVar15 * 0x40;
      }
      lVar10 = 0;
      uVar15 = 0;
      do {
        if (uVar15 == 0) {
          mbedtls_internal_aes_encrypt(auStack_220,&local_e0,&local_e0);
        }
        lVar17 = uVar15 - 0x10;
        uVar15 = (ulong)((int)uVar15 + 1) & 0xf;
        *(byte *)((long)local_d0 + lVar10) =
             *(byte *)((long)local_d0 + lVar17) ^ *(byte *)((long)local_d0 + lVar10);
        lVar10 = lVar10 + 1;
      } while (lVar10 != 0x40);
      iVar7 = memcmp(local_d0,puVar9,0x40);
      if (iVar7 != 0) goto LAB_00b700d4;
      if (param_1 != 0) {
        pcVar8 = "passed";
        goto LAB_00b6fd38;
      }
    }
    uVar1 = (int)uVar19 + 1;
    uVar19 = (ulong)uVar1;
  } while (uVar1 < 6);
  if (param_1 != 0) {
    putchar(10);
  }
  uVar19 = 0;
  do {
    uVar15 = uVar19 >> 1;
    if (param_1 != 0) {
      pcVar8 = "dec";
      if ((uVar19 & 1) != 0) {
        pcVar8 = "enc";
      }
      printf("  AES-CTR-128 (%s): ",pcVar8);
    }
    lVar10 = uVar15 * 0x10;
    uStack_f8 = *(undefined8 *)(&UNK_0077d418 + lVar10);
    local_100 = *(undefined8 *)(&DAT_0077d410 + lVar10);
    local_d0[9] = *(ulong *)(&UNK_0077d448 + lVar10);
    local_d0[8] = *(ulong *)(&DAT_0077d440 + lVar10);
    iVar7 = mbedtls_aes_setkey_enc(auStack_220,local_d0 + 8,0x80);
    if (iVar7 != 0) goto LAB_00b700d8;
    uVar16 = (ulong)(int)(&DAT_0077d470)[uVar15];
    if ((uVar19 & 1) == 0) {
      memcpy(local_d0,&DAT_0077d47c + uVar15 * 0x30,uVar16);
      pcVar8 = "Single block msg";
    }
    else {
      memcpy(local_d0,"Single block msg" + uVar15 * 0x30,uVar16);
      pcVar8 = &DAT_0077d47c;
    }
    uVar18 = 0;
    do {
      mbedtls_internal_aes_encrypt(auStack_220,&local_100,local_470);
      lVar10 = 0xc;
      do {
        uVar1 = (*(uint *)(auStack_220 + lVar10 + 0x120) & 0xff00ff00) >> 8 |
                (*(uint *)(auStack_220 + lVar10 + 0x120) & 0xff00ff) << 8;
        uVar1 = (uVar1 >> 0x10 | uVar1 << 0x10) + 1;
        uVar5 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
        *(uint *)(auStack_220 + lVar10 + 0x120) = uVar5 >> 0x10 | uVar5 << 0x10;
        if (lVar10 == 0) break;
        lVar10 = lVar10 + -4;
      } while (uVar1 == 0);
      uVar11 = uVar16 - uVar18;
      if (uVar11 < 0x10) {
        if (uVar11 != 0) {
          if (0x1f < uVar11) {
            lVar10 = 0;
            do {
              puVar2 = (undefined8 *)((long)local_d0 + lVar10 + uVar18);
              uVar21 = puVar2[1];
              uVar20 = *puVar2;
              uVar23 = puVar2[3];
              uVar22 = puVar2[2];
              uVar25 = *(undefined8 *)((long)auStack_468 + lVar10);
              uVar24 = *(undefined8 *)(local_470 + lVar10);
              uVar27 = *(undefined8 *)((long)auStack_468 + lVar10 + 0x10);
              uVar26 = *(undefined8 *)((long)auStack_468 + lVar10 + 8);
              lVar10 = lVar10 + 0x20;
              puVar2[1] = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar21 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar25 >> 0x30) ^
                                            (byte)((ulong)uVar21 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar25 >> 0x28) ^
                                                     (byte)((ulong)uVar21 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar25 >> 0x20) ^
                                                              (byte)((ulong)uVar21 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar25 >> 0x18)
                                                                       ^ (byte)((ulong)uVar21 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar25
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar21
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar25 >> 8) ^ (byte)((ulong)uVar21 >> 8),
                                                  (byte)uVar25 ^ (byte)uVar21)))))));
              *puVar2 = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar24 >> 0x30) ^
                                          (byte)((ulong)uVar20 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                                   (byte)((ulong)uVar20 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                            (byte)((ulong)uVar20 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                                     (byte)((ulong)uVar20 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar24
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar20
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar24 >> 8) ^ (byte)((ulong)uVar20 >> 8),
                                                  (byte)uVar24 ^ (byte)uVar20)))))));
              puVar2[3] = CONCAT17((byte)((ulong)uVar27 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar27 >> 0x30) ^
                                            (byte)((ulong)uVar23 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar27 >> 0x28) ^
                                                     (byte)((ulong)uVar23 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar27 >> 0x20) ^
                                                              (byte)((ulong)uVar23 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar27 >> 0x18)
                                                                       ^ (byte)((ulong)uVar23 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar27
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar23
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar27 >> 8) ^ (byte)((ulong)uVar23 >> 8),
                                                  (byte)uVar27 ^ (byte)uVar23)))))));
              puVar2[2] = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar26 >> 0x30) ^
                                            (byte)((ulong)uVar22 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                                     (byte)((ulong)uVar22 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                                              (byte)((ulong)uVar22 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar26 >> 0x18)
                                                                       ^ (byte)((ulong)uVar22 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar26
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar22
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar26 >> 8) ^ (byte)((ulong)uVar22 >> 8),
                                                  (byte)uVar26 ^ (byte)uVar22)))))));
            } while (lVar10 != 0);
            if (uVar11 == 0) goto LAB_00b6fef0;
          }
          pbVar12 = (byte *)((long)local_d0 + uVar18);
          pbVar13 = local_470;
          uVar14 = uVar11;
          do {
            uVar14 = uVar14 - 1;
            *pbVar12 = *pbVar13 ^ *pbVar12;
            pbVar12 = pbVar12 + 1;
            pbVar13 = pbVar13 + 1;
          } while (uVar14 != 0);
        }
      }
      else {
        uVar11 = 0x10;
        uVar21 = *(undefined8 *)((long)local_d0 + uVar18 + 8);
        uVar20 = *(undefined8 *)((long)local_d0 + uVar18);
        *(ulong *)((long)local_d0 + uVar18 + 8) =
             CONCAT17((byte)(auStack_468[0] >> 0x38) ^ (byte)((ulong)uVar21 >> 0x38),
                      CONCAT16((byte)(auStack_468[0] >> 0x30) ^ (byte)((ulong)uVar21 >> 0x30),
                               CONCAT15((byte)(auStack_468[0] >> 0x28) ^
                                        (byte)((ulong)uVar21 >> 0x28),
                                        CONCAT14((byte)(auStack_468[0] >> 0x20) ^
                                                 (byte)((ulong)uVar21 >> 0x20),
                                                 CONCAT13((byte)(auStack_468[0] >> 0x18) ^
                                                          (byte)((ulong)uVar21 >> 0x18),
                                                          CONCAT12((byte)(auStack_468[0] >> 0x10) ^
                                                                   (byte)((ulong)uVar21 >> 0x10),
                                                                   CONCAT11((byte)(auStack_468[0] >>
                                                                                  8) ^
                                                                            (byte)((ulong)uVar21 >>
                                                                                  8),(byte)
                                                  auStack_468[0] ^ (byte)uVar21)))))));
        *(ulong *)((long)local_d0 + uVar18) =
             CONCAT17(local_470[7] ^ (byte)((ulong)uVar20 >> 0x38),
                      CONCAT16(local_470[6] ^ (byte)((ulong)uVar20 >> 0x30),
                               CONCAT15(local_470[5] ^ (byte)((ulong)uVar20 >> 0x28),
                                        CONCAT14(local_470[4] ^ (byte)((ulong)uVar20 >> 0x20),
                                                 CONCAT13(local_470[3] ^
                                                          (byte)((ulong)uVar20 >> 0x18),
                                                          CONCAT12(local_470[2] ^
                                                                   (byte)((ulong)uVar20 >> 0x10),
                                                                   CONCAT11(local_470[1] ^
                                                                            (byte)((ulong)uVar20 >>
                                                                                  8),local_470[0] ^
                                                                                     (byte)uVar20)))
                                                ))));
      }
LAB_00b6fef0:
      uVar18 = uVar11 + uVar18;
    } while (uVar18 < uVar16);
    iVar7 = memcmp(local_d0,pcVar8 + uVar15 * 0x30,uVar16);
    if (iVar7 != 0) goto LAB_00b700d4;
    if (param_1 != 0) {
      puts("passed");
    }
    uVar1 = (int)uVar19 + 1;
    uVar19 = (ulong)uVar1;
  } while (uVar1 < 6);
  if (param_1 != 0) {
    putchar(10);
  }
  memset(auStack_468 + 1,0,0x240);
  uVar19 = 0;
  do {
    uVar15 = uVar19 >> 1;
    if (param_1 != 0) {
      pcVar8 = "dec";
      if ((uVar19 & 1) != 0) {
        pcVar8 = "enc";
      }
      printf("  AES-XTS-128 (%s): ",pcVar8);
    }
    lVar10 = uVar15 * 0x20;
    local_d0[9] = *(ulong *)(&UNK_0077d5a4 + lVar10);
    local_d0[8] = *(ulong *)(&DAT_0077d59c + lVar10);
    local_d0[0xb] = *(ulong *)(&UNK_0077d5b4 + lVar10);
    local_d0[10] = *(ulong *)(&DAT_0077d5ac + lVar10);
    iVar7 = mbedtls_aes_setkey_enc(auStack_340,local_d0 + 10,0x80);
    if ((uVar19 & 1) == 0) {
      if (iVar7 != 0) goto LAB_00b700d8;
      iVar7 = mbedtls_aes_setkey_dec(auStack_468 + 1,local_d0 + 8,0x80);
      if (iVar7 != 0) goto LAB_00b700d8;
      lVar10 = uVar15 * 0x20;
      local_d0[1] = *(ulong *)(&UNK_0077d634 + lVar10);
      local_d0[0] = *(ulong *)(&DAT_0077d62c + lVar10);
      local_d0[3] = *(ulong *)(&UNK_0077d644 + lVar10);
      local_d0[2] = *(ulong *)(&DAT_0077d63c + lVar10);
      puVar9 = &DAT_0077d68c;
    }
    else {
      if (iVar7 != 0) goto LAB_00b700d8;
      iVar7 = mbedtls_aes_setkey_enc(auStack_468 + 1,local_d0 + 8,0x80);
      if (iVar7 != 0) goto LAB_00b700d8;
      lVar10 = uVar15 * 0x20;
      local_d0[1] = *(ulong *)(&UNK_0077d694 + lVar10);
      local_d0[0] = *(ulong *)(&DAT_0077d68c + lVar10);
      local_d0[3] = *(ulong *)(&UNK_0077d6a4 + lVar10);
      local_d0[2] = *(ulong *)(&DAT_0077d69c + lVar10);
      puVar9 = &DAT_0077d62c;
    }
    iVar7 = mbedtls_aes_crypt_xts
                      (auStack_468 + 1,(uint)uVar19 & 1,0x20,&DAT_0077d5fc + uVar15 * 0x10,local_d0,
                       local_d0);
    if (iVar7 != 0) goto LAB_00b700d8;
    iVar7 = memcmp(local_d0,puVar9 + uVar15 * 0x20,0x20);
    if (iVar7 == 0 && param_1 != 0) {
      puts("passed");
    }
    else if (iVar7 != 0) goto LAB_00b700d4;
    uVar1 = (uint)uVar19 + 1;
    uVar19 = (ulong)uVar1;
  } while (uVar1 < 6);
  if (param_1 != 0) {
    putchar(10);
  }
  mbedtls_platform_zeroize(auStack_468 + 1,0x120);
  mbedtls_platform_zeroize(auStack_340,0x120);
  iVar7 = 0;
LAB_00b700ec:
  mbedtls_platform_zeroize(auStack_220,0x120);
  if (*(long *)(lVar6 + 0x28) != local_d0[0xc]) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar7;
LAB_00b700d4:
  iVar7 = 1;
LAB_00b700d8:
  if ((param_1 != 0) && (iVar7 != 0)) {
    puts("failed");
  }
  goto LAB_00b700ec;
}

