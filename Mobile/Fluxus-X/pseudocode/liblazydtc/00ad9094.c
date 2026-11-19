/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad9094
 */

int RSA_verify_ASN1_OCTET_STRING(int type,uchar *m,uint m_length,uchar *sigbuf,uint siglen,RSA *rsa)

{
  uint uVar1;
  int iVar2;
  uchar *to;
  ASN1_OCTET_STRING *a;
  uchar *local_48;
  
  uVar1 = RSA_size(rsa);
  if (uVar1 != siglen) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_saos.c",0x46,"RSA_verify_ASN1_OCTET_STRING");
    ERR_set_error(4,0x77,0);
    return 0;
  }
  to = CRYPTO_malloc(siglen,"crypto/rsa/rsa_saos.c",0x4a);
  if (to == (uchar *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_saos.c",0x4c,"RSA_verify_ASN1_OCTET_STRING");
    ERR_set_error(4,0xc0100,0);
  }
  else {
    iVar2 = RSA_public_decrypt(siglen,sigbuf,to,rsa,1);
    if (0 < iVar2) {
      local_48 = to;
      a = d2i_ASN1_OCTET_STRING((ASN1_OCTET_STRING **)0x0,&local_48,(long)iVar2);
      if (a != (ASN1_OCTET_STRING *)0x0) {
        if ((a->length == m_length) && (iVar2 = memcmp(m,a->data,(ulong)m_length), iVar2 == 0)) {
          iVar2 = 1;
          goto LAB_00ad91ec;
        }
        ERR_new();
        ERR_set_debug("crypto/rsa/rsa_saos.c",0x5b,"RSA_verify_ASN1_OCTET_STRING");
        ERR_set_error(4,0x68,0);
      }
      iVar2 = 0;
      goto LAB_00ad91ec;
    }
  }
  iVar2 = 0;
  a = (ASN1_STRING *)0x0;
LAB_00ad91ec:
  ASN1_OCTET_STRING_free(a);
  CRYPTO_clear_free(to,siglen,"crypto/rsa/rsa_saos.c",0x61);
  return iVar2;
}

