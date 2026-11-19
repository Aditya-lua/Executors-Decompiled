/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b07da0
 */

void X509at_get_attr_count(void)

{
  OPENSSL_sk_num();
  return;
}

