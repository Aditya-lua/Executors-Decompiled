/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a65418
 */

void EVP_KEM_do_all_provided(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  evp_generic_do_all(param_1,0xe,param_2,param_3,&LAB_00a6503c,EVP_KEM_up_ref,EVP_KEM_free);
  return;
}

