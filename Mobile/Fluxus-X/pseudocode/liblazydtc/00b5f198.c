/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5f198
 */

undefined8 FUN_00b5f198(long param_1,long param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 uVar2;
  uint uVar3;
  uint local_74;
  uchar auStack_70 [64];
  
  local_74 = 0;
  iVar1 = ossl_prov_is_running();
  uVar2 = 0;
  if ((param_1 != 0) && (iVar1 != 0)) {
    *(byte *)(param_1 + 0x1c) = *(byte *)(param_1 + 0x1c) | 1;
    uVar2 = 0;
    if (*(EVP_MD_CTX **)(param_1 + 0x28) != (EVP_MD_CTX *)0x0) {
      if (param_2 == 0) {
        uVar3 = 0;
      }
      else {
        iVar1 = EVP_DigestFinal_ex(*(EVP_MD_CTX **)(param_1 + 0x28),auStack_70,&local_74);
        if (iVar1 == 0) {
          return 0;
        }
        uVar3 = local_74;
      }
      uVar2 = FUN_00b5e540(param_1,param_2,param_3,param_4,auStack_70,uVar3);
    }
  }
  return uVar2;
}

