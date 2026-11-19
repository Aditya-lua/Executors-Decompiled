/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8cb7c
 */

int psa_aead_finish(int *param_1,void *param_2,size_t param_3,undefined8 *param_4,void *param_5,
                   size_t param_6,size_t *param_7)

{
  byte bVar1;
  int iVar2;
  void *__src;
  void *__src_00;
  size_t sVar3;
  size_t __n;
  size_t local_68;
  
  if (param_3 == 0) {
    __src = (void *)0x0;
    param_2 = (void *)0x0;
    local_68 = 0;
    if (param_6 != 0) goto LAB_00b8cbdc;
LAB_00b8cc1c:
    __n = 0;
    __src_00 = (void *)0x0;
    param_5 = (void *)0x0;
LAB_00b8cc28:
    *param_4 = 0;
    *param_7 = param_6;
    if ((*param_1 == 0) || (bVar1 = *(byte *)(param_1 + 8), (bVar1 & 1) == 0)) {
LAB_00b8cc48:
      iVar2 = -0x89;
    }
    else {
      if (((bVar1 >> 1 & 1) == 0) ||
         ((*(long *)(param_1 + 4) == 0 && (*(long *)(param_1 + 6) == 0)))) {
        if ((bVar1 >> 4 & 1) == 0) goto LAB_00b8cc48;
        if (*param_1 == 1) {
          iVar2 = mbedtls_psa_aead_finish
                            (param_1 + 10,__src,param_3,param_4,__src_00,param_6,param_7);
          goto joined_r0x00b8cc6c;
        }
      }
      iVar2 = -0x87;
    }
joined_r0x00b8cc6c:
    if (param_6 == 0) goto LAB_00b8cce0;
    sVar3 = *param_7;
    if (iVar2 != 0) {
      sVar3 = 0;
    }
  }
  else {
    __src = calloc(param_3,1);
    if (__src == (void *)0x0) {
      param_2 = (void *)0x0;
      local_68 = 0;
      __n = 0;
      __src_00 = (void *)0x0;
      param_5 = (void *)0x0;
      iVar2 = -0x8d;
      goto joined_r0x00b8cc6c;
    }
    local_68 = param_3;
    if (param_6 == 0) goto LAB_00b8cc1c;
LAB_00b8cbdc:
    __src_00 = calloc(param_6,1);
    __n = param_6;
    if (__src_00 != (void *)0x0) goto LAB_00b8cc28;
    __n = 0;
    param_5 = (void *)0x0;
    sVar3 = 0;
    iVar2 = -0x8d;
  }
  memset((void *)((long)__src_00 + sVar3),0x21,param_6 - sVar3);
LAB_00b8cce0:
  if (*param_1 != 0) {
    if (*param_1 == 1) {
      mbedtls_psa_aead_abort(param_1 + 10);
    }
    memset(param_1,0,0x1d8);
  }
  if (__src != (void *)0x0) {
    if (param_2 == (void *)0x0) {
      iVar2 = -0x97;
    }
    else {
      if (local_68 != 0) {
        memcpy(param_2,__src,local_68);
      }
      free(__src);
    }
  }
  if (__src_00 != (void *)0x0) {
    if (param_5 == (void *)0x0) {
      iVar2 = -0x97;
    }
    else {
      if (__n != 0) {
        memcpy(param_5,__src_00,__n);
      }
      free(__src_00);
    }
  }
  return iVar2;
}

