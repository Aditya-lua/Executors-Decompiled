/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5ce70
 */

undefined8 FUN_00b5ce70(long param_1,uchar *param_2,ulong *param_3,ulong param_4)

{
  int iVar1;
  undefined8 uVar2;
  ulong uVar3;
  uint dgstlen;
  uint local_88;
  uchar auStack_84 [64];
  uint local_44;
  
  local_88 = 0;
  iVar1 = ossl_prov_is_running();
  uVar2 = 0;
  if ((param_1 != 0) && (iVar1 != 0)) {
    uVar2 = 0;
    if (*(EVP_MD_CTX **)(param_1 + 0x178) != (EVP_MD_CTX *)0x0) {
      if (param_2 == (uchar *)0x0) {
        dgstlen = 0;
      }
      else {
        iVar1 = EVP_DigestFinal_ex(*(EVP_MD_CTX **)(param_1 + 0x178),auStack_84,&local_88);
        if (iVar1 == 0) {
          return 0;
        }
        dgstlen = local_88;
      }
      *(byte *)(param_1 + 0x4a) = *(byte *)(param_1 + 0x4a) | 1;
      iVar1 = ECDSA_size(*(EC_KEY **)(param_1 + 0x10));
      uVar2 = ossl_prov_is_running();
      if ((int)uVar2 != 0) {
        uVar3 = (ulong)iVar1;
        if (param_2 != (uchar *)0x0) {
          if (param_4 < uVar3) {
            return 0;
          }
          if ((*(ulong *)(param_1 + 0x160) != 0) && (*(ulong *)(param_1 + 0x160) != (ulong)dgstlen))
          {
            return 0;
          }
          iVar1 = ECDSA_sign_ex(0,auStack_84,dgstlen,param_2,&local_44,*(BIGNUM **)(param_1 + 0x180)
                                ,*(BIGNUM **)(param_1 + 0x188),*(EC_KEY **)(param_1 + 0x10));
          if (iVar1 < 1) {
            return 0;
          }
          uVar3 = (ulong)local_44;
        }
        uVar2 = 1;
        *param_3 = uVar3;
      }
    }
  }
  return uVar2;
}

