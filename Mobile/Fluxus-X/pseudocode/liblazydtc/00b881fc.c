/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b881fc
 */

int psa_hash_compare(uint param_1,void *param_2,size_t param_3,void *param_4,size_t param_5)

{
  long lVar1;
  int iVar2;
  int iVar3;
  void *__dest;
  void *__dest_00;
  size_t local_a0;
  undefined1 auStack_98 [64];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  if ((param_1 & 0x7f000000) != 0x2000000) {
    iVar2 = -0x87;
    goto LAB_00b88338;
  }
  if (param_3 == 0) {
    __dest = (void *)0x0;
LAB_00b88280:
    iVar2 = mbedtls_psa_hash_compute(param_1,__dest,param_3,auStack_98,0x40,&local_a0);
    if (iVar2 == 0) {
      if (local_a0 == param_5) {
        if (param_5 == 0) {
          __dest_00 = (void *)0x0;
        }
        else {
          __dest_00 = calloc(param_5,1);
          if (__dest_00 == (void *)0x0) goto LAB_00b882e8;
          memcpy(__dest_00,param_4,param_5);
        }
        iVar3 = mbedtls_ct_memcmp(__dest_00,auStack_98,param_5);
        iVar2 = 0;
        if (iVar3 != 0) {
          iVar2 = -0x95;
        }
      }
      else {
        __dest_00 = (void *)0x0;
        iVar2 = -0x95;
      }
    }
    else {
      __dest_00 = (void *)0x0;
    }
  }
  else {
    __dest = calloc(param_3,1);
    if (__dest != (void *)0x0) {
      memcpy(__dest,param_2,param_3);
      goto LAB_00b88280;
    }
    __dest_00 = (void *)0x0;
LAB_00b882e8:
    iVar2 = -0x8d;
  }
  mbedtls_platform_zeroize(auStack_98,0x40);
  free(__dest);
  free(__dest_00);
LAB_00b88338:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

