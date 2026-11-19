/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3509c
 */

ulong ossl_ec_GF2m_simple_point2oct
                (EC_GROUP *param_1,EC_POINT *param_2,uint param_3,char *param_4,ulong param_5,
                BN_CTX *param_6)

{
  ulong uVar1;
  uint uVar2;
  ulong uVar3;
  int iVar4;
  BIGNUM *a;
  BIGNUM *a_00;
  BIGNUM *pBVar5;
  undefined8 uVar6;
  size_t sVar7;
  BN_CTX *c;
  ulong uVar8;
  long lVar9;
  
  if ((param_3 < 7) && ((1 << (ulong)(param_3 & 0x1f) & 0x54U) != 0)) {
    iVar4 = EC_POINT_is_at_infinity(param_1,param_2);
    if (iVar4 != 0) {
      if (param_4 == (char *)0x0) {
        return 1;
      }
      if (param_5 == 0) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec2_oct.c",0x95,"ossl_ec_GF2m_simple_point2oct");
        ERR_set_error(0x10,100,0);
        return 0;
      }
      *param_4 = '\0';
      return 1;
    }
    iVar4 = EC_GROUP_get_degree(param_1);
    uVar2 = iVar4 + 0xe;
    if (-1 < (int)(iVar4 + 7U)) {
      uVar2 = iVar4 + 7U;
    }
    uVar3 = (long)((ulong)uVar2 << 0x20) >> 0x23;
    uVar1 = uVar3 << 1 | 1;
    if (param_3 == 2) {
      uVar1 = uVar3 + 1;
    }
    if (param_4 == (char *)0x0) {
      c = (BN_CTX *)0x0;
      goto LAB_00a351ec;
    }
    if (uVar1 <= param_5) {
      c = (BN_CTX *)0x0;
      if ((param_6 == (BN_CTX *)0x0) &&
         (param_6 = BN_CTX_new(), c = param_6, param_6 == (BN_CTX *)0x0)) {
        return 0;
      }
      BN_CTX_start(param_6);
      a = BN_CTX_get(param_6);
      a_00 = BN_CTX_get(param_6);
      pBVar5 = BN_CTX_get(param_6);
      if ((pBVar5 != (BIGNUM *)0x0) &&
         (iVar4 = EC_POINT_get_affine_coordinates(param_1,param_2,a,a_00,param_6), iVar4 != 0)) {
        *param_4 = (char)param_3;
        if ((param_3 != 4) && (iVar4 = BN_is_zero(a), iVar4 == 0)) {
          iVar4 = (**(code **)(*(long *)param_1 + 0x108))(param_1,pBVar5,a_00,a,param_6);
          if (iVar4 == 0) goto LAB_00a35428;
          iVar4 = BN_is_odd(pBVar5);
          if (iVar4 != 0) {
            *param_4 = *param_4 + '\x01';
          }
        }
        iVar4 = BN_num_bits(a);
        uVar2 = iVar4 + 0xe;
        if (-1 < (int)(iVar4 + 7U)) {
          uVar2 = iVar4 + 7U;
        }
        lVar9 = (long)((ulong)uVar2 << 0x20) >> 0x23;
        sVar7 = uVar3 - lVar9;
        if (uVar3 < sVar7) {
          ERR_new();
          uVar6 = 0xc9;
        }
        else {
          uVar8 = uVar3 + 1;
          if (sVar7 == 0) {
            lVar9 = 1;
          }
          else {
            memset(param_4 + 1,0,sVar7);
            lVar9 = uVar8 - lVar9;
          }
          iVar4 = BN_bn2bin(a,(uchar *)(param_4 + lVar9));
          if (lVar9 + iVar4 == uVar8) {
            if ((param_3 | 2) == 6) {
              iVar4 = BN_num_bits(a_00);
              uVar2 = iVar4 + 0xe;
              if (-1 < (int)(iVar4 + 7U)) {
                uVar2 = iVar4 + 7U;
              }
              lVar9 = (long)((ulong)uVar2 << 0x20) >> 0x23;
              sVar7 = uVar3 - lVar9;
              if (uVar3 < sVar7) {
                ERR_new();
                uVar6 = 0xdb;
                goto LAB_00a35410;
              }
              if (sVar7 != 0) {
                memset(param_4 + uVar8,0,sVar7);
                uVar8 = (uVar8 + uVar3) - lVar9;
              }
              iVar4 = BN_bn2bin(a_00,(uchar *)(param_4 + uVar8));
              uVar8 = uVar8 + (long)iVar4;
            }
            if (uVar8 == uVar1) {
              BN_CTX_end(param_6);
LAB_00a351ec:
              BN_CTX_free(c);
              return uVar1;
            }
            ERR_new();
            uVar6 = 0xe7;
          }
          else {
            ERR_new();
            uVar6 = 0xd3;
          }
        }
LAB_00a35410:
        ERR_set_debug("crypto/ec/ec2_oct.c",uVar6,"ossl_ec_GF2m_simple_point2oct");
        ERR_set_error(0x10,0xc0103,0);
      }
LAB_00a35428:
      BN_CTX_end(param_6);
      goto LAB_00a3519c;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec2_oct.c",0xa6,"ossl_ec_GF2m_simple_point2oct");
    uVar6 = 100;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/ec/ec2_oct.c",0x8d,"ossl_ec_GF2m_simple_point2oct");
    uVar6 = 0x68;
  }
  ERR_set_error(0x10,uVar6,0);
  c = (BN_CTX *)0x0;
LAB_00a3519c:
  BN_CTX_free(c);
  return 0;
}

