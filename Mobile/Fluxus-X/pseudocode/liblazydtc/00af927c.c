/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af927c
 */

undefined8 X509v3_asid_add_id_or_range(long *param_1,int param_2,undefined8 param_3,long param_4)

{
  int iVar1;
  undefined8 uVar2;
  ASN1_VALUE *pAVar3;
  ASN1_VALUE *pAVar4;
  int *piVar5;
  
  if (param_1 == (long *)0x0) {
    return 0;
  }
  if (param_2 == 1) {
    param_1 = param_1 + 1;
    piVar5 = (int *)*param_1;
    if (piVar5 == (int *)0x0) goto LAB_00af92d4;
LAB_00af92b4:
    if (*piVar5 != 1) {
      return 0;
    }
  }
  else {
    if (param_2 != 0) {
      return 0;
    }
    piVar5 = (int *)*param_1;
    if (piVar5 != (int *)0x0) goto LAB_00af92b4;
LAB_00af92d4:
    pAVar3 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7ebc0);
    *param_1 = (long)pAVar3;
    if (pAVar3 == (ASN1_VALUE *)0x0) {
      return 0;
    }
    uVar2 = OPENSSL_sk_new(FUN_00af93e0);
    *(undefined8 *)(*param_1 + 8) = uVar2;
    pAVar3 = (ASN1_VALUE *)*param_1;
    if (*(long *)(pAVar3 + 8) == 0) {
      ASN1_item_free(pAVar3,(ASN1_ITEM *)&DAT_00c7ebc0);
      *param_1 = 0;
      return 0;
    }
    *(undefined4 *)pAVar3 = 1;
  }
  pAVar3 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7eb88);
  if (pAVar3 == (ASN1_VALUE *)0x0) {
    return 0;
  }
  iVar1 = OPENSSL_sk_reserve(*(undefined8 *)(*param_1 + 8),1);
  if (iVar1 != 0) {
    if (param_4 == 0) {
      *(undefined4 *)pAVar3 = 0;
      *(undefined8 *)(pAVar3 + 8) = param_3;
    }
    else {
      *(undefined4 *)pAVar3 = 1;
      pAVar4 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7eb50);
      *(ASN1_VALUE **)(pAVar3 + 8) = pAVar4;
      if (pAVar4 == (ASN1_VALUE *)0x0) goto LAB_00af93bc;
      ASN1_INTEGER_free(*(ASN1_STRING **)pAVar4);
      **(undefined8 **)(pAVar3 + 8) = param_3;
      ASN1_INTEGER_free(*(ASN1_STRING **)(*(long *)(pAVar3 + 8) + 8));
      *(long *)(*(long *)(pAVar3 + 8) + 8) = param_4;
    }
    iVar1 = OPENSSL_sk_push(*(undefined8 *)(*param_1 + 8),pAVar3);
    if (iVar1 != 0) {
      return 1;
    }
  }
LAB_00af93bc:
  ASN1_item_free(pAVar3,(ASN1_ITEM *)&DAT_00c7eb88);
  return 0;
}

