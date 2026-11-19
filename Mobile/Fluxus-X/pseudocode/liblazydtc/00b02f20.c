/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b02f20
 */

ulong ossl_x509_likely_issued(X509 *param_1,X509 *param_2)

{
  int iVar1;
  uint uVar2;
  X509_NAME *a;
  X509_NAME *b;
  ulong uVar3;
  undefined8 uVar4;
  
  a = X509_get_subject_name(param_1);
  b = X509_get_issuer_name(param_2);
  iVar1 = X509_NAME_cmp(a,b);
  if (iVar1 == 0) {
    iVar1 = ossl_x509v3_cache_extensions(param_1);
    if ((iVar1 == 0) || (iVar1 = ossl_x509v3_cache_extensions(param_2), iVar1 == 0)) {
      uVar3 = 1;
    }
    else {
      uVar2 = X509_check_akid(param_1,(AUTHORITY_KEYID *)param_2[1].ex_pathlen);
      uVar3 = (ulong)uVar2;
      if (uVar2 == 0) {
        uVar4 = X509_get0_pubkey(param_1);
        uVar3 = FUN_00b02d6c(uVar4,param_2);
        return uVar3;
      }
    }
  }
  else {
    uVar3 = 0x1d;
  }
  return uVar3;
}

