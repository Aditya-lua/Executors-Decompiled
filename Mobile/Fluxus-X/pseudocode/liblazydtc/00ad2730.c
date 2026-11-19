/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad2730
 */

void EVP_PKEY_CTX_set_rsa_oaep_md_name(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  FUN_00ad256c(param_1,6,0x600,"digest",param_2,"digest-props",param_3);
  return;
}

