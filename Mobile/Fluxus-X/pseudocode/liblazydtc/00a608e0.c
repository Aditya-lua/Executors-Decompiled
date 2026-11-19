/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a608e0
 */

int EVP_PKEY_add1_attr_by_txt(EVP_PKEY *key,char *attrname,int type,uchar *bytes,int len)

{
  stack_st_X509_ATTRIBUTE *psVar1;
  
  psVar1 = X509at_add1_attr_by_txt
                     ((stack_st_X509_ATTRIBUTE **)&key[1].references,attrname,type,bytes,len);
  return (int)(psVar1 != (stack_st_X509_ATTRIBUTE *)0x0);
}

