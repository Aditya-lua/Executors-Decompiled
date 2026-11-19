/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b886bc
 */

int psa_mac_sign_finish(int *param_1,void *param_2,size_t param_3,size_t *param_4)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  void *__src;
  ulong uVar4;
  size_t sVar5;
  size_t __n;
  
  if (param_3 == 0) {
    __src = (void *)0x0;
    param_2 = (void *)0x0;
    iVar3 = *param_1;
    __n = 0;
joined_r0x00b88738:
    if (((iVar3 == 0) || ((*(byte *)((long)param_1 + 5) & 1) == 0)) ||
       (uVar4 = (ulong)*(byte *)(param_1 + 1), uVar4 == 0)) {
      iVar3 = -0x89;
    }
    else if (param_3 < uVar4) {
      iVar3 = -0x8a;
    }
    else if (iVar3 == 1) {
      iVar3 = mbedtls_psa_mac_sign_finish(param_1 + 2,__src,uVar4,param_4);
      if (iVar3 == 0) {
        bVar1 = true;
        goto joined_r0x00b88828;
      }
    }
    else {
      iVar3 = -0x87;
    }
  }
  else {
    __src = calloc(param_3,1);
    if (__src != (void *)0x0) {
      iVar3 = *param_1;
      __n = param_3;
      goto joined_r0x00b88738;
    }
    __n = 0;
    param_2 = (void *)0x0;
    iVar3 = -0x8d;
  }
  bVar1 = false;
  *param_4 = param_3;
  *(undefined1 *)(param_1 + 1) = 0;
joined_r0x00b88828:
  if ((param_3 != 0) && (__src != (void *)0x0)) {
    sVar5 = *param_4;
    if (!bVar1) {
      sVar5 = 0;
    }
    memset((void *)((long)__src + sVar5),0x21,param_3 - sVar5);
  }
  iVar2 = 0;
  if (*param_1 != 0) {
    if (*param_1 == 1) {
      iVar2 = mbedtls_psa_mac_abort(param_1 + 2);
    }
    else {
      iVar2 = -0x87;
    }
    *(undefined1 *)(param_1 + 1) = 0;
    *param_1 = 0;
    *(byte *)((long)param_1 + 5) = *(byte *)((long)param_1 + 5) & 0xfe;
  }
  if (__src != (void *)0x0) {
    if (param_2 == (void *)0x0) {
      return -0x97;
    }
    if (__n != 0) {
      memcpy(param_2,__src,__n);
    }
    free(__src);
  }
  if (iVar3 != 0) {
    iVar2 = iVar3;
  }
  return iVar2;
}

