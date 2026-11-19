/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f3c48
 */

int ASN1_item_ex_d2i(ASN1_VALUE **pval,uchar **in,long len,ASN1_ITEM *it,int tag,int aclass,char opt
                    ,ASN1_TLC *ctx)

{
  int iVar1;
  
  if ((pval == (ASN1_VALUE **)0x0) || (it == (ASN1_ITEM *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_dec.c",0x73,"asn1_item_ex_d2i_intern");
    ERR_set_error(0xd,0xc0102,0);
    iVar1 = 0;
  }
  else {
    iVar1 = FUN_009f3da0();
    if (iVar1 < 1) {
      ASN1_item_ex_free(pval,it);
    }
  }
  return iVar1;
}

