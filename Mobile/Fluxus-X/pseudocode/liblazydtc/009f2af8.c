/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f2af8
 */

int PKCS8_pkey_get0(ASN1_OBJECT **ppkalg,uchar **pk,int *ppklen,X509_ALGOR **pa,
                   PKCS8_PRIV_KEY_INFO *p8)

{
  int iVar1;
  uchar *puVar2;
  
  if (ppkalg != (ASN1_OBJECT **)0x0) {
    *ppkalg = *(ASN1_OBJECT **)p8->version;
  }
  if (pk != (uchar **)0x0) {
    puVar2 = (uchar *)ASN1_STRING_get0_data(p8->pkeyalg);
    *pk = puVar2;
    iVar1 = ASN1_STRING_length((ASN1_STRING *)p8->pkeyalg);
    *ppklen = iVar1;
  }
  if (pa != (X509_ALGOR **)0x0) {
    *pa = (X509_ALGOR *)p8->version;
  }
  return 1;
}

