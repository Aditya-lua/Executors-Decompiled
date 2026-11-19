/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aca60c
 */

undefined8 * ossl_rand_pool_attach(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)CRYPTO_zalloc(0x40,"crypto/rand/rand_pool.c",0x44);
  if (puVar1 == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/rand/rand_pool.c",0x47,"ossl_rand_pool_attach");
    ERR_set_error(0x24,0xc0100,0);
    puVar1 = (undefined8 *)0x0;
  }
  else {
    *puVar1 = param_1;
    puVar1[1] = param_2;
    puVar1[3] = param_2;
    puVar1[4] = param_2;
    *(undefined4 *)(puVar1 + 2) = 1;
    puVar1[5] = param_2;
    puVar1[6] = param_3;
  }
  return puVar1;
}

