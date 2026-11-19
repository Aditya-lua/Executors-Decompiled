/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acf320
 */

undefined8 ossl_rsa_todata(long param_1,undefined8 param_2,undefined8 param_3,int param_4)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 local_68;
  undefined8 local_60;
  long local_58;
  
  local_60 = 0;
  local_58 = 0;
  local_68 = 0;
  lVar2 = OPENSSL_sk_new_null();
  lVar3 = OPENSSL_sk_new_null();
  lVar4 = OPENSSL_sk_new_null();
  uVar5 = 0;
  if ((((param_1 != 0) && (lVar2 != 0)) && (lVar3 != 0)) && (lVar4 != 0)) {
    RSA_get0_key(param_1,&local_60,&local_68,&local_58);
    ossl_rsa_get0_all_params(param_1,lVar2,lVar3,lVar4);
    iVar1 = ossl_param_build_set_bn(param_2,param_3,&DAT_002a5623,local_60);
    if (((iVar1 == 0) ||
        (iVar1 = ossl_param_build_set_bn(param_2,param_3,&DAT_002ab8a5,local_68), iVar1 == 0)) ||
       (((param_4 != 0 && (local_58 != 0)) &&
        ((((iVar1 = ossl_param_build_set_bn(param_2,param_3,&DAT_002cfc20), iVar1 == 0 ||
           (iVar1 = ossl_param_build_set_multi_key_bn
                              (param_2,param_3,&ossl_rsa_mp_factor_names,lVar2), iVar1 == 0)) ||
          (iVar1 = ossl_param_build_set_multi_key_bn(param_2,param_3,&ossl_rsa_mp_exp_names,lVar3),
          iVar1 == 0)) ||
         (iVar1 = ossl_param_build_set_multi_key_bn(param_2,param_3,&ossl_rsa_mp_coeff_names,lVar4),
         iVar1 == 0)))))) {
      uVar5 = 0;
    }
    else {
      uVar5 = 1;
    }
  }
  OPENSSL_sk_free(lVar2);
  OPENSSL_sk_free(lVar3);
  OPENSSL_sk_free(lVar4);
  return uVar5;
}

