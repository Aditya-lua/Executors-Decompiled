/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9969c
 */

void mbedtls_psa_rsa_export_key
               (uint param_1,undefined8 param_2,void *param_3,ulong param_4,ulong *param_5)

{
  long lVar1;
  long lVar2;
  uint uVar3;
  undefined8 uVar4;
  size_t __n;
  void *__src;
  ulong __n_00;
  long local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  lVar1 = (long)param_3 + param_4;
  local_50 = lVar1;
  if ((~param_1 & 0x7000) == 0) {
    uVar3 = mbedtls_rsa_write_key();
  }
  else {
    uVar3 = mbedtls_rsa_write_pubkey(param_2,param_3,&local_50);
  }
  if ((int)uVar3 < 0) {
    memset(param_3,0,param_4);
    uVar4 = mbedtls_to_psa_error((ulong)uVar3);
    goto LAB_00b99784;
  }
  __n_00 = (ulong)(int)uVar3;
  if (param_4 < (-(ulong)(uVar3 >> 0x1f) & 0xfffffffe00000000 | (ulong)uVar3 << 1)) {
    if (__n_00 < param_4) {
      memmove(param_3,(void *)(lVar1 - __n_00),__n_00);
      __src = (void *)((long)param_3 + __n_00);
      __n = param_4 - __n_00;
      goto LAB_00b99778;
    }
  }
  else {
    __src = (void *)(lVar1 - __n_00);
    memcpy(param_3,__src,__n_00);
    __n = __n_00;
LAB_00b99778:
    memset(__src,0,__n);
  }
  uVar4 = 0;
  *param_5 = __n_00;
LAB_00b99784:
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

