/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ab254
 */

void ssl3_free_digest_list(long param_1)

{
  BIO_free(*(BIO **)(param_1 + 0x188));
  *(undefined8 *)(param_1 + 0x188) = 0;
  EVP_MD_CTX_free(*(undefined8 *)(param_1 + 400));
  *(undefined8 *)(param_1 + 400) = 0;
  return;
}

