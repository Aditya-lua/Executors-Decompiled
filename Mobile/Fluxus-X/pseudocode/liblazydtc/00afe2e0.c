/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afe2e0
 */

stack_st_CONF_VALUE *
FUN_00afe2e0(undefined8 param_1,undefined8 param_2,stack_st_CONF_VALUE *param_3)

{
  int iVar1;
  int iVar2;
  ASN1_OBJECT *a;
  char acStack_78 [80];
  stack_st_CONF_VALUE *local_28;
  
  local_28 = param_3;
  iVar1 = OPENSSL_sk_num(param_2);
  if (0 < iVar1) {
    iVar1 = 0;
    do {
      a = (ASN1_OBJECT *)OPENSSL_sk_value(param_2,iVar1);
      i2t_ASN1_OBJECT(acStack_78,0x50,a);
      X509V3_add_value((char *)0x0,acStack_78,&local_28);
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(param_2);
    } while (iVar1 < iVar2);
    param_3 = local_28;
  }
  return param_3;
}

