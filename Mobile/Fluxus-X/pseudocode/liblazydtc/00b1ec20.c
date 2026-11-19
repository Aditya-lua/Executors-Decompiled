/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1ec20
 */

X509 * d2i_X509_AUX(X509 **a,uchar **pp,long length)

{
  bool bVar1;
  X509 *val;
  X509_CERT_AUX *pXVar2;
  uchar *local_38;
  
  local_38 = *pp;
  if ((a == (X509 **)0x0) || (bVar1 = false, *a == (X509 *)0x0)) {
    bVar1 = true;
  }
  val = (X509 *)ASN1_item_d2i((ASN1_VALUE **)a,&local_38,length,(ASN1_ITEM *)&DAT_00c82968);
  if (val != (X509 *)0x0) {
    if ((0 < (long)(*pp + (length - (long)local_38))) &&
       (pXVar2 = d2i_X509_CERT_AUX((X509_CERT_AUX **)&val[1].altname,&local_38,
                                   (long)(*pp + (length - (long)local_38))),
       pXVar2 == (X509_CERT_AUX *)0x0)) {
      if (!bVar1) {
        return (X509 *)0x0;
      }
      ASN1_item_free((ASN1_VALUE *)val,(ASN1_ITEM *)&DAT_00c82968);
      if (a == (X509 **)0x0) {
        return (X509 *)0x0;
      }
      *a = (X509 *)0x0;
      return (X509 *)0x0;
    }
    *pp = local_38;
  }
  return val;
}

