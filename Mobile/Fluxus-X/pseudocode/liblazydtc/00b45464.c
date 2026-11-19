/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b45464
 */

undefined8 FUN_00b45464(undefined8 *param_1,long param_2)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 *puVar4;
  uint local_34;
  
  uVar2 = ossl_prov_ctx_get0_libctx(*param_1);
  if (param_2 != 0) {
    uVar2 = ossl_prov_digest_load_from_params(param_1 + 2,param_2,uVar2);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,&DAT_002d7a76);
    if (lVar3 != 0) {
      if (*(int *)(lVar3 + 8) == 4) {
        iVar1 = OPENSSL_strcasecmp(*(undefined8 *)(lVar3 + 0x10),"EXTRACT_AND_EXPAND");
        if (iVar1 == 0) {
          local_34 = 0;
        }
        else {
          iVar1 = OPENSSL_strcasecmp(*(undefined8 *)(lVar3 + 0x10),"EXTRACT_ONLY");
          if (iVar1 == 0) {
            local_34 = 1;
          }
          else {
            iVar1 = OPENSSL_strcasecmp(*(undefined8 *)(lVar3 + 0x10),"EXPAND_ONLY");
            if (iVar1 != 0) {
              ERR_new();
              uVar2 = 0xd2;
              goto LAB_00b45574;
            }
            local_34 = 2;
          }
        }
      }
      else {
        iVar1 = OSSL_PARAM_get_int(lVar3,&local_34);
        if (iVar1 == 0) {
          ERR_new();
          uVar2 = 0xde;
LAB_00b45574:
          ERR_set_debug("providers/implementations/kdfs/hkdf.c",uVar2,"hkdf_common_set_ctx_params");
          ERR_set_error(0x39,0x7d,0);
          return 0;
        }
        if (2 < local_34) {
          ERR_new();
          uVar2 = 0xd9;
          goto LAB_00b45574;
        }
      }
      *(uint *)(param_1 + 1) = local_34;
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,&DAT_002c567e);
    if (lVar3 != 0) {
      puVar4 = param_1 + 7;
      CRYPTO_clear_free(*puVar4,param_1[8],"providers/implementations/kdfs/hkdf.c",0xe4);
      *puVar4 = 0;
      uVar2 = OSSL_PARAM_get_octet_string(lVar3,puVar4,0,param_1 + 8);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,&DAT_002a7b6c);
    if (((lVar3 != 0) && (*(long *)(lVar3 + 0x18) != 0)) && (*(long *)(lVar3 + 0x10) != 0)) {
      puVar4 = param_1 + 5;
      CRYPTO_free((void *)*puVar4);
      *puVar4 = 0;
      uVar2 = OSSL_PARAM_get_octet_string(lVar3,puVar4,0,param_1 + 6);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
    }
  }
  return 1;
}

