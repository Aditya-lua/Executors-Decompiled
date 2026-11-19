/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acf068
 */

undefined8 ossl_rsa_fromdata(long param_1,undefined8 param_2,int param_3)

{
  BIGNUM *pBVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  undefined *puVar7;
  undefined **ppuVar8;
  BIGNUM *local_60;
  BIGNUM *local_58;
  BIGNUM *local_50;
  BIGNUM *local_48;
  
  local_58 = (BIGNUM *)0x0;
  local_50 = (BIGNUM *)0x0;
  local_60 = (BIGNUM *)0x0;
  if (param_1 == 0) {
    return 0;
  }
  lVar3 = OSSL_PARAM_locate_const(param_2,&DAT_002a5623);
  lVar4 = OSSL_PARAM_locate_const(param_2,&DAT_002ab8a5);
  if (param_3 == 0) {
    lVar5 = 0;
    if (lVar3 != 0) goto LAB_00acf0e8;
LAB_00acf0f8:
    if ((((lVar4 != 0) && (iVar2 = OSSL_PARAM_get_BN(lVar4,&local_58), iVar2 == 0)) ||
        ((lVar5 != 0 && (iVar2 = OSSL_PARAM_get_BN(lVar5,&local_60), iVar2 == 0)))) ||
       (pBVar1 = local_60, iVar2 = RSA_set0_key(param_1,local_50,local_58,local_60), iVar2 == 0))
    goto LAB_00acf268;
    local_60 = (BIGNUM *)0x0;
    local_58 = (BIGNUM *)0x0;
    local_50 = (BIGNUM *)0x0;
    if (pBVar1 == (BIGNUM *)0x0) {
      lVar4 = 0;
      lVar5 = 0;
      lVar3 = 0;
LAB_00acf2dc:
      OPENSSL_sk_free(lVar3);
      OPENSSL_sk_free(lVar4);
      OPENSSL_sk_free(lVar5);
      return 1;
    }
    lVar3 = OPENSSL_sk_new_null();
    if (lVar3 == 0) goto LAB_00acf26c;
    ppuVar8 = &ossl_rsa_mp_factor_names;
    puVar7 = ossl_rsa_mp_factor_names;
    while (puVar7 != (undefined *)0x0) {
      ppuVar8 = ppuVar8 + 1;
      lVar4 = OSSL_PARAM_locate_const(param_2);
      if (lVar4 != 0) {
        local_48 = (BIGNUM *)0x0;
        iVar2 = OSSL_PARAM_get_BN(lVar4,&local_48);
        if (iVar2 == 0) goto LAB_00acf26c;
        iVar2 = OPENSSL_sk_push(lVar3,local_48);
        if (iVar2 == 0) {
          BN_clear_free(local_48);
          goto LAB_00acf26c;
        }
      }
      puVar7 = *ppuVar8;
    }
    lVar4 = OPENSSL_sk_new_null();
    if (lVar4 != 0) {
      ppuVar8 = &ossl_rsa_mp_exp_names;
      puVar7 = ossl_rsa_mp_exp_names;
      while (puVar7 != (undefined *)0x0) {
        ppuVar8 = ppuVar8 + 1;
        lVar5 = OSSL_PARAM_locate_const(param_2);
        if (lVar5 != 0) {
          local_48 = (BIGNUM *)0x0;
          iVar2 = OSSL_PARAM_get_BN(lVar5,&local_48);
          if (iVar2 == 0) goto LAB_00acf270;
          iVar2 = OPENSSL_sk_push(lVar4,local_48);
          if (iVar2 == 0) {
            BN_clear_free(local_48);
            goto LAB_00acf270;
          }
        }
        puVar7 = *ppuVar8;
      }
      lVar5 = OPENSSL_sk_new_null();
      if (lVar5 != 0) {
        ppuVar8 = &ossl_rsa_mp_coeff_names;
        puVar7 = ossl_rsa_mp_coeff_names;
        while (puVar7 != (undefined *)0x0) {
          ppuVar8 = ppuVar8 + 1;
          lVar6 = OSSL_PARAM_locate_const(param_2);
          if (lVar6 != 0) {
            local_48 = (BIGNUM *)0x0;
            iVar2 = OSSL_PARAM_get_BN(lVar6,&local_48);
            if (iVar2 == 0) goto LAB_00acf274;
            iVar2 = OPENSSL_sk_push(lVar5,local_48);
            if (iVar2 == 0) {
              BN_clear_free(local_48);
              goto LAB_00acf274;
            }
          }
          puVar7 = *ppuVar8;
        }
        iVar2 = OPENSSL_sk_num(lVar3);
        if ((iVar2 == 0) ||
           (iVar2 = ossl_rsa_set0_all_params(param_1,lVar3,lVar4,lVar5), iVar2 != 0))
        goto LAB_00acf2dc;
      }
      goto LAB_00acf274;
    }
  }
  else {
    lVar5 = OSSL_PARAM_locate_const(param_2,&DAT_002cfc20);
    if (lVar3 == 0) goto LAB_00acf0f8;
LAB_00acf0e8:
    iVar2 = OSSL_PARAM_get_BN(lVar3,&local_50);
    if (iVar2 != 0) goto LAB_00acf0f8;
LAB_00acf268:
    lVar3 = 0;
LAB_00acf26c:
    lVar4 = 0;
  }
LAB_00acf270:
  lVar5 = 0;
LAB_00acf274:
  BN_free(local_50);
  BN_free(local_58);
  BN_free(local_60);
  OPENSSL_sk_pop_free(lVar3,BN_free);
  OPENSSL_sk_pop_free(lVar4,BN_free);
  OPENSSL_sk_pop_free(lVar5,BN_free);
  return 0;
}

