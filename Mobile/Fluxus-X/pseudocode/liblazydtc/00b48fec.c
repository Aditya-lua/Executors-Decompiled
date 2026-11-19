/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b48fec
 */

undefined8 * FUN_00b48fec(undefined8 param_1)

{
  int iVar1;
  undefined8 *puVar2;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    puVar2 = (undefined8 *)0x0;
  }
  else {
    puVar2 = (undefined8 *)CRYPTO_zalloc(0x68,"providers/implementations/kdfs/sskdf.c",0x125);
    if (puVar2 == (undefined8 *)0x0) {
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/sskdf.c",0x126,"sskdf_new");
      ERR_set_error(0x39,0xc0100,0);
    }
    *puVar2 = param_1;
  }
  return puVar2;
}

