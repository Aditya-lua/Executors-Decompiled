/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a20230
 */

DSA * ossl_dsa_dup(long param_1,uint param_2)

{
  int iVar1;
  DSA_METHOD *pDVar2;
  DSA_METHOD *pDVar3;
  DSA *r;
  BIGNUM *pBVar4;
  
  if (*(long *)(param_1 + 0xa8) != 0) {
    return (DSA *)0x0;
  }
  pDVar2 = (DSA_METHOD *)DSA_get_method();
  pDVar3 = DSA_OpenSSL();
  if (pDVar2 != pDVar3) {
    return (DSA *)0x0;
  }
  r = (DSA *)ossl_dsa_new(*(undefined8 *)(param_1 + 0xb8));
  if (r == (DSA *)0x0) {
    return (DSA *)0x0;
  }
  if (((param_2 >> 2 & 1) == 0) ||
     (iVar1 = ossl_ffc_params_copy(&r->version,param_1 + 8), iVar1 != 0)) {
    *(undefined4 *)&r->meth = *(undefined4 *)(param_1 + 0x78);
    if ((param_2 >> 1 & 1) != 0) {
      if ((param_2 >> 2 & 1) == 0) goto LAB_00a202d8;
      if (*(BIGNUM **)(param_1 + 0x68) != (BIGNUM *)0x0) {
        pBVar4 = BN_dup(*(BIGNUM **)(param_1 + 0x68));
        (r->ex_data).sk = (stack_st_void *)pBVar4;
        if (pBVar4 == (BIGNUM *)0x0) goto LAB_00a202d8;
      }
    }
    if ((param_2 & 1) != 0) {
      if ((param_2 >> 2 & 1) == 0) goto LAB_00a202d8;
      if (*(BIGNUM **)(param_1 + 0x70) != (BIGNUM *)0x0) {
        pBVar4 = BN_dup(*(BIGNUM **)(param_1 + 0x70));
        *(BIGNUM **)&(r->ex_data).dummy = pBVar4;
        if (pBVar4 == (BIGNUM *)0x0) goto LAB_00a202d8;
      }
    }
    iVar1 = CRYPTO_dup_ex_data(7,(CRYPTO_EX_DATA *)&r[1].version,(CRYPTO_EX_DATA *)(param_1 + 0x90))
    ;
    if (iVar1 != 0) {
      return r;
    }
  }
LAB_00a202d8:
  DSA_free(r);
  return (DSA *)0x0;
}

