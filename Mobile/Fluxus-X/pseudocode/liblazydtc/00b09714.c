/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b09714
 */

int X509_check_private_key(X509 *x509,EVP_PKEY *pkey)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  if ((x509 == (X509 *)0x0) || (lVar2 = X509_PUBKEY_get0(x509->ex_kusage), lVar2 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_cmp.c",0x192,"X509_check_private_key");
    ERR_set_error(0xb,0x6c,0);
    return 0;
  }
  iVar1 = EVP_PKEY_eq(lVar2,pkey);
  if (iVar1 == -2) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_cmp.c",0x19e,"X509_check_private_key");
    uVar3 = 0x75;
  }
  else if (iVar1 == -1) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_cmp.c",0x19b,"X509_check_private_key");
    uVar3 = 0x73;
  }
  else {
    if (iVar1 != 0) goto LAB_00b09804;
    ERR_new();
    ERR_set_debug("crypto/x509/x509_cmp.c",0x198,"X509_check_private_key");
    uVar3 = 0x74;
  }
  ERR_set_error(0xb,uVar3,0);
LAB_00b09804:
  return (uint)(0 < iVar1);
}

