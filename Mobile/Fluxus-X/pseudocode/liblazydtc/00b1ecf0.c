/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1ecf0
 */

int i2d_X509_AUX(X509 *a,uchar **pp)

{
  int iVar1;
  int iVar2;
  uchar *puVar3;
  uchar *local_38;
  
  if (pp == (uchar **)0x0) {
    puVar3 = (uchar *)0x0;
LAB_00b1edc4:
    iVar1 = ASN1_item_i2d((ASN1_VALUE *)a,pp,(ASN1_ITEM *)&DAT_00c82968);
    if (a == (X509 *)0x0) {
      return iVar1;
    }
    if (iVar1 < 1) {
      return iVar1;
    }
    iVar2 = i2d_X509_CERT_AUX((X509_CERT_AUX *)a[1].altname,pp);
    if (-1 < iVar2) {
      return iVar2 + iVar1;
    }
    if (puVar3 != (uchar *)0x0) {
      *pp = puVar3;
    }
    return iVar2;
  }
  puVar3 = *pp;
  if (puVar3 != (uchar *)0x0) goto LAB_00b1edc4;
  iVar1 = ASN1_item_i2d((ASN1_VALUE *)a,(uchar **)0x0,(ASN1_ITEM *)&DAT_00c82968);
  if ((a != (X509 *)0x0) && (0 < iVar1)) {
    iVar2 = i2d_X509_CERT_AUX((X509_CERT_AUX *)a[1].altname,(uchar **)0x0);
    if (iVar2 < 0) {
      return iVar2;
    }
    iVar1 = iVar2 + iVar1;
  }
  if (iVar1 < 1) {
    return iVar1;
  }
  puVar3 = CRYPTO_malloc(iVar1,"crypto/x509/x_x509.c",0x112);
  *pp = puVar3;
  local_38 = puVar3;
  if (puVar3 == (uchar *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x_x509.c",0x114,"i2d_X509_AUX");
    ERR_set_error(0xb,0xc0100,0);
    return -1;
  }
  iVar2 = ASN1_item_i2d((ASN1_VALUE *)a,&local_38,(ASN1_ITEM *)&DAT_00c82968);
  iVar1 = iVar2;
  if ((a != (X509 *)0x0) && (0 < iVar2)) {
    iVar1 = i2d_X509_CERT_AUX((X509_CERT_AUX *)a[1].altname,&local_38);
    if (iVar1 < 0) {
      local_38 = puVar3;
      goto LAB_00b1ee64;
    }
    iVar1 = iVar1 + iVar2;
  }
  if (0 < iVar1) {
    return iVar1;
  }
LAB_00b1ee64:
  CRYPTO_free(*pp);
  *pp = (uchar *)0x0;
  return iVar1;
}

