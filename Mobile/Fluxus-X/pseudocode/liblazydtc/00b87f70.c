/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b87f70
 */

int psa_hash_verify(int *param_1,void *param_2,size_t param_3)

{
  long lVar1;
  int iVar2;
  int iVar3;
  void *__dest;
  size_t local_90;
  undefined1 auStack_88 [64];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_90 = 0;
  iVar3 = *param_1;
  iVar2 = -0x89;
  if (iVar3 == 0) {
    __dest = (void *)0x0;
  }
  else {
    if (iVar3 == 1) {
      iVar2 = mbedtls_psa_hash_finish(param_1 + 2,auStack_88,0x40,&local_90);
      iVar3 = *param_1;
    }
    if (iVar3 != 0) {
      if (iVar3 == 1) {
        mbedtls_psa_hash_abort(param_1 + 2);
      }
      *param_1 = 0;
    }
    __dest = (void *)0x0;
    if (iVar2 == 0) {
      if (local_90 == param_3) {
        if (param_3 == 0) {
          __dest = (void *)0x0;
        }
        else {
          __dest = calloc(param_3,1);
          if (__dest == (void *)0x0) {
            iVar2 = -0x8d;
            goto LAB_00b88058;
          }
          memcpy(__dest,param_2,param_3);
        }
        iVar3 = mbedtls_ct_memcmp(__dest,auStack_88,param_3);
        if (iVar3 == 0) {
          mbedtls_platform_zeroize(auStack_88,0x40);
          iVar2 = 0;
          goto LAB_00b88080;
        }
      }
      else {
        __dest = (void *)0x0;
      }
      iVar2 = -0x95;
    }
  }
LAB_00b88058:
  mbedtls_platform_zeroize(auStack_88,0x40);
  if (*param_1 != 0) {
    if (*param_1 == 1) {
      mbedtls_psa_hash_abort(param_1 + 2);
    }
    *param_1 = 0;
  }
LAB_00b88080:
  free(__dest);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

