/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a668e8
 */

void EVP_KEYMGMT_do_all_provided(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  evp_generic_do_all(param_1,10,param_2,param_3,FUN_00a662e4,EVP_KEYMGMT_up_ref,EVP_KEYMGMT_free);
  return;
}

