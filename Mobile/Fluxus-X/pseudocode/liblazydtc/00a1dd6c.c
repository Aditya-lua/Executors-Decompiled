/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1dd6c
 */

undefined8
ossl_bn_priv_rand_range_fixed_top
          (BIGNUM *param_1,BIGNUM *param_2,undefined4 param_3,undefined8 param_4)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  int iVar4;
  
  if (param_1 == (BIGNUM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_rand.c",0xfa,"ossl_bn_priv_rand_range_fixed_top");
    uVar3 = 0xc0102;
  }
  else if ((param_2->neg == 0) && (iVar1 = BN_is_zero(param_2), iVar1 == 0)) {
    iVar1 = BN_num_bits(param_2);
    if (iVar1 == 1) {
      BN_zero_ex(param_1);
      return 1;
    }
    BN_set_flags(param_1,4);
    iVar4 = -100;
    while( true ) {
      uVar3 = FUN_00a1d778(2,param_1,iVar1 + 1,0,0,param_3,param_4);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
      iVar4 = iVar4 + 1;
      if (iVar4 == 0) break;
      ossl_bn_mask_bits_fixed_top(param_1,iVar1);
      iVar2 = BN_ucmp(param_1,param_2);
      if (iVar2 < 0) {
        return 1;
      }
    }
    ERR_new();
    ERR_set_debug("crypto/bn/bn_rand.c",0x111,"ossl_bn_priv_rand_range_fixed_top");
    uVar3 = 0x71;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_rand.c",0xff,"ossl_bn_priv_rand_range_fixed_top");
    uVar3 = 0x73;
  }
  ERR_set_error(3,uVar3,0);
  return 0;
}

