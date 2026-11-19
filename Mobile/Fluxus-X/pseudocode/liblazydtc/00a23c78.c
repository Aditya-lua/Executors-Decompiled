/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a23c78
 */

undefined4
FUN_00a23c78(long param_1,undefined8 param_2,code *param_3,undefined8 param_4,undefined8 param_5)

{
  int iVar1;
  point_conversion_form_t pVar2;
  uint uVar3;
  undefined4 uVar4;
  EC_GROUP *pEVar5;
  long lVar6;
  BN_CTX *ctx;
  BIGNUM *pBVar7;
  EC_POINT *pEVar8;
  long lVar9;
  undefined8 uVar10;
  EC_KEY *key;
  uint uVar11;
  void *local_60;
  void *local_58;
  
  local_60 = (void *)0x0;
  local_58 = (void *)0x0;
  if ((((param_1 == 0) || (key = *(EC_KEY **)(param_1 + 0x20), key == (EC_KEY *)0x0)) ||
      (pEVar5 = EC_KEY_get0_group(key), pEVar5 == (EC_GROUP *)0x0)) ||
     (lVar6 = OSSL_PARAM_BLD_new(), lVar6 == 0)) {
    return 0;
  }
  ctx = (BN_CTX *)BN_CTX_new_ex(param_4);
  if (ctx != (BN_CTX *)0x0) {
    BN_CTX_start(ctx);
    iVar1 = ossl_ec_group_todata(pEVar5,lVar6,0,param_4,param_5,ctx,&local_60);
    if (iVar1 != 0) {
      pBVar7 = EC_KEY_get0_private_key(key);
      pEVar8 = EC_KEY_get0_public_key(key);
      if (pEVar8 == (EC_POINT *)0x0) {
        uVar11 = 4;
      }
      else {
        pVar2 = EC_KEY_get_conv_form(key);
        lVar9 = EC_POINT_point2buf(pEVar5,pEVar8,pVar2,&local_58,ctx);
        if ((lVar9 == 0) ||
           (iVar1 = OSSL_PARAM_BLD_push_octet_string(lVar6,&DAT_002ad463,local_58,lVar9), iVar1 == 0
           )) goto LAB_00a23e28;
        uVar11 = 6;
      }
      if (pBVar7 == (BIGNUM *)0x0) {
LAB_00a23e04:
        uVar10 = OSSL_PARAM_BLD_to_param(lVar6);
        uVar4 = (*param_3)(param_2,uVar11,uVar10);
        goto LAB_00a23e30;
      }
      iVar1 = EC_GROUP_order_bits(pEVar5);
      if (0 < iVar1) {
        uVar3 = iVar1 + 0xe;
        if (-1 < (int)(iVar1 + 7U)) {
          uVar3 = iVar1 + 7U;
        }
        iVar1 = OSSL_PARAM_BLD_push_BN_pad
                          (lVar6,&DAT_002a3e83,pBVar7,(long)((ulong)uVar3 << 0x20) >> 0x23);
        if (iVar1 != 0) {
          uVar3 = EC_KEY_get_flags(key);
          iVar1 = OSSL_PARAM_BLD_push_int(lVar6,"use-cofactor-flag",uVar3 >> 0xc & 1);
          if (iVar1 != 0) {
            uVar11 = uVar11 | 0x81;
            goto LAB_00a23e04;
          }
        }
      }
    }
  }
LAB_00a23e28:
  uVar4 = 0;
  uVar10 = 0;
LAB_00a23e30:
  OSSL_PARAM_BLD_free(lVar6);
  OSSL_PARAM_free(uVar10);
  CRYPTO_free(local_58);
  CRYPTO_free(local_60);
  BN_CTX_end(ctx);
  BN_CTX_free(ctx);
  return uVar4;
}

