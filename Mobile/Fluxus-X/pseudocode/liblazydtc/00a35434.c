/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a35434
 */

int ossl_ec_GF2m_simple_oct2point
              (EC_GROUP *param_1,EC_POINT *param_2,byte *param_3,ulong param_4,BN_CTX *param_5)

{
  ulong uVar1;
  uint uVar2;
  byte bVar3;
  long lVar4;
  int iVar5;
  int iVar6;
  uint uVar7;
  BIGNUM *ret;
  BIGNUM *ret_00;
  BIGNUM *pBVar8;
  BIGNUM *pBVar9;
  undefined8 uVar10;
  uint uVar11;
  BN_CTX *c;
  
  if (param_4 == 0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec2_oct.c",0x10e,"ossl_ec_GF2m_simple_oct2point");
    ERR_set_error(0x10,100,0);
    return 0;
  }
  bVar3 = *param_3;
  uVar11 = (uint)bVar3;
  uVar7 = uVar11 & 0xfe;
  if ((6 < uVar7) || ((1 << (ulong)(uVar11 & 0x1e) & 0x55U) == 0)) {
    ERR_new();
    uVar10 = 0x123;
LAB_00a3566c:
    ERR_set_debug("crypto/ec/ec2_oct.c",uVar10,"ossl_ec_GF2m_simple_oct2point");
    ERR_set_error(0x10,0x66,0);
    return 0;
  }
  if (((bVar3 & 1) != 0) && ((uVar7 | 4) == 4)) {
    ERR_new();
    uVar10 = 0x127;
    goto LAB_00a3566c;
  }
  if ((bVar3 & 0xfe) == 0) {
    if (param_4 == 1) {
      iVar5 = EC_POINT_set_to_infinity(param_1,param_2);
      return iVar5;
    }
    ERR_new();
    uVar10 = 0x12e;
    goto LAB_00a3566c;
  }
  iVar5 = EC_GROUP_get_degree(param_1);
  uVar2 = iVar5 + 0xe;
  if (-1 < (int)(iVar5 + 7U)) {
    uVar2 = iVar5 + 7U;
  }
  lVar4 = (long)((ulong)uVar2 << 0x20) >> 0x23;
  uVar1 = lVar4 << 1 | 1;
  if (uVar7 == 2) {
    uVar1 = lVar4 + 1;
  }
  if (uVar1 != param_4) {
    ERR_new();
    uVar10 = 0x13c;
    goto LAB_00a3566c;
  }
  c = (BN_CTX *)0x0;
  if ((param_5 == (BN_CTX *)0x0) && (c = BN_CTX_new(), param_5 = c, c == (BN_CTX *)0x0)) {
    return 0;
  }
  BN_CTX_start(param_5);
  ret = BN_CTX_get(param_5);
  ret_00 = BN_CTX_get(param_5);
  pBVar8 = BN_CTX_get(param_5);
  iVar6 = 0;
  if (pBVar8 == (BIGNUM *)0x0) goto LAB_00a355d4;
  pBVar9 = BN_bin2bn(param_3 + 1,(int)uVar2 >> 3,ret);
  if (pBVar9 != (BIGNUM *)0x0) {
    iVar6 = BN_num_bits(ret);
    if (iVar5 < iVar6) {
      ERR_new();
      uVar10 = 0x152;
      goto LAB_00a355bc;
    }
    if (uVar7 == 2) {
      iVar5 = EC_POINT_set_compressed_coordinates(param_1,param_2,ret,uVar11 & 1,param_5);
joined_r0x00a3579c:
      if (iVar5 != 0) {
        iVar6 = 1;
        goto LAB_00a355d4;
      }
    }
    else {
      pBVar9 = BN_bin2bn(param_3 + 1 + lVar4,(int)uVar2 >> 3,ret_00);
      if (pBVar9 == (BIGNUM *)0x0) goto LAB_00a355d0;
      iVar6 = BN_num_bits(ret_00);
      if (iVar5 < iVar6) {
        ERR_new();
        uVar10 = 0x15d;
      }
      else {
        if (uVar7 != 6) {
LAB_00a35784:
          iVar5 = EC_POINT_set_affine_coordinates(param_1,param_2,ret,ret_00,param_5);
          goto joined_r0x00a3579c;
        }
        iVar5 = BN_is_zero(ret);
        if (iVar5 == 0) {
          iVar5 = (**(code **)(*(long *)param_1 + 0x108))(param_1,pBVar8,ret_00,ret,param_5);
          if (iVar5 == 0) goto LAB_00a355d0;
          uVar7 = BN_is_odd(pBVar8);
          if ((uVar11 & 1) == uVar7) goto LAB_00a35784;
          ERR_new();
          uVar10 = 0x16f;
        }
        else {
          if ((bVar3 & 1) == 0) goto LAB_00a35784;
          ERR_new();
          uVar10 = 0x168;
        }
      }
LAB_00a355bc:
      ERR_set_debug("crypto/ec/ec2_oct.c",uVar10,"ossl_ec_GF2m_simple_oct2point");
      ERR_set_error(0x10,0x66,0);
    }
  }
LAB_00a355d0:
  iVar6 = 0;
LAB_00a355d4:
  BN_CTX_end(param_5);
  BN_CTX_free(c);
  return iVar6;
}

