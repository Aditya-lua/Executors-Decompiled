/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b012f0
 */

stack_st_CONF_VALUE *
FUN_00b012f0(undefined8 param_1,undefined8 param_2,stack_st_CONF_VALUE *param_3)

{
  int iVar1;
  int iVar2;
  undefined8 *puVar3;
  char acStack_d0 [80];
  char acStack_80 [80];
  stack_st_CONF_VALUE *local_28;
  
  local_28 = param_3;
  iVar1 = OPENSSL_sk_num(param_2);
  if (0 < iVar1) {
    iVar1 = 0;
    do {
      puVar3 = (undefined8 *)OPENSSL_sk_value(param_2,iVar1);
      i2t_ASN1_OBJECT(acStack_80,0x50,(ASN1_OBJECT *)*puVar3);
      i2t_ASN1_OBJECT(acStack_d0,0x50,(ASN1_OBJECT *)puVar3[1]);
      X509V3_add_value(acStack_80,acStack_d0,&local_28);
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(param_2);
    } while (iVar1 < iVar2);
    param_3 = local_28;
  }
  return param_3;
}

