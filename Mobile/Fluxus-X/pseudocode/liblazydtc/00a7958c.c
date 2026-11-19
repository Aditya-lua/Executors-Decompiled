/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7958c
 */

int DSA_generate_key(DSA *a)

{
  int iVar1;
  BN_CTX *ctx;
  BIGNUM *pBVar2;
  code *UNRECOVERED_JUMPTABLE;
  BIGNUM *a_00;
  BIGNUM *r;
  
  UNRECOVERED_JUMPTABLE = *(code **)&a[1].p[3].neg;
  if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00a795c4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    iVar1 = (*UNRECOVERED_JUMPTABLE)(a);
    return iVar1;
  }
  ctx = (BN_CTX *)BN_CTX_new_ex(a[1].pub_key);
  if (ctx == (BN_CTX *)0x0) {
    iVar1 = 0;
    r = (BIGNUM *)0x0;
    a_00 = (BIGNUM *)0x0;
    goto LAB_00a796b4;
  }
  a_00 = *(BIGNUM **)&(a->ex_data).dummy;
  if ((a_00 != (BIGNUM *)0x0) || (a_00 = (BIGNUM *)BN_secure_new(), a_00 != (BIGNUM *)0x0)) {
    iVar1 = ossl_ffc_params_simple_validate(a[1].pub_key,&a->version,0,0);
    if (iVar1 != 0) {
      iVar1 = BN_num_bits(*(BIGNUM **)&a->write_params);
      iVar1 = ossl_ffc_generate_private_key(ctx,&a->version,iVar1,0x50,a_00);
      if (iVar1 != 0) {
        r = (BIGNUM *)(a->ex_data).sk;
        if ((r != (BIGNUM *)0x0) || (r = BN_new(), r != (BIGNUM *)0x0)) {
          pBVar2 = BN_new();
          iVar1 = 0;
          if (pBVar2 == (BIGNUM *)0x0) goto LAB_00a796b4;
          BN_with_flags(pBVar2,a_00,4);
          iVar1 = BN_mod_exp(r,a->p,pBVar2,(BIGNUM *)a->version,ctx);
          BN_clear_free(pBVar2);
          if (iVar1 != 0) {
            pBVar2 = a[1].priv_key;
            iVar1 = 1;
            (a->ex_data).sk = (stack_st_void *)r;
            *(BIGNUM **)&(a->ex_data).dummy = a_00;
            a[1].priv_key = (BIGNUM *)((long)&pBVar2->d + 1);
            goto LAB_00a796b4;
          }
        }
        iVar1 = 0;
        goto LAB_00a796b4;
      }
    }
  }
  iVar1 = 0;
  r = (BIGNUM *)0x0;
LAB_00a796b4:
  if (r != (BIGNUM *)(a->ex_data).sk) {
    BN_free(r);
  }
  if (a_00 != *(BIGNUM **)&(a->ex_data).dummy) {
    BN_free(a_00);
  }
  BN_CTX_free(ctx);
  return iVar1;
}

