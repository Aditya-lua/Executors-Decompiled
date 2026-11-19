/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f2180
 */

ASN1_STRING * ASN1_item_pack(void *obj,ASN1_ITEM *it,ASN1_OCTET_STRING **oct)

{
  int iVar1;
  undefined8 uVar2;
  ASN1_STRING *a;
  uchar **out;
  
  if (((oct == (ASN1_OCTET_STRING **)0x0) || (a = *oct, a == (ASN1_OCTET_STRING *)0x0)) &&
     (a = ASN1_STRING_new(), a == (ASN1_STRING *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/asn1/asn_pack.c",0x16,"ASN1_item_pack");
    ERR_set_error(0xd,0xc0100,0);
  }
  else {
    out = &a->data;
    CRYPTO_free(*out);
    *out = (uchar *)0x0;
    iVar1 = ASN1_item_i2d(obj,out,it);
    a->length = iVar1;
    if (iVar1 < 1) {
      ERR_new();
      ERR_set_debug("crypto/asn1/asn_pack.c",0x21,"ASN1_item_pack");
      uVar2 = 0x70;
    }
    else {
      if (*out != (uchar *)0x0) {
        if ((oct != (ASN1_OCTET_STRING **)0x0) && (*oct == (ASN1_OCTET_STRING *)0x0)) {
          *oct = a;
        }
        return a;
      }
      ERR_new();
      ERR_set_debug("crypto/asn1/asn_pack.c",0x25,"ASN1_item_pack");
      uVar2 = 0xc0100;
    }
    ERR_set_error(0xd,uVar2,0);
    if ((oct != (ASN1_OCTET_STRING **)0x0) && (*oct != (ASN1_OCTET_STRING *)0x0)) {
      return (ASN1_STRING *)0x0;
    }
    ASN1_STRING_free(a);
  }
  return (ASN1_STRING *)0x0;
}

