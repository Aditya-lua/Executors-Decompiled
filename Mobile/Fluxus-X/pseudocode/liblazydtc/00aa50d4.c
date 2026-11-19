/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa50d4
 */

undefined8 * OSSL_SELF_TEST_new(undefined8 param_1,undefined8 param_2)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)CRYPTO_zalloc(200,"crypto/self_test_core.c",0x67);
  if (puVar1 != (undefined8 *)0x0) {
    puVar1[0x18] = param_2;
    puVar1[2] = &DAT_002ab32c;
    puVar1[3] = param_1;
    puVar1[1] = &DAT_002ab32c;
    *puVar1 = &DAT_002ab32c;
    FUN_00aa513c(puVar1);
  }
  return puVar1;
}

