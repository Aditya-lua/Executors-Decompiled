/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7efac
 */

undefined8
ossl_ffc_params_FIPS186_4_validate
          (undefined8 param_1,undefined8 *param_2,undefined4 param_3,undefined8 param_4,
          undefined8 param_5)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  
  if (((param_2 == (undefined8 *)0x0) || ((BIGNUM *)*param_2 == (BIGNUM *)0x0)) || (param_2[1] == 0)
     ) {
    return 0;
  }
  iVar1 = BN_num_bits((BIGNUM *)*param_2);
  iVar2 = BN_num_bits((BIGNUM *)param_2[1]);
  uVar3 = ossl_ffc_params_FIPS186_4_gen_verify
                    (param_1,param_2,0,param_3,(long)iVar1,(long)iVar2,param_4,param_5);
  return uVar3;
}

