/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b71084
 */

undefined4 mbedtls_aria_self_test(int param_1)

{
  byte *pbVar1;
  byte bVar2;
  byte bVar3;
  char cVar4;
  long lVar5;
  int iVar6;
  int iVar7;
  long lVar8;
  undefined4 uVar9;
  long lVar10;
  byte *pbVar11;
  ulong *__s2;
  undefined1 *puVar12;
  ulong uVar13;
  ulong uVar14;
  ulong *puVar15;
  char cStack_1f1;
  ulong local_1f0;
  ulong uStack_1e8;
  ulong local_1e0;
  ulong uStack_1d8;
  ulong local_1d0;
  ulong uStack_1c8;
  ulong local_1c0;
  ulong uStack_1b8;
  undefined1 auStack_1a8 [280];
  byte local_90 [16];
  ulong local_80;
  ulong uStack_78;
  long local_70;
  
  lVar5 = tpidr_el0;
  local_70 = *(long *)(lVar5 + 0x28);
  memset(auStack_1a8,0,0x114);
  if (param_1 != 0) {
    printf("  ARIA-ECB-%d (enc): ",0x80);
  }
  mbedtls_aria_setkey_enc(auStack_1a8,&DAT_0077db1c,0x80);
  mbedtls_aria_crypt_ecb(auStack_1a8,&DAT_0077db3c,local_90);
  iVar6 = memcmp(local_90,&DAT_0077db4c,0x10);
  if (iVar6 == 0) {
    if (param_1 != 0) {
      puts("passed");
      printf("  ARIA-ECB-%d (dec): ",0x80);
    }
    mbedtls_aria_setkey_dec(auStack_1a8,&DAT_0077db1c,0x80);
    mbedtls_aria_crypt_ecb(auStack_1a8,&DAT_0077db4c,local_90);
    iVar6 = memcmp(local_90,&DAT_0077db3c,0x10);
    if (iVar6 == 0) {
      if (param_1 != 0) {
        puts("passed");
        printf("  ARIA-ECB-%d (enc): ",0xc0);
      }
      mbedtls_aria_setkey_enc(auStack_1a8,&DAT_0077db1c,0xc0);
      mbedtls_aria_crypt_ecb(auStack_1a8,&DAT_0077db3c,local_90);
      iVar6 = memcmp(local_90,&DAT_0077db5c,0x10);
      if (iVar6 == 0) {
        if (param_1 != 0) {
          puts("passed");
          printf("  ARIA-ECB-%d (dec): ",0xc0);
        }
        mbedtls_aria_setkey_dec(auStack_1a8,&DAT_0077db1c,0xc0);
        mbedtls_aria_crypt_ecb(auStack_1a8,&DAT_0077db5c,local_90);
        iVar6 = memcmp(local_90,&DAT_0077db3c,0x10);
        if (iVar6 == 0) {
          if (param_1 != 0) {
            puts("passed");
            printf("  ARIA-ECB-%d (enc): ",0x100);
          }
          mbedtls_aria_setkey_enc(auStack_1a8,&DAT_0077db1c,0x100);
          mbedtls_aria_crypt_ecb(auStack_1a8,&DAT_0077db3c,local_90);
          iVar6 = memcmp(local_90,&DAT_0077db6c,0x10);
          if (iVar6 == 0) {
            if (param_1 != 0) {
              puts("passed");
              printf("  ARIA-ECB-%d (dec): ",0x100);
            }
            mbedtls_aria_setkey_dec(auStack_1a8,&DAT_0077db1c,0x100);
            mbedtls_aria_crypt_ecb(auStack_1a8,&DAT_0077db6c,local_90);
            iVar6 = memcmp(local_90,&DAT_0077db3c,0x10);
            if (iVar6 == 0) {
              if (param_1 != 0) {
                puts("passed");
                putchar(10);
              }
              uVar14 = 0;
              iVar6 = 0x80;
              puVar15 = (ulong *)&DAT_0077dbec;
              do {
                if (param_1 != 0) {
                  printf("  ARIA-CBC-%d (enc): ",iVar6);
                }
                mbedtls_aria_setkey_enc(auStack_1a8,&DAT_0077db7c,iVar6);
                uStack_1e8 = 0xf0e1d2c3b4a59687;
                local_1f0 = 0x78695a4b3c2d1e0f;
                local_1c0 = 0x5555555555555555;
                uStack_1b8 = 0x5555555555555555;
                local_1d0 = 0x5555555555555555;
                uStack_1c8 = 0x5555555555555555;
                uStack_1d8 = 0x4b5a6978a5b48796;
                local_1e0 = 0xd2c3f0e12d3c0f1e;
                mbedtls_aria_crypt_ecb(auStack_1a8,&local_1e0,&local_1e0);
                uStack_1e8 = uStack_1d8;
                local_1f0 = local_1e0;
                local_1d0 = local_1e0 ^ 0xcccccccc11111111;
                uStack_1c8 = uStack_1d8 ^ 0xdddddddd11111111;
                mbedtls_aria_crypt_ecb(auStack_1a8,&local_1d0,&local_1d0);
                uStack_1e8 = uStack_1c8;
                local_1f0 = local_1d0;
                local_1c0 = local_1d0 ^ 0xaaaaaaaa22222222;
                uStack_1b8 = uStack_1c8 ^ 0xbbbbbbbb22222222;
                mbedtls_aria_crypt_ecb(auStack_1a8,&local_1c0,&local_1c0);
                __s2 = puVar15 + -4;
                uStack_1e8 = uStack_1b8;
                local_1f0 = local_1c0;
                iVar7 = memcmp(&local_1e0,__s2,0x30);
                if (iVar7 != 0) goto LAB_00b712ec;
                if (param_1 != 0) {
                  puts("passed");
                  printf("  ARIA-CBC-%d (dec): ",iVar6);
                }
                mbedtls_aria_setkey_dec(auStack_1a8,&DAT_0077db7c,iVar6);
                uStack_78 = puVar15[-3];
                local_80 = *__s2;
                local_1c0 = 0xaaaaaaaaaaaaaaaa;
                uStack_1b8 = 0xaaaaaaaaaaaaaaaa;
                uStack_1c8 = 0xaaaaaaaaaaaaaaaa;
                uStack_1d8 = 0xaaaaaaaaaaaaaaaa;
                local_1d0 = 0xaaaaaaaaaaaaaaaa;
                local_1e0 = 0xaaaaaaaaaaaaaaaa;
                mbedtls_aria_crypt_ecb(auStack_1a8,__s2,&local_1e0);
                local_1e0 = local_1e0 ^ 0x78695a4b3c2d1e0f;
                uStack_1d8 = uStack_1d8 ^ 0xf0e1d2c3b4a59687;
                uStack_1e8 = uStack_78;
                local_1f0 = local_80;
                local_80 = puVar15[-2];
                uStack_78 = puVar15[-1];
                mbedtls_aria_crypt_ecb(auStack_1a8,puVar15 + -2,&local_1d0);
                local_1d0 = CONCAT17((byte)(local_1f0 >> 0x38) ^ (byte)(local_1d0 >> 0x38),
                                     CONCAT16((byte)(local_1f0 >> 0x30) ^ (byte)(local_1d0 >> 0x30),
                                              CONCAT15((byte)(local_1f0 >> 0x28) ^
                                                       (byte)(local_1d0 >> 0x28),
                                                       CONCAT14((byte)(local_1f0 >> 0x20) ^
                                                                (byte)(local_1d0 >> 0x20),
                                                                CONCAT13((byte)(local_1f0 >> 0x18) ^
                                                                         (byte)(local_1d0 >> 0x18),
                                                                         CONCAT12((byte)(local_1f0
                                                                                        >> 0x10) ^
                                                                                  (byte)(local_1d0
                                                                                        >> 0x10),
                                                                                  CONCAT11((byte)(
                                                  local_1f0 >> 8) ^ (byte)(local_1d0 >> 8),
                                                  (byte)local_1f0 ^ (byte)local_1d0)))))));
                uStack_1c8 = CONCAT17((byte)(uStack_1e8 >> 0x38) ^ (byte)(uStack_1c8 >> 0x38),
                                      CONCAT16((byte)(uStack_1e8 >> 0x30) ^
                                               (byte)(uStack_1c8 >> 0x30),
                                               CONCAT15((byte)(uStack_1e8 >> 0x28) ^
                                                        (byte)(uStack_1c8 >> 0x28),
                                                        CONCAT14((byte)(uStack_1e8 >> 0x20) ^
                                                                 (byte)(uStack_1c8 >> 0x20),
                                                                 CONCAT13((byte)(uStack_1e8 >> 0x18)
                                                                          ^ (byte)(uStack_1c8 >>
                                                                                  0x18),
                                                                          CONCAT12((byte)(uStack_1e8
                                                                                         >> 0x10) ^
                                                                                   (byte)(uStack_1c8
                                                                                         >> 0x10),
                                                                                   CONCAT11((byte)(
                                                  uStack_1e8 >> 8) ^ (byte)(uStack_1c8 >> 8),
                                                  (byte)uStack_1e8 ^ (byte)uStack_1c8)))))));
                uStack_1e8 = uStack_78;
                local_1f0 = local_80;
                local_80 = *puVar15;
                uStack_78 = puVar15[1];
                mbedtls_aria_crypt_ecb(auStack_1a8,puVar15,&local_1c0);
                local_1c0 = CONCAT17((byte)(local_1f0 >> 0x38) ^ (byte)(local_1c0 >> 0x38),
                                     CONCAT16((byte)(local_1f0 >> 0x30) ^ (byte)(local_1c0 >> 0x30),
                                              CONCAT15((byte)(local_1f0 >> 0x28) ^
                                                       (byte)(local_1c0 >> 0x28),
                                                       CONCAT14((byte)(local_1f0 >> 0x20) ^
                                                                (byte)(local_1c0 >> 0x20),
                                                                CONCAT13((byte)(local_1f0 >> 0x18) ^
                                                                         (byte)(local_1c0 >> 0x18),
                                                                         CONCAT12((byte)(local_1f0
                                                                                        >> 0x10) ^
                                                                                  (byte)(local_1c0
                                                                                        >> 0x10),
                                                                                  CONCAT11((byte)(
                                                  local_1f0 >> 8) ^ (byte)(local_1c0 >> 8),
                                                  (byte)local_1f0 ^ (byte)local_1c0)))))));
                uStack_1b8 = CONCAT17((byte)(uStack_1e8 >> 0x38) ^ (byte)(uStack_1b8 >> 0x38),
                                      CONCAT16((byte)(uStack_1e8 >> 0x30) ^
                                               (byte)(uStack_1b8 >> 0x30),
                                               CONCAT15((byte)(uStack_1e8 >> 0x28) ^
                                                        (byte)(uStack_1b8 >> 0x28),
                                                        CONCAT14((byte)(uStack_1e8 >> 0x20) ^
                                                                 (byte)(uStack_1b8 >> 0x20),
                                                                 CONCAT13((byte)(uStack_1e8 >> 0x18)
                                                                          ^ (byte)(uStack_1b8 >>
                                                                                  0x18),
                                                                          CONCAT12((byte)(uStack_1e8
                                                                                         >> 0x10) ^
                                                                                   (byte)(uStack_1b8
                                                                                         >> 0x10),
                                                                                   CONCAT11((byte)(
                                                  uStack_1e8 >> 8) ^ (byte)(uStack_1b8 >> 8),
                                                  (byte)uStack_1e8 ^ (byte)uStack_1b8)))))));
                uStack_1e8 = uStack_78;
                local_1f0 = local_80;
                iVar7 = memcmp(&local_1e0,&DAT_0077db9c,0x30);
                if (iVar7 != 0) goto LAB_00b712ec;
                if (param_1 != 0) {
                  puts("passed");
                }
                uVar14 = uVar14 + 1;
                iVar6 = iVar6 + 0x40;
                puVar15 = puVar15 + 6;
              } while (uVar14 < 3);
              if (param_1 != 0) {
                putchar(10);
              }
              uVar14 = 0;
              puVar12 = &DAT_0077dc5c;
              do {
                iVar6 = (int)uVar14 * 0x40 + 0x80;
                if (param_1 != 0) {
                  printf("  ARIA-CFB-%d (enc): ",iVar6);
                }
                mbedtls_aria_setkey_enc(auStack_1a8,&DAT_0077db7c,iVar6);
                lVar10 = 0;
                uVar13 = 0;
                uStack_1e8 = 0xf0e1d2c3b4a59687;
                local_1f0 = 0x78695a4b3c2d1e0f;
                local_1c0 = 0x5555555555555555;
                uStack_1b8 = 0x5555555555555555;
                local_1d0 = 0x5555555555555555;
                uStack_1c8 = 0x5555555555555555;
                local_1e0 = 0x5555555555555555;
                uStack_1d8 = 0x5555555555555555;
                do {
                  if (uVar13 == 0) {
                    mbedtls_aria_crypt_ecb(auStack_1a8,&local_1f0,&local_1f0);
                  }
                  bVar2 = auStack_1a8[uVar13 - 0x48];
                  bVar3 = (&DAT_0077db9c)[lVar10];
                  auStack_1a8[lVar10 + -0x38] = bVar3 ^ bVar2;
                  lVar10 = lVar10 + 1;
                  auStack_1a8[uVar13 - 0x48] = bVar3 ^ bVar2;
                  uVar13 = (ulong)((int)uVar13 + 1) & 0xf;
                } while (lVar10 != 0x30);
                iVar7 = memcmp(&local_1e0,&DAT_0077dc5c + uVar14 * 0x30,0x30);
                if (iVar7 != 0) goto LAB_00b712ec;
                if (param_1 != 0) {
                  puts("passed");
                  printf("  ARIA-CFB-%d (dec): ",iVar6);
                }
                mbedtls_aria_setkey_enc(auStack_1a8,&DAT_0077db7c,iVar6);
                lVar10 = 0;
                uVar13 = 0;
                uStack_1e8 = 0xf0e1d2c3b4a59687;
                local_1f0 = 0x78695a4b3c2d1e0f;
                local_1c0 = 0xaaaaaaaaaaaaaaaa;
                uStack_1b8 = 0xaaaaaaaaaaaaaaaa;
                local_1d0 = 0xaaaaaaaaaaaaaaaa;
                uStack_1c8 = 0xaaaaaaaaaaaaaaaa;
                local_1e0 = 0xaaaaaaaaaaaaaaaa;
                uStack_1d8 = 0xaaaaaaaaaaaaaaaa;
                do {
                  if (uVar13 == 0) {
                    mbedtls_aria_crypt_ecb(auStack_1a8,&local_1f0,&local_1f0);
                  }
                  bVar2 = puVar12[lVar10];
                  bVar3 = auStack_1a8[uVar13 - 0x48];
                  auStack_1a8[uVar13 - 0x48] = bVar2;
                  auStack_1a8[lVar10 + -0x38] = bVar3 ^ bVar2;
                  lVar10 = lVar10 + 1;
                  uVar13 = (ulong)((int)uVar13 + 1) & 0xf;
                } while (lVar10 != 0x30);
                iVar6 = memcmp(&local_1e0,&DAT_0077db9c,0x30);
                if (iVar6 != 0) goto LAB_00b712ec;
                if (param_1 != 0) {
                  puts("passed");
                }
                uVar14 = uVar14 + 1;
                puVar12 = puVar12 + 0x30;
              } while (uVar14 < 3);
              if (param_1 != 0) {
                putchar(10);
              }
              uVar14 = 0;
              do {
                iVar6 = (int)uVar14 * 0x40 + 0x80;
                if (param_1 != 0) {
                  printf("  ARIA-CTR-%d (enc): ",iVar6);
                }
                mbedtls_aria_setkey_enc(auStack_1a8,&DAT_0077db7c,iVar6);
                uVar13 = 0;
                lVar10 = 0x30;
                local_1f0 = 0;
                uStack_1e8 = 0;
                local_1c0 = 0x5555555555555555;
                uStack_1b8 = 0x5555555555555555;
                local_1d0 = 0x5555555555555555;
                uStack_1c8 = 0x5555555555555555;
                local_1e0 = 0x5555555555555555;
                uStack_1d8 = 0x5555555555555555;
                pbVar11 = &DAT_0077db9c;
                puVar15 = &local_1e0;
                do {
                  lVar10 = lVar10 + -1;
                  if (uVar13 == 0) {
                    mbedtls_aria_crypt_ecb(auStack_1a8,&local_1f0,local_90);
                    lVar8 = 0xf;
                    do {
                      if (lVar8 == -1) break;
                      cVar4 = auStack_1a8[lVar8 + -0x48];
                      auStack_1a8[lVar8 + -0x48] = cVar4 + '\x01';
                      lVar8 = lVar8 + -1;
                    } while ((char)(cVar4 + '\x01') == '\0');
                  }
                  pbVar1 = local_90 + uVar13;
                  uVar13 = (ulong)((int)uVar13 + 1) & 0xf;
                  *(byte *)puVar15 = *pbVar1 ^ *pbVar11;
                  pbVar11 = pbVar11 + 1;
                  puVar15 = (ulong *)((long)puVar15 + 1);
                } while (lVar10 != 0);
                iVar7 = memcmp(&local_1e0,&DAT_0077dcec + uVar14 * 0x30,0x30);
                if (iVar7 != 0) goto LAB_00b712ec;
                if (param_1 != 0) {
                  puts("passed");
                  printf("  ARIA-CTR-%d (dec): ",iVar6);
                }
                mbedtls_aria_setkey_enc(auStack_1a8,&DAT_0077db7c,iVar6);
                uVar13 = 0;
                lVar10 = 0x30;
                local_1f0 = 0;
                uStack_1e8 = 0;
                local_1c0 = 0xaaaaaaaaaaaaaaaa;
                uStack_1b8 = 0xaaaaaaaaaaaaaaaa;
                local_1d0 = 0xaaaaaaaaaaaaaaaa;
                uStack_1c8 = 0xaaaaaaaaaaaaaaaa;
                local_1e0 = 0xaaaaaaaaaaaaaaaa;
                uStack_1d8 = 0xaaaaaaaaaaaaaaaa;
                puVar15 = &local_1e0;
                pbVar11 = &DAT_0077dcec + uVar14 * 0x30;
                do {
                  lVar10 = lVar10 + -1;
                  if (uVar13 == 0) {
                    mbedtls_aria_crypt_ecb(auStack_1a8,&local_1f0,local_90);
                    lVar8 = 0xf;
                    do {
                      if (lVar8 == -1) break;
                      cVar4 = auStack_1a8[lVar8 + -0x48];
                      auStack_1a8[lVar8 + -0x48] = cVar4 + '\x01';
                      lVar8 = lVar8 + -1;
                    } while ((char)(cVar4 + '\x01') == '\0');
                  }
                  pbVar1 = local_90 + uVar13;
                  uVar13 = (ulong)((int)uVar13 + 1) & 0xf;
                  *(byte *)puVar15 = *pbVar1 ^ *pbVar11;
                  puVar15 = (ulong *)((long)puVar15 + 1);
                  pbVar11 = pbVar11 + 1;
                } while (lVar10 != 0);
                iVar6 = memcmp(&local_1e0,&DAT_0077db9c,0x30);
                if (iVar6 != 0) goto LAB_00b712ec;
                if (param_1 != 0) {
                  puts("passed");
                }
                uVar14 = uVar14 + 1;
              } while (uVar14 < 3);
              uVar9 = 0;
              if (param_1 != 0) {
                putchar(10);
                uVar9 = 0;
              }
              goto LAB_00b71300;
            }
          }
        }
      }
    }
  }
LAB_00b712ec:
  if (param_1 != 0) {
    puts("failed");
  }
  uVar9 = 1;
LAB_00b71300:
  mbedtls_platform_zeroize(auStack_1a8,0x114);
  if (*(long *)(lVar5 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar9;
}

