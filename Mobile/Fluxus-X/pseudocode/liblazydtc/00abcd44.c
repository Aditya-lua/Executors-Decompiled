/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abcd44
 */

int PKCS12_add_localkeyid(PKCS12_SAFEBAG *bag,uchar *name,int namelen)

{
  stack_st_X509_ATTRIBUTE *psVar1;
  
  psVar1 = X509at_add1_attr_by_NID(&bag->attrib,0x9d,4,name,namelen);
  return (int)(psVar1 != (stack_st_X509_ATTRIBUTE *)0x0);
}

