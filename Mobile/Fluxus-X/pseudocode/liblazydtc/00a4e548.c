/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4e548
 */

void ossl_core_bio_read_ex(long param_1)

{
  BIO_read_ex(*(undefined8 *)(param_1 + 0x10));
  return;
}

