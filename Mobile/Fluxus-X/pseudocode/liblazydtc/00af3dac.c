/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af3dac
 */

ulong FUN_00af3dac(BIO *param_1,long param_2)

{
  int iVar1;
  int iVar2;
  uint uVar3;
  long lVar4;
  ulong uVar5;
  stack_st_X509_EXTENSION *exts;
  
  if ((param_2 == 0) || (iVar1 = OPENSSL_sk_num(param_2), iVar1 < 1)) {
    uVar3 = BIO_printf(param_1,"    (no certificates)\n");
    uVar5 = (ulong)(uVar3 >> 0x1f ^ 1);
  }
  else {
    iVar1 = OPENSSL_sk_num(param_2);
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        lVar4 = OPENSSL_sk_value(param_2,iVar1);
        if (lVar4 != 0) {
          uVar5 = ossl_x509_print_ex_brief(param_1,lVar4,0);
          if ((int)uVar5 == 0) {
            return uVar5;
          }
          exts = (stack_st_X509_EXTENSION *)X509_get0_extensions(lVar4);
          iVar2 = X509V3_extensions_print(param_1,(char *)0x0,exts,0x2000,8);
          if (iVar2 == 0) {
            return 0;
          }
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(param_2);
      } while (iVar1 < iVar2);
    }
    uVar5 = 1;
  }
  return uVar5;
}

