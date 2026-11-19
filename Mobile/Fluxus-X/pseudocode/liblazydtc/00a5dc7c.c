/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5dc7c
 */

void EVP_default_properties_enable_fips(undefined8 param_1,undefined8 param_2)

{
  evp_default_properties_enable_fips_int(param_1,param_2,1);
  return;
}

