/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b36cc
 */

void SSL_certs_clear(long param_1)

{
  ssl_cert_clear_certs(*(undefined8 *)(param_1 + 0x898));
  return;
}

