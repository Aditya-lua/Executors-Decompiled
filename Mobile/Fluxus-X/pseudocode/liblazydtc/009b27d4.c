/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b27d4
 */

void SSL_get0_peername(long param_1)

{
  X509_VERIFY_PARAM_get0_peername(*(undefined8 *)(param_1 + 0x4d8));
  return;
}

