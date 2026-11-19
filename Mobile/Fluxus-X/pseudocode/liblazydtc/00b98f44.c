/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b98f44
 */

int mbedtls_psa_cipher_finish(uint *param_1,void *param_2,ulong param_3,size_t *param_4)

{
  long lVar1;
  int iVar2;
  size_t __n;
  undefined1 auStack_58 [16];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if ((*(long *)(param_1 + 0xe) == 0) || ((*param_1 | 0x400) != 0x4404400)) {
    mbedtls_cipher_finish(param_1 + 2,auStack_58,param_4);
    iVar2 = mbedtls_to_psa_error();
    if (iVar2 == 0) {
      __n = *param_4;
      if (__n != 0) {
        if (param_3 < __n) {
          iVar2 = -0x8a;
          goto LAB_00b98fe0;
        }
        memcpy(param_2,auStack_58,__n);
      }
      iVar2 = 0;
    }
  }
  else {
    iVar2 = -0x87;
  }
LAB_00b98fe0:
  mbedtls_platform_zeroize(auStack_58,0x10);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

