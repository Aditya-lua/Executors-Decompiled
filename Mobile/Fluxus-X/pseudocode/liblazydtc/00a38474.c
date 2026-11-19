/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a38474
 */

ulong ossl_ec_GFp_simple_point2oct
                (EC_GROUP *param_1,EC_POINT *param_2,uint param_3,undefined1 *param_4,ulong param_5,
                BN_CTX *param_6)

{
  ulong uVar1;
  ulong uVar2;
  int iVar3;
  BIGNUM *a;
  BIGNUM *a_00;
  undefined8 uVar4;
  size_t sVar5;
  uint uVar6;
  BN_CTX *c;
  ulong uVar7;
  long lVar8;
  
  if ((param_3 < 7) && ((1 << (ulong)(param_3 & 0x1f) & 0x54U) != 0)) {
    iVar3 = EC_POINT_is_at_infinity(param_1,param_2);
    if (iVar3 != 0) {
      if (param_4 == (undefined1 *)0x0) {
        return 1;
      }
      if (param_5 == 0) {
        ERR_new();
        ERR_set_debug("crypto/ec/ecp_oct.c",0xb4,"ossl_ec_GFp_simple_point2oct");
        ERR_set_error(0x10,100,0);
        return 0;
      }
      *param_4 = 0;
      return 1;
    }
    iVar3 = BN_num_bits(*(BIGNUM **)(param_1 + 0x40));
    uVar6 = iVar3 + 0xe;
    if (-1 < (int)(iVar3 + 7U)) {
      uVar6 = iVar3 + 7U;
    }
    uVar2 = (long)((ulong)uVar6 << 0x20) >> 0x23;
    uVar1 = uVar2 << 1 | 1;
    if (param_3 == 2) {
      uVar1 = uVar2 + 1;
    }
    if (param_4 == (undefined1 *)0x0) {
      c = (BN_CTX *)0x0;
      goto LAB_00a385c0;
    }
    if (uVar1 <= param_5) {
      c = (BN_CTX *)0x0;
      if (param_6 == (BN_CTX *)0x0) {
        param_6 = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 0xa8));
        c = param_6;
        if (param_6 == (BN_CTX *)0x0) {
          return 0;
        }
      }
      BN_CTX_start(param_6);
      a = BN_CTX_get(param_6);
      a_00 = BN_CTX_get(param_6);
      if ((a_00 != (BIGNUM *)0x0) &&
         (iVar3 = EC_POINT_get_affine_coordinates(param_1,param_2,a,a_00,param_6), iVar3 != 0)) {
        uVar6 = param_3;
        if (((param_3 | 4) == 6) && (iVar3 = BN_is_odd(a_00), iVar3 != 0)) {
          uVar6 = param_3 + 1;
        }
        *param_4 = (char)uVar6;
        iVar3 = BN_num_bits(a);
        uVar6 = iVar3 + 0xe;
        if (-1 < (int)(iVar3 + 7U)) {
          uVar6 = iVar3 + 7U;
        }
        lVar8 = (long)((ulong)uVar6 << 0x20) >> 0x23;
        sVar5 = uVar2 - lVar8;
        if (uVar2 < sVar5) {
          ERR_new();
          uVar4 = 0xe3;
        }
        else {
          uVar7 = uVar2 + 1;
          if (sVar5 == 0) {
            lVar8 = 1;
          }
          else {
            memset(param_4 + 1,0,sVar5);
            lVar8 = uVar7 - lVar8;
          }
          iVar3 = BN_bn2bin(a,param_4 + lVar8);
          if (lVar8 + iVar3 == uVar7) {
            if ((param_3 | 2) == 6) {
              iVar3 = BN_num_bits(a_00);
              uVar6 = iVar3 + 0xe;
              if (-1 < (int)(iVar3 + 7U)) {
                uVar6 = iVar3 + 7U;
              }
              lVar8 = (long)((ulong)uVar6 << 0x20) >> 0x23;
              sVar5 = uVar2 - lVar8;
              if (uVar2 < sVar5) {
                ERR_new();
                uVar4 = 0xf5;
                goto LAB_00a387a4;
              }
              if (sVar5 != 0) {
                memset(param_4 + uVar7,0,sVar5);
                uVar7 = (uVar7 + uVar2) - lVar8;
              }
              iVar3 = BN_bn2bin(a_00,param_4 + uVar7);
              uVar7 = uVar7 + (long)iVar3;
            }
            if (uVar7 == uVar1) {
              BN_CTX_end(param_6);
LAB_00a385c0:
              BN_CTX_free(c);
              return uVar1;
            }
            ERR_new();
            uVar4 = 0x101;
          }
          else {
            ERR_new();
            uVar4 = 0xed;
          }
        }
LAB_00a387a4:
        ERR_set_debug("crypto/ec/ecp_oct.c",uVar4,"ossl_ec_GFp_simple_point2oct");
        ERR_set_error(0x10,0xc0103,0);
      }
      BN_CTX_end(param_6);
      goto LAB_00a38570;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ecp_oct.c",0xc5,"ossl_ec_GFp_simple_point2oct");
    uVar4 = 100;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/ec/ecp_oct.c",0xac,"ossl_ec_GFp_simple_point2oct");
    uVar4 = 0x68;
  }
  ERR_set_error(0x10,uVar4,0);
  c = (BN_CTX *)0x0;
LAB_00a38570:
  BN_CTX_free(c);
  return 0;
}

