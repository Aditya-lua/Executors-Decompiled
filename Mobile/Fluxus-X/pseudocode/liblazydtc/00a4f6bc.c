/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4f6bc
 */

void OSSL_DECODER_CTX_set_passphrase_ui(long param_1)

{
  ossl_pw_set_ui_method(param_1 + 0x38);
  return;
}

