/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adb998
 */

int RSA_padding_check_X931(uchar *to,int tlen,uchar *f,int fl,int rsa_len)

{
  uint uVar1;
  long lVar2;
  uchar *__src;
  undefined8 uVar3;
  int iVar4;
  long lVar5;
  ulong uVar6;
  
  if ((rsa_len == fl) && ((*f & 0xfe) == 0x6a)) {
    if (*f == 0x6b) {
      if (rsa_len < 4) {
LAB_00adbaa8:
        ERR_new(to,tlen);
        uVar3 = 0x56;
LAB_00adbac0:
        ERR_set_debug("crypto/rsa/rsa_x931.c",uVar3,"RSA_padding_check_X931");
        uVar3 = 0x8a;
        goto LAB_00adba28;
      }
      uVar1 = rsa_len - 3;
      lVar2 = 0;
      do {
        lVar5 = lVar2;
        if (f[lVar5 + 1] != 0xbb) {
          if (f[lVar5 + 1] != 0xba) {
            ERR_new(to,tlen);
            uVar3 = 0x4e;
            goto LAB_00adbac0;
          }
          if ((int)lVar5 == 0) goto LAB_00adbaa8;
          uVar6 = (ulong)uVar1 - lVar5;
          __src = f + lVar5 + 2;
          goto LAB_00adba4c;
        }
        iVar4 = (int)(lVar5 + 1);
        lVar2 = lVar5 + 1;
      } while (iVar4 < (int)uVar1);
      __src = f + lVar5 + 2;
      uVar6 = (ulong)(uVar1 - iVar4);
    }
    else {
      __src = f + 1;
      uVar6 = (ulong)(rsa_len - 2);
    }
LAB_00adba4c:
    if (__src[(int)uVar6] == 0xcc) {
      memcpy(to,__src,uVar6 & 0xffffffff);
      return (int)uVar6;
    }
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_x931.c",0x5f,"RSA_padding_check_X931");
    uVar3 = 0x8b;
  }
  else {
    ERR_new(to,tlen);
    ERR_set_debug("crypto/rsa/rsa_x931.c",0x43,"RSA_padding_check_X931");
    uVar3 = 0x89;
  }
LAB_00adba28:
  ERR_set_error(4,uVar3,0);
  return -1;
}

