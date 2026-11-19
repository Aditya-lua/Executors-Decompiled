/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abcdd4
 */

bool PKCS12_add_friendlyname_utf8(long param_1,uchar *param_2,int param_3)

{
  stack_st_X509_ATTRIBUTE *psVar1;
  
  psVar1 = X509at_add1_attr_by_NID
                     ((stack_st_X509_ATTRIBUTE **)(param_1 + 0x10),0x9c,0x1000,param_2,param_3);
  return psVar1 != (stack_st_X509_ATTRIBUTE *)0x0;
}

