/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a84c44
 */

bool OPENSSL_atexit(undefined8 param_1)

{
  undefined8 *puVar1;
  
  puVar1 = CRYPTO_malloc(0x10,"crypto/init.c",0x2c7);
  if (puVar1 == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/init.c",0x2c8,"OPENSSL_atexit");
    ERR_set_error(0xf,0xc0100,0);
  }
  else {
    *puVar1 = param_1;
    puVar1[1] = DAT_00d22000;
    DAT_00d22000 = puVar1;
  }
  return puVar1 != (undefined8 *)0x0;
}

