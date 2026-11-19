/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad5ab8
 */

int RSA_padding_add_PKCS1_type_1(uchar *to,int tlen,uchar *f,int fl)

{
  bool bVar1;
  uchar *__s;
  size_t __n;
  
  bVar1 = fl <= tlen + -0xb;
  if (bVar1) {
    __s = to + 2;
    to[0] = '\0';
    to[1] = '\x01';
    __n = (size_t)((tlen + -3) - fl);
    memset(__s,0xff,__n);
    __s[__n] = '\0';
    memcpy(__s + __n + 1,f,(ulong)(uint)fl);
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_pk1.c",0x23,"RSA_padding_add_PKCS1_type_1");
    ERR_set_error(4,0x6e,0);
  }
  return (int)bVar1;
}

