/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8398
 */

int ssl_validate_ct(SSL *param_1)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  SSL_SESSION *s;
  undefined8 uVar4;
  undefined8 *puVar5;
  long lVar6;
  
  if (*(long *)&param_1[3].sid_ctx_length != 0) {
    lVar6 = *(long *)(*(long *)&param_1[3].sid_ctx_length + 0x2b8);
    if (lVar6 == 0) {
      return 1;
    }
    if (*(long *)&param_1[4].hit == 0) {
      return 1;
    }
    if ((((*(long *)&param_1[3].references == 0) &&
         (param_1[3].client_CA != (stack_st_X509_NAME *)0x0)) &&
        (iVar1 = OPENSSL_sk_num(), 1 < iVar1)) &&
       (((iVar1 = OPENSSL_sk_num(param_1[1].tlsext_ellipticcurvelist), iVar1 < 1 ||
         ((byte *)param_1[1].tlsext_opaque_prf_input_len == (byte *)0x0)) ||
        ((*(byte *)param_1[1].tlsext_opaque_prf_input_len & 0xfe) != 2)))) {
      puVar5 = *(undefined8 **)&param_1[3].ex_data.dummy;
      lVar2 = CT_POLICY_EVAL_CTX_new_ex(*puVar5,puVar5[0x88]);
      if (lVar2 == 0) {
        ERR_new();
        ERR_set_debug("ssl/ssl_lib.c",0x148f,"ssl_validate_ct");
        uVar3 = 0x50;
        uVar4 = 0xc0100;
      }
      else {
        uVar3 = OPENSSL_sk_value(param_1[3].client_CA,1);
        CT_POLICY_EVAL_CTX_set1_cert(lVar2,lVar6);
        CT_POLICY_EVAL_CTX_set1_issuer(lVar2,uVar3);
        CT_POLICY_EVAL_CTX_set_shared_CTLOG_STORE
                  (lVar2,*(undefined8 *)(*(long *)&param_1[3].ex_data.dummy + 0x1c8));
        s = SSL_get_session(param_1);
        lVar6 = SSL_SESSION_get_time(s);
        CT_POLICY_EVAL_CTX_set_time(lVar2,lVar6 * 1000);
        uVar3 = SSL_get0_peer_scts(param_1);
        iVar1 = SCT_LIST_validate(uVar3,lVar2);
        if (iVar1 < 0) {
          ERR_new();
          ERR_set_debug("ssl/ssl_lib.c",0x14ab,"ssl_validate_ct");
          uVar3 = 0x28;
          uVar4 = 0xd0;
        }
        else {
          iVar1 = (**(code **)&param_1[4].hit)(lVar2,uVar3,param_1[4].param);
          if (0 < iVar1) {
            CT_POLICY_EVAL_CTX_free(lVar2);
            return iVar1;
          }
          ERR_new();
          ERR_set_debug("ssl/ssl_lib.c",0x14b3,"ssl_validate_ct");
          uVar3 = 0x28;
          uVar4 = 0xea;
        }
      }
      ossl_statem_fatal(param_1,uVar3,uVar4,0);
      CT_POLICY_EVAL_CTX_free(lVar2);
      *(undefined8 *)&param_1[3].references = 0x47;
      return 0;
    }
  }
  return 1;
}

