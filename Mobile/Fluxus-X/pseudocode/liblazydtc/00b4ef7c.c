/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4ef7c
 */

undefined4 FUN_00b4ef7c(EC_KEY *param_1,uint param_2,code *param_3,undefined8 param_4)

{
  bool bVar1;
  int iVar2;
  undefined4 uVar3;
  long lVar4;
  BN_CTX *ctx;
  EC_GROUP *pEVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  long lVar8;
  void *local_68;
  void *local_58;
  
  local_58 = (void *)0x0;
  local_68 = (void *)0x0;
  iVar2 = ossl_prov_is_running();
  if ((param_2 >> 2 & 1) == 0) {
    return 0;
  }
  if (param_1 == (EC_KEY *)0x0) {
    return 0;
  }
  if (iVar2 == 0) {
    return 0;
  }
  if ((param_2 & 3) == 1) {
    return 0;
  }
  lVar4 = OSSL_PARAM_BLD_new();
  if (lVar4 == 0) {
    return 0;
  }
  ossl_ec_key_get_libctx(param_1);
  ctx = (BN_CTX *)BN_CTX_new_ex();
  if (ctx != (BN_CTX *)0x0) {
    BN_CTX_start(ctx);
    pEVar5 = EC_KEY_get0_group(param_1);
    uVar6 = ossl_ec_key_get_libctx(param_1);
    uVar7 = ossl_ec_key_get0_propq(param_1);
    iVar2 = ossl_ec_group_todata(pEVar5,lVar4,0,uVar6,uVar7,ctx,&local_68);
    bVar1 = (param_2 & 3) == 0 && iVar2 != 0;
    if (((param_2 & 3) != 0) && (iVar2 != 0)) {
      iVar2 = FUN_00b4fc00(param_1,lVar4,0,param_2 & 1,&local_58);
      bVar1 = iVar2 != 0;
    }
    if ((param_2 >> 7 & 1) == 0) {
      if (bVar1) {
LAB_00b4f0a4:
        lVar8 = OSSL_PARAM_BLD_to_param(lVar4);
        if (lVar8 != 0) {
          uVar3 = (*param_3)(lVar8,param_4);
          OSSL_PARAM_free(lVar8);
          goto LAB_00b4f0d0;
        }
      }
    }
    else if ((bVar1) && (iVar2 = FUN_00b4fe4c(param_1,lVar4,0), iVar2 != 0)) goto LAB_00b4f0a4;
  }
  uVar3 = 0;
LAB_00b4f0d0:
  OSSL_PARAM_BLD_free(lVar4);
  CRYPTO_free(local_58);
  CRYPTO_free(local_68);
  BN_CTX_end(ctx);
  BN_CTX_free(ctx);
  return uVar3;
}

