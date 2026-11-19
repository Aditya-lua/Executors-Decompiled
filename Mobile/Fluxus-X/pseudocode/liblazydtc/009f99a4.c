/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f99a4
 */

bool ASYNC_WAIT_CTX_set_wait_fd
               (long *param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4,
               undefined8 param_5)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)CRYPTO_zalloc(0x30,"crypto/async/async_wait.c",0x32);
  if (puVar1 == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/async/async_wait.c",0x33,"ASYNC_WAIT_CTX_set_wait_fd");
    ERR_set_error(0x33,0xc0100,0);
  }
  else {
    *puVar1 = param_2;
    *(undefined4 *)(puVar1 + 1) = param_3;
    puVar1[2] = param_4;
    puVar1[3] = param_5;
    *(undefined4 *)(puVar1 + 4) = 1;
    puVar1[5] = *param_1;
    *param_1 = (long)puVar1;
    param_1[1] = param_1[1] + 1;
  }
  return puVar1 != (undefined8 *)0x0;
}

