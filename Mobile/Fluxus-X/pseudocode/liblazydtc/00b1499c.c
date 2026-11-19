/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1499c
 */

int X509_CRL_sort(X509_CRL *crl)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long lVar6;
  undefined8 uVar7;
  
  uVar3._0_4_ = crl->idp_flags;
  uVar3._4_4_ = crl->idp_reasons;
  OPENSSL_sk_sort(uVar3);
  uVar4._0_4_ = crl->idp_flags;
  uVar4._4_4_ = crl->idp_reasons;
  iVar1 = OPENSSL_sk_num(uVar4);
  if (0 < iVar1) {
    iVar1 = 0;
    do {
      uVar5._0_4_ = crl->idp_flags;
      uVar5._4_4_ = crl->idp_reasons;
      lVar6 = OPENSSL_sk_value(uVar5,iVar1);
      *(int *)(lVar6 + 0x34) = iVar1;
      uVar7._0_4_ = crl->idp_flags;
      uVar7._4_4_ = crl->idp_reasons;
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(uVar7);
    } while (iVar1 < iVar2);
  }
  crl->sha1_hash[8] = '\x01';
  crl->sha1_hash[9] = '\0';
  crl->sha1_hash[10] = '\0';
  crl->sha1_hash[0xb] = '\0';
  return 1;
}

