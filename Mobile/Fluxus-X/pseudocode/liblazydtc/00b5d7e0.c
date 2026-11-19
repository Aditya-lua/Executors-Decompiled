/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5d7e0
 */

undefined8 * FUN_00b5d7e0(undefined8 param_1)

{
  int iVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    puVar2 = (undefined8 *)0x0;
  }
  else {
    puVar2 = (undefined8 *)
             CRYPTO_zalloc(0x120,"providers/implementations/signature/eddsa_sig.c",0x4b);
    if (puVar2 == (undefined8 *)0x0) {
      ERR_new();
      ERR_set_debug("providers/implementations/signature/eddsa_sig.c",0x4d,"eddsa_newctx");
      ERR_set_error(0x39,0xc0100,0);
    }
    else {
      uVar3 = ossl_prov_ctx_get0_libctx(param_1);
      *puVar2 = uVar3;
    }
  }
  return puVar2;
}

