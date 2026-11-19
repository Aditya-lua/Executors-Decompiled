/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bc1dc
 */

int FUN_009bc1dc(SSL_CTX *param_1,SSL *param_2,void *param_3)

{
  _func_3092 **pp_Var1;
  _func_3091 **pp_Var2;
  int iVar3;
  int iVar4;
  BIO_METHOD *type;
  BIO *bp;
  long lVar5;
  X509 *pXVar6;
  ulong uVar7;
  undefined4 uVar8;
  _func_3092 *u;
  _func_3091 *cb;
  SSL_CTX *pSVar9;
  X509 *local_60;
  X509 *local_58;
  
  local_58 = (X509 *)0x0;
  if (param_2 == (SSL *)0x0) {
    pSVar9 = param_1;
    if (param_1 == (SSL_CTX *)0x0) {
      return 0;
    }
  }
  else {
    pSVar9 = *(SSL_CTX **)&param_2[3].ex_data.dummy;
  }
  ERR_clear_error();
  pp_Var1 = &param_1->app_gen_cookie_cb;
  pp_Var2 = &param_1->client_cert_cb;
  if (param_1 == (SSL_CTX *)0x0) {
    pp_Var1 = &param_2[10].tlsext_opaque_prf_input;
    pp_Var2 = (_func_3091 **)&param_2[10].tlsext_ellipticcurvelist;
  }
  u = *pp_Var1;
  cb = *pp_Var2;
  type = BIO_s_file();
  bp = BIO_new(type);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0x1bb,"use_certificate_chain_file");
    uVar8 = 0x80007;
LAB_009bc344:
    ERR_set_error(0x14,uVar8,0);
  }
  else {
    lVar5 = BIO_ctrl(bp,0x6c,3,param_3);
    if ((int)lVar5 < 1) {
      ERR_new();
      ERR_set_debug("ssl/ssl_rsa.c",0x1c0,"use_certificate_chain_file");
      uVar8 = 0x80002;
      goto LAB_009bc344;
    }
    local_58 = (X509 *)X509_new_ex(pSVar9->method,pSVar9[1].tlsext_ticket_key_cb);
    if (local_58 == (X509 *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_rsa.c",0x1c6,"use_certificate_chain_file");
      uVar8 = 0xc0100;
      goto LAB_009bc344;
    }
    pXVar6 = PEM_read_bio_X509_AUX(bp,&local_58,cb,u);
    if (pXVar6 == (X509 *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_rsa.c",0x1cb,"use_certificate_chain_file");
      uVar8 = 0x80009;
      goto LAB_009bc344;
    }
    if (param_1 == (SSL_CTX *)0x0) {
      iVar3 = SSL_use_certificate(param_2,local_58);
    }
    else {
      iVar3 = SSL_CTX_use_certificate(param_1,local_58);
    }
    uVar7 = ERR_peek_error();
    iVar4 = 0;
    if ((iVar3 == 0) || (uVar7 != 0)) goto LAB_009bc350;
    if (param_1 == (SSL_CTX *)0x0) {
      lVar5 = SSL_ctrl(param_2,0x58,0,(void *)0x0);
      iVar4 = (int)lVar5;
    }
    else {
      lVar5 = SSL_CTX_ctrl(param_1,0x58,0,(void *)0x0);
      iVar4 = (int)lVar5;
    }
    if (iVar4 != 0) {
LAB_009bc400:
      do {
        local_60 = (X509 *)X509_new_ex(pSVar9->method,pSVar9[1].tlsext_ticket_key_cb);
        if (local_60 == (X509 *)0x0) {
          ERR_new();
          ERR_set_debug("ssl/ssl_rsa.c",0x1ed,"use_certificate_chain_file");
          ERR_set_error(0x14,0xc0100,0);
LAB_009bc4dc:
          iVar4 = iVar3;
          goto LAB_009bc350;
        }
        pXVar6 = PEM_read_bio_X509(bp,&local_60,cb,u);
        if (pXVar6 == (X509 *)0x0) {
          X509_free(local_60);
          uVar7 = ERR_peek_last_error();
          iVar4 = 0;
          if (((uVar7 & 0xff800000) == 0x4800000) &&
             (iVar4 = 0, (((int)(uint)uVar7 >> 0x1f & 0x7f800000U | 0x7fffff) & (uint)uVar7) == 0x6c
             )) {
            ERR_clear_error();
            goto LAB_009bc4dc;
          }
          goto LAB_009bc350;
        }
        if (param_1 == (SSL_CTX *)0x0) {
          lVar5 = SSL_ctrl(param_2,0x59,0,local_60);
          if ((int)lVar5 == 0) break;
          goto LAB_009bc400;
        }
        lVar5 = SSL_CTX_ctrl(param_1,0x59,0,local_60);
      } while ((int)lVar5 != 0);
      X509_free(local_60);
    }
  }
  iVar4 = 0;
LAB_009bc350:
  X509_free(local_58);
  BIO_free(bp);
  return iVar4;
}

