/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa558c
 */

undefined4 OSSL_trace_get_category_num(long param_1)

{
  int iVar1;
  undefined4 uVar2;
  long lVar3;
  
  if (param_1 == 0) {
LAB_00aa5704:
    uVar2 = 0xffffffff;
  }
  else {
    iVar1 = OPENSSL_strcasecmp(param_1,&DAT_002d4f78);
    if (iVar1 == 0) {
      lVar3 = 0;
    }
    else {
      iVar1 = OPENSSL_strcasecmp(param_1,"TRACE");
      if (iVar1 == 0) {
        lVar3 = 1;
      }
      else {
        iVar1 = OPENSSL_strcasecmp(param_1,&DAT_002d1e01);
        if (iVar1 == 0) {
          lVar3 = 2;
        }
        else {
          iVar1 = OPENSSL_strcasecmp(param_1,&DAT_0029f7a0);
          if (iVar1 == 0) {
            lVar3 = 3;
          }
          else {
            iVar1 = OPENSSL_strcasecmp(param_1,"TLS_CIPHER");
            if (iVar1 == 0) {
              lVar3 = 4;
            }
            else {
              iVar1 = OPENSSL_strcasecmp(param_1,&DAT_002a06af);
              if (iVar1 == 0) {
                lVar3 = 5;
              }
              else {
                iVar1 = OPENSSL_strcasecmp(param_1,"ENGINE_TABLE");
                if (iVar1 == 0) {
                  lVar3 = 6;
                }
                else {
                  iVar1 = OPENSSL_strcasecmp(param_1,"ENGINE_REF_COUNT");
                  if (iVar1 == 0) {
                    lVar3 = 7;
                  }
                  else {
                    iVar1 = OPENSSL_strcasecmp(param_1,"PKCS5V2");
                    if (iVar1 == 0) {
                      lVar3 = 8;
                    }
                    else {
                      iVar1 = OPENSSL_strcasecmp(param_1,"PKCS12_KEYGEN");
                      if (iVar1 == 0) {
                        lVar3 = 9;
                      }
                      else {
                        iVar1 = OPENSSL_strcasecmp(param_1,"PKCS12_DECRYPT");
                        if (iVar1 == 0) {
                          lVar3 = 10;
                        }
                        else {
                          iVar1 = OPENSSL_strcasecmp(param_1,"X509V3_POLICY");
                          if (iVar1 == 0) {
                            lVar3 = 0xb;
                          }
                          else {
                            iVar1 = OPENSSL_strcasecmp(param_1,"BN_CTX");
                            if (iVar1 == 0) {
                              lVar3 = 0xc;
                            }
                            else {
                              iVar1 = OPENSSL_strcasecmp(param_1,&DAT_002d8277);
                              if (iVar1 == 0) {
                                lVar3 = 0xd;
                              }
                              else {
                                iVar1 = OPENSSL_strcasecmp(param_1,"STORE");
                                if (iVar1 == 0) {
                                  lVar3 = 0xe;
                                }
                                else {
                                  iVar1 = OPENSSL_strcasecmp(param_1,"DECODER");
                                  if (iVar1 == 0) {
                                    lVar3 = 0xf;
                                  }
                                  else {
                                    iVar1 = OPENSSL_strcasecmp(param_1,"ENCODER");
                                    if (iVar1 == 0) {
                                      lVar3 = 0x10;
                                    }
                                    else {
                                      iVar1 = OPENSSL_strcasecmp(param_1,"REF_COUNT");
                                      if (iVar1 != 0) goto LAB_00aa5704;
                                      lVar3 = 0x11;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    uVar2 = (&DAT_00c6d940)[lVar3 * 4];
  }
  return uVar2;
}

