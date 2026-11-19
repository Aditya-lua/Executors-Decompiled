/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f2b8c
 */

bool PKCS8_pkey_add1_attr_by_OBJ
               (long param_1,ASN1_OBJECT *param_2,int param_3,uchar *param_4,int param_5)

{
  stack_st_X509_ATTRIBUTE *psVar1;
  
  psVar1 = X509at_add1_attr_by_OBJ
                     ((stack_st_X509_ATTRIBUTE **)(param_1 + 0x18),param_2,param_3,param_4,param_5);
  return psVar1 != (stack_st_X509_ATTRIBUTE *)0x0;
}

