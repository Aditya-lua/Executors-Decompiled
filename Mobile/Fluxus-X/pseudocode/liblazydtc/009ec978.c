/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ec978
 */

ASN1_OBJECT * ossl_c2i_ASN1_OBJECT(long *param_1,long *param_2,long param_3)

{
  int n;
  ASN1_OBJECT *a;
  undefined8 uVar1;
  long lVar2;
  int num;
  uchar *puVar3;
  void *__src;
  ASN1_OBJECT AStack_78;
  
  if ((((param_2 == (long *)0x0) || (0x7ffffffe < param_3 - 1U)) ||
      (puVar3 = (uchar *)*param_2, puVar3 == (uchar *)0x0)) || ((char)puVar3[param_3 - 1U] < '\0'))
  {
    ERR_new();
    uVar1 = 0x103;
LAB_009eca1c:
    ERR_set_debug("crypto/asn1/a_object.c",uVar1,"ossl_c2i_ASN1_OBJECT");
    ERR_set_error(0xd,0xd8,0);
LAB_009eca30:
    a = (ASN1_OBJECT *)0x0;
  }
  else {
    num = (int)param_3;
    AStack_78.nid = 0;
    AStack_78.flags = 0;
    AStack_78.length = num;
    AStack_78.data = puVar3;
    n = OBJ_obj2nid(&AStack_78);
    if (n == 0) {
      lVar2 = 0;
      do {
        if (puVar3[lVar2] == 0x80) {
          ERR_new();
          uVar1 = 0x121;
          goto LAB_009eca1c;
        }
        lVar2 = lVar2 + 1;
      } while ((int)lVar2 < num);
      if (((param_1 == (long *)0x0) || (a = (ASN1_OBJECT *)*param_1, a == (ASN1_OBJECT *)0x0)) ||
         ((a->flags & 1) == 0)) {
        a = (ASN1_OBJECT *)CRYPTO_zalloc(0x28,"crypto/asn1/a_object.c",0x15b);
        if (a == (ASN1_OBJECT *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/asn1/a_object.c",0x15d,"ASN1_OBJECT_new");
          ERR_set_error(0xd,0xc0100,0);
          return (ASN1_OBJECT *)0x0;
        }
        a->flags = 1;
      }
      puVar3 = a->data;
      __src = (void *)*param_2;
      a->data = (uchar *)0x0;
      if ((puVar3 == (uchar *)0x0) || (a->length < num)) {
        a->length = 0;
        CRYPTO_free(puVar3);
        puVar3 = CRYPTO_malloc(num,"crypto/asn1/a_object.c",0x136);
        if (puVar3 == (uchar *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/asn1/a_object.c",0x151,"ossl_c2i_ASN1_OBJECT");
          ERR_set_error(0xd,0xc0100,0);
          if ((param_1 == (long *)0x0) || ((ASN1_OBJECT *)*param_1 != a)) {
            ASN1_OBJECT_free(a);
          }
          goto LAB_009eca30;
        }
        a->flags = a->flags | 8;
      }
      memcpy(puVar3,__src,(long)num);
      if (((byte)a->flags >> 2 & 1) != 0) {
        CRYPTO_free(a->sn);
        CRYPTO_free(a->ln);
        a->flags = a->flags & 0xfffffffb;
      }
      param_3 = (long)__src + (long)num;
      a->data = puVar3;
      a->length = num;
      a->sn = (char *)0x0;
      a->ln = (char **)0x0;
      if (param_1 != (long *)0x0) {
        *param_1 = (long)a;
      }
    }
    else {
      a = OBJ_nid2obj(n);
      if (param_1 != (long *)0x0) {
        ASN1_OBJECT_free((ASN1_OBJECT *)*param_1);
        *param_1 = (long)a;
      }
      param_3 = *param_2 + param_3;
    }
    *param_2 = param_3;
  }
  return a;
}

