/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8af60
 */

int psa_cipher_finish(int *param_1,void *param_2,size_t param_3,undefined8 *param_4)

{
  int iVar1;
  void *__src;
  size_t __n;
  int iVar2;
  
  iVar2 = *param_1;
  if (iVar2 == 0) {
    *param_4 = 0;
    return -0x89;
  }
  if ((*(byte *)(param_1 + 1) & 3) == 1) {
    __src = (void *)0x0;
    iVar1 = -0x89;
    *param_4 = 0;
joined_r0x00b8b0c4:
    __n = 0;
    param_2 = (void *)0x0;
joined_r0x00b8b048:
    if (iVar2 == 0) goto joined_r0x00b8b0d0;
    if (iVar2 == 1) {
      mbedtls_psa_cipher_abort(param_1 + 2);
    }
  }
  else {
    if (param_3 == 0) {
      __n = 0;
      __src = (void *)0x0;
      param_2 = (void *)0x0;
      if (iVar2 == 1) goto LAB_00b8afec;
LAB_00b8b040:
      iVar1 = -0x87;
LAB_00b8b044:
      *param_4 = 0;
      goto joined_r0x00b8b048;
    }
    __src = calloc(param_3,1);
    if (__src == (void *)0x0) {
      iVar1 = -0x8d;
      *param_4 = 0;
      goto joined_r0x00b8b0c4;
    }
    __n = param_3;
    if (iVar2 != 1) goto LAB_00b8b040;
LAB_00b8afec:
    iVar1 = mbedtls_psa_cipher_finish(param_1 + 2,__src,param_3,param_4);
    iVar2 = *param_1;
    if (iVar1 != 0) goto LAB_00b8b044;
    if (iVar2 == 0) {
      iVar1 = 0;
      goto joined_r0x00b8b0d0;
    }
    if (iVar2 == 1) {
      mbedtls_psa_cipher_abort(param_1 + 2);
    }
    iVar1 = 0;
  }
  *param_1 = 0;
  *(byte *)(param_1 + 1) = *(byte *)(param_1 + 1) & 0xfc;
joined_r0x00b8b0d0:
  if (__src != (void *)0x0) {
    if (param_2 == (void *)0x0) {
      iVar1 = -0x97;
    }
    else {
      if (__n != 0) {
        memcpy(param_2,__src,__n);
      }
      free(__src);
    }
  }
  return iVar1;
}

