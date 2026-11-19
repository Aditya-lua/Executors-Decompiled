/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2a208
 */

undefined8
ossl_ec_GF2m_simple_point_get_affine_coordinates
          (EC_GROUP *param_1,EC_POINT *param_2,BIGNUM *param_3,BIGNUM *param_4)

{
  int iVar1;
  BIGNUM *pBVar2;
  undefined8 uVar3;
  BIGNUM *a;
  
  iVar1 = EC_POINT_is_at_infinity(param_1,param_2);
  if (iVar1 == 0) {
    a = *(BIGNUM **)(param_2 + 0x20);
    pBVar2 = BN_value_one();
    iVar1 = BN_cmp(a,pBVar2);
    if (iVar1 == 0) {
      if (param_3 != (BIGNUM *)0x0) {
        pBVar2 = BN_copy(param_3,*(BIGNUM **)(param_2 + 0x10));
        if (pBVar2 == (BIGNUM *)0x0) {
          return 0;
        }
        BN_set_negative(param_3,0);
      }
      if (param_4 != (BIGNUM *)0x0) {
        pBVar2 = BN_copy(param_4,*(BIGNUM **)(param_2 + 0x18));
        if (pBVar2 == (BIGNUM *)0x0) {
          return 0;
        }
        BN_set_negative(param_4,0);
      }
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec2_smpl.c",0x14d,"ossl_ec_GF2m_simple_point_get_affine_coordinates");
    uVar3 = 0xc0101;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/ec/ec2_smpl.c",0x148,"ossl_ec_GF2m_simple_point_get_affine_coordinates");
    uVar3 = 0x6a;
  }
  ERR_set_error(0x10,uVar3,0);
  return 0;
}

