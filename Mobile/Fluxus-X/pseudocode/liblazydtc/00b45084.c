/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b45084
 */

undefined8 FUN_00b45084(long param_1,long param_2)

{
  undefined8 uVar1;
  long lVar2;
  undefined8 *puVar3;
  
  if (param_2 != 0) {
    uVar1 = FUN_00b45464();
    if ((int)uVar1 == 0) {
      return uVar1;
    }
    if (*(int *)(param_1 + 8) == 0) {
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/hkdf.c",0x2e1,"kdf_tls1_3_set_ctx_params");
      ERR_set_error(0x39,0x7d,0);
      return 0;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"prefix");
    if (lVar2 != 0) {
      puVar3 = (undefined8 *)(param_1 + 0x48);
      CRYPTO_free((void *)*puVar3);
      *puVar3 = 0;
      uVar1 = OSSL_PARAM_get_octet_string(lVar2,puVar3,0,param_1 + 0x50);
      if ((int)uVar1 == 0) {
        return uVar1;
      }
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"label");
    if (lVar2 != 0) {
      puVar3 = (undefined8 *)(param_1 + 0x58);
      CRYPTO_free((void *)*puVar3);
      *puVar3 = 0;
      uVar1 = OSSL_PARAM_get_octet_string(lVar2,puVar3,0,param_1 + 0x60);
      if ((int)uVar1 == 0) {
        return uVar1;
      }
    }
    puVar3 = (undefined8 *)(param_1 + 0x68);
    CRYPTO_clear_free(*puVar3,*(undefined8 *)(param_1 + 0x70),
                      "providers/implementations/kdfs/hkdf.c",0x2f5);
    *puVar3 = 0;
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002d167a);
    if ((lVar2 != 0) &&
       (uVar1 = OSSL_PARAM_get_octet_string(lVar2,puVar3,0,(undefined8 *)(param_1 + 0x70)),
       (int)uVar1 == 0)) {
      return uVar1;
    }
  }
  return 1;
}

