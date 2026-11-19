/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0ad24
 */

bool FUN_00b0ad24(long param_1,char *param_2,int param_3)

{
  bool bVar1;
  int iVar2;
  X509_OBJECT *x;
  X509_OBJECT *pXVar3;
  
  if (param_2 == (char *)0x0) {
    bVar1 = false;
  }
  else {
    x = (X509_OBJECT *)CRYPTO_zalloc(0x10,"crypto/x509/x509_lu.c",0x1c0);
    if (x == (X509_OBJECT *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/x509/x509_lu.c",0x1c3,"X509_OBJECT_new");
      ERR_set_error(0xb,0xc0100,0);
      bVar1 = false;
    }
    else {
      x->type = 0;
      if (param_3 == 0) {
        x->type = 1;
        (x->data).ptr = param_2;
        iVar2 = X509_up_ref(param_2);
      }
      else {
        x->type = 2;
        (x->data).ptr = param_2;
        iVar2 = X509_CRL_up_ref(param_2);
      }
      if ((iVar2 == 0) ||
         (iVar2 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 0x98)), iVar2 == 0)) {
        x->type = 0;
        CRYPTO_free(x);
        bVar1 = false;
      }
      else {
        pXVar3 = X509_OBJECT_retrieve_match(*(stack_st_X509_OBJECT **)(param_1 + 8),x);
        if (pXVar3 == (X509_OBJECT *)0x0) {
          iVar2 = OPENSSL_sk_push(*(undefined8 *)(param_1 + 8),x);
          bVar1 = iVar2 != 0;
          CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x98));
          if (iVar2 != 0) {
            return bVar1;
          }
        }
        else {
          CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x98));
          bVar1 = true;
        }
        if (x->type == 2) {
          X509_CRL_free((x->data).crl);
        }
        else if (x->type == 1) {
          X509_free((x->data).x509);
        }
        CRYPTO_free(x);
      }
    }
  }
  return bVar1;
}

