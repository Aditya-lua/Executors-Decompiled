/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b60e2c
 */

undefined8 FUN_00b60e2c(long param_1,long param_2,ulong *param_3,ulong param_4)

{
  uint uVar1;
  int iVar2;
  undefined8 uVar3;
  ulong uVar4;
  uchar auStack_80 [64];
  uint local_38;
  uint local_34;
  
  local_38 = 0;
  if (param_1 == 0) {
    return 0;
  }
  if (*(long *)(param_1 + 0x168) == 0) {
LAB_00b60ef4:
    uVar3 = 0;
  }
  else {
    if (param_2 != 0) {
      uVar3 = FUN_00b61478(param_1);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
      iVar2 = EVP_DigestFinal_ex(*(EVP_MD_CTX **)(param_1 + 0x168),auStack_80,&local_38);
      if (iVar2 == 0) {
        return 0;
      }
    }
    uVar1 = local_38;
    iVar2 = ECDSA_size(*(EC_KEY **)(param_1 + 0x10));
    uVar4 = (ulong)iVar2;
    if (param_2 != 0) {
      if (param_4 < uVar4) {
        return 0;
      }
      if ((*(ulong *)(param_1 + 0x170) != 0) && (*(ulong *)(param_1 + 0x170) != (ulong)uVar1)) {
        return 0;
      }
      iVar2 = ossl_sm2_internal_sign
                        (auStack_80,(ulong)uVar1,param_2,&local_34,*(undefined8 *)(param_1 + 0x10));
      if (iVar2 < 1) goto LAB_00b60ef4;
      uVar4 = (ulong)local_34;
    }
    uVar3 = 1;
    *param_3 = uVar4;
  }
  return uVar3;
}

