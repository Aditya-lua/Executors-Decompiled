/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1dac0
 */

undefined8
FUN_00a1dac0(undefined4 param_1,BIGNUM *param_2,BIGNUM *param_3,undefined4 param_4,
            undefined8 param_5)

{
  int iVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  
  if (param_2 == (BIGNUM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_rand.c",0x8c,"bnrand_range");
    uVar4 = 0xc0102;
  }
  else if ((param_3->neg == 0) && (iVar1 = BN_is_zero(param_3), iVar1 == 0)) {
    iVar1 = BN_num_bits(param_3);
    if (iVar1 == 1) {
      BN_zero_ex(param_2);
      return 1;
    }
    iVar2 = BN_is_bit_set(param_3,iVar1 + -2);
    if ((iVar2 == 0) && (iVar2 = BN_is_bit_set(param_3,iVar1 + -3), iVar2 == 0)) {
      iVar2 = -100;
      while( true ) {
        uVar4 = FUN_00a1d778(param_1,param_2,iVar1 + 1,0xffffffff,0,param_4,param_5);
        if ((int)uVar4 == 0) {
          return uVar4;
        }
        iVar3 = BN_cmp(param_2,param_3);
        if (-1 < iVar3) {
          iVar3 = BN_sub(param_2,param_2,param_3);
          if (iVar3 == 0) {
            return 0;
          }
          iVar3 = BN_cmp(param_2,param_3);
          if (-1 < iVar3) {
            iVar3 = BN_sub(param_2,param_2,param_3);
            if (iVar3 == 0) {
              return 0;
            }
          }
        }
        iVar2 = iVar2 + 1;
        if (iVar2 == 0) break;
        iVar3 = BN_cmp(param_2,param_3);
        if (iVar3 < 0) {
          return 1;
        }
      }
      ERR_new();
      uVar4 = 0xb4;
    }
    else {
      iVar2 = -100;
      while( true ) {
        uVar4 = FUN_00a1d778(param_1,param_2,iVar1,0xffffffff,0,param_4,param_5);
        if ((int)uVar4 == 0) {
          return uVar4;
        }
        iVar2 = iVar2 + 1;
        if (iVar2 == 0) break;
        iVar3 = BN_cmp(param_2,param_3);
        if (iVar3 < 0) {
          return 1;
        }
      }
      ERR_new();
      uVar4 = 0xc2;
    }
    ERR_set_debug("crypto/bn/bn_rand.c",uVar4,"bnrand_range");
    uVar4 = 0x71;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_rand.c",0x91,"bnrand_range");
    uVar4 = 0x73;
  }
  ERR_set_error(3,uVar4,0);
  return 0;
}

