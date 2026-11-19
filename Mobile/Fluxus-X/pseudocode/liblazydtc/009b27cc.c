/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b27cc
 */

void SSL_set_hostflags(long param_1)

{
  X509_VERIFY_PARAM_set_hostflags(*(undefined8 *)(param_1 + 0x4d8));
  return;
}

