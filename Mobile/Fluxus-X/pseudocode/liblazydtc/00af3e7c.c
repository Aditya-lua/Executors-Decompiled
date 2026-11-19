/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af3e7c
 */

X509_EXTENSION * X509V3_EXT_nconf(CONF *conf,X509V3_CTX *ctx,char *name,char *value)

{
  X509_EXTENSION *pXVar1;
  
  pXVar1 = (X509_EXTENSION *)FUN_00af3e8c(conf,ctx,0,name,value);
  return pXVar1;
}

