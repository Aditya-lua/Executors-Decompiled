/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f0f54
 */

int ASN1_STRING_set(ASN1_STRING *str,void *data,int len)

{
  uchar *__dest;
  size_t __n;
  uchar *addr;
  
  if (len < 0) {
    if (data == (void *)0x0) {
      return 0;
    }
    __n = strlen(data);
  }
  else {
    __n = (size_t)len;
  }
  if (0x7ffffffe < __n) {
    ERR_new();
    ERR_set_debug("crypto/asn1/asn1_lib.c",299,"ASN1_STRING_set");
    ERR_set_error(0xd,0xdf,0);
    return 0;
  }
  __dest = str->data;
  if (__n < (ulong)(long)str->length) {
    if (__dest != (uchar *)0x0) goto LAB_009f1008;
    addr = (uchar *)0x0;
  }
  else {
    addr = __dest;
  }
  __dest = CRYPTO_realloc(addr,(int)__n + 1,"crypto/asn1/asn1_lib.c",0x134);
  str->data = __dest;
  if (__dest == (uchar *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/asn1_lib.c",0x137,"ASN1_STRING_set");
    ERR_set_error(0xd,0xc0100,0);
    str->data = addr;
    return 0;
  }
LAB_009f1008:
  str->length = (int)__n;
  if (data != (void *)0x0) {
    memcpy(__dest,data,__n);
    str->data[__n] = '\0';
  }
  return 1;
}

