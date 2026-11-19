/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba5394
 */

void mbedtls_ripemd160_self_test(int param_1)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  ulong uVar4;
  size_t __n;
  char *pcVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 local_e8;
  undefined8 uStack_e0;
  undefined4 local_d8;
  undefined4 local_d0 [2];
  undefined8 local_c8;
  undefined8 uStack_c0;
  undefined4 local_b8;
  undefined1 auStack_b4 [68];
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  uVar6 = 0;
  local_e8 = 0;
  uStack_e0 = 0;
  local_d8 = 0;
  do {
    if (param_1 != 0) {
      printf("  RIPEMD-160 test #%d: ",(int)uVar6 + 1);
    }
    memset(local_d0,0,0x5c);
    local_b8 = 0xc3d2e1f0;
    uStack_c0 = 0x1032547698badcfe;
    local_c8 = 0xefcdab8967452301;
    if (uVar6 != 0) {
      __n = (&DAT_00788268)[uVar6];
      pcVar5 = &DAT_00787fe0 + uVar6 * 0x51;
      local_d0[0] = (undefined4)__n;
      if (uVar6 == 7) {
        uVar7 = __n - 0x40;
        uVar4 = uVar7 & 0xffffffffffffffc0;
        pcVar5 = "12345678901234567890123456789012345678901234567890123456789012345678901234567890";
        do {
          mbedtls_internal_ripemd160_process(local_d0,pcVar5);
          __n = __n - 0x40;
          pcVar5 = pcVar5 + 0x40;
        } while (0x3f < __n);
        __n = uVar7 - uVar4;
        if (__n == 0) goto LAB_00ba54b4;
        pcVar5 = "12345678901234567890123456789012345678901234567890123456789012345678901234567890"
                 + uVar4 + 0x40;
      }
      memcpy(auStack_b4,pcVar5,__n);
    }
LAB_00ba54b4:
    mbedtls_ripemd160_finish(local_d0,&local_e8);
    mbedtls_platform_zeroize(local_d0,0x5c);
    iVar2 = memcmp(&local_e8,&DAT_007882a8 + uVar6 * 0x14,0x14);
    if (iVar2 != 0) {
      if (param_1 != 0) {
        puts("failed");
      }
      uVar3 = 1;
      goto LAB_00ba5524;
    }
    if (param_1 != 0) {
      puts("passed");
    }
    uVar6 = uVar6 + 1;
    if (7 < uVar6) {
      if (param_1 != 0) {
        putchar(10);
      }
      uVar3 = 0;
LAB_00ba5524:
      if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail(uVar3);
      }
      return;
    }
  } while( true );
}

