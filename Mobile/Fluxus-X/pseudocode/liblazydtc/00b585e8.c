/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b585e8
 */

void ossl_drbg_unlock(long *param_1)

{
  if ((param_1 == (long *)0x0) || (*param_1 == 0)) {
    return;
  }
  CRYPTO_THREAD_unlock();
  return;
}

