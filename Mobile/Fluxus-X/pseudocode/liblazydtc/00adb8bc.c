/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adb8bc
 */

int RSA_padding_add_X931(uchar *to,int tlen,uchar *f,int fl)

{
  int iVar1;
  long lVar2;
  uchar *puVar3;
  uchar *__s;
  size_t __n;
  
  lVar2 = (long)tlen - (long)fl;
  iVar1 = (int)lVar2;
  if (iVar1 < 2) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_x931.c",0x24,"RSA_padding_add_X931");
    ERR_set_error(4,0x6e,0);
    iVar1 = -1;
  }
  else {
    __s = to + 1;
    if (iVar1 == 2) {
      *to = 'j';
    }
    else {
      *to = 'k';
      puVar3 = __s;
      if (3 < iVar1) {
        __n = lVar2 - 3;
        memset(__s,0xbb,__n);
        puVar3 = __s + __n;
      }
      __s = puVar3 + 1;
      *puVar3 = 0xba;
    }
    memcpy(__s,f,(ulong)(uint)fl);
    iVar1 = 1;
    __s[fl] = 0xcc;
  }
  return iVar1;
}

