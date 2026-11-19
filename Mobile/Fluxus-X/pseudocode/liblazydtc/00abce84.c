/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abce84
 */

bool PKCS12_add1_attr_by_txt(long param_1,char *param_2,int param_3,uchar *param_4,int param_5)

{
  stack_st_X509_ATTRIBUTE *psVar1;
  
  psVar1 = X509at_add1_attr_by_txt
                     ((stack_st_X509_ATTRIBUTE **)(param_1 + 0x10),param_2,param_3,param_4,param_5);
  return psVar1 != (stack_st_X509_ATTRIBUTE *)0x0;
}

