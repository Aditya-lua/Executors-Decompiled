/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7cbe8
 */

undefined8
ossl_ffc_generate_private_key
          (undefined8 param_1,long param_2,int param_3,int param_4,BIGNUM *param_5)

{
  int iVar1;
  BIGNUM *r;
  BIGNUM *pBVar2;
  undefined8 uVar3;
  
  iVar1 = BN_num_bits(*(BIGNUM **)(param_2 + 8));
  if (param_4 == 0) {
    uVar3 = 0;
    r = (BIGNUM *)0x0;
  }
  else {
    if (param_3 == 0) {
      param_3 = param_4 * 2;
      if (*(int *)(param_2 + 0x58) != 0) {
        param_3 = *(int *)(param_2 + 0x58);
      }
      if (param_3 < param_4 * 2) {
        return 0;
      }
    }
    else if (param_3 < param_4 * 2) {
      return 0;
    }
    if (iVar1 < param_3) {
      return 0;
    }
    r = BN_new();
    if (r != (BIGNUM *)0x0) {
      pBVar2 = BN_value_one();
      iVar1 = BN_lshift(r,pBVar2,param_3);
      if (iVar1 != 0) {
        iVar1 = BN_cmp(r,*(BIGNUM **)(param_2 + 8));
        pBVar2 = r;
        if (0 < iVar1) {
          pBVar2 = *(BIGNUM **)(param_2 + 8);
        }
        do {
          iVar1 = BN_priv_rand_range_ex(param_5,r,0,param_1);
          if ((iVar1 == 0) || (iVar1 = BN_add_word(param_5,1), iVar1 == 0)) goto LAB_00a7ccc8;
          iVar1 = BN_cmp(param_5,pBVar2);
        } while (-1 < iVar1);
        uVar3 = 1;
        goto LAB_00a7cccc;
      }
    }
LAB_00a7ccc8:
    uVar3 = 0;
  }
LAB_00a7cccc:
  BN_free(r);
  return uVar3;
}

