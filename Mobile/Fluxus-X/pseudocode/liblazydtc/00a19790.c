/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a19790
 */

DH * ossl_dh_dup(long param_1,uint param_2)

{
  int iVar1;
  DH_METHOD *pDVar2;
  DH_METHOD *pDVar3;
  DH *dh;
  BIGNUM *pBVar4;
  
  if (*(long *)(param_1 + 0xa8) != 0) {
    return (DH *)0x0;
  }
  pDVar2 = (DH_METHOD *)ossl_dh_get_method();
  pDVar3 = DH_OpenSSL();
  if (pDVar2 != pDVar3) {
    return (DH *)0x0;
  }
  dh = (DH *)ossl_dh_new_ex(*(undefined8 *)(param_1 + 0xb0));
  if (dh == (DH *)0x0) {
    return (DH *)0x0;
  }
  iVar1 = DH_get_length(param_1);
  dh->references = iVar1;
  if (((param_2 >> 2 & 1) == 0) || (iVar1 = ossl_ffc_params_copy(&dh->p,param_1 + 8), iVar1 != 0)) {
    *(undefined4 *)&dh->meth = *(undefined4 *)(param_1 + 0x80);
    if ((param_2 >> 1 & 1) != 0) {
      if ((param_2 >> 2 & 1) == 0) goto LAB_00a19844;
      if (*(BIGNUM **)(param_1 + 0x70) != (BIGNUM *)0x0) {
        pBVar4 = BN_dup(*(BIGNUM **)(param_1 + 0x70));
        (dh->ex_data).sk = (stack_st_void *)pBVar4;
        if (pBVar4 == (BIGNUM *)0x0) goto LAB_00a19844;
      }
    }
    if ((param_2 & 1) != 0) {
      if ((param_2 >> 2 & 1) == 0) goto LAB_00a19844;
      if (*(BIGNUM **)(param_1 + 0x78) != (BIGNUM *)0x0) {
        pBVar4 = BN_dup(*(BIGNUM **)(param_1 + 0x78));
        *(BIGNUM **)&(dh->ex_data).dummy = pBVar4;
        if (pBVar4 == (BIGNUM *)0x0) goto LAB_00a19844;
      }
    }
    iVar1 = CRYPTO_dup_ex_data(6,(CRYPTO_EX_DATA *)&dh[1].p,(CRYPTO_EX_DATA *)(param_1 + 0x98));
    if (iVar1 != 0) {
      return dh;
    }
  }
LAB_00a19844:
  DH_free(dh);
  return (DH *)0x0;
}

