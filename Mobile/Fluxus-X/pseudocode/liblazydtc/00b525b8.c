/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b525b8
 */

ulong FUN_00b525b8(undefined8 param_1,uint param_2)

{
  int iVar1;
  ulong uVar2;
  
  uVar2 = ossl_prov_is_running();
  if ((int)uVar2 != 0) {
    if ((param_2 & 0x83) == 0) {
      uVar2 = 1;
    }
    else {
      if ((~param_2 & 3) == 0) {
        iVar1 = ossl_rsa_validate_pairwise(param_1);
      }
      else {
        if ((param_2 & 1) == 0) {
          uVar2 = 1;
        }
        else {
          iVar1 = ossl_rsa_validate_private(param_1);
          uVar2 = (ulong)(iVar1 != 0);
        }
        if ((param_2 >> 1 & 1) == 0) {
          return uVar2;
        }
        if ((int)uVar2 == 0) {
          return uVar2;
        }
        iVar1 = ossl_rsa_validate_public(param_1);
      }
      uVar2 = (ulong)(iVar1 != 0);
    }
  }
  return uVar2;
}

