/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac8a70
 */

undefined8 FUN_00ac8a70(CONF_IMODULE *param_1,CONF *param_2)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  char *pcVar5;
  stack_st_CONF_VALUE *psVar6;
  long lVar7;
  
  uVar3 = NCONF_get0_libctx(param_2);
  lVar4 = ossl_lib_ctx_get_data(uVar3,5,&DAT_00c7ca38);
  pcVar5 = CONF_imodule_get_value(param_1);
  psVar6 = NCONF_get_section(param_2,pcVar5);
  if (psVar6 == (stack_st_CONF_VALUE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/rand/rand_lib.c",0x301,"random_conf_init");
    uVar3 = 0x77;
LAB_00ac8d5c:
    ERR_set_error(0xf,uVar3,0);
  }
  else if (lVar4 != 0) {
    iVar1 = OPENSSL_sk_num();
    if (iVar1 < 1) {
      return 1;
    }
    iVar1 = 0;
    uVar3 = 1;
    do {
      lVar7 = OPENSSL_sk_value(psVar6,iVar1);
      iVar2 = OPENSSL_strcasecmp(*(undefined8 *)(lVar7 + 8),"random");
      if (iVar2 == 0) {
        if (*(char **)(lVar7 + 0x10) == (char *)0x0) {
          pcVar5 = (char *)0x0;
        }
        else {
          pcVar5 = CRYPTO_strdup(*(char **)(lVar7 + 0x10),"crypto/rand/rand_lib.c",0x2e6);
          if (pcVar5 == (char *)0x0) {
LAB_00ac8d90:
            ERR_new();
            ERR_set_debug("crypto/rand/rand_lib.c",0x2e8,"random_set_string");
            uVar3 = 0xc0100;
            goto LAB_00ac8d5c;
          }
        }
        CRYPTO_free(*(void **)(lVar4 + 0x20));
        *(char **)(lVar4 + 0x20) = pcVar5;
      }
      else {
        iVar2 = OPENSSL_strcasecmp(*(undefined8 *)(lVar7 + 8),"cipher");
        if (iVar2 == 0) {
          if (*(char **)(lVar7 + 0x10) == (char *)0x0) {
            pcVar5 = (char *)0x0;
          }
          else {
            pcVar5 = CRYPTO_strdup(*(char **)(lVar7 + 0x10),"crypto/rand/rand_lib.c",0x2e6);
            if (pcVar5 == (char *)0x0) goto LAB_00ac8d90;
          }
          CRYPTO_free(*(void **)(lVar4 + 0x28));
          *(char **)(lVar4 + 0x28) = pcVar5;
        }
        else {
          iVar2 = OPENSSL_strcasecmp(*(undefined8 *)(lVar7 + 8),"digest");
          if (iVar2 == 0) {
            if (*(char **)(lVar7 + 0x10) == (char *)0x0) {
              pcVar5 = (char *)0x0;
            }
            else {
              pcVar5 = CRYPTO_strdup(*(char **)(lVar7 + 0x10),"crypto/rand/rand_lib.c",0x2e6);
              if (pcVar5 == (char *)0x0) goto LAB_00ac8d90;
            }
            CRYPTO_free(*(void **)(lVar4 + 0x30));
            *(char **)(lVar4 + 0x30) = pcVar5;
          }
          else {
            iVar2 = OPENSSL_strcasecmp(*(undefined8 *)(lVar7 + 8),"properties");
            if (iVar2 == 0) {
              if (*(char **)(lVar7 + 0x10) == (char *)0x0) {
                pcVar5 = (char *)0x0;
              }
              else {
                pcVar5 = CRYPTO_strdup(*(char **)(lVar7 + 0x10),"crypto/rand/rand_lib.c",0x2e6);
                if (pcVar5 == (char *)0x0) goto LAB_00ac8d90;
              }
              CRYPTO_free(*(void **)(lVar4 + 0x38));
              *(char **)(lVar4 + 0x38) = pcVar5;
            }
            else {
              iVar2 = OPENSSL_strcasecmp(*(undefined8 *)(lVar7 + 8),&DAT_002bb864);
              if (iVar2 == 0) {
                if (*(char **)(lVar7 + 0x10) == (char *)0x0) {
                  pcVar5 = (char *)0x0;
                }
                else {
                  pcVar5 = CRYPTO_strdup(*(char **)(lVar7 + 0x10),"crypto/rand/rand_lib.c",0x2e6);
                  if (pcVar5 == (char *)0x0) goto LAB_00ac8d90;
                }
                CRYPTO_free(*(void **)(lVar4 + 0x40));
                *(char **)(lVar4 + 0x40) = pcVar5;
              }
              else {
                iVar2 = OPENSSL_strcasecmp(*(undefined8 *)(lVar7 + 8),"seed_properties");
                if (iVar2 == 0) {
                  if (*(char **)(lVar7 + 0x10) == (char *)0x0) {
                    pcVar5 = (char *)0x0;
                  }
                  else {
                    pcVar5 = CRYPTO_strdup(*(char **)(lVar7 + 0x10),"crypto/rand/rand_lib.c",0x2e6);
                    if (pcVar5 == (char *)0x0) goto LAB_00ac8d90;
                  }
                  CRYPTO_free(*(void **)(lVar4 + 0x48));
                  *(char **)(lVar4 + 0x48) = pcVar5;
                }
                else {
                  ERR_new();
                  ERR_set_debug("crypto/rand/rand_lib.c",0x31d,"random_conf_init");
                  ERR_set_error(0xf,0x78,"name=%s, value=%s",*(undefined8 *)(lVar7 + 8),
                                *(undefined8 *)(lVar7 + 0x10));
                  uVar3 = 0;
                }
              }
            }
          }
        }
      }
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(psVar6);
      if (iVar2 <= iVar1) {
        return uVar3;
      }
    } while( true );
  }
  return 0;
}

