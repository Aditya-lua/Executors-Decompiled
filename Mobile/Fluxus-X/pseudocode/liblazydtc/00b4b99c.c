/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4b99c
 */

undefined8 * FUN_00b4b99c(undefined8 param_1)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  
  puVar1 = (undefined8 *)CRYPTO_zalloc(0x18,"providers/implementations/kem/rsa_kem.c",0x55);
  if (puVar1 != (undefined8 *)0x0) {
    uVar2 = ossl_prov_ctx_get0_libctx(param_1);
    *puVar1 = uVar2;
    *(undefined4 *)(puVar1 + 2) = 0xffffffff;
  }
  return puVar1;
}

