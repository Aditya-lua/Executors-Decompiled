/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2ed54
 */

undefined8 ossl_ec_key_public_check_quick(long param_1,BN_CTX *param_2)

{
  int iVar1;
  int iVar2;
  BIGNUM *a;
  BIGNUM *a_00;
  undefined8 uVar3;
  
  if (((param_1 == 0) || (*(EC_GROUP **)(param_1 + 0x18) == (EC_GROUP *)0x0)) ||
     (*(EC_POINT **)(param_1 + 0x20) == (EC_POINT *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_key.c",0x1bc,"ossl_ec_key_public_check_quick");
    uVar3 = 0xc0102;
    goto LAB_00a2eddc;
  }
  iVar1 = EC_POINT_is_at_infinity(*(EC_GROUP **)(param_1 + 0x18),*(EC_POINT **)(param_1 + 0x20));
  if (iVar1 != 0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_key.c",0x1c2,"ossl_ec_key_public_check_quick");
    uVar3 = 0x6a;
    goto LAB_00a2eddc;
  }
  BN_CTX_start(param_2);
  a = BN_CTX_get(param_2);
  a_00 = BN_CTX_get(param_2);
  if ((a_00 == (BIGNUM *)0x0) ||
     (iVar1 = EC_POINT_get_affine_coordinates
                        (*(undefined8 *)(param_1 + 0x18),*(undefined8 *)(param_1 + 0x20),a,a_00,
                         param_2), iVar1 == 0)) {
LAB_00a2eeb8:
    BN_CTX_end(param_2);
    ERR_new();
    ERR_set_debug("crypto/ec/ec_key.c",0x1c8,"ossl_ec_key_public_check_quick");
    uVar3 = 0x92;
  }
  else {
    iVar1 = EC_GROUP_get_field_type(*(undefined8 *)(param_1 + 0x18));
    if (iVar1 == 0x196) {
      iVar1 = BN_is_negative(a);
      if ((iVar1 != 0) ||
         (((iVar1 = BN_cmp(a,*(BIGNUM **)(*(long *)(param_1 + 0x18) + 0x40)), -1 < iVar1 ||
           (iVar1 = BN_is_negative(a_00), iVar1 != 0)) ||
          (iVar1 = BN_cmp(a_00,*(BIGNUM **)(*(long *)(param_1 + 0x18) + 0x40)), -1 < iVar1))))
      goto LAB_00a2eeb8;
    }
    else {
      iVar1 = EC_GROUP_get_degree(*(EC_GROUP **)(param_1 + 0x18));
      iVar2 = BN_num_bits(a);
      if ((iVar1 < iVar2) || (iVar2 = BN_num_bits(a_00), iVar1 < iVar2)) goto LAB_00a2eeb8;
    }
    BN_CTX_end(param_2);
    iVar1 = EC_POINT_is_on_curve
                      (*(EC_GROUP **)(param_1 + 0x18),*(EC_POINT **)(param_1 + 0x20),param_2);
    if (0 < iVar1) {
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_key.c",0x1ce,"ossl_ec_key_public_check_quick");
    uVar3 = 0x6b;
  }
LAB_00a2eddc:
  ERR_set_error(0x10,uVar3,0);
  return 0;
}

