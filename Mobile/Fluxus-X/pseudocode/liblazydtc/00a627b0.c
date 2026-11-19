/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a627b0
 */

void OSSL_ENCODER_CTX_set_passphrase(long param_1)

{
  ossl_pw_set_passphrase(param_1 + 0x38);
  return;
}

