/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3b01c
 */

undefined8
ossl_ec_GFp_simple_points_make_affine(long *param_1,ulong param_2,long *param_3,BN_CTX *param_4)

{
  int iVar1;
  BIGNUM *b;
  BIGNUM *pBVar2;
  undefined8 *ptr;
  BIGNUM *pBVar3;
  BN_CTX *c;
  undefined8 uVar4;
  ulong uVar5;
  long lVar6;
  
  if (param_2 == 0) {
    return 1;
  }
  c = (BN_CTX *)0x0;
  if (param_4 == (BN_CTX *)0x0) {
    c = (BN_CTX *)BN_CTX_new_ex(param_1[0x15]);
    param_4 = c;
    if (c == (BN_CTX *)0x0) {
      return 0;
    }
  }
  BN_CTX_start(param_4);
  b = BN_CTX_get(param_4);
  pBVar2 = BN_CTX_get(param_4);
  if (pBVar2 == (BIGNUM *)0x0) {
    ptr = (undefined8 *)0x0;
    uVar4 = 0;
    goto LAB_00a3b3f4;
  }
  ptr = CRYPTO_malloc((int)(param_2 << 3),"crypto/ec/ecp_smpl.c",0x4ce);
  if (ptr != (undefined8 *)0x0) {
    uVar5 = 0;
    do {
      pBVar3 = BN_new();
      ptr[uVar5] = pBVar3;
      if (pBVar3 == (BIGNUM *)0x0) goto LAB_00a3b3ec;
      uVar5 = uVar5 + 1;
    } while (uVar5 < param_2);
    iVar1 = BN_is_zero(*(undefined8 *)(*param_3 + 0x20));
    if (iVar1 == 0) {
      pBVar3 = BN_copy((BIGNUM *)*ptr,*(BIGNUM **)(*param_3 + 0x20));
      if (pBVar3 != (BIGNUM *)0x0) goto LAB_00a3b0f8;
    }
    else {
      if (*(code **)(*param_1 + 0x128) == (code *)0x0) {
        iVar1 = BN_set_word((BIGNUM *)*ptr,1);
      }
      else {
        iVar1 = (**(code **)(*param_1 + 0x128))(param_1,(BIGNUM *)*ptr,param_4);
      }
      if (iVar1 != 0) {
LAB_00a3b0f8:
        if (1 < param_2) {
          lVar6 = 0;
          do {
            iVar1 = BN_is_zero(*(undefined8 *)(param_3[lVar6 + 1] + 0x20));
            if (iVar1 == 0) {
              iVar1 = (**(code **)(*param_1 + 0xf8))
                                (param_1,(ptr + lVar6)[1],ptr[lVar6],
                                 *(undefined8 *)(param_3[lVar6 + 1] + 0x20),param_4);
              if (iVar1 == 0) goto LAB_00a3b3ec;
            }
            else {
              pBVar3 = BN_copy((BIGNUM *)(ptr + lVar6)[1],(BIGNUM *)ptr[lVar6]);
              if (pBVar3 == (BIGNUM *)0x0) goto LAB_00a3b3ec;
            }
            uVar5 = lVar6 + 2;
            lVar6 = lVar6 + 1;
          } while (uVar5 < param_2);
        }
        lVar6 = param_2 - 1;
        iVar1 = (**(code **)(*param_1 + 0x110))(param_1,b,ptr[lVar6],param_4);
        if (iVar1 == 0) {
          ERR_new();
          ERR_set_debug("crypto/ec/ecp_smpl.c",0x4fb,"ossl_ec_GFp_simple_points_make_affine");
          ERR_set_error(0x10,0x80003,0);
        }
        else if (*(code **)(*param_1 + 0x118) == (code *)0x0) {
joined_r0x00a3b1d0:
          while (lVar6 != 0) {
            while (iVar1 = BN_is_zero(*(undefined8 *)(param_3[lVar6] + 0x20)), iVar1 != 0) {
              lVar6 = lVar6 + -1;
              if (lVar6 == 0) goto LAB_00a3b25c;
            }
            iVar1 = (**(code **)(*param_1 + 0xf8))(param_1,pBVar2,ptr[lVar6 + -1],b,param_4);
            if ((iVar1 == 0) ||
               (iVar1 = (**(code **)(*param_1 + 0xf8))
                                  (param_1,b,b,*(undefined8 *)(param_3[lVar6] + 0x20),param_4),
               iVar1 == 0)) goto LAB_00a3b3ec;
            pBVar3 = BN_copy(*(BIGNUM **)(param_3[lVar6] + 0x20),pBVar2);
            lVar6 = lVar6 + -1;
            if (pBVar3 == (BIGNUM *)0x0) goto LAB_00a3b3ec;
          }
LAB_00a3b25c:
          iVar1 = BN_is_zero(*(undefined8 *)(*param_3 + 0x20));
          if ((iVar1 != 0) ||
             (pBVar2 = BN_copy(*(BIGNUM **)(*param_3 + 0x20),b), pBVar2 != (BIGNUM *)0x0)) {
            uVar5 = 0;
            goto LAB_00a3b288;
          }
        }
        else {
          iVar1 = (**(code **)(*param_1 + 0x118))(param_1,b,b,param_4);
          if (iVar1 != 0) {
            iVar1 = (**(code **)(*param_1 + 0x118))(param_1,b,b,param_4);
            if (iVar1 != 0) goto joined_r0x00a3b1d0;
          }
        }
      }
    }
  }
LAB_00a3b3ec:
  uVar4 = 0;
LAB_00a3b3f4:
  BN_CTX_end(param_4);
  BN_CTX_free(c);
  if (ptr != (undefined8 *)0x0) {
    uVar5 = 0;
    do {
      if ((BIGNUM *)ptr[uVar5] == (BIGNUM *)0x0) break;
      BN_clear_free((BIGNUM *)ptr[uVar5]);
      uVar5 = uVar5 + 1;
    } while (uVar5 < param_2);
    CRYPTO_free(ptr);
  }
  return uVar4;
LAB_00a3b288:
  do {
    lVar6 = param_3[uVar5];
    iVar1 = BN_is_zero(*(undefined8 *)(lVar6 + 0x20));
    if (iVar1 == 0) {
      iVar1 = (**(code **)(*param_1 + 0x100))(param_1,b,*(undefined8 *)(lVar6 + 0x20),param_4);
      if ((((iVar1 == 0) ||
           (iVar1 = (**(code **)(*param_1 + 0xf8))
                              (param_1,*(undefined8 *)(lVar6 + 0x10),*(undefined8 *)(lVar6 + 0x10),b
                               ,param_4), iVar1 == 0)) ||
          (iVar1 = (**(code **)(*param_1 + 0xf8))(param_1,b,b,*(undefined8 *)(lVar6 + 0x20),param_4)
          , iVar1 == 0)) ||
         (iVar1 = (**(code **)(*param_1 + 0xf8))
                            (param_1,*(undefined8 *)(lVar6 + 0x18),*(undefined8 *)(lVar6 + 0x18),b,
                             param_4), iVar1 == 0)) goto LAB_00a3b3ec;
      if (*(code **)(*param_1 + 0x128) == (code *)0x0) {
        iVar1 = BN_set_word(*(BIGNUM **)(lVar6 + 0x20),1);
      }
      else {
        iVar1 = (**(code **)(*param_1 + 0x128))(param_1,*(BIGNUM **)(lVar6 + 0x20),param_4);
      }
      if (iVar1 == 0) goto LAB_00a3b3ec;
      *(undefined4 *)(lVar6 + 0x28) = 1;
    }
    uVar5 = uVar5 + 1;
    uVar4 = 1;
  } while (uVar5 < param_2);
  goto LAB_00a3b3f4;
}

