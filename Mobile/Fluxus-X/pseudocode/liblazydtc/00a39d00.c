/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a39d00
 */

undefined8
ossl_ec_GFp_simple_point_get_affine_coordinates
          (EC_GROUP *param_1,EC_POINT *param_2,BIGNUM *param_3,BIGNUM *param_4,BN_CTX *param_5)

{
  int iVar1;
  BIGNUM *pBVar2;
  BIGNUM *a;
  BIGNUM *r;
  BIGNUM *r_00;
  code *pcVar3;
  BN_CTX *c;
  undefined8 uVar4;
  BIGNUM *pBVar5;
  
  iVar1 = EC_POINT_is_at_infinity(param_1,param_2);
  if (iVar1 != 0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecp_smpl.c",0x200,"ossl_ec_GFp_simple_point_get_affine_coordinates");
    ERR_set_error(0x10,0x6a,0);
    return 0;
  }
  c = (BN_CTX *)0x0;
  if ((param_5 == (BN_CTX *)0x0) &&
     (param_5 = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 0xa8)), c = param_5,
     param_5 == (BN_CTX *)0x0)) {
    return 0;
  }
  BN_CTX_start(param_5);
  pBVar2 = BN_CTX_get(param_5);
  a = BN_CTX_get(param_5);
  r = BN_CTX_get(param_5);
  r_00 = BN_CTX_get(param_5);
  if (r_00 != (BIGNUM *)0x0) {
    pBVar5 = *(BIGNUM **)(param_2 + 0x20);
    if ((*(code **)(*(long *)param_1 + 0x120) == (code *)0x0) ||
       (iVar1 = (**(code **)(*(long *)param_1 + 0x120))
                          (param_1,pBVar2,*(BIGNUM **)(param_2 + 0x20),param_5), pBVar5 = pBVar2,
       iVar1 != 0)) {
      iVar1 = BN_is_one(pBVar5);
      if (iVar1 == 0) {
        iVar1 = (**(code **)(*(long *)param_1 + 0x110))(param_1,a,pBVar5,param_5);
        if (iVar1 == 0) {
          ERR_new();
          ERR_set_debug("crypto/ec/ecp_smpl.c",0x232,
                        "ossl_ec_GFp_simple_point_get_affine_coordinates");
          ERR_set_error(0x10,0x80003,0);
          uVar4 = 0;
          goto LAB_00a39fd0;
        }
        if (*(long *)(*(long *)param_1 + 0x118) == 0) {
          iVar1 = (**(code **)(*(long *)param_1 + 0x100))(param_1,r,a,param_5);
        }
        else {
          iVar1 = BN_mod_sqr(r,a,*(BIGNUM **)(param_1 + 0x40),param_5);
        }
        if ((iVar1 != 0) &&
           ((param_3 == (BIGNUM *)0x0 ||
            (iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                               (param_1,param_3,*(undefined8 *)(param_2 + 0x10),r,param_5),
            iVar1 != 0)))) {
          if (param_4 == (BIGNUM *)0x0) goto LAB_00a39fc4;
          if (*(long *)(*(long *)param_1 + 0x118) == 0) {
            iVar1 = (**(code **)(*(long *)param_1 + 0xf8))(param_1,r_00,r,a,param_5);
          }
          else {
            iVar1 = BN_mod_mul(r_00,r,a,*(BIGNUM **)(param_1 + 0x40),param_5);
          }
          if (iVar1 != 0) {
            iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                              (param_1,param_4,*(undefined8 *)(param_2 + 0x18),r_00,param_5);
            goto joined_r0x00a39e4c;
          }
        }
      }
      else {
        pcVar3 = *(code **)(*(long *)param_1 + 0x120);
        if (pcVar3 == (code *)0x0) {
          if (((param_3 == (BIGNUM *)0x0) ||
              (pBVar2 = BN_copy(param_3,*(BIGNUM **)(param_2 + 0x10)), pBVar2 != (BIGNUM *)0x0)) &&
             ((param_4 == (BIGNUM *)0x0 ||
              (pBVar2 = BN_copy(param_4,*(BIGNUM **)(param_2 + 0x18)), pBVar2 != (BIGNUM *)0x0))))
          goto LAB_00a39fc4;
        }
        else if ((param_3 == (BIGNUM *)0x0) ||
                (iVar1 = (*pcVar3)(param_1,param_3,*(undefined8 *)(param_2 + 0x10),param_5),
                iVar1 != 0)) {
          if (param_4 != (BIGNUM *)0x0) {
            iVar1 = (**(code **)(*(long *)param_1 + 0x120))
                              (param_1,param_4,*(undefined8 *)(param_2 + 0x18),param_5);
joined_r0x00a39e4c:
            if (iVar1 == 0) goto LAB_00a39fcc;
          }
LAB_00a39fc4:
          uVar4 = 1;
          goto LAB_00a39fd0;
        }
      }
    }
  }
LAB_00a39fcc:
  uVar4 = 0;
LAB_00a39fd0:
  BN_CTX_end(param_5);
  BN_CTX_free(c);
  return uVar4;
}

