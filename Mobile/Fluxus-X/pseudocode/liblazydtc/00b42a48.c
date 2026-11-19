/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b42a48
 */

undefined8 * FUN_00b42a48(undefined8 param_1)

{
  int iVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    puVar2 = (undefined8 *)0x0;
  }
  else {
    puVar2 = (undefined8 *)CRYPTO_zalloc(0x48,"providers/implementations/exchange/dh_exch.c",0x58);
    if (puVar2 != (undefined8 *)0x0) {
      uVar3 = ossl_prov_ctx_get0_libctx(param_1);
      *puVar2 = uVar3;
      *(undefined4 *)((long)puVar2 + 0x1c) = 0;
    }
  }
  return puVar2;
}

