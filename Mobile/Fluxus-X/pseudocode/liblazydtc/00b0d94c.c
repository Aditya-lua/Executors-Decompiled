/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d94c
 */

int X509_verify_cert(X509_STORE_CTX *ctx)

{
  int iVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  X509_STORE_CTX *ctx_00;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  _func_1855 *p_Var9;
  long lVar10;
  
  if (ctx == (X509_STORE_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_vfy.c",0x10a,"X509_verify_cert");
    ERR_set_error(0xb,0xc0102,0);
    return -1;
  }
  if (*(long *)&ctx->current_method == 0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_vfy.c",0x10e,"X509_verify_cert");
    uVar8 = 0x69;
  }
  else {
    lVar3._0_4_ = ctx->valid;
    lVar3._4_4_ = ctx->last_untrusted;
    if (lVar3 == 0) {
      iVar1 = ossl_x509_add_cert_new(&ctx->valid,*(long *)&ctx->current_method,1);
      if (iVar1 == 0) {
        iVar1 = 0x11;
        goto LAB_00b0da10;
      }
      uVar8 = *(undefined8 *)&ctx->current_method;
      *(undefined4 *)((long)&ctx->cleanup + 4) = 1;
      lVar3 = X509_get0_pubkey(uVar8);
      iVar1 = *(int *)((long)&ctx->crls[1].stack.data + 4);
      if (0 < iVar1) {
        if (lVar3 != 0) {
          if (4 < iVar1) {
            iVar1 = 5;
          }
          iVar2 = EVP_PKEY_get_security_bits();
          if ((int)(&UINT_0077b7f0)[iVar1] <= iVar2) goto LAB_00b0dac0;
        }
        lVar3 = *(long *)&ctx->current_method;
        *(undefined4 *)((long)&ctx->tree + 4) = 0;
        if (lVar3 == 0) {
          uVar8._0_4_ = ctx->valid;
          uVar8._4_4_ = ctx->last_untrusted;
          lVar3 = OPENSSL_sk_value(uVar8,0);
        }
        *(long *)&ctx->error = lVar3;
        ctx->explicit_policy = 0x42;
        iVar1 = (*ctx->verify)((X509_STORE_CTX *)0x0);
        if (iVar1 == 0) {
          return 0;
        }
      }
LAB_00b0dac0:
      lVar3 = *(long *)&(ctx->ex_data).dummy;
      if ((lVar3 == 0) || (iVar1 = OPENSSL_sk_num(*(undefined8 *)(lVar3 + 8)), iVar1 < 1)) {
LAB_00b0dbc4:
        iVar1 = FUN_00b0dcb0(ctx);
joined_r0x00b0dbd0:
        if (0 < iVar1) {
          return iVar1;
        }
      }
      else {
        lVar10 = *(long *)&(ctx->ex_data).dummy;
        lVar3 = *(long *)&ctx->current_method;
        X509_free(*(X509 **)(lVar10 + 0x20));
        *(undefined8 *)(lVar10 + 0x18) = 0;
        *(undefined8 *)(lVar10 + 0x20) = 0;
        *(undefined8 *)(lVar10 + 0x2c) = 0xffffffffffffffff;
        iVar1 = FUN_00b11eb4(ctx,*(undefined8 *)&ctx->current_method,0);
        if ((iVar1 == 0) &&
           (((lVar10 != 0 && ((*(byte *)(lVar10 + 0x28) & 5) != 0)) ||
            (-1 < *(int *)(lVar10 + 0x2c))))) goto LAB_00b0dbc4;
        iVar2 = X509_get_pubkey_parameters((EVP_PKEY *)0x0,*(stack_st_X509 **)&ctx->valid);
        if (iVar2 == 0) {
          iVar1 = -1;
          iVar2 = ctx->explicit_policy;
          goto joined_r0x00b0dca8;
        }
        if (iVar1 < 1) {
          if (iVar1 < 0) {
            *(long *)&ctx->error = lVar3;
            iVar1 = -1;
            *(undefined8 *)((long)&ctx->tree + 4) = 0x1100000000;
            iVar2 = ctx->explicit_policy;
            goto joined_r0x00b0dca8;
          }
          iVar1 = X509_chain_check_suiteb(0,lVar3,0,(ctx->crls->stack).comp);
          if (iVar1 != 0) {
            *(undefined4 *)((long)&ctx->tree + 4) = 0;
            lVar10 = lVar3;
            if (lVar3 == 0) {
              uVar6._0_4_ = ctx->valid;
              uVar6._4_4_ = ctx->last_untrusted;
              lVar10 = OPENSSL_sk_value(uVar6,0);
            }
            *(long *)&ctx->error = lVar10;
            ctx->explicit_policy = iVar1;
            iVar2 = (*ctx->verify)((X509_STORE_CTX *)0x0);
            iVar1 = 0;
            if (iVar2 == 0) goto LAB_00b0dbd4;
          }
          *(undefined4 *)((long)&ctx->tree + 4) = 0;
          if (lVar3 == 0) {
            uVar7._0_4_ = ctx->valid;
            uVar7._4_4_ = ctx->last_untrusted;
            lVar3 = OPENSSL_sk_value(uVar7,0);
          }
          p_Var9 = ctx->verify;
          *(long *)&ctx->error = lVar3;
          ctx->explicit_policy = 0x41;
          ctx_00 = (X509_STORE_CTX *)0x0;
LAB_00b0dc7c:
          iVar1 = (*p_Var9)(ctx_00);
          goto joined_r0x00b0dbd0;
        }
        iVar1 = X509_chain_check_suiteb(0,lVar3,0,(ctx->crls->stack).comp);
        if (iVar1 == 0) {
LAB_00b0db78:
          if ((*(byte *)(lVar10 + 0x38) & 1) == 0) {
            iVar2 = FUN_00b11384(ctx);
            iVar1 = 0;
            if (iVar2 == 0) goto LAB_00b0dbd4;
          }
          p_Var9 = ctx->verify;
          ctx_00 = (X509_STORE_CTX *)0x1;
          *(undefined4 *)((long)&ctx->tree + 4) = 0;
          *(long *)&ctx->error = lVar3;
          goto LAB_00b0dc7c;
        }
        *(undefined4 *)((long)&ctx->tree + 4) = 0;
        lVar5 = lVar3;
        if (lVar3 == 0) {
          uVar4._0_4_ = ctx->valid;
          uVar4._4_4_ = ctx->last_untrusted;
          lVar5 = OPENSSL_sk_value(uVar4,0);
        }
        *(long *)&ctx->error = lVar5;
        ctx->explicit_policy = iVar1;
        iVar2 = (*ctx->verify)((X509_STORE_CTX *)0x0);
        iVar1 = 0;
        if (iVar2 != 0) goto LAB_00b0db78;
      }
LAB_00b0dbd4:
      iVar2 = ctx->explicit_policy;
joined_r0x00b0dca8:
      if (iVar2 == 0) {
        ctx->explicit_policy = 1;
        return iVar1;
      }
      return iVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/x509/x509_vfy.c",0x118,"X509_verify_cert");
    uVar8 = 0xc0101;
  }
  ERR_set_error(0xb,uVar8,0);
  iVar1 = 0x45;
LAB_00b0da10:
  ctx->explicit_policy = iVar1;
  return -1;
}

