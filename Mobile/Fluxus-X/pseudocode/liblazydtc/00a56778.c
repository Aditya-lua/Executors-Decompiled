/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a56778
 */

void evp_asym_cipher_fetch_from_prov(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  evp_generic_fetch_from_prov
            (param_1,0xd,param_2,param_3,&LAB_00a56410,EVP_ASYM_CIPHER_up_ref,EVP_ASYM_CIPHER_free);
  return;
}

