/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b2a8
 */

int X509_CRL_add0_revoked(X509_CRL *crl,X509_REVOKED *rev)

{
  int iVar1;
  long lVar2;
  
  lVar2._0_4_ = crl->idp_flags;
  lVar2._4_4_ = crl->idp_reasons;
  if (lVar2 == 0) {
    lVar2 = OPENSSL_sk_new(&LAB_00b1b330);
    crl->idp_flags = (int)lVar2;
    crl->idp_reasons = (int)((ulong)lVar2 >> 0x20);
    if (lVar2 == 0) goto LAB_00b1b2f0;
  }
  iVar1 = OPENSSL_sk_push(lVar2,rev);
  if (iVar1 != 0) {
    crl->sha1_hash[8] = '\x01';
    crl->sha1_hash[9] = '\0';
    crl->sha1_hash[10] = '\0';
    crl->sha1_hash[0xb] = '\0';
    return 1;
  }
LAB_00b1b2f0:
  ERR_new();
  ERR_set_debug("crypto/x509/x_crl.c",0x16f,"X509_CRL_add0_revoked");
  ERR_set_error(0xd,0xc0100,0);
  return 0;
}

