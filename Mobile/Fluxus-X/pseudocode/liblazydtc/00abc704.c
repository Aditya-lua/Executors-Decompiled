/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abc704
 */

void PKCS8_get_attr(undefined8 param_1,int param_2)

{
  stack_st_X509_ATTRIBUTE *attrs;
  
  attrs = (stack_st_X509_ATTRIBUTE *)PKCS8_pkey_get0_attrs();
  PKCS12_get_attr_gen(attrs,param_2);
  return;
}

