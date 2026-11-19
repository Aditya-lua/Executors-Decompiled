/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abce04
 */

int PKCS12_add_friendlyname_uni(PKCS12_SAFEBAG *bag,uchar *name,int namelen)

{
  stack_st_X509_ATTRIBUTE *psVar1;
  
  psVar1 = X509at_add1_attr_by_NID(&bag->attrib,0x9c,0x1002,name,namelen);
  return (int)(psVar1 != (stack_st_X509_ATTRIBUTE *)0x0);
}

