/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a63e44
 */

void EVP_KEYEXCH_do_all_provided(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  evp_generic_do_all(param_1,0xb,param_2,param_3,&LAB_00a63150,EVP_KEYEXCH_up_ref,EVP_KEYEXCH_free);
  return;
}

