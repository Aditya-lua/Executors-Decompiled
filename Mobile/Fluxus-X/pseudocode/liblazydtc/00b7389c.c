/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7389c
 */

int FUN_00b7389c(undefined8 *param_1,void *param_2,ulong param_3)

{
  ulong uVar1;
  uint uVar2;
  long lVar3;
  int iVar4;
  undefined8 *puVar5;
  ulong uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 local_380;
  undefined8 uStack_378;
  undefined1 auStack_370 [288];
  undefined8 local_250;
  undefined8 uStack_248;
  undefined8 uStack_240;
  undefined8 uStack_238;
  undefined8 local_230;
  undefined8 uStack_228;
  undefined8 local_220;
  undefined8 uStack_218;
  undefined8 local_210;
  undefined8 uStack_208;
  undefined8 uStack_1f8;
  undefined8 uStack_1f0;
  uint local_1e8;
  undefined1 local_1e1;
  undefined1 auStack_1e0 [392];
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  if (0x180 < param_3) {
    iVar4 = -0x38;
    goto LAB_00b73b54;
  }
  memset(&uStack_1f8,0,0x1a0);
  uVar2 = ((uint)param_3 & 0xff00ff00) >> 8 | ((uint)param_3 & 0xff00ff) << 8;
  local_1e8 = uVar2 >> 0x10 | uVar2 << 0x10;
  local_1e1 = 0x30;
  memcpy(auStack_1e0,param_2,param_3);
  auStack_1e0[param_3] = 0x80;
  uStack_248 = 0xf0e0d0c0b0a0908;
  local_250 = 0x706050403020100;
  uStack_238 = 0x1f1e1d1c1b1a1918;
  uStack_240 = 0x1716151413121110;
  mbedtls_aes_init(auStack_370);
  iVar4 = mbedtls_aes_setkey_enc(auStack_370,&local_250,0x100);
  if (iVar4 == 0) {
    param_3 = param_3 + 0x19;
    local_380 = 0;
    uStack_378 = 0;
    puVar5 = &uStack_1f8;
    uVar6 = param_3;
    do {
      uVar8 = uStack_378;
      uVar7 = local_380;
      if (uVar6 == 0) {
        local_380 = 0;
        uStack_378 = 0;
        uStack_228 = uVar8;
        local_230 = uVar7;
        uStack_1f8._3_1_ = uStack_1f8._3_1_ + '\x01';
        puVar5 = &uStack_1f8;
        uVar6 = param_3;
        goto LAB_00b739cc;
      }
      uVar8 = puVar5[1];
      uVar7 = *puVar5;
      uVar1 = uVar6;
      if (0xf < uVar6) {
        uVar1 = 0x10;
      }
      local_380 = CONCAT17((byte)((ulong)uVar7 >> 0x38) ^ (byte)((ulong)local_380 >> 0x38),
                           CONCAT16((byte)((ulong)uVar7 >> 0x30) ^ (byte)((ulong)local_380 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar7 >> 0x28) ^
                                             (byte)((ulong)local_380 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar7 >> 0x20) ^
                                                      (byte)((ulong)local_380 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar7 >> 0x18) ^
                                                               (byte)((ulong)local_380 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar7 >> 0x10)
                                                                        ^ (byte)((ulong)local_380 >>
                                                                                0x10),
                                                                        CONCAT11((byte)((ulong)uVar7
                                                                                       >> 8) ^
                                                                                 (byte)((ulong)
                                                  local_380 >> 8),(byte)uVar7 ^ (byte)local_380)))))
                                   ));
      uStack_378 = CONCAT17((byte)((ulong)uVar8 >> 0x38) ^ (byte)((ulong)uStack_378 >> 0x38),
                            CONCAT16((byte)((ulong)uVar8 >> 0x30) ^
                                     (byte)((ulong)uStack_378 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar8 >> 0x28) ^
                                              (byte)((ulong)uStack_378 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar8 >> 0x20) ^
                                                       (byte)((ulong)uStack_378 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar8 >> 0x18) ^
                                                                (byte)((ulong)uStack_378 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar8 >> 0x10
                                                                               ) ^ (byte)((ulong)
                                                  uStack_378 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar8 >> 8) ^
                                                           (byte)((ulong)uStack_378 >> 8),
                                                           (byte)uVar8 ^ (byte)uStack_378)))))));
      uVar6 = uVar6 - uVar1;
      iVar4 = mbedtls_aes_crypt_ecb(auStack_370,1,&local_380,&local_380);
      puVar5 = puVar5 + 2;
    } while (iVar4 == 0);
  }
  goto LAB_00b73b0c;
  while( true ) {
    uVar8 = puVar5[1];
    uVar7 = *puVar5;
    uVar1 = uVar6;
    if (0xf < uVar6) {
      uVar1 = 0x10;
    }
    local_380 = CONCAT17((byte)((ulong)uVar7 >> 0x38) ^ (byte)((ulong)local_380 >> 0x38),
                         CONCAT16((byte)((ulong)uVar7 >> 0x30) ^ (byte)((ulong)local_380 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar7 >> 0x28) ^
                                           (byte)((ulong)local_380 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar7 >> 0x20) ^
                                                    (byte)((ulong)local_380 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar7 >> 0x18) ^
                                                             (byte)((ulong)local_380 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar7 >> 0x10) ^
                                                                      (byte)((ulong)local_380 >>
                                                                            0x10),
                                                                      CONCAT11((byte)((ulong)uVar7
                                                                                     >> 8) ^
                                                                               (byte)((ulong)
                                                  local_380 >> 8),(byte)uVar7 ^ (byte)local_380)))))
                                 ));
    uStack_378 = CONCAT17((byte)((ulong)uVar8 >> 0x38) ^ (byte)((ulong)uStack_378 >> 0x38),
                          CONCAT16((byte)((ulong)uVar8 >> 0x30) ^ (byte)((ulong)uStack_378 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar8 >> 0x28) ^
                                            (byte)((ulong)uStack_378 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar8 >> 0x20) ^
                                                     (byte)((ulong)uStack_378 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar8 >> 0x18) ^
                                                              (byte)((ulong)uStack_378 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar8 >> 0x10)
                                                                       ^ (byte)((ulong)uStack_378 >>
                                                                               0x10),
                                                                       CONCAT11((byte)((ulong)uVar8
                                                                                      >> 8) ^
                                                                                (byte)((ulong)
                                                  uStack_378 >> 8),(byte)uVar8 ^ (byte)uStack_378)))
                                                  ))));
    uVar6 = uVar6 - uVar1;
    iVar4 = mbedtls_aes_crypt_ecb(auStack_370,1,&local_380,&local_380);
    puVar5 = puVar5 + 2;
    if (iVar4 != 0) break;
