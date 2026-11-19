/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bae77c
 */

undefined8 FUN_00bae77c(int param_1,uint param_2)

{
  uint uVar1;
  undefined *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  long lVar10;
  void *__src;
  bool bVar11;
  int iVar12;
  void *__s;
  undefined *puVar13;
  undefined8 uVar14;
  uint uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  void *pvVar19;
  undefined *__src_00;
  ulong local_188;
  long local_180;
  undefined8 local_178;
  undefined8 uStack_170;
  undefined8 local_168;
  undefined8 uStack_160;
  undefined8 local_158;
  undefined8 local_150;
  undefined8 local_148;
  undefined8 local_140;
  undefined1 auStack_138 [128];
  uint local_b8;
  undefined1 auStack_b0 [64];
  long local_70;
  
  lVar10 = tpidr_el0;
  local_70 = *(long *)(lVar10 + 0x28);
  puVar2 = &UNK_00788aa8;
  if (param_2 != 0) {
    puVar2 = &DAT_007889e8;
  }
  __s = calloc(0x400,1);
  if (__s == (void *)0x0) {
    if (param_1 != 0) {
      puts("Buffer allocation failed");
    }
    uVar14 = 1;
  }
  else {
    memset(&local_188,0,0xd8);
    bVar11 = param_2 != 0;
    uVar14 = 0x6a09e667f3bcc908;
    if (bVar11) {
      uVar14 = 0xcbbb9d5dc1059ed8;
    }
    uVar3 = 0xa54ff53a5f1d36f1;
    if (bVar11) {
      uVar3 = 0x152fecd8f70e5939;
    }
    uVar4 = 0x510e527fade682d1;
    if (bVar11) {
      uVar4 = 0x67332667ffc00b31;
    }
    uVar5 = 0x9b05688c2b3e6c1f;
    if (bVar11) {
      uVar5 = 0x8eb44a8768581511;
    }
    uVar6 = 0x1f83d9abfb41bd6b;
    if (bVar11) {
      uVar6 = 0xdb0c2e0d64f98fa7;
    }
    uVar7 = 0x5be0cd19137e2179;
    if (bVar11) {
      uVar7 = 0x47b5481dbefa4fa4;
    }
    uVar17 = 0;
    uVar8 = 0xbb67ae8584caa73b;
    if (bVar11) {
      uVar8 = 0x629a292a367cd507;
    }
    uVar9 = 0x3c6ef372fe94f82b;
    if (bVar11) {
      uVar9 = 0x9159015a3070dd17;
    }
    do {
      if (param_1 != 0) {
        printf("  SHA-%d test #%d: ",param_2 * -0x80 + 0x200,(int)uVar17 + 1);
      }
      if (1 < param_2) {
        uVar14 = 0xffffff8b;
joined_r0x00baeb90:
        if (param_1 != 0) {
          puts("failed");
        }
        goto LAB_00baeba0;
      }
      local_188 = 0;
      local_180 = 0;
      local_178 = uVar14;
      uStack_170 = uVar8;
      local_168 = uVar9;
      uStack_160 = uVar3;
      local_158 = uVar4;
      local_150 = uVar5;
      local_148 = uVar6;
      local_140 = uVar7;
      local_b8 = param_2;
      if (uVar17 == 2) {
        memset(__s,0x61,1000);
        local_188 = 0;
        uVar15 = 0;
        do {
          uVar1 = (uint)local_188 & 0x7f;
          if (0xfffffffffffffc17 < local_188) {
            local_180 = local_180 + 1;
          }
          if ((local_188 & 0x7f) == 0) {
            uVar16 = 1000;
            __src = __s;
            local_188 = local_188 + 1000;
          }
          else {
            uVar18 = (ulong)(0x80 - uVar1);
            local_188 = local_188 + 1000;
            memcpy(auStack_138 + uVar1,__s,uVar18);
            mbedtls_internal_sha512_process(&local_188,auStack_138);
            uVar16 = 1000 - uVar18;
            __src = (void *)((long)__s + uVar18);
          }
          while (0x7f < uVar16) {
            pvVar19 = __src;
            uVar18 = uVar16;
            do {
              mbedtls_internal_sha512_process(&local_188,pvVar19);
              uVar18 = uVar18 - 0x80;
              pvVar19 = (void *)((long)pvVar19 + 0x80);
            } while (0x7f < uVar18);
            uVar18 = uVar16 & 0xffffffffffffff80;
            uVar16 = uVar16 - uVar18;
            __src = (void *)((long)__src + uVar18);
            if (uVar18 == 0) {
              uVar14 = 0xffffffff;
              goto joined_r0x00baeb90;
            }
          }
          if (uVar16 != 0) {
            memcpy(auStack_138,__src,uVar16);
          }
          uVar15 = uVar15 + 1;
        } while (uVar15 < 1000);
      }
      else {
        uVar16 = (&DAT_00788cc0)[uVar17];
        __src_00 = &DAT_00788b68 + uVar17 * 0x71;
        local_188 = uVar16;
        while (0x7f < uVar16) {
          puVar13 = __src_00;
          uVar18 = uVar16;
          do {
            mbedtls_internal_sha512_process(&local_188,puVar13);
            uVar18 = uVar18 - 0x80;
            puVar13 = puVar13 + 0x80;
          } while (0x7f < uVar18);
          uVar18 = uVar16 & 0xffffffffffffff80;
          __src_00 = __src_00 + uVar18;
          uVar16 = uVar16 - uVar18;
          if (uVar18 == 0) {
            uVar14 = 0xffffffff;
            goto joined_r0x00baeb90;
          }
        }
        if (uVar16 != 0) {
          memcpy(auStack_138,__src_00,uVar16);
        }
      }
      mbedtls_sha512_finish(&local_188,auStack_b0);
      iVar12 = memcmp(auStack_b0,puVar2 + uVar17 * 0x40,(long)(int)(param_2 * -0x10 + 0x40));
      if (iVar12 != 0) {
        uVar14 = 1;
        goto joined_r0x00baeb90;
      }
      if (param_1 != 0) {
        puts("passed");
      }
      uVar17 = uVar17 + 1;
    } while (uVar17 < 3);
    if (param_1 != 0) {
      putchar(10);
    }
    uVar14 = 0;
LAB_00baeba0:
    mbedtls_platform_zeroize(&local_188,0xd8);
    free(__s);
  }
  if (*(long *)(lVar10 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar14;
}

