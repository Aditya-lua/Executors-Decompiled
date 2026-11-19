/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe3dc
 */

int ASN1_item_print(BIO *out,ASN1_VALUE *ifld,int indent,ASN1_ITEM *it,ASN1_PCTX *pctx)

{
  ASN1_PCTX *pAVar1;
  int iVar2;
  char *pcVar3;
  ASN1_VALUE *local_18;
  
  pAVar1 = (ASN1_PCTX *)&DAT_00cc9160;
  if (pctx != (ASN1_PCTX *)0x0) {
    pAVar1 = pctx;
  }
  pcVar3 = (char *)0x0;
  if (((byte)pAVar1[1] & 1) == 0) {
    pcVar3 = it->sname;
  }
  local_18 = ifld;
  iVar2 = FUN_00abe428((int)out,&local_18,indent,it,0,pcVar3,0);
  return iVar2;
}

