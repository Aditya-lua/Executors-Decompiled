/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b0b38
 */

ulong SSL_CIPHER_get_id(SSL_CIPHER *c)

{
  return (ulong)(uint)c->algorithm_mkey;
}

