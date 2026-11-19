/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9f2cc
 */

void mbedtls_cmac_self_test(ulong param_1)

{
  long lVar1;
  uint uVar2;
  int iVar3;
  ulong uVar4;
  long lVar5;
  int iVar6;
  ulong uVar7;
  undefined1 auStack_80 [16];
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_58;
  undefined8 uStack_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  uVar7 = param_1 & 0xffffffff;
  uVar4 = FUN_00b9f744(param_1,"AES 128",&DAT_00787810,0x80,&DAT_00787820,2,0x10);
  if (((((((int)uVar4 != 0) ||
         (uVar4 = FUN_00b9f930(uVar7,"AES 128",&DAT_00787810,0x80,&DAT_00787880,&DAT_00787890,2,0x10
                              ), (int)uVar4 != 0)) ||
        (uVar4 = FUN_00b9f744(uVar7,"AES 192",&DAT_007878d0,0xc0,&DAT_007878e8,3,0x10),
        (int)uVar4 != 0)) ||
       (((uVar4 = FUN_00b9f930(uVar7,"AES 192",&DAT_007878d0,0xc0,&DAT_00787880,&DAT_00787908,3,0x10
                              ), (int)uVar4 != 0 ||
         (uVar4 = FUN_00b9f744(uVar7,"AES 256",&DAT_00787948,0x100,&DAT_00787968,4,0x10),
         (int)uVar4 != 0)) ||
        ((uVar4 = FUN_00b9f930(uVar7,"AES 256",&DAT_00787948,0x100,&DAT_00787880,&DAT_00787988,4,
                               0x10), (int)uVar4 != 0 ||
         ((uVar4 = FUN_00b9f744(uVar7,"3DES 2 key",&DAT_007879c8,0xc0,&DAT_007879e0,0x24,8),
          (int)uVar4 != 0 ||
          (uVar4 = FUN_00b9f930(uVar7,"3DES 2 key",&DAT_007879c8,0xc0,&DAT_007879f0,&DAT_00787a00,
                                0x24,8), (int)uVar4 != 0)))))))) ||
      (uVar4 = FUN_00b9f744(uVar7,"3DES 3 key",&DAT_00787a20,0xc0,&DAT_00787a38,0x24,8),
      (int)uVar4 != 0)) ||
     (uVar4 = FUN_00b9f930(uVar7,"3DES 3 key",&DAT_00787a20,0xc0,&DAT_007879f0,&DAT_00787a48,0x24,8)
     , (int)uVar4 != 0)) goto LAB_00b9f704;
  printf("  AES CMAC 128 PRF #%d: ",0);
  lVar5 = mbedtls_cipher_info_from_type(2);
  if (lVar5 == 0) {
    uVar4 = 0xffff9f80;
  }
  else {
    local_58 = 0;
    uStack_50 = 0;
    uVar2 = mbedtls_cipher_cmac(lVar5,&local_58,0x80,&DAT_00787a68,0x12,&local_70);
    uVar4 = (ulong)uVar2;
    if (uVar2 == 0) {
      uVar4 = mbedtls_cipher_cmac(lVar5,&local_70,0x80,&DAT_00787a7a,0x14,auStack_80);
      uVar4 = uVar4 & 0xffffffff;
    }
  }
  mbedtls_platform_zeroize(&local_70,0x10);
  iVar6 = (int)param_1;
  if (((int)uVar4 == 0) && (iVar3 = memcmp(auStack_80,&DAT_00787a8e,0x10), iVar3 == 0)) {
    if (iVar6 != 0) {
      puts("passed");
    }
    printf("  AES CMAC 128 PRF #%d: ",1);
    lVar5 = mbedtls_cipher_info_from_type(2);
    if (lVar5 == 0) {
      uVar4 = 0xffff9f80;
    }
    else {
      uStack_68 = 0xf0e0d0c0b0a0908;
      local_70 = 0x706050403020100;
      uVar4 = mbedtls_cipher_cmac(lVar5,&local_70,0x80,&DAT_00787a7a,0x14,auStack_80);
      uVar4 = uVar4 & 0xffffffff;
    }
    mbedtls_platform_zeroize(&local_70,0x10);
    if (((int)uVar4 != 0) || (iVar3 = memcmp(auStack_80,&DAT_00787a9e,0x10), iVar3 != 0))
    goto LAB_00b9f6d4;
    if (iVar6 != 0) {
      puts("passed");
    }
    printf("  AES CMAC 128 PRF #%d: ",2);
    lVar5 = mbedtls_cipher_info_from_type(2);
    if (lVar5 == 0) {
      uVar4 = 0xffff9f80;
    }
    else {
      local_58 = 0;
      uStack_50 = 0;
      uVar2 = mbedtls_cipher_cmac(lVar5,&local_58,0x80,&DAT_00787a68,10,&local_70);
      uVar4 = (ulong)uVar2;
      if (uVar2 == 0) {
        uVar4 = mbedtls_cipher_cmac(lVar5,&local_70,0x80,&DAT_00787a7a,0x14,auStack_80);
        uVar4 = uVar4 & 0xffffffff;
      }
    }
    mbedtls_platform_zeroize(&local_70,0x10);
    if (((int)uVar4 != 0) || (iVar3 = memcmp(auStack_80,&DAT_00787aae,0x10), iVar3 != 0))
    goto LAB_00b9f6d4;
    if (iVar6 != 0) {
      puts("passed");
      goto LAB_00b9f6f0;
    }
  }
  else {
LAB_00b9f6d4:
    if (((iVar6 == 0) || (puts("failed"), iVar6 == 0)) || ((int)uVar4 != 0)) goto LAB_00b9f704;
LAB_00b9f6f0:
    putchar(10);
  }
  uVar4 = 0;
LAB_00b9f704:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

