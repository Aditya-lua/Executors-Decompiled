/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af2458
 */

ulong X509_load_cert_crl_file_ex
                (long param_1,char *param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5
                )

{
  undefined4 uVar1;
  int iVar2;
  int iVar3;
  BIO *a;
  long lVar4;
  undefined8 *puVar5;
  ulong uVar6;
  uint uVar7;
  
  if ((int)param_3 != 1) {
    uVar6 = X509_load_cert_file_ex(param_1,param_2,param_3,param_4,param_5);
    return uVar6;
  }
  a = BIO_new_file(param_2,"r");
  if (a == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/by_file.c",0xe4,"X509_load_cert_crl_file_ex");
    uVar1 = 0x80002;
  }
  else {
    lVar4 = PEM_X509_INFO_read_bio_ex(a,0,0,&DAT_002ab32c,param_4,param_5);
    iVar2 = BIO_free(a);
    if (lVar4 != 0) {
      iVar2 = OPENSSL_sk_num(lVar4);
      if (iVar2 < 1) {
LAB_00af2538:
        ERR_new();
        ERR_set_debug("crypto/x509/by_file.c",0xfb,"X509_load_cert_crl_file_ex");
        ERR_set_error(0xb,0x88,0);
        uVar7 = 0;
      }
      else {
        uVar7 = 0;
        iVar2 = 0;
        do {
          puVar5 = (undefined8 *)OPENSSL_sk_value(lVar4,iVar2);
          if ((X509 *)*puVar5 != (X509 *)0x0) {
            iVar3 = X509_STORE_add_cert(*(X509_STORE **)(param_1 + 0x18),(X509 *)*puVar5);
            if (iVar3 == 0) goto LAB_00af2568;
            uVar7 = uVar7 + 1;
          }
          if ((X509_CRL *)puVar5[1] != (X509_CRL *)0x0) {
            iVar3 = X509_STORE_add_crl(*(X509_STORE **)(param_1 + 0x18),(X509_CRL *)puVar5[1]);
            if (iVar3 == 0) goto LAB_00af2568;
            uVar7 = uVar7 + 1;
          }
          iVar2 = iVar2 + 1;
          iVar3 = OPENSSL_sk_num(lVar4);
        } while (iVar2 < iVar3);
        if (uVar7 == 0) goto LAB_00af2538;
      }
LAB_00af2568:
      OPENSSL_sk_pop_free(lVar4,X509_INFO_free);
      goto LAB_00af2600;
    }
    ERR_new(iVar2);
    ERR_set_debug("crypto/x509/by_file.c",0xea,"X509_load_cert_crl_file_ex");
    uVar1 = 0x80009;
  }
  ERR_set_error(0xb,uVar1,0);
  uVar7 = 0;
LAB_00af2600:
  return (ulong)uVar7;
}

