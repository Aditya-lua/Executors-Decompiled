/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1856c
 */

ulong OSSL_HTTP_REQ_CTX_nbio_d2i(long param_1,undefined8 *param_2,ASN1_ITEM *param_3)

{
  ulong uVar1;
  long len;
  ASN1_VALUE *pAVar2;
  uchar *puStack_28;
  
  *param_2 = 0;
  uVar1 = OSSL_HTTP_REQ_CTX_nbio();
  if ((int)uVar1 == 1) {
    len = BIO_ctrl(*(BIO **)(param_1 + 0x58),3,0,&puStack_28);
    pAVar2 = ASN1_item_d2i((ASN1_VALUE **)0x0,&puStack_28,len,param_3);
    *param_2 = pAVar2;
    uVar1 = (ulong)(pAVar2 != (ASN1_VALUE *)0x0);
  }
  return uVar1;
}

