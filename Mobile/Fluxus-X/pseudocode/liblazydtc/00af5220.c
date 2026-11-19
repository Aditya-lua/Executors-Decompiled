/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5220
 */

stack_st_CONF_VALUE *
FUN_00af5220(X509V3_EXT_METHOD *param_1,undefined8 param_2,stack_st_CONF_VALUE *param_3)

{
  long lVar1;
  int iVar2;
  int iVar3;
  undefined8 *puVar4;
  stack_st_CONF_VALUE *psVar5;
  long lVar6;
  size_t sVar7;
  size_t sVar8;
  char *param0;
  stack_st_CONF_VALUE *psVar9;
  char acStack_b0 [80];
  
  iVar2 = OPENSSL_sk_num(param_2);
  if (iVar2 < 1) {
    psVar5 = param_3;
    if (param_3 == (stack_st_CONF_VALUE *)0x0) {
      psVar5 = (stack_st_CONF_VALUE *)OPENSSL_sk_new_null();
    }
  }
  else {
    iVar2 = 0;
    psVar9 = param_3;
    do {
      puVar4 = (undefined8 *)OPENSSL_sk_value(param_2,iVar2);
      psVar5 = i2v_GENERAL_NAME(param_1,(GENERAL_NAME *)puVar4[1],psVar9);
      if (psVar5 == (stack_st_CONF_VALUE *)0x0) {
LAB_00af535c:
        ERR_new();
        ERR_set_debug("crypto/x509/v3_info.c",0x5e,"i2v_AUTHORITY_INFO_ACCESS");
        ERR_set_error(0x22,0xc0100,0);
        if (param_3 == (stack_st_CONF_VALUE *)0x0) {
          if (psVar9 == (stack_st_CONF_VALUE *)0x0) {
            return (stack_st_CONF_VALUE *)0x0;
          }
          OPENSSL_sk_pop_free(psVar9,X509V3_conf_free);
        }
        return (stack_st_CONF_VALUE *)0x0;
      }
      lVar6 = OPENSSL_sk_value(psVar5,iVar2);
      i2t_ASN1_OBJECT(acStack_b0,0x50,(ASN1_OBJECT *)*puVar4);
      sVar7 = strlen(acStack_b0);
      sVar8 = strlen(*(char **)(lVar6 + 8));
      lVar1 = ((ulong)((int)sVar7 + (int)sVar8 + 3) << 0x20) + 0x100000000;
      param0 = CRYPTO_malloc((int)((ulong)lVar1 >> 0x20),"crypto/x509/v3_info.c",0x52);
      psVar9 = psVar5;
      if (param0 == (char *)0x0) goto LAB_00af535c;
      BIO_snprintf(param0,lVar1 >> 0x20,"%s - %s",acStack_b0,*(char **)(lVar6 + 8));
      CRYPTO_free(*(void **)(lVar6 + 8));
      *(char **)(lVar6 + 8) = param0;
      iVar2 = iVar2 + 1;
      iVar3 = OPENSSL_sk_num(param_2);
    } while (iVar2 < iVar3);
  }
  return psVar5;
}

