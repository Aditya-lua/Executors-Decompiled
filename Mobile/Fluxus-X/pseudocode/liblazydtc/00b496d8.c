/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b496d8
 */

undefined8 FUN_00b496d8(undefined8 *param_1,long param_2)

{
  long *plVar1;
  undefined8 *puVar2;
  int iVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long lVar6;
  long local_38;
  
  uVar4 = ossl_prov_ctx_get0_libctx(*param_1);
  if (param_2 == 0) {
    return 1;
  }
  plVar1 = param_1 + 1;
  uVar5 = ossl_prov_macctx_load_from_params(plVar1,param_2,0,0,0,uVar4);
  if ((int)uVar5 == 0) {
    return uVar5;
  }
  if (*plVar1 != 0) {
    uVar5 = EVP_MAC_CTX_get0_mac();
    iVar3 = EVP_MAC_is_a(uVar5,"KMAC128");
    if (iVar3 == 0) {
      uVar5 = EVP_MAC_CTX_get0_mac(*plVar1);
      iVar3 = EVP_MAC_is_a(uVar5,"KMAC256");
      if (iVar3 == 0) goto LAB_00b49764;
    }
    *(undefined4 *)(param_1 + 0xc) = 1;
  }
LAB_00b49764:
  uVar4 = ossl_prov_digest_load_from_params(param_1 + 2,param_2,uVar4);
  if ((int)uVar4 == 0) {
    return uVar4;
  }
  lVar6 = OSSL_PARAM_locate_const(param_2,"secret");
  if ((((lVar6 != 0) || (lVar6 = OSSL_PARAM_locate_const(param_2,&DAT_002c567e), lVar6 != 0)) &&
      (*(long *)(lVar6 + 0x10) != 0)) && (*(long *)(lVar6 + 0x18) != 0)) {
    puVar2 = param_1 + 5;
    CRYPTO_free((void *)*puVar2);
    *puVar2 = 0;
    uVar4 = OSSL_PARAM_get_octet_string(lVar6,puVar2,0,param_1 + 6);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
  }
  lVar6 = OSSL_PARAM_locate_const(param_2,&DAT_0029e225);
  if (((lVar6 != 0) && (*(long *)(lVar6 + 0x10) != 0)) && (*(long *)(lVar6 + 0x18) != 0)) {
    puVar2 = param_1 + 7;
    CRYPTO_free((void *)*puVar2);
    *puVar2 = 0;
    uVar4 = OSSL_PARAM_get_octet_string(lVar6,puVar2,0,param_1 + 8);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
  }
  lVar6 = OSSL_PARAM_locate_const(param_2,&DAT_002a7b6c);
  if (((lVar6 != 0) && (*(long *)(lVar6 + 0x10) != 0)) && (*(long *)(lVar6 + 0x18) != 0)) {
    puVar2 = param_1 + 9;
    CRYPTO_free((void *)*puVar2);
    *puVar2 = 0;
    uVar4 = OSSL_PARAM_get_octet_string(lVar6,puVar2,0,param_1 + 10);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
  }
  lVar6 = OSSL_PARAM_locate_const(param_2,"maclen");
  if (lVar6 != 0) {
    uVar4 = OSSL_PARAM_get_size_t(lVar6,&local_38);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    if (local_38 == 0) {
      return 0;
    }
    param_1[0xb] = local_38;
  }
  return 1;
}

