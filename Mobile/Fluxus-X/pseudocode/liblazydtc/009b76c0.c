/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b76c0
 */

undefined4 SSL_client_version(long param_1)

{
  return *(undefined4 *)(param_1 + 0xa0c);
}

