/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a662bc
 */

void evp_keymgmt_fetch_by_number(undefined8 param_1,undefined4 param_2,undefined8 param_3)

{
  evp_generic_fetch_by_number
            (param_1,10,param_2,param_3,FUN_00a662e4,EVP_KEYMGMT_up_ref,EVP_KEYMGMT_free);
  return;
}

