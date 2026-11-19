/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0fba0
 */

undefined8 FUN_00b0fba0(long param_1)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  X509 *pXVar5;
  X509 *pXVar6;
  EVP_PKEY *r;
  undefined8 uVar7;
  code *pcVar8;
  int iVar9;
  X509 *pXVar10;
  
  iVar2 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x98));
  iVar9 = iVar2 + -1;
  pXVar5 = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar9);
  *(int *)(param_1 + 0xac) = iVar9;
  pXVar10 = (X509 *)0x0;
  if (((*(int *)(param_1 + 0xf8) == 0) &&
      (iVar4 = ossl_x509_likely_issued(pXVar5,pXVar5), pXVar10 = pXVar5, iVar4 != 0)) &&
     ((*(byte *)(*(long *)(param_1 + 0x20) + 0x1a) >> 3 & 1) == 0)) {
    iVar4 = iVar2 + -2;
    if (1 < iVar2) {
      *(int *)(param_1 + 0xac) = iVar4;
      pXVar5 = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar4);
      goto LAB_00b0fc00;
    }
    *(undefined4 *)(param_1 + 0xac) = 0;
    pXVar6 = pXVar5;
    if (pXVar5 == (X509 *)0x0) {
      pXVar6 = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),0);
    }
    *(X509 **)(param_1 + 0xb8) = pXVar6;
    *(undefined4 *)(param_1 + 0xb0) = 0x15;
    uVar7 = (**(code **)(param_1 + 0x38))(0,param_1);
    if ((int)uVar7 == 0) {
      return uVar7;
    }
  }
  if (iVar2 < 1) {
    return 1;
  }
  iVar4 = iVar9;
LAB_00b0fc00:
  iVar9 = iVar4;
  if (pXVar10 != (X509 *)0x0) goto LAB_00b0fc28;
LAB_00b0fcf4:
  do {
    do {
      uVar7 = ossl_x509_check_cert_time(param_1,pXVar5,iVar9);
      if ((int)uVar7 == 0) {
        return uVar7;
      }
      *(X509 **)(param_1 + 0xb8) = pXVar5;
      *(X509 **)(param_1 + 0xc0) = pXVar10;
      *(int *)(param_1 + 0xac) = iVar9;
      uVar7 = (**(code **)(param_1 + 0x38))(1,param_1);
      if ((int)uVar7 == 0) {
        return uVar7;
      }
      iVar4 = iVar9 + -1;
      if (iVar9 < 1) {
        return 1;
      }
      pXVar6 = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar4);
      bVar1 = pXVar5 == (X509 *)0x0;
      pXVar10 = pXVar5;
      pXVar5 = pXVar6;
      iVar9 = iVar4;
    } while (bVar1);
LAB_00b0fc28:
    iVar9 = iVar4;
    if (pXVar5 == pXVar10) {
      if (((*(byte *)(*(long *)(param_1 + 0x20) + 0x19) >> 6 & 1) == 0) ||
         ((*(uint *)&pXVar10[1].name >> 0xd & 1) == 0)) goto LAB_00b0fcf4;
      iVar2 = iVar4;
      if ((*(uint *)&pXVar10[1].name >> 4 & 1) != 0) goto LAB_00b0fc34;
    }
    else {
      iVar2 = iVar4 + 1;
LAB_00b0fc34:
      iVar3 = ossl_x509_signing_allowed(pXVar10,pXVar5);
      if (iVar3 != 0) {
        if (-1 < iVar2) {
          *(int *)(param_1 + 0xac) = iVar2;
        }
        *(int *)(param_1 + 0xb0) = iVar3;
        *(X509 **)(param_1 + 0xb8) = pXVar10;
        uVar7 = (**(code **)(param_1 + 0x38))(0,param_1);
        if ((int)uVar7 == 0) {
          return uVar7;
        }
      }
    }
    r = (EVP_PKEY *)X509_get0_pubkey(pXVar10);
    if (r == (EVP_PKEY *)0x0) {
      if (-1 < iVar2) {
        *(int *)(param_1 + 0xac) = iVar2;
      }
      pcVar8 = *(code **)(param_1 + 0x38);
      *(X509 **)(param_1 + 0xb8) = pXVar10;
      *(undefined4 *)(param_1 + 0xb0) = 6;
    }
    else {
      iVar2 = X509_verify(pXVar5,r);
      if (0 < iVar2) goto LAB_00b0fcf4;
      *(int *)(param_1 + 0xac) = iVar4;
      pXVar6 = pXVar5;
      if (pXVar5 == (X509 *)0x0) {
        pXVar6 = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar4);
      }
      pcVar8 = *(code **)(param_1 + 0x38);
      *(X509 **)(param_1 + 0xb8) = pXVar6;
      *(undefined4 *)(param_1 + 0xb0) = 7;
    }
    uVar7 = (*pcVar8)(0,param_1);
    if ((int)uVar7 == 0) {
      return uVar7;
    }
  } while( true );
}

