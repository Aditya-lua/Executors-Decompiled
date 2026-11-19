/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af89bc
 */

stack_st_CONF_VALUE *
FUN_00af89bc(undefined8 param_1,undefined8 *param_2,stack_st_CONF_VALUE *param_3)

{
  undefined4 uVar1;
  int iVar2;
  char *pcVar3;
  char *name;
  stack_st_CONF_VALUE *psVar4;
  GENERAL_NAMES *gen;
  undefined8 uVar5;
  int *piVar6;
  stack_st_CONF_VALUE *local_38;
  
  piVar6 = (int *)*param_2;
  local_38 = param_3;
  if (piVar6 == (int *)0x0) {
    gen = (GENERAL_NAMES *)param_2[1];
    if (gen == (GENERAL_NAMES *)0x0) goto LAB_00af8a44;
LAB_00af8a5c:
    psVar4 = i2v_GENERAL_NAMES((X509V3_EXT_METHOD *)0x0,gen,local_38);
    if (psVar4 == (stack_st_CONF_VALUE *)0x0) {
      ERR_new();
      uVar5 = 0x3f;
      goto LAB_00af8b3c;
    }
    piVar6 = (int *)param_2[2];
    local_38 = psVar4;
joined_r0x00af8a74:
    if (piVar6 == (int *)0x0) {
      return local_38;
    }
    pcVar3 = (char *)OPENSSL_buf2hexstr(*(undefined8 *)(piVar6 + 2),(long)*piVar6);
    if (pcVar3 != (char *)0x0) {
      iVar2 = X509V3_add_value("serial",pcVar3,&local_38);
      if (iVar2 != 0) {
        CRYPTO_free(pcVar3);
        return local_38;
      }
      CRYPTO_free(pcVar3);
      goto joined_r0x00af8b84;
    }
    ERR_new();
    ERR_set_debug("crypto/x509/v3_akid.c",0x47,"i2v_AUTHORITY_KEYID");
    uVar1 = 0xc0100;
  }
  else {
    pcVar3 = (char *)OPENSSL_buf2hexstr(*(undefined8 *)(piVar6 + 2),(long)*piVar6);
    if (pcVar3 == (char *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/x509/v3_akid.c",0x31,"i2v_AUTHORITY_KEYID");
      ERR_set_error(0x22,0xc0100,0);
      return (stack_st_CONF_VALUE *)0x0;
    }
    name = "keyid";
    if ((param_2[1] == 0) && (name = (char *)0x0, param_2[2] != 0)) {
      name = "keyid";
    }
    iVar2 = X509V3_add_value(name,pcVar3,&local_38);
    if (iVar2 != 0) {
      CRYPTO_free(pcVar3);
      gen = (GENERAL_NAMES *)param_2[1];
      if (gen != (GENERAL_NAMES *)0x0) goto LAB_00af8a5c;
LAB_00af8a44:
      piVar6 = (int *)param_2[2];
      goto joined_r0x00af8a74;
    }
    CRYPTO_free(pcVar3);
    ERR_new();
    uVar5 = 0x37;
LAB_00af8b3c:
    ERR_set_debug("crypto/x509/v3_akid.c",uVar5,"i2v_AUTHORITY_KEYID");
    uVar1 = 0x8000b;
  }
  ERR_set_error(0x22,uVar1,0);
joined_r0x00af8b84:
  if (param_3 == (stack_st_CONF_VALUE *)0x0) {
    OPENSSL_sk_pop_free(local_38,X509V3_conf_free);
    return (stack_st_CONF_VALUE *)0x0;
  }
  return (stack_st_CONF_VALUE *)0x0;
}

