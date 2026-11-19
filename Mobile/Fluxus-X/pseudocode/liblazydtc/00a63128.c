/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a63128
 */

void EVP_KEYEXCH_fetch(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  evp_generic_fetch(param_1,0xb,param_2,param_3,&LAB_00a63150,EVP_KEYEXCH_up_ref,EVP_KEYEXCH_free);
  return;
}

