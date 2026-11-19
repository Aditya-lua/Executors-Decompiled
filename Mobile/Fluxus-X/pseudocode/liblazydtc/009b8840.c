/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8840
 */

undefined4 SSL_client_hello_get0_legacy_version(long param_1)

{
  if (*(long *)(param_1 + 0xb58) == 0) {
    return 0;
  }
  return *(undefined4 *)(*(long *)(param_1 + 0xb58) + 4);
}

