/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0f78c
 */

int X509_STORE_CTX_init(X509_STORE_CTX *ctx,X509_STORE *store,X509 *x509,stack_st_X509 *chain)

{
  X509_STORE_CTX **ad;
  _func_1846 *p_Var1;
  _func_1845 *p_Var2;
  _func_1844 *p_Var3;
  _func_1843 *p_Var4;
  _func_1858 *p_Var5;
  _func_1860 *p_Var6;
  _func_1850 *p_Var7;
  _func_1862 *p_Var8;
  _func_1852 *p_Var9;
  int iVar10;
  X509_VERIFY_PARAM *pXVar11;
  X509_PURPOSE *xp;
  undefined8 uVar12;
  X509_NAME *extraout_x1;
  X509_NAME *extraout_x1_00;
  X509_NAME *extraout_x1_01;
  X509_NAME *extraout_x1_02;
  X509_NAME *nm;
  undefined8 uVar13;
  long lVar14;
  code *pcVar15;
  _func_1865 *p_Var16;
  long lVar17;
  
  if (ctx == (X509_STORE_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_vfy.c",0x915,"X509_STORE_CTX_init");
    ERR_set_error(0xb,0xc0102,0);
    return 0;
  }
  if (ctx->lookup_crls != (_func_1865 *)0x0) {
    (*ctx->lookup_crls)(ctx,(X509_NAME *)store);
    ctx->lookup_crls = (_func_1865 *)0x0;
  }
  if ((X509_VERIFY_PARAM *)ctx->crls != (X509_VERIFY_PARAM *)0x0) {
    lVar14._0_4_ = ctx->current_crl_score;
    lVar14._4_4_ = ctx->current_reasons;
    if (lVar14 == 0) {
      X509_VERIFY_PARAM_free((X509_VERIFY_PARAM *)ctx->crls);
    }
    ctx->crls = (stack_st_X509_CRL *)0x0;
  }
  X509_policy_tree_free((X509_POLICY_TREE *)ctx->chain);
  ctx->chain = (stack_st_X509 *)0x0;
  uVar13._0_4_ = ctx->valid;
  uVar13._4_4_ = ctx->last_untrusted;
  OPENSSL_sk_pop_free(uVar13,X509_free);
  ad = &ctx->parent;
  ctx->valid = 0;
  ctx->last_untrusted = 0;
  CRYPTO_free_ex_data(5,ctx,(CRYPTO_EX_DATA *)ad);
  ctx->ctx = store;
  *(X509 **)&ctx->current_method = x509;
  ctx->cert = (X509 *)chain;
  ctx->untrusted = (stack_st_X509 *)0x0;
  ctx->param = (X509_VERIFY_PARAM *)0x0;
  ctx->chain = (stack_st_X509 *)0x0;
  ctx->tree = (X509_POLICY_TREE *)0x0;
  ctx->cleanup = (_func_1866 *)0x0;
  ctx->valid = 0;
  ctx->last_untrusted = 0;
  ctx->explicit_policy = 0;
  ctx->current_issuer = (X509 *)0x0;
  ctx->current_crl = (X509_CRL *)0x0;
  *(undefined8 *)&ctx->error = 0;
  ctx->current_cert = (X509 *)0x0;
  ctx->current_crl_score = 0;
  ctx->current_reasons = 0;
  ctx->parent = (X509_STORE_CTX *)0x0;
  (ctx->ex_data).sk = (stack_st_void *)0x0;
  *(undefined8 *)&(ctx->ex_data).dummy = 0;
  *(undefined4 *)&ctx[1].ctx = 0;
  if (store == (X509_STORE *)0x0) {
    ctx->lookup_crls = (_func_1865 *)0x0;
    ctx->verify_cb = X509_STORE_CTX_get1_issuer;
    ctx->get_issuer = FUN_00b0fb7c;
    ctx->other_ctx = FUN_00b0fba0;
    ctx->verify = (_func_1855 *)&DAT_00b0fb9c;
    ctx->get_crl = (_func_1860 *)&LAB_00b10098;
    ctx->check_crl = (_func_1861 *)&LAB_00b103d4;
    ctx->check_issued = (_func_1858 *)&LAB_00b0fddc;
    ctx->check_revocation = (_func_1859 *)0x0;
    ctx->cert_crl = FUN_00b1047c;
    ctx->check_policy = X509_STORE_CTX_get1_certs;
LAB_00b0f9d4:
    pcVar15 = X509_STORE_CTX_get1_crls;
  }
  else {
    ctx->lookup_crls = (_func_1865 *)(store->ex_data).sk;
    p_Var1 = FUN_00b0fb7c;
    if (store->check_issued != (_func_1846 *)0x0) {
      p_Var1 = store->check_issued;
    }
    ctx->get_issuer = (_func_1857 *)p_Var1;
    p_Var2 = X509_STORE_CTX_get1_issuer;
    if (store->get_issuer != (_func_1845 *)0x0) {
      p_Var2 = store->get_issuer;
    }
    ctx->verify_cb = (_func_1856 *)p_Var2;
    p_Var3 = (_func_1844 *)&DAT_00b0fb9c;
    if (store->verify_cb != (_func_1844 *)0x0) {
      p_Var3 = store->verify_cb;
    }
    ctx->verify = (_func_1855 *)p_Var3;
    p_Var4 = FUN_00b0fba0;
    if (store->verify != (_func_1843 *)0x0) {
      p_Var4 = store->verify;
    }
    ctx->other_ctx = p_Var4;
    p_Var5 = (_func_1858 *)&LAB_00b0fddc;
    if ((_func_1858 *)store->check_revocation != (_func_1858 *)0x0) {
      p_Var5 = (_func_1858 *)store->check_revocation;
    }
    ctx->check_issued = p_Var5;
    ctx->check_revocation = (_func_1859 *)store->get_crl;
    p_Var6 = (_func_1860 *)&LAB_00b10098;
    if ((_func_1860 *)store->check_crl != (_func_1860 *)0x0) {
      p_Var6 = (_func_1860 *)store->check_crl;
    }
    ctx->get_crl = p_Var6;
    p_Var7 = (_func_1850 *)&LAB_00b103d4;
    if (store->cert_crl != (_func_1850 *)0x0) {
      p_Var7 = store->cert_crl;
    }
    ctx->check_crl = (_func_1861 *)p_Var7;
    p_Var8 = FUN_00b1047c;
    if ((_func_1862 *)store->lookup_certs != (_func_1862 *)0x0) {
      p_Var8 = (_func_1862 *)store->lookup_certs;
    }
    ctx->cert_crl = p_Var8;
    p_Var9 = X509_STORE_CTX_get1_certs;
    if (store->lookup_crls != (_func_1852 *)0x0) {
      p_Var9 = store->lookup_crls;
    }
    ctx->check_policy = (_func_1863 *)p_Var9;
    pcVar15 = store->cleanup;
    if (pcVar15 == (_func_1864 *)0x0) goto LAB_00b0f9d4;
  }
  ctx->lookup_certs = pcVar15;
  pXVar11 = X509_VERIFY_PARAM_new();
  ctx->crls = (stack_st_X509_CRL *)pXVar11;
  if (pXVar11 == (X509_VERIFY_PARAM *)0x0) {
    ERR_new();
    uVar13 = 0x970;
LAB_00b0fa18:
    ERR_set_debug("crypto/x509/x509_vfy.c",uVar13,"X509_STORE_CTX_init");
    ERR_set_error(0xb,0xc0100,0);
    p_Var16 = ctx->lookup_crls;
    nm = extraout_x1_00;
  }
  else {
    if (store == (X509_STORE *)0x0) {
      *(uint *)&pXVar11->inh_flags = (uint)pXVar11->inh_flags | 0x11;
LAB_00b0fa4c:
      pXVar11 = X509_VERIFY_PARAM_lookup("default");
      if (pXVar11 == (X509_VERIFY_PARAM *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/x509/x509_vfy.c",0xa46,"X509_STORE_CTX_set_default");
        ERR_set_error(0xb,0x79,"name=%s","default");
        nm = extraout_x1_02;
      }
      else {
        iVar10 = X509_VERIFY_PARAM_inherit((X509_VERIFY_PARAM *)ctx->crls,pXVar11);
        nm = extraout_x1_01;
        if (iVar10 != 0) {
          if (*(int *)&ctx->crls[1].stack.field_0x4 == 0) {
            iVar10 = X509_PURPOSE_get_by_id(ctx->crls[1].stack.num);
            xp = X509_PURPOSE_get0(iVar10);
            if (xp != (X509_PURPOSE *)0x0) {
              iVar10 = X509_PURPOSE_get_trust(xp);
              *(int *)&ctx->crls[1].stack.field_0x4 = iVar10;
            }
          }
          iVar10 = CRYPTO_new_ex_data(5,ctx,(CRYPTO_EX_DATA *)ad);
          if (iVar10 != 0) {
            return 1;
          }
          ERR_new();
          uVar13 = 0x98c;
          goto LAB_00b0fa18;
        }
      }
    }
    else {
      iVar10 = X509_VERIFY_PARAM_inherit(pXVar11,store->param);
      nm = extraout_x1;
      if (iVar10 != 0) goto LAB_00b0fa4c;
    }
    p_Var16 = ctx->lookup_crls;
  }
  if (p_Var16 != (_func_1865 *)0x0) {
    (*p_Var16)(ctx,nm);
    ctx->lookup_crls = (_func_1865 *)0x0;
  }
  if ((X509_VERIFY_PARAM *)ctx->crls != (X509_VERIFY_PARAM *)0x0) {
    lVar17._0_4_ = ctx->current_crl_score;
    lVar17._4_4_ = ctx->current_reasons;
    if (lVar17 == 0) {
      X509_VERIFY_PARAM_free((X509_VERIFY_PARAM *)ctx->crls);
    }
    ctx->crls = (stack_st_X509_CRL *)0x0;
  }
  X509_policy_tree_free((X509_POLICY_TREE *)ctx->chain);
  ctx->chain = (stack_st_X509 *)0x0;
  uVar12._0_4_ = ctx->valid;
  uVar12._4_4_ = ctx->last_untrusted;
  OPENSSL_sk_pop_free(uVar12,X509_free);
  ctx->valid = 0;
  ctx->last_untrusted = 0;
  CRYPTO_free_ex_data(5,ctx,(CRYPTO_EX_DATA *)ad);
  *ad = (X509_STORE_CTX *)0x0;
  (ctx->ex_data).sk = (stack_st_void *)0x0;
  return 0;
}

