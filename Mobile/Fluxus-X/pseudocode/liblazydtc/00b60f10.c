/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b60f10
 */

ulong FUN_00b60f10(long param_1,undefined8 param_2,undefined4 param_3)

{
  int iVar1;
  uint uVar2;
  ulong uVar3;
  uchar auStack_70 [64];
  uint local_24;
  
  local_24 = 0;
  uVar3 = 0;
  if (param_1 != 0) {
    if (*(long *)(param_1 + 0x168) == 0) {
      uVar3 = 0;
    }
    else {
      iVar1 = EVP_MD_get_size(*(undefined8 *)(param_1 + 0x160));
      uVar3 = 0;
      if ((iVar1 < 0x41) && (uVar3 = FUN_00b61478(param_1), (int)uVar3 != 0)) {
        uVar2 = EVP_DigestFinal_ex(*(EVP_MD_CTX **)(param_1 + 0x168),auStack_70,&local_24);
        uVar3 = (ulong)uVar2;
        if (uVar2 != 0) {
          if ((*(ulong *)(param_1 + 0x170) == 0) ||
             (uVar3 = 0, *(ulong *)(param_1 + 0x170) == (ulong)local_24)) {
            uVar3 = ossl_sm2_internal_verify
                              (auStack_70,(ulong)local_24,param_2,param_3,
                               *(undefined8 *)(param_1 + 0x10));
          }
        }
      }
    }
  }
  return uVar3;
}

