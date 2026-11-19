/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8c618
 */

int psa_aead_set_nonce(int *param_1,void *param_2,size_t param_3)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  void *__dest;
  
  if (param_3 == 0) {
    __dest = (void *)0x0;
    iVar2 = *param_1;
  }
  else {
    __dest = calloc(param_3,1);
    if (__dest == (void *)0x0) {
      iVar3 = -0x8d;
      goto LAB_00b8c71c;
    }
    memcpy(__dest,param_2,param_3);
    iVar2 = *param_1;
  }
  if (iVar2 == 0) {
    iVar3 = -0x89;
    goto LAB_00b8c71c;
  }
  if ((*(byte *)(param_1 + 8) & 1) == 0) {
    uVar1 = param_1[1] & 0xffc07fff;
    if (uVar1 == 0x5000500) {
      iVar3 = -0x87;
      if (param_3 == 0xc) goto LAB_00b8c6ac;
    }
    else if (uVar1 == 0x5400100) {
      iVar3 = -0x87;
      if (param_3 - 7 < 7) goto LAB_00b8c6ac;
    }
    else {
      iVar3 = -0x87;
      if ((uVar1 == 0x5400200) && (param_3 != 0)) {
LAB_00b8c6ac:
        iVar3 = -0x87;
        if (iVar2 == 1) {
          iVar3 = mbedtls_psa_aead_set_nonce(param_1 + 10,__dest,param_3);
          if (iVar3 == 0) {
            *(byte *)(param_1 + 8) = *(byte *)(param_1 + 8) | 1;
            goto LAB_00b8c71c;
          }
          iVar2 = *param_1;
        }
      }
    }
  }
  else {
    iVar3 = -0x89;
  }
  if (iVar2 != 0) {
    if (iVar2 == 1) {
      mbedtls_psa_aead_abort(param_1 + 10);
    }
    memset(param_1,0,0x1d8);
  }
LAB_00b8c71c:
  free(__dest);
  return iVar3;
}

