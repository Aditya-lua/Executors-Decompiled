/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad1d10
 */

undefined8
RSA_set0_multi_prime_params(long param_1,long *param_2,long *param_3,long *param_4,int param_5)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  
  uVar2 = 0;
  if ((((param_2 != (long *)0x0) && (param_3 != (long *)0x0)) && (param_4 != (long *)0x0)) &&
     ((param_5 != 0 && (lVar3 = OPENSSL_sk_new_reserve(0,param_5), uVar2 = 0, lVar3 != 0)))) {
    lVar6 = *(long *)(param_1 + 0x88);
    if (0 < param_5) {
      lVar7 = 0;
      do {
        plVar4 = (long *)ossl_rsa_multip_info_new();
        if (plVar4 == (long *)0x0) goto LAB_00ad1e54;
        if (((*param_2 == 0) || (*param_3 == 0)) || (*param_4 == 0)) {
          ossl_rsa_multip_info_free(plVar4);
          goto LAB_00ad1e54;
        }
        BN_clear_free((BIGNUM *)*plVar4);
        BN_clear_free((BIGNUM *)plVar4[1]);
        BN_clear_free((BIGNUM *)plVar4[2]);
        lVar5 = *param_2;
        *plVar4 = lVar5;
        plVar4[1] = *param_3;
        plVar4[2] = *param_4;
        BN_set_flags(lVar5,4);
        BN_set_flags(plVar4[1],4);
        BN_set_flags(plVar4[2],4);
        OPENSSL_sk_push(lVar3,plVar4);
        lVar7 = lVar7 + 1;
        param_4 = param_4 + 1;
        param_3 = param_3 + 1;
        param_2 = param_2 + 1;
      } while (lVar7 < param_5);
    }
    *(long *)(param_1 + 0x88) = lVar3;
    iVar1 = ossl_rsa_multip_calc_product(param_1);
    if (iVar1 == 0) {
      *(long *)(param_1 + 0x88) = lVar6;
LAB_00ad1e54:
      OPENSSL_sk_pop_free(lVar3,ossl_rsa_multip_info_free_ex);
      uVar2 = 0;
    }
    else {
      if (lVar6 != 0) {
        OPENSSL_sk_pop_free(lVar6,ossl_rsa_multip_info_free);
      }
      uVar2 = 1;
      *(undefined4 *)(param_1 + 0x10) = 1;
      *(int *)(param_1 + 0xd8) = *(int *)(param_1 + 0xd8) + 1;
    }
  }
  return uVar2;
}

