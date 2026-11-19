/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad5b60
 */

int RSA_padding_check_PKCS1_type_1(uchar *to,int tlen,uchar *f,int fl,int rsa_len)

{
  long lVar1;
  undefined8 uVar2;
  uchar *__src;
  int iVar3;
  uint uVar4;
  long lVar5;
  
  if (rsa_len < 0xb) {
    return -1;
  }
  if (rsa_len == fl) {
    if (*f != '\0') {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_pk1.c",0x4b,"RSA_padding_check_PKCS1_type_1");
      uVar2 = 0x8a;
      goto LAB_00ad5c5c;
    }
    f = f + 1;
    fl = rsa_len + -1;
  }
  if ((fl + 1 != rsa_len) || (*f != '\x01')) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_pk1.c",0x52,"RSA_padding_check_PKCS1_type_1");
    uVar2 = 0x6a;
    goto LAB_00ad5c5c;
  }
  if (fl < 2) {
    uVar4 = 0;
    __src = f + 1;
    if (fl == 1) goto LAB_00ad5c88;
  }
  else {
    lVar1 = 0;
    do {
      lVar5 = lVar1;
      if (f[lVar5 + 1] != 0xff) {
        if (f[lVar5 + 1] != '\0') {
          ERR_new();
          ERR_set_debug("crypto/rsa/rsa_pk1.c",0x5e,"RSA_padding_check_PKCS1_type_1");
          uVar2 = 0x66;
          goto LAB_00ad5c5c;
        }
        iVar3 = (int)lVar5;
        lVar1 = lVar5;
        break;
      }
      lVar1 = lVar5 + 1;
      iVar3 = (int)lVar1;
    } while (iVar3 < fl + -1);
    __src = f + lVar5 + 2;
    uVar4 = (uint)lVar1;
    if (iVar3 == fl + -1) {
LAB_00ad5c88:
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_pk1.c",0x66,"RSA_padding_check_PKCS1_type_1");
      uVar2 = 0x71;
      goto LAB_00ad5c5c;
    }
  }
  if (uVar4 < 8) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_pk1.c",0x6b,"RSA_padding_check_PKCS1_type_1");
    uVar2 = 0x67;
  }
  else {
    uVar4 = (fl + -2) - uVar4;
    if ((int)uVar4 <= tlen) {
      memcpy(to,__src,(ulong)uVar4);
      return uVar4;
    }
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_pk1.c",0x71,"RSA_padding_check_PKCS1_type_1");
    uVar2 = 0x6d;
  }
LAB_00ad5c5c:
  ERR_set_error(4,uVar2,0);
  return -1;
}

