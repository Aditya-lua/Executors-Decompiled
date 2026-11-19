/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b73b88
 */

int FUN_00b73b88(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  int iVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  undefined8 uStack_58;
  long local_48;
  
  lVar4 = tpidr_el0;
  local_48 = *(long *)(lVar4 + 0x28);
  puVar1 = param_1 + 5;
  lVar6 = 0xc;
  uStack_68 = 0;
  local_70 = 0;
  uStack_58 = 0;
  local_60 = 0;
  uStack_78 = 0;
  local_80 = 0;
  do {
    uVar2 = (*(uint *)((long)param_1 + lVar6) & 0xff00ff00) >> 8 |
            (*(uint *)((long)param_1 + lVar6) & 0xff00ff) << 8;
    uVar2 = (uVar2 >> 0x10 | uVar2 << 0x10) + 1;
    uVar3 = (uVar2 & 0xff00ff00) >> 8 | (uVar2 & 0xff00ff) << 8;
    *(uint *)((long)param_1 + lVar6) = uVar3 >> 0x10 | uVar3 << 0x10;
    if (lVar6 == 0) break;
    lVar6 = lVar6 + -4;
  } while (uVar2 == 0);
  iVar5 = mbedtls_aes_crypt_ecb(puVar1,1,param_1,&local_80);
  if (iVar5 == 0) {
    lVar6 = 0xc;
    do {
      uVar2 = (*(uint *)((long)param_1 + lVar6) & 0xff00ff00) >> 8 |
              (*(uint *)((long)param_1 + lVar6) & 0xff00ff) << 8;
      uVar2 = (uVar2 >> 0x10 | uVar2 << 0x10) + 1;
      uVar3 = (uVar2 & 0xff00ff00) >> 8 | (uVar2 & 0xff00ff) << 8;
      *(uint *)((long)param_1 + lVar6) = uVar3 >> 0x10 | uVar3 << 0x10;
      if (lVar6 == 0) break;
      lVar6 = lVar6 + -4;
    } while (uVar2 == 0);
    iVar5 = mbedtls_aes_crypt_ecb(puVar1,1,param_1,&local_70);
    if (iVar5 == 0) {
      lVar6 = 0xc;
      do {
        uVar2 = (*(uint *)((long)param_1 + lVar6) & 0xff00ff00) >> 8 |
                (*(uint *)((long)param_1 + lVar6) & 0xff00ff) << 8;
        uVar2 = (uVar2 >> 0x10 | uVar2 << 0x10) + 1;
        uVar3 = (uVar2 & 0xff00ff00) >> 8 | (uVar2 & 0xff00ff) << 8;
        *(uint *)((long)param_1 + lVar6) = uVar3 >> 0x10 | uVar3 << 0x10;
        if (lVar6 == 0) break;
        lVar6 = lVar6 + -4;
      } while (uVar2 == 0);
      iVar5 = mbedtls_aes_crypt_ecb(puVar1,1,param_1,&local_60);
      if (iVar5 == 0) {
        uVar8 = param_2[1];
        uVar7 = *param_2;
        local_80 = CONCAT17((byte)((ulong)uVar7 >> 0x38) ^ (byte)((ulong)local_80 >> 0x38),
                            CONCAT16((byte)((ulong)uVar7 >> 0x30) ^ (byte)((ulong)local_80 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar7 >> 0x28) ^
                                              (byte)((ulong)local_80 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar7 >> 0x20) ^
                                                       (byte)((ulong)local_80 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar7 >> 0x18) ^
                                                                (byte)((ulong)local_80 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar7 >> 0x10
                                                                               ) ^ (byte)((ulong)
                                                  local_80 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar7 >> 8) ^
                                                           (byte)((ulong)local_80 >> 8),
                                                           (byte)uVar7 ^ (byte)local_80)))))));
        uStack_78 = CONCAT17((byte)((ulong)uVar8 >> 0x38) ^ (byte)((ulong)uStack_78 >> 0x38),
                             CONCAT16((byte)((ulong)uVar8 >> 0x30) ^
                                      (byte)((ulong)uStack_78 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar8 >> 0x28) ^
                                               (byte)((ulong)uStack_78 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar8 >> 0x20) ^
                                                        (byte)((ulong)uStack_78 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar8 >> 0x18) ^
                                                                 (byte)((ulong)uStack_78 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar8 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uStack_78 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar8 >> 8) ^ (byte)((ulong)uStack_78 >> 8),
                                                  (byte)uVar8 ^ (byte)uStack_78)))))));
        uVar8 = param_2[3];
        uVar7 = param_2[2];
        local_70 = CONCAT17((byte)((ulong)uVar7 >> 0x38) ^ (byte)((ulong)local_70 >> 0x38),
                            CONCAT16((byte)((ulong)uVar7 >> 0x30) ^ (byte)((ulong)local_70 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar7 >> 0x28) ^
                                              (byte)((ulong)local_70 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar7 >> 0x20) ^
                                                       (byte)((ulong)local_70 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar7 >> 0x18) ^
                                                                (byte)((ulong)local_70 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar7 >> 0x10
                                                                               ) ^ (byte)((ulong)
                                                  local_70 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar7 >> 8) ^
                                                           (byte)((ulong)local_70 >> 8),
                                                           (byte)uVar7 ^ (byte)local_70)))))));
        uStack_68 = CONCAT17((byte)((ulong)uVar8 >> 0x38) ^ (byte)((ulong)uStack_68 >> 0x38),
                             CONCAT16((byte)((ulong)uVar8 >> 0x30) ^
                                      (byte)((ulong)uStack_68 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar8 >> 0x28) ^
                                               (byte)((ulong)uStack_68 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar8 >> 0x20) ^
                                                        (byte)((ulong)uStack_68 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar8 >> 0x18) ^
                                                                 (byte)((ulong)uStack_68 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar8 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uStack_68 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar8 >> 8) ^ (byte)((ulong)uStack_68 >> 8),
                                                  (byte)uVar8 ^ (byte)uStack_68)))))));
        uVar8 = param_2[5];
        uVar7 = param_2[4];
        local_60 = CONCAT17((byte)((ulong)uVar7 >> 0x38) ^ (byte)((ulong)local_60 >> 0x38),
                            CONCAT16((byte)((ulong)uVar7 >> 0x30) ^ (byte)((ulong)local_60 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar7 >> 0x28) ^
                                              (byte)((ulong)local_60 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar7 >> 0x20) ^
                                                       (byte)((ulong)local_60 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar7 >> 0x18) ^
                                                                (byte)((ulong)local_60 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar7 >> 0x10
                                                                               ) ^ (byte)((ulong)
                                                  local_60 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar7 >> 8) ^
                                                           (byte)((ulong)local_60 >> 8),
                                                           (byte)uVar7 ^ (byte)local_60)))))));
        uStack_58 = CONCAT17((byte)((ulong)uVar8 >> 0x38) ^ (byte)((ulong)uStack_58 >> 0x38),
                             CONCAT16((byte)((ulong)uVar8 >> 0x30) ^
                                      (byte)((ulong)uStack_58 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar8 >> 0x28) ^
                                               (byte)((ulong)uStack_58 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar8 >> 0x20) ^
                                                        (byte)((ulong)uStack_58 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar8 >> 0x18) ^
                                                                 (byte)((ulong)uStack_58 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar8 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uStack_58 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar8 >> 8) ^ (byte)((ulong)uStack_58 >> 8),
                                                  (byte)uVar8 ^ (byte)uStack_58)))))));
        iVar5 = mbedtls_aes_setkey_enc(puVar1,&local_80,0x100);
        if (iVar5 == 0) {
          param_1[1] = uStack_58;
          *param_1 = local_60;
        }
      }
    }
  }
  mbedtls_platform_zeroize(&local_80,0x30);
  if (*(long *)(lVar4 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar5;
}

