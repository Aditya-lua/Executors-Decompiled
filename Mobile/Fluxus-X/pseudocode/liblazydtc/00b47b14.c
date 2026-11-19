/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b47b14
 */

undefined8 * FUN_00b47b14(undefined8 param_1)

{
  int iVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    puVar2 = (undefined8 *)0x0;
  }
  else {
    puVar2 = (undefined8 *)CRYPTO_zalloc(0x58,"providers/implementations/kdfs/scrypt.c",0x40);
    if (puVar2 == (undefined8 *)0x0) {
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/scrypt.c",0x42,"kdf_scrypt_new");
      ERR_set_error(0x39,0xc0100,0);
    }
    else {
      uVar3 = ossl_prov_ctx_get0_libctx(param_1);
      *puVar2 = uVar3;
      puVar2[7] = 8;
      puVar2[6] = 0x100000;
      puVar2[9] = 0x40100000;
      puVar2[8] = 1;
    }
  }
  return puVar2;
}

