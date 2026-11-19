/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b48dd0
 */

undefined8 FUN_00b48dd0(undefined8 *param_1,long param_2)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  byte *local_38;
  
  uVar2 = ossl_prov_ctx_get0_libctx(*param_1);
  if (param_2 != 0) {
    uVar2 = ossl_prov_digest_load_from_params(param_1 + 1,param_2,uVar2);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,&DAT_002c567e);
    if (lVar3 != 0) {
      puVar4 = param_1 + 4;
      puVar5 = param_1 + 5;
      CRYPTO_clear_free(*puVar4,*puVar5,"providers/implementations/kdfs/sshkdf.c",0x5d);
      *puVar5 = 0;
      *puVar4 = 0;
      uVar2 = OSSL_PARAM_get_octet_string(lVar3,puVar4,0,puVar5);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,"xcghash");
    if (lVar3 != 0) {
      puVar4 = param_1 + 6;
      puVar5 = param_1 + 7;
      CRYPTO_clear_free(*puVar4,*puVar5,"providers/implementations/kdfs/sshkdf.c",0x5d);
      *puVar5 = 0;
      *puVar4 = 0;
      uVar2 = OSSL_PARAM_get_octet_string(lVar3,puVar4,0,puVar5);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,"session_id");
    if (lVar3 != 0) {
      puVar4 = param_1 + 9;
      puVar5 = param_1 + 10;
      CRYPTO_clear_free(*puVar4,*puVar5,"providers/implementations/kdfs/sshkdf.c",0x5d);
      *puVar5 = 0;
      *puVar4 = 0;
      uVar2 = OSSL_PARAM_get_octet_string(lVar3,puVar4,0,puVar5);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,&DAT_002cecd9);
    if (lVar3 != 0) {
      iVar1 = OSSL_PARAM_get_utf8_string_ptr(lVar3,&local_38);
      if (((iVar1 != 0) && (local_38 != (byte *)0x0)) && (*(long *)(lVar3 + 0x18) == 1)) {
        if (*local_38 - 0x41 < 6) {
          *(byte *)(param_1 + 8) = *local_38;
          return 1;
        }
        ERR_new();
        ERR_set_debug("providers/implementations/kdfs/sshkdf.c",0xab,"kdf_sshkdf_set_ctx_params");
        ERR_set_error(0x39,0x8a,0);
      }
      return 0;
    }
  }
  return 1;
}

