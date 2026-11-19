/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a60860
 */

int EVP_PKEY_get_attr_by_NID(EVP_PKEY *key,int nid,int lastpos)

{
  int iVar1;
  
  iVar1 = X509at_get_attr_by_NID(*(stack_st_X509_ATTRIBUTE **)&key[1].references,nid,lastpos);
  return iVar1;
}

