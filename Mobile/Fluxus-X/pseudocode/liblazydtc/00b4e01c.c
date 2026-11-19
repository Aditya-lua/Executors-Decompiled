/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4e01c
 */

ulong ossl_dsa_check_pub_key_partial(long param_1,undefined8 param_2,int *param_3)

{
  ulong uVar1;
  
  uVar1 = FUN_00b4ded4(param_1,param_3);
  if (((int)uVar1 != 0) &&
     (uVar1 = ossl_ffc_validate_public_key_partial(param_1 + 8,param_2,param_3), (int)uVar1 != 0)) {
    uVar1 = (ulong)(*param_3 == 0);
  }
  return uVar1;
}

