/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a81308
 */

undefined8 * OSSL_LIB_CTX_get0_global_default(void)

{
  undefined8 *puVar1;
  int iVar2;
  
  iVar2 = CRYPTO_THREAD_run_once(&DAT_00d21d5c,FUN_00a81348);
  puVar1 = &DAT_00d21b90;
  if (DAT_00d21d60 == 0 || iVar2 == 0) {
    puVar1 = (undefined8 *)0x0;
  }
  return puVar1;
}

