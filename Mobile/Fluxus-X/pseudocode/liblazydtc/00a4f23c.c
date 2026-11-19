/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4f23c
 */

void OSSL_DECODER_CTX_free(void *param_1)

{
  if (param_1 == (void *)0x0) {
    return;
  }
  if (*(code **)((long)param_1 + 0x28) != (code *)0x0) {
    (**(code **)((long)param_1 + 0x28))(*(undefined8 *)((long)param_1 + 0x30));
  }
  OPENSSL_sk_pop_free(*(undefined8 *)((long)param_1 + 0x18),ossl_decoder_instance_free);
  ossl_pw_clear_passphrase_data((long)param_1 + 0x38);
  CRYPTO_free(param_1);
  return;
}

