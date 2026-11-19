/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b03728
 */

stack_st_CONF_VALUE *
i2v_GENERAL_NAMES(X509V3_EXT_METHOD *method,GENERAL_NAMES *gen,stack_st_CONF_VALUE *extlist)

{
  int iVar1;
  int iVar2;
  X509V3_EXT_METHOD *method_00;
  stack_st_CONF_VALUE *psVar3;
  stack_st_CONF_VALUE *ret;
  
  iVar1 = OPENSSL_sk_num(gen);
  if (iVar1 < 1) {
    psVar3 = extlist;
    if (extlist == (stack_st_CONF_VALUE *)0x0) {
      psVar3 = (stack_st_CONF_VALUE *)OPENSSL_sk_new_null();
    }
  }
  else {
    iVar1 = 0;
    ret = extlist;
    do {
      method_00 = (X509V3_EXT_METHOD *)OPENSSL_sk_value(gen,iVar1);
      psVar3 = i2v_GENERAL_NAME(method_00,(GENERAL_NAME *)method_00,ret);
      if (psVar3 == (stack_st_CONF_VALUE *)0x0) {
        if (extlist == (stack_st_CONF_VALUE *)0x0) {
          OPENSSL_sk_pop_free(ret,X509V3_conf_free);
          return (stack_st_CONF_VALUE *)0x0;
        }
        return (stack_st_CONF_VALUE *)0x0;
      }
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(gen);
      ret = psVar3;
    } while (iVar1 < iVar2);
  }
  return psVar3;
}

