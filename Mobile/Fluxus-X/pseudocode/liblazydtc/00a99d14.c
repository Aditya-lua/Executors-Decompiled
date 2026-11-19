/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a99d14
 */

void CRYPTO_clear_free(void *param_1,size_t param_2,undefined8 param_3,undefined4 param_4)

{
  if (param_1 == (void *)0x0) {
    return;
  }
  if (param_2 != 0) {
    OPENSSL_cleanse(param_1,param_2);
  }
  if ((code *)PTR_CRYPTO_free_00cc9148 == CRYPTO_free) {
    free(param_1);
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00a99d70. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_CRYPTO_free_00cc9148)(param_1,param_3,param_4);
  return;
}

