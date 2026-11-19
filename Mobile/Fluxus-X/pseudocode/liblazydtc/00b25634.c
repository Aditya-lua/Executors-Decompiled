/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b25634
 */

undefined4 * FUN_00b25634(undefined8 param_1)

{
  int iVar1;
  undefined4 *puVar2;
  undefined8 uVar3;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    puVar2 = (undefined4 *)0x0;
  }
  else {
    puVar2 = (undefined4 *)
             CRYPTO_zalloc(0x78,"providers/implementations/ciphers/cipher_aes_siv.c",0x26);
    if (puVar2 != (undefined4 *)0x0) {
      *puVar2 = 0x10004;
      *(undefined8 *)(puVar2 + 4) = 0x10;
      *(undefined8 *)(puVar2 + 2) = 0x20;
      uVar3 = ossl_prov_cipher_hw_aes_siv(0x100);
      *(undefined8 *)(puVar2 + 0x1a) = uVar3;
      uVar3 = ossl_prov_ctx_get0_libctx(param_1);
      *(undefined8 *)(puVar2 + 0x1c) = uVar3;
    }
  }
  return puVar2;
}

