/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3becc
 */

uint ossl_ec_GFp_simple_ladder_post
               (EC_GROUP *param_1,EC_POINT *param_2,long param_3,EC_POINT *param_4,BN_CTX *param_5)

{
  int iVar1;
  uint uVar2;
  BIGNUM *b;
  BIGNUM *r;
  BIGNUM *b_00;
  BIGNUM *pBVar3;
  BIGNUM *r_00;
  BIGNUM *pBVar4;
  BIGNUM *b_01;
  long lVar5;
  
  iVar1 = BN_is_zero(*(undefined8 *)(param_2 + 0x20));
  if (iVar1 != 0) {
    uVar2 = EC_POINT_set_to_infinity(param_1,param_2);
    return uVar2;
  }
  iVar1 = BN_is_zero(*(undefined8 *)(param_3 + 0x20));
  if (iVar1 != 0) {
    iVar1 = EC_POINT_copy(param_2,param_4);
    if (iVar1 == 0) {
      return 0;
    }
    iVar1 = EC_POINT_invert(param_1,param_2,param_5);
    return (uint)(iVar1 != 0);
  }
  BN_CTX_start(param_5);
  b = BN_CTX_get(param_5);
  r = BN_CTX_get(param_5);
  b_00 = BN_CTX_get(param_5);
  pBVar3 = BN_CTX_get(param_5);
  r_00 = BN_CTX_get(param_5);
  pBVar4 = BN_CTX_get(param_5);
  b_01 = BN_CTX_get(param_5);
  if (((((((((b_01 != (BIGNUM *)0x0) &&
            (iVar1 = BN_mod_lshift1_quick
                               (r_00,*(BIGNUM **)(param_4 + 0x18),*(BIGNUM **)(param_1 + 0x40)),
            iVar1 != 0)) &&
           (iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                              (param_1,b_01,*(undefined8 *)(param_2 + 0x10),r_00,param_5),
           iVar1 != 0)) &&
          ((iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                              (param_1,b_01,*(undefined8 *)(param_3 + 0x20),b_01,param_5),
           iVar1 != 0 &&
           (iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                              (param_1,pBVar4,*(undefined8 *)(param_2 + 0x20),b_01,param_5),
           iVar1 != 0)))) &&
         (iVar1 = BN_mod_lshift1_quick(r,*(BIGNUM **)(param_1 + 0x68),*(BIGNUM **)(param_1 + 0x40)),
         iVar1 != 0)) &&
        (((iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                             (param_1,r,*(undefined8 *)(param_3 + 0x20),r,param_5), iVar1 != 0 &&
          (iVar1 = (**(code **)(*(long *)param_1 + 0x100))
                             (param_1,pBVar3,*(undefined8 *)(param_2 + 0x20),param_5), iVar1 != 0))
         && ((iVar1 = (**(code **)(*(long *)param_1 + 0xf8))(param_1,b_00,pBVar3,r,param_5),
             iVar1 != 0 &&
             (((iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                                  (param_1,b_01,*(undefined8 *)(param_2 + 0x20),
                                   *(undefined8 *)(param_1 + 0x60),param_5), iVar1 != 0 &&
               (iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                                  (param_1,r,*(undefined8 *)(param_4 + 0x10),
                                   *(undefined8 *)(param_2 + 0x10),param_5), iVar1 != 0)) &&
              (iVar1 = BN_mod_add_quick(r,r,b_01,*(BIGNUM **)(param_1 + 0x40)), iVar1 != 0))))))))
       && ((iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                              (param_1,r,*(undefined8 *)(param_3 + 0x20),r,param_5), iVar1 != 0 &&
           (iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                              (param_1,b,*(undefined8 *)(param_4 + 0x10),
                               *(undefined8 *)(param_2 + 0x20),param_5), iVar1 != 0)))) &&
      ((iVar1 = BN_mod_add_quick(b_01,*(BIGNUM **)(param_2 + 0x10),b,*(BIGNUM **)(param_1 + 0x40)),
       iVar1 != 0 &&
       (((iVar1 = (**(code **)(*(long *)param_1 + 0xf8))(param_1,b_01,b_01,r,param_5), iVar1 != 0 &&
         (iVar1 = BN_mod_add_quick(b_01,b_01,b_00,*(BIGNUM **)(param_1 + 0x40)), iVar1 != 0)) &&
        ((iVar1 = BN_mod_sub_quick(b,b,*(BIGNUM **)(param_2 + 0x10),*(BIGNUM **)(param_1 + 0x40)),
         iVar1 != 0 &&
         (((iVar1 = (**(code **)(*(long *)param_1 + 0x100))(param_1,b,b,param_5), iVar1 != 0 &&
           (iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                              (param_1,b,b,*(undefined8 *)(param_3 + 0x10),param_5), iVar1 != 0)) &&
          (iVar1 = BN_mod_sub_quick(b,b_01,b,*(BIGNUM **)(param_1 + 0x40)), iVar1 != 0)))))))))) &&
     ((iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                         (param_1,r,*(undefined8 *)(param_3 + 0x20),r_00,param_5), iVar1 != 0 &&
      (iVar1 = (**(code **)(*(long *)param_1 + 0xf8))(param_1,r,pBVar3,r,param_5), iVar1 != 0)))) {
    lVar5 = *(long *)param_1;
    if (*(code **)(lVar5 + 0x120) != (code *)0x0) {
      iVar1 = (**(code **)(lVar5 + 0x120))(param_1,r,r,param_5);
      if (iVar1 == 0) goto LAB_00a3c380;
      lVar5 = *(long *)param_1;
    }
    iVar1 = (**(code **)(lVar5 + 0x110))(param_1,r,r,param_5);
    if (iVar1 != 0) {
      lVar5 = *(long *)param_1;
      if (*(code **)(lVar5 + 0x118) != (code *)0x0) {
        iVar1 = (**(code **)(lVar5 + 0x118))(param_1,r,r,param_5);
        if (iVar1 == 0) goto LAB_00a3c380;
        lVar5 = *(long *)param_1;
      }
      iVar1 = (**(code **)(lVar5 + 0xf8))(param_1,*(undefined8 *)(param_2 + 0x10),pBVar4,r,param_5);
      if ((iVar1 != 0) &&
         (iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                            (param_1,*(undefined8 *)(param_2 + 0x18),b,r,param_5), iVar1 != 0)) {
        if (*(code **)(*(long *)param_1 + 0x128) == (code *)0x0) {
          iVar1 = BN_set_word(*(BIGNUM **)(param_2 + 0x20),1);
        }
        else {
          iVar1 = (**(code **)(*(long *)param_1 + 0x128))
                            (param_1,*(BIGNUM **)(param_2 + 0x20),param_5);
        }
        if (iVar1 != 0) {
          uVar2 = 1;
          *(undefined4 *)(param_2 + 0x28) = 1;
          goto LAB_00a3c384;
        }
      }
    }
  }
LAB_00a3c380:
  uVar2 = 0;
LAB_00a3c384:
  BN_CTX_end(param_5);
  return uVar2;
}

