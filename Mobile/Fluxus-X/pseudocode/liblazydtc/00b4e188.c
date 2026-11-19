/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4e188
 */

void ossl_dsa_generate_ffc_parameters
               (long param_1,int param_2,int param_3,int param_4,undefined8 param_5)

{
  int iVar1;
  undefined1 auStack_14 [4];
  
  if (param_2 == 1) {
    iVar1 = ossl_ffc_params_FIPS186_2_generate();
  }
  else {
    iVar1 = ossl_ffc_params_FIPS186_4_generate
                      (*(undefined8 *)(param_1 + 0xb8),param_1 + 8,0,(long)param_3,(long)param_4,
                       auStack_14,param_5);
  }
  if (0 < iVar1) {
    *(long *)(param_1 + 0xc0) = *(long *)(param_1 + 0xc0) + 1;
  }
  return;
}

