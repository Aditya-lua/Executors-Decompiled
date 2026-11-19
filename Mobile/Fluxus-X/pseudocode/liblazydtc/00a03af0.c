/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a03af0
 */

undefined8 * BN_CTX_secure_new_ex(undefined8 param_1)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)CRYPTO_zalloc(0x48,"crypto/bn/bn_ctx.c",0x7a);
  if (puVar1 == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_ctx.c",0x7b,"BN_CTX_new_ex");
    ERR_set_error(3,0xc0100,0);
    puVar1 = (undefined8 *)0x0;
  }
  else {
    puVar1[8] = param_1;
    puVar1[3] = 0;
    puVar1[2] = 0;
    puVar1[5] = 0;
    puVar1[4] = 0;
    puVar1[1] = 0;
    *puVar1 = 0;
    *(undefined4 *)((long)puVar1 + 0x3c) = 8;
  }
  return puVar1;
}

