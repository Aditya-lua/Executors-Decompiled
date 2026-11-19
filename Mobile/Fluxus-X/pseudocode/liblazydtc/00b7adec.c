/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7adec
 */

int mbedtls_nist_kw_self_test(int param_1)

{
  long lVar1;
  int iVar2;
  uint uVar3;
  long lVar4;
  char *__format;
  undefined *puVar5;
  undefined *puVar6;
  undefined *puVar7;
  ulong uVar8;
  size_t sVar9;
  size_t sVar10;
  size_t local_108;
  undefined1 auStack_100 [48];
  undefined1 auStack_d0 [96];
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  memset(auStack_d0,0,0x60);
  uVar8 = 0;
  puVar5 = &DAT_0077ff90;
  puVar6 = &DAT_0077fff0;
  puVar7 = &DAT_00780098;
  do {
    uVar3 = (&DAT_0077ff84)[uVar8] << 3;
    if (param_1 != 0) {
      printf("  KW-AES-%u ",uVar3);
    }
    lVar4 = mbedtls_cipher_info_from_values(2,uVar3,1);
    if (lVar4 == 0) {
      iVar2 = -0x6100;
LAB_00b7b218:
      if (param_1 == 0) goto LAB_00b7b228;
LAB_00b7b21c:
      __format = "  KW: setup failed ";
      goto LAB_00b7b224;
    }
    if ((*(uint *)(lVar4 + 8) & 0x1f) != 0x10) {
LAB_00b7b1e8:
      iVar2 = -0x6100;
      if (param_1 != 0) goto LAB_00b7b21c;
      goto LAB_00b7b228;
    }
    mbedtls_cipher_free(auStack_d0);
    iVar2 = mbedtls_cipher_setup(auStack_d0,lVar4);
    if ((iVar2 != 0) || (iVar2 = mbedtls_cipher_setkey(auStack_d0,puVar5,uVar3,1), iVar2 != 0))
    goto LAB_00b7b218;
    sVar9 = (&DAT_00780068)[uVar8];
    iVar2 = mbedtls_nist_kw_wrap(auStack_d0,0,puVar6,sVar9,auStack_100,&local_108,0x30);
    if ((iVar2 != 0) ||
       ((sVar10 = (&DAT_00780080)[uVar8], sVar10 != local_108 ||
        (iVar2 = memcmp(auStack_100,puVar7,sVar10), iVar2 != 0)))) goto LAB_00b7b1d0;
    lVar4 = mbedtls_cipher_info_from_values(2,uVar3,1);
    if ((lVar4 == 0) || ((*(uint *)(lVar4 + 8) & 0x1f) != 0x10)) goto LAB_00b7b1e8;
    mbedtls_cipher_free(auStack_d0);
    iVar2 = mbedtls_cipher_setup(auStack_d0,lVar4);
    if ((iVar2 != 0) || (iVar2 = mbedtls_cipher_setkey(auStack_d0,puVar5,uVar3,0), iVar2 != 0))
    goto LAB_00b7b218;
    iVar2 = mbedtls_nist_kw_unwrap(auStack_d0,0,auStack_100,sVar10,auStack_100,&local_108,0x30);
    if (((iVar2 != 0) || (local_108 != sVar9)) ||
       (iVar2 = memcmp(auStack_100,puVar6,sVar9), iVar2 != 0)) {
      if (param_1 == 0) goto LAB_00b7b20c;
      puts("failed");
      iVar2 = 1;
      goto LAB_00b7b228;
    }
    if (param_1 != 0) {
      puts(" passed");
    }
    uVar8 = uVar8 + 1;
    puVar5 = puVar5 + 0x20;
    puVar6 = puVar6 + 0x28;
    puVar7 = puVar7 + 0x30;
  } while (uVar8 < 3);
  uVar8 = 0;
  puVar5 = &DAT_00780128;
  puVar6 = &DAT_00780188;
  puVar7 = &DAT_00780218;
  do {
    local_108 = 0x30;
    uVar3 = (&DAT_0077ff84)[uVar8] << 3;
    if (param_1 != 0) {
      printf("  KWP-AES-%u ",uVar3);
    }
    lVar4 = mbedtls_cipher_info_from_values(2,uVar3,1);
    if (lVar4 == 0) {
LAB_00b7b280:
      iVar2 = -0x6100;
joined_r0x00b7b284:
      if (param_1 != 0) {
        __format = "  KWP: setup failed ";
LAB_00b7b224:
        printf(__format);
      }
      break;
    }
    if ((*(uint *)(lVar4 + 8) & 0x1f) != 0x10) {
      iVar2 = -0x6100;
      goto joined_r0x00b7b284;
    }
    mbedtls_cipher_free(auStack_d0);
    iVar2 = mbedtls_cipher_setup(auStack_d0,lVar4);
    if ((iVar2 != 0) || (iVar2 = mbedtls_cipher_setkey(auStack_d0,puVar5,uVar3,1), iVar2 != 0))
    goto joined_r0x00b7b284;
    sVar9 = (&DAT_007801e8)[uVar8];
    iVar2 = mbedtls_nist_kw_wrap(auStack_d0,1,puVar6,sVar9,auStack_100,&local_108,0x30);
    if ((iVar2 != 0) ||
       ((sVar10 = (&DAT_00780200)[uVar8], sVar10 != local_108 ||
        (iVar2 = memcmp(auStack_100,puVar7,sVar10), iVar2 != 0)))) goto LAB_00b7b1d0;
    lVar4 = mbedtls_cipher_info_from_values(2,uVar3,1);
    if ((lVar4 == 0) || ((*(uint *)(lVar4 + 8) & 0x1f) != 0x10)) goto LAB_00b7b280;
    mbedtls_cipher_free(auStack_d0);
    iVar2 = mbedtls_cipher_setup(auStack_d0,lVar4);
    if ((iVar2 != 0) || (iVar2 = mbedtls_cipher_setkey(auStack_d0,puVar5,uVar3,0), iVar2 != 0))
    goto joined_r0x00b7b284;
    iVar2 = mbedtls_nist_kw_unwrap(auStack_d0,1,auStack_100,sVar10,auStack_100,&local_108,0x30);
    if (((iVar2 != 0) || (local_108 != sVar9)) ||
       (iVar2 = memcmp(auStack_100,puVar6,sVar9), iVar2 != 0)) goto LAB_00b7b1d0;
    if (param_1 != 0) {
      puts(" passed");
    }
    uVar8 = uVar8 + 1;
    iVar2 = 0;
    puVar5 = puVar5 + 0x20;
    puVar6 = puVar6 + 0x1f;
    puVar7 = puVar7 + 0x30;
  } while (uVar8 < 3);
LAB_00b7b228:
  mbedtls_cipher_free(auStack_d0);
  uVar8 = mbedtls_platform_zeroize(auStack_d0,0x60);
  if (param_1 != 0) {
    uVar3 = putchar(10);
    uVar8 = (ulong)uVar3;
  }
  if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar8);
  }
  return iVar2;
LAB_00b7b1d0:
  if (param_1 == 0) {
LAB_00b7b20c:
    iVar2 = 1;
  }
  else {
    printf("failed. ");
    iVar2 = 1;
  }
  goto LAB_00b7b228;
}

