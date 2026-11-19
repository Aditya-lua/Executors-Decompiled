/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b06724
 */

undefined8 FUN_00b06724(X509_NAME *param_1,undefined8 param_2)

{
  int iVar1;
  int iVar2;
  X509_NAME_ENTRY *ne;
  ASN1_STRING *pAVar3;
  int *piVar4;
  undefined8 local_28;
  
  iVar1 = -1;
  local_28 = 0;
  while (iVar1 = X509_NAME_get_index_by_NID(param_1,0x30,iVar1), -1 < iVar1) {
    ne = X509_NAME_get_entry(param_1,iVar1);
    pAVar3 = X509_NAME_ENTRY_get_data(ne);
    iVar2 = FUN_00b068a8(&local_28,pAVar3);
    if (iVar2 == 0) {
      return 0;
    }
  }
  iVar1 = OPENSSL_sk_num(param_2);
  if (iVar1 < 1) {
    return local_28;
  }
  iVar1 = 0;
  while ((piVar4 = (int *)OPENSSL_sk_value(param_2,iVar1), *piVar4 != 1 ||
         (iVar2 = FUN_00b068a8(&local_28,*(undefined8 *)(piVar4 + 2)), iVar2 != 0))) {
    iVar1 = iVar1 + 1;
    iVar2 = OPENSSL_sk_num(param_2);
    if (iVar2 <= iVar1) {
      return local_28;
    }
  }
  return 0;
}

