/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b10944
 */

undefined8
X509_build_chain(X509 *param_1,X509_VERIFY_PARAM *param_2,X509_STORE *param_3,int param_4,
                undefined8 param_5,undefined8 param_6)

{
  X509_VERIFY_PARAM *chain;
  int iVar1;
  X509_STORE_CTX *ctx;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined4 uVar4;
  undefined8 local_48;
  
  local_48 = 0;
  if (param_1 == (X509 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_vfy.c",0xd09,"X509_build_chain");
    ERR_set_error(0xb,0xc0102,0);
    uVar2 = 0;
  }
  else {
    ctx = (X509_STORE_CTX *)X509_STORE_CTX_new_ex(param_5,param_6);
    uVar2 = 0;
    if (ctx != (X509_STORE_CTX *)0x0) {
      chain = param_2;
      if (param_3 == (X509_STORE *)0x0) {
        chain = (X509_VERIFY_PARAM *)0x0;
      }
      iVar1 = X509_STORE_CTX_init(ctx,param_3,param_1,(stack_st_X509 *)chain);
      if (iVar1 != 0) {
        if (param_3 == (X509_STORE *)0x0) {
          ctx->param = param_2;
          ctx->verify_cb = (_func_1856 *)&LAB_00b10714;
          ctx->check_policy = (_func_1863 *)&LAB_00b10758;
        }
        iVar1 = ossl_x509_add_cert_new(&ctx->valid,param_1,1);
        if (iVar1 == 0) {
          ctx->explicit_policy = 0x11;
        }
        else {
          *(undefined4 *)((long)&ctx->cleanup + 4) = 1;
          iVar1 = FUN_00b10a8c(ctx);
          if ((param_3 == (X509_STORE *)0x0) || (iVar1 != 0)) {
            uVar2._0_4_ = ctx->valid;
            uVar2._4_4_ = ctx->last_untrusted;
            iVar1 = OPENSSL_sk_num(uVar2);
            uVar3._0_4_ = ctx->valid;
            uVar3._4_4_ = ctx->last_untrusted;
            uVar4 = 9;
            if (iVar1 < 2 || param_4 != 0) {
              uVar4 = 1;
            }
            iVar1 = ossl_x509_add_certs_new(&local_48,uVar3,uVar4);
            if (iVar1 == 0) {
              OPENSSL_sk_free(local_48);
              local_48 = 0;
            }
          }
        }
      }
      X509_STORE_CTX_free(ctx);
      uVar2 = local_48;
    }
  }
  return uVar2;
}

