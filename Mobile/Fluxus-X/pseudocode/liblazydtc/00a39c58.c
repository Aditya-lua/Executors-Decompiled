/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a39c58
 */

int ossl_ec_GFp_simple_point_set_affine_coordinates
              (EC_GROUP *param_1,EC_POINT *param_2,BIGNUM *param_3,BIGNUM *param_4,BN_CTX *param_5)

{
  int iVar1;
  BIGNUM *z;
  
  if ((param_3 == (BIGNUM *)0x0) || (param_4 == (BIGNUM *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecp_smpl.c",0x1ed,"ossl_ec_GFp_simple_point_set_affine_coordinates");
    ERR_set_error(0x10,0xc0102,0);
    return 0;
  }
  z = BN_value_one();
  iVar1 = EC_POINT_set_Jprojective_coordinates_GFp(param_1,param_2,param_3,param_4,z,param_5);
  return iVar1;
}

