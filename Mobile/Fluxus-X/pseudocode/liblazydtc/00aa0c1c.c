/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa0c1c
 */

void ossl_pw_clear_passphrase_data(int *param_1)

{
  if (param_1 != (int *)0x0) {
    if (*param_1 == 1) {
      CRYPTO_clear_free(*(undefined8 *)(param_1 + 2),*(undefined8 *)(param_1 + 4),
                        "crypto/passphrase.c",0x15);
    }
    CRYPTO_clear_free(*(undefined8 *)(param_1 + 8),*(undefined8 *)(param_1 + 10),
                      "crypto/passphrase.c",0x1d);
    param_1[6] = 0;
    param_1[7] = 0;
    param_1[4] = 0;
    param_1[5] = 0;
    param_1[10] = 0;
    param_1[0xb] = 0;
    param_1[8] = 0;
    param_1[9] = 0;
    param_1[2] = 0;
    param_1[3] = 0;
    param_1[0] = 0;
    param_1[1] = 0;
  }
  return;
}

