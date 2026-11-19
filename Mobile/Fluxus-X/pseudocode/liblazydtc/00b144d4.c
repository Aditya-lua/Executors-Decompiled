/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b144d4
 */

void X509_VERIFY_PARAM_get0_host(long param_1)

{
  OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x38));
  return;
}

