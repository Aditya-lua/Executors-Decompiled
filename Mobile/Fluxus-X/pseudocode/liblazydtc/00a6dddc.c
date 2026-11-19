/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6dddc
 */

int evp_pkey_name2type(char *param_1)

{
  int iVar1;
  EVP_PKEY_ASN1_METHOD *pEVar2;
  long lVar3;
  ENGINE *local_28;
  
  iVar1 = OPENSSL_strcasecmp(param_1,&DAT_002db996);
  if (iVar1 == 0) {
    lVar3 = 0;
  }
  else {
    iVar1 = OPENSSL_strcasecmp(param_1,"RSA-PSS");
    if (iVar1 == 0) {
      lVar3 = 1;
    }
    else {
      iVar1 = OPENSSL_strcasecmp(param_1,&DAT_002cf33a);
      if (iVar1 == 0) {
        lVar3 = 2;
      }
      else {
        iVar1 = OPENSSL_strcasecmp(param_1,"ED25519");
        if (iVar1 == 0) {
          lVar3 = 3;
        }
        else {
          iVar1 = OPENSSL_strcasecmp(param_1,"ED448");
          if (iVar1 == 0) {
            lVar3 = 4;
          }
          else {
            iVar1 = OPENSSL_strcasecmp(param_1,"X25519");
            if (iVar1 == 0) {
              lVar3 = 5;
            }
            else {
              iVar1 = OPENSSL_strcasecmp(param_1,&DAT_0029fe3c);
              if (iVar1 == 0) {
                lVar3 = 6;
              }
              else {
                iVar1 = OPENSSL_strcasecmp(param_1,&DAT_002adb94);
                if (iVar1 == 0) {
                  lVar3 = 7;
                }
                else {
                  iVar1 = OPENSSL_strcasecmp(param_1,&DAT_002a3a5a);
                  if (iVar1 == 0) {
                    lVar3 = 8;
                  }
                  else {
                    iVar1 = OPENSSL_strcasecmp(param_1,"X9.42 DH");
                    if (iVar1 == 0) {
                      lVar3 = 9;
                    }
                    else {
                      iVar1 = OPENSSL_strcasecmp(param_1,&DAT_002a032e);
                      if (iVar1 == 0) {
                        lVar3 = 10;
                      }
                      else {
                        iVar1 = OPENSSL_strcasecmp(param_1,&DAT_002c74e5);
                        if (iVar1 != 0) {
                          iVar1 = OBJ_sn2nid(param_1);
                          pEVar2 = EVP_PKEY_asn1_find(&local_28,iVar1);
                          if (pEVar2 == (EVP_PKEY_ASN1_METHOD *)0x0) {
                            iVar1 = 0;
                          }
                          else {
                            iVar1 = *(int *)pEVar2;
                          }
                          ENGINE_finish(local_28);
                          if (iVar1 != 0) {
                            return iVar1;
                          }
                          iVar1 = OBJ_ln2nid(param_1);
                          pEVar2 = EVP_PKEY_asn1_find(&local_28,iVar1);
                          if (pEVar2 == (EVP_PKEY_ASN1_METHOD *)0x0) {
                            iVar1 = 0;
                          }
                          else {
                            iVar1 = *(int *)pEVar2;
                          }
                          ENGINE_finish(local_28);
                          return iVar1;
                        }
                        lVar3 = 0xb;
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
  return (&DAT_00c5ebd8)[lVar3 * 4];
}

