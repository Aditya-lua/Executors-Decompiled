/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a54e90
 */

undefined8 err_shelve_state(undefined8 *param_1)

{
  undefined4 uVar1;
  undefined4 *puVar2;
  undefined8 uVar3;
  
  puVar2 = (undefined4 *)__errno();
  uVar1 = *puVar2;
  uVar3 = OPENSSL_init_crypto(0x40000,0);
  if (((int)uVar3 != 0) &&
     (uVar3 = CRYPTO_THREAD_run_once(&DAT_00d21b38,FUN_00a54cdc), (int)uVar3 != 0)) {
    uVar3 = 0;
    if (DAT_00d21b3c != 0) {
      uVar3 = CRYPTO_THREAD_get_local(&DAT_00d21a1c);
      *param_1 = uVar3;
      uVar3 = CRYPTO_THREAD_set_local(&DAT_00d21a1c,0xffffffffffffffff);
      if ((int)uVar3 != 0) {
        uVar3 = 1;
        *puVar2 = uVar1;
      }
    }
  }
  return uVar3;
}

