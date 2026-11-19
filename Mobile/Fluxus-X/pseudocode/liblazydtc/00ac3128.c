/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac3128
 */

void ossl_pkcs7_resolve_libctx(long param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  int iVar3;
  int iVar4;
  undefined8 uVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  
  if (param_1 == 0) {
    return;
  }
  if (*(long *)(param_1 + 0x20) == 0) {
    return;
  }
  uVar1 = *(undefined8 *)(param_1 + 0x28);
  uVar2 = *(undefined8 *)(param_1 + 0x30);
  iVar3 = OBJ_obj2nid(*(ASN1_OBJECT **)(param_1 + 0x18));
  if (iVar3 == 0x18) {
    lVar6 = *(long *)(param_1 + 0x20);
    uVar7 = *(undefined8 *)(lVar6 + 0x30);
joined_r0x00ac32e0:
    if (lVar6 == 0) goto LAB_00ac31f4;
LAB_00ac317c:
    iVar3 = OBJ_obj2nid(*(ASN1_OBJECT **)(param_1 + 0x18));
    if ((iVar3 == 0x16) || (iVar3 = OBJ_obj2nid(*(ASN1_OBJECT **)(param_1 + 0x18)), iVar3 == 0x18))
    {
      lVar6 = *(long *)(param_1 + 0x20);
      uVar8 = *(undefined8 *)(lVar6 + 0x20);
    }
    else {
      lVar6 = *(long *)(param_1 + 0x20);
      uVar8 = 0;
    }
    if (lVar6 != 0) {
      iVar3 = OBJ_obj2nid(*(ASN1_OBJECT **)(param_1 + 0x18));
      if (iVar3 != 0x16) {
        iVar3 = OBJ_obj2nid(*(ASN1_OBJECT **)(param_1 + 0x18));
        uVar9 = 0;
        if (iVar3 != 0x18) goto LAB_00ac3200;
      }
      uVar9 = *(undefined8 *)(*(long *)(param_1 + 0x20) + 0x10);
      goto LAB_00ac3200;
    }
  }
  else {
    iVar3 = OBJ_obj2nid(*(ASN1_OBJECT **)(param_1 + 0x18));
    if (iVar3 != 0x17) {
      lVar6 = *(long *)(param_1 + 0x20);
      uVar7 = 0;
      goto joined_r0x00ac32e0;
    }
    uVar7 = *(undefined8 *)(*(long *)(param_1 + 0x20) + 8);
    if (*(long *)(param_1 + 0x20) != 0) goto LAB_00ac317c;
LAB_00ac31f4:
    uVar8 = 0;
  }
  uVar9 = 0;
LAB_00ac3200:
  iVar3 = OPENSSL_sk_num(uVar9);
  if (0 < iVar3) {
    iVar3 = 0;
    do {
      uVar5 = OPENSSL_sk_value(uVar9,iVar3);
      ossl_x509_set0_libctx(uVar5,uVar1,uVar2);
      iVar3 = iVar3 + 1;
      iVar4 = OPENSSL_sk_num(uVar9);
    } while (iVar3 < iVar4);
  }
  iVar3 = OPENSSL_sk_num(uVar7);
  if (0 < iVar3) {
    iVar3 = 0;
    do {
      lVar6 = OPENSSL_sk_value(uVar7,iVar3);
      ossl_x509_set0_libctx(*(undefined8 *)(lVar6 + 0x20),uVar1,uVar2);
      iVar3 = iVar3 + 1;
      iVar4 = OPENSSL_sk_num(uVar7);
    } while (iVar3 < iVar4);
  }
  iVar3 = OPENSSL_sk_num(uVar8);
  if (0 < iVar3) {
    iVar3 = 0;
    do {
      lVar6 = OPENSSL_sk_value(uVar8,iVar3);
      if (lVar6 != 0) {
        *(undefined8 **)(lVar6 + 0x40) = (undefined8 *)(param_1 + 0x28);
      }
      iVar3 = iVar3 + 1;
      iVar4 = OPENSSL_sk_num(uVar8);
    } while (iVar3 < iVar4);
  }
  return;
}

