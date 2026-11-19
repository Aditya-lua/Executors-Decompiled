/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b443b8
 */

undefined8 * FUN_00b443b8(void)

{
  int iVar1;
  undefined8 *puVar2;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    return (undefined8 *)0x0;
  }
  puVar2 = (undefined8 *)CRYPTO_zalloc(0x18,"providers/implementations/exchange/ecx_exch.c",0x33);
  if (puVar2 == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("providers/implementations/exchange/ecx_exch.c",0x35,"ecx_newctx");
    ERR_set_error(0x39,0xc0100,0);
    return (undefined8 *)0x0;
  }
  *puVar2 = 0x38;
  return puVar2;
}

