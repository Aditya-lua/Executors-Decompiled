/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7ee94
 */

bool ossl_ffc_params_FIPS186_2_generate
               (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
               undefined8 param_5,undefined8 param_6,undefined8 param_7)

{
  int iVar1;
  
  iVar1 = ossl_ffc_params_FIPS186_2_gen_verify
                    (param_1,param_2,1,param_4,param_4,param_5,param_6,param_7);
  if (iVar1 != 0) {
    ossl_ffc_params_enable_flags(param_2,4,1);
  }
  return iVar1 != 0;
}

