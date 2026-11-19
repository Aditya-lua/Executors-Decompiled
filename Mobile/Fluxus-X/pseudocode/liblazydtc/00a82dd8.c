/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a82dd8
 */

void ossl_namemap_free(byte *param_1)

{
  if ((param_1 == (byte *)0x0) || ((*param_1 & 1) != 0)) {
    return;
  }
  OPENSSL_LH_doall(*(undefined8 *)(param_1 + 0x10),&LAB_00a82e3c);
  OPENSSL_LH_free(*(undefined8 *)(param_1 + 0x10));
  CRYPTO_THREAD_lock_free(*(undefined8 *)(param_1 + 8));
  CRYPTO_free(param_1);
  return;
}

