/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7914
 */

void SSL_CTX_load_verify_dir(long param_1)

{
  X509_STORE_load_path(*(undefined8 *)(param_1 + 0x28));
  return;
}

