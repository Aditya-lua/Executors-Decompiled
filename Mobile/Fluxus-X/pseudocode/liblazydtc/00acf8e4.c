/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acf8e4
 */

RSA * ossl_rsa_dup(RSA *param_1,ulong param_2)

{
  undefined4 uVar1;
  int iVar2;
  RSA_METHOD *pRVar3;
  RSA_METHOD *pRVar4;
  RSA *r;
  BIGNUM *pBVar5;
  BN_MONT_CTX *pBVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  ulong *puVar9;
  int iVar10;
  
  if (param_1->n != (BIGNUM *)0x0) {
    return (RSA *)0x0;
  }
  pRVar3 = RSA_get_method(param_1);
  pRVar4 = (RSA_METHOD *)RSA_PKCS1_OpenSSL();
  if (pRVar3 != pRVar4) {
    return (RSA *)0x0;
  }
  r = (RSA *)ossl_rsa_new_with_ctx(param_1->version);
  if (r == (RSA *)0x0) {
    return (RSA *)0x0;
  }
  if ((param_2 & 3) != 0) {
    if (param_1->e != (BIGNUM *)0x0) {
      pBVar5 = BN_dup(param_1->e);
      r->e = pBVar5;
      if (pBVar5 == (BIGNUM *)0x0) goto LAB_00acfb10;
    }
    if (param_1->d != (BIGNUM *)0x0) {
      pBVar5 = BN_dup(param_1->d);
      r->d = pBVar5;
      if (pBVar5 == (BIGNUM *)0x0) goto LAB_00acfb10;
    }
  }
  if ((param_2 & 1) != 0) {
    if (param_1->p != (BIGNUM *)0x0) {
      pBVar5 = BN_dup(param_1->p);
      r->p = pBVar5;
      if (pBVar5 == (BIGNUM *)0x0) goto LAB_00acfb10;
    }
    if (param_1->q != (BIGNUM *)0x0) {
      pBVar5 = BN_dup(param_1->q);
      r->q = pBVar5;
      if (pBVar5 == (BIGNUM *)0x0) goto LAB_00acfb10;
    }
    if (param_1->dmp1 != (BIGNUM *)0x0) {
      pBVar5 = BN_dup(param_1->dmp1);
      r->dmp1 = pBVar5;
      if (pBVar5 == (BIGNUM *)0x0) goto LAB_00acfb10;
    }
    if (param_1->dmq1 != (BIGNUM *)0x0) {
      pBVar5 = BN_dup(param_1->dmq1);
      r->dmq1 = pBVar5;
      if (pBVar5 == (BIGNUM *)0x0) goto LAB_00acfb10;
    }
    if (param_1->iqmp != (BIGNUM *)0x0) {
      pBVar5 = BN_dup(param_1->iqmp);
      r->iqmp = pBVar5;
      if (pBVar5 == (BIGNUM *)0x0) goto LAB_00acfb10;
    }
    pBVar5 = (BIGNUM *)(param_1->ex_data).sk;
    if (pBVar5 != (BIGNUM *)0x0) {
      pBVar5 = BN_dup(pBVar5);
      (r->ex_data).sk = (stack_st_void *)pBVar5;
      if (pBVar5 == (BIGNUM *)0x0) goto LAB_00acfb10;
    }
  }
  *(undefined4 *)&r->meth = *(undefined4 *)&param_1->meth;
  *(undefined4 *)((long)&r->mt_blinding + 4) = *(undefined4 *)((long)&param_1->mt_blinding + 4);
  *(undefined4 *)&r->_method_mod_n = *(undefined4 *)&param_1->_method_mod_n;
  iVar2 = param_1->flags;
  iVar10 = (param_1->ex_data).dummy;
  uVar1 = *(undefined4 *)&(param_1->ex_data).field_0xc;
  r->references = param_1->references;
  r->flags = iVar2;
  (r->ex_data).dummy = iVar10;
  *(undefined4 *)&(r->ex_data).field_0xc = uVar1;
  if (((param_2 & 1) != 0) && (iVar2 = OPENSSL_sk_num(param_1->_method_mod_q), 0 < iVar2)) {
    pBVar6 = (BN_MONT_CTX *)OPENSSL_sk_new_reserve(0,iVar2);
    r->_method_mod_q = pBVar6;
    if (pBVar6 == (BN_MONT_CTX *)0x0) goto LAB_00acfb10;
    iVar10 = 0;
    do {
      puVar7 = (undefined8 *)CRYPTO_zalloc(0x28,"crypto/rsa/rsa_backend.c",0x188);
      if (puVar7 == (undefined8 *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/rsa/rsa_backend.c",0x189,"ossl_rsa_dup");
        ERR_set_error(4,0xc0100,0);
        goto LAB_00acfb10;
      }
      OPENSSL_sk_push(r->_method_mod_q,puVar7);
      puVar8 = (undefined8 *)OPENSSL_sk_value(param_1->_method_mod_q,iVar10);
      if ((BIGNUM *)*puVar8 != (BIGNUM *)0x0) {
        pBVar5 = BN_dup((BIGNUM *)*puVar8);
        *puVar7 = pBVar5;
        if (pBVar5 == (BIGNUM *)0x0) goto LAB_00acfb10;
      }
      if ((BIGNUM *)puVar8[1] != (BIGNUM *)0x0) {
        pBVar5 = BN_dup((BIGNUM *)puVar8[1]);
        puVar7[1] = pBVar5;
        if (pBVar5 == (BIGNUM *)0x0) goto LAB_00acfb10;
      }
      if ((BIGNUM *)puVar8[2] != (BIGNUM *)0x0) {
        pBVar5 = BN_dup((BIGNUM *)puVar8[2]);
        puVar7[2] = pBVar5;
        if (pBVar5 == (BIGNUM *)0x0) goto LAB_00acfb10;
      }
      iVar10 = iVar10 + 1;
    } while (iVar10 < iVar2);
    iVar2 = ossl_rsa_multip_calc_product(r);
    if (iVar2 == 0) goto LAB_00acfb10;
  }
  if (param_1->_method_mod_p != (BN_MONT_CTX *)0x0) {
    pBVar6 = (BN_MONT_CTX *)RSA_PSS_PARAMS_dup();
    r->_method_mod_p = pBVar6;
    if (((param_1->_method_mod_p->RR).d != (ulong *)0x0) && ((pBVar6->RR).d == (ulong *)0x0)) {
      puVar9 = (ulong *)ossl_x509_algor_mgf1_decode();
      (r->_method_mod_p->N).d = puVar9;
      if (puVar9 == (ulong *)0x0) goto LAB_00acfb10;
    }
  }
  iVar2 = CRYPTO_dup_ex_data(9,(CRYPTO_EX_DATA *)&r->bignum_data,
                             (CRYPTO_EX_DATA *)&param_1->bignum_data);
  if (iVar2 != 0) {
    return r;
  }
LAB_00acfb10:
  RSA_free(r);
  return (RSA *)0x0;
}

