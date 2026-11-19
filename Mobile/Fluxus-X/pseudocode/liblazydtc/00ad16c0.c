/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad16c0
 */

undefined8 ossl_rsa_get0_libctx(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}

