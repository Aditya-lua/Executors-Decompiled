/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0ed4c
 */

int X509_get_pubkey_parameters(EVP_PKEY *pkey,stack_st_X509 *chain)

{
  int iVar1;
  int iVar2;
  EVP_PKEY *pkey_00;
  EVP_PKEY *to;
  undefined8 uVar3;
  
  if ((pkey != (EVP_PKEY *)0x0) && (iVar1 = EVP_PKEY_missing_parameters(pkey), iVar1 == 0)) {
    return 1;
  }
  iVar1 = OPENSSL_sk_num(chain);
  if (0 < iVar1) {
    iVar1 = 0;
    do {
      OPENSSL_sk_value(chain,iVar1);
      pkey_00 = (EVP_PKEY *)X509_get0_pubkey();
      if (pkey_00 == (EVP_PKEY *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/x509/x509_vfy.c",0x7c8,"X509_get_pubkey_parameters");
        uVar3 = 0x6c;
        goto LAB_00b0ee30;
      }
      iVar2 = EVP_PKEY_missing_parameters(pkey_00);
      if (iVar2 == 0) {
        while (0 < iVar1) {
          OPENSSL_sk_value(chain,iVar1 + -1);
          to = (EVP_PKEY *)X509_get0_pubkey();
          iVar2 = EVP_PKEY_copy_parameters(to,pkey_00);
          iVar1 = iVar1 + -1;
          if (iVar2 == 0) {
            return 0;
          }
        }
        if (pkey == (EVP_PKEY *)0x0) {
          return 1;
        }
        iVar1 = EVP_PKEY_copy_parameters(pkey,pkey_00);
        return iVar1;
      }
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(chain);
    } while (iVar1 < iVar2);
  }
  ERR_new();
  ERR_set_debug("crypto/x509/x509_vfy.c",2000,"X509_get_pubkey_parameters");
  uVar3 = 0x6b;
LAB_00b0ee30:
  ERR_set_error(0xb,uVar3,0);
  return 0;
}

