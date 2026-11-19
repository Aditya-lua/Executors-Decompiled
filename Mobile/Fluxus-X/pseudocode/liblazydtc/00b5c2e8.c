/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5c2e8
 */

undefined8 FUN_00b5c2e8(long param_1,long param_2,ulong *param_3,ulong param_4)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  ulong uVar4;
  uint uVar5;
  ulong uVar6;
  uchar auStack_90 [64];
  uint local_48;
  uint local_44;
  
  local_48 = 0;
  iVar1 = ossl_prov_is_running();
  uVar3 = 0;
  if ((param_1 != 0) && (iVar1 != 0)) {
    uVar3 = 0;
    if (*(EVP_MD_CTX **)(param_1 + 0x168) != (EVP_MD_CTX *)0x0) {
      if (param_2 == 0) {
        uVar5 = 0;
      }
      else {
        iVar1 = EVP_DigestFinal_ex(*(EVP_MD_CTX **)(param_1 + 0x168),auStack_90,&local_48);
        if (iVar1 == 0) {
          return 0;
        }
        uVar5 = local_48;
      }
      *(byte *)(param_1 + 0x18) = *(byte *)(param_1 + 0x18) | 1;
      iVar1 = DSA_size(*(DSA **)(param_1 + 0x10));
      if (*(long *)(param_1 + 0x160) == 0) {
        uVar6 = 0;
        uVar3 = ossl_prov_is_running();
        iVar2 = (int)uVar3;
      }
      else {
        iVar2 = EVP_MD_get_size(*(long *)(param_1 + 0x160));
        uVar6 = (ulong)iVar2;
        uVar3 = ossl_prov_is_running();
        iVar2 = (int)uVar3;
      }
      if (iVar2 != 0) {
        uVar4 = (ulong)iVar1;
        if (param_2 != 0) {
          if (param_4 < uVar4) {
            return 0;
          }
          if ((uVar6 != 0) && (uVar6 != uVar5)) {
            return 0;
          }
          iVar1 = ossl_dsa_sign_int(0,auStack_90,(ulong)uVar5,param_2,&local_44,
                                    *(undefined8 *)(param_1 + 0x10));
          if (iVar1 < 1) {
            return 0;
          }
          uVar4 = (ulong)local_44;
        }
        uVar3 = 1;
        *param_3 = uVar4;
      }
    }
  }
  return uVar3;
}

