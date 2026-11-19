/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad297c
 */

void EVP_PKEY_CTX_set_rsa_pss_keygen_mgf1_md_name(undefined8 param_1,undefined8 param_2)

{
  FUN_00ad256c(param_1,0x390,4,"mgf1-digest",param_2,0,0);
  return;
}

