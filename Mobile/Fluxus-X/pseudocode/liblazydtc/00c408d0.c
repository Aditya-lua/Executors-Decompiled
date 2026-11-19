/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c408d0
 */

stack_st_CONF_VALUE *
i2v_GENERAL_NAMES(X509V3_EXT_METHOD *method,GENERAL_NAMES *gen,stack_st_CONF_VALUE *extlist)

{
  stack_st_CONF_VALUE *psVar1;
  
  psVar1 = i2v_GENERAL_NAMES(method,gen,extlist);
  return psVar1;
}

