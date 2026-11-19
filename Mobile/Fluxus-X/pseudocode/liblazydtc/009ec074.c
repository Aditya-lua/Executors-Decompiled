/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ec074
 */

int i2d_ASN1_OBJECT(ASN1_OBJECT *a,uchar **pp)

{
  int num;
  uchar *puVar1;
  uchar *local_38;
  
  if ((a == (ASN1_OBJECT *)0x0) || (a->data == (uchar *)0x0)) {
    num = 0;
  }
  else {
    num = ASN1_object_size(0,a->length,6);
    if ((pp != (uchar **)0x0) && (num != -1)) {
      if (*pp == (uchar *)0x0) {
        puVar1 = CRYPTO_malloc(num,"crypto/asn1/a_object.c",0x22);
        local_38 = puVar1;
        if (puVar1 == (uchar *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/asn1/a_object.c",0x23,"i2d_ASN1_OBJECT");
          ERR_set_error(0xd,0xc0100,0);
          return 0;
        }
      }
      else {
        puVar1 = (uchar *)0x0;
        local_38 = *pp;
      }
      ASN1_put_object(&local_38,0,a->length,6,0);
      memcpy(local_38,a->data,(long)a->length);
      if (puVar1 == (uchar *)0x0) {
        puVar1 = local_38 + a->length;
      }
      *pp = puVar1;
    }
  }
  return num;
}

