/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b998e8
 */

undefined4
mbedtls_psa_rsa_generate_key
          (ushort *param_1,byte *param_2,ulong param_3,void *param_4,ulong param_5,ulong *param_6)

{
  long lVar1;
  long lVar2;
  int iVar3;
  undefined4 uVar4;
  uint uVar5;
  size_t __n;
  void *__src;
  ulong uVar6;
  ulong __n_00;
  undefined1 auStack_148 [232];
  long local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  if (param_3 != 0) {
    if (param_3 < 5) {
      uVar5 = 0;
      do {
        param_3 = param_3 - 1;
        uVar5 = (uint)*param_2 | uVar5 << 8;
        param_2 = param_2 + 1;
      } while (param_3 != 0);
      if (-1 < (int)uVar5) goto LAB_00b99954;
    }
    uVar4 = 0xffffff7a;
    goto LAB_00b99a60;
  }
  uVar5 = 0x10001;
LAB_00b99954:
  mbedtls_rsa_init(auStack_148);
  iVar3 = mbedtls_rsa_gen_key(auStack_148,mbedtls_psa_get_random,0,param_1[1],uVar5);
  if (iVar3 != 0) {
    mbedtls_rsa_free(auStack_148);
    uVar4 = mbedtls_to_psa_error(iVar3);
    goto LAB_00b99a60;
  }
  lVar1 = (long)param_4 + param_5;
  local_60 = lVar1;
  if ((~*param_1 & 0x7000) == 0) {
    uVar5 = mbedtls_rsa_write_key();
    uVar6 = (ulong)uVar5;
    if (-1 < (int)uVar5) goto LAB_00b999c8;
LAB_00b99a0c:
    memset(param_4,0,param_5);
    uVar4 = mbedtls_to_psa_error(uVar6);
  }
  else {
    uVar5 = mbedtls_rsa_write_pubkey(auStack_148,param_4,&local_60);
    uVar6 = (ulong)uVar5;
    if ((int)uVar5 < 0) goto LAB_00b99a0c;
LAB_00b999c8:
    __n_00 = (ulong)(int)uVar6;
    if (param_5 < (-(uVar6 >> 0x1f) & 0xfffffffe00000000 | uVar6 << 1)) {
      if (__n_00 < param_5) {
        memmove(param_4,(void *)(lVar1 - __n_00),__n_00);
        __src = (void *)((long)param_4 + __n_00);
        __n = param_5 - __n_00;
        goto LAB_00b99a4c;
      }
    }
    else {
      __src = (void *)(lVar1 - __n_00);
      memcpy(param_4,__src,__n_00);
      __n = __n_00;
LAB_00b99a4c:
      memset(__src,0,__n);
    }
    uVar4 = 0;
    *param_6 = __n_00;
  }
  mbedtls_rsa_free(auStack_148);
LAB_00b99a60:
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar4;
}

