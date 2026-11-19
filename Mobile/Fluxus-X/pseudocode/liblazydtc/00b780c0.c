/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b780c0
 */

ulong mbedtls_gcm_self_test(int param_1)

{
  ulong uVar1;
  undefined *puVar2;
  undefined *puVar3;
  undefined *puVar4;
  undefined *__s2;
  long lVar5;
  int param2;
  int iVar6;
  int iVar7;
  int iVar8;
  uint uVar9;
  ulong uVar10;
  ulong uVar11;
  undefined *puVar12;
  undefined *puVar13;
  undefined8 uVar14;
  ulong uVar15;
  undefined8 uVar16;
  size_t __n;
  ulong uVar17;
  undefined *local_288;
  undefined *local_280;
  size_t local_278;
  undefined1 auStack_270 [8];
  undefined1 auStack_268 [16];
  undefined1 auStack_258 [32];
  undefined1 auStack_238 [32];
  undefined1 auStack_218 [424];
  long local_70;
  
  lVar5 = tpidr_el0;
  local_70 = *(long *)(lVar5 + 0x28);
  if (param_1 != 0) {
    puts("  GCM note: built-in implementation.");
  }
  uVar11 = 0;
  puVar12 = &DAT_0077f490;
  puVar13 = &DAT_0077f910;
LAB_00b7814c:
  uVar17 = 0;
  uVar1 = uVar11 * 0x40 + 0x80;
  local_288 = puVar13;
  local_280 = puVar12;
LAB_00b78164:
  param2 = (int)uVar17;
  iVar8 = (int)uVar1;
  if (param_1 != 0) {
    printf("  AES-GCM-%3d #%d (%s): ",iVar8,param2,"enc");
  }
  memset(auStack_218,0,0x1a8);
  puVar2 = &UNK_0077f1b8 + (long)(int)(&DAT_0077f478)[uVar17] * 0x20;
  uVar10 = mbedtls_gcm_setkey(auStack_218,2,puVar2,uVar1 & 0xffffffff);
  uVar15 = uVar10 & 0xffffffff;
  if ((uVar1 == 0xc0) && ((int)uVar10 == -0x72)) {
    uVar9 = puts("skipped");
    uVar10 = (ulong)uVar9;
    goto LAB_00b787c0;
  }
  if ((int)uVar10 == 0) {
    uVar16 = (&DAT_0077f300)[uVar17];
    puVar3 = &UNK_0077f228 + (long)(int)(&DAT_0077f2e8)[uVar17] * 0x40;
    uVar10 = mbedtls_gcm_starts(auStack_218,1,puVar3,uVar16);
    uVar15 = uVar10 & 0xffffffff;
    if ((int)uVar10 != 0) goto joined_r0x00b78800;
    uVar14 = (&DAT_0077f3c8)[uVar17];
    puVar4 = &UNK_0077f330 + (long)(int)(&DAT_0077f3b0)[uVar17] * 0x40;
    uVar10 = mbedtls_gcm_update_ad(auStack_218,puVar4,uVar14);
    uVar15 = uVar10 & 0xffffffff;
    if ((int)uVar10 != 0) goto joined_r0x00b78800;
    iVar7 = (&DAT_0077f478)[uVar17];
    __n = (&DAT_0077f1f8)[uVar17];
    __s2 = &UNK_0077f3f8 + (long)iVar7 * 0x40;
    uVar10 = mbedtls_gcm_update(auStack_218,__s2,__n,auStack_258,__n,auStack_270);
    uVar15 = uVar10 & 0xffffffff;
    if ((int)uVar10 != 0) goto joined_r0x00b78800;
    uVar10 = mbedtls_gcm_finish(auStack_218);
    uVar15 = uVar10 & 0xffffffff;
    if ((int)uVar10 != 0) goto joined_r0x00b78800;
    iVar6 = memcmp(auStack_258,local_280,__n);
    if ((iVar6 != 0) || (iVar6 = memcmp(auStack_268,local_288,0x10), iVar6 != 0)) {
LAB_00b787f0:
      uVar15 = 1;
      goto joined_r0x00b78800;
    }
    mbedtls_cipher_free(auStack_218);
    mbedtls_platform_zeroize(auStack_218,0x1a8);
    if (param_1 == 0) {
      memset(auStack_218,0,0x1a8);
    }
    else {
      puts("passed");
      memset(auStack_218,0,0x1a8);
      printf("  AES-GCM-%3d #%d (%s): ",iVar8,param2,"dec");
    }
    uVar10 = mbedtls_gcm_setkey(auStack_218,2,puVar2,uVar1 & 0xffffffff);
    uVar15 = uVar10 & 0xffffffff;
    if ((int)uVar10 != 0) goto joined_r0x00b78800;
    uVar10 = mbedtls_gcm_starts(auStack_218,0,puVar3,uVar16);
    uVar15 = uVar10 & 0xffffffff;
    if ((int)uVar10 != 0) goto joined_r0x00b78800;
    uVar10 = mbedtls_gcm_update_ad(auStack_218,puVar4,uVar14);
    uVar15 = uVar10 & 0xffffffff;
    if ((int)uVar10 != 0) goto joined_r0x00b78800;
    uVar10 = mbedtls_gcm_update(auStack_218,local_280,__n,auStack_258,__n,auStack_270);
    uVar15 = uVar10 & 0xffffffff;
    if ((int)uVar10 != 0) goto joined_r0x00b78800;
    uVar10 = mbedtls_gcm_finish(auStack_218);
    uVar15 = uVar10 & 0xffffffff;
    if ((int)uVar10 != 0) goto joined_r0x00b78800;
    iVar6 = memcmp(auStack_258,__s2,__n);
    if ((iVar6 != 0) || (iVar6 = memcmp(auStack_268,local_288,0x10), iVar6 != 0)) goto LAB_00b787f0;
    mbedtls_cipher_free(auStack_218);
    mbedtls_platform_zeroize(auStack_218,0x1a8);
    if (param_1 == 0) {
      memset(auStack_218,0,0x1a8);
    }
    else {
      puts("passed");
      memset(auStack_218,0,0x1a8);
      printf("  AES-GCM-%3d #%d split (%s): ",iVar8,param2,"enc");
    }
    uVar10 = mbedtls_gcm_setkey(auStack_218,2,puVar2,uVar1 & 0xffffffff);
    uVar15 = uVar10 & 0xffffffff;
    if ((int)uVar10 != 0) goto joined_r0x00b78800;
    uVar10 = mbedtls_gcm_starts(auStack_218,1,puVar3,uVar16);
    uVar15 = uVar10 & 0xffffffff;
    if ((int)uVar10 != 0) goto joined_r0x00b78800;
    uVar10 = mbedtls_gcm_update_ad(auStack_218,puVar4,uVar14);
    uVar15 = uVar10 & 0xffffffff;
    if ((int)uVar10 != 0) goto joined_r0x00b78800;
    if (uVar17 < 2) {
      uVar10 = mbedtls_gcm_update(auStack_218,__s2,__n,auStack_258,0x40,&local_278);
      uVar15 = uVar10 & 0xffffffff;
      if ((int)uVar10 != 0) goto joined_r0x00b78800;
      if (local_278 != __n) goto LAB_00b78808;
LAB_00b78554:
      uVar10 = mbedtls_gcm_finish(auStack_218);
      uVar15 = uVar10 & 0xffffffff;
      if ((int)uVar10 != 0) goto joined_r0x00b78800;
      iVar7 = memcmp(auStack_258,local_280,__n);
      if ((iVar7 != 0) || (iVar7 = memcmp(auStack_268,local_288,0x10), iVar7 != 0))
      goto LAB_00b787f0;
      mbedtls_cipher_free(auStack_218);
      mbedtls_platform_zeroize(auStack_218,0x1a8);
      if (param_1 == 0) {
        memset(auStack_218,0,0x1a8);
      }
      else {
        puts("passed");
        memset(auStack_218,0,0x1a8);
        printf("  AES-GCM-%3d #%d split (%s): ",iVar8,param2,"dec");
      }
      uVar10 = mbedtls_gcm_setkey(auStack_218,2,puVar2,uVar1 & 0xffffffff);
      uVar15 = uVar10 & 0xffffffff;
      if ((int)uVar10 != 0) goto joined_r0x00b78800;
      uVar10 = mbedtls_gcm_starts(auStack_218,0,puVar3,uVar16);
      uVar15 = uVar10 & 0xffffffff;
      if ((int)uVar10 != 0) goto joined_r0x00b78800;
      uVar10 = mbedtls_gcm_update_ad(auStack_218,puVar4,uVar14);
      uVar15 = uVar10 & 0xffffffff;
      if ((int)uVar10 != 0) goto joined_r0x00b78800;
      if (1 < uVar17) {
        uVar10 = mbedtls_gcm_update(auStack_218,local_280,0x20,auStack_258,0x40,&local_278);
        uVar15 = uVar10 & 0xffffffff;
        if (((int)uVar10 != 0) || (local_278 != 0x20)) goto LAB_00b78810;
        uVar10 = mbedtls_gcm_update(auStack_218,local_280 + 0x20,__n - 0x20,auStack_238,0x20,
                                    &local_278);
        uVar15 = uVar10 & 0xffffffff;
        if ((int)uVar10 != 0) goto joined_r0x00b78800;
        if (local_278 == __n - 0x20) goto LAB_00b78704;
        goto LAB_00b78808;
      }
      uVar10 = mbedtls_gcm_update(auStack_218,local_280,__n,auStack_258,0x40,&local_278);
      uVar15 = uVar10 & 0xffffffff;
      if ((int)uVar10 != 0) goto joined_r0x00b78800;
      if (local_278 != __n) goto LAB_00b78808;
LAB_00b78704:
      uVar10 = mbedtls_gcm_finish(auStack_218);
      uVar15 = uVar10 & 0xffffffff;
      if ((int)uVar10 != 0) goto joined_r0x00b78800;
      iVar8 = memcmp(auStack_258,__s2,__n);
      if ((iVar8 != 0) || (iVar8 = memcmp(auStack_268,local_288,0x10), iVar8 != 0))
      goto LAB_00b787f0;
      mbedtls_cipher_free(auStack_218);
      uVar10 = mbedtls_platform_zeroize(auStack_218,0x1a8);
      if (param_1 != 0) {
        uVar9 = puts("passed");
        uVar10 = (ulong)uVar9;
      }
      uVar17 = uVar17 + 1;
      local_280 = local_280 + 0x40;
      local_288 = local_288 + 0x10;
      if (5 < uVar17) goto LAB_00b787c0;
      goto LAB_00b78164;
    }
    uVar10 = mbedtls_gcm_update(auStack_218,__s2,0x20,auStack_258,0x40,&local_278);
    uVar15 = uVar10 & 0xffffffff;
    if (((int)uVar10 == 0) && (local_278 == 0x20)) {
      uVar10 = mbedtls_gcm_update(auStack_218,&UNK_0077f418 + (long)iVar7 * 0x40,__n - 0x20,
                                  auStack_238,0x20,&local_278);
      uVar15 = uVar10 & 0xffffffff;
      if ((int)uVar10 != 0) goto joined_r0x00b78800;
      if (local_278 == __n - 0x20) goto LAB_00b78554;
      goto LAB_00b78808;
    }
LAB_00b78810:
    if ((int)uVar15 == 0) goto LAB_00b78844;
  }
joined_r0x00b78800:
  if (param_1 != 0) {
    puts("failed");
  }
  mbedtls_cipher_free(auStack_218);
  uVar10 = mbedtls_platform_zeroize(auStack_218,0x1a8);
  goto LAB_00b78844;
LAB_00b787c0:
  uVar11 = uVar11 + 1;
  puVar12 = puVar12 + 0x180;
  puVar13 = puVar13 + 0x60;
  if (2 < uVar11) {
    if (param_1 == 0) {
LAB_00b78808:
      uVar15 = 0;
    }
    else {
      uVar9 = putchar(10);
      uVar10 = (ulong)uVar9;
      uVar15 = 0;
    }
LAB_00b78844:
    if (*(long *)(lVar5 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail(uVar10);
    }
    return uVar15;
  }
  goto LAB_00b7814c;
}

