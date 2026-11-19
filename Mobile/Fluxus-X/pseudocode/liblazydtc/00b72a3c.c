/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b72a3c
 */

undefined4 mbedtls_camellia_self_test(int param_1)

{
  byte *pbVar1;
  uint uVar2;
  byte bVar3;
  long lVar4;
  ulong uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  int iVar8;
  int iVar9;
  long lVar10;
  char *pcVar11;
  undefined4 uVar12;
  size_t __n;
  size_t sVar13;
  ulong uVar14;
  ulong uVar15;
  ulong *puVar16;
  ulong local_230;
  ulong uStack_228;
  undefined8 local_220;
  undefined8 uStack_218;
  undefined1 auStack_208 [280];
  byte local_f0 [15];
  byte bStack_e1;
  undefined8 local_e0;
  undefined8 uStack_d8;
  ulong local_d0;
  ulong uStack_c8;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 uStack_78;
  long local_70;
  
  lVar4 = tpidr_el0;
  local_70 = *(long *)(lVar4 + 0x28);
  memset(auStack_208,0,0x114);
  uVar15 = 0;
  local_80 = 0;
  uStack_78 = 0;
  local_90 = 0;
  uStack_88 = 0;
  do {
    uVar5 = uVar15 >> 1;
    uVar2 = (uint)uVar15 & 1;
    iVar9 = (int)uVar5 * 0x40 + 0x80;
    if (param_1 != 0) {
      pcVar11 = "dec";
      if ((uVar15 & 1) != 0) {
        pcVar11 = "enc";
      }
      printf("  CAMELLIA-ECB-%3d (%s): ",iVar9,pcVar11);
    }
    uVar14 = (ulong)((int)uVar5 * 8 + 0x10);
    memcpy(&local_90,&DAT_0077de44 + uVar5 * 0x40,uVar14);
    if ((uVar15 & 1) == 0) {
      mbedtls_camellia_setkey_dec();
      uStack_218 = *(undefined8 *)(&UNK_0077df0c + uVar5 * 0x20);
      local_220 = *(undefined8 *)(&DAT_0077df04 + uVar5 * 0x20);
      uStack_228 = 0x1032547698badcfe;
      local_230 = 0xefcdab8967452301;
    }
    else {
      mbedtls_camellia_setkey_enc(auStack_208,&local_90,iVar9);
      uStack_218 = 0x1032547698badcfe;
      local_220 = 0xefcdab8967452301;
      uStack_228 = *(ulong *)(&UNK_0077df0c + uVar5 * 0x20);
      local_230 = *(ulong *)(&DAT_0077df04 + uVar5 * 0x20);
    }
    mbedtls_camellia_crypt_ecb(auStack_208,uVar2,&local_220,&local_d0);
    iVar8 = memcmp(&local_d0,&local_230,0x10);
    if (iVar8 != 0) goto LAB_00b7305c;
    memcpy(&local_90,&DAT_0077de64 + uVar5 * 0x40,uVar14);
    if ((uVar15 & 1) == 0) {
      mbedtls_camellia_setkey_dec();
      uStack_218 = *(undefined8 *)(&UNK_0077df1c + uVar5 * 0x20);
      local_220 = *(undefined8 *)(&DAT_0077df14 + uVar5 * 0x20);
      uStack_228 = 0;
      local_230 = 0x200000000;
    }
    else {
      mbedtls_camellia_setkey_enc(auStack_208,&local_90,iVar9);
      uStack_218 = 0;
      local_220 = 0x200000000;
      uStack_228 = *(ulong *)(&UNK_0077df1c + uVar5 * 0x20);
      local_230 = *(ulong *)(&DAT_0077df14 + uVar5 * 0x20);
    }
    mbedtls_camellia_crypt_ecb(auStack_208,uVar2,&local_220,&local_d0);
    iVar9 = memcmp(&local_d0,&local_230,0x10);
    if (iVar9 != 0) goto LAB_00b7305c;
    if (param_1 != 0) {
      puts("passed");
    }
    uVar2 = (uint)uVar15 + 1;
    uVar15 = (ulong)uVar2;
  } while (uVar2 < 6);
  if (param_1 != 0) {
    putchar(10);
  }
  uVar15 = 0;
  do {
    uVar5 = uVar15 >> 1;
    uVar2 = (uint)uVar15 & 1;
    iVar9 = (int)uVar5 * 0x40 + 0x80;
    if (param_1 != 0) {
      pcVar11 = "dec";
      if ((uVar15 & 1) != 0) {
        pcVar11 = "enc";
      }
      printf("  CAMELLIA-CBC-%3d (%s): ",iVar9,pcVar11);
    }
    uStack_228 = 0xf0e0d0c0b0a0908;
    local_230 = 0x706050403020100;
    uStack_218 = 0xf0e0d0c0b0a0908;
    local_220 = 0x706050403020100;
    memcpy(&local_90,&DAT_0077df64 + uVar5 * 0x20,(ulong)((int)uVar5 * 8 + 0x10));
    if ((uVar15 & 1) == 0) {
      mbedtls_camellia_setkey_dec();
      uVar7 = uStack_218;
      uVar6 = local_220;
      uStack_218 = *(undefined8 *)(&UNK_0077dfcc + uVar5 * 0x30);
      local_220 = *(undefined8 *)(&DAT_0077dfc4 + uVar5 * 0x30);
      uStack_228 = 0x2a179373117e3de9;
      local_230 = 0x969f402ee2bec16b;
      mbedtls_camellia_crypt_ecb(auStack_208,0,&local_220,&local_d0);
      local_d0 = CONCAT17((byte)(local_d0 >> 0x38) ^ (byte)((ulong)uVar6 >> 0x38),
                          CONCAT16((byte)(local_d0 >> 0x30) ^ (byte)((ulong)uVar6 >> 0x30),
                                   CONCAT15((byte)(local_d0 >> 0x28) ^ (byte)((ulong)uVar6 >> 0x28),
                                            CONCAT14((byte)(local_d0 >> 0x20) ^
                                                     (byte)((ulong)uVar6 >> 0x20),
                                                     CONCAT13((byte)(local_d0 >> 0x18) ^
                                                              (byte)((ulong)uVar6 >> 0x18),
                                                              CONCAT12((byte)(local_d0 >> 0x10) ^
                                                                       (byte)((ulong)uVar6 >> 0x10),
                                                                       CONCAT11((byte)(local_d0 >> 8
                                                                                      ) ^ (byte)((
                                                  ulong)uVar6 >> 8),(byte)local_d0 ^ (byte)uVar6))))
                                           )));
      uStack_c8 = CONCAT17((byte)(uStack_c8 >> 0x38) ^ (byte)((ulong)uVar7 >> 0x38),
                           CONCAT16((byte)(uStack_c8 >> 0x30) ^ (byte)((ulong)uVar7 >> 0x30),
                                    CONCAT15((byte)(uStack_c8 >> 0x28) ^
                                             (byte)((ulong)uVar7 >> 0x28),
                                             CONCAT14((byte)(uStack_c8 >> 0x20) ^
                                                      (byte)((ulong)uVar7 >> 0x20),
                                                      CONCAT13((byte)(uStack_c8 >> 0x18) ^
                                                               (byte)((ulong)uVar7 >> 0x18),
                                                               CONCAT12((byte)(uStack_c8 >> 0x10) ^
                                                                        (byte)((ulong)uVar7 >> 0x10)
                                                                        ,CONCAT11((byte)(uStack_c8
                                                                                        >> 8) ^
                                                                                  (byte)((ulong)
                                                  uVar7 >> 8),(byte)uStack_c8 ^ (byte)uVar7)))))));
    }
    else {
      mbedtls_camellia_setkey_enc(auStack_208,&local_90,iVar9);
      uStack_228 = *(ulong *)(&UNK_0077dfcc + uVar5 * 0x30);
      local_230 = *(ulong *)(&DAT_0077dfc4 + uVar5 * 0x30);
      uStack_218 = 0x2a179373117e3de9;
      local_220 = 0x969f402ee2bec16b;
      uStack_c8 = 0x25199e7f1a7434e1;
      local_d0 = 0x9199452ae1bcc06b;
      mbedtls_camellia_crypt_ecb(auStack_208,uVar2,&local_d0,&local_d0);
    }
    iVar9 = memcmp(&local_d0,&local_230,0x10);
    uVar7 = uStack_218;
    uVar6 = local_220;
    if (iVar9 != 0) goto LAB_00b7305c;
    if ((uVar15 & 1) == 0) {
      uStack_218 = *(undefined8 *)(&UNK_0077dfdc + uVar5 * 0x30);
      local_220 = *(undefined8 *)(&DAT_0077dfd4 + uVar5 * 0x30);
      uStack_228 = 0x518eaf45ac6fb79e;
      local_230 = 0x9cac031e578a2dae;
      mbedtls_camellia_crypt_ecb(auStack_208,0,&local_220,&local_d0);
      local_d0 = CONCAT17((byte)(local_d0 >> 0x38) ^ (byte)((ulong)uVar6 >> 0x38),
                          CONCAT16((byte)(local_d0 >> 0x30) ^ (byte)((ulong)uVar6 >> 0x30),
                                   CONCAT15((byte)(local_d0 >> 0x28) ^ (byte)((ulong)uVar6 >> 0x28),
                                            CONCAT14((byte)(local_d0 >> 0x20) ^
                                                     (byte)((ulong)uVar6 >> 0x20),
                                                     CONCAT13((byte)(local_d0 >> 0x18) ^
                                                              (byte)((ulong)uVar6 >> 0x18),
                                                              CONCAT12((byte)(local_d0 >> 0x10) ^
                                                                       (byte)((ulong)uVar6 >> 0x10),
                                                                       CONCAT11((byte)(local_d0 >> 8
                                                                                      ) ^ (byte)((
                                                  ulong)uVar6 >> 8),(byte)local_d0 ^ (byte)uVar6))))
                                           )));
      uStack_c8 = CONCAT17((byte)(uStack_c8 >> 0x38) ^ (byte)((ulong)uVar7 >> 0x38),
                           CONCAT16((byte)(uStack_c8 >> 0x30) ^ (byte)((ulong)uVar7 >> 0x30),
                                    CONCAT15((byte)(uStack_c8 >> 0x28) ^
                                             (byte)((ulong)uVar7 >> 0x28),
                                             CONCAT14((byte)(uStack_c8 >> 0x20) ^
                                                      (byte)((ulong)uVar7 >> 0x20),
                                                      CONCAT13((byte)(uStack_c8 >> 0x18) ^
                                                               (byte)((ulong)uVar7 >> 0x18),
                                                               CONCAT12((byte)(uStack_c8 >> 0x10) ^
                                                                        (byte)((ulong)uVar7 >> 0x10)
                                                                        ,CONCAT11((byte)(uStack_c8
                                                                                        >> 8) ^
                                                                                  (byte)((ulong)
                                                  uVar7 >> 8),(byte)uStack_c8 ^ (byte)uVar7)))))));
    }
    else {
      uStack_218 = 0x518eaf45ac6fb79e;
      local_220 = 0x9cac031e578a2dae;
      local_d0 = local_230 ^ 0x9cac031e578a2dae;
      uStack_c8 = uStack_228 ^ 0x518eaf45ac6fb79e;
      local_230 = *(ulong *)(&DAT_0077dfd4 + uVar5 * 0x30);
      uStack_228 = *(ulong *)(&UNK_0077dfdc + uVar5 * 0x30);
      mbedtls_camellia_crypt_ecb(auStack_208,uVar2,&local_d0,&local_d0);
    }
    iVar9 = memcmp(&local_d0,&local_230,0x10);
    uVar7 = uStack_218;
    uVar6 = local_220;
    if (iVar9 != 0) goto LAB_00b7305c;
    if ((uVar15 & 1) == 0) {
      uStack_218 = *(undefined8 *)(&UNK_0077dfec + uVar5 * 0x30);
      local_220 = *(undefined8 *)(&DAT_0077dfe4 + uVar5 * 0x30);
      uStack_228 = 0xef520a1a19c1fbe5;
      local_230 = 0x11e45ca3461cc830;
      mbedtls_camellia_crypt_ecb(auStack_208,0,&local_220,&local_d0);
      local_d0 = CONCAT17((byte)(local_d0 >> 0x38) ^ (byte)((ulong)uVar6 >> 0x38),
                          CONCAT16((byte)(local_d0 >> 0x30) ^ (byte)((ulong)uVar6 >> 0x30),
                                   CONCAT15((byte)(local_d0 >> 0x28) ^ (byte)((ulong)uVar6 >> 0x28),
                                            CONCAT14((byte)(local_d0 >> 0x20) ^
                                                     (byte)((ulong)uVar6 >> 0x20),
                                                     CONCAT13((byte)(local_d0 >> 0x18) ^
                                                              (byte)((ulong)uVar6 >> 0x18),
                                                              CONCAT12((byte)(local_d0 >> 0x10) ^
                                                                       (byte)((ulong)uVar6 >> 0x10),
                                                                       CONCAT11((byte)(local_d0 >> 8
                                                                                      ) ^ (byte)((
                                                  ulong)uVar6 >> 8),(byte)local_d0 ^ (byte)uVar6))))
                                           )));
      uStack_c8 = CONCAT17((byte)(uStack_c8 >> 0x38) ^ (byte)((ulong)uVar7 >> 0x38),
                           CONCAT16((byte)(uStack_c8 >> 0x30) ^ (byte)((ulong)uVar7 >> 0x30),
                                    CONCAT15((byte)(uStack_c8 >> 0x28) ^
                                             (byte)((ulong)uVar7 >> 0x28),
                                             CONCAT14((byte)(uStack_c8 >> 0x20) ^
                                                      (byte)((ulong)uVar7 >> 0x20),
                                                      CONCAT13((byte)(uStack_c8 >> 0x18) ^
                                                               (byte)((ulong)uVar7 >> 0x18),
                                                               CONCAT12((byte)(uStack_c8 >> 0x10) ^
                                                                        (byte)((ulong)uVar7 >> 0x10)
                                                                        ,CONCAT11((byte)(uStack_c8
                                                                                        >> 8) ^
                                                                                  (byte)((ulong)
                                                  uVar7 >> 8),(byte)uStack_c8 ^ (byte)uVar7)))))));
    }
    else {
      uStack_218 = 0xef520a1a19c1fbe5;
      local_220 = 0x11e45ca3461cc830;
      local_d0 = local_230 ^ 0x11e45ca3461cc830;
      uStack_c8 = uStack_228 ^ 0xef520a1a19c1fbe5;
      local_230 = *(ulong *)(&DAT_0077dfe4 + uVar5 * 0x30);
      uStack_228 = *(ulong *)(&UNK_0077dfec + uVar5 * 0x30);
      mbedtls_camellia_crypt_ecb(auStack_208,uVar2,&local_d0,&local_d0);
    }
    iVar9 = memcmp(&local_d0,&local_230,0x10);
    if (iVar9 != 0) goto LAB_00b7305c;
    if (param_1 != 0) {
      puts("passed");
    }
    uVar2 = (uint)uVar15 + 1;
    uVar15 = (ulong)uVar2;
  } while (uVar2 < 6);
  if (param_1 != 0) {
    putchar(10);
  }
  uVar15 = 0;
  do {
    uVar5 = uVar15 >> 1;
    if (param_1 != 0) {
      pcVar11 = "dec";
      if ((uVar15 & 1) != 0) {
        pcVar11 = "enc";
      }
      printf("  CAMELLIA-CTR-128 (%s): ",pcVar11);
    }
    lVar10 = uVar5 * 0x10;
    uStack_d8 = *(undefined8 *)(&UNK_0077e08c + lVar10);
    local_e0 = *(undefined8 *)(&DAT_0077e084 + lVar10);
    uStack_88 = *(undefined8 *)(&UNK_0077e0bc + lVar10);
    local_90 = *(undefined8 *)(&DAT_0077e0b4 + lVar10);
    mbedtls_camellia_setkey_enc(auStack_208,&local_90,0x80);
    __n = (size_t)(int)(&DAT_0077e0e4)[uVar5];
    if ((uVar15 & 1) == 0) {
      memcpy(&local_d0,&DAT_0077e0f0 + uVar5 * 0x30,__n);
      uVar14 = 0;
      sVar13 = __n;
      puVar16 = &local_d0;
      do {
        sVar13 = sVar13 - 1;
        if (uVar14 == 0) {
          mbedtls_camellia_crypt_ecb(auStack_208,1,&local_e0,local_f0);
          lVar10 = 0xf;
          do {
            if (lVar10 == -1) break;
            bVar3 = local_f0[lVar10 + 0x10];
            local_f0[lVar10 + 0x10] = bVar3 + 1;
            lVar10 = lVar10 + -1;
          } while ((byte)(bVar3 + 1) == 0);
        }
        pbVar1 = local_f0 + uVar14;
        uVar14 = (ulong)((int)uVar14 + 1) & 0xf;
        *(byte *)puVar16 = *pbVar1 ^ (byte)*puVar16;
        puVar16 = (ulong *)((long)puVar16 + 1);
      } while (sVar13 != 0);
      pcVar11 = "Single block msg";
    }
    else {
      memcpy(&local_d0,"Single block msg" + uVar5 * 0x30,__n);
      uVar14 = 0;
      sVar13 = __n;
      puVar16 = &local_d0;
      do {
        sVar13 = sVar13 - 1;
        if (uVar14 == 0) {
          mbedtls_camellia_crypt_ecb(auStack_208,1,&local_e0,local_f0);
          lVar10 = 0xf;
          do {
            if (lVar10 == -1) break;
            bVar3 = local_f0[lVar10 + 0x10];
            local_f0[lVar10 + 0x10] = bVar3 + 1;
            lVar10 = lVar10 + -1;
          } while ((byte)(bVar3 + 1) == 0);
        }
        pbVar1 = local_f0 + uVar14;
        uVar14 = (ulong)((int)uVar14 + 1) & 0xf;
        *(byte *)puVar16 = *pbVar1 ^ (byte)*puVar16;
        puVar16 = (ulong *)((long)puVar16 + 1);
      } while (sVar13 != 0);
      pcVar11 = &DAT_0077e0f0;
    }
    iVar9 = memcmp(&local_d0,pcVar11 + uVar5 * 0x30,__n);
    if (iVar9 != 0) goto LAB_00b7305c;
    if (param_1 != 0) {
      puts("passed");
    }
    uVar2 = (int)uVar15 + 1;
    uVar15 = (ulong)uVar2;
  } while (uVar2 < 6);
  uVar12 = 0;
  if (param_1 != 0) {
    putchar(10);
    uVar12 = 0;
  }
LAB_00b73070:
  mbedtls_platform_zeroize(auStack_208,0x114);
  if (*(long *)(lVar4 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar12;
LAB_00b7305c:
  if (param_1 != 0) {
    puts("failed");
  }
  uVar12 = 1;
  goto LAB_00b73070;
}

