/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3d0d0
 */

stack_st_X509_ATTRIBUTE *
X509at_add1_attr_by_txt(stack_st_X509_ATTRIBUTE **x,char *attrname,int type,uchar *bytes,int len)

{
  stack_st_X509_ATTRIBUTE *psVar1;
  
  psVar1 = X509at_add1_attr_by_txt(x,attrname,type,bytes,len);
  return psVar1;
}

