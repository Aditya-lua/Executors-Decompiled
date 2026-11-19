/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b469bc
 */

undefined8 * FUN_00b469bc(undefined8 param_1)

{
  int iVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 local_60;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    puVar2 = (undefined8 *)0x0;
  }
  else {
    puVar2 = (undefined8 *)CRYPTO_zalloc(0x50,"providers/implementations/kdfs/pbkdf2.c",0x49);
    if (puVar2 == (undefined8 *)0x0) {
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/pbkdf2.c",0x4b,"kdf_pbkdf2_new");
      ERR_set_error(0x39,0xc0100,0);
    }
    else {
      *puVar2 = param_1;
      memset(&local_80,0,0x50);
      uVar3 = ossl_prov_ctx_get0_libctx(*puVar2);
      OSSL_PARAM_construct_utf8_string(&local_a8,"digest",&DAT_002d142e,0);
      local_60 = local_88;
      uStack_78 = uStack_a0;
      local_80 = local_a8;
      uStack_68 = uStack_90;
      uStack_70 = local_98;
      iVar1 = ossl_prov_digest_load_from_params(puVar2 + 6,&local_80,uVar3);
      if (iVar1 == 0) {
        ossl_prov_digest_reset(puVar2 + 6);
      }
      puVar2[5] = 0x800;
      *(undefined4 *)(puVar2 + 9) = 0;
    }
  }
  return puVar2;
}

