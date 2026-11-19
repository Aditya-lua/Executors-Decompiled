/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a72138
 */

undefined4 FUN_00a72138(undefined4 param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  undefined4 uVar2;
  EC_KEY *key;
  BN_CTX *c;
  EC_GROUP *pEVar3;
  EC_POINT *pEVar4;
  undefined8 uVar5;
  void *local_48;
  
  uVar5 = *(undefined8 *)(param_3 + 0x20);
  local_48 = (void *)0x0;
  *(undefined8 *)(param_3 + 0x20) = 0;
  iVar1 = EVP_PKEY_get_base_id(uVar5);
  if (iVar1 < 0x198) {
    if (iVar1 == 0x1c) goto LAB_00a721bc;
    if (iVar1 != 0x74) {
LAB_00a7226c:
      ERR_new();
      ERR_set_debug("crypto/evp/ctrl_params_translate.c",0x676,"get_payload_public_key");
      ERR_set_error(6,0xe0,0);
      return 0;
    }
    if (*(int *)(*(long *)(param_3 + 0x30) + 8) != 2) {
      return 0;
    }
    EVP_PKEY_get0_DSA(uVar5);
    uVar5 = DSA_get0_pub_key();
  }
  else {
    if (iVar1 == 0x198) {
      if (*(int *)(*(long *)(param_3 + 0x30) + 8) != 5) {
        return 0;
      }
      key = (EC_KEY *)EVP_PKEY_get0_EC_KEY(uVar5);
      ossl_ec_key_get_libctx();
      c = (BN_CTX *)BN_CTX_new_ex();
      pEVar3 = EC_KEY_get0_group(key);
      pEVar4 = EC_KEY_get0_public_key(key);
      if (c == (BN_CTX *)0x0) {
        return 0;
      }
      uVar5 = EC_POINT_point2buf(pEVar3,pEVar4,2,&local_48,c);
      *(void **)(param_3 + 0x20) = local_48;
      *(undefined8 *)(param_3 + 0x28) = uVar5;
      BN_CTX_free(c);
      goto LAB_00a722b0;
    }
    if (iVar1 != 0x398) goto LAB_00a7226c;
LAB_00a721bc:
    iVar1 = *(int *)(*(long *)(param_3 + 0x30) + 8);
    if (iVar1 != 2) {
      if (iVar1 != 5) {
        return 0;
      }
      uVar5 = EVP_PKEY_get0_DH(uVar5);
      uVar5 = ossl_dh_key2buf(uVar5,&local_48,0,1);
      *(void **)(param_3 + 0x20) = local_48;
      *(undefined8 *)(param_3 + 0x28) = uVar5;
      goto LAB_00a722b0;
    }
    EVP_PKEY_get0_DH(uVar5);
    uVar5 = DH_get0_pub_key();
  }
  *(undefined8 *)(param_3 + 0x20) = uVar5;
LAB_00a722b0:
  uVar2 = FUN_00a6fd84(param_1,param_2,param_3);
  CRYPTO_free(local_48);
  return uVar2;
}

