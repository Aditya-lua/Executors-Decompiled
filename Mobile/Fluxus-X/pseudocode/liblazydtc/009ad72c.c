/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ad72c
 */

undefined4 FUN_009ad72c(undefined8 param_1,undefined8 param_2,int param_3)

{
  int iVar1;
  undefined4 uVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  X509 *a;
  X509_NAME *pXVar6;
  
  lVar3 = OSSL_STORE_open(param_2,0,0,0,0);
  if (lVar3 == 0) {
LAB_009ad854:
    uVar2 = 0;
  }
  else {
    iVar1 = OSSL_STORE_eof(lVar3);
    if (iVar1 == 0) {
      uVar2 = 1;
      do {
        iVar1 = OSSL_STORE_error(lVar3);
        if (iVar1 != 0) break;
        lVar4 = OSSL_STORE_load(lVar3);
        if (lVar4 != 0) {
          iVar1 = OSSL_STORE_INFO_get_type();
          if (iVar1 == 5) {
            a = (X509 *)OSSL_STORE_INFO_get0_CERT(lVar4);
            if (((a == (X509 *)0x0) ||
                (pXVar6 = X509_get_subject_name(a), pXVar6 == (X509_NAME *)0x0)) ||
               (pXVar6 = X509_NAME_dup(pXVar6), pXVar6 == (X509_NAME *)0x0)) goto LAB_009ad854;
            iVar1 = OPENSSL_sk_find(param_1,pXVar6);
            if (iVar1 < 0) {
              iVar1 = OPENSSL_sk_push(param_1,pXVar6);
              if (iVar1 == 0) {
                X509_NAME_free(pXVar6);
                goto LAB_009ad854;
              }
            }
            else {
              X509_NAME_free(pXVar6);
            }
          }
          else if ((iVar1 == 1) && (0 < param_3)) {
            uVar5 = OSSL_STORE_INFO_get0_NAME(lVar4);
            uVar2 = FUN_009ad72c(param_1,uVar5,param_3 + -1);
          }
          OSSL_STORE_INFO_free(lVar4);
        }
        iVar1 = OSSL_STORE_eof(lVar3);
      } while (iVar1 == 0);
      ERR_clear_error();
    }
    else {
      uVar2 = 1;
      ERR_clear_error();
    }
  }
  OSSL_STORE_close(lVar3);
  return uVar2;
}

