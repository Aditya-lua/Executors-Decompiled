/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6d43c
 */

int mbedtls_chachapoly_auth_decrypt
              (long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,long param_5,
              undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  long lVar1;
  int iVar2;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 uStack_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  iVar2 = mbedtls_chacha20_starts(param_1,param_3,0);
  if (iVar2 == 0) {
    uStack_70 = 0;
    local_78 = 0;
    uStack_80 = 0;
    local_88 = 0;
    uStack_90 = 0;
    local_98 = 0;
    uStack_a0 = 0;
    local_a8 = 0;
    iVar2 = mbedtls_chacha20_update(param_1,0x40,&local_a8,&local_a8);
    if (iVar2 == 0) {
      iVar2 = mbedtls_poly1305_starts(param_1 + 0x88,&local_a8);
      if (iVar2 == 0) {
        *(undefined8 *)(param_1 + 0xd8) = 0;
        *(undefined8 *)(param_1 + 0xe0) = 0;
        *(undefined8 *)(param_1 + 0xe8) = 0x100000001;
      }
    }
  }
  mbedtls_platform_zeroize(&local_a8,0x40);
  if (iVar2 == 0) {
    if (*(int *)(param_1 + 0xe8) == 1) {
      *(long *)(param_1 + 0xd8) = *(long *)(param_1 + 0xd8) + param_5;
      iVar2 = mbedtls_poly1305_update(param_1 + 0x88,param_4,param_5);
      if (iVar2 == 0) {
        iVar2 = mbedtls_chachapoly_update(param_1,param_2,param_7,param_8);
        if (iVar2 == 0) {
          iVar2 = mbedtls_chachapoly_finish(param_1,&local_a8);
          if (iVar2 == 0) {
            iVar2 = mbedtls_ct_memcmp(param_6,&local_a8,0x10);
            if (iVar2 == 0) {
              iVar2 = 0;
            }
            else {
              mbedtls_platform_zeroize(param_8,param_2);
              iVar2 = -0x56;
            }
          }
        }
      }
    }
    else {
      iVar2 = -0x54;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