LAB_00b739cc:
    uVar8 = uStack_378;
    uVar7 = local_380;
    if (uVar6 == 0) {
      local_380 = 0;
      uStack_378 = 0;
      uStack_218 = uVar8;
      local_220 = uVar7;
      uStack_1f8._3_1_ = uStack_1f8._3_1_ + '\x01';
      puVar5 = &uStack_1f8;
      goto LAB_00b73a2c;
    }
  }
  goto LAB_00b73b0c;
  while( true ) {
    uVar8 = puVar5[1];
    uVar7 = *puVar5;
    uVar6 = param_3;
    if (0xf < param_3) {
      uVar6 = 0x10;
    }
    local_380 = CONCAT17((byte)((ulong)uVar7 >> 0x38) ^ (byte)((ulong)local_380 >> 0x38),
                         CONCAT16((byte)((ulong)uVar7 >> 0x30) ^ (byte)((ulong)local_380 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar7 >> 0x28) ^
                                           (byte)((ulong)local_380 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar7 >> 0x20) ^
                                                    (byte)((ulong)local_380 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar7 >> 0x18) ^
                                                             (byte)((ulong)local_380 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar7 >> 0x10) ^
                                                                      (byte)((ulong)local_380 >>
                                                                            0x10),
                                                                      CONCAT11((byte)((ulong)uVar7
                                                                                     >> 8) ^
                                                                               (byte)((ulong)
                                                  local_380 >> 8),(byte)uVar7 ^ (byte)local_380)))))
                                 ));
    uStack_378 = CONCAT17((byte)((ulong)uVar8 >> 0x38) ^ (byte)((ulong)uStack_378 >> 0x38),
                          CONCAT16((byte)((ulong)uVar8 >> 0x30) ^ (byte)((ulong)uStack_378 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar8 >> 0x28) ^
                                            (byte)((ulong)uStack_378 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar8 >> 0x20) ^
                                                     (byte)((ulong)uStack_378 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar8 >> 0x18) ^
                                                              (byte)((ulong)uStack_378 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar8 >> 0x10)
                                                                       ^ (byte)((ulong)uStack_378 >>
                                                                               0x10),
                                                                       CONCAT11((byte)((ulong)uVar8
                                                                                      >> 8) ^
                                                                                (byte)((ulong)
                                                  uStack_378 >> 8),(byte)uVar8 ^ (byte)uStack_378)))
                                                  ))));
    param_3 = param_3 - uVar6;
    iVar4 = mbedtls_aes_crypt_ecb(auStack_370,1,&local_380,&local_380);
    puVar5 = puVar5 + 2;
    if (iVar4 != 0) break;
LAB_00b73a2c:
    if (param_3 == 0) {
      uStack_1f8._3_1_ = uStack_1f8._3_1_ + '\x01';
      uStack_208 = uStack_378;
      local_210 = local_380;
      iVar4 = mbedtls_aes_setkey_enc(auStack_370,&local_230,0x100);
      if (iVar4 == 0) {
        iVar4 = mbedtls_aes_crypt_ecb(auStack_370,1,&local_210,&local_210);
        if (iVar4 == 0) {
          param_1[1] = uStack_208;
          *param_1 = local_210;
          iVar4 = mbedtls_aes_crypt_ecb(auStack_370,1,&local_210,&local_210);
          if (iVar4 == 0) {
            param_1[3] = uStack_208;
            param_1[2] = local_210;
            iVar4 = mbedtls_aes_crypt_ecb(auStack_370,1,&local_210,&local_210);
            if (iVar4 == 0) {
              param_1[5] = uStack_208;
              param_1[4] = local_210;
            }
          }
        }
      }
      break;
    }
  }
LAB_00b73b0c:
  mbedtls_aes_free(auStack_370);
  mbedtls_platform_zeroize(&uStack_1f8,0x1a0);
  mbedtls_platform_zeroize(&local_230,0x30);
  mbedtls_platform_zeroize(&local_250,0x20);
  mbedtls_platform_zeroize(&local_380,0x10);
  if (iVar4 != 0) {
    mbedtls_platform_zeroize(param_1,0x30);
  }
LAB_00b73b54:
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

