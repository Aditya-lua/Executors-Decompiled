/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b18e68
 */

BIO * OSSL_HTTP_get(char *param_1,undefined8 param_2,undefined8 param_3,BIO *param_4,
                   undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined4 param_8,
                   undefined8 param_9,undefined8 param_10,undefined4 param_11,undefined8 param_12,
                   int param_13)

{
  char *__s1;
  int iVar1;
  int iVar2;
  time_t tVar3;
  char *__s1_00;
  long lVar4;
  BIO *a;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  undefined4 local_84;
  char *local_80;
  void *local_78;
  void *local_70;
  char *local_68;
  
  local_68 = (char *)0x0;
  if (param_13 < 1) {
    lVar6 = 0;
  }
  else {
    tVar3 = time((time_t *)0x0);
    lVar6 = tVar3 + param_13;
  }
  if (param_1 == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0x475,"OSSL_HTTP_get");
    ERR_set_error(0x3d,0xc0102,0);
  }
  else {
    __s1_00 = CRYPTO_strdup(param_1,"crypto/http/http_client.c",0x478);
    if (__s1_00 != (char *)0x0) {
      iVar1 = OSSL_HTTP_parse_url(__s1_00,&local_84,0,&local_70,&local_78,0,&local_80,0,0);
      if (iVar1 == 0) {
LAB_00b192ec:
        a = (BIO *)0x0;
LAB_00b192f0:
        CRYPTO_free(__s1_00);
        return a;
      }
      iVar1 = 0;
LAB_00b18f3c:
      lVar4 = OSSL_HTTP_open(local_70,local_78,param_2,param_3,local_84,param_4,param_5,param_6,
                             param_7,param_8,param_13);
      iVar1 = iVar1 + -1;
      do {
        if (lVar4 == 0) {
LAB_00b18fc4:
          a = (BIO *)0x0;
        }
        else {
          iVar2 = OSSL_HTTP_set1_request
                            (lVar4,local_80,param_9,0,0,param_10,param_11,param_12,0xffffffff,0);
          if (iVar2 == 0) {
            OSSL_HTTP_REQ_CTX_free(lVar4);
            lVar4 = 0;
            goto LAB_00b18fc4;
          }
          a = (BIO *)OSSL_HTTP_exchange(lVar4,&local_68);
        }
        CRYPTO_free(local_80);
        __s1 = local_68;
        if ((a != (BIO *)0x0) || (local_68 == (char *)0x0)) {
LAB_00b1927c:
          CRYPTO_free(local_70);
          CRYPTO_free(local_78);
          if ((lVar4 != 0) && (*(code **)(lVar4 + 0x28) != (code *)0x0)) {
            lVar6 = (**(code **)(lVar4 + 0x28))
                              (*(undefined8 *)(lVar4 + 0x18),*(undefined8 *)(lVar4 + 0x30),0,
                               a != (BIO *)0x0);
            if (lVar6 == 0) {
              OSSL_HTTP_REQ_CTX_free(lVar4);
              BIO_free(a);
              goto LAB_00b192ec;
            }
            *(long *)(lVar4 + 0x18) = lVar6;
          }
          OSSL_HTTP_REQ_CTX_free(lVar4);
          goto LAB_00b192f0;
        }
        if (0x30 < iVar1 + 1) {
          ERR_new();
          ERR_set_debug("crypto/http/http_client.c",0x455,"redirection_ok");
          uVar7 = 0x73;
LAB_00b1925c:
          ERR_set_error(0x3d,uVar7,0);
          CRYPTO_free(local_68);
          a = (BIO *)0x0;
          goto LAB_00b1927c;
        }
        if (((*local_68 != '/') && (iVar2 = strncmp(__s1_00,"https:",6), iVar2 == 0)) &&
           (iVar2 = strncmp(__s1,"https:",6), iVar2 != 0)) {
          ERR_new();
          ERR_set_debug("crypto/http/http_client.c",0x45c,"redirection_ok");
          uVar7 = 0x70;
          goto LAB_00b1925c;
        }
        tVar3 = time((time_t *)0x0);
        if (lVar6 != 0) {
          if (lVar6 < tVar3) {
            ERR_new();
            ERR_set_debug("crypto/http/http_client.c",0x1ff,"may_still_retry");
            uVar7 = 0x81;
            goto LAB_00b1925c;
          }
          param_13 = (int)(lVar6 - tVar3);
          if (0x7ffffffe < lVar6 - tVar3) {
            param_13 = 0x7fffffff;
          }
        }
        BIO_ctrl(param_4,1,0,(void *)0x0);
        CRYPTO_free(__s1_00);
        __s1_00 = local_68;
        if (*local_68 != '/') goto LAB_00b190a0;
        local_80 = CRYPTO_strdup(local_68,"crypto/http/http_client.c",0x499);
        iVar1 = iVar1 + 1;
        if (local_80 == (char *)0x0) {
          CRYPTO_free(local_70);
          CRYPTO_free(local_78);
          if (((lVar4 != 0) && (*(code **)(lVar4 + 0x28) != (code *)0x0)) &&
             (lVar6 = (**(code **)(lVar4 + 0x28))
                                (*(undefined8 *)(lVar4 + 0x18),*(undefined8 *)(lVar4 + 0x30),0,1),
             lVar6 != 0)) {
            *(long *)(lVar4 + 0x18) = lVar6;
          }
          OSSL_HTTP_REQ_CTX_free(lVar4);
          BIO_free((BIO *)0x0);
          CRYPTO_free(__s1_00);
          return (BIO *)0x0;
        }
      } while( true );
    }
  }
  return (BIO *)0x0;
LAB_00b190a0:
  CRYPTO_free(local_70);
  CRYPTO_free(local_78);
  iVar1 = iVar1 + 2;
  if (((lVar4 != 0) && (*(code **)(lVar4 + 0x28) != (code *)0x0)) &&
     (lVar5 = (**(code **)(lVar4 + 0x28))
                        (*(undefined8 *)(lVar4 + 0x18),*(undefined8 *)(lVar4 + 0x30),0,1),
     lVar5 != 0)) {
    *(long *)(lVar4 + 0x18) = lVar5;
  }
  OSSL_HTTP_REQ_CTX_free(lVar4);
  iVar2 = OSSL_HTTP_parse_url(__s1_00,&local_84,0,&local_70,&local_78,0,&local_80,0,0);
  a = (BIO *)0x0;
  if (iVar2 == 0) goto LAB_00b192f0;
  goto LAB_00b18f3c;
}

