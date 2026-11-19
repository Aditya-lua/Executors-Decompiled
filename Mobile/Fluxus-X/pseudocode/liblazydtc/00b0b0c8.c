/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0b0c8
 */

long X509_STORE_get1_all_certs(long param_1)

{
  int iVar1;
  int iVar2;
  long lVar3;
  int *piVar4;
  undefined8 uVar5;
  
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_lu.c",0x22e,"X509_STORE_get1_all_certs");
    ERR_set_error(0xb,0xc0102,0);
  }
  else {
    lVar3 = OPENSSL_sk_new_null();
    if (lVar3 == 0) {
      return 0;
    }
    iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 0x98));
    if (iVar1 != 0) {
      uVar5 = *(undefined8 *)(param_1 + 8);
      iVar1 = OPENSSL_sk_num(uVar5);
      if (0 < iVar1) {
        iVar1 = 0;
        do {
          piVar4 = (int *)OPENSSL_sk_value(uVar5,iVar1);
          if ((((piVar4 != (int *)0x0) && (*piVar4 == 1)) && (*(long *)(piVar4 + 2) != 0)) &&
             (iVar2 = X509_add_cert(lVar3,*(long *)(piVar4 + 2),1), iVar2 == 0)) {
            CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x98));
            goto LAB_00b0b1a0;
          }
          iVar1 = iVar1 + 1;
          iVar2 = OPENSSL_sk_num(uVar5);
        } while (iVar1 < iVar2);
      }
      CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x98));
      return lVar3;
    }
LAB_00b0b1a0:
    OPENSSL_sk_pop_free(lVar3,X509_free);
  }
  return 0;
}

