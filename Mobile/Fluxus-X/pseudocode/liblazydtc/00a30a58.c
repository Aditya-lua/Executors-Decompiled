/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30a58
 */

int EC_GROUP_set_generator(EC_GROUP *group,EC_POINT *generator,BIGNUM *order,BIGNUM *cofactor)

{
  int iVar1;
  int iVar2;
  int iVar3;
  EC_POINT *dst;
  BIGNUM *pBVar4;
  BN_CTX *pBVar5;
  BN_MONT_CTX *mont;
  undefined8 uVar6;
  BIGNUM *pBVar7;
  
  if (generator == (EC_POINT *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x16f,"EC_GROUP_set_generator");
    uVar6 = 0xc0102;
    goto LAB_00a30aec;
  }
  if (((*(long *)(group + 0x40) == 0) || (iVar1 = BN_is_zero(), iVar1 != 0)) ||
     (iVar1 = BN_is_negative(*(undefined8 *)(group + 0x40)), iVar1 != 0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x176,"EC_GROUP_set_generator");
    uVar6 = 0x67;
    goto LAB_00a30aec;
  }
  if (((order != (BIGNUM *)0x0) && (iVar1 = BN_is_zero(order), iVar1 == 0)) &&
     (iVar1 = BN_is_negative(order), iVar1 == 0)) {
    iVar1 = BN_num_bits(order);
    iVar2 = BN_num_bits(*(BIGNUM **)(group + 0x40));
    if (iVar1 <= iVar2 + 1) {
      if ((cofactor != (BIGNUM *)0x0) && (iVar1 = BN_is_negative(cofactor), iVar1 != 0)) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_lib.c",0x18b,"EC_GROUP_set_generator");
        uVar6 = 0xa4;
        goto LAB_00a30aec;
      }
      dst = *(EC_POINT **)(group + 8);
      if (dst == (EC_POINT *)0x0) {
        dst = EC_POINT_new(group);
        *(EC_POINT **)(group + 8) = dst;
        if (dst == (EC_POINT *)0x0) {
          return 0;
        }
      }
      iVar1 = EC_POINT_copy(dst,generator);
      if (iVar1 == 0) {
        return 0;
      }
      pBVar4 = BN_copy(*(BIGNUM **)(group + 0x10),order);
      if (pBVar4 == (BIGNUM *)0x0) {
        return 0;
      }
      if ((cofactor == (BIGNUM *)0x0) || (iVar1 = BN_is_zero(cofactor), iVar1 != 0)) {
        iVar2 = BN_num_bits(*(BIGNUM **)(group + 0x10));
        iVar3 = BN_num_bits(*(BIGNUM **)(group + 0x40));
        iVar1 = iVar3 + 2;
        if (-1 < iVar3 + 1) {
          iVar1 = iVar3 + 1;
        }
        if ((iVar1 >> 1) + 3 < iVar2) {
          pBVar5 = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(group + 0xa8));
          if (pBVar5 == (BN_CTX *)0x0) goto LAB_00a30da0;
          BN_CTX_start(pBVar5);
          pBVar4 = BN_CTX_get(pBVar5);
          if (pBVar4 != (BIGNUM *)0x0) {
            if (*(int *)(*(long *)group + 4) == 0x197) {
              BN_zero_ex(pBVar4);
              iVar1 = BN_num_bits(*(BIGNUM **)(group + 0x40));
              iVar1 = BN_set_bit(pBVar4,iVar1 + -1);
              if (iVar1 != 0) {
LAB_00a30d24:
                iVar1 = BN_rshift1(*(BIGNUM **)(group + 0x18),*(BIGNUM **)(group + 0x10));
                if ((iVar1 != 0) &&
                   (iVar1 = BN_add(*(BIGNUM **)(group + 0x18),*(BIGNUM **)(group + 0x18),pBVar4),
                   iVar1 != 0)) {
                  pBVar7 = *(BIGNUM **)(group + 0x18);
                  pBVar4 = BN_value_one();
                  iVar1 = BN_add(pBVar7,pBVar7,pBVar4);
                  if (iVar1 != 0) {
                    iVar1 = BN_div(*(BIGNUM **)(group + 0x18),(BIGNUM *)0x0,
                                   *(BIGNUM **)(group + 0x18),*(BIGNUM **)(group + 0x10),pBVar5);
                    BN_CTX_end(pBVar5);
                    BN_CTX_free(pBVar5);
                    if (iVar1 == 0) goto LAB_00a30da0;
                    goto LAB_00a30ca0;
                  }
                }
              }
            }
            else {
              pBVar7 = BN_copy(pBVar4,*(BIGNUM **)(group + 0x40));
              if (pBVar7 != (BIGNUM *)0x0) goto LAB_00a30d24;
            }
          }
          BN_CTX_end(pBVar5);
          BN_CTX_free(pBVar5);
LAB_00a30da0:
          BN_zero_ex(*(undefined8 *)(group + 0x18));
          return 0;
        }
        BN_zero_ex(*(undefined8 *)(group + 0x18));
      }
      else {
        pBVar4 = BN_copy(*(BIGNUM **)(group + 0x18),cofactor);
        if (pBVar4 == (BIGNUM *)0x0) {
          return 0;
        }
      }
LAB_00a30ca0:
      iVar1 = BN_is_odd(*(undefined8 *)(group + 0x10));
      if (iVar1 == 0) {
        BN_MONT_CTX_free(*(BN_MONT_CTX **)(group + 0x90));
        *(undefined8 *)(group + 0x90) = 0;
        return 1;
      }
      pBVar5 = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(group + 0xa8));
      BN_MONT_CTX_free(*(BN_MONT_CTX **)(group + 0x90));
      *(undefined8 *)(group + 0x90) = 0;
      if (pBVar5 != (BN_CTX *)0x0) {
        mont = BN_MONT_CTX_new();
        *(BN_MONT_CTX **)(group + 0x90) = mont;
        if (mont != (BN_MONT_CTX *)0x0) {
          iVar1 = BN_MONT_CTX_set(mont,*(BIGNUM **)(group + 0x10),pBVar5);
          if (iVar1 == 0) {
            BN_MONT_CTX_free(*(BN_MONT_CTX **)(group + 0x90));
            iVar1 = 0;
            *(undefined8 *)(group + 0x90) = 0;
          }
          else {
            iVar1 = 1;
          }
          goto LAB_00a30d08;
        }
      }
      iVar1 = 0;
LAB_00a30d08:
      BN_CTX_free(pBVar5);
      return iVar1;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/ec/ec_lib.c",0x181,"EC_GROUP_set_generator");
  uVar6 = 0x7a;
LAB_00a30aec:
  ERR_set_error(0x10,uVar6,0);
  return 0;
}

