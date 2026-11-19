/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b11d6c
 */

X509 * FUN_00b11d6c(long param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  int iVar2;
  int iVar3;
  X509 *b;
  X509 *a;
  undefined8 uVar4;
  X509 *pXVar5;
  undefined8 uVar6;
  int iVar7;
  
  iVar1 = OPENSSL_sk_num(param_2);
  if (iVar1 < 1) {
    pXVar5 = (X509 *)0x0;
  }
  else {
    pXVar5 = (X509 *)0x0;
    iVar1 = 0;
    do {
      b = (X509 *)OPENSSL_sk_value(param_2,iVar1);
      iVar2 = (**(code **)(param_1 + 0x48))(param_1,param_3,b);
      if (iVar2 != 0) {
        if (((*(byte *)(param_3 + 0xe8) >> 5 & 1) == 0) ||
           (iVar2 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x98)), iVar2 != 1)) {
          uVar6 = *(undefined8 *)(param_1 + 0x98);
          iVar2 = OPENSSL_sk_num(uVar6);
          if (0 < iVar2) {
            iVar7 = 0;
            do {
              a = (X509 *)OPENSSL_sk_value(uVar6,iVar7);
              iVar3 = X509_cmp(a,b);
              if (iVar3 == 0) goto LAB_00b11e70;
              iVar7 = iVar7 + 1;
            } while (iVar7 < iVar2);
          }
        }
        iVar2 = ossl_x509_check_cert_time(param_1,b,0xffffffff);
        if (iVar2 != 0) {
          return b;
        }
        if (pXVar5 != (X509 *)0x0) {
          uVar6 = X509_get0_notAfter(b);
          uVar4 = X509_get0_notAfter(pXVar5);
          iVar2 = ASN1_TIME_compare(uVar6,uVar4);
          if (iVar2 < 1) goto LAB_00b11e70;
        }
        pXVar5 = b;
      }
LAB_00b11e70:
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(param_2);
    } while (iVar1 < iVar2);
  }
  return pXVar5;
}

