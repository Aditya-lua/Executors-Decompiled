/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7f270
 */

int ossl_ffc_params_full_validate
              (undefined8 param_1,undefined8 *param_2,undefined4 param_3,undefined4 *param_4)

{
  undefined4 *puVar1;
  int iVar2;
  int iVar3;
  BIGNUM *a;
  BN_CTX *c;
  undefined8 uVar4;
  undefined4 local_34;
  
  local_34 = 0;
  if (param_2 == (undefined8 *)0x0) {
    return 0;
  }
  puVar1 = &local_34;
  if (param_4 != (undefined4 *)0x0) {
    puVar1 = param_4;
  }
  if (param_2[4] != 0) {
    a = (BIGNUM *)*param_2;
    if ((*(byte *)(param_2 + 8) >> 2 & 1) != 0) {
      if ((a == (BIGNUM *)0x0) || (param_2[1] == 0)) {
        *puVar1 = 0x800;
        return 0;
      }
      iVar2 = BN_num_bits(a);
      iVar3 = BN_num_bits((BIGNUM *)param_2[1]);
      iVar2 = ossl_ffc_params_FIPS186_2_gen_verify
                        (param_1,param_2,0,param_3,(long)iVar2,(long)iVar3,puVar1,0);
      return iVar2;
    }
    if (a == (BIGNUM *)0x0) {
      return 0;
    }
    if (param_2[1] == 0) {
      return 0;
    }
    iVar2 = BN_num_bits(a);
    iVar3 = BN_num_bits((BIGNUM *)param_2[1]);
    iVar2 = ossl_ffc_params_FIPS186_4_gen_verify
                      (param_1,param_2,0,param_3,(long)iVar2,(long)iVar3,puVar1,0);
    return iVar2;
  }
  iVar2 = ossl_ffc_params_simple_validate(param_1,param_2,param_3,puVar1);
  if (iVar2 == 0) {
    return 0;
  }
  c = (BN_CTX *)BN_CTX_new_ex(param_1);
  if (c == (BN_CTX *)0x0) {
    return 0;
  }
  iVar3 = BN_check_prime(param_2[1],c,0);
  if (iVar3 == 1) {
    iVar3 = BN_check_prime(*param_2,c,0);
    if (iVar3 == 1) goto LAB_00a7f430;
    ERR_new();
    ERR_set_debug("crypto/ffc/ffc_params_validate.c",0xb2,"ossl_ffc_params_full_validate");
    uVar4 = 0x73;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/ffc/ffc_params_validate.c",0xac,"ossl_ffc_params_full_validate");
    uVar4 = 0x71;
  }
  ERR_set_error(10,uVar4,0);
  iVar2 = 0;
LAB_00a7f430:
  BN_CTX_free(c);
  return iVar2;
}

