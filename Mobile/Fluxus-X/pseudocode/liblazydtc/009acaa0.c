/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009acaa0
 */

uint ssl_verify_cert_chain(void *param_1,stack_st_X509 *param_2)

{
  char *name;
  int iVar1;
  undefined4 uVar2;
  int iVar3;
  uint uVar4;
  X509_STORE_CTX *ctx;
  X509 *x509;
  X509_VERIFY_PARAM *to;
  long lVar5;
  stack_st_X509 *psVar6;
  undefined8 *puVar7;
  code *pcVar8;
  X509_STORE *store;
  
  if ((param_2 == (stack_st_X509 *)0x0) || (iVar1 = OPENSSL_sk_num(param_2), iVar1 == 0)) {
    return 0;
  }
  store = *(X509_STORE **)(*(long *)((long)param_1 + 0x898) + 0x1d0);
  puVar7 = *(undefined8 **)((long)param_1 + 0x9a8);
  if (store == (X509_STORE *)0x0) {
    store = (X509_STORE *)puVar7[5];
  }
  ctx = (X509_STORE_CTX *)X509_STORE_CTX_new_ex(*puVar7,puVar7[0x88]);
  if (ctx == (X509_STORE_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_cert.c",400,"ssl_verify_cert_chain");
    ERR_set_error(0x14,0xc0100,0);
    return 0;
  }
  x509 = (X509 *)OPENSSL_sk_value(param_2,0);
  iVar1 = X509_STORE_CTX_init(ctx,store,x509,param_2);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_cert.c",0x196,"ssl_verify_cert_chain");
    ERR_set_error(0x14,0x8000b,0);
  }
  else {
    to = X509_STORE_CTX_get0_param(ctx);
    uVar2 = SSL_get_security_level(param_1);
    X509_VERIFY_PARAM_set_auth_level(to,uVar2);
    X509_STORE_CTX_set_flags
              (ctx,(ulong)*(uint *)(*(long *)((long)param_1 + 0x898) + 0x1c) & 0x30000);
    iVar3 = CRYPTO_THREAD_run_once(&DAT_00d218b0,FUN_009abcb4);
    iVar1 = -1;
    if ((iVar3 != 0) && (DAT_00d218b4 != 0)) {
      iVar1 = DAT_00cc8490;
    }
    iVar1 = X509_STORE_CTX_set_ex_data(ctx,iVar1,param_1);
    if (iVar1 != 0) {
      iVar1 = OPENSSL_sk_num(*(undefined8 *)((long)param_1 + 0x4e8));
      if (0 < iVar1) {
        X509_STORE_CTX_set0_dane(ctx,(long)param_1 + 0x4e0);
      }
      name = "ssl_server";
      if (*(int *)((long)param_1 + 0x38) != 0) {
        name = "ssl_client";
      }
      X509_STORE_CTX_set_default(ctx,name);
      X509_VERIFY_PARAM_set1(to,*(X509_VERIFY_PARAM **)((long)param_1 + 0x4d8));
      if (*(verify_cb **)((long)param_1 + 0x970) != (verify_cb *)0x0) {
        X509_STORE_CTX_set_verify_cb(ctx,*(verify_cb **)((long)param_1 + 0x970));
      }
      pcVar8 = *(code **)(*(long *)((long)param_1 + 0x9a8) + 0xa8);
      if (pcVar8 == (code *)0x0) {
        uVar4 = X509_verify_cert(ctx);
        uVar4 = uVar4 & ((int)uVar4 >> 0x1f ^ 0xffffffffU);
      }
      else {
        uVar4 = (*pcVar8)(ctx,*(undefined8 *)(*(long *)((long)param_1 + 0x9a8) + 0xb0));
      }
      iVar1 = X509_STORE_CTX_get_error(ctx);
      *(long *)((long)param_1 + 0x9b8) = (long)iVar1;
      OPENSSL_sk_pop_free(*(undefined8 *)((long)param_1 + 0x9b0),X509_free);
      *(undefined8 *)((long)param_1 + 0x9b0) = 0;
      lVar5 = X509_STORE_CTX_get0_chain(ctx);
      if (lVar5 != 0) {
        psVar6 = X509_STORE_CTX_get1_chain(ctx);
        *(stack_st_X509 **)((long)param_1 + 0x9b0) = psVar6;
        if (psVar6 == (stack_st_X509 *)0x0) {
          ERR_new();
          ERR_set_debug("ssl/ssl_cert.c",0x1ca,"ssl_verify_cert_chain");
          ERR_set_error(0x14,0xc0100,0);
          uVar4 = 0;
        }
      }
      X509_VERIFY_PARAM_move_peername(*(undefined8 *)((long)param_1 + 0x4d8),to);
      goto LAB_009acd0c;
    }
  }
  uVar4 = 0;
LAB_009acd0c:
  X509_STORE_CTX_free(ctx);
  return uVar4;
}

