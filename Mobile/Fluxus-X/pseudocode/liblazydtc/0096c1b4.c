/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096c1b4
 */

void FUN_0096c1b4(long param_1,SSL_CTX *param_2,EVP_PKEY *param_3,undefined8 *param_4,char *param_5,
                 EVP_PKEY *param_6,undefined8 *param_7,char *param_8,char *param_9)

{
  ulong uVar1;
  long lVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  uint uVar6;
  undefined8 uVar7;
  BIO *pBVar8;
  X509 *pXVar9;
  X509 *a;
  ENGINE *e;
  BIO_METHOD *type;
  PKCS12 *p12;
  ulong uVar10;
  SSL *ssl;
  evp_pkey_st *peVar11;
  rsa_st *r;
  EVP_PKEY *pEVar12;
  UI_METHOD *method;
  UI_METHOD *pUVar13;
  char *pcVar14;
  char *pcVar15;
  long lVar16;
  ulong uVar17;
  stack_st_X509 *local_190;
  EVP_PKEY *local_188;
  X509 *local_180;
  X509 *local_178;
  undefined1 local_170 [256];
  long local_70;
  
  lVar2 = tpidr_el0;
  local_70 = *(long *)(lVar2 + 0x28);
  if (((param_5 == (char *)0x0) || (*param_5 == '\0')) ||
     (iVar4 = curl_strequal(param_5,&DAT_002b956f), iVar4 != 0)) {
    uVar6 = 1;
LAB_0096c224:
    if ((param_3 == (EVP_PKEY *)0x0) && (param_4 == (undefined8 *)0x0)) {
      uVar7 = 1;
      goto LAB_0096cdc4;
    }
  }
  else {
    iVar4 = curl_strequal(param_5,&DAT_002b7291);
    if (iVar4 != 0) {
      uVar6 = 2;
      goto LAB_0096c224;
    }
    iVar4 = curl_strequal(param_5,&DAT_002bb4d2);
    if (iVar4 == 0) {
      iVar4 = curl_strequal(param_5,&DAT_0029f96f);
      uVar6 = 0x2b;
      if (iVar4 == 0) {
        uVar6 = 0xffffffff;
      }
      goto LAB_0096c224;
    }
    uVar6 = 0x2a;
  }
  bVar3 = param_4 == (undefined8 *)0x0;
  if (param_9 != (char *)0x0) {
    SSL_CTX_set_default_passwd_cb_userdata(param_2,param_9);
    SSL_CTX_set_default_passwd_cb(param_2,FUN_00970a7c);
  }
  if ((int)uVar6 < 0x2a) {
    if (uVar6 == 1) {
      if (bVar3) {
        iVar4 = SSL_CTX_use_certificate_chain_file(param_2,(char *)param_3);
LAB_0096ccac:
        if (iVar4 == 1) goto LAB_0096ccb8;
      }
      else {
        pBVar8 = BIO_new_mem_buf((void *)*param_4,*(int *)(param_4 + 1));
        if (pBVar8 != (BIO *)0x0) {
          ERR_clear_error();
          pXVar9 = PEM_read_bio_X509_AUX(pBVar8,(X509 **)0x0,FUN_00970a7c,param_9);
          if (pXVar9 == (X509 *)0x0) {
            iVar4 = 0;
          }
          else {
            iVar5 = SSL_CTX_use_certificate(param_2,pXVar9);
            uVar10 = ERR_peek_error();
            if (uVar10 != 0) {
              iVar5 = 0;
            }
            if (iVar5 == 0) {
              iVar4 = iVar5;
            }
            else {
              lVar16 = SSL_CTX_ctrl(param_2,0x58,0,(void *)0x0);
              if (lVar16 == 0) {
                iVar4 = 0;
              }
              else {
                do {
                  a = PEM_read_bio_X509(pBVar8,(X509 **)0x0,FUN_00970a7c,param_9);
                  if (a == (X509 *)0x0) {
                    uVar10 = ERR_peek_last_error();
                    iVar4 = 0;
                    if (((uVar10 & 0xff800000) == 0x4800000) &&
                       (iVar4 = 0,
                       (((int)(uint)uVar10 >> 0x1f & 0x7f800000U | 0x7fffff) & (uint)uVar10) == 0x6c
                       )) {
                      ERR_clear_error();
                      iVar4 = iVar5;
                    }
                    goto LAB_0096cc9c;
                  }
                  lVar16 = SSL_CTX_ctrl(param_2,0x59,0,a);
                } while (lVar16 != 0);
                X509_free(a);
                iVar4 = 0;
              }
            }
          }
LAB_0096cc9c:
          X509_free(pXVar9);
          BIO_free(pBVar8);
          goto LAB_0096ccac;
        }
      }
      pcVar15 = local_170;
      pEVar12 = (EVP_PKEY *)"CURLOPT_SSLCERT_BLOB";
      if (bVar3) {
        pEVar12 = param_3;
      }
      uVar10 = ERR_get_error();
      local_170[0] = '\0';
      uVar7 = OpenSSL_version(6);
      uVar17 = 0x100;
      uVar6 = curl_msnprintf(local_170,0x100,"%s/%s","OpenSSL",uVar7);
      if (uVar6 < 0xfe) {
        lVar16 = (long)(int)uVar6;
        (pcVar15 + lVar16)[0] = ':';
        (pcVar15 + lVar16)[1] = ' ';
        pcVar15 = local_170 + lVar16 + 2;
        *pcVar15 = '\0';
        uVar17 = 0xfe - lVar16;
      }
      ERR_error_string_n(uVar10,pcVar15,uVar17);
      if (*pcVar15 == '\0') {
        uVar1 = 8;
        if (uVar10 != 0) {
          uVar1 = 0xd;
        }
        if (uVar1 < uVar17) {
          pcVar14 = "No error";
          if (uVar10 != 0) {
            pcVar14 = "Unknown error";
          }
          strcpy(pcVar15,pcVar14);
        }
      }
      pcVar14 = 
      "could not load PEM client certificate from %s, OpenSSL error %s, (no key found, wrong pass phrase, or wrong file format?)"
      ;
      param_3 = pEVar12;
    }
    else {
      if (uVar6 != 2) goto LAB_0096c3ec;
      if (bVar3) {
        iVar4 = SSL_CTX_use_certificate_file(param_2,(char *)param_3,2);
LAB_0096c994:
        if (iVar4 != 1) goto LAB_0096c9a0;
LAB_0096ccb8:
        bVar3 = false;
        goto joined_r0x0096ce1c;
      }
      pBVar8 = BIO_new_mem_buf((void *)*param_4,*(int *)(param_4 + 1));
      if (pBVar8 != (BIO *)0x0) {
        pXVar9 = d2i_X509_bio(pBVar8,(X509 **)0x0);
        if (pXVar9 == (X509 *)0x0) {
          iVar4 = 0;
        }
        else {
          iVar4 = SSL_CTX_use_certificate(param_2,pXVar9);
        }
        X509_free(pXVar9);
        BIO_free(pBVar8);
        goto LAB_0096c994;
      }
LAB_0096c9a0:
      pcVar15 = local_170;
      pEVar12 = (EVP_PKEY *)"CURLOPT_SSLCERT_BLOB";
      if (bVar3) {
        pEVar12 = param_3;
      }
      uVar10 = ERR_get_error();
      local_170[0] = '\0';
      uVar7 = OpenSSL_version(6);
      uVar17 = 0x100;
      uVar6 = curl_msnprintf(local_170,0x100,"%s/%s","OpenSSL",uVar7);
      if (uVar6 < 0xfe) {
        lVar16 = (long)(int)uVar6;
        (pcVar15 + lVar16)[0] = ':';
        (pcVar15 + lVar16)[1] = ' ';
        pcVar15 = local_170 + lVar16 + 2;
        *pcVar15 = '\0';
        uVar17 = 0xfe - lVar16;
      }
      ERR_error_string_n(uVar10,pcVar15,uVar17);
      if (*pcVar15 == '\0') {
        uVar1 = 8;
        if (uVar10 != 0) {
          uVar1 = 0xd;
        }
        if (uVar1 < uVar17) {
          pcVar14 = "No error";
          if (uVar10 != 0) {
            pcVar14 = "Unknown error";
          }
          strcpy(pcVar15,pcVar14);
        }
      }
      pcVar14 = 
      "could not load ASN1 client certificate from %s, OpenSSL error %s, (no key found, wrong pass phrase, or wrong file format?)"
      ;
      param_3 = pEVar12;
    }
LAB_0096cdb8:
    FUN_00904b80(param_1,pcVar14,param_3,pcVar15);
  }
  else if (uVar6 == 0x2a) {
    e = *(ENGINE **)(param_1 + 0xdc0);
    if (e == (ENGINE *)0x0) {
      if (param_3 != (EVP_PKEY *)0x0) {
        iVar4 = curl_strnequal(param_3,"pkcs11:",7);
        if ((iVar4 != 0) && (iVar4 = FUN_009701d0(param_1,"pkcs11"), iVar4 != 0)) goto LAB_0096cdc0;
        e = *(ENGINE **)(param_1 + 0xdc0);
        if (e != (ENGINE *)0x0) goto LAB_0096c4e0;
      }
      pcVar15 = "crypto engine not set, cannot load certificate";
    }
    else {
LAB_0096c4e0:
      local_180 = (X509 *)0x0;
      local_188 = param_3;
      iVar4 = ENGINE_ctrl(e,0xd,0,"LOAD_CERT_CTRL",(f *)0x0);
      if (iVar4 != 0) {
        iVar4 = ENGINE_ctrl_cmd(*(ENGINE **)(param_1 + 0xdc0),"LOAD_CERT_CTRL",0,&local_188,(f *)0x0
                                ,1);
        if (iVar4 == 0) {
          pcVar15 = local_170;
          uVar10 = ERR_get_error();
          local_170[0] = '\0';
          uVar7 = OpenSSL_version(6);
          uVar17 = 0x100;
          uVar6 = curl_msnprintf(local_170,0x100,"%s/%s","OpenSSL",uVar7);
          if (uVar6 < 0xfe) {
            lVar16 = (long)(int)uVar6;
            (pcVar15 + lVar16)[0] = ':';
            (pcVar15 + lVar16)[1] = ' ';
            pcVar15 = local_170 + lVar16 + 2;
            *pcVar15 = '\0';
            uVar17 = 0xfe - lVar16;
          }
          ERR_error_string_n(uVar10,pcVar15,uVar17);
          if (*pcVar15 == '\0') {
            uVar1 = 8;
            if (uVar10 != 0) {
              uVar1 = 0xd;
            }
            if (uVar1 < uVar17) {
              pcVar14 = "No error";
              if (uVar10 != 0) {
                pcVar14 = "Unknown error";
              }
              strcpy(pcVar15,pcVar14);
            }
          }
          pcVar14 = "ssl engine cannot load client cert with id \'%s\' [%s]";
          goto LAB_0096cdb8;
        }
        if (local_180 == (X509 *)0x0) {
          pcVar15 = "ssl engine did not initialized the certificate properly.";
          goto LAB_0096caa0;
        }
        iVar4 = SSL_CTX_use_certificate(param_2,local_180);
        if (iVar4 != 1) {
          pcVar15 = local_170;
          uVar10 = ERR_get_error();
          local_170[0] = '\0';
          uVar7 = OpenSSL_version(6);
          uVar17 = 0x100;
          uVar6 = curl_msnprintf(local_170,0x100,"%s/%s","OpenSSL",uVar7);
          if (uVar6 < 0xfe) {
            lVar16 = (long)(int)uVar6;
            (pcVar15 + lVar16)[0] = ':';
            (pcVar15 + lVar16)[1] = ' ';
            pcVar15 = local_170 + lVar16 + 2;
            *pcVar15 = '\0';
            uVar17 = 0xfe - lVar16;
          }
          ERR_error_string_n(uVar10,pcVar15,uVar17);
          if (*pcVar15 == '\0') {
            uVar1 = 8;
            if (uVar10 != 0) {
              uVar1 = 0xd;
            }
            if (uVar1 < uVar17) {
              pcVar14 = "No error";
              if (uVar10 != 0) {
                pcVar14 = "Unknown error";
              }
              strcpy(pcVar15,pcVar14);
            }
          }
          pcVar14 = "unable to set client certificate [%s]";
          goto LAB_0096cc28;
        }
        X509_free(local_180);
        bVar3 = false;
        if (param_6 == (EVP_PKEY *)0x0) goto LAB_0096ccc0;
        goto LAB_0096ce20;
      }
      pcVar15 = "ssl engine does not support loading certificates";
    }
LAB_0096caa0:
    FUN_00904b80(param_1,pcVar15);
  }
  else {
    if (uVar6 != 0x2b) {
LAB_0096c3ec:
      FUN_00904b80(param_1,"not supported file type \'%s\' for certificate",param_5);
      goto LAB_0096cdc0;
    }
    local_190 = (stack_st_X509 *)0x0;
    if (bVar3) {
      type = BIO_s_file();
      pBVar8 = BIO_new(type);
      if (pBVar8 != (BIO *)0x0) {
        lVar16 = BIO_ctrl(pBVar8,0x6c,3,param_3);
        if ((int)lVar16 < 1) {
          FUN_00904b80(param_1,"could not open PKCS12 file \'%s\'",param_3);
          BIO_free(pBVar8);
          goto LAB_0096cdc0;
        }
        goto LAB_0096c59c;
      }
      pcVar15 = local_170;
      uVar10 = ERR_get_error();
      local_170[0] = '\0';
      uVar7 = OpenSSL_version(6);
      uVar17 = 0x100;
      uVar6 = curl_msnprintf(local_170,0x100,"%s/%s","OpenSSL",uVar7);
      if (uVar6 < 0xfe) {
        lVar16 = (long)(int)uVar6;
        (pcVar15 + lVar16)[0] = ':';
        (pcVar15 + lVar16)[1] = ' ';
        pcVar15 = local_170 + lVar16 + 2;
        *pcVar15 = '\0';
        uVar17 = 0xfe - lVar16;
      }
      ERR_error_string_n(uVar10,pcVar15,uVar17);
      if (*pcVar15 == '\0') {
        uVar1 = 8;
        if (uVar10 != 0) {
          uVar1 = 0xd;
        }
        if (uVar1 < uVar17) {
          pcVar14 = "No error";
          if (uVar10 != 0) {
            pcVar14 = "Unknown error";
          }
          strcpy(pcVar15,pcVar14);
        }
      }
      pcVar14 = "BIO_new return NULL, OpenSSL error %s";
LAB_0096cc28:
      FUN_00904b80(param_1,pcVar14,pcVar15);
      goto LAB_0096cdc0;
    }
    pBVar8 = BIO_new_mem_buf((void *)*param_4,*(int *)(param_4 + 1));
    if (pBVar8 == (BIO *)0x0) {
      pcVar15 = local_170;
      uVar10 = ERR_get_error();
      local_170[0] = '\0';
      uVar7 = OpenSSL_version(6);
      uVar17 = 0x100;
      uVar6 = curl_msnprintf(local_170,0x100,"%s/%s","OpenSSL",uVar7);
      if (uVar6 < 0xfe) {
        lVar16 = (long)(int)uVar6;
        (pcVar15 + lVar16)[0] = ':';
        (pcVar15 + lVar16)[1] = ' ';
        pcVar15 = local_170 + lVar16 + 2;
        *pcVar15 = '\0';
        uVar17 = 0xfe - lVar16;
      }
      ERR_error_string_n(uVar10,pcVar15,uVar17);
      if (*pcVar15 == '\0') {
        uVar1 = 8;
        if (uVar10 != 0) {
          uVar1 = 0xd;
        }
        if (uVar1 < uVar17) {
          pcVar14 = "No error";
          if (uVar10 != 0) {
            pcVar14 = "Unknown error";
          }
          strcpy(pcVar15,pcVar14);
        }
      }
      pcVar14 = "BIO_new_mem_buf NULL, OpenSSL error %s";
      goto LAB_0096cc28;
    }
LAB_0096c59c:
    p12 = d2i_PKCS12_bio(pBVar8,(PKCS12 **)0x0);
    BIO_free(pBVar8);
    if (p12 == (PKCS12 *)0x0) {
      pEVar12 = (EVP_PKEY *)"(memory blob)";
      if (bVar3) {
        pEVar12 = param_3;
      }
      FUN_00904b80(param_1,"error reading PKCS12 file \'%s\'",pEVar12);
      goto LAB_0096cdc0;
    }
    PKCS12_PBE_add();
    iVar4 = PKCS12_parse(p12,param_9,&local_188,&local_178,&local_190);
    if (iVar4 == 0) {
      pcVar15 = local_170;
      uVar10 = ERR_get_error();
      local_170[0] = '\0';
      uVar7 = OpenSSL_version(6);
      uVar17 = 0x100;
      uVar6 = curl_msnprintf(local_170,0x100,"%s/%s","OpenSSL",uVar7);
      if (uVar6 < 0xfe) {
        lVar16 = (long)(int)uVar6;
        (pcVar15 + lVar16)[0] = ':';
        (pcVar15 + lVar16)[1] = ' ';
        pcVar15 = local_170 + lVar16 + 2;
        *pcVar15 = '\0';
        uVar17 = 0xfe - lVar16;
      }
      ERR_error_string_n(uVar10,pcVar15,uVar17);
      if (*pcVar15 == '\0') {
        uVar1 = 8;
        if (uVar10 != 0) {
          uVar1 = 0xd;
        }
        if (uVar1 < uVar17) {
          pcVar14 = "No error";
          if (uVar10 != 0) {
            pcVar14 = "Unknown error";
          }
          strcpy(pcVar15,pcVar14);
        }
      }
      FUN_00904b80(param_1,"could not parse PKCS12 file, check password, OpenSSL error %s",pcVar15);
      PKCS12_free(p12);
      goto LAB_0096cdc0;
    }
    PKCS12_free(p12);
    iVar4 = SSL_CTX_use_certificate(param_2,local_178);
    if (iVar4 != 1) {
      param_3 = (EVP_PKEY *)local_170;
      uVar10 = ERR_get_error();
      local_170[0] = '\0';
      uVar7 = OpenSSL_version(6);
      uVar17 = 0x100;
      uVar6 = curl_msnprintf(local_170,0x100,"%s/%s","OpenSSL",uVar7);
      if (uVar6 < 0xfe) {
        lVar16 = (long)(int)uVar6;
        pcVar15 = (char *)((long)&param_3->type + lVar16);
        pcVar15[0] = ':';
        pcVar15[1] = ' ';
        param_3 = (EVP_PKEY *)(local_170 + lVar16 + 2);
        *(char *)&param_3->type = '\0';
        uVar17 = 0xfe - lVar16;
      }
      ERR_error_string_n(uVar10,(char *)param_3,uVar17);
      if ((char)param_3->type == '\0') {
        uVar1 = 8;
        if (uVar10 != 0) {
          uVar1 = 0xd;
        }
        if (uVar1 < uVar17) {
          pcVar15 = "No error";
          if (uVar10 != 0) {
            pcVar15 = "Unknown error";
          }
          strcpy((char *)param_3,pcVar15);
        }
      }
      pcVar15 = "could not load PKCS12 client certificate, OpenSSL error %s";
LAB_0096d064:
      FUN_00904b80(param_1,pcVar15,param_3);
LAB_0096d068:
      EVP_PKEY_free(local_188);
      X509_free(local_178);
      OPENSSL_sk_pop_free(local_190,X509_free);
      goto LAB_0096cdc0;
    }
    iVar4 = SSL_CTX_use_PrivateKey(param_2,local_188);
    if (iVar4 != 1) {
      pcVar15 = "unable to use private key from PKCS12 file \'%s\'";
      goto LAB_0096d064;
    }
    iVar4 = SSL_CTX_check_private_key(param_2);
    if (iVar4 == 0) {
      pcVar15 = "private key from PKCS12 file \'%s\' does not match certificate in same file";
      goto LAB_0096d064;
    }
    if (local_190 != (stack_st_X509 *)0x0) {
      do {
        iVar4 = OPENSSL_sk_num(local_190);
        if (iVar4 == 0) goto LAB_0096cdf4;
        pXVar9 = (X509 *)OPENSSL_sk_pop(local_190);
        iVar4 = SSL_CTX_add_client_CA(param_2,pXVar9);
        if (iVar4 == 0) {
          X509_free(pXVar9);
          pcVar15 = "cannot add certificate to client CA list";
          goto LAB_0096d23c;
        }
        lVar16 = SSL_CTX_ctrl(param_2,0xe,0,pXVar9);
      } while (lVar16 != 0);
      X509_free(pXVar9);
      pcVar15 = "cannot add certificate to certificate chain";
LAB_0096d23c:
      FUN_00904b80(param_1,pcVar15);
      goto LAB_0096d068;
    }
LAB_0096cdf4:
    EVP_PKEY_free(local_188);
    X509_free(local_178);
    OPENSSL_sk_pop_free(local_190,X509_free);
    bVar3 = true;
joined_r0x0096ce1c:
    if (param_6 == (EVP_PKEY *)0x0) {
LAB_0096ccc0:
      if (param_7 != (undefined8 *)0x0) goto LAB_0096ce20;
joined_r0x0096ccc8:
      param_6 = param_3;
      param_7 = param_4;
      if ((int)uVar6 < 0x2a) {
        if (uVar6 == 1) goto LAB_0096ce4c;
        if (uVar6 != 2) goto LAB_0096d190;
LAB_0096ceec:
        if (param_7 != (undefined8 *)0x0) goto LAB_0096cef0;
LAB_0096cfa0:
        iVar4 = SSL_CTX_use_PrivateKey_file(param_2,(char *)param_6,uVar6);
        if (iVar4 == 1) goto LAB_0096ce50;
LAB_0096d004:
        pEVar12 = (EVP_PKEY *)"(memory blob)";
        if (param_6 != (EVP_PKEY *)0x0) {
          pEVar12 = param_6;
        }
        pcVar15 = "PEM";
        if (param_8 != (char *)0x0) {
          pcVar15 = param_8;
        }
        FUN_00904b80(param_1,"unable to set private key file: \'%s\' type %s",pEVar12,pcVar15);
        goto LAB_0096cdc0;
      }
      if (uVar6 == 0x2a) {
LAB_0096d0d8:
        if (*(long *)(param_1 + 0xdc0) == 0) {
          if (param_6 != (EVP_PKEY *)0x0) {
            iVar4 = curl_strnequal(param_6,"pkcs11:",7);
            if ((iVar4 != 0) && (iVar4 = FUN_009701d0(param_1,"pkcs11"), iVar4 != 0))
            goto LAB_0096cdc0;
            if (*(long *)(param_1 + 0xdc0) != 0) goto LAB_0096d0e4;
          }
          pcVar15 = "crypto engine not set, cannot load private key";
          goto LAB_0096caa0;
        }
LAB_0096d0e4:
        method = UI_create_method("curl user interface");
        if (method == (UI_METHOD *)0x0) {
          pcVar15 = "unable do create OpenSSL user-interface method";
        }
        else {
          pUVar13 = UI_OpenSSL();
          uVar6 = UI_method_get_opener((UI *)pUVar13);
          UI_method_set_opener(method,(opener *)(ulong)uVar6);
          pUVar13 = UI_OpenSSL();
          uVar6 = UI_method_get_closer((UI *)pUVar13);
          UI_method_set_closer(method,(closer *)(ulong)uVar6);
          UI_method_set_reader(method,(reader *)&LAB_00970ae8);
          UI_method_set_writer(method,(writer *)&LAB_00970b78);
          pEVar12 = ENGINE_load_private_key
                              (*(ENGINE **)(param_1 + 0xdc0),(char *)param_6,method,param_9);
          UI_destroy_method(method);
          if (pEVar12 != (EVP_PKEY *)0x0) {
            iVar4 = SSL_CTX_use_PrivateKey(param_2,pEVar12);
            if (iVar4 != 1) {
              FUN_00904b80(param_1,"unable to set private key");
              EVP_PKEY_free(pEVar12);
              goto LAB_0096cdc0;
            }
            EVP_PKEY_free(pEVar12);
            goto LAB_0096ce50;
          }
          pcVar15 = "failed to load private key from crypto engine";
        }
        FUN_00904b80(param_1,pcVar15);
        goto LAB_0096cdc0;
      }
      if (uVar6 == 0x2b) {
        if (bVar3) goto LAB_0096ce50;
        pcVar15 = "file type P12 for private key not supported";
      }
      else {
LAB_0096d190:
        pcVar15 = "not supported file type for private key";
      }
    }
    else {
LAB_0096ce20:
      if (((param_8 == (char *)0x0) || (*param_8 == '\0')) ||
         (iVar4 = curl_strequal(param_8,&DAT_002b956f), iVar4 != 0)) {
LAB_0096ce4c:
        if (!bVar3) {
          uVar6 = 1;
          goto LAB_0096ceec;
        }
      }
      else {
        iVar4 = curl_strequal(param_8,&DAT_002b7291);
        if (iVar4 == 0) {
          iVar4 = curl_strequal(param_8,&DAT_002bb4d2);
          if (iVar4 == 0) {
            iVar4 = curl_strequal(param_8,&DAT_0029f96f);
            uVar6 = 0x2b;
            param_4 = param_7;
            param_3 = param_6;
            if (iVar4 == 0) {
              uVar6 = 0xffffffff;
            }
            goto joined_r0x0096ccc8;
          }
          goto LAB_0096d0d8;
        }
        uVar6 = 2;
        if (param_7 == (undefined8 *)0x0) goto LAB_0096cfa0;
LAB_0096cef0:
        pBVar8 = BIO_new_mem_buf((void *)*param_7,*(int *)(param_7 + 1));
        if (pBVar8 == (BIO *)0x0) goto LAB_0096d004;
        if ((uVar6 & 3) == 2) {
          pEVar12 = d2i_PrivateKey_bio(pBVar8,(EVP_PKEY **)0x0);
          if (pEVar12 == (EVP_PKEY *)0x0) goto LAB_0096cf40;
LAB_0096cfd8:
          iVar4 = SSL_CTX_use_PrivateKey(param_2,pEVar12);
          EVP_PKEY_free(pEVar12);
        }
        else {
          iVar4 = 0;
          if ((uVar6 & 3) == 1) {
            pEVar12 = PEM_read_bio_PrivateKey(pBVar8,(EVP_PKEY **)0x0,FUN_00970a7c,param_9);
            if (pEVar12 != (EVP_PKEY *)0x0) goto LAB_0096cfd8;
LAB_0096cf40:
            iVar4 = 0;
          }
        }
        BIO_free(pBVar8);
        if (iVar4 != 1) goto LAB_0096d004;
      }
LAB_0096ce50:
      ssl = SSL_new(param_2);
      if (ssl != (SSL *)0x0) {
        local_178 = SSL_get_certificate(ssl);
        if (local_178 != (X509 *)0x0) {
          pEVar12 = X509_get_pubkey(local_178);
          peVar11 = SSL_get_privatekey(ssl);
          EVP_PKEY_copy_parameters(pEVar12,peVar11);
          EVP_PKEY_free(pEVar12);
        }
        peVar11 = SSL_get_privatekey(ssl);
        iVar4 = EVP_PKEY_get_id();
        if (iVar4 == 6) {
          r = EVP_PKEY_get1_RSA(peVar11);
          uVar6 = RSA_flags(r);
          RSA_free(r);
          SSL_free(ssl);
          if ((uVar6 & 1) == 0) goto LAB_0096cf50;
        }
        else {
          SSL_free(ssl);
LAB_0096cf50:
          iVar4 = SSL_CTX_check_private_key(param_2);
          if (iVar4 == 0) {
            FUN_00904b80(param_1,"Private key does not match the certificate public key");
            goto LAB_0096cdc0;
          }
        }
        uVar7 = 1;
        goto LAB_0096cdc4;
      }
      pcVar15 = "unable to create an SSL structure";
    }
    FUN_00904b80(param_1,pcVar15);
  }
LAB_0096cdc0:
  uVar7 = 0;
LAB_0096cdc4:
  if (*(long *)(lVar2 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar7);
  }
  return;
}

