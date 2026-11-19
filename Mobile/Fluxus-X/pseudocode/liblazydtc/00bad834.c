/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bad834
 */

undefined8 FUN_00bad834(int param_1,uint param_2)

{
  uint uVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined *puVar8;
  long lVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  void *__src;
  bool bVar12;
  int iVar13;
  void *__s;
  uint uVar14;
  undefined8 uVar15;
  uint uVar16;
  ulong uVar17;
  ulong uVar18;
  undefined *__src_00;
  ulong uVar19;
  undefined *puVar20;
  void *pvVar21;
  undefined1 auStack_100 [64];
  undefined8 local_c0;
  undefined4 local_b8;
  undefined4 uStack_b4;
  undefined4 local_b0;
  undefined4 local_ac;
  undefined4 local_a8;
  undefined4 local_a4;
  undefined4 local_a0;
  undefined4 local_9c;
  uint uStack_98;
  undefined1 auStack_90 [32];
  long local_70;
  
  lVar9 = tpidr_el0;
  local_70 = *(long *)(lVar9 + 0x28);
  puVar8 = &UNK_00788640;
  if (param_2 != 0) {
    puVar8 = &DAT_007885e0;
  }
  __s = calloc(0x400,1);
  if (__s == (void *)0x0) {
    if (param_1 != 0) {
      puts("Buffer allocation failed");
    }
    uVar15 = 1;
    goto LAB_00badbf8;
  }
  memset(auStack_100,0,0x6c);
  bVar12 = param_2 != 0;
  uVar2 = 0x3c6ef372;
  uVar10 = 0x6a09e667;
  if (bVar12) {
    uVar2 = 0x3070dd17;
    uVar10 = 0xc1059ed8;
  }
  uVar3 = 0xa54ff53a;
  if (bVar12) {
    uVar3 = 0xf70e5939;
  }
  uVar4 = 0x510e527f;
  if (bVar12) {
    uVar4 = 0xffc00b31;
  }
  uVar5 = 0x9b05688c;
  if (bVar12) {
    uVar5 = 0x68581511;
  }
  uVar6 = 0x5be0cd19;
  uVar11 = 0x1f83d9ab;
  if (bVar12) {
    uVar6 = 0xbefa4fa4;
    uVar11 = 0x64f98fa7;
  }
  uVar18 = 0;
  uVar7 = 0xbb67ae85;
  if (bVar12) {
    uVar7 = 0x367cd507;
  }
  do {
    if (param_1 != 0) {
      printf("  SHA-%d test #%d: ",param_2 * -0x20 + 0x100,(int)uVar18 + 1);
    }
    if (1 < param_2) {
      uVar15 = 0xffffff8c;
      goto joined_r0x00badbbc;
    }
    local_c0 = 0;
    local_b8 = uVar10;
    uStack_b4 = uVar7;
    local_b0 = uVar2;
    local_ac = uVar3;
    local_a8 = uVar4;
    local_a4 = uVar5;
    local_a0 = uVar11;
    local_9c = uVar6;
    uStack_98 = param_2;
    if (uVar18 == 2) {
      memset(__s,0x61,1000);
      uVar16 = 0;
      uVar14 = 0;
      while( true ) {
        uVar1 = uVar14 & 0x3f;
        if (0xfffffc17 < uVar14) {
          local_c0._4_4_ = local_c0._4_4_ + 1;
        }
        local_c0 = CONCAT44(local_c0._4_4_,uVar14 + 1000);
        if (uVar1 == 0) {
          uVar17 = 1000;
          __src = __s;
        }
        else {
          uVar19 = (ulong)(0x40 - uVar1);
          memcpy(auStack_100 + uVar1,__s,uVar19);
          mbedtls_internal_sha256_process(auStack_100,auStack_100);
          uVar17 = 1000 - uVar19;
          __src = (void *)((long)__s + uVar19);
        }
        while (0x3f < uVar17) {
          uVar19 = uVar17;
          pvVar21 = __src;
          do {
            mbedtls_internal_sha256_process(auStack_100,pvVar21);
            uVar19 = uVar19 - 0x40;
            pvVar21 = (void *)((long)pvVar21 + 0x40);
          } while (0x3f < uVar19);
          uVar19 = uVar17 & 0xffffffffffffffc0;
          uVar17 = uVar17 - uVar19;
          __src = (void *)((long)__src + uVar19);
          if (uVar19 == 0) goto LAB_00badbb4;
        }
        if (uVar17 != 0) {
          memcpy(auStack_100,__src,uVar17);
        }
        uVar16 = uVar16 + 1;
        if (999 < uVar16) break;
        uVar14 = (uint)local_c0;
      }
    }
    else {
      uVar17 = (&DAT_00788750)[uVar18];
      __src_00 = &DAT_007886a0 + uVar18 * 0x39;
      local_c0 = uVar17 & 0xffffffff;
      while (0x3f < uVar17) {
        uVar19 = uVar17;
        puVar20 = __src_00;
        do {
          mbedtls_internal_sha256_process(auStack_100,puVar20);
          uVar19 = uVar19 - 0x40;
          puVar20 = puVar20 + 0x40;
        } while (0x3f < uVar19);
        uVar19 = uVar17 & 0xffffffffffffffc0;
        __src_00 = __src_00 + uVar19;
        uVar17 = uVar17 - uVar19;
        if (uVar19 == 0) goto LAB_00badbb4;
      }
      if (uVar17 != 0) {
        memcpy(auStack_100,__src_00,uVar17);
      }
    }
    mbedtls_sha256_finish(auStack_100,auStack_90);
    iVar13 = memcmp(auStack_90,puVar8 + uVar18 * 0x20,(long)(int)(param_2 * -4 + 0x20));
    if (iVar13 != 0) {
      uVar15 = 1;
      goto joined_r0x00badbbc;
    }
    if (param_1 != 0) {
      puts("passed");
    }
    uVar18 = uVar18 + 1;
  } while (uVar18 < 3);
  if (param_1 != 0) {
    putchar(10);
  }
  uVar15 = 0;
  goto LAB_00badbcc;
LAB_00badbb4:
  uVar15 = 0xffffffff;
joined_r0x00badbbc:
  if (param_1 != 0) {
    puts("failed");
  }
LAB_00badbcc:
  mbedtls_platform_zeroize(auStack_100,0x6c);
  free(__s);
LAB_00badbf8:
  if (*(long *)(lVar9 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar15;
}

