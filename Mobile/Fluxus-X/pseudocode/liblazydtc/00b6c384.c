/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6c384
 */

void mbedtls_ccm_self_test(int param_1)

{
  size_t __n;
  long lVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  undefined *__s2;
  ulong uVar5;
  size_t __n_00;
  undefined8 uVar6;
  undefined8 local_158;
  undefined8 uStack_150;
  undefined8 local_148;
  undefined8 uStack_140;
  undefined8 local_138;
  undefined8 uStack_130;
  undefined8 local_128;
  undefined1 auStack_120 [72];
  undefined1 auStack_d8 [104];
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  memset(auStack_120,0,0xb0);
  lVar3 = mbedtls_cipher_info_from_values(2,0x80,1);
  if ((lVar3 != 0) && ((*(uint *)(lVar3 + 8) & 0x1f) == 0x10)) {
    mbedtls_cipher_free(auStack_d8);
    iVar2 = mbedtls_cipher_setup(auStack_d8,lVar3);
    if ((iVar2 == 0) && (iVar2 = mbedtls_cipher_setkey(auStack_d8,&DAT_0077c8d8,0x80,1), iVar2 == 0)
       ) {
      uVar5 = 0;
      __s2 = &DAT_0077c988;
      do {
        if (param_1 != 0) {
          printf("  CCM-AES #%u: ",(int)uVar5 + 1);
        }
        __n_00 = (&DAT_0077c900)[uVar5];
        __n = 0;
        if (uVar5 != 2) {
          __n = 0x18 - __n_00;
        }
        uStack_140 = 0;
        local_148 = 0;
        uStack_150 = 0;
        local_158 = 0;
        memset(auStack_120 + (__n_00 - 0x18),0,__n);
        memcpy(&local_138,&DAT_0077c8e8,__n_00);
        uVar6 = (&DAT_0077c928)[uVar5];
        uVar4 = (&DAT_0077c958)[uVar5];
        lVar3 = (&DAT_0077c970)[uVar5];
        iVar2 = mbedtls_ccm_encrypt_and_tag
                          (auStack_120,__n_00,&DAT_0077c918,uVar6,&DAT_0077c940,uVar4,&local_138,
                           &local_158,auStack_120 + (__n_00 - 0x38),lVar3);
        if ((iVar2 != 0) || (iVar2 = memcmp(&local_158,__s2,lVar3 + __n_00), iVar2 != 0)) {
LAB_00b6c600:
          if (param_1 != 0) {
            puts("failed");
          }
          goto LAB_00b6c438;
        }
        local_138 = 0;
        uStack_130 = 0;
        local_128 = 0;
        iVar2 = FUN_00b6c17c(auStack_120,0,__n_00,&DAT_0077c918,uVar6,&DAT_0077c940,uVar4,&local_158
                             ,&local_138,auStack_120 + (__n_00 - 0x38),lVar3);
        if ((iVar2 != 0) || (iVar2 = memcmp(&local_138,&DAT_0077c8e8,__n_00), iVar2 != 0))
        goto LAB_00b6c600;
        if (param_1 != 0) {
          puts("passed");
        }
        uVar5 = uVar5 + 1;
        __s2 = __s2 + 0x20;
      } while (uVar5 < 3);
      mbedtls_cipher_free(auStack_d8);
      mbedtls_platform_zeroize(auStack_120,0xb0);
      if (param_1 != 0) {
        putchar(10);
      }
      uVar4 = 0;
      goto LAB_00b6c43c;
    }
  }
  if (param_1 != 0) {
    printf("  CCM: setup failed");
  }
LAB_00b6c438:
  uVar4 = 1;
LAB_00b6c43c:
  if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

