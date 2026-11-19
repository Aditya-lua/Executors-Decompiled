/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8adbc
 */

int psa_cipher_update(int *param_1,void *param_2,size_t param_3,void *param_4,size_t param_5,
                     undefined8 param_6)

{
  int iVar1;
  int iVar2;
  void *__dest;
  void *__src;
  size_t __n;
  
  iVar1 = *param_1;
  if (iVar1 == 0) {
    return -0x89;
  }
  if ((*(byte *)(param_1 + 1) & 3) == 1) {
    param_4 = (void *)0x0;
    __src = (void *)0x0;
    __n = 0;
    __dest = (void *)0x0;
    iVar2 = -0x89;
  }
  else if (param_3 == 0) {
    __dest = (void *)0x0;
    if (param_5 != 0) goto LAB_00b8aea4;
LAB_00b8af20:
    __n = 0;
    __src = (void *)0x0;
    param_4 = (void *)0x0;
    if (iVar1 == 1) goto LAB_00b8aec4;
LAB_00b8af34:
    iVar2 = -0x87;
  }
  else {
    __dest = calloc(param_3,1);
    if (__dest == (void *)0x0) {
      __src = (void *)0x0;
    }
    else {
      memcpy(__dest,param_2,param_3);
      if (param_5 == 0) goto LAB_00b8af20;
LAB_00b8aea4:
      __src = calloc(param_5,1);
      if (__src != (void *)0x0) {
        __n = param_5;
        if (iVar1 != 1) goto LAB_00b8af34;
LAB_00b8aec4:
        iVar2 = mbedtls_psa_cipher_update(param_1 + 2,__dest,param_3,__src,param_5,param_6);
        if (iVar2 == 0) goto LAB_00b8ae40;
        iVar1 = *param_1;
        goto joined_r0x00b8aeec;
      }
    }
    param_4 = (void *)0x0;
    __n = 0;
    iVar2 = -0x8d;
  }
joined_r0x00b8aeec:
  if (iVar1 != 0) {
    if (iVar1 == 1) {
      mbedtls_psa_cipher_abort(param_1 + 2);
    }
    *param_1 = 0;
    *(byte *)(param_1 + 1) = *(byte *)(param_1 + 1) & 0xfc;
  }
LAB_00b8ae40:
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

