/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6cd98
 */

void mbedtls_chacha20_self_test(int param_1)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  undefined1 auStack_260 [384];
  undefined8 local_e0;
  undefined8 uStack_d8;
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined1 auStack_a0 [64];
  undefined8 local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  if (param_1 != 0) {
    printf("  ChaCha20 test %u ",0);
  }
  mbedtls_platform_zeroize(&local_e0,0x40);
  mbedtls_platform_zeroize(auStack_a0,0x40);
  local_60 = 0x40;
  uStack_d8 = 0x6b20657479622d32;
  local_e0 = 0x3320646e61707865;
  uStack_c8 = 0;
  local_d0 = 0;
  uStack_b8 = 0;
  local_c0 = 0;
  uStack_a8 = 0;
  local_b0 = 0;
  mbedtls_platform_zeroize(auStack_a0,0x40);
  local_60 = 0x40;
  mbedtls_chacha20_update(&local_e0,0x40,&DAT_0077c9e8,auStack_260);
  mbedtls_platform_zeroize(&local_e0,0x88);
  iVar2 = memcmp(auStack_260,&DAT_0077ccd6,0x40);
  if (iVar2 == 0) {
    if (param_1 != 0) {
      puts("passed");
      printf("  ChaCha20 test %u ",1);
    }
    mbedtls_platform_zeroize(&local_e0,0x40);
    mbedtls_platform_zeroize(auStack_a0,0x40);
    uStack_d8 = 0x6b20657479622d32;
    local_e0 = 0x3320646e61707865;
    local_60 = 0x40;
    local_d0 = 0;
    uStack_c8 = 0;
    uStack_b8 = 0x100000000000000;
    local_c0 = 0;
    local_b0 = 1;
    uStack_a8 = 0x200000000000000;
    mbedtls_platform_zeroize(auStack_a0,0x40);
    local_60 = 0x40;
    mbedtls_chacha20_update(&local_e0,0x177,&DAT_0077cb5f,auStack_260);
    mbedtls_platform_zeroize(&local_e0,0x88);
    iVar2 = memcmp(auStack_260,&DAT_0077ce4d,0x177);
    if (iVar2 == 0) {
      if (param_1 != 0) {
        puts("passed");
        putchar(10);
      }
      uVar3 = 0;
      goto LAB_00b6cf28;
    }
  }
  if (param_1 != 0) {
    puts("failed (output)");
  }
  uVar3 = 0xffffffff;
LAB_00b6cf28:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

