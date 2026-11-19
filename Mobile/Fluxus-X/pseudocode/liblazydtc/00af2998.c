/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af2998
 */

int FUN_00af2998(undefined8 param_1,undefined8 param_2,long param_3,int param_4,undefined8 param_5,
                undefined8 param_6)

{
  int iVar1;
  X509_STORE *ctx;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  X509_CRL *x;
  X509 *x_00;
  
  ctx = (X509_STORE *)X509_LOOKUP_get_store();
  lVar2 = OSSL_STORE_open_ex(param_2,param_5,param_6,0,0,0,0,0);
  if (lVar2 == 0) {
    iVar1 = 0;
  }
  else {
    if (param_3 != 0) {
      OSSL_STORE_find(lVar2,param_3);
    }
    iVar1 = 0;
    do {
      lVar3 = OSSL_STORE_load(lVar2);
      if (lVar3 == 0) break;
      iVar1 = OSSL_STORE_INFO_get_type();
      if (iVar1 == 6) {
        x = (X509_CRL *)OSSL_STORE_INFO_get0_CRL(lVar3);
        iVar1 = X509_STORE_add_crl(ctx,x);
      }
      else if (iVar1 == 5) {
        x_00 = (X509 *)OSSL_STORE_INFO_get0_CERT(lVar3);
        iVar1 = X509_STORE_add_cert(ctx,x_00);
      }
      else {
        if ((iVar1 != 1) || (param_4 < 1)) {
          OSSL_STORE_INFO_free(lVar3);
          iVar1 = 0;
          break;
        }
        uVar4 = OSSL_STORE_INFO_get0_NAME(lVar3);
        iVar1 = FUN_00af2998(param_1,uVar4,param_3,param_4 + -1,param_5,param_6);
      }
      OSSL_STORE_INFO_free(lVar3);
    } while (iVar1 != 0);
    OSSL_STORE_close(lVar2);
  }
  return iVar1;
}

