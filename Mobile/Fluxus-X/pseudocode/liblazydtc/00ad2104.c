/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad2104
 */

undefined8 ossl_rsa_set0_all_params(long param_1,long param_2,long param_3,long param_4)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long *plVar11;
  
  uVar3 = 0;
  if (((param_2 != 0) && (param_3 != 0)) && (param_4 != 0)) {
    iVar1 = OPENSSL_sk_num(param_2);
    uVar3 = 0;
    if (1 < iVar1) {
      lVar4 = OPENSSL_sk_value(param_2,0);
      lVar5 = OPENSSL_sk_value(param_2,1);
      if (((lVar4 != 0) || (uVar3 = 0, *(BIGNUM **)(param_1 + 0x40) != (BIGNUM *)0x0)) &&
         ((lVar5 != 0 || (uVar3 = 0, *(long *)(param_1 + 0x48) != 0)))) {
        if (lVar4 != 0) {
          BN_clear_free(*(BIGNUM **)(param_1 + 0x40));
          *(long *)(param_1 + 0x40) = lVar4;
          BN_set_flags(lVar4,4);
        }
        if (lVar5 != 0) {
          BN_clear_free(*(BIGNUM **)(param_1 + 0x48));
          *(long *)(param_1 + 0x48) = lVar5;
          BN_set_flags(lVar5,4);
        }
        *(int *)(param_1 + 0xd8) = *(int *)(param_1 + 0xd8) + 1;
        iVar2 = OPENSSL_sk_num(param_3);
        if ((iVar1 == iVar2) && (iVar2 = OPENSSL_sk_num(param_4), iVar1 == iVar2 + 1)) {
          uVar3 = OPENSSL_sk_value(param_3,0);
          uVar6 = OPENSSL_sk_value(param_3,1);
          uVar7 = OPENSSL_sk_value(param_4,0);
          uVar3 = RSA_set0_crt_params(param_1,uVar3,uVar6,uVar7);
          if ((int)uVar3 == 0) {
            return uVar3;
          }
        }
        lVar4 = *(long *)(param_1 + 0x88);
        if (2 < iVar1) {
          lVar5 = OPENSSL_sk_new_reserve(0,iVar1);
          if (lVar5 == 0) {
            return 0;
          }
          iVar2 = 2;
          do {
            lVar8 = OPENSSL_sk_value(param_2,iVar2);
            lVar9 = OPENSSL_sk_value(param_3,iVar2);
            lVar10 = OPENSSL_sk_value(param_4,iVar2 + -1);
            if (((lVar8 == 0) || (lVar9 == 0)) || (lVar10 == 0)) goto LAB_00ad239c;
            plVar11 = (long *)CRYPTO_zalloc(0x28,"crypto/rsa/rsa_lib.c",0x31a);
            if (plVar11 == (long *)0x0) {
              ERR_new();
              ERR_set_debug("crypto/rsa/rsa_lib.c",0x31b,"ossl_rsa_set0_all_params");
              ERR_set_error(4,0xc0100,0);
              goto LAB_00ad239c;
            }
            *plVar11 = lVar8;
            plVar11[1] = lVar9;
            plVar11[2] = lVar10;
            BN_set_flags(lVar8,4);
            BN_set_flags(plVar11[1],4);
            BN_set_flags(plVar11[2],4);
            OPENSSL_sk_push(lVar5,plVar11);
            iVar2 = iVar2 + 1;
          } while (iVar2 < iVar1);
          *(long *)(param_1 + 0x88) = lVar5;
          iVar2 = ossl_rsa_multip_calc_product(param_1);
          if (iVar2 == 0) {
            *(long *)(param_1 + 0x88) = lVar4;
LAB_00ad239c:
            OPENSSL_sk_pop_free(lVar5,ossl_rsa_multip_info_free_ex);
            return 0;
          }
        }
        if (lVar4 != 0) {
          OPENSSL_sk_pop_free(lVar4,ossl_rsa_multip_info_free);
        }
        uVar3 = 1;
        *(uint *)(param_1 + 0x10) = (uint)(2 < iVar1);
        *(int *)(param_1 + 0xd8) = *(int *)(param_1 + 0xd8) + 1;
      }
    }
  }
  return uVar3;
}

