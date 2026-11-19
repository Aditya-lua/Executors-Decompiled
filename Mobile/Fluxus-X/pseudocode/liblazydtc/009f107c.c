/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f107c
 */

ASN1_STRING * ASN1_STRING_dup(ASN1_STRING *a)

{
  int iVar1;
  ASN1_STRING *str;
  ulong uVar2;
  uint uVar3;
  
  if (a == (ASN1_STRING *)0x0) {
    return (ASN1_STRING *)0x0;
  }
  str = (ASN1_STRING *)CRYPTO_zalloc(0x18,"crypto/asn1/asn1_lib.c",0x15e);
  if (str == (ASN1_STRING *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/asn1_lib.c",0x160,"ASN1_STRING_type_new");
    ERR_set_error(0xd,0xc0100,0);
  }
  else {
    str->type = 4;
    str->type = a->type;
    iVar1 = ASN1_STRING_set(str,a->data,a->length);
    if (iVar1 != 0) {
      uVar2 = str->flags & 0x80;
      str->flags = uVar2;
      str->flags = a->flags & 0xffffffffffffff7fU | uVar2;
      return str;
    }
    uVar3 = (uint)str->flags;
    if ((uVar3 >> 4 & 1) == 0) {
      CRYPTO_free(str->data);
    }
    if ((uVar3 >> 7 & 1) != 0) {
      return (ASN1_STRING *)0x0;
    }
    CRYPTO_free(str);
  }
  return (ASN1_STRING *)0x0;
}

