/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8c9c4
 */

int psa_aead_update(int *param_1,void *param_2,size_t param_3,void *param_4,size_t param_5,
                   undefined8 *param_6)

{
  int iVar1;
  int iVar2;
  void *__dest;
  void *__src;
  size_t __n;
  
  if (param_3 == 0) {
    __dest = (void *)0x0;
    if (param_5 != 0) goto LAB_00b8ca20;
LAB_00b8ca48:
    __n = 0;
    __src = (void *)0x0;
    param_4 = (void *)0x0;
LAB_00b8ca54:
    *param_6 = 0;
    if ((*param_1 == 0) || ((*(byte *)(param_1 + 8) & 1) == 0)) {
LAB_00b8ca80:
      iVar2 = -0x89;
      iVar1 = *param_1;
    }
    else {
      if ((*(byte *)(param_1 + 8) >> 1 & 1) == 0) {
        if (param_1[1] == 0x5500100) goto LAB_00b8ca80;
LAB_00b8cb30:
        if (*param_1 == 1) {
          iVar2 = mbedtls_psa_aead_update(param_1 + 10,__dest,param_3,__src,param_5,param_6);
          if (iVar2 == 0) {
            *(byte *)(param_1 + 8) = *(byte *)(param_1 + 8) | 8;
            goto LAB_00b8cac8;
          }
          goto LAB_00b8cac0;
        }
      }
      else if ((*(long *)(param_1 + 4) == 0) && (param_3 <= *(ulong *)(param_1 + 6))) {
        *(ulong *)(param_1 + 6) = *(ulong *)(param_1 + 6) - param_3;
        goto LAB_00b8cb30;
      }
      iVar2 = -0x87;
      iVar1 = *param_1;
    }
  }
  else {
    __dest = calloc(param_3,1);
    if (__dest == (void *)0x0) {
      __src = (void *)0x0;
    }
    else {
      memcpy(__dest,param_2,param_3);
      if (param_5 == 0) goto LAB_00b8ca48;
LAB_00b8ca20:
      __src = calloc(param_5,1);
      __n = param_5;
      if (__src != (void *)0x0) goto LAB_00b8ca54;
    }
    param_4 = (void *)0x0;
    __n = 0;
    iVar2 = -0x8d;
LAB_00b8cac0:
    iVar1 = *param_1;
  }
  if (iVar1 != 0) {
    if (iVar1 == 1) {
      mbedtls_psa_aead_abort(param_1 + 10);
    }
    memset(param_1,0,0x1d8);
  }
LAB_00b8cac8:
  free(__dest);
  if (__src != (void *)0x0) {
    if (param_4 == (void *)0x0) {
      iVar2 = -0x97;
    }
    else {
      if (__n != 0) {
        memcpy(param_4,__src,__n);
      }
      free(__src);
    }
  }
  return iVar2;
}

