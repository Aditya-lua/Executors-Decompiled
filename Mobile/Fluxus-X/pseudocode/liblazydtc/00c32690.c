/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32690
 */

int PKCS12_parse(PKCS12 *p12,char *pass,EVP_PKEY **pkey,X509 **cert,stack_st_X509 **ca)

{
  int iVar1;
  
  iVar1 = PKCS12_parse(p12,pass,pkey,cert,ca);
  return iVar1;
}

