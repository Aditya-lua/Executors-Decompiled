/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4fc00
 */

undefined8
FUN_00b4fc00(EC_KEY *param_1,long param_2,undefined8 param_3,int param_4,undefined8 *param_5)

{
  uint uVar1;
  point_conversion_form_t pVar2;
  int iVar3;
  EC_GROUP *pEVar4;
  BIGNUM *pBVar5;
  EC_POINT *pEVar6;
  BN_CTX *ctx;
  long lVar7;
  BIGNUM *pBVar8;
  BIGNUM *pBVar9;
  long lVar10;
  undefined8 uVar11;
  long lVar12;
  long local_68;
  
  if ((param_1 == (EC_KEY *)0x0) || (pEVar4 = EC_KEY_get0_group(param_1), pEVar4 == (EC_GROUP *)0x0)
     ) {
    return 0;
  }
  pBVar5 = EC_KEY_get0_private_key(param_1);
  pEVar6 = EC_KEY_get0_public_key(param_1);
  if (pEVar6 == (EC_POINT *)0x0) {
    ctx = (BN_CTX *)0x0;
joined_r0x00b4fd40:
    uVar11 = 1;
    if ((param_4 == 0) || (uVar11 = 1, pBVar5 == (BIGNUM *)0x0)) goto LAB_00b4fe20;
    iVar3 = EC_GROUP_order_bits(pEVar4);
    if (0 < iVar3) {
      uVar1 = iVar3 + 0xe;
      if (-1 < (int)(iVar3 + 7U)) {
        uVar1 = iVar3 + 7U;
      }
      iVar3 = ossl_param_build_set_bn_pad
                        (param_2,param_3,&DAT_002a3e83,pBVar5,(long)((ulong)uVar1 << 0x20) >> 0x23);
      if (iVar3 != 0) {
        uVar11 = 1;
        goto LAB_00b4fe20;
      }
    }
  }
  else {
    ossl_ec_key_get_libctx(param_1);
    ctx = (BN_CTX *)BN_CTX_new_ex();
    if (ctx != (BN_CTX *)0x0) {
      local_68 = 0;
      lVar10 = 0;
      lVar12 = 0;
      if (param_2 == 0) {
        lVar12 = OSSL_PARAM_locate(param_3,&DAT_002ad463);
        local_68 = OSSL_PARAM_locate(param_3,&DAT_002a1068);
        lVar10 = OSSL_PARAM_locate(param_3,&DAT_002c6764);
        if (lVar12 != 0) goto LAB_00b4fcc4;
      }
      else {
LAB_00b4fcc4:
        pVar2 = EC_KEY_get_conv_form(param_1);
        lVar7 = EC_POINT_point2buf(pEVar4,pEVar6,pVar2,param_5,ctx);
        if ((lVar7 == 0) ||
           (iVar3 = ossl_param_build_set_octet_string(param_2,lVar12,&DAT_002ad463,*param_5,lVar7),
           iVar3 == 0)) goto LAB_00b4fe1c;
      }
      if (lVar10 != 0 || local_68 != 0) {
        if (local_68 == 0) {
          pBVar8 = (BIGNUM *)0x0;
        }
        else {
          pBVar8 = BN_CTX_get(ctx);
          if (pBVar8 == (BIGNUM *)0x0) goto LAB_00b4fe1c;
        }
        if (lVar10 == 0) {
          pBVar9 = (BIGNUM *)0x0;
        }
        else {
          pBVar9 = BN_CTX_get(ctx);
          if (pBVar9 == (BIGNUM *)0x0) goto LAB_00b4fe1c;
        }
        iVar3 = EC_POINT_get_affine_coordinates(pEVar4,pEVar6,pBVar8,pBVar9,ctx);
        if (((iVar3 == 0) ||
            ((local_68 != 0 &&
             (iVar3 = ossl_param_build_set_bn(param_2,local_68,&DAT_002a1068,pBVar8), iVar3 == 0))))
           || ((lVar10 != 0 &&
               (iVar3 = ossl_param_build_set_bn(param_2,lVar10,&DAT_002c6764,pBVar9), iVar3 == 0))))
        goto LAB_00b4fe1c;
      }
      goto joined_r0x00b4fd40;
    }
  }
LAB_00b4fe1c:
  uVar11 = 0;
LAB_00b4fe20:
  BN_CTX_free(ctx);
  return uVar11;
}

