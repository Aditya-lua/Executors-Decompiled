/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b6840
 */

void SSL_set_cert_cb(long param_1)

{
  ssl_cert_set_cert_cb(*(undefined8 *)(param_1 + 0x898));
  return;
}

