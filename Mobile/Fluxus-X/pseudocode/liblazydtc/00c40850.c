/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c40850
 */

stack_st_CONF_VALUE *
i2v_GENERAL_NAME(X509V3_EXT_METHOD *method,GENERAL_NAME *gen,stack_st_CONF_VALUE *ret)

{
  stack_st_CONF_VALUE *psVar1;
  
  psVar1 = i2v_GENERAL_NAME(method,gen,ret);
  return psVar1;
}

