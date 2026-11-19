/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2757c
 */

EC_KEY * ossl_ec_key_dup(long *param_1,uint param_2)

{
  int iVar1;
  EC_KEY *key;
  EC_GROUP *dst;
  long lVar2;
  EC_POINT *dst_00;
  BIGNUM *pBVar3;
  long lVar4;
  code *pcVar5;
  
  if (param_1 == (long *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_backend.c",0x25a,"ossl_ec_key_dup");
    ERR_set_error(0x10,0xc0102,0);
    return (EC_KEY *)0x0;
  }
  key = (EC_KEY *)ossl_ec_key_new_method_int(param_1[0xb],param_1[0xc],param_1[1]);
  if (key == (EC_KEY *)0x0) {
    return (EC_KEY *)0x0;
  }
  if (((param_2 >> 2 & 1) != 0) && ((undefined8 *)param_1[3] != (undefined8 *)0x0)) {
    dst = (EC_GROUP *)ossl_ec_group_new_ex(param_1[0xb],param_1[0xc],*(undefined8 *)param_1[3]);
    *(EC_GROUP **)(key + 0x18) = dst;
    if ((dst == (EC_GROUP *)0x0) || (iVar1 = EC_GROUP_copy(dst,(EC_GROUP *)param_1[3]), iVar1 == 0))
    goto LAB_00a276d0;
    lVar4 = *param_1;
    if (lVar4 != 0) {
      lVar2 = 0;
      if ((ENGINE *)param_1[1] != (ENGINE *)0x0) {
        iVar1 = ENGINE_init((ENGINE *)param_1[1]);
        if (iVar1 == 0) goto LAB_00a276d0;
        lVar4 = *param_1;
        lVar2 = param_1[1];
      }
      *(long *)key = lVar4;
      *(long *)(key + 8) = lVar2;
    }
  }
  if (((param_2 >> 1 & 1) != 0) && (param_1[4] != 0)) {
    if (*(EC_GROUP **)(key + 0x18) == (EC_GROUP *)0x0) goto LAB_00a276d0;
    dst_00 = EC_POINT_new(*(EC_GROUP **)(key + 0x18));
    *(EC_POINT **)(key + 0x20) = dst_00;
    if ((dst_00 == (EC_POINT *)0x0) ||
       (iVar1 = EC_POINT_copy(dst_00,(EC_POINT *)param_1[4]), iVar1 == 0)) goto LAB_00a276d0;
  }
  if (((param_2 & 1) != 0) && (param_1[5] != 0)) {
    if (*(long *)(key + 0x18) == 0) goto LAB_00a276d0;
    pBVar3 = BN_new();
    *(BIGNUM **)(key + 0x28) = pBVar3;
    if (((pBVar3 == (BIGNUM *)0x0) ||
        (pBVar3 = BN_copy(pBVar3,(BIGNUM *)param_1[5]), pBVar3 == (BIGNUM *)0x0)) ||
       ((*(code **)(**(long **)(key + 0x18) + 0x160) != (code *)0x0 &&
        (iVar1 = (**(code **)(**(long **)(key + 0x18) + 0x160))(key,param_1), iVar1 == 0))))
    goto LAB_00a276d0;
  }
  if ((param_2 >> 7 & 1) != 0) {
    *(long *)(key + 0x30) = param_1[6];
  }
  *(int *)(key + 0x10) = (int)param_1[2];
  *(undefined4 *)(key + 0x3c) = *(undefined4 *)((long)param_1 + 0x3c);
  iVar1 = CRYPTO_dup_ex_data(8,(CRYPTO_EX_DATA *)(key + 0x40),(CRYPTO_EX_DATA *)(param_1 + 8));
  if (iVar1 != 0) {
    if (*(long *)key == 0) {
      return key;
    }
    pcVar5 = *(code **)(*(long *)key + 0x20);
    if (pcVar5 == (code *)0x0) {
      return key;
    }
    if (((~param_2 & 3) == 0) && (iVar1 = (*pcVar5)(key,param_1), iVar1 != 0)) {
      return key;
    }
  }
LAB_00a276d0:
  EC_KEY_free(key);
  return (EC_KEY *)0x0;
}

