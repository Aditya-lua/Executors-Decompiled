/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c37f00
 */

stack_st_X509_ATTRIBUTE *
X509at_add1_attr_by_NID(stack_st_X509_ATTRIBUTE **x,int nid,int type,uchar *bytes,int len)

{
  stack_st_X509_ATTRIBUTE *psVar1;
  
  psVar1 = X509at_add1_attr_by_NID(x,nid,type,bytes,len);
  return psVar1;
}

