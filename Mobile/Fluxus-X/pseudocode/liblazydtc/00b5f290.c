/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5f290
 */

ulong FUN_00b5f290(long param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  uint uVar2;
  ulong uVar3;
  uchar auStack_70 [64];
  uint local_24;
  
  local_24 = 0;
  iVar1 = ossl_prov_is_running();
  uVar3 = 0;
  if ((param_1 != 0) && (iVar1 != 0)) {
    *(byte *)(param_1 + 0x1c) = *(byte *)(param_1 + 0x1c) | 1;
    uVar3 = 0;
    if (*(EVP_MD_CTX **)(param_1 + 0x28) != (EVP_MD_CTX *)0x0) {
      uVar2 = EVP_DigestFinal_ex(*(EVP_MD_CTX **)(param_1 + 0x28),auStack_70,&local_24);
      uVar3 = (ulong)uVar2;
      if (uVar2 != 0) {
        uVar3 = FUN_00b5ead0(param_1,param_2,param_3,auStack_70,local_24);
      }
    }
  }
  return uVar3;
}

