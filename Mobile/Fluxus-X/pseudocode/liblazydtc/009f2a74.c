/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f2a74
 */

int PKCS8_pkey_set0(PKCS8_PRIV_KEY_INFO *priv,ASN1_OBJECT *aobj,int version,int ptype,void *pval,
                   uchar *penc,int penclen)

{
  int iVar1;
  int iVar2;
  
  if (((version < 0) ||
      (iVar1 = ASN1_INTEGER_set(*(ASN1_INTEGER **)priv,(long)version), iVar2 = 0, iVar1 != 0)) &&
     (iVar1 = X509_ALGOR_set0((X509_ALGOR *)priv->version,aobj,ptype,pval), iVar2 = 0, iVar1 != 0))
  {
    if (penc != (uchar *)0x0) {
      ASN1_STRING_set0((ASN1_STRING *)priv->pkeyalg,penc,penclen);
    }
    iVar2 = 1;
  }
  return iVar2;
}

