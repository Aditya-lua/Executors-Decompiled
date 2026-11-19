/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0f3b4
 */

int X509_STORE_CTX_purpose_inherit(X509_STORE_CTX *ctx,int def_purpose,int purpose,int trust)

{
  int id;
  int iVar1;
  X509_PURPOSE *pXVar2;
  undefined8 uVar3;
  byte bVar4;
  stack_st_X509_CRL *psVar5;
  
  iVar1 = purpose;
  if (def_purpose != 0) {
    iVar1 = def_purpose;
  }
  id = def_purpose;
  if (purpose != 0) {
    id = iVar1;
    def_purpose = purpose;
  }
  if (def_purpose == 0) {
LAB_00b0f440:
    if (trust == 0) {
      bVar4 = 0;
      psVar5 = ctx->crls;
    }
    else {
LAB_00b0f444:
      iVar1 = X509_TRUST_get_by_id(trust);
      if (iVar1 == -1) {
        ERR_new();
        ERR_set_debug("crypto/x509/x509_vfy.c",0x8de,"X509_STORE_CTX_purpose_inherit");
        uVar3 = 0x78;
        goto LAB_00b0f4ec;
      }
      bVar4 = 1;
      psVar5 = ctx->crls;
    }
    if ((def_purpose != 0) && (psVar5[1].stack.num == 0)) {
      psVar5[1].stack.num = def_purpose;
    }
    if (!(bool)(bVar4 ^ 1 | *(int *)&psVar5[1].stack.field_0x4 != 0)) {
      *(int *)&psVar5[1].stack.field_0x4 = trust;
    }
    iVar1 = 1;
  }
  else {
    iVar1 = X509_PURPOSE_get_by_id(def_purpose);
    if (iVar1 != -1) {
      pXVar2 = X509_PURPOSE_get0(iVar1);
      if (pXVar2->trust == 0) {
        iVar1 = X509_PURPOSE_get_by_id(id);
        if (iVar1 == -1) {
          ERR_new();
          uVar3 = 0x8d2;
          goto LAB_00b0f4e0;
        }
        pXVar2 = X509_PURPOSE_get0(iVar1);
      }
      if (trust == 0) {
        trust = pXVar2->trust;
        goto LAB_00b0f440;
      }
      goto LAB_00b0f444;
    }
    ERR_new();
    uVar3 = 0x8cb;
LAB_00b0f4e0:
    ERR_set_debug("crypto/x509/x509_vfy.c",uVar3,"X509_STORE_CTX_purpose_inherit");
    uVar3 = 0x79;
LAB_00b0f4ec:
    ERR_set_error(0xb,uVar3,0);
    iVar1 = 0;
  }
  return iVar1;
}

