/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad2548
 */

void EVP_PKEY_CTX_set_rsa_pss_keygen_md_name
               (undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  FUN_00ad256c(param_1,0x390,4,"digest",param_2,"properties",param_3);
  return;
}

