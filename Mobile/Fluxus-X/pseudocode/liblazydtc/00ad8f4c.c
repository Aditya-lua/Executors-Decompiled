/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad8f4c
 */

int RSA_sign_ASN1_OCTET_STRING(int type,uchar *m,uint m_length,uchar *sigret,uint *siglen,RSA *rsa)

{
  int flen;
  int iVar1;
  uint uVar2;
  uchar *from;
  undefined8 uVar3;
  uchar *local_60;
  ASN1_OCTET_STRING local_58;
  
  local_58.type = 4;
  local_58.length = m_length;
  local_58.data = m;
  flen = i2d_ASN1_OCTET_STRING(&local_58,(uchar **)0x0);
  iVar1 = RSA_size(rsa);
  if (iVar1 + -0xb < flen) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_saos.c",0x27,"RSA_sign_ASN1_OCTET_STRING");
    uVar3 = 0x70;
  }
  else {
    from = CRYPTO_malloc(iVar1 + 1,"crypto/rsa/rsa_saos.c",0x2a);
    if (from != (uchar *)0x0) {
      local_60 = from;
      i2d_ASN1_OCTET_STRING(&local_58,&local_60);
      uVar2 = RSA_private_encrypt(flen,from,sigret,rsa,1);
      if (0 < (int)uVar2) {
        *siglen = uVar2;
      }
      CRYPTO_clear_free(from,iVar1 + 1,"crypto/rsa/rsa_saos.c",0x37);
      return (uint)(0 < (int)uVar2);
    }
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_saos.c",0x2c,"RSA_sign_ASN1_OCTET_STRING");
    uVar3 = 0xc0100;
  }
  ERR_set_error(4,uVar3,0);
  return 0;
}

