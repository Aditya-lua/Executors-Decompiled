/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a608c0
 */

int EVP_PKEY_add1_attr_by_NID(EVP_PKEY *key,int nid,int type,uchar *bytes,int len)

{
  stack_st_X509_ATTRIBUTE *psVar1;
  
  psVar1 = X509at_add1_attr_by_NID
                     ((stack_st_X509_ATTRIBUTE **)&key[1].references,nid,type,bytes,len);
  return (int)(psVar1 != (stack_st_X509_ATTRIBUTE *)0x0);
}

