/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b74314
 */

void mbedtls_ctr_drbg_self_test(int param_1)

{
  long lVar1;
  ulong uVar2;
  int iVar3;
  int iVar4;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  undefined1 auStack_380 [64];
  undefined1 auStack_340 [16];
  int local_330;
  undefined4 local_32c;
  ulong local_328;
  undefined4 local_320;
  undefined1 auStack_318 [288];
  code *local_1f8;
  undefined *puStack_1f0;
  undefined8 local_1e8;
  undefined8 uStack_1e0;
  undefined8 uStack_1d8;
  undefined8 uStack_1d0;
  
  lVar1 = tpidr_el0;
  lVar6 = *(long *)(lVar1 + 0x28);
  memset(auStack_340,0,0x158);
  mbedtls_aes_init(auStack_318);
  local_330 = -1;
  local_320 = 10000;
  if (param_1 != 0) {
    printf("  CTR_DRBG (PR = TRUE) : ");
  }
  local_328 = 0x20;
  DAT_00d25b08 = 0;
  if (local_1f8 == (code *)0x0) {
    local_330 = 0x10;
  }
  iVar4 = local_330;
  uStack_1e0 = 0;
  local_1e8 = 0;
  uStack_1d0 = 0;
  uStack_1d8 = 0;
  local_1f8 = FUN_00b7467c;
  puStack_1f0 = &DAT_0077e610;
  iVar3 = mbedtls_aes_setkey_enc(auStack_318,&local_1e8,0x100);
  if (iVar3 == 0) {
    lVar7 = (long)iVar4;
    if (iVar4 < 0) {
      lVar7 = 0x10;
    }
    iVar4 = FUN_00b73d28(auStack_340,&DAT_0077e680,0x20,lVar7);
    if (iVar4 == 0) {
      local_32c = 1;
      iVar4 = mbedtls_ctr_drbg_random_with_add(auStack_340,auStack_380,0x40,0,0);
      if (((iVar4 == 0) &&
          (iVar4 = mbedtls_ctr_drbg_random_with_add(auStack_340,auStack_380,0x40,0,0), iVar4 == 0))
         && (iVar4 = memcmp(auStack_380,&DAT_0077e6a0,0x40), iVar4 == 0)) {
        mbedtls_aes_free(auStack_318);
        mbedtls_platform_zeroize(auStack_340,0x158);
        iVar4 = -1;
        local_320 = 10000;
        local_330 = 0xffffffff;
        if (param_1 != 0) {
          puts("passed");
          printf("  CTR_DRBG (PR = FALSE): ");
        }
        memset(auStack_340,0,0x158);
        mbedtls_aes_init(auStack_318);
        local_328 = 0x20;
        local_330 = -1;
        local_320 = 10000;
        DAT_00d25b08 = 0;
        if (local_1f8 == (code *)0x0) {
          iVar4 = 0x10;
          local_330 = 0x10;
        }
        uStack_1e0 = 0;
        local_1e8 = 0;
        uStack_1d0 = 0;
        uStack_1d8 = 0;
        local_1f8 = FUN_00b7467c;
        puStack_1f0 = &DAT_0077e6e0;
        iVar3 = mbedtls_aes_setkey_enc(auStack_318,&local_1e8,0x100);
        if (iVar3 == 0) {
          lVar7 = (long)iVar4;
          if (iVar4 < 0) {
            lVar7 = 0x10;
          }
          iVar4 = FUN_00b73d28(auStack_340,&DAT_0077e730,0x20,lVar7);
          uVar2 = local_328;
          if ((iVar4 == 0) && (local_328 < 0x181)) {
            memset(&local_1e8,0,0x180);
            iVar4 = (*local_1f8)(puStack_1f0,&local_1e8,uVar2);
            if (iVar4 == 0) {
              iVar4 = FUN_00b7389c(&local_1e8,&local_1e8,local_328);
              if ((iVar4 == 0) && (iVar4 = FUN_00b73b88(auStack_340,&local_1e8), iVar4 == 0)) {
                local_330 = 1;
              }
              mbedtls_platform_zeroize(&local_1e8,0x180);
              if ((((iVar4 == 0) &&
                   (iVar4 = mbedtls_ctr_drbg_random_with_add(auStack_340,auStack_380,0x40,0,0),
                   iVar4 == 0)) &&
                  (iVar4 = mbedtls_ctr_drbg_random_with_add(auStack_340,auStack_380,0x40,0,0),
                  iVar4 == 0)) && (iVar4 = memcmp(auStack_380,&DAT_0077e750,0x40), iVar4 == 0)) {
                mbedtls_aes_free(auStack_318);
                mbedtls_platform_zeroize(auStack_340,0x158);
                local_320 = 10000;
                local_330 = -1;
                if (param_1 != 0) {
                  puts("passed");
                  putchar(10);
                }
                uVar5 = 0;
                goto LAB_00b74604;
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
  uVar5 = 1;
LAB_00b74604:
  if (*(long *)(lVar1 + 0x28) != lVar6) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

