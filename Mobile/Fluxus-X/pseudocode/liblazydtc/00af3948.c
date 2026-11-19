/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af3948
 */

uint ossl_x509_print_ex_brief(BIO *param_1,X509 *param_2,ulong param_3)

{
  int iVar1;
  uint uVar2;
  ASN1_TIME *pAVar3;
  
  if (param_2 == (X509 *)0x0) {
    iVar1 = BIO_printf(param_1,"    (no certificate)\n");
    return (uint)(0 < iVar1);
  }
  iVar1 = BIO_printf(param_1,"    certificate\n");
  if (0 < iVar1) {
    iVar1 = X509_print_ex(param_1,param_2,0x2031f,0xffffffffffffffbf);
    if (iVar1 == 0) {
      return 0;
    }
    iVar1 = X509_check_issued(param_2,param_2);
    if (iVar1 == 0) {
      iVar1 = BIO_printf(param_1,"        self-issued\n");
      if (iVar1 < 1) {
        return 0;
      }
    }
    else {
      iVar1 = BIO_printf(param_1," ");
      if (iVar1 < 1) {
        return 0;
      }
      iVar1 = X509_print_ex(param_1,param_2,0x2031f,0xffffffffffffffef);
      if (iVar1 == 0) {
        return 0;
      }
    }
    iVar1 = X509_print_ex(param_1,param_2,0x2031f,0xffffffffffffffdb);
    if (iVar1 == 0) {
      return 0;
    }
    pAVar3 = (ASN1_TIME *)X509_get0_notBefore(param_2);
    iVar1 = X509_cmp_current_time(pAVar3);
    if ((iVar1 < 1) || (iVar1 = BIO_printf(param_1,"        not yet valid\n"), 0 < iVar1)) {
      pAVar3 = (ASN1_TIME *)X509_get0_notAfter(param_2);
      iVar1 = X509_cmp_current_time(pAVar3);
      if ((-1 < iVar1) || (iVar1 = BIO_printf(param_1,"        no more valid\n"), 0 < iVar1)) {
        uVar2 = X509_print_ex(param_1,param_2,0x2031f,~param_3 & 0xffffffffffffdfff);
        return uVar2;
      }
    }
  }
  return 0;
}

