/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c40860
 */

GENERAL_NAME *
v2i_GENERAL_NAME_ex(GENERAL_NAME *out,X509V3_EXT_METHOD *method,X509V3_CTX *ctx,CONF_VALUE *cnf,
                   int is_nc)

{
  GENERAL_NAME *pGVar1;
  
  pGVar1 = v2i_GENERAL_NAME_ex(out,method,ctx,cnf,is_nc);
  return pGVar1;
}

