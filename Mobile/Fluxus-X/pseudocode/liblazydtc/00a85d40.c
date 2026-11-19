/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a85d40
 */

void FUN_00a85d40(undefined8 param_1,undefined8 *param_2)

{
  if (param_2 == (undefined8 *)0x0) {
    return;
  }
  DSO_free((DSO *)*param_2);
  CRYPTO_free((void *)param_2[3]);
  CRYPTO_free((void *)param_2[5]);
  OPENSSL_sk_pop_free(param_2[10],&LAB_00a85db0);
  CRYPTO_free(param_2);
  return;
}

