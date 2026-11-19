/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bccb4
 */

undefined8
FUN_009bccb4(long param_1,long param_2,X509 *param_3,EVP_PKEY *param_4,long param_5,int param_6)

{
  undefined8 *puVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  EVP_PKEY *pkey;
  long lVar5;
  EVP_PKEY *pEVar6;
  long *plVar7;
  long local_58;
  
  puVar1 = (undefined8 *)(param_2 + 0x158);
  if (param_1 != 0) {
    puVar1 = (undefined8 *)(param_1 + 0x898);
  }
  plVar7 = (long *)*puVar1;
  iVar2 = ssl_security_cert();
  if (iVar2 != 1) {
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0x3a9,"ssl_set_cert_and_key");
LAB_009bce14:
    ERR_set_error(0x14,iVar2,0);
    uVar4 = 0;
    pkey = (EVP_PKEY *)0x0;
    goto LAB_009bd028;
  }
  iVar2 = OPENSSL_sk_num(param_5);
  if (0 < iVar2) {
    iVar3 = 0;
    do {
      uVar4 = OPENSSL_sk_value(param_5,iVar3);
      iVar2 = ssl_security_cert(param_1,param_2,uVar4,0,0);
      if (iVar2 != 1) {
        ERR_new();
        ERR_set_debug("ssl/ssl_rsa.c",0x3af,"ssl_set_cert_and_key");
        goto LAB_009bce14;
      }
      iVar3 = iVar3 + 1;
      iVar2 = OPENSSL_sk_num(param_5);
    } while (iVar3 < iVar2);
  }
  pkey = X509_get_pubkey(param_3);
  if (pkey != (EVP_PKEY *)0x0) {
    pEVar6 = pkey;
    if (param_4 == (EVP_PKEY *)0x0) {
LAB_009bce80:
      lVar5 = ssl_cert_lookup_by_pkey(pkey,&local_58);
      if (lVar5 == 0) {
        ERR_new();
        ERR_set_debug("ssl/ssl_rsa.c",0x3d6,"ssl_set_cert_and_key");
        uVar4 = 0xf7;
      }
      else if ((param_6 == 0) &&
              (((plVar7[local_58 * 5 + 4] != 0 || (plVar7[local_58 * 5 + 5] != 0)) ||
               (plVar7[local_58 * 5 + 6] != 0)))) {
        ERR_new();
        ERR_set_debug("ssl/ssl_rsa.c",0x3de,"ssl_set_cert_and_key");
        uVar4 = 0x121;
      }
      else {
        lVar5 = 0;
        if ((param_5 == 0) || (lVar5 = X509_chain_up_ref(param_5), lVar5 != 0)) {
          OPENSSL_sk_pop_free(plVar7[local_58 * 5 + 6],X509_free);
          (plVar7 + local_58 * 5 + 4)[2] = lVar5;
          X509_free((X509 *)plVar7[local_58 * 5 + 4]);
          X509_up_ref(param_3);
          plVar7[local_58 * 5 + 4] = (long)param_3;
          EVP_PKEY_free((EVP_PKEY *)(plVar7 + local_58 * 5 + 4)[1]);
          EVP_PKEY_up_ref(pEVar6);
          uVar4 = 1;
          (plVar7 + local_58 * 5 + 4)[1] = (long)pEVar6;
          *plVar7 = (long)(plVar7 + local_58 * 5 + 4);
          goto LAB_009bd028;
        }
        ERR_new();
        ERR_set_debug("ssl/ssl_rsa.c",0x3e5,"ssl_set_cert_and_key");
        uVar4 = 0xc0100;
      }
    }
    else {
      iVar2 = EVP_PKEY_missing_parameters(param_4);
      iVar3 = EVP_PKEY_missing_parameters(pkey);
      if (iVar2 == 0) {
        if (iVar3 != 0) {
          iVar2 = EVP_PKEY_copy_parameters(pkey,param_4);
          if (iVar2 == 0) {
            ERR_new();
            uVar4 = 0x3ca;
            goto LAB_009bcfe4;
          }
        }
LAB_009bce68:
        iVar2 = EVP_PKEY_eq(pkey,param_4);
        pEVar6 = param_4;
        if (iVar2 == 1) goto LAB_009bce80;
        ERR_new();
        ERR_set_debug("ssl/ssl_rsa.c",0x3d1,"ssl_set_cert_and_key");
        uVar4 = 0x120;
      }
      else if (iVar3 == 0) {
        iVar2 = EVP_PKEY_copy_parameters(param_4,pkey);
        if (iVar2 != 0) goto LAB_009bce68;
        ERR_new();
        uVar4 = 0x3c3;
LAB_009bcfe4:
        ERR_set_debug("ssl/ssl_rsa.c",uVar4,"ssl_set_cert_and_key");
        uVar4 = 0x128;
      }
      else {
        ERR_new();
        ERR_set_debug("ssl/ssl_rsa.c",0x3be,"ssl_set_cert_and_key");
        uVar4 = 0x122;
      }
    }
    ERR_set_error(0x14,uVar4,0);
  }
  uVar4 = 0;
LAB_009bd028:
  EVP_PKEY_free(pkey);
  return uVar4;
}

