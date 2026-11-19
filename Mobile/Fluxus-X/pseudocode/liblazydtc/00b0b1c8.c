/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0b1c8
 */

undefined8 X509_STORE_CTX_get1_certs(long *param_1,undefined8 param_2)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  int *ptr;
  int iVar5;
  long lVar6;
  int local_1d4;
  undefined1 auStack_1d0 [72];
  undefined8 local_188;
  undefined4 local_50 [2];
  undefined1 *local_48;
  
  lVar6 = *param_1;
  if ((lVar6 != 0) && (iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(lVar6 + 0x98)), iVar1 != 0))
  {
    local_50[0] = 1;
    local_48 = auStack_1d0;
    local_188 = param_2;
    iVar1 = OPENSSL_sk_find_all(*(undefined8 *)(lVar6 + 8),local_50,&local_1d4);
    if (-1 < iVar1) {
LAB_00b0b22c:
      uVar3 = OPENSSL_sk_new_null();
      if (0 < local_1d4) {
        iVar5 = 0;
        do {
          lVar4 = OPENSSL_sk_value(*(undefined8 *)(lVar6 + 8),iVar1 + iVar5);
          iVar2 = X509_add_cert(uVar3,*(undefined8 *)(lVar4 + 8),1);
          if (iVar2 == 0) {
            CRYPTO_THREAD_unlock(*(undefined8 *)(lVar6 + 0x98));
            OPENSSL_sk_pop_free(uVar3,X509_free);
            return 0;
          }
          iVar5 = iVar5 + 1;
        } while (iVar5 < local_1d4);
      }
      CRYPTO_THREAD_unlock(*(undefined8 *)(lVar6 + 0x98));
      return uVar3;
    }
    ptr = (int *)CRYPTO_zalloc(0x10,"crypto/x509/x509_lu.c",0x1c0);
    if (ptr == (int *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/x509/x509_lu.c",0x1c3,"X509_OBJECT_new");
      ERR_set_error(0xb,0xc0100,0);
    }
    else {
      *ptr = 0;
      CRYPTO_THREAD_unlock(*(undefined8 *)(lVar6 + 0x98));
      iVar1 = X509_STORE_CTX_get_by_subject(param_1,1,param_2,ptr);
      if (*ptr == 2) {
        X509_CRL_free(*(X509_CRL **)(ptr + 2));
      }
      else if (*ptr == 1) {
        X509_free(*(X509 **)(ptr + 2));
      }
      CRYPTO_free(ptr);
      if (iVar1 == 0) {
        return 0;
      }
      iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(lVar6 + 0x98));
      if (iVar1 == 0) {
        return 0;
      }
      local_50[0] = 1;
      local_48 = auStack_1d0;
      local_188 = param_2;
      iVar1 = OPENSSL_sk_find_all(*(undefined8 *)(lVar6 + 8),local_50,&local_1d4);
      if (-1 < iVar1) goto LAB_00b0b22c;
    }
    CRYPTO_THREAD_unlock(*(undefined8 *)(lVar6 + 0x98));
  }
  return 0;
}

