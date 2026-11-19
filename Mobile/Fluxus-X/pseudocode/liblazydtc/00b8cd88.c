/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8cd88
 */

int psa_aead_verify(int *param_1,void *param_2,size_t param_3,undefined8 *param_4,void *param_5,
                   size_t param_6)

{
  byte bVar1;
  long lVar2;
  int iVar3;
  int iVar4;
  void *__src;
  void *__dest;
  size_t __n;
  size_t local_80;
  undefined1 auStack_78 [16];
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  if (param_3 != 0) {
    __src = calloc(param_3,1);
    if (__src == (void *)0x0) {
      param_2 = (void *)0x0;
      __n = 0;
      __dest = (void *)0x0;
    }
    else {
      __n = param_3;
      if (param_6 == 0) goto LAB_00b8ce24;
LAB_00b8cdec:
      __dest = calloc(param_6,1);
      if (__dest != (void *)0x0) {
        memcpy(__dest,param_5,param_6);
        goto LAB_00b8ce28;
      }
    }
    iVar3 = -0x8d;
    iVar4 = *param_1;
    goto joined_r0x00b8ceb8;
  }
  __n = 0;
  __src = (void *)0x0;
  param_2 = (void *)0x0;
  if (param_6 != 0) goto LAB_00b8cdec;
LAB_00b8ce24:
  __dest = (void *)0x0;
LAB_00b8ce28:
  *param_4 = 0;
  if ((*param_1 == 0) || (bVar1 = *(byte *)(param_1 + 8), (bVar1 & 1) == 0)) {
LAB_00b8ceb0:
    iVar3 = -0x89;
    iVar4 = *param_1;
  }
  else {
    if (((bVar1 >> 1 & 1) == 0) || ((*(long *)(param_1 + 4) == 0 && (*(long *)(param_1 + 6) == 0))))
    {
      if ((bVar1 >> 4 & 1) != 0) goto LAB_00b8ceb0;
      if (*param_1 == 1) {
        iVar3 = mbedtls_psa_aead_finish
                          (param_1 + 10,__src,param_3,param_4,auStack_78,0x10,&local_80);
        if (iVar3 == 0) {
          if ((local_80 == param_6) &&
             (iVar4 = mbedtls_ct_memcmp(__dest,auStack_78,param_6), iVar4 == 0)) {
            iVar3 = 0;
          }
          else {
            iVar3 = -0x95;
          }
        }
        mbedtls_platform_zeroize(auStack_78,0x10);
        iVar4 = *param_1;
        goto joined_r0x00b8ceb8;
      }
    }
    iVar3 = -0x87;
    iVar4 = *param_1;
  }
joined_r0x00b8ceb8:
  if (iVar4 != 0) {
    if (iVar4 == 1) {
      mbedtls_psa_aead_abort(param_1 + 10);
    }
    memset(param_1,0,0x1d8);
  }
  if (__src != (void *)0x0) {
    if (param_2 == (void *)0x0) {
      iVar3 = -0x97;
    }
    else {
      if (__n != 0) {
        memcpy(param_2,__src,__n);
      }
      free(__src);
    }
  }
  free(__dest);
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

