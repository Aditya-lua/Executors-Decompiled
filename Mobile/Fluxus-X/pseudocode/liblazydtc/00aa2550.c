/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa2550
 */

ulong FUN_00aa2550(long param_1,undefined8 param_2,long param_3,char *param_4,CONF *param_5,
                  undefined8 param_6)

{
  int iVar1;
  int iVar2;
  uint uVar3;
  stack_st_CONF_VALUE *psVar4;
  char *pcVar5;
  size_t sVar6;
  long lVar7;
  size_t sVar8;
  ulong uVar9;
  char acStack_268 [520];
  
  psVar4 = NCONF_get_section(param_5,param_4);
  if (psVar4 == (stack_st_CONF_VALUE *)0x0) {
    if (param_1 == 0) {
      uVar9 = ossl_provider_info_add_parameter(param_2,param_3,param_4);
      return uVar9;
    }
    uVar9 = ossl_provider_add_parameter(param_1,param_3,param_4);
    return uVar9;
  }
  iVar1 = OPENSSL_sk_num(param_6);
  if (0 < iVar1) {
    iVar1 = 0;
    do {
      pcVar5 = (char *)OPENSSL_sk_value(param_6,iVar1);
      if (pcVar5 == param_4) {
        ERR_new();
        ERR_set_debug("crypto/provider_conf.c",0x6a,"provider_conf_params_internal");
        ERR_set_error(0xe,0x7e,0);
        goto LAB_00aa270c;
      }
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(param_6);
    } while (iVar1 < iVar2);
  }
  iVar1 = OPENSSL_sk_push(param_6,param_4);
  if (iVar1 == 0) {
LAB_00aa270c:
    uVar9 = 0xffffffff;
  }
  else {
    sVar6 = 0;
    if (param_3 != 0) {
      OPENSSL_strlcpy(acStack_268,param_3,0x200);
      OPENSSL_strlcat(acStack_268,&DAT_002ab502,0x200);
      sVar6 = strlen(acStack_268);
    }
    iVar1 = OPENSSL_sk_num(psVar4);
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        lVar7 = OPENSSL_sk_value(psVar4,iVar1);
        sVar8 = strlen(*(char **)(lVar7 + 8));
        if (0x1ff < sVar8 + sVar6) {
          OPENSSL_sk_pop(param_6);
          return 0xffffffff;
        }
        acStack_268[sVar6] = '\0';
        OPENSSL_strlcat(acStack_268,*(undefined8 *)(lVar7 + 8),0x200);
        uVar3 = FUN_00aa2550(param_1,param_2,acStack_268,*(undefined8 *)(lVar7 + 0x10),param_5,
                             param_6);
        if ((int)uVar3 < 0) {
          OPENSSL_sk_pop(param_6);
          return (ulong)uVar3;
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(psVar4);
      } while (iVar1 < iVar2);
    }
    OPENSSL_sk_pop(param_6);
    uVar9 = 1;
  }
  return uVar9;
}

