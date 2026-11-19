/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af3ac4
 */

int X509_STORE_CTX_print_verify_cb(int param_1,X509_STORE_CTX *param_2)

{
  undefined *puVar1;
  int param4;
  int iVar2;
  uint uVar3;
  BIO_METHOD *type;
  BIO *param0;
  X509_STORE_CTX *pXVar4;
  char *param5;
  undefined8 uVar5;
  long lVar6;
  X509 *pXVar7;
  ulong uVar8;
  char *pcVar9;
  
  if (param_1 != 0) {
    return param_1;
  }
  if (param_2 == (X509_STORE_CTX *)0x0) {
    return 0;
  }
  param4 = X509_STORE_CTX_get_error(param_2);
  type = BIO_s_mem();
  param0 = BIO_new(type);
  pXVar4 = X509_STORE_CTX_get0_parent_ctx(param_2);
  pcVar9 = "Certificate verification";
  if (pXVar4 != (X509_STORE_CTX *)0x0) {
    pcVar9 = "CRL path validation";
  }
  iVar2 = X509_STORE_CTX_get_error_depth(param_2);
  param5 = X509_verify_cert_error_string((long)param4);
  BIO_printf(param0,"%s at depth = %d error = %d (%s)\n",pcVar9,iVar2,param4,param5);
  X509_STORE_CTX_get0_store(param_2);
  uVar5 = X509_STORE_get0_param();
  if (param4 == 0x40) {
    pcVar9 = (char *)X509_VERIFY_PARAM_get1_ip_asc(uVar5);
    if (pcVar9 != (char *)0x0) {
      BIO_printf(param0,"Expected IP address = %s\n",pcVar9);
    }
    CRYPTO_free(pcVar9);
  }
  else {
    if (param4 != 0x3f) {
      if (param4 == 0x3e) {
        BIO_printf(param0,"Expected hostname(s) = ");
        lVar6 = X509_VERIFY_PARAM_get0_host(uVar5,0);
        if (lVar6 != 0) {
          iVar2 = 1;
          do {
            puVar1 = &DAT_002ab32c;
            if (iVar2 != 1) {
              puVar1 = &DAT_002a715d;
            }
            BIO_printf(param0,"%s%s",puVar1,lVar6);
            lVar6 = X509_VERIFY_PARAM_get0_host(uVar5,iVar2);
            iVar2 = iVar2 + 1;
          } while (lVar6 != 0);
        }
        BIO_printf(param0,"\n");
      }
      BIO_printf(param0,"Failure for:\n");
      pXVar7 = X509_STORE_CTX_get_current_cert(param_2);
      uVar8 = ossl_x509_print_ex_brief(param0,pXVar7,0x100);
      switch(param4) {
      case 2:
      case 0x12:
      case 0x13:
      case 0x14:
      case 0x1b:
      case 0x21:
      case 0x46:
        BIO_printf(param0,"Non-trusted certs:\n");
        uVar5 = X509_STORE_CTX_get0_untrusted(param_2);
        FUN_00af3dac(param0,uVar5);
        BIO_printf(param0,"Certs in trust store:\n");
        lVar6 = X509_STORE_CTX_get0_store(param_2);
        if (lVar6 == 0) {
          uVar3 = BIO_printf(param0,"    (no trusted store)\n");
          uVar8 = (ulong)uVar3;
        }
        else {
          uVar5 = X509_STORE_get1_all_certs();
          FUN_00af3dac(param0,uVar5);
          uVar8 = OPENSSL_sk_pop_free(uVar5,X509_free);
        }
      }
      goto switchD_00af3c44_caseD_3;
    }
    pcVar9 = (char *)X509_VERIFY_PARAM_get0_email(uVar5);
    if (pcVar9 != (char *)0x0) {
      BIO_printf(param0,"Expected email address = %s\n",pcVar9);
    }
  }
  BIO_printf(param0,"Failure for:\n");
  pXVar7 = X509_STORE_CTX_get_current_cert(param_2);
  uVar8 = ossl_x509_print_ex_brief(param0,pXVar7,0x100);
switchD_00af3c44_caseD_3:
  ERR_new(uVar8);
  ERR_set_debug("crypto/x509/t_x509.c",0x209,"X509_STORE_CTX_print_verify_cb");
  ERR_set_error(0xb,0x8b,0);
  ERR_add_error_mem_bio(&DAT_002c4dae,param0);
  BIO_free(param0);
  return 0;
}

