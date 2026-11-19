/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f3ce4
 */

ASN1_VALUE *
ASN1_item_d2i_ex(ASN1_VALUE **param_1,undefined8 param_2,undefined8 param_3,ASN1_ITEM *param_4)

{
  ASN1_VALUE **pval;
  int iVar1;
  ASN1_VALUE *local_48;
  undefined1 local_40;
  
  pval = &local_48;
  if (param_1 != (ASN1_VALUE **)0x0) {
    pval = param_1;
  }
  local_48 = (ASN1_VALUE *)0x0;
  local_40 = 0;
  if (param_4 == (ASN1_ITEM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_dec.c",0x73,"asn1_item_ex_d2i_intern");
    ERR_set_error(0xd,0xc0102,0);
  }
  else {
    iVar1 = FUN_009f3da0(pval);
    if (0 < iVar1) {
      return *pval;
    }
    ASN1_item_ex_free(pval,param_4);
  }
  return (ASN1_VALUE *)0x0;
}

