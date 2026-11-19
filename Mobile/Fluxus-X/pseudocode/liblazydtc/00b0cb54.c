/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0cb54
 */

int X509_check_trust(X509 *x,int id,int flags)

{
  int iVar1;
  undefined *puVar2;
  uint uVar3;
  int local_58 [10];
  
  if (id == 0) {
    iVar1 = FUN_00b0cc30(0x38e,x,flags | 8);
    return iVar1;
  }
  uVar3 = id - 1;
  if (uVar3 < 8) {
LAB_00b0cb84:
    puVar2 = &DAT_00cc9bf8 + (long)(int)uVar3 * 0x28;
LAB_00b0cb94:
    iVar1 = (**(code **)(puVar2 + 8))(puVar2,x,flags);
  }
  else {
    if (DAT_00d227e8 != 0) {
      local_58[0] = id;
      iVar1 = OPENSSL_sk_find(DAT_00d227e8,local_58);
      if (-1 < iVar1) {
        uVar3 = iVar1 + 8;
        if (-1 < (int)uVar3) {
          if ((int)uVar3 < 8) goto LAB_00b0cb84;
          puVar2 = (undefined *)OPENSSL_sk_value(DAT_00d227e8,iVar1);
          goto LAB_00b0cb94;
        }
      }
    }
    iVar1 = (*(code *)PTR_FUN_00cc9bf0)(id,x,flags);
  }
  return iVar1;
}

