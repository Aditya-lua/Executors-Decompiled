/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b997b0
 */

int mbedtls_psa_rsa_export_public_key
              (undefined2 *param_1,undefined8 param_2,undefined8 param_3,void *param_4,ulong param_5
              ,ulong *param_6)

{
  long lVar1;
  long lVar2;
  void *__ptr;
  int iVar3;
  uint uVar4;
  size_t __n;
  void *__src;
  ulong __n_00;
  void *local_68;
  long local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  local_68 = (void *)0x0;
  iVar3 = mbedtls_psa_rsa_load_representation(*param_1,param_2,param_3,&local_68);
  __ptr = local_68;
  if (iVar3 != 0) goto LAB_00b998a4;
  lVar1 = (long)param_4 + param_5;
  local_60 = lVar1;
  uVar4 = mbedtls_rsa_write_pubkey(local_68,param_4,&local_60);
  if ((int)uVar4 < 0) {
    memset(param_4,0,param_5);
    iVar3 = mbedtls_to_psa_error((ulong)uVar4);
    goto LAB_00b998a4;
  }
  __n_00 = (ulong)(int)uVar4;
  if (param_5 < (-(ulong)(uVar4 >> 0x1f) & 0xfffffffe00000000 | (ulong)uVar4 << 1)) {
    if (__n_00 < param_5) {
      memmove(param_4,(void *)(lVar1 - __n_00),__n_00);
      __src = (void *)((long)param_4 + __n_00);
      __n = param_5 - __n_00;
      goto LAB_00b99898;
    }
  }
  else {
    __src = (void *)(lVar1 - __n_00);
    memcpy(param_4,__src,__n_00);
    __n = __n_00;
LAB_00b99898:
    memset(__src,0,__n);
  }
  iVar3 = 0;
  *param_6 = __n_00;
LAB_00b998a4:
  mbedtls_rsa_free(__ptr);
  free(__ptr);
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

