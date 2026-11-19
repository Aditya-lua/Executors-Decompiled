/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b186ec
 */

long OSSL_HTTP_open(char *param_1,char *param_2,long param_3,long param_4,int param_5,BIO *param_6,
                   BIO *param_7,code *param_8,undefined8 param_9,undefined4 param_10,int param_11)

{
  char *__s;
  int iVar1;
  char *pcVar2;
  long lVar3;
  time_t tVar4;
  undefined8 uVar5;
  long lVar6;
  char *pcVar7;
  int iVar8;
  BIO *a;
  char *pcVar9;
  char *parg;
  char *local_70;
  char *local_68;
  
  if ((param_5 != 0) && (param_8 == (code *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0x3a9,"OSSL_HTTP_open");
    uVar5 = 0x6b;
    goto LAB_00b187bc;
  }
  if (param_7 == (BIO *)0x0) {
    if (param_6 == (BIO *)0x0) {
      local_70 = (char *)0x0;
      local_68 = (char *)0x0;
      if (param_1 == (char *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/http/http_client.c",0x3bc,"OSSL_HTTP_open");
        uVar5 = 0xc0102;
        goto LAB_00b187bc;
      }
      if ((param_2 == (char *)0x0) || (*param_2 == '\0')) {
        pcVar9 = strchr(param_1,0x3a);
        param_2 = "443";
        if (param_5 == 0) {
          param_2 = "80";
        }
        if (pcVar9 != (char *)0x0) {
          param_2 = (char *)0x0;
        }
      }
      pcVar9 = (char *)OSSL_HTTP_adapt_proxy(param_3,param_4,param_1,param_5);
      if (pcVar9 == (char *)0x0) {
        pcVar7 = (char *)0x0;
        pcVar2 = (char *)0x0;
      }
      else {
        iVar1 = OSSL_HTTP_parse_url(pcVar9,0,0,&local_68,&local_70,0,0,0,0);
        if (iVar1 == 0) {
          return 0;
        }
        pcVar2 = local_68;
        pcVar7 = local_70;
      }
      __s = param_1;
      parg = param_2;
      if (pcVar2 != (char *)0x0) {
        __s = pcVar2;
        parg = pcVar7;
      }
      if (((parg == (char *)0x0) && (pcVar2 = strchr(__s,0x3a), pcVar2 == (char *)0x0)) &&
         (parg = "80", param_5 != 0)) {
        parg = "443";
      }
      param_6 = BIO_new_connect(__s);
      if ((parg != (char *)0x0) && (param_6 != (BIO *)0x0)) {
        BIO_ctrl(param_6,100,1,parg);
      }
      CRYPTO_free(local_68);
      CRYPTO_free(local_70);
      if (param_6 == (BIO *)0x0) {
        return 0;
      }
      ERR_set_mark();
      iVar1 = 1;
LAB_00b18990:
      iVar8 = iVar1;
      iVar1 = BIO_do_connect_retry(param_6,param_11,0xffffffff);
      a = param_6;
      if (iVar1 < 1) {
joined_r0x00b1882c:
        if (iVar8 != 0) {
          BIO_free_all(a);
        }
        goto LAB_00b18a74;
      }
      if (param_8 != (code *)0x0) {
LAB_00b18810:
        param_6 = (BIO *)(*param_8)(a,param_9,1,param_5 != 0);
        if (param_6 == (BIO *)0x0) goto joined_r0x00b1882c;
      }
LAB_00b189bc:
      if (param_7 == (BIO *)0x0) {
        param_7 = param_6;
      }
      lVar3 = OSSL_HTTP_REQ_CTX_new(param_6,param_7,param_10);
      if (lVar3 == 0) goto LAB_00b18a74;
      *(int *)(lVar3 + 0x14) = iVar8;
      *(code **)(lVar3 + 0x28) = param_8;
      *(undefined8 *)(lVar3 + 0x30) = param_9;
      *(int *)(lVar3 + 0x38) = param_5;
      if (pcVar9 == (char *)0x0) {
LAB_00b18a00:
        if (param_1 != (char *)0x0) {
          pcVar9 = CRYPTO_strdup(param_1,"crypto/http/http_client.c",0x186);
          *(char **)(lVar3 + 0x48) = pcVar9;
          if (pcVar9 == (char *)0x0) goto LAB_00b18a5c;
        }
        if (param_2 == (char *)0x0) {
LAB_00b18a40:
          if (param_11 < 1) {
            lVar6 = 0;
          }
          else {
            tVar4 = time((time_t *)0x0);
            lVar6 = tVar4 + param_11;
          }
          *(long *)(lVar3 + 0xb0) = lVar6;
          ERR_pop_to_mark();
          return lVar3;
        }
        pcVar9 = CRYPTO_strdup(param_2,"crypto/http/http_client.c",0x189);
        *(char **)(lVar3 + 0x50) = pcVar9;
        if (pcVar9 != (char *)0x0) goto LAB_00b18a40;
      }
      else {
        pcVar9 = CRYPTO_strdup(pcVar9,"crypto/http/http_client.c",0x183);
        *(char **)(lVar3 + 0x40) = pcVar9;
        if (pcVar9 != (char *)0x0) goto LAB_00b18a00;
      }
LAB_00b18a5c:
      OSSL_HTTP_REQ_CTX_free(lVar3);
LAB_00b18a74:
      ERR_clear_last_mark();
      return 0;
    }
LAB_00b1878c:
    if (param_3 == 0 && param_4 == 0) {
      ERR_set_mark();
      pcVar9 = (char *)0x0;
      iVar8 = 0;
      iVar1 = 0;
      if (param_7 == (BIO *)0x0) goto LAB_00b18990;
      a = param_6;
      pcVar9 = (char *)0x0;
      if (param_8 != (code *)0x0) goto LAB_00b18810;
      goto LAB_00b189bc;
    }
    ERR_new();
    uVar5 = 0x3b4;
  }
  else {
    if ((param_6 != (BIO *)0x0) && (param_8 == (code *)0x0)) goto LAB_00b1878c;
    ERR_new();
    uVar5 = 0x3ad;
  }
  ERR_set_debug("crypto/http/http_client.c",uVar5,"OSSL_HTTP_open");
  uVar5 = 0x80106;
LAB_00b187bc:
  ERR_set_error(0x3d,uVar5,0);
  return 0;
}

