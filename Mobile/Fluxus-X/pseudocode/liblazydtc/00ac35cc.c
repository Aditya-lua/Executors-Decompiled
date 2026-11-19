/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac35cc
 */

PKCS7_RECIP_INFO * PKCS7_add_recipient(PKCS7 *p7,X509 *x509)

{
  int iVar1;
  PKCS7_RECIP_INFO *p7i;
  PKCS7_SIGNED *pPVar2;
  
  p7i = PKCS7_RECIP_INFO_new();
  if ((p7i != (PKCS7_RECIP_INFO *)0x0) && (iVar1 = PKCS7_RECIP_INFO_set(p7i,x509), 0 < iVar1)) {
    iVar1 = OBJ_obj2nid(p7->type);
    if (iVar1 == 0x17) {
      pPVar2 = (PKCS7_SIGNED *)&((p7->d).data)->data;
    }
    else {
      if (iVar1 != 0x18) {
        ERR_new();
        ERR_set_debug("crypto/pkcs7/pk7_lib.c",0x254,"PKCS7_add_recipient_info");
        ERR_set_error(0x21,0x71,0);
        goto LAB_00ac3678;
      }
      pPVar2 = (p7->d).sign + 1;
    }
    iVar1 = OPENSSL_sk_push(pPVar2->version,p7i);
    if (iVar1 != 0) {
      p7i[1].version = (ASN1_INTEGER *)(p7 + 1);
      return p7i;
    }
  }
LAB_00ac3678:
  PKCS7_RECIP_INFO_free(p7i);
  return (PKCS7_RECIP_INFO *)0x0;
}

