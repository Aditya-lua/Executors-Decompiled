/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a14620
 */

undefined8 SCT_CTX_set1_cert(long param_1,X509 *param_2,X509 *param_3)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  int lastpos;
  int iVar6;
  X509_EXTENSION *pXVar7;
  X509_NAME *name;
  X509_EXTENSION *ex;
  ASN1_OCTET_STRING *data;
  X509 *x;
  void *local_58;
  uchar *local_48;
  
  local_48 = (uchar *)0x0;
  local_58 = (void *)0x0;
  uVar1 = X509_get_ext_by_NID(param_2,0x3b8,-1);
  if ((int)uVar1 < 0) {
    iVar2 = 0;
    if (uVar1 == 0xffffffff) {
      x = (X509 *)0x0;
      if (param_3 != (X509 *)0x0) goto LAB_00a14744;
      iVar2 = i2d_X509(param_2,&local_48);
      if (iVar2 < 0) {
        x = (X509 *)0x0;
        goto LAB_00a14744;
      }
    }
  }
  else {
    iVar2 = X509_get_ext_by_NID(param_2,0x3b8,uVar1);
    x = (X509 *)0x0;
    if (-1 < iVar2) goto LAB_00a14744;
    iVar2 = 0;
  }
  uVar3 = X509_get_ext_by_NID(param_2,0x3b7,-1);
  if ((int)uVar3 < 0) {
    uVar4 = 0;
  }
  else {
    uVar4 = X509_get_ext_by_NID(param_2,0x3b7,uVar3);
    uVar4 = uVar4 >> 0x1f ^ 1;
  }
  x = (X509 *)0x0;
  if ((-1 < (int)(uVar3 | uVar1)) || (uVar4 != 0)) goto LAB_00a14744;
  if (uVar3 != 0xffffffff) {
    uVar1 = uVar3;
  }
  if ((int)uVar1 < 0) {
    x = (X509 *)0x0;
    iVar5 = 0;
  }
  else {
    x = X509_dup(param_2);
    if (x == (X509 *)0x0) goto LAB_00a14744;
    pXVar7 = X509_delete_ext(x,uVar1);
    X509_EXTENSION_free(pXVar7);
    if (param_3 != (X509 *)0x0) {
      iVar5 = X509_get_ext_by_NID(param_3,0x5a,-1);
      if (iVar5 < 0) {
        uVar1 = 0;
      }
      else {
        uVar1 = X509_get_ext_by_NID(param_3,0x5a,iVar5);
        uVar1 = uVar1 >> 0x1f ^ 1;
      }
      lastpos = X509_get_ext_by_NID(x,0x5a,-1);
      if (lastpos < 0) {
        uVar3 = 0;
      }
      else {
        uVar3 = X509_get_ext_by_NID(x,0x5a,lastpos);
        uVar3 = uVar3 >> 0x1f ^ 1;
      }
      if (((((-1 < iVar5 && lastpos == -1) || (iVar5 < -1)) || (lastpos < -1)) ||
          (uVar3 != 0 || uVar1 != 0)) || ((iVar5 == -1 && (-1 < lastpos)))) goto LAB_00a14744;
      name = X509_get_issuer_name(param_3);
      iVar6 = X509_set_issuer_name(x,name);
      if ((iVar5 != -1) && (iVar6 != 0)) {
        pXVar7 = X509_get_ext(param_3,iVar5);
        ex = X509_get_ext(x,lastpos);
        if (((pXVar7 == (X509_EXTENSION *)0x0) || (ex == (X509_EXTENSION *)0x0)) ||
           (data = X509_EXTENSION_get_data(pXVar7), data == (ASN1_OCTET_STRING *)0x0))
        goto LAB_00a14744;
        iVar6 = X509_EXTENSION_set_data(ex,data);
      }
      if (iVar6 == 0) goto LAB_00a14744;
    }
    iVar5 = i2d_re_X509_tbs(x,&local_58);
    if (iVar5 < 1) {
LAB_00a14744:
      CRYPTO_free(local_48);
      CRYPTO_free(local_58);
      X509_free(x);
      return 0;
    }
  }
  X509_free(x);
  CRYPTO_free(*(void **)(param_1 + 0x28));
  *(uchar **)(param_1 + 0x28) = local_48;
  *(long *)(param_1 + 0x30) = (long)iVar2;
  CRYPTO_free(*(void **)(param_1 + 0x38));
  *(void **)(param_1 + 0x38) = local_58;
  *(long *)(param_1 + 0x40) = (long)iVar5;
  return 1;
}

