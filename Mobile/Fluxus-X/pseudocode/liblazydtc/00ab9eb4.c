/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab9eb4
 */

BIO * ASN1_item_i2d_mem_bio(ASN1_ITEM *param_1,void *param_2)

{
  int iVar1;
  BIO_METHOD *type;
  BIO *out;
  
  if ((param_1 == (ASN1_ITEM *)0x0) || (param_2 == (void *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_i2d_fp.c",0x76,"ASN1_item_i2d_mem_bio");
    ERR_set_error(0xd,0xc0102,0);
  }
  else {
    type = BIO_s_mem();
    out = BIO_new(type);
    if (out == (BIO *)0x0) {
      return (BIO *)0x0;
    }
    iVar1 = ASN1_item_i2d_bio(param_1,out,param_2);
    if (0 < iVar1) {
      return out;
    }
    BIO_free(out);
  }
  return (BIO *)0x0;
}

