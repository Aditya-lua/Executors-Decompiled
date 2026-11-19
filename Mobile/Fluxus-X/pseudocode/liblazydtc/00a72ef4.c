/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a72ef4
 */

undefined8 FUN_00a72ef4(undefined4 param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined1 auStack_d0 [80];
  long local_80 [10];
  
  iVar1 = EVP_PKEY_get_base_id(*(undefined8 *)(param_3 + 0x20));
  if ((iVar1 != 6) &&
     (iVar1 = EVP_PKEY_get_base_id(*(undefined8 *)(param_3 + 0x20)), iVar1 != 0x390)) {
    return 0;
  }
  uVar2 = EVP_PKEY_get0_RSA(*(undefined8 *)(param_3 + 0x20));
  iVar1 = RSA_get_multi_prime_extra_count();
  if (((iVar1 == 0) ||
      (iVar1 = RSA_get0_multi_prime_crt_params(uVar2,local_80,auStack_d0), iVar1 == 0)) ||
     (local_80[0] == 0)) {
    uVar2 = 0;
  }
  else {
    uVar2 = 0;
    if (*(int *)(*(long *)(param_3 + 0x30) + 8) == 2) {
      *(long *)(param_3 + 0x20) = local_80[0];
      uVar2 = FUN_00a6fd84(param_1,param_2,param_3);
    }
  }
  return uVar2;
}

