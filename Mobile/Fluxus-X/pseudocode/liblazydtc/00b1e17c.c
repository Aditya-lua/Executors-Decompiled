/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1e17c
 */

int X509_PUBKEY_set0_param
              (X509_PUBKEY *pub,ASN1_OBJECT *aobj,int ptype,void *pval,uchar *penc,int penclen)

{
  int iVar1;
  int iVar2;
  ASN1_BIT_STRING *pAVar3;
  
  iVar1 = X509_ALGOR_set0(pub->algor,aobj,ptype,pval);
  iVar2 = 0;
  if (iVar1 != 0) {
    if (penc != (uchar *)0x0) {
      CRYPTO_free(pub->public_key->data);
      pAVar3 = pub->public_key;
      pAVar3->length = penclen;
      pAVar3->data = penc;
      pAVar3->flags = pAVar3->flags & 0xfffffffffffffff0U | 8;
    }
    iVar2 = 1;
  }
  return iVar2;
}

