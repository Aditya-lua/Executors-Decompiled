/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f578
 */

undefined4 EVP_CIPHER_CTX_get_nid(undefined8 *param_1)

{
  return *(undefined4 *)*param_1;
}

