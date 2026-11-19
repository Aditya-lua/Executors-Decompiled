/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b45d74
 */

undefined8 FUN_00b45d74(undefined8 *param_1,long param_2)

{
  long *plVar1;
  undefined8 *puVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  undefined4 uVar6;
  
  uVar4 = ossl_prov_ctx_get0_libctx(*param_1);
  if (param_2 != 0) {
    plVar1 = param_1 + 2;
    uVar4 = ossl_prov_macctx_load_from_params(plVar1,param_2,0,0,0,uVar4);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    if (*plVar1 != 0) {
      uVar4 = EVP_MAC_CTX_get0_mac();
      iVar3 = EVP_MAC_is_a(uVar4,&DAT_002c35d3);
      if (iVar3 == 0) {
        uVar4 = EVP_MAC_CTX_get0_mac(*plVar1);
        iVar3 = EVP_MAC_is_a(uVar4,&DAT_002bdb6e);
        if (iVar3 == 0) {
          ERR_new();
          ERR_set_debug("providers/implementations/kdfs/kbkdf.c",0x128,"kbkdf_set_ctx_params");
          uVar4 = 0x97;
          goto LAB_00b46088;
        }
      }
    }
    lVar5 = OSSL_PARAM_locate_const(param_2,&DAT_002d7a76);
    if (lVar5 != 0) {
      iVar3 = OPENSSL_strncasecmp("counter",*(undefined8 *)(lVar5 + 0x10),
                                  *(undefined8 *)(lVar5 + 0x18));
      if (iVar3 == 0) {
        uVar6 = 0;
      }
      else {
        iVar3 = OPENSSL_strncasecmp("feedback",*(undefined8 *)(lVar5 + 0x10),
                                    *(undefined8 *)(lVar5 + 0x18));
        if (iVar3 != 0) {
          ERR_new();
          ERR_set_debug("providers/implementations/kdfs/kbkdf.c",0x134,"kbkdf_set_ctx_params");
          uVar4 = 0x7d;
LAB_00b46088:
          ERR_set_error(0x39,uVar4,0);
          return 0;
        }
        uVar6 = 1;
      }
      *(undefined4 *)(param_1 + 1) = uVar6;
    }
    lVar5 = OSSL_PARAM_locate_const(param_2,&DAT_002c567e);
    if (((lVar5 != 0) && (*(long *)(lVar5 + 0x10) != 0)) && (*(long *)(lVar5 + 0x18) != 0)) {
      puVar2 = param_1 + 3;
      CRYPTO_clear_free(*puVar2,param_1[4],"providers/implementations/kdfs/kbkdf.c",0x112);
      *puVar2 = 0;
      uVar4 = OSSL_PARAM_get_octet_string(lVar5,puVar2,0,param_1 + 4);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
    }
    lVar5 = OSSL_PARAM_locate_const(param_2,&DAT_002a7b6c);
    if (((lVar5 != 0) && (*(long *)(lVar5 + 0x10) != 0)) && (*(long *)(lVar5 + 0x18) != 0)) {
      puVar2 = param_1 + 5;
      CRYPTO_clear_free(*puVar2,param_1[6],"providers/implementations/kdfs/kbkdf.c",0x112);
      *puVar2 = 0;
      uVar4 = OSSL_PARAM_get_octet_string(lVar5,puVar2,0,param_1 + 6);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
    }
    lVar5 = OSSL_PARAM_locate_const(param_2,&DAT_0029e225);
    if (((lVar5 != 0) && (*(long *)(lVar5 + 0x10) != 0)) && (*(long *)(lVar5 + 0x18) != 0)) {
      puVar2 = param_1 + 7;
      CRYPTO_clear_free(*puVar2,param_1[8],"providers/implementations/kdfs/kbkdf.c",0x112);
      *puVar2 = 0;
      uVar4 = OSSL_PARAM_get_octet_string(lVar5,puVar2,0,param_1 + 8);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
    }
    lVar5 = OSSL_PARAM_locate_const(param_2,&DAT_002bb864);
    if (((lVar5 != 0) && (*(long *)(lVar5 + 0x10) != 0)) && (*(long *)(lVar5 + 0x18) != 0)) {
      puVar2 = param_1 + 9;
      CRYPTO_clear_free(*puVar2,param_1[10],"providers/implementations/kdfs/kbkdf.c",0x112);
      *puVar2 = 0;
      uVar4 = OSSL_PARAM_get_octet_string(lVar5,puVar2,0,param_1 + 10);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
    }
    lVar5 = OSSL_PARAM_locate_const(param_2,"use-l");
    if ((lVar5 != 0) && (uVar4 = OSSL_PARAM_get_int(lVar5,param_1 + 0xb), (int)uVar4 == 0)) {
      return uVar4;
    }
    lVar5 = OSSL_PARAM_locate_const(param_2,"use-separator");
    if ((lVar5 != 0) && (uVar4 = OSSL_PARAM_get_int(lVar5,(long)param_1 + 0x5c), (int)uVar4 == 0)) {
      return uVar4;
    }
    if (((*plVar1 != 0) && (param_1[4] != 0)) &&
       (uVar4 = EVP_MAC_init(*plVar1,param_1[3],param_1[4],0), (int)uVar4 == 0)) {
      return uVar4;
    }
  }
  return 1;
}

