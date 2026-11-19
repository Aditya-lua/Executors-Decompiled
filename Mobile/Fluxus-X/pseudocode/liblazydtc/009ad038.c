/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ad038
 */

int SSL_add_client_CA(SSL *ssl,X509 *x)

{
  int iVar1;
  long lVar2;
  X509_NAME *pXVar3;
  undefined8 uVar4;
  
  if (x != (X509 *)0x0) {
    lVar2._0_4_ = ssl[3].first_packet;
    lVar2._4_4_ = ssl[3].client_version;
    if (lVar2 == 0) {
      lVar2 = OPENSSL_sk_new_null();
      ssl[3].first_packet = (int)lVar2;
      ssl[3].client_version = (int)((ulong)lVar2 >> 0x20);
      if (lVar2 == 0) {
        return 0;
      }
    }
    pXVar3 = X509_get_subject_name(x);
    pXVar3 = X509_NAME_dup(pXVar3);
    if (pXVar3 == (X509_NAME *)0x0) {
      return 0;
    }
    uVar4._0_4_ = ssl[3].first_packet;
    uVar4._4_4_ = ssl[3].client_version;
    iVar1 = OPENSSL_sk_push(uVar4,pXVar3);
    if (iVar1 != 0) {
      return 1;
    }
    X509_NAME_free(pXVar3);
  }
  return 0;
}

