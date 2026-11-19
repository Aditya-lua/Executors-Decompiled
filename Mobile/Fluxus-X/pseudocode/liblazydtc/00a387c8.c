/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a387c8
 */

int ossl_ec_GFp_simple_oct2point
              (EC_GROUP *param_1,EC_POINT *param_2,byte *param_3,ulong param_4,BN_CTX *param_5)

{
  ulong uVar1;
  uint uVar2;
  byte bVar3;
  long lVar4;
  int iVar5;
  uint uVar6;
  BIGNUM *ret;
  BIGNUM *ret_00;
  BIGNUM *pBVar7;
  undefined8 uVar8;
  uint uVar9;
  BN_CTX *c;
  
  if (param_4 == 0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecp_oct.c",0x11e,"ossl_ec_GFp_simple_oct2point");
    uVar8 = 100;
    goto LAB_00a389e4;
  }
  bVar3 = *param_3;
  uVar9 = (uint)bVar3;
  uVar6 = uVar9 & 0xfe;
  if ((uVar6 < 7) && ((1 << (ulong)(uVar9 & 0x1e) & 0x55U) != 0)) {
    if (((bVar3 & 1) == 0) || ((uVar6 | 4) != 4)) {
      if ((bVar3 & 0xfe) == 0) {
        if (param_4 == 1) {
          iVar5 = EC_POINT_set_to_infinity(param_1,param_2);
          return iVar5;
        }
        ERR_new();
        uVar8 = 0x131;
      }
      else {
        iVar5 = BN_num_bits(*(BIGNUM **)(param_1 + 0x40));
        uVar2 = iVar5 + 0xe;
        if (-1 < (int)(iVar5 + 7U)) {
          uVar2 = iVar5 + 7U;
        }
        lVar4 = (long)((ulong)uVar2 << 0x20) >> 0x23;
        uVar1 = lVar4 << 1 | 1;
        if (uVar6 == 2) {
          uVar1 = lVar4 + 1;
        }
        if (uVar1 == param_4) {
          c = (BN_CTX *)0x0;
          if ((param_5 == (BN_CTX *)0x0) &&
             (param_5 = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 0xa8)), c = param_5,
             param_5 == (BN_CTX *)0x0)) {
            return 0;
          }
          BN_CTX_start(param_5);
          ret = BN_CTX_get(param_5);
          ret_00 = BN_CTX_get(param_5);
          if (ret_00 != (BIGNUM *)0x0) {
            pBVar7 = BN_bin2bn(param_3 + 1,(int)uVar2 >> 3,ret);
            if (pBVar7 != (BIGNUM *)0x0) {
              iVar5 = BN_ucmp(ret,*(BIGNUM **)(param_1 + 0x40));
              if (iVar5 < 0) {
                if (uVar6 == 2) {
                  iVar5 = EC_POINT_set_compressed_coordinates(param_1,param_2,ret,uVar9 & 1,param_5)
                  ;
joined_r0x00a38aac:
                  if (iVar5 != 0) {
                    iVar5 = 1;
                    goto LAB_00a38948;
                  }
                }
                else {
                  pBVar7 = BN_bin2bn(param_3 + 1 + lVar4,(int)uVar2 >> 3,ret_00);
                  if (pBVar7 != (BIGNUM *)0x0) {
                    iVar5 = BN_ucmp(ret_00,*(BIGNUM **)(param_1 + 0x40));
                    if (iVar5 < 0) {
                      if ((uVar6 != 6) || (uVar6 = BN_is_odd(ret_00), (uVar9 & 1) == uVar6)) {
                        iVar5 = EC_POINT_set_affine_coordinates(param_1,param_2,ret,ret_00,param_5);
                        goto joined_r0x00a38aac;
                      }
                      ERR_new();
                      uVar8 = 0x161;
                    }
                    else {
                      ERR_new();
                      uVar8 = 0x15c;
                    }
                    goto LAB_00a38930;
                  }
                }
              }
              else {
                ERR_new();
                uVar8 = 0x151;
LAB_00a38930:
                ERR_set_debug("crypto/ec/ecp_oct.c",uVar8,"ossl_ec_GFp_simple_oct2point");
                ERR_set_error(0x10,0x66,0);
              }
            }
          }
          iVar5 = 0;
LAB_00a38948:
          BN_CTX_end(param_5);
          BN_CTX_free(c);
          return iVar5;
        }
        ERR_new();
        uVar8 = 0x13e;
      }
    }
    else {
      ERR_new();
      uVar8 = 299;
    }
  }
  else {
    ERR_new();
    uVar8 = 0x127;
  }
  ERR_set_debug("crypto/ec/ecp_oct.c",uVar8,"ossl_ec_GFp_simple_oct2point");
  uVar8 = 0x66;
LAB_00a389e4:
  ERR_set_error(0x10,uVar8,0);
  return 0;
}

