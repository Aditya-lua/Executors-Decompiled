/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aba8ac
 */

int PKCS12_parse(PKCS12 *p12,char *pass,EVP_PKEY **pkey,X509 **cert,stack_st_X509 **ca)

{
  int iVar1;
  int iVar2;
  stack_st_PKCS7 *psVar3;
  PKCS7 *p7;
  stack_st_PKCS12_SAFEBAG *psVar4;
  ulong uVar5;
  undefined8 uVar6;
  long lVar7;
  X509 *x509;
  
  if (pkey != (EVP_PKEY **)0x0) {
    *pkey = (EVP_PKEY *)0x0;
  }
  if (cert != (X509 **)0x0) {
    *cert = (X509 *)0x0;
  }
  if (p12 == (PKCS12 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_kiss.c",0x2f,"PKCS12_parse");
    ERR_set_error(0x23,0x69,0);
    return 0;
  }
  if ((pass == (char *)0x0) || (*pass == '\0')) {
    iVar1 = PKCS12_mac_present(p12);
    if (iVar1 == 0) {
      pass = (char *)0x0;
    }
    else {
      iVar1 = PKCS12_verify_mac(p12,(char *)0x0,0);
      pass = (char *)0x0;
      if (iVar1 == 0) {
        pass = "";
        iVar1 = PKCS12_verify_mac(p12,"",0);
        if (iVar1 == 0) {
          ERR_new();
          uVar6 = 0x43;
          goto LAB_00aba984;
        }
      }
    }
  }
  else {
    iVar1 = PKCS12_verify_mac(p12,pass,-1);
    if (iVar1 == 0) {
      ERR_new();
      uVar6 = 0x47;
LAB_00aba984:
      ERR_set_debug("crypto/pkcs12/p12_kiss.c",uVar6,"PKCS12_parse");
      ERR_set_error(0x23,0x71,0);
      lVar7 = 0;
      goto LAB_00ababdc;
    }
  }
  if (((cert == (X509 **)0x0) && (lVar7 = 0, ca == (stack_st_X509 **)0x0)) ||
     (lVar7 = OPENSSL_sk_new_null(), lVar7 != 0)) {
    psVar3 = PKCS12_unpack_authsafes(p12);
    if (psVar3 != (stack_st_PKCS7 *)0x0) {
      iVar1 = OPENSSL_sk_num();
      if (0 < iVar1) {
        iVar1 = 0;
        do {
          p7 = (PKCS7 *)OPENSSL_sk_value(psVar3,iVar1);
          iVar2 = OBJ_obj2nid(p7->type);
          if (iVar2 == 0x1a) {
            psVar4 = PKCS12_unpack_p7encdata(p7,pass,-1);
joined_r0x00abaa64:
            if (psVar4 != (stack_st_PKCS12_SAFEBAG *)0x0) {
              iVar2 = FUN_00abac38(psVar4,pass,pkey,lVar7);
              OPENSSL_sk_pop_free(psVar4,PKCS12_SAFEBAG_free);
              if (iVar2 != 0) goto LAB_00abaa90;
            }
            OPENSSL_sk_pop_free(psVar3,PKCS7_free);
            goto LAB_00abab84;
          }
          if (iVar2 == 0x15) {
            psVar4 = PKCS12_unpack_p7data(p7);
            goto joined_r0x00abaa64;
          }
LAB_00abaa90:
          iVar1 = iVar1 + 1;
          iVar2 = OPENSSL_sk_num(psVar3);
        } while (iVar1 < iVar2);
      }
      OPENSSL_sk_pop_free(psVar3,PKCS7_free);
      x509 = (X509 *)OPENSSL_sk_shift(lVar7);
      if (x509 != (X509 *)0x0) {
        do {
          if (((pkey == (EVP_PKEY **)0x0) || (cert == (X509 **)0x0)) ||
             ((*pkey == (EVP_PKEY *)0x0 || (*cert != (X509 *)0x0)))) {
LAB_00abab04:
            if (ca == (stack_st_X509 **)0x0) {
              X509_free(x509);
            }
            else {
              iVar1 = ossl_x509_add_cert_new(ca,x509,0);
              if (iVar1 == 0) goto LAB_00ababe0;
            }
          }
          else {
            ERR_set_mark();
            iVar1 = X509_check_private_key(x509,*pkey);
            ERR_pop_to_mark();
            if (iVar1 == 0) goto LAB_00abab04;
            *cert = x509;
          }
          x509 = (X509 *)OPENSSL_sk_shift(lVar7);
        } while (x509 != (X509 *)0x0);
      }
      OPENSSL_sk_free(lVar7);
      return 1;
    }
LAB_00abab84:
    uVar5 = ERR_peek_last_error();
    if (((uVar5 & 0xff800000) == 0x3000000) ||
       ((((int)(uint)uVar5 >> 0x1f & 0x7f800000U | 0x7fffff) & (uint)uVar5) == 0x9c))
    goto LAB_00ababdc;
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_kiss.c",0x57,"PKCS12_parse");
    uVar6 = 0x72;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_kiss.c",0x4e,"PKCS12_parse");
    uVar6 = 0xc0100;
  }
  ERR_set_error(0x23,uVar6,0);
LAB_00ababdc:
  x509 = (X509 *)0x0;
LAB_00ababe0:
  if (pkey != (EVP_PKEY **)0x0) {
    EVP_PKEY_free(*pkey);
    *pkey = (EVP_PKEY *)0x0;
  }
  if (cert != (X509 **)0x0) {
    X509_free(*cert);
    *cert = (X509 *)0x0;
  }
  X509_free(x509);
  OPENSSL_sk_pop_free(lVar7,X509_free);
  return 0;
}

