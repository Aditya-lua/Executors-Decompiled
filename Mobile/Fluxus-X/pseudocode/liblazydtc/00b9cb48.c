/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9cb48
 */

void mbedtls_hmac_drbg_self_test(int param_1)

{
  undefined1 *puVar1;
  undefined *puVar2;
  size_t sVar3;
  long lVar4;
  long lVar5;
  int iVar6;
  undefined8 uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  undefined1 auStack_2c0 [80];
  undefined1 auStack_270 [24];
  undefined1 auStack_258 [64];
  undefined4 local_218;
  ulong local_210;
  undefined4 local_208;
  undefined4 local_204;
  code *local_200;
  undefined *puStack_1f8;
  undefined1 auStack_1f0 [384];
  long local_70;
  
  lVar4 = tpidr_el0;
  local_70 = *(long *)(lVar4 + 0x28);
  uVar7 = mbedtls_md_info_from_type(5);
  memset(auStack_270,0,0x80);
  local_204 = 10000;
  if (param_1 != 0) {
    printf("  HMAC_DRBG (PR = True) : ");
  }
  DAT_00d26020 = 0;
  iVar6 = mbedtls_md_setup(auStack_270,uVar7,1);
  if (iVar6 == 0) {
    uVar8 = mbedtls_md_get_size(uVar7);
    uVar8 = uVar8 & 0xff;
    iVar6 = mbedtls_md_hmac_starts(auStack_270,auStack_258,uVar8);
    if (iVar6 == 0) {
      memset(auStack_258,1,uVar8);
      lVar5 = DAT_00d26020;
      local_200 = FUN_00b9d008;
      puStack_1f8 = &DAT_0078685c;
      if (local_210 == 0) {
        uVar9 = 0x18;
        if (0x1c < (uint)uVar8) {
          uVar9 = 0x20;
        }
        local_210 = 0x10;
        if (0x14 < (uint)uVar8) {
          local_210 = uVar9;
        }
      }
      uVar8 = local_210;
      if (local_210 * 3 < 0x302) {
        puVar1 = auStack_1f0 + local_210;
        sVar3 = 0;
        if (local_210 < 0x180) {
          sVar3 = 0x180 - local_210;
        }
        puVar2 = &DAT_0078685c + DAT_00d26020;
        memset(puVar1,0,sVar3);
        memcpy(auStack_1f0,puVar2,uVar8);
        uVar10 = uVar8 >> 1;
        memcpy(puVar1,&DAT_0078685c + lVar5 + uVar8,uVar10);
        uVar9 = uVar10 + uVar8;
        DAT_00d26020 = lVar5 + uVar8 + uVar10;
        iVar6 = mbedtls_hmac_drbg_update(auStack_270,auStack_1f0,uVar9);
        if (iVar6 != 0) goto LAB_00b9ccc4;
        local_218 = 1;
        mbedtls_platform_zeroize(auStack_1f0,uVar9);
        local_208 = 1;
        iVar6 = mbedtls_hmac_drbg_random_with_add(auStack_270,auStack_2c0,0x50,0,0);
        if (((iVar6 == 0) &&
            (iVar6 = mbedtls_hmac_drbg_random_with_add(auStack_270,auStack_2c0,0x50,0,0), iVar6 == 0
            )) && (iVar6 = memcmp(auStack_2c0,&DAT_00786894,0x50), iVar6 == 0)) {
          mbedtls_md_free(auStack_270);
          mbedtls_platform_zeroize(auStack_270,0x80);
          local_204 = 10000;
          mbedtls_md_free(auStack_270);
          mbedtls_platform_zeroize(auStack_270,0x80);
          local_204 = 10000;
          if (param_1 != 0) {
            puts("passed");
            printf("  HMAC_DRBG (PR = False) : ");
          }
          memset(auStack_270,0,0x80);
          local_204 = 10000;
          DAT_00d26020 = 0;
          iVar6 = mbedtls_md_setup(auStack_270,uVar7,1);
          if (iVar6 == 0) {
            uVar8 = mbedtls_md_get_size(uVar7);
            uVar8 = uVar8 & 0xff;
            iVar6 = mbedtls_md_hmac_starts(auStack_270,auStack_258,uVar8);
            if (iVar6 == 0) {
              memset(auStack_258,1,uVar8);
              lVar5 = DAT_00d26020;
              local_200 = FUN_00b9d008;
              puStack_1f8 = &DAT_007868e4;
              if (local_210 == 0) {
                uVar9 = 0x18;
                if (0x1c < (uint)uVar8) {
                  uVar9 = 0x20;
                }
                local_210 = 0x10;
                if (0x14 < (uint)uVar8) {
                  local_210 = uVar9;
                }
              }
              uVar8 = local_210;
              if (local_210 * 3 < 0x302) {
                puVar1 = auStack_1f0 + local_210;
                sVar3 = 0;
                if (local_210 < 0x180) {
                  sVar3 = 0x180 - local_210;
                }
                puVar2 = &DAT_007868e4 + DAT_00d26020;
                memset(puVar1,0,sVar3);
                memcpy(auStack_1f0,puVar2,uVar8);
                uVar10 = uVar8 >> 1;
                memcpy(puVar1,&DAT_007868e4 + lVar5 + uVar8,uVar10);
                uVar9 = uVar10 + uVar8;
                DAT_00d26020 = lVar5 + uVar8 + uVar10;
                iVar6 = mbedtls_hmac_drbg_update(auStack_270,auStack_1f0,uVar9);
                if (iVar6 == 0) {
                  local_218 = 1;
                  mbedtls_platform_zeroize(auStack_1f0,uVar9);
                  uVar8 = local_210;
                  if (local_210 < 0x181) {
                    memset(auStack_1f0,0,0x180);
                    iVar6 = (*local_200)(puStack_1f8,auStack_1f0,uVar8);
                    uVar9 = local_210;
                    if (iVar6 == 0) {
                      iVar6 = mbedtls_hmac_drbg_update(auStack_270,auStack_1f0,local_210);
                      if (iVar6 != 0) goto LAB_00b9ccc4;
                      local_218 = 1;
                      mbedtls_platform_zeroize(auStack_1f0,uVar9);
                      iVar6 = mbedtls_hmac_drbg_random_with_add(auStack_270,auStack_2c0,0x50,0,0);
                      if (((iVar6 == 0) &&
                          (iVar6 = mbedtls_hmac_drbg_random_with_add
                                             (auStack_270,auStack_2c0,0x50,0,0), iVar6 == 0)) &&
                         (iVar6 = memcmp(auStack_2c0,&DAT_0078690c,0x50), iVar6 == 0)) {
                        mbedtls_md_free(auStack_270);
                        mbedtls_platform_zeroize(auStack_270,0x80);
                        local_204 = 10000;
                        mbedtls_md_free(auStack_270);
                        mbedtls_platform_zeroize(auStack_270,0x80);
                        local_204 = 10000;
                        if (param_1 != 0) {
                          puts("passed");
                          putchar(10);
                        }
                        uVar7 = 0;
                        goto LAB_00b9ce40;
                      }
                    }
                  }
                }
                else {
LAB_00b9ccc4:
                  mbedtls_platform_zeroize(auStack_1f0,uVar9);
                }
              }
            }
          }
        }
      }
    }
  }
  if (param_1 != 0) {
    puts("failed");
  }
  uVar7 = 1;
LAB_00b9ce40:
  if (*(long *)(lVar4 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar7);
  }
  return;
}

