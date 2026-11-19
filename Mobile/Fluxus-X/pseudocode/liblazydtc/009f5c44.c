/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f5c44
 */

ASN1_BIT_STRING * ossl_c2i_ASN1_BIT_STRING(long *param_1,long *param_2,long param_3)

{
  byte bVar1;
  uchar *__dest;
  ASN1_BIT_STRING *a;
  undefined8 uVar2;
  byte *__src;
  int num;
  byte *pbVar3;
  
  num = (int)param_3 + -1;
  if (param_3 < 1) {
    a = (ASN1_STRING *)0x0;
    uVar2 = 0x98;
  }
  else if (param_3 < 0x80000000) {
    if (((param_1 == (long *)0x0) || (a = (ASN1_BIT_STRING *)*param_1, a == (ASN1_BIT_STRING *)0x0))
       && (a = ASN1_BIT_STRING_new(), a == (ASN1_BIT_STRING *)0x0)) {
      return (ASN1_BIT_STRING *)0x0;
    }
    pbVar3 = (byte *)*param_2;
    __src = pbVar3 + 1;
    bVar1 = *pbVar3;
    if (bVar1 < 8) {
      a->flags = a->flags & 0xfffffffffffffff0U | (ulong)(bVar1 | 8);
      if (param_3 < 2) {
        __dest = (uchar *)0x0;
      }
      else {
        __dest = CRYPTO_malloc(num,"crypto/asn1/a_bitstr.c",0x75);
        if (__dest == (uchar *)0x0) {
          uVar2 = 0xc0100;
          goto LAB_009f5cc8;
        }
        memcpy(__dest,__src,(long)num);
        __src = pbVar3 + param_3;
        __dest[param_3 + -2] = __dest[param_3 + -2] & (byte)(0xff << (ulong)(bVar1 & 0x1f));
      }
      a->length = num;
      CRYPTO_free(a->data);
      a->data = __dest;
      a->type = 3;
      if (param_1 != (long *)0x0) {
        *param_1 = (long)a;
      }
      *param_2 = (long)__src;
      return a;
    }
    uVar2 = 0xdc;
  }
  else {
    a = (ASN1_STRING *)0x0;
    uVar2 = 0x97;
  }
LAB_009f5cc8:
  ERR_new();
  ERR_set_debug("crypto/asn1/a_bitstr.c",0x89,"ossl_c2i_ASN1_BIT_STRING");
  ERR_set_error(0xd,uVar2,0);
  if ((param_1 == (long *)0x0) || ((ASN1_STRING *)*param_1 != a)) {
    ASN1_BIT_STRING_free(a);
  }
  return (ASN1_BIT_STRING *)0x0;
}

