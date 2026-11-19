/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5f98
 */

ASN1_VALUE * FUN_00af5f98(undefined8 param_1,undefined8 param_2,undefined4 *param_3)

{
  int iVar1;
  int iVar2;
  ASN1_VALUE *pAVar3;
  ASN1_VALUE *pAVar4;
  ASN1_STRING *str;
  size_t __n;
  undefined1 local_34;
  undefined1 local_33;
  undefined1 local_32;
  
  local_34 = (undefined1)((ulong)param_2 >> 8);
  local_33 = (undefined1)param_2;
  if (param_3 == (undefined4 *)0x0) {
    __n = 2;
  }
  else {
    __n = 3;
    local_32 = (undefined1)*param_3;
  }
  iVar1 = OPENSSL_sk_num(param_1);
  if (0 < iVar1) {
    iVar1 = 0;
    do {
      pAVar3 = (ASN1_VALUE *)OPENSSL_sk_value(param_1,iVar1);
      if ((**(int **)pAVar3 == (int)__n) &&
         (iVar2 = memcmp(*(void **)(*(int **)pAVar3 + 2),&local_34,__n), iVar2 == 0)) {
        return pAVar3;
      }
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(param_1);
    } while (iVar1 < iVar2);
  }
  pAVar3 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7e7f8);
  if (pAVar3 != (ASN1_VALUE *)0x0) {
    if (*(long *)(pAVar3 + 8) == 0) {
      pAVar4 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7e7c0);
      *(ASN1_VALUE **)(pAVar3 + 8) = pAVar4;
      if (pAVar4 == (ASN1_VALUE *)0x0) goto LAB_00af6094;
    }
    str = *(ASN1_STRING **)pAVar3;
    if (str == (ASN1_STRING *)0x0) {
      str = ASN1_OCTET_STRING_new();
      *(ASN1_STRING **)pAVar3 = str;
      if (str == (ASN1_OCTET_STRING *)0x0) goto LAB_00af6094;
    }
    iVar1 = ASN1_OCTET_STRING_set(str,&local_34,(int)__n);
    if ((iVar1 != 0) && (iVar1 = OPENSSL_sk_push(param_1,pAVar3), iVar1 != 0)) {
      return pAVar3;
    }
  }
LAB_00af6094:
  ASN1_item_free(pAVar3,(ASN1_ITEM *)&DAT_00c7e7f8);
  return (ASN1_VALUE *)0x0;
}

