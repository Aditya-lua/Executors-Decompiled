/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b1b60
 */

void FUN_009b1b60(long param_1)

{
  if (*(EVP_CIPHER_CTX **)(param_1 + 0x848) != (EVP_CIPHER_CTX *)0x0) {
    EVP_CIPHER_CTX_free(*(EVP_CIPHER_CTX **)(param_1 + 0x848));
    *(undefined8 *)(param_1 + 0x848) = 0;
  }
  if (*(EVP_CIPHER_CTX **)(param_1 + 0x878) != (EVP_CIPHER_CTX *)0x0) {
    EVP_CIPHER_CTX_free(*(EVP_CIPHER_CTX **)(param_1 + 0x878));
    *(undefined8 *)(param_1 + 0x878) = 0;
  }
  COMP_CTX_free(*(COMP_CTX **)(param_1 + 0x870));
  *(undefined8 *)(param_1 + 0x870) = 0;
  COMP_CTX_free(*(COMP_CTX **)(param_1 + 0x868));
  *(undefined8 *)(param_1 + 0x868) = 0;
  EVP_MD_CTX_free(*(undefined8 *)(param_1 + 0x860));
  *(undefined8 *)(param_1 + 0x860) = 0;
  EVP_MD_CTX_free(*(undefined8 *)(param_1 + 0x890));
  *(undefined8 *)(param_1 + 0x890) = 0;
  return;
}

