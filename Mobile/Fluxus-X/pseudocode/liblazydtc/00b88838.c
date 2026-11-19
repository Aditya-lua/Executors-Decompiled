/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b88838
 */

int psa_mac_verify_finish(int *param_1,void *param_2,size_t param_3)

{
  int iVar1;
  int iVar2;
  void *__dest;
  int iVar3;
  int iVar4;
  
  iVar3 = *param_1;
  if (iVar3 == 0) {
    return -0x89;
  }
  if ((*(byte *)((long)param_1 + 5) & 1) == 0) {
    if (*(byte *)(param_1 + 1) != param_3) {
      __dest = (void *)0x0;
      iVar4 = -0x95;
      iVar2 = -0x95;
      goto joined_r0x00b88920;
    }
    if (param_3 == 0) {
      __dest = (void *)0x0;
    }
    else {
      __dest = calloc(param_3,1);
      if (__dest == (void *)0x0) {
        iVar4 = -0x8d;
        iVar2 = -0x8d;
        goto joined_r0x00b88920;
      }
      memcpy(__dest,param_2,param_3);
    }
    if (iVar3 != 1) {
      iVar4 = -0x87;
      iVar2 = -0x87;
      goto joined_r0x00b88920;
    }
    iVar2 = mbedtls_psa_mac_verify_finish(param_1 + 2,__dest,param_3);
    iVar3 = *param_1;
    iVar4 = iVar2;
    if (iVar3 == 0) {
      iVar1 = 0;
      goto LAB_00b888f4;
    }
  }
  else {
    __dest = (void *)0x0;
    iVar4 = -0x89;
    iVar2 = -0x89;
joined_r0x00b88920:
    iVar1 = 0;
    if (iVar3 == 0) goto LAB_00b888f4;
  }
  iVar2 = iVar4;
  if (iVar3 == 1) {
    iVar1 = mbedtls_psa_mac_abort(param_1 + 2);
  }
  else {
    iVar1 = -0x87;
  }
  *(undefined1 *)(param_1 + 1) = 0;
  *param_1 = 0;
  *(byte *)((long)param_1 + 5) = *(byte *)((long)param_1 + 5) & 0xfe;
LAB_00b888f4:
  free(__dest);
  if (iVar2 != 0) {
    iVar1 = iVar2;
  }
  return iVar1;
}

