/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7a3e8
 */

void mbedtls_md5_self_test(int param_1)

{
  void *__s;
  uint uVar1;
  long lVar2;
  int iVar3;
  undefined8 uVar4;
  ulong uVar5;
  uint uVar6;
  size_t __n;
  char *pcVar7;
  ulong uVar8;
  ulong uVar9;
  undefined8 local_d0;
  undefined8 uStack_c8;
  uint local_c0;
  undefined4 local_bc;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 uStack_78;
  int local_70;
  undefined4 uStack_6c;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  uVar9 = 0;
  do {
    if (param_1 != 0) {
      printf("  MD5 test #%d: ",(int)uVar9 + 1);
    }
    memset(&local_c0,0,0x58);
    uStack_b0 = 0x1032547698badcfe;
    local_b8 = 0xefcdab8967452301;
    if (uVar9 != 0) {
      __n = (&DAT_0077fed0)[uVar9];
      pcVar7 = &DAT_0077fc98 + uVar9 * 0x51;
      local_c0 = (uint)__n;
      if (uVar9 == 6) {
        uVar8 = __n - 0x40;
        uVar5 = uVar8 & 0xffffffffffffffc0;
        pcVar7 = "12345678901234567890123456789012345678901234567890123456789012345678901234567890";
        do {
          mbedtls_internal_md5_process(&local_c0,pcVar7);
          __n = __n - 0x40;
          pcVar7 = pcVar7 + 0x40;
        } while (0x3f < __n);
        __n = uVar8 - uVar5;
        if (__n == 0) goto LAB_00b7a4f4;
        pcVar7 = "12345678901234567890123456789012345678901234567890123456789012345678901234567890"
                 + uVar5 + 0x40;
      }
      memcpy(&local_a8,pcVar7,__n);
    }
LAB_00b7a4f4:
    uVar6 = local_c0;
    uVar1 = local_c0 & 0x3f;
    __s = (void *)((long)&local_a8 + (ulong)(uVar1 + 1));
    *(undefined1 *)((long)&local_a8 + (ulong)uVar1) = 0x80;
    if (uVar1 + 1 < 0x39) {
      memset(__s,0,(ulong)(0x37 - uVar1));
    }
    else {
      memset(__s,0,(ulong)(uVar1 ^ 0x3f));
      mbedtls_internal_md5_process(&local_c0,&local_a8);
      local_80 = 0;
      uStack_78 = 0;
      local_90 = 0;
      uStack_88 = 0;
      local_a0 = 0;
      uStack_98 = 0;
      local_a8 = 0;
      uVar6 = local_c0;
    }
    local_70 = uVar6 << 3;
    uStack_6c = (undefined4)(CONCAT44(local_bc,uVar6) >> 0x1d);
    mbedtls_internal_md5_process(&local_c0,&local_a8);
    uStack_c8 = uStack_b0;
    local_d0 = local_b8;
    mbedtls_platform_zeroize(&local_c0,0x58);
    mbedtls_platform_zeroize(&local_c0,0x58);
    iVar3 = memcmp(&local_d0,&DAT_0077ff08 + uVar9 * 0x10,0x10);
    if (iVar3 != 0) {
      if (param_1 != 0) {
        puts("failed");
      }
      uVar4 = 1;
      goto LAB_00b7a5e8;
    }
    if (param_1 != 0) {
      puts("passed");
    }
    uVar9 = uVar9 + 1;
    if (6 < uVar9) {
      if (param_1 != 0) {
        putchar(10);
      }
      uVar4 = 0;
LAB_00b7a5e8:
      if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail(uVar4);
      }
      return;
    }
  } while( true );
}

