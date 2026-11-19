/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0b3b4
 */

long X509_STORE_CTX_get1_crls(long *param_1,undefined8 param_2)

{
  int *piVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  int *ptr;
  long lVar5;
  X509_CRL *a;
  int iVar6;
  long lVar7;
  undefined1 auStack_158 [24];
  undefined8 local_140;
  undefined4 local_60 [2];
  undefined1 *local_58;
  int local_44;
  
  lVar4 = OPENSSL_sk_new_null();
  ptr = (int *)CRYPTO_zalloc(0x10,"crypto/x509/x509_lu.c",0x1c0);
  if (ptr == (int *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_lu.c",0x1c3,"X509_OBJECT_new");
    ERR_set_error(0xb,0xc0100,0);
    piVar1 = (int *)0x0;
  }
  else {
    *ptr = 0;
    piVar1 = ptr;
  }
  if ((((lVar4 == 0) || (piVar1 == (int *)0x0)) || (lVar7 = *param_1, lVar7 == 0)) ||
     (iVar2 = X509_STORE_CTX_get_by_subject(param_1,2,param_2,piVar1), iVar2 == 0)) {
    if (piVar1 != (int *)0x0) {
      if (*piVar1 == 2) {
        X509_CRL_free(*(X509_CRL **)(piVar1 + 2));
      }
      else if (*piVar1 == 1) {
        X509_free(*(X509 **)(piVar1 + 2));
      }
    }
    CRYPTO_free(ptr);
  }
  else {
    if (*piVar1 == 2) {
      X509_CRL_free(*(X509_CRL **)(piVar1 + 2));
    }
    else if (*piVar1 == 1) {
      X509_free(*(X509 **)(piVar1 + 2));
    }
    CRYPTO_free(ptr);
    iVar2 = CRYPTO_THREAD_write_lock(*(undefined8 *)(lVar7 + 0x98));
    if (iVar2 != 0) {
      local_60[0] = 2;
      local_58 = auStack_158;
      local_140 = param_2;
      iVar2 = OPENSSL_sk_find_all(*(undefined8 *)(lVar7 + 8),local_60,&local_44);
      if (-1 < iVar2) {
        if (0 < local_44) {
          iVar6 = 0;
          do {
            lVar5 = OPENSSL_sk_value(*(undefined8 *)(lVar7 + 8),iVar2 + iVar6);
            a = *(X509_CRL **)(lVar5 + 8);
            iVar3 = X509_CRL_up_ref(a);
            if (iVar3 == 0) {
              CRYPTO_THREAD_unlock(*(undefined8 *)(lVar7 + 0x98));
LAB_00b0b5c4:
              OPENSSL_sk_pop_free(lVar4,X509_CRL_free);
              return 0;
            }
            iVar3 = OPENSSL_sk_push(lVar4,a);
            if (iVar3 == 0) {
              CRYPTO_THREAD_unlock(*(undefined8 *)(lVar7 + 0x98));
              X509_CRL_free(a);
              goto LAB_00b0b5c4;
            }
            iVar6 = iVar6 + 1;
          } while (iVar6 < local_44);
        }
        CRYPTO_THREAD_unlock(*(undefined8 *)(lVar7 + 0x98));
        return lVar4;
      }
      CRYPTO_THREAD_unlock(*(undefined8 *)(lVar7 + 0x98));
    }
  }
  OPENSSL_sk_free(lVar4);
  return 0;
}

