/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f6010
 */

int FUN_009f6010(ASN1_VALUE *param_1,uchar **param_2,ASN1_ITEM *param_3,int param_4)

{
  int num;
  uchar *puVar1;
  uchar *local_48;
  ASN1_VALUE *pAStack_38;
  
  pAStack_38 = param_1;
  if ((param_2 == (uchar **)0x0) || (*param_2 != (uchar *)0x0)) {
    num = ASN1_item_ex_i2d(&pAStack_38,param_2,param_3,-1,param_4);
  }
  else {
    num = ASN1_item_ex_i2d(&pAStack_38,(uchar **)0x0,param_3,-1,param_4);
    if (0 < num) {
      puVar1 = CRYPTO_malloc(num,"crypto/asn1/tasn_enc.c",0x41);
      if (puVar1 == (uchar *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/asn1/tasn_enc.c",0x42,"asn1_item_flags_i2d");
        ERR_set_error(0xd,0xc0100,0);
        num = -1;
      }
      else {
        local_48 = puVar1;
        ASN1_item_ex_i2d(&pAStack_38,&local_48,param_3,-1,param_4);
        *param_2 = puVar1;
      }
    }
  }
  return num;
}

