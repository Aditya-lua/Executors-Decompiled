/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f24c
 */

undefined8 DH_set0_pqg(long param_1,long param_2,undefined8 param_3,long param_4)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if ((param_2 != 0 || *(long *)(param_1 + 8) != 0) &&
     (uVar1 = 0, param_4 != 0 || *(long *)(param_1 + 0x18) != 0)) {
    ossl_ffc_params_set0_pqg();
    ossl_dh_cache_named_group(param_1);
    *(long *)(param_1 + 200) = *(long *)(param_1 + 200) + 1;
    uVar1 = 1;
  }
  return uVar1;
}

