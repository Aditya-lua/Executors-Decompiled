/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8c888
 */

int psa_aead_update_ad(int *param_1,void *param_2,size_t param_3)

{
  int iVar1;
  byte bVar2;
  int iVar3;
  void *__dest;
  
  if (param_3 == 0) {
    __dest = (void *)0x0;
    iVar3 = *param_1;
joined_r0x00b8c93c:
    if (iVar3 == 0) {
      iVar3 = -0x89;
      goto LAB_00b8c9a8;
    }
    bVar2 = *(byte *)(param_1 + 8);
    if ((bVar2 & 9) == 1) {
      if (param_3 == 0) {
LAB_00b8c98c:
        iVar3 = 0;
        *(byte *)(param_1 + 8) = bVar2 | 4;
        goto LAB_00b8c9a8;
      }
      if ((bVar2 >> 1 & 1) == 0) {
        if (param_1[1] == 0x5500100) goto LAB_00b8c904;
LAB_00b8c968:
        if (iVar3 == 1) {
          iVar3 = mbedtls_psa_aead_update_ad(param_1 + 10,__dest,param_3);
          if (iVar3 != 0) goto LAB_00b8c94c;
          bVar2 = *(byte *)(param_1 + 8);
          goto LAB_00b8c98c;
        }
      }
      else if (param_3 <= *(ulong *)(param_1 + 4)) {
        *(ulong *)(param_1 + 4) = *(ulong *)(param_1 + 4) - param_3;
        goto LAB_00b8c968;
      }
      iVar3 = -0x87;
      iVar1 = *param_1;
    }
    else {
LAB_00b8c904:
      iVar3 = -0x89;
      iVar1 = *param_1;
    }
  }
  else {
    __dest = calloc(param_3,1);
    if (__dest != (void *)0x0) {
      memcpy(__dest,param_2,param_3);
      iVar3 = *param_1;
      goto joined_r0x00b8c93c;
    }
    iVar3 = -0x8d;
LAB_00b8c94c:
    iVar1 = *param_1;
  }
  if (iVar1 != 0) {
    if (iVar1 == 1) {
      mbedtls_psa_aead_abort(param_1 + 10);
    }
    memset(param_1,0,0x1d8);
  }
LAB_00b8c9a8:
  free(__dest);
  return iVar3;
}

