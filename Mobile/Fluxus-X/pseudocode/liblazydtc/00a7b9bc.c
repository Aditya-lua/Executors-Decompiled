/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7b9bc
 */

undefined8 EVP_SIGNATURE_names_do_all(undefined4 *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  
  if (*(long *)(param_1 + 6) == 0) {
    return 1;
  }
  uVar1 = evp_names_do_all(*(long *)(param_1 + 6),*param_1,param_2,param_3);
  return uVar1;
}

