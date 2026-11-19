/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b11384
 */

undefined8 FUN_00b11384(long param_1)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  int iVar7;
  long lVar8;
  
  lVar8 = *(long *)(param_1 + 0x20);
  uVar5 = *(undefined8 *)(param_1 + 8);
  if (*(long *)(lVar8 + 0x38) != 0) {
    iVar1 = OPENSSL_sk_num();
    puVar6 = (undefined8 *)(lVar8 + 0x48);
    if ((void *)*puVar6 != (void *)0x0) {
      CRYPTO_free((void *)*puVar6);
      *puVar6 = 0;
    }
    if (0 < iVar1) {
      iVar7 = 0;
      do {
        uVar3 = OPENSSL_sk_value(*(undefined8 *)(lVar8 + 0x38),iVar7);
        iVar2 = X509_check_host(uVar5,uVar3,0,*(undefined4 *)(lVar8 + 0x40),puVar6);
        if (0 < iVar2) goto LAB_00b11458;
        iVar7 = iVar7 + 1;
      } while (iVar7 < iVar1);
    }
    if (iVar1 != 0) {
      lVar4 = *(long *)(param_1 + 8);
      *(undefined4 *)(param_1 + 0xac) = 0;
      if (lVar4 == 0) {
        lVar4 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),0);
      }
      *(long *)(param_1 + 0xb8) = lVar4;
      *(undefined4 *)(param_1 + 0xb0) = 0x3e;
      uVar3 = (**(code **)(param_1 + 0x38))(0,param_1);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
    }
  }
LAB_00b11458:
  if ((*(long *)(lVar8 + 0x50) != 0) &&
     (iVar1 = X509_check_email(uVar5,*(long *)(lVar8 + 0x50),*(undefined8 *)(lVar8 + 0x58),0),
     iVar1 < 1)) {
    lVar4 = *(long *)(param_1 + 8);
    *(undefined4 *)(param_1 + 0xac) = 0;
    if (lVar4 == 0) {
      lVar4 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),0);
    }
    *(long *)(param_1 + 0xb8) = lVar4;
    *(undefined4 *)(param_1 + 0xb0) = 0x3f;
    uVar3 = (**(code **)(param_1 + 0x38))(0,param_1);
    if ((int)uVar3 == 0) {
      return uVar3;
    }
  }
  if ((*(long *)(lVar8 + 0x60) != 0) &&
     (iVar1 = X509_check_ip(uVar5,*(long *)(lVar8 + 0x60),*(undefined8 *)(lVar8 + 0x68),0),
     iVar1 < 1)) {
    lVar8 = *(long *)(param_1 + 8);
    *(undefined4 *)(param_1 + 0xac) = 0;
    if (lVar8 == 0) {
      lVar8 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),0);
    }
    *(long *)(param_1 + 0xb8) = lVar8;
    *(undefined4 *)(param_1 + 0xb0) = 0x40;
    uVar5 = (**(code **)(param_1 + 0x38))(0,param_1);
    if ((int)uVar5 == 0) {
      return uVar5;
    }
  }
  return 1;
}

