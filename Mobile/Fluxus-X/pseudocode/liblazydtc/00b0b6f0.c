/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0b6f0
 */

int X509_STORE_CTX_get1_issuer(X509 **issuer,X509_STORE_CTX *ctx,X509 *x)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int *piVar4;
  X509_NAME *pXVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  X509 *pXVar8;
  int iVar9;
  X509_STORE *pXVar10;
  undefined1 auStack_1f0 [72];
  X509_NAME *local_1a8;
  undefined4 local_70 [2];
  undefined1 *local_68;
  int local_54;
  
  piVar4 = (int *)CRYPTO_zalloc(0x10,"crypto/x509/x509_lu.c",0x1c0);
  if (piVar4 == (int *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_lu.c",0x1c3,"X509_OBJECT_new");
    ERR_set_error(0xb,0xc0100,0);
    return -1;
  }
  *piVar4 = 0;
  pXVar10 = ctx->ctx;
  local_54 = 0;
  *issuer = (X509 *)0x0;
  pXVar5 = X509_get_issuer_name(x);
  iVar1 = X509_STORE_CTX_get_by_subject(ctx,1,pXVar5,piVar4);
  if (iVar1 == 1) {
    iVar1 = (*ctx->get_issuer)((X509 **)ctx,(X509_STORE_CTX *)x,*(X509 **)(piVar4 + 2));
    if ((iVar1 != 0) &&
       (iVar1 = ossl_x509_check_cert_time(ctx,*(undefined8 *)(piVar4 + 2),0xffffffff), iVar1 != 0))
    {
      *issuer = *(X509 **)(piVar4 + 2);
      *piVar4 = 0;
      CRYPTO_free(piVar4);
      return 1;
    }
    if (*piVar4 == 2) {
      X509_CRL_free(*(X509_CRL **)(piVar4 + 2));
    }
    else if (*piVar4 == 1) {
      X509_free(*(X509 **)(piVar4 + 2));
    }
    CRYPTO_free(piVar4);
    if ((pXVar10 != (X509_STORE *)0x0) &&
       (iVar1 = CRYPTO_THREAD_write_lock(pXVar10[1].objs), iVar1 != 0)) {
      local_70[0] = 1;
      local_1a8 = pXVar5;
      local_68 = auStack_1f0;
      iVar1 = OPENSSL_sk_find_all(pXVar10->objs,local_70,&local_54);
      if (iVar1 == -1) {
        iVar3 = 0;
      }
      else {
        iVar3 = 0;
        if (0 < local_54) {
          iVar3 = 0;
          iVar9 = iVar1;
          do {
            piVar4 = (int *)OPENSSL_sk_value(pXVar10->objs,iVar9);
            if (*piVar4 != 1) break;
            iVar2 = (*ctx->get_issuer)((X509 **)ctx,(X509_STORE_CTX *)x,*(X509 **)(piVar4 + 2));
            if (iVar2 != 0) {
              iVar3 = ossl_x509_check_cert_time(ctx,*(undefined8 *)(piVar4 + 2),0xffffffff);
              if (iVar3 != 0) {
                pXVar8 = *(X509 **)(piVar4 + 2);
                iVar3 = 1;
                *issuer = pXVar8;
                goto joined_r0x00b0b9cc;
              }
              if (*issuer == (X509 *)0x0) {
LAB_00b0b974:
                *issuer = *(X509 **)(piVar4 + 2);
              }
              else {
                uVar6 = X509_get0_notAfter(*(undefined8 *)(piVar4 + 2));
                uVar7 = X509_get0_notAfter(*issuer);
                iVar3 = ASN1_TIME_compare(uVar6,uVar7);
                if (0 < iVar3) goto LAB_00b0b974;
              }
              iVar3 = 1;
            }
            iVar9 = iVar9 + 1;
          } while (iVar9 < local_54 + iVar1);
        }
      }
      pXVar8 = *issuer;
joined_r0x00b0b9cc:
      if ((pXVar8 != (X509 *)0x0) && (iVar1 = X509_up_ref(), iVar1 == 0)) {
        iVar3 = -1;
        *issuer = (X509 *)0x0;
      }
      CRYPTO_THREAD_unlock(pXVar10[1].objs);
      return iVar3;
    }
  }
  else {
    if (*piVar4 == 2) {
      X509_CRL_free(*(X509_CRL **)(piVar4 + 2));
    }
    else if (*piVar4 == 1) {
      X509_free(*(X509 **)(piVar4 + 2));
    }
    CRYPTO_free(piVar4);
  }
  return 0;
}

