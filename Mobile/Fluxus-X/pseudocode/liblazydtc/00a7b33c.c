/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7b33c
 */

void EVP_SIGNATURE_fetch(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  evp_generic_fetch(param_1,0xc,param_2,param_3,&LAB_00a7b364,EVP_SIGNATURE_up_ref,
                    EVP_SIGNATURE_free);
  return;
}

