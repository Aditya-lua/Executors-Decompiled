/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a25a00
 */

EC_GROUP * d2i_ECPKParameters(EC_GROUP **param_1,uchar **in,long len)

{
  ASN1_VALUE *val;
  EC_GROUP *pEVar1;
  uchar *local_38;
  
  local_38 = *in;
  val = ASN1_item_d2i((ASN1_VALUE **)0x0,&local_38,len,(ASN1_ITEM *)&DAT_00c5ade8);
  if (val == (ASN1_VALUE *)0x0) {
    ASN1_item_free((ASN1_VALUE *)0x0,(ASN1_ITEM *)&DAT_00c5ade8);
    pEVar1 = (EC_GROUP *)0x0;
  }
  else {
    pEVar1 = (EC_GROUP *)EC_GROUP_new_from_ecpkparameters();
    if (pEVar1 == (EC_GROUP *)0x0) {
      ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c5ade8);
    }
    else {
      if (*(int *)val == 1) {
        *(undefined4 *)(pEVar1 + 0x28) = 1;
      }
      if (param_1 != (EC_GROUP **)0x0) {
        EC_GROUP_free(*param_1);
        *param_1 = pEVar1;
      }
      ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c5ade8);
      *in = local_38;
    }
  }
  return pEVar1;
}

