/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2b220
 */

int FUN_00a2b220(EC_GROUP *param_1,EC_POINT *param_2,long param_3,EC_POINT *param_4,BN_CTX *param_5)

{
  int iVar1;
  BIGNUM *pBVar2;
  BIGNUM *pBVar3;
  BIGNUM *pBVar4;
  int iVar5;
  
  iVar1 = BN_is_zero(*(undefined8 *)(param_2 + 0x20));
  if (iVar1 != 0) {
    iVar1 = EC_POINT_set_to_infinity(param_1,param_2);
    return iVar1;
  }
  iVar1 = BN_is_zero(*(undefined8 *)(param_3 + 0x20));
  if (iVar1 != 0) {
    iVar1 = EC_POINT_copy(param_2,param_4);
    if ((iVar1 == 0) || (iVar1 = EC_POINT_invert(param_1,param_2,param_5), iVar1 == 0)) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec2_smpl.c",0x332,"ec_GF2m_simple_ladder_post");
      ERR_set_error(0x10,0x80010,0);
      return 0;
    }
    return 1;
  }
  BN_CTX_start(param_5);
  pBVar2 = BN_CTX_get(param_5);
  pBVar3 = BN_CTX_get(param_5);
  pBVar4 = BN_CTX_get(param_5);
  if (pBVar4 == (BIGNUM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec2_smpl.c",0x33d,"ec_GF2m_simple_ladder_post");
    ERR_set_error(0x10,0xc0100,0);
  }
  else {
    iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                      (param_1,pBVar2,*(undefined8 *)(param_2 + 0x20),
                       *(undefined8 *)(param_3 + 0x20),param_5);
    if (((((((iVar1 != 0) &&
            (iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                               (param_1,pBVar3,*(undefined8 *)(param_4 + 0x10),
                                *(undefined8 *)(param_2 + 0x20),param_5), iVar1 != 0)) &&
           (iVar1 = BN_GF2m_add(pBVar3,*(undefined8 *)(param_2 + 0x10),pBVar3), iVar1 != 0)) &&
          ((iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                              (param_1,pBVar4,*(undefined8 *)(param_4 + 0x10),
                               *(undefined8 *)(param_3 + 0x20),param_5), iVar1 != 0 &&
           (iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                              (param_1,*(undefined8 *)(param_2 + 0x20),
                               *(undefined8 *)(param_2 + 0x10),pBVar4,param_5), iVar1 != 0)))) &&
         ((iVar1 = BN_GF2m_add(pBVar4,pBVar4,*(undefined8 *)(param_3 + 0x10)), iVar1 != 0 &&
          ((iVar1 = (**(code **)(*(long *)param_1 + 0xf8))(param_1,pBVar3,pBVar3,pBVar4,param_5),
           iVar1 != 0 &&
           (iVar1 = (**(code **)(*(long *)param_1 + 0x100))
                              (param_1,pBVar4,*(undefined8 *)(param_4 + 0x10),param_5), iVar1 != 0))
          )))) && (iVar1 = BN_GF2m_add(pBVar4,*(undefined8 *)(param_4 + 0x18),pBVar4), iVar1 != 0))
       && (((((iVar1 = (**(code **)(*(long *)param_1 + 0xf8))(param_1,pBVar4,pBVar4,pBVar2,param_5),
              iVar1 != 0 && (iVar1 = BN_GF2m_add(pBVar3,pBVar4,pBVar3), iVar1 != 0)) &&
             (iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                                (param_1,pBVar4,*(undefined8 *)(param_4 + 0x10),pBVar2,param_5),
             iVar1 != 0)) &&
            (((iVar1 = (**(code **)(*(long *)param_1 + 0x110))(param_1,pBVar4,pBVar4,param_5),
              iVar1 != 0 &&
              (iVar1 = (**(code **)(*(long *)param_1 + 0xf8))(param_1,pBVar3,pBVar3,pBVar4,param_5),
              iVar1 != 0)) &&
             ((iVar1 = (**(code **)(*(long *)param_1 + 0xf8))
                                 (param_1,*(undefined8 *)(param_2 + 0x10),
                                  *(undefined8 *)(param_2 + 0x20),pBVar4,param_5), iVar1 != 0 &&
              ((iVar1 = BN_GF2m_add(pBVar4,*(undefined8 *)(param_4 + 0x10),
                                    *(undefined8 *)(param_2 + 0x10)), iVar1 != 0 &&
               (iVar1 = (**(code **)(*(long *)param_1 + 0xf8))(param_1,pBVar4,pBVar4,pBVar3,param_5)
               , iVar1 != 0)))))))) &&
           (iVar1 = BN_GF2m_add(*(undefined8 *)(param_2 + 0x18),*(undefined8 *)(param_4 + 0x18),
                                pBVar4), iVar1 != 0)))) {
      iVar5 = 1;
      iVar1 = BN_set_word(*(BIGNUM **)(param_2 + 0x20),1);
      if (iVar1 != 0) {
        *(undefined4 *)(param_2 + 0x28) = 1;
        BN_set_negative(*(BIGNUM **)(param_2 + 0x10),0);
        BN_set_negative(*(BIGNUM **)(param_2 + 0x18),0);
        goto LAB_00a2b5a4;
      }
    }
  }
  iVar5 = 0;
LAB_00a2b5a4:
  BN_CTX_end(param_5);
  return iVar5;
}

