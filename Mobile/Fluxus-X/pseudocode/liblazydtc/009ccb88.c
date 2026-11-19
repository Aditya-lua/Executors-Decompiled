/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ccb88
 */

void SSL3_BUFFER_release(undefined8 *param_1)

{
  CRYPTO_free((void *)*param_1);
  *param_1 = 0;
  return;
}

