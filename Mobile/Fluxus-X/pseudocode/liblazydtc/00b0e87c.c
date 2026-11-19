/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0e87c
 */

undefined8 ossl_x509_check_cert_time(long param_1,long param_2,int param_3)

{
  int iVar1;
  ASN1_TIME *pAVar2;
  long lVar3;
  undefined8 uVar4;
  uint uVar5;
  code *pcVar6;
  undefined4 uVar7;
  time_t *t;
  
  uVar5 = (uint)*(undefined8 *)(*(long *)(param_1 + 0x20) + 0x18);
  if ((uVar5 >> 1 & 1) == 0) {
    t = (time_t *)0x0;
    if ((uVar5 >> 0x15 & 1) != 0) {
      return 1;
    }
  }
  else {
    t = (time_t *)(*(long *)(param_1 + 0x20) + 8);
  }
  pAVar2 = (ASN1_TIME *)X509_get0_notBefore(param_2);
  iVar1 = X509_cmp_time(pAVar2,t);
  if ((param_3 < 0) && (-1 < iVar1)) {
    return 0;
  }
  if (iVar1 == 0) {
    if (param_3 < 0) {
      iVar1 = *(int *)(param_1 + 0xac);
    }
    else {
      *(int *)(param_1 + 0xac) = param_3;
      iVar1 = param_3;
    }
    lVar3 = param_2;
    if (param_2 == 0) {
      lVar3 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar1);
    }
    pcVar6 = *(code **)(param_1 + 0x38);
    *(long *)(param_1 + 0xb8) = lVar3;
    uVar7 = 0xd;
  }
  else {
    if (iVar1 < 1) goto LAB_00b0e94c;
    if (param_3 < 0) {
      iVar1 = *(int *)(param_1 + 0xac);
    }
    else {
      *(int *)(param_1 + 0xac) = param_3;
      iVar1 = param_3;
    }
    lVar3 = param_2;
    if (param_2 == 0) {
      lVar3 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar1);
    }
    pcVar6 = *(code **)(param_1 + 0x38);
    uVar7 = 9;
    *(long *)(param_1 + 0xb8) = lVar3;
  }
  *(undefined4 *)(param_1 + 0xb0) = uVar7;
  uVar4 = (*pcVar6)(0,param_1);
  if ((int)uVar4 == 0) {
    return uVar4;
  }
LAB_00b0e94c:
  pAVar2 = (ASN1_TIME *)X509_get0_notAfter(param_2);
  iVar1 = X509_cmp_time(pAVar2,t);
  if ((param_3 < 0) && (iVar1 < 1)) {
    return 0;
  }
  if (iVar1 == 0) {
    if (param_3 < 0) {
      param_3 = *(int *)(param_1 + 0xac);
    }
    else {
      *(int *)(param_1 + 0xac) = param_3;
    }
    if (param_2 == 0) {
      param_2 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),param_3);
    }
    pcVar6 = *(code **)(param_1 + 0x38);
    *(long *)(param_1 + 0xb8) = param_2;
    uVar7 = 0xe;
  }
  else {
    if (-1 < iVar1) {
      return 1;
    }
    if (param_3 < 0) {
      param_3 = *(int *)(param_1 + 0xac);
    }
    else {
      *(int *)(param_1 + 0xac) = param_3;
    }
    if (param_2 == 0) {
      param_2 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),param_3);
    }
    pcVar6 = *(code **)(param_1 + 0x38);
    uVar7 = 10;
    *(long *)(param_1 + 0xb8) = param_2;
  }
  *(undefined4 *)(param_1 + 0xb0) = uVar7;
  uVar4 = (*pcVar6)(0,param_1);
  if ((int)uVar4 == 0) {
    return uVar4;
  }
  return 1;
}

