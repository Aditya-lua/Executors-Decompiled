/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae7098
 */

undefined * SRP_check_known_gN_param(BIGNUM *param_1,BIGNUM *param_2)

{
  int iVar1;
  long lVar2;
  
  if (param_1 == (BIGNUM *)0x0) {
    return (undefined *)0x0;
  }
  if (param_2 == (BIGNUM *)0x0) {
    return (undefined *)0x0;
  }
  iVar1 = BN_cmp((BIGNUM *)PTR_ossl_bn_generator_19_00cc9348,param_1);
  if ((iVar1 == 0) &&
     (iVar1 = BN_cmp((BIGNUM *)PTR_ossl_bn_group_8192_00cc9350,param_2), iVar1 == 0)) {
    lVar2 = 0;
  }
  else {
    iVar1 = BN_cmp((BIGNUM *)PTR_ossl_bn_generator_5_00cc9360,param_1);
    if ((iVar1 == 0) &&
       (iVar1 = BN_cmp((BIGNUM *)PTR_ossl_bn_group_6144_00cc9368,param_2), iVar1 == 0)) {
      lVar2 = 1;
    }
    else {
      iVar1 = BN_cmp((BIGNUM *)PTR_ossl_bn_generator_5_00cc9378,param_1);
      if ((iVar1 == 0) &&
         (iVar1 = BN_cmp((BIGNUM *)PTR_ossl_bn_group_4096_00cc9380,param_2), iVar1 == 0)) {
        lVar2 = 2;
      }
      else {
        iVar1 = BN_cmp((BIGNUM *)PTR_ossl_bn_generator_5_00cc9390,param_1);
        if ((iVar1 == 0) &&
           (iVar1 = BN_cmp((BIGNUM *)PTR_ossl_bn_group_3072_00cc9398,param_2), iVar1 == 0)) {
          lVar2 = 3;
        }
        else {
          iVar1 = BN_cmp((BIGNUM *)PTR_ossl_bn_generator_2_00cc93a8,param_1);
          if ((iVar1 == 0) &&
             (iVar1 = BN_cmp((BIGNUM *)PTR_ossl_bn_group_2048_00cc93b0,param_2), iVar1 == 0)) {
            lVar2 = 4;
          }
          else {
            iVar1 = BN_cmp((BIGNUM *)PTR_ossl_bn_generator_2_00cc93c0,param_1);
            if ((iVar1 == 0) &&
               (iVar1 = BN_cmp((BIGNUM *)PTR_ossl_bn_group_1536_00cc93c8,param_2), iVar1 == 0)) {
              lVar2 = 5;
            }
            else {
              iVar1 = BN_cmp((BIGNUM *)PTR_ossl_bn_generator_2_00cc93d8,param_1);
              if (iVar1 != 0) {
                return (undefined *)0x0;
              }
              iVar1 = BN_cmp((BIGNUM *)PTR_ossl_bn_group_1024_00cc93e0,param_2);
              if (iVar1 != 0) {
                return (undefined *)0x0;
              }
              lVar2 = 6;
            }
          }
        }
      }
    }
  }
  return (&PTR_DAT_00cc9340)[lVar2 * 3];
}

